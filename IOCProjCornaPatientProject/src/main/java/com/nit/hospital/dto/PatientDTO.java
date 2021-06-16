package com.nit.hospital.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable
{
private String patientName;
private String patientAddress;
private String mobileNumber;
private Float noOfDays;
private Float billPerDay;
//private String discount;
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

/*
 * public String getDiscount() { return discount; } public void
 * setDiscount(String discount) { this.discount = discount; }
 */
/*
 * public Float getNetBillAmount() { return netBillAmount; } public void
 * setNetBillAmount(Float netBillAmount) { this.netBillAmount = netBillAmount; }
 */
//private Float netBillAmount;
public String toString() {
	return "PatientDTO [patientName=" + patientName + ", patientAddress=" + patientAddress + ", mobileNumber=" + mobileNumber + ", noOfDays="
			+ noOfDays + ", billPerDay=" + billPerDay + " ]";
} 
}
