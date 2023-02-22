package prabal;

import org.openqa.selenium.By;
import java.net.MalformedURLException;

public class AppTest extends BaseTest {
public static void main(String[] args) throws MalformedURLException {
AppTest appTest = new AppTest();
appTest.setUp();
appTest.testApp();
appTest.tearDown();
}

protected void testApp() {
    getStartedClick();
    continueClick();
    enableLocationService();
    clickOnFirstTeam();
    closePopup();
    clickSearchTab();
    searchTeam();
    verifyTeam();
    goToTablePage();
    verifyTablePage();
    closeTable();
    clickBackButton();
}

private void getStartedClick() {
    driver.findElement(By.id("com.fivemobile.thescore:id/action_button_text")).click();
}

private void continueClick() {
    driver.findElement(By.id("com.fivemobile.thescore:id/btn_primary")).click();
}

private void enableLocationService() {
    driver.findElement(By.id("com.fivemobile.thescore:id/btn_allow")).click();
    driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
}

private void clickOnFirstTeam() {
    driver.findElement(By.id("com.fivemobile.thescore:id/txt_name")).click();
    driver.findElement(By.id("com.fivemobile.thescore:id/btn_primary")).click();
    driver.findElement(By.id("com.fivemobile.thescore:id/action_button_text")).click();
}

private void closePopup() {
    driver.findElement(By.id("com.fivemobile.thescore:id/dismiss_modal")).click();
}

private void clickSearchTab() {
    driver.findElement(By.id("com.fivemobile.thescore:id/search_bar_text_view")).click();
}

private void searchTeam() {
    driver.findElement(By.id("com.fivemobile.thescore:id/search_src_text")).sendKeys("Manchester United");
    driver.findElement(By.id("com.fivemobile.thescore:id/txt_name")).click();
}

private void verifyTeam() {
    if (driver.findElement(By.id("com.fivemobile.thescore:id/team_name")).getText().equals("Manchester United")) {
        System.out.println("FOUND");
    } else {
        System.out.println("NOT FOUND!");
    }
}

private void goToTablePage() {
	 driver.findElement(By.id("com.fivemobile.thescore:id/scores_container")).click();
	 driver.findElement(By.id("com.fivemobile.thescore:id/close")).click();
	 driver.findElement(By.id("com.fivemobile.thescore:id/full_live_table_title")).click();
	 

}

private void verifyTablePage() {
	 if (driver.findElement(By.id("com.fivemobile.thescore:id/titleTextView")).getText().equals("Table")) {System.out.println("FOUND");
	 } else {
           System.out.println("NOT FOUND!");
       }
}

private void closeTable() {
	 driver.findElement(By.id("com.fivemobile.thescore:id/btnClose")).click();
	
}	

private void clickBackButton() {
	
	driver.findElement(By.className("android.widget.ImageButton")).click();
}

}

