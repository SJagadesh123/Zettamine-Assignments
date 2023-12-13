package com.zettamine.task.day5.assignment2;

import java.io.File;

public class DosRename {

	public static void main(String... args) {


		if(args.length<2)
		{
			System.out.println("Two arguments required to perform rename...");
			return;
		}
		
		File file = new File(args[0]);
		
		if(!file.exists())
		{
			System.out.println("The file doesnt exist.....");
			return;
		}
		
		System.out.println(file.getName());
		File f1 = new File(file.getPath().replace(file.getName(),args[1]));
		System.out.println(f1.getPath());
		file.renameTo(f1);
		System.out.println("Rename was Sucessfull");
		
		
//		String path = file.getAbsolutePath();
//		String[] oldName = path.split("\\\\");
//		String[] newName = new String[oldName.length];
//		for(int i = 0; i < oldName.length; i++)
//		{
//			if(i != oldName.length-1)
//			{
//				newName[i] = oldName[i];
//			}
//			else
//			{
//				newName[i] = args[1];
//			}
//		}
//		
//		String path2 = "";
//		for(int i = 0; i < oldName.length; i++)
//		{
//			if(i != oldName.length-1)
//			{
//				path2 = path2 + newName[i] + "\\\\";
//			}
//			else
//			{
//				path2 = path2 + newName[i];
//			}
//		}
//		File file2 = new File(path2);
//		
//		System.out.println(path);
//		System.out.println(path2);
//		if(file.renameTo(file2))
//		{
//			System.out.println("Rename Sucessfull");
//		}
//		else
//		{
//			System.out.println("Rename not sucessfull");
//		}
		
	}

}
