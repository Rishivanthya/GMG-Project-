package Test;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class Test_HealthubAppointment extends BaseTestClass {

    @Test
    public void searchContact() {
       
    	Healthhub.Login();
    	Healthhub.Username("100028983");
    	Healthhub.Password("Welcome@1");
    	Healthhub.Signin();

        //Verify result
    	Healthhub.assertSearchResult("Sara Alston");

        //Navigate to detail page
    	Healthhub.navigateToSearchResultDetails();

        //Verify that correct page is displayed
       
    }
}
