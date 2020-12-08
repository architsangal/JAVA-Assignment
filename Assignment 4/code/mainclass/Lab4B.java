package mainclass;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import derived.*;
import base.*;

public class Lab4B 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// create instance of Reception, Billing, Dispatch, BioChemLab, PathLab
		reception = new Reception();
		billing = new Billing();
		dispatch = new Dispatch();
		bcLab = new BioChemLab();
		pLab = new PathLab();		

		// read in the input for test requests, and send to Reception (addRequest)
		int i = Integer.parseInt(br.readLine());
		for(int j=0 ; j<i ; j++)
		{
			reception.addRequest(br.readLine(),null);
		}

		System.out.println("Total billed: " + billing.getTotalSum());
		System.out.println("Reports:");
		for(String str : dispatch.getAllResults())
		{
			System.out.println(str);
		}
		System.out.println("Total tests:");
		System.out.println("BioChem: " + dispatch.getCountBC());
		System.out.println("Path: " + dispatch.getCountP());
		
		// get all bills from Billing and print out the total for the day
		
		
		// get all reports from Dispatch and print out one line at a time
		// Each line will have: Patient ID, Test ID, result string
		
		
		// get list of tests from each lab, and print out total tests per lab
		
	}

	public static BioChemLab getBcLab()
	{
		return bcLab;
	}
	public static Billing getBilling()
	{
		return billing;
	}
	public static Dispatch getDispatch()
	{
		return dispatch;
	}
	public static Reception getReception()
	{
		return reception;
	}
	public static PathLab getpLab()
	{
		return pLab;
	}
	
	private static Reception reception;
	private static Billing billing;
	private static BioChemLab bcLab;
	private static PathLab pLab;
	private static Dispatch dispatch;

}
