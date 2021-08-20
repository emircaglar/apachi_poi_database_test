package Apachi_POI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _03_Apachi_POI_Alle_Datei {
    public static void main(String[] args) throws IOException {
        // Der Weg der Datei haben wir bekommen
        String path = "src/test/java/Apachi_POI/recources/ApacheExcel2.xlsx";
        // zwichen datei und system haben wir einen weg gebaut.
        FileInputStream fileInputStream = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet shett = workbook.getSheet("Sheet1");
        //Sheet shett=workbook.getSheet(1);
        int rowcount = shett.getPhysicalNumberOfRows();

        for (int i = 0; i < rowcount; i++) {
            Row row = shett.getRow(i);// das ist erste row
            int cellcount = row.getPhysicalNumberOfCells();// der zahl von der rows wurde festgestellt
            for (int j = 0; j < cellcount; j++) {
                Cell cell = row.getCell(j); // das ist erste cell
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

}





