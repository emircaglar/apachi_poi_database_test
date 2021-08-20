package Apachi_POI;

import org.apache.poi.ss.usermodel.*;

import java.io.DataInput;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _04_Apachi_POI_Get_Specific_Data {
    public static void main(String[] args) throws IOException {

        System.out.println("Konnen sie bitte Ihr Passwort eingeben");
        Scanner scanner = new Scanner(System.in);
        String passwort = scanner.nextLine();
        String return_Passwort = Datei_Find(passwort);
        System.out.println(return_Passwort);


    }

    public static String Datei_Find(String password) throws IOException {

        String path = "src/test/java/Apachi_POI/recources/ApacheExcel2.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet shett = workbook.getSheet("Sheet1");
        int rowcount = shett.getPhysicalNumberOfRows();
        String return_pass = "";
        for (int i = 0; i < rowcount; i++) {
            Row row = shett.getRow(i);
            int cellcount = row.getPhysicalNumberOfCells();

            if (row.getCell(0).getStringCellValue().equals(password)) {
                for (int j = 1; j < cellcount; j++) {
                    return_pass += " " + row.getCell(j);

                }

            }
        }
        return return_pass;
    }

}











