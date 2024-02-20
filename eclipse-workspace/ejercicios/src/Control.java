import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.System.Logger.Level;

public class Control {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		try {
			File myFile = new File(this.filename);
			Object fis = new FileInputStream(myFile);
			XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
			}
		} catch (IOException ex) {
			Logger.getLogger(WorkBook.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				if (fis!=null) fis.close();
			} catch (IOException ex) {
				Logger.getLogger(WorkBook.class.getName()).log(Level.SEVERE, null, ex);
			}
		}

	}

}
