package com.nit.hospital.vo;



public class PatientVO 
{
private String patientName;
private String patientAddress;
private String mobileNumber;
private String noOfDays;
private String billPerDay;

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
public String getNoOfDays() {
	return noOfDays;
}
public void setNoOfDays(String noOfDays) {
	this.noOfDays = noOfDays;
}
public String getBillPerDay() {
	return billPerDay;
}
public void setBillPerDay(String billPerDay) {
	this.billPerDay = billPerDay;
}
@Override 
public String toString(){return "PatientVO [patientName=" + patientName + ", patientAddress=" + patientAddress + ", mobileNumber=" + mobileNumber + ", noOfDays=" + noOfDays + ", billPerDay=" + billPerDay + "]";}



}
