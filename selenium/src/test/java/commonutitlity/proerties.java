package commonutitlity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class proerties {

public static void loadproperies1() {
	FileReader reader=null;
	try {
		 reader=new FileReader("config.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Properties pro= new Properties();
	try {
		pro.load(reader);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
