package Apachi_POI;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _04_Apachi_POI_Schreiben {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/Apachi_POI/recources/WriteInTheExcelFile(1).xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet shett = workbook.getSheet("Sheet1");

        // ich habe eine Cell erstellt
        Row row = shett.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("merhaba dunya");

        for (int i = 1; i <10 ; i++) {
            cell =row.createCell(i);
            cell.setCellValue(i);
        }


        // wenn ich schreiben möchte, soll ich input stream schließen
        fileInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileOutputStream.close();

    }


}











