package com.lockme;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LockedMe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------LockedMe.com----------");
		System.out.println("--------------------------------");
   		System.out.println("Developer Details: Monisha");
   		System.out.println("--------------------------------");
   		java.util.Date date=new java.util.Date();
   		System.out.println("Developed on: "+date);
   		System.out.println("--------------------------------");
   		Scanner s=new Scanner(System.in);
   		String path="E:\\LockedMe\\";//specify the path here 
   		int ch=0;
   		
   		do{
			System.out.println("USER INTERFACES AVAILABLE");
			System.out.println("--------------------------------");
			System.out.println("1.List of files in the Directory");
			System.out.println("2.Add a file to the existing directory");
			System.out.println("3.Delete a file from the directory");
			System.out.println("4.Search for a file ");
			System.out.println("5.Exit the app");
			System.out.println("--------------------------------");
			System.out.print("Enter your choice");
			ch=Integer.parseInt(s.nextLine());
			
			switch(ch)
			{
			case 1:
				File folder = new File(path);
				 
		        File[] files = folder.listFiles();//list of files in ascending order
		        for (File file : files)
		        {
		        	System.out.println(file.getName());
		        }
		        System.out.println("--------------------------------");
				break;  
				
			case 2:
				System.out.println("Enter file name to be created "); 
				String filename = s.nextLine(); 
				try {
			    	 File f1 = new File(path+filename);
			    	 
			    	 if (filename.matches("[a-zA-Z0-9] {3,30}") || f1.createNewFile()) {
			    	        System.out.println(" File created in " +f1.getPath() );
			    	      } 
			    	 else {
			    	        System.out.println(" File already exists in "+f1.getPath());
			    	      }
			     }catch(IOException e) {
			         System.out.println("Something went wrong.");
			         e.printStackTrace();
			     }
				System.out.println("--------------------------------");
				break;
				
			case 3:
				System.out.println("Enter file name to be deleted"); 
				String delfile= s.nextLine();
				try { 					  
		            File f = new File(path+delfile); 
		            if (f.delete()) 
		                System.out.println("File deleted in "+f.getPath()); 
		            else
		                System.out.println("File was not deleted in "+f.getPath()); 
		        } 
		        catch (Exception e) { 
		           System.out.println("Check for case sensitivity");
		        }
				 System.out.println("--------------------------------");
				 break;
			case 4:
				System.out.println("Enter file to search: ");//search file 
				String sf=s.nextLine();
				 File searchf=new File(path);
				 String[] s1=searchf.list();
				 int flag=0;
				 for(String j:s1) {
					 
						if(j.equals(sf)){
							flag=1;
						}
					}
				 if(flag==1) {
					 System.out.println(" File found in "+searchf.getPath());
				 }
				 else {
					 System.out.println(" File not found in "+searchf.getPath());
				 }
				 System.out.println("--------------------------------");
				 break;
			case 5:
				System.out.println("Thank you for using this app ");
				break;
			default:
				
					System.out.println("Invalid option.Try other valid options in the list");
					System.out.println("--------------------------------");
					break;	
			}	
			}while(ch!=5);
   		}
}
