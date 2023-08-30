package Searchingsorting;

import java.util.Scanner;

public class Electronicsystem {
	static Scanner sc=new Scanner(System.in);
	static Item[]I;
	 static boolean condition=true;
	public Electronicsystem() {
		 I=new Item[5];
		Item i1=new Item("TV",700000.00,20);
		Item i2=new Item("phone",500000.00,15);
		Item i3=new Item("Microwave",200000.00,7);
		Item i4=new Item("Iron",100000.00,10);
		Item i5=new Item("Oven",300000.00,8);
		I[0]=i1;
		I[1]=i2;
		I[2]=i3;
		I[3]=i4;
		I[4]=i5;
	}
public void welcomepage() {
	do {
	System.out.println("Welcome Electronic System");
	System.out.println("1. view sell item lists");
	System.out.println("2. Search item by item name:");
	System.out.println("Choose option");
	int option =sc.nextInt();
	switch (option) {
	case 1:ViewSellItem();break;
	case 2:SearchItem();break;
	default:{
		System.out.println("Wrong input");
	   welcomepage();
	}}
	repeat();}
	while(condition);}
public void ViewSellItem() {
	System.out.println("Item Name   price   Quantity");
	
	for(Item i: I) {
		System.out.println(i.getItemname()+" "+i.getPrice()+""+i.getQty());
	}
	sc.nextLine();
	
}
public void SearchItem() {
	sc.nextLine();

	System.out.println("Enter search key itemname :");
	String SIname=sc.nextLine();
	
	int i;
	for ( i=0;i<I.length;i++) {
		if(SIname.equalsIgnoreCase(I[i].getItemname())) {
			System.out.println(I[i].getItemname()+" "+I[i].getPrice()+" "+I[i].getQty());
			break;
		
		
		}
	}
	
	if(i==I.length) {
		System.out.println(SIname+"is not found");
		
		
	}
}
public void repeat() {
	System.out.print("Do another yes/no? : ");
	
	 String repeat =sc.nextLine();
	    if(repeat.equalsIgnoreCase("y")||repeat.equalsIgnoreCase("yes")||repeat.equalsIgnoreCase("Yes")) {
	      condition=true;
	
}
	    else {
	    	condition=false;
}}
}
