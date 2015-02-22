package Cucumber.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

@Given("^Navigate to ap(\\d+)am website$")
public void Navigate_to_ap_am_website(int arg1) throws Throwable {
   System.out.println("welcome world");
}

@When("^i click the vnews$")
public void i_click_the_vnews() throws Throwable {
	System.out.println("navigates to website");
    }

@When("^i click any video link$")
public void i_click_any_video_link() throws Throwable {
    System.out.println("click the link");
}

@Then("^video is opened$")
public void video_is_opened() throws Throwable {
	System.out.println("vedio is opened");
   
}


}
