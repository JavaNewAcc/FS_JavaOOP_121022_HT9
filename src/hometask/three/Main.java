package hometask.three;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("TestFile.txt");
		FileReader fr = new FileReader();
		try {
			fr.filePrinter(fr.textAnalyzer(fr.textGetter(file)), "Results.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}