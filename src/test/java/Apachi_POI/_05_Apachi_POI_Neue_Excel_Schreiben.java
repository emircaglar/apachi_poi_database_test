package Apachi_POI;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _05_Apachi_POI_Neue_Excel_Schreiben {
    public static void main(String[] args) throws IOException {

         // wie gewöhnt, haben wir eine workbook und sheet erstellt
        XSSFWorkbook workbook1=new XSSFWorkbook();
        XSSFSheet xssfSheet=workbook1.createSheet();

        // dann hebe icheni Row und  eine Cell erstellt
        Row row = xssfSheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("merhaba dunya");

        for (int i = 1; i <10 ; i++) {
             row = xssfSheet.createRow(i);
             cell = row.createCell(0);
             cell.setCellValue(i);
        }



        FileOutputStream fileOutputStream = new FileOutputStream("src/test/java/Apachi_POI/recources/neueExcel.xlsx");
        workbook1.write(fileOutputStream);
        fileOutputStream.close();

    }


}











