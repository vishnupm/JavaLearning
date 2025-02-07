package ReadAndWritePropertiesFile.ReadAndWrite;

import java.io.*;
import java.util.Properties;

public class WriteData {
    public static void main(String[] args) throws IOException {
//        Step1 : Create an object of FileWriter class
        FileWriter f = new FileWriter(System.getProperty("user.dir")+"\\src\\main\\java\\ReadFromProperties\\properties\\TestDataNew.properties");
//        Step2 : Create an object of Properties class
        Properties p = new Properties();

//        Step3 : Use set property method to set the values
        p.setProperty("url","www.abc.com");
        p.store(f,"sample comment");

//  >>>>>>>>>>> OR <<<<<<<<<<<<<<<<<<<
        FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\java\\ReadFromProperties\\properties\\TestDataNew.properties",true);
        Properties pr = new Properties();
        pr.setProperty("url1","www.def.com");
        pr.store(fo,"sample comment");
    }
}
