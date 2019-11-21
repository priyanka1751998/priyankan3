//Assignment 3
package com.priyankan.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileHandle {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Java\\FileOperation\\File1.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("This data will written into file");
		fw.append("This data will appended to existing data in file"); 
		fw.flush();
		fw.close();
		File f2= new File("D:\\Java\\FileOperation\\File2.txt");
		boolean f1 = f2.createNewFile();
		if(f1) {
			System.out.println("Created="+f1);
				}
		else {
			System.out.println("File already exsist in the specified location");
			}
		System.out.println("Is Readable="+f2.canRead());
		System.out.println("Is Writeable="+f2.canWrite());
		System.out.println("Is Executableable="+f2.canExecute());
		System.out.println("exists="+f2.exists());
		System.out.println("Name of the file="+f2.getName());
		System.out.println("Path of the file="+f2.getAbsolutePath());
		System.out.println("File Deleted="+f2.delete());
	}
}