package ReadData;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteData {

	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("C:\\Users\\Asus\\eclipse-workspace\\LearningJava\\src\\Properties\\TestData1.csv");

		BufferedWriter br = new BufferedWriter(fr);
		
		br.write("Anan" + ",");
		
		br.close();
		
	}

}
