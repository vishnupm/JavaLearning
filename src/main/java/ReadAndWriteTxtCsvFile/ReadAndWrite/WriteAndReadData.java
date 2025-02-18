package ReadAndWriteTxtCsvFile.ReadAndWrite;

import java.io.*;

public class WriteAndReadData {
    public static void main(String[] args) throws IOException {
        File fi = new File(System.getProperty("user.dir")+"\\src\\main\\java\\ReadAndWriteTxtCsvFile\\Files\\TestDataTXT.txt");
//        Step1 : Create an object of FileWriter class
        FileWriter f = new FileWriter(fi,true);
//      Step2 : Create object of BufferedWriter class
        BufferedWriter bw= new BufferedWriter(f);
//      Step3 : write data
        bw.write("Vishnu Pratap");
        bw.close();
//      ============Read from txt file================
//      Step1 : Create an object of FileReader class
        FileReader fr = new FileReader(fi);
//      Step2 : Create object of BufferedReader class
        BufferedReader br= new BufferedReader(fr);
//      Step3 : Read data
        System.out.println(br.readLine());
//      Step4 : Close the file
        System.out.println("Read successfully");
        br.close();


//  >>>>>>>>>>> csv file <<<<<<<<<<<<<<<<<<<
        File fc = new File(System.getProperty("user.dir")+"\\src\\main\\java\\ReadAndWriteTxtCsvFile\\Files\\TestDataCSV.csv");
        FileWriter fcw = new FileWriter(fc,true);
        BufferedWriter bwc = new BufferedWriter(fcw);
        for (int i=0; i<10; i++){
            bwc.write("Write to csv"+",");
        }
        bwc.close();

//      ============Read from txt file================
        FileReader fcr = new FileReader(fc);
        BufferedReader bcr = new BufferedReader(fcr);
        System.out.println(bcr.readLine());
        bcr.close();
    }
}
