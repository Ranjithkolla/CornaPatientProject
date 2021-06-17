package com.nit.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.nit.hospital.bo.PatientBO;
public class PatientDAOImpl implements IPatientDAO 
{
	private  static final String  REALTIMEDI_PATIENT_INSERT_QUERY="INSERT INTO CORONA_PATIENT_REGISTRATION(PATIENT_NAME,PATIENT_ADDRESS,MOBILE_NUMBER,NO_OF_DAYS,BILL_PER_DAY,TOTAL_BILL_AMOUNT,DISCOUNT,NETBILL_AMOUNT) VALUES(?,?,?,?,?,?,?,?)";
	private DataSource ds;

	 // alt+shift+s ,o
	public PatientDAOImpl(DataSource ds) {
		System.out.println("PatientDAOImpl:: 1 -param constructor");
		this.ds = ds;
	}


	public int insert(PatientBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try {
			//get pooled jdbc con object
			con=ds.getConnection();
			//create PreparedStaement object having pre-compiled SQL query
			ps=con.prepareStatement(REALTIMEDI_PATIENT_INSERT_QUERY);
			//set query param values
			ps.setString(1, bo.getPatientName());
			ps.setString(2, bo.getPatientAddress());
			ps.setString(3,bo.getMobileNumber());
			ps.setFloat(4,bo.getNoOfDays());
			ps.setFloat(5,bo.getBillPerDay());
			ps.setFloat(6, bo.getTotalBillAmount());
			ps.setFloat(7,bo.getDiscount());
			ps.setFloat(8, bo.getNetBillAmount());
			//execute the Query
			count=ps.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;  // Exception rethrowing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;  //  Exception rethrowing
		}
		finally {
			//close jdbc objs
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;
			}
		}//finally
	
		return count;
	}

}
