import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Timetable {
    private static final String FILE_NAME = "Timetable.xlsx";

    public static List<List<String>> getLessons() {
        List<List<String>> timetableData = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                List<String> rowData = new ArrayList<>();
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            rowData.add(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            rowData.add(Double.toString(cell.getNumericCellValue()));
                            break;
                        default:
                            rowData.add("");
                    }
                }
                timetableData.add(rowData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return timetableData;
    }

    // Todo: Implement the setLessons() method to save data to the database or worksheet
    public static void main(String[] args) {
        System.out.println(getLessons());
    }
}
