package com.test.file;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Rajkiran
 *
 */
public class FileGenerator {
	
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static int count = 100;
	
	Scanner sc=new Scanner(System.in);
    int lineumbers =sc.nextInt();
    
	public void genereteFile() {
	try {
		  FileWriter fw = new FileWriter("myOutFile.txt");
		  for(int i=1; i<=lineumbers; i++) {
		  fw.write(randomAlphaNumeric(count)+"\n");
		  }
		  fw.close();
		} catch (FileNotFoundException e) {
		  // File not found
		  e.printStackTrace();
		} catch (IOException e) {
		  // Error when writing to the file
		  e.printStackTrace();
		}
	}
	
/**
 * @param count
 * @return
 */
	private static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}	
	
	
	public static void main(String[] args) {
		
		FileGenerator generate = new FileGenerator();
		generate.genereteFile();
	}

}
