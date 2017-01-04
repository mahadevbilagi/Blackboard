package excelfileIO;
import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {

	int i,j;
	String sheetname;
	
	public void setsheetname(String sheetname) {
		this.sheetname = sheetname;
	}
	public String getsheetname() {
		return sheetname;
	}
		public String readExcel(int i,int j) throws BiffException, IOException {	

			String FilePath = "D:\\WORK\\Blackboard\\src\\excelfileIO\\Blackboard.xls";
					
			FileInputStream fs = new FileInputStream(FilePath);	
			Workbook wb = Workbook.getWorkbook(fs);			
			
			Sheet sh = wb.getSheet(getsheetname());	
			
			int rows = sh.getRows();				// To get the number of rows present in sheet			
			int cols = sh.getColumns();				// To get the number of columns present in sheet
						
			String d1 = sh.getCell(i,j).getContents();			
			return d1;									
			
		}	
}


