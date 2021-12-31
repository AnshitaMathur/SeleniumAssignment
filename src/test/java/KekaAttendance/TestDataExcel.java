package KekaAttendance;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class TestDataExcel {


        XSSFWorkbook wb;
        XSSFSheet sheet1;
        public TestDataExcel(String excelpath)
        {
            try {
                File src = new File(excelpath);
                FileInputStream kekafile = new FileInputStream(src);

                wb = new XSSFWorkbook(kekafile);


            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        public String getData(int sheetNumber,int row,int column){
            sheet1 = wb.getSheetAt(0);
            String data = sheet1.getRow(row).getCell(column).getStringCellValue();
            return data;
        }

    }
