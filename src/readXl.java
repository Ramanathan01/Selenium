//import java.io.File;
//import java.io.FileOutputStream;
//import java.util.List;
//import java.util.Set;
//import java.util.TreeMap;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class readXl {
	public void Excelsheet() {
		@SuppressWarnings("resource")
		// new workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// new sheet
		XSSFSheet sheet = workbook.createSheet("MobileList");
		System.out.println(sheet.getWorkbook().getProperties().getCustomProperties().getUnderlyingProperties());
		// data to be filled
//		TreeMap<String, Object[]> data = new TreeMap<String, Object[]>();
//		data.put("1", new Object[] { "SNo", "Mobile List","Price" });
//		for (int i = 0; i < 5; i++) {
//			String key = Integer.toString(i + 2);
//			String Sno = Integer.toString(i + 1);
//			data.put(key, new Object[] { Sno, list.get(i),priceList.get(i) });
//		}
//		
//		Set<String> keyset = data.keySet();
//		int rownum = 0;
//		for (String key : keyset) {
//			XSSFRow row = sheet.createRow(rownum++);
//			Object[] objArr = data.get(key);
//			int cellnum = 0;
//			for (Object obj : objArr) {
//				XSSFCell cell = row.createCell(cellnum++);
//				if (obj instanceof String) {
//					// data filled in cells
//					cell.setCellValue((String) obj);
//				} else if (obj instanceof Integer) {
//					cell.setCellValue((Integer) obj);
//				}
//			}
//
//		}
//		try {
//			FileOutputStream fs = new FileOutputStream(new File("gfgcontribute.xlsx"));
//			workbook.write(fs);
//			fs.close();
//			System.out.println("gfgcontribute.xlsx written successfully on disk");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}


