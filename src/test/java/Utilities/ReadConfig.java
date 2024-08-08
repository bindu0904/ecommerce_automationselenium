package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    public static Properties pro;
    
	public ReadConfig() throws IOException
	{
		
	File file=new File("./configuration/config.properties");
	FileInputStream fi=new FileInputStream(file);
	
	pro=new Properties();
	pro.load(fi);
	
	}
	
	public String geturl()
	{
		String url=pro.getProperty("url");
		return url;
	}
	public String getfirstname()
	{
		String firstname=pro.getProperty("firstname");
		return firstname;
	}
    public String getemail()
    {
    	String email=pro.getProperty("email");
    	return email;
    }
}
