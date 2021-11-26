package com.cjc.bank.services;

import java.util.Scanner;

import com.cjc.bank.account.Account;

public class Operation 
{
	Scanner sc=new Scanner(System.in);
	Account a=new Account();
	int count =0;
	public void createAccount()
	{
		System.out.println("Enter acc. No.");
		a.setAcno(sc.next());
		
		System.out.println("Enter Name");
		a.setName(sc.next());
		
		System.out.println("Enter Address");
		a.setAddress(sc.next());
		
		String gen,gen1;
		int c=0;
		do
		{
				System.out.println("Enter gender");
				String gender=sc.next();
				gen="male";
				gen1="female";
			if(gender.equalsIgnoreCase(gen)||gender.equalsIgnoreCase(gen1))
				{a.setGender(gender);
				c++;}
			else
				System.out.println("plz enter correct input");
		}
		while(c<=0);
		int age;
		do 
		{	System.out.println("Enter age");
			 age=sc.nextInt();
			if(age>=18)
				a.setAge(age);
			else
				System.out.println("age must be more than 18");
		}
		while(age<18);
		String mbno;
		do
		{
		System.out.println("Enter Mb No.");
		 mbno=sc.next();
	
		if(mbno.length()==10)
			a.setMbno(mbno);
		else
			System.out.println("Enter valid Mb no.");
		}
		while(mbno.length()!=10);
		
		System.out.println("Congratulations "+a.getName()+" your account created succesfully");
		double money;
		do
		{
			System.out.println("plz enter money greater than 500 Rs");
			money=sc.nextDouble();
			if(money>=500)
			{
				a.setBalance(money);
				System.out.println("Your current acc balance="+a.getBalance());
			}
			else
				System.out.println("you entered less amt plz enter >500");	
		}
		while(money<500);
		count ++;
	}
	public void viewDetail()
	{
		if(count>0)
		{
			System.out.println("Acc Holders Name="+a.getName());
			System.out.println("Account No.="+a.getAcno());
			System.out.println("Mobile No.="+a.getMbno());
			System.out.println("Address="+a.getAddress());
		}
		else
		{
			System.out.println("before proceeding first create your Account");
			createAccount();
		}
	}
	public void viewBalance()
	{
		if(count>0)
		{
			System.out.println("Your Current Acc Balance="+a.getBalance());
		}
		else
		{
			System.out.println("before proceeding first create your Account");
			createAccount();
		}
		
	}
	public void depositeMoney()
	{
		if(count>0)
		{
			System.out.println("Enter amount to be deposited");
			double money=sc.nextDouble();
			a.setBalance(a.getBalance()+money);
			System.out.println("Your current acc balance="+a.getBalance());
		}
		else
		{
			System.out.println("before proceeding first create your Account");
			createAccount();
		}
	}
	public void withdrawMoney()
	{
		if(count>0)
		{
			System.out.println("Enter amount to be withdrawl");
			double money=sc.nextDouble();
			if(a.getBalance()-money>=500)
			{
				a.setBalance(a.getBalance()-money);
				System.out.println("Your current acc balance="+a.getBalance());
			}
			else
				System.out.println("Your acc balance is not enough to withdraw");
		}
		else
		{
			System.out.println("before proceeding first create your Account");
			createAccount();
		}
	}
}
