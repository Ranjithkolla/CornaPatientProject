package com.nit.hospital.bo;

public class PatientBO
{
	// bean properties
    private String patientName;
    private String patientAddress;
    private String mobileNumber;
    private Float noOfDays;
    private Float billPerDay;
    private Float totalBillAmount;
    private Float discount;
    private Float netBillAmount;
    //setter and getters  (alt+shift+s ,r  ->select all)
	
    //toString (alt+shift+s, s)
	
	

	public String getPatientName() {
		return patientName;
	}

	
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	

	

	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public Float getNoOfDays() {
		return noOfDays;
	}


	public void setNoOfDays(Float noOfDays) {
		this.noOfDays = noOfDays;
	}


	public Float getBillPerDay() {
		return billPerDay;
	}

	public void setBillPerDay(Float billPerDay) {
		this.billPerDay = billPerDay;
	}

	

	public Float getDiscount() {
		return discount;
	}


	public void setDiscount(Float discount) {
		this.discount = discount;
	}


	public Float getNetBillAmount() {
		return netBillAmount;
	}

	public void setNetBillAmount(Float netBillAmount) {
		this.netBillAmount = netBillAmount;
	}
	


	public Float getTotalBillAmount() {
		return totalBillAmount;
	}


	public void setTotalBillAmount(Float totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}


	@Override
	public String toString() {
		return "PatientBO [patientName=" + patientName + ", patientAddress=" + patientAddress + ", mobileNumber="
				+ mobileNumber + ", noOfDays=" + noOfDays + ", billPerDay=" + billPerDay + ", totalBillAmount="
				+ totalBillAmount + ", discount=" + discount + ", netBillAmount=" + netBillAmount + "]";
	}

	
	
}
