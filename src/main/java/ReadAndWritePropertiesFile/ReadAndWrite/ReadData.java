package ReadAndWritePropertiesFile.ReadAndWrite;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadData {
    public static void main(String[] args) throws IOException {
//        Step1 : Create an object of FileReader class
        FileReader f = new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\ReadFromProperties\\properties\\TestData.properties");
//        Step2 : Create an object of Properties class
        Properties p = new Properties();
//        Step3 : Load the file
        p.load(f);
//        Step4 : Use get property method to get the values
        System.out.println(p.getProperty("name"));

//  >>>>>>>>>>> OR <<<<<<<<<<<<<<<<<<<
        FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\ReadFromProperties\\properties\\TestData.properties");
        Properties pr = new Properties();
        pr.load(fi);
        System.out.println(pr.getProperty("empId"));
    }
}
