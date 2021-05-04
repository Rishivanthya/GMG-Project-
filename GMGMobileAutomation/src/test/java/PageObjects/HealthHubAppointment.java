package PageObjects;

import io.appium.java_client.MobileElement;


public interface HealthHubAppointment {
	
     
	
	 void Login();
    void Username(String name);

    void assertSearchResult(String expectedResult);

    void navigateToSearchResultDetails();
	void Password(String password);
	void Signin();
}
