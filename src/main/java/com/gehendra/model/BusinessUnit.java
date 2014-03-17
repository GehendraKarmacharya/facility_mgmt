package com.gehendra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BusinessUnit {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	@Column
	private String NAME;
	@Column
	private String DESCRIPTION;
	@Column
	private String LOCATION;
	@Column
	private String ADDITIONAL_FEATURES;
	@Column
	private int STATUS;
	@Column
	private int IS_AVAILABLE;
	
	public BusinessUnit(){}
	public BusinessUnit(int ID, String NAME, String DESCRIPTION, String LOCATION, String ADDITIONAL_FEATURES, int STATUS, int IS_AVAILABLE) {
		super();
		this.ID = ID;
		this.NAME = NAME;
		this.DESCRIPTION = DESCRIPTION;
		this.LOCATION = LOCATION;
		this.ADDITIONAL_FEATURES = ADDITIONAL_FEATURES;
		this.STATUS = STATUS;
		this.IS_AVAILABLE = IS_AVAILABLE;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String DESCRIPTION) {
		this.DESCRIPTION = DESCRIPTION;
	}
	public String getLOCATION() {
		return LOCATION;
	}
	public void setLOCATION(String LOCATION) {
		this.LOCATION = LOCATION;
	}
	public String getADDITIONAL_FEATURES() {
		return ADDITIONAL_FEATURES;
	}
	public void setADDITIONAL_FEATURES(String ADDITIONAL_FEATURES) {
		this.ADDITIONAL_FEATURES = ADDITIONAL_FEATURES;
	}
	public int getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(int STATUS) {
		this.STATUS = STATUS;
	}
	public int getIS_AVAILABLE() {
		return IS_AVAILABLE;
	}
	public void setIS_AVAILABLE(int IS_AVAILABLE) {
		this.IS_AVAILABLE = IS_AVAILABLE;
	}
}

