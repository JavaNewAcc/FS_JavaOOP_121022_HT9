package classwork.three.home;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("TestFile.txt");
		FileReader fr = new FileReader();
		try {
			System.out.println(fr.textAnalyzer(fr.textGetter(file)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}