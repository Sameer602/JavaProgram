package com.jtc.beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDataTextFile {
	
	public static void main(String[] args) throws IOException {
		
		//Approach-1:Using FileReader&BufferReader
		FileReader fr = new FileReader("D:\\CoreJava\\Test.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while((str = br.readLine()) !=null) {
			System.out.println(str);
		}
		br.close();
		
		
	}
	
}
