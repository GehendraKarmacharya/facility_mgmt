package com.gehendra.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BusinessUnitUse {
		@Id
		@Column
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int MAINTENANCE_ID;
		@Column
		private int BUSINESS_UNIT_ID;
		@Column
		private int USER_ID;
		@Column
		private Date LEASE_START_DATE;
		@Column
		private Date LEASE_END_DATE;
		@Column
		private int RENT;
		@Column
		private String SECURITY_DEPOSIT;
		@Column
		private float UTILIITES;
		@Column
		private int IS_RENEW;
		
		public BusinessUnitUse() {}
		
		public BusinessUnitUse(int MAINTENANCE_ID, int BUSINESS_UNIT_ID,
				int USER_ID, Date LEASE_START_DATE, Date LEASE_END_DATE,
				int RENT, String SECURITY_DEPOSIT, float UTILIITES, int IS_RENEW) {
			super();
			this.MAINTENANCE_ID = MAINTENANCE_ID;
			this.BUSINESS_UNIT_ID = BUSINESS_UNIT_ID;
			this.USER_ID = USER_ID;
			this.LEASE_START_DATE = LEASE_START_DATE;
			this.LEASE_END_DATE = LEASE_END_DATE;
			this.RENT = RENT;
			this.SECURITY_DEPOSIT = SECURITY_DEPOSIT;
			this.UTILIITES = UTILIITES;
			this.IS_RENEW = IS_RENEW;
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

		public Date getLEASE_START_DATE() {
			return LEASE_START_DATE;
		}

		public void setLEASE_START_DATE(Date LEASE_START_DATE) {
			this.LEASE_START_DATE = LEASE_START_DATE;
		}

		public Date getLEASE_END_DATE() {
			return LEASE_END_DATE;
		}

		public void setLEASE_END_DATE(Date LEASE_END_DATE) {
			this.LEASE_END_DATE = LEASE_END_DATE;
		}

		public int getRENT() {
			return RENT;
		}

		public void setRENT(int RENT) {
			this.RENT = RENT;
		}

		public String getSECURITY_DEPOSIT() {
			return SECURITY_DEPOSIT;
		}

		public void setSECURITY_DEPOSIT(String SECURITY_DEPOSIT) {
			this.SECURITY_DEPOSIT = SECURITY_DEPOSIT;
		}

		public float getUTILIITES() {
			return UTILIITES;
		}

		public void setUTILIITES(float UTILIITES) {
			this.UTILIITES = UTILIITES;
		}

		public int getIS_RENEW() {
			return IS_RENEW;
		}

		public void setIS_RENEW(int IS_RENEW) {
			this.IS_RENEW = IS_RENEW;
		}
		
}
