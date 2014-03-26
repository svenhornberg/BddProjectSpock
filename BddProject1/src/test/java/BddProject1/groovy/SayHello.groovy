package BddProject1.groovy

import static java.util.concurrent.TimeUnit.SECONDS
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import spock.lang.Specification

class TeacherRegistrationSpec extends Specification {

  WebDriver driver

  def setup() {
    driver = new FirefoxDriver()
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