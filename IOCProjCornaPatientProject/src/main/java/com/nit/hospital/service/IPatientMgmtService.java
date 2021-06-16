package com.nit.hospital.service;


import com.nit.hospital.dto.PatientDTO;

public interface IPatientMgmtService
{
public String  calculatePatientBill(PatientDTO dto) throws Exception;
}
