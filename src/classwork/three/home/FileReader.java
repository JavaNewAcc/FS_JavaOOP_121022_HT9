package classwork.three.home;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FileReader {

	private String fileName;

	private Pair<String, Integer> pair1 = new Pair<>();

	public FileReader() {
		super();
	}

	public FileReader(String fileName) {
		super();
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String textGetter(File file) throws IOException {
		String result = "";
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
			while (true) {
				String currentLine = br.readLine();
				if (currentLine == null) {
					break;
				}
				result += currentLine;
			}
		} catch (IOException e) {
			throw e;
		}
		return result;
	}

	public SortedSet<Pair<Character, Integer>> textAnalyzer(String string) {
		char[] charArr = string.toCharArray();
		SortedSet<Pair<Character, Integer>> sortedSet = new TreeSet<>(new CounterComparator());
		for (char currentLetter : charArr) {
			if (sortedSet.size() == 0) {
				sortedSet.add(new Pair<Character, Integer>(currentLetter, 1));
			} else {
				for (Pair<Character, Integer> element : sortedSet) {
					if ((char) element.getLetter() == currentLetter) {
						element.setCounter((int) element.getCounter() + 1);
						break;
					} else {
						sortedSet.add(new Pair<Character, Integer>(currentLetter, 1));
						break;
					}
				}
			}
		}
		return sortedSet;
	}
}