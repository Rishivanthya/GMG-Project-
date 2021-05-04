package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import PageObjects.HealthHubAppointment;

import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HealthHubAppointmentscenarioIOS implements HealthHubAppointment {

    public HealthHubAppointmentscenarioIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
   

    
    @iOSFindBy(accessibility = "UserNameField")
    private MobileElement Username;
    
    @iOSFindBy(accessibility = "PasswordField")
    private MobileElement Password;
    
    @iOSFindBy(accessibility = "loginButton")
    private MobileElement Login;
    
    @iOSFindBy(accessibility = "loginButton")
    private MobileElement Signin;

    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"Search results\"]/XCUIElementTypeCell/XCUIElementTypeStaticText")
    private MobileElement firstSearchResultName;

    public void Username(String name) 
    {
    	Username.click();
    	Username.sendKeys("200002840");
    	
    	
    }
    
    public void Password(String name) 
    {
    	Password.click();
    	Password.sendKeys("Welcome@1");
    	
    	
    }
    
    public void Signin() 
    {
    	Signin.click();
    
    	
    	
    }
    
 

    public void Login() {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Login.click();
    	
    }
    
    public void assertSearchResult(String expectedResult) {
        Assert.assertEquals(expectedResult, firstSearchResultName.getText());
    }

    public void navigateToSearchResultDetails() {
        firstSearchResultName.click();
    }
}
