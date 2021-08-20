package Apachi_POI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _03_Apachi_POI_Get_Colomn_Data {
    public static void main(String[] args) throws IOException {

        System.out.println("Konnen sie bitte ein Zahl  eingeben");
        Scanner scanner = new Scanner(System.in);
        int zahl = scanner.nextInt();
        String return_Passwort = Datei_Find(zahl);
        System.out.println(return_Passwort);


    }

    public static String Datei_Find(int zahl) throws IOException {

        String path = "src/test/java/Apachi_POI/recources/ApacheExcel2.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet shett = workbook.getSheet("Sheet1");
        int rowcount = shett.getPhysicalNumberOfRows();
        String return_pass = "";
        for (int i = 0; i < rowcount; i++) {
            Row row = shett.getRow(i);
            int cellcount=row.getPhysicalNumberOfCells();
             if(cellcount>zahl) {
                 return_pass += " " + row.getCell(zahl);
             }

        }

        return return_pass;
    }

}











