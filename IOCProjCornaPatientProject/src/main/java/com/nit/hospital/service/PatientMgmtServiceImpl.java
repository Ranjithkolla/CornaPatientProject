package com.nit.hospital.service;

import com.nit.hospital.bo.PatientBO;
import com.nit.hospital.dao.IPatientDAO;
import com.nit.hospital.dto.PatientDTO;

public class PatientMgmtServiceImpl implements IPatientMgmtService
{
private IPatientDAO dao;
public PatientMgmtServiceImpl(IPatientDAO dao)
{
	 System.out.println("PatientMgmtServiceImpl.1-param constructor");
	 this.dao=dao;
}

public String calculatePatientBill(PatientDTO dto) throws Exception {
	// TODO Auto-generated method stub
	
	Float discount=0.0f;
	float TotalBillAMount=(dto.getBillPerDay()*dto.getNoOfDays());
	if(TotalBillAMount >= 100000 && TotalBillAMount < 200000 )
		 discount=10/100.0f*TotalBillAMount;
	else
		discount=20/100.0f*TotalBillAMount;
	Float netBillAmount=TotalBillAMount-discount;
	PatientBO bo=new PatientBO();
	bo.setPatientName(dto.getPatientName());
	bo.setPatientAddress(dto.getPatientAddress());
	bo.setMobileNumber(dto.getMobileNumber());
	bo.setNoOfDays(dto.getNoOfDays());
	bo.setBillPerDay(dto.getBillPerDay());
	bo.setTotalBillAmount(TotalBillAMount);
	bo.setDiscount(discount);
	bo.setNetBillAmount(netBillAmount);
	int count=dao.insert(bo);
	return count==1?"Patient admitted sucessfully---> Total amount::"+TotalBillAMount+"Discount is::"+discount+"NetBillAmount is:"+ netBillAmount:"";
}


}
