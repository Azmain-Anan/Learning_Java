package ReadData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextandCsv {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(
				"C:\\Users\\Asus\\eclipse-workspace\\LearningJava\\src\\Properties\\TestDataTXT.txt");

		BufferedReader br = new BufferedReader(fr);

		System.out.println(br.readLine());

		System.out.println("Successfully printed");
		br.close();

	}

}
