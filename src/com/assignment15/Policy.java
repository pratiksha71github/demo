package com.assignment15;
import java.util.Scanner;
public class Policy {
	/*1.1 Design the Policy class that contain policy id, policy name, policy type, premium amount etc. 
	1.2 Design the below method into Policy class and which return the policy object
	public Policy getPolicyDetails() 
	1.3 Input should be taken from user and print that data into getPolicyDetails () method.*/

private static final String String = null;
private int id;
private String policyName;
private String policyType;
private int premiumAmount;
private String policy;

public int getId() { 
return id;
}

public void setId(int id) {
	this.id = id;
}


public String getpolicyName() {
	return policyName;
}

public void setpolicyName(String name) {
    this.policyName = policyName;
}

public String getpolicyType() {
	return policyType;
}

public void setpolicyType(String Type) {
	this.policyType = policyType;
}

public int getpremiumAmount() {
	return premiumAmount;
}

public void setpremiumAmount(int premiumAmount) {
	this.premiumAmount = premiumAmount;
}
public String getPolicyDetails() {
	System.out.println("Enter policy id");
	Scanner s=new Scanner(System.in);
	int policyId= s.nextInt();
	System.out.println("Enter policy name");
	String policyName= s.next();
	System.out.println("Enter policy type");
	String policyType= s.next();
	System.out.println("Enter premium amount");
	int premiumAmount= s.nextInt();
	
	String toString() {
	return "Policy(id=" +id + ", policyName=" +policyName + ", policyType=" +policyType + ", premiumAmount=" +premiumAmount +")";
	
	Policy p=new Policy();
	p.setId(id);
	p.setpolicyName(policyName);
	p.setpolicyType(policyType);
	p.setpremiumAmount(premiumAmount);
	return policy;
	
	 public static void main(String[] args) {
		Policy policy=new Policy();
		policy.getPolicyDetails();
		System.out.println("policy details is" +policy);
	}
}
}
}