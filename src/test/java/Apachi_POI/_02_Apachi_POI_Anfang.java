package Apachi_POI;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _02_Apachi_POI_Anfang {
    public static void main(String[] args) throws IOException {
        // Der Weg der Datei haben wir bekommen
        String path="src/test/java/Apachi_POI/recources/ApacheExcel2.xlsx";
        // zwichen datei und system haben wir einen weg gebaut.
        FileInputStream fileInputStream=new FileInputStream(path);

        Workbook workbook=WorkbookFactory.create(fileInputStream);

        Sheet shett=workbook.getSheet("Sheet1");
        //Sheet shett=workbook.getSheet(1);

        Row row=shett.getRow(0);
        
        Cell cell=row.getCell(0);

        System.out.println("cell = " + cell);





    }



    }

