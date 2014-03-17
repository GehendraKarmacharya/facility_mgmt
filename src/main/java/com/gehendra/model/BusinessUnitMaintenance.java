package com.gehendra.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BusinessUnitMaintenance {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int MAINTENANCE_ID;
	@Column
	private int BUSINESS_UNIT_ID;
	@Column
	private int USER_ID;
	@Column
	private Date START_DATE;
	@Column
	private Date END_DATE;
	@Column
	private int STATUS;
	@Column
	private String NOTE;
	@Column
	private float COST;
	
	public BusinessUnitMaintenance() {}
	
	public BusinessUnitMaintenance(int MAINTENANCE_ID, int BUSINESS_UNIT_ID,int USER_ID,
			Date START_DATE, Date END_DATE, int STATUS, float COST, String NOTE) {
		super();
		this.MAINTENANCE_ID = MAINTENANCE_ID;
		this.BUSINESS_UNIT_ID = BUSINESS_UNIT_ID;
		this.USER_ID = USER_ID;
		this.START_DATE = START_DATE;
		this.END_DATE = END_DATE;
		this.STATUS = STATUS;
		this.COST = COST;
		this.NOTE = NOTE;
	}
	public int getMAINTENANCE_ID() {
		return MAINTENANCE_ID;
	}
	public void setMAINTENANCE_ID(int MAINTENANCE_ID) {
		this.MAINTENANCE_ID = MAINTENANCE_ID;
	}
	
	public int getBUSINESS_UNIT_ID() {
		return BUSINESS_UNIT_ID;
	}

	public void setBUSINESS_UNIT_ID(int BUSINESS_UNIT_ID) {
		this.BUSINESS_UNIT_ID = BUSINESS_UNIT_ID;
	}

	public int getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(int USER_ID) {
		this.USER_ID = USER_ID;
	}
	public Date getSTART_DATE() {
		return START_DATE;
	}
	public void setSTART_DATE(Date START_DATE) {
		this.START_DATE = START_DATE;
	}
	public Date getEND_DATE() {
		return END_DATE;
	}
	public void setEND_DATE(Date END_DATE) {
		this.END_DATE = END_DATE;
	}
	public int getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(int STATUS) {
		this.STATUS = STATUS;
	}
	public float getCOST() {
		return COST;
	}
	public void setCOST(float COST) {
		this.COST = COST;
	}
	public String getNOTE() {
		return NOTE;
	}
	public void setNOTE(String NOTE) {
		this.NOTE = NOTE;
	}
	
}
