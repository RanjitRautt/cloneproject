package com.cjc.bank.client;

import java.util.Scanner;

import com.cjc.bank.services.Operation;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Operation o=new Operation();
		while(true)
		{
		System.out.println("[1]Create Account\n[2]View Detail\n[3]View Balance\n[4]Deposite Money\n[5]Withdraw Money\n[6]Exit");
		System.out.println("Please Enter your choice");
		int no=sc.nextInt();
			switch(no)
			{
			case 1:
				o.createAccount();
				break;
			case 2:
				o.viewDetail();
				break;
			case 3:
				o.viewBalance();
				break;
			case 4:
				o.depositeMoney();
				break;
			case 5:
				o.withdrawMoney();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("You have entered wrong choice");
				break;
			}
		}
		
	}
}
