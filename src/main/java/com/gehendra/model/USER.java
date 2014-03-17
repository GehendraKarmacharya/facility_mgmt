package com.gehendra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class USER {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	@Column
	private String FIRST_NAME;
	@Column
	private String LAST_NAME;
	@Column
	private String EMAIL;
	@Column
	private String TELEPHONE;
	@Column
	private String ADDRESS;
	@Column
	private int TYPE; /*DEFAULT '1' COMMENT '1-> Tenant; 0->Employee */
	@Column
	private String SCHEDULE;
	@Column
	private float HOURLY_RATE;
	
	public USER() {}
	
	public USER(int ID, String FIRST_NAME, String LAST_NAME, String EMAIL,
			String TELEPHONE, String ADDRESS, int TYPE, String SCHEDULE,
			float HOURLY_RATE) {
		super();
		this.ID = ID;
		this.FIRST_NAME = FIRST_NAME;
		this.LAST_NAME = LAST_NAME;
		this.EMAIL = EMAIL;
		this.TELEPHONE = TELEPHONE;
		this.ADDRESS = ADDRESS;
		this.TYPE = TYPE;
		this.SCHEDULE = SCHEDULE;
		this.HOURLY_RATE = HOURLY_RATE;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public void setFIRST_NAME(String FIRST_NAME) {
		this.FIRST_NAME = FIRST_NAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public void setLAST_NAME(String LAST_NAME) {
		this.LAST_NAME = LAST_NAME;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}

	public String getTELEPHONE() {
		return TELEPHONE;
	}

	public void setTELEPHONE(String TELEPHONE) {
		this.TELEPHONE = TELEPHONE;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String ADDRESS) {
		this.ADDRESS = ADDRESS;
	}

	public int getTYPE() {
		return TYPE;
	}

	public void setTYPE(int TYPE) {
		this.TYPE = TYPE;
	}

	public String getSCHEDULE() {
		return SCHEDULE;
	}

	public void setSCHEDULE(String SCHEDULE) {
		this.SCHEDULE = SCHEDULE;
	}

	public float getHOURLY_RATE() {
		return HOURLY_RATE;
	}

	public void setHOURLY_RATE(float HOURLY_RATE) {
		this.HOURLY_RATE = HOURLY_RATE;
	}
}
