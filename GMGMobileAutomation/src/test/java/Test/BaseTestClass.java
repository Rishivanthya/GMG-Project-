package Test;

import AppiumSupport.AppiumBaseClass;
import PageObjects.*;
import org.junit.After;
import org.junit.Before;

import AppiumSupport.AppiumController;


public class BaseTestClass extends AppiumBaseClass{
    HealthHubAppointment Healthhub;
    

    @Before
    public void setUp() throws Exception {
        AppiumController.instance.start();
        switch (AppiumController.executionOS) {
            case ANDROID:
            case ANDROID_BROWSERSTACK:
            	
                
                break;
            case IOS:
            case IOS_BROWSERSTACK:
            	Healthhub = new HealthHubAppointmentscenarioIOS(driver());
              
                break;
        }
    }

    @After
    public void tearDown() {
        AppiumController.instance.stop();
    }
}
