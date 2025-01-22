package org.login;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ReadData {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\LENOVO\\newEclipseWorkspe\\Nov24API\\src\\test\\resources\\HDFCDatabase.txt");
		List<String> readLines = FileUtils.readLines(f);
		for(int i=0; i<readLines.size(); i++) {
			String string = readLines.get(i);
			String[] split = string.split(",");
			for(int j=0; j<split.length; j++) {
				System.out.println(split[j]);
			}
		}
	
	}

}
