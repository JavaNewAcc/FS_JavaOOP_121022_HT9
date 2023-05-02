package hometask.three;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Writer;
import java.io.FileWriter;

public class FileReader {

	private String fileName;

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

	public List<Pair<Character, Integer>> textAnalyzer(String string) {
		char[] charArr = string.toLowerCase().toCharArray();
		boolean repeat = false;
		List<Pair<Character, Integer>> arrList = new ArrayList<>();
		for (char currentLetter : charArr) {
			if (currentLetter >= 'a' && currentLetter <= 'z') {
				if (arrList.size() == 0) {
					arrList.add(new Pair<Character, Integer>(currentLetter, 1));
				} else {
					for (Pair<Character, Integer> element : arrList) {
						if (element.getLetter() == currentLetter) {
							element.setCounter(element.getCounter() + 1);
							repeat = true;
							break;
						}
					}
					if (!repeat) {
						arrList.add(new Pair<Character, Integer>(currentLetter, 1));
					}
					repeat = false;
				}
			} else {
				continue;
			}
		}
		Collections.sort((List<Pair<Character, Integer>>) arrList, new CounterComparator());
		return arrList;
	}

	public void filePrinter(List<Pair<Character, Integer>> arrList, String fileName) {
		File file = new File(fileName);
		try (Writer writer = new FileWriter(file, true)) {
			for (Pair<Character, Integer> element : arrList) {
				writer.write(element.getLetter() + ": " + element.getCounter() + System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}