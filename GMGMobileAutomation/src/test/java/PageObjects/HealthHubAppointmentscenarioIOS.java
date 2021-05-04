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

    @iOSFindBy(accessibility = "searchButton")
    private MobileElement DoctorSearchbutton;
    
    @iOSFindBy(accessibility = "searchTextField")
    private MobileElement SearchDoctor;
    
    @iOSFindBy(accessibility = "secondCell")
    private MobileElement Doctorclick;
    
    
    

    public void Username(String name) 
    {
    	Username.click();
    	Username.sendKeys(name);
    	
    	
    }
    
    public void Password(String password) 
    {
    	Password.click();
    	Password.sendKeys(password);
    	
    	
    }
    
    public void Signin() 
    {
    	Signin.click();
    	
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    	
    	
    }
    
    public void Doctor_Speciality_Button()
    {
    	
    	DoctorSearchbutton.click();
    }
    
    public void SearchDoctor(String Doctorname)
    {
    	SearchDoctor.click();
    	SearchDoctor.sendKeys(Doctorname);
    }
 
    public void ClickonDoctor()
    {
    	
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	Doctorclick.click();
    	
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    	
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

	@Override
	public void assertSearchResult(String expectedResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigateToSearchResultDetails() {
		// TODO Auto-generated method stub
		
	}
    
   /* public void assertSearchResult(String expectedResult) {
        Assert.assertEquals(expectedResult, firstSearchResultName.getText());
    }

    public void navigateToSearchResultDetails() {
        firstSearchResultName.click();
    }*/
}
