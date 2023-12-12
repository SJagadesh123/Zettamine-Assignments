package com.zettamine.task.day5.assignment1;

import java.io.File;
import java.io.IOException;

public class CreateDirectory {

	public static void main(String[] args) throws IOException {

		File file = new File("C:/CJava/java");
		file.mkdir();
		file = new File("C:/CJava/java/java.txt");
		file.createNewFile();
	}

}
