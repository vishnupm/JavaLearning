package ReadAndWriteExcelFile.ReadAndWrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;


public class WriteAndReadDataToExcel {
    public static void main(String[] args) throws IOException {
//      >>>>>>>>>>>>>>>>>>>>>>>>>>>write data<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet1 = wb.createSheet("sheetA");

        Row r0 = sheet1.createRow(0);
        Cell c0 = r0.createCell(0);
        c0.setCellValue("VPM");

        Row r1 = sheet1.createRow(1);
        Cell c1 = r1.createCell(1);
        c1.setCellValue("GCM");

        Row r2 = sheet1.createRow(2);
        Cell c2 = r2.createCell(0);
        c2.setCellValue("MRP");
        Cell c3 = r2.createCell(1);
        c3.setCellValue("RKK");

        File f = new File("C:\\Practices\\JavaPractice\\learningJava\\src\\main\\java\\ReadAndWriteExcelFile\\Files\\TestData.xls");
        FileOutputStream fos = new FileOutputStream(f);
        wb.write(fos);
        fos.close();
        wb.close();
        System.out.println("Written successfully");

//      >>>>>>>>>>>>>>>>>>>>>>>>>>>read data<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        FileInputStream fis = new FileInputStream(f);
        Workbook wbf = WorkbookFactory.create(fis);
        Sheet sheet0 = wbf.getSheetAt(0);
        Row ro0 = sheet0.getRow(0);
        Cell ce0 = ro0.getCell(0);

        System.out.println(ce0);

        for (Row row:sheet0){
            for (Cell cell: row){
                switch (cell.getCellType()){
                    case STRING :
                        System.out.println(cell.getStringCellValue());
                        break;
                    case BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());
                        break;
                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue());
                        break;
                    default:
                        break;
                }
            }
        }

        fis.close();
    }
}
