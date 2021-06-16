package com.nit.hospital.dao;

import com.nit.hospital.bo.PatientBO;

public interface IPatientDAO 
{
	public int insert(PatientBO bo) throws Exception;

}
