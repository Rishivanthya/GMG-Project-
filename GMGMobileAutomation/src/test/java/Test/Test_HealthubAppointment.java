package Test;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class Test_HealthubAppointment extends BaseTestClass {

    @Test
    public void searchContact() {
       
    	Healthhub.Login();
    	Healthhub.Username("200002840");
    	Healthhub.Password("Welcome@1");
    	Healthhub.Signin();
    	Healthhub.Doctor_Speciality_Button();
    	Healthhub.SearchDoctor("Aby John");
    	Healthhub.ClickonDoctor();
    	

        //Verify result
    	//Healthhub.assertSearchResult("Sara Alston");

        //Navigate to detail page
    	//Healthhub.navigateToSearchResultDetails();

        //Verify that correct page is displayed
       
    }
}
