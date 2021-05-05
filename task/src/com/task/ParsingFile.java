package com.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ParsingFile {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\lenovo\\Desktop\\customer.txt");
			Scanner sc = new Scanner(f);

			List<Customer> customers = new ArrayList<Customer>();

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] details = line.split(",");
				int custmid = Integer.parseInt(details[0]);
				String name = details[1];
				long mobileno = Long.parseLong(details[2]);
				String emailid = details[3];
				String dob = details[4];
				String address = details[5];
				long cardnum = Long.parseLong(details[6]);
				int cvv = Integer.parseInt(details[7]);
				String expdate = details[8];
				int balance = Integer.parseInt(details[9]);

				Customer c = new Customer(custmid, name, mobileno, emailid, dob, address, cardnum, cvv, expdate,
						balance);
				customers.add(c);
			}

			Collections.sort(customers);

			
			  for (Customer c : customers) { System.out.println(c.toString()); }
			
			//System.out.println("Highest balance customer details");
			//System.out.println(customers.get(0));
			
			//System.out.println("5th Highest balance customer details"); 
			//System.out.println(customers.get(6));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
