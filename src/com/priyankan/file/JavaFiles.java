//Assignment 1 & 2
package com.priyankan.file;

import java.io.File;

public class JavaFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d1;
		try {
		File f= new File("D:\\Java\\FileOperation\\File1.txt");
		boolean f1= f.createNewFile();
		if(f1) {
			System.out.println("Created="+f1);
		}
		else {
			System.out.println("File already exsists");
		}
		
		d1 = f.getParent();
		System.out.println("Directory Path="+d1);
		File d2= new File(d1);
		File[] contentsOfDirectory=d2.listFiles();
		for(File object:contentsOfDirectory) {
			
			//file format contents
			if(object.isFile()) {
				System.out.format("File Name=%s%n", object.getName());
			}
			//directory format contents
			else if(object.isDirectory()) {
				System.out.format("Directory Name=%s%n", object.getName());
			}
		}
		}
		catch(Exception e) {
			System.out.println("Exception occurred");
		}
		}
}

