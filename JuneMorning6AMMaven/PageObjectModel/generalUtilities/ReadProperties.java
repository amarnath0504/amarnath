package generalUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties 
{
	static FileInputStream myFile;
	static Properties myProp;
	static int empName;
	public static String readKey(String key)
	{
		try{
			myFile = new FileInputStream("TestData/TestData.properties");
			myProp = new Properties();
			myProp.load(myFile);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return myProp.getProperty(key);
	}
	
}
