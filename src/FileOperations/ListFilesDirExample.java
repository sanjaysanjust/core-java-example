package FileOperations;

import java.io.File;

public class ListFilesDirExample {
public static void main(String[] args) {
	
	String currentDirectory = System.getProperty("user.dir");
    System.out.println("The current working directory is " + currentDirectory);
    
	String  DirName= "/Users/sanjaykumarst/Desktop/";
	File f = new File(DirName);
	String[] l = f.list();
	
	for(String name: l) {
		//System.out.println(name);
		File f_name = new File(f, name);
		if (f_name.isFile()) {
			System.out.println(f_name + "is a file");
		}else {
			System.out.println(f_name + "is a Directory");
		}
	}
}
}
