

import java.io.IOException;

import org.testng.annotations.Test;



public class frsTest extends baseUI {
	@Test
	public void initTest() throws IOException {
		invokeBrowser("chrome");
		openURL("url");
		frsPage fr=new frsPage(driver);
                fr.waitUntil(180);
		fr.findings();
		fr.test();
	}

}
