package FileOperations;

import java.io.File;
import java.io.IOException;

public class NewFile {

	public static void main(String[] args) throws IOException {
	File f = new File("abc.txt"); // This line of statement wont create a physical file, It just creates a file object. If a file object already present it will point to the same object otherwiase creats new object.
	System.out.println("File exist ==>"+ f.exists());
	f.createNewFile();// Physical file gets created here And returns True Otherwise False
	System.out.println("File exist ==>"+ f.exists());
	
	System.out.println("File created ==>"+ f.createNewFile());
	
	// Java file i/o concept implemented based on unix operating system. Thats why in java file system we have folders strcture also considered as file only.
	
	// TO CREATE DIRECTORY.
	
	File f_dir =new File("dir1");// This line of statement wont create a physical file, It just creates a file object. If a file object already present it will point to the same object otherwiase creats new object.
	
	System.out.println("Dir exist ==>"+ f_dir.exists());
	f_dir.mkdir();// Physical Directory gets created here.
	System.out.println("Dir exist ==>"+ f_dir.exists());
	
	System.out.println("Dir Created ==>"+ f_dir.mkdir());
	}

	// Constructors 
	//File f1 = new File(String name); // To cretae file or directory  in the current working directory
	
	//File f1 = new File(String subDirname, String name); // To create file or directory in the specified working directory
	
	//File f1 = new File(File subDirname, String name); // To create file or directory in the specified working directory
	
	
	
}
