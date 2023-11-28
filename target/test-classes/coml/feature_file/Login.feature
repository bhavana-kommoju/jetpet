Feature: Checking on Recuriment features 
@Given
  Scenario:TC_RC_001 checking search functonality of Recuriment features
    Given user have to enter in home page of OrangeHRM Web Application
    When   user has to login into application and enter the user name
    And    user should enter the password 
    And    user should click on the login button
    When  user have to click on Recuriments option
    Then  user should able to see Recuriments candidates page
    When  user clicks on job title
		And   user selects Account Assitant
		And   user click on Vacancy
		And   user selects Assiocate IT Manager
		And   user clicks on search button
	  Then  user should Not found any record in approration number
		




    
  