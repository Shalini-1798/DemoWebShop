package demowebshop_app.utilitypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readproperties {
	FileInputStream fis;
	public String fetchproperties(String key) {
		try {
			 fis=new FileInputStream("./src/test/resources/credentials.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		String data=prop.getProperty(key);
		return data;
		
		
	}

}
