package com.nit.hospital.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.controller.hospital.MainController;
import com.nit.hospital.vo.PatientVO;


public class PatientTesting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Read inputs from enduser as string values
				Scanner sc=new Scanner(System.in);
				System.out.println("enter patient name::");
				String name=sc.next();
				System.out.println("enter patient address::");
				String addrs=sc.next();
				System.out.println("enter patient mobile number::");
				String mobilenumber=sc.next();
				System.out.println("enter admitted no.ofdays::");
				String days=sc.next();
				System.out.println("enter  bill amount per day::");
				String amountperday=sc.next();
				
				//create Patient class obj
				PatientVO vo=new PatientVO();
				vo.setPatientName(name);vo.setPatientAddress(addrs); vo.setMobileNumber(mobilenumber);
				vo.setNoOfDays(days); vo.setBillPerDay(amountperday);
				//create IOC container
				 DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
				 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
				 reader.loadBeanDefinitions("com/nit/hospital/cfgs/applicationContext.xml");
				 //get Controller class obj 
				 MainController controller=factory.getBean("controller",MainController.class);
				 //invoke the methods
				 try {
					 String result=controller.processPatient(vo);
					 System.out.println(result);
				 }
				 catch(Exception e) {
					 //e.printStackTrace();
					 System.out.println("Internal Problem --Try Again:::"+e.getMessage());
				 }
	}

}
