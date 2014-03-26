package BddProject1.groovy

import org.openqa.selenium.WebDriver
import spock.lang.Specification;
import BddProject1.pages.RegisterUser;

class RegisterUserTest extends Specification{
 
	WebDriver driver
  
	def setup() {
	  driver.manage().timeouts().implicitlyWait 10, SECONDS
	}
  
	def cleanup() {
	  driver.quit()
	}
  
	def "a user is greeted with an intro screen"() {
    when:
    driver.get "http://localhost:8080/BddProject1/index.jsf"

    then:
	println (driver.getTitle())
    driver.title == "Java EE 6 Starter Application"
  

	}
  

	

}
