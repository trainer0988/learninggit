package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginProdSteps {


	
	@And("user enter captch image")
	public void user_enter_captch_image() {
		System.out.println("@And -- user enter captcha image");
	}
	
	@Then("user enetr loginid and password")
	public void user_enetr_loginid_and_password(io.cucumber.datatable.DataTable dataTable) {
	    
	List<List<String>> data = 	dataTable.asLists();
	/*
	 * System.out.println(data.get(0).get(0));
	 * System.out.println(data.get(0).get(1));
	 * System.out.println(data.get(1).get(0));
	 * System.out.println(data.get(1).get(1));
	 */
	List<Map<String,String>> map = dataTable.asMaps();
	System.out.println(map.get(0).get("loginid"));
	System.out.println(map.get(0).get("password"));
	System.out.println(map.get(1).get("loginid"));
	System.out.println(map.get(1).get("password"));
	}

}
