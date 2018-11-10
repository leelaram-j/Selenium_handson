package Selenium_tutorial_suite;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class excel_import
{
    public static XSSFWorkbook wb;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static FileInputStream fis;

    public static void main(String[] args) throws Exception
    {
//        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads/geckodriver");
//        WebDriver driver= new FirefoxDriver();
//        driver.get("https://www.gmail.com");
        fis = new FileInputStream("//Users//lee//Downloads//Sample_Excel.xlsx");
        String value= getCellData(0,0);
        System.out.println(value);
    }

    public static String getCellData(int rownum, int col) throws IOException {
        wb = new XSSFWorkbook(fis);
        sheet =wb.getSheet("script");
        row=sheet.getRow(rownum);
        cell=row.getCell(col);
        return cell.getStringCellValue();
    }
}
