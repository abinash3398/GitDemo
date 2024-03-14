package qspiders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File obj = new File("abc.txt");
		if (obj.createNewFile()) {
			System.out.println("file created" + obj.getName());
		} else {
			System.out.println("file already exists.");
		}
		FileWriter fw = new FileWriter("abc.txt");
		fw.write("hello world ");
		fw.write("m back");
		fw.close();
		System.out.println("file written");
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
//	obj.delete();
	}
}
