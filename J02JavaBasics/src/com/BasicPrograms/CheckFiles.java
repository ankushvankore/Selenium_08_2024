package com.BasicPrograms;

import java.io.File;

public class CheckFiles {

	public static void main(String[] args) {
		File files = new File("C:\\Users\\Dell\\Downloads");
		File[] allFiles = files.listFiles();
		boolean fileDownloaded = false;
		String expFile = "AnyDesk";
		
		
		for(int i = 0; i < allFiles.length; i++)
		{
			System.out.println(allFiles[i].getName());
			
			if(allFiles[i].getName().contains(expFile))
			{
				fileDownloaded = true;
				break;
			}
		}
		
		if(fileDownloaded)
		{
			System.out.println("File is downloaded");
		}
		else
		{
			System.out.println("File is NOT downloaded");
		}

	}

}
