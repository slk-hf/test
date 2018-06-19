package com.upoint.jni;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWiterDemo {

	public void addTxtFile(String path) throws IOException {
		File file = new File(path);
		if(!file.exists())
		{
			file.createNewFile();
		}
		FileWriter filewriter = new FileWriter(file,true); 
		//PrintWriter printWriter = new PrintWriter(filewriter);
		//printWriter.print("aaaaaaa"+ "\r\n");
		//printWriter.flush();
		filewriter.write("bbbbbbbb" + "\r\n");
		filewriter.flush();
		filewriter.close();
		//printWriter.close();
	}
	public static void main(String[] args) {
		try {
			new FileWiterDemo().addTxtFile("E:\\work\\demo\\demo.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
