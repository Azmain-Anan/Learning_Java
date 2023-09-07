package ReadData;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDaataDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Asus\\eclipse-workspace\\LearningJava\\src\\Properties\\TestData.properties");

		Properties pro = new Properties();
		
		pro.load(fr);
		
		System.out.println(pro.getProperty("name"));
	}

}
