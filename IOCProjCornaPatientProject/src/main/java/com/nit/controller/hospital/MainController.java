package com.nit.controller.hospital;


import com.nit.hospital.dto.PatientDTO;
import com.nit.hospital.service.IPatientMgmtService;
import com.nit.hospital.vo.PatientVO;

public class MainController 
{
	private IPatientMgmtService service;
	public MainController(IPatientMgmtService service) {
		System.out.println("MainController: 1-param constructor");
		  this.service=service;
	}
	
	public  String  processPatient(PatientVO vo)throws Exception {
		//convert  VO class obj data to DTO class object data
		PatientDTO dto=new PatientDTO();
		dto.setPatientName(vo.getPatientName());
		dto.setPatientAddress(vo.getPatientAddress());
		dto.setMobileNumber(vo.getMobileNumber());;
		dto.setNoOfDays(Float.parseFloat(vo.getNoOfDays()));
		dto.setBillPerDay(Float.parseFloat(vo.getBillPerDay()));
		//use service
		String result=service.calculatePatientBill(dto);
		return result;
	}
	
}
