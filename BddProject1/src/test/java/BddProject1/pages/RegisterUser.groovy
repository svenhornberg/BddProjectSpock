package BddProject1.pages


import groovy.transform.InheritConstructors

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

@InheritConstructors
abstract class RegisterUser extends StarterPage {
  WebElement name
  WebElement email
  WebElement phone
  WebElement register

  RegisterUser(WebDriver driver) {
    super(driver)
  }

  protected <T> T register(name, email, password, Class<T> nextPage) {
    type_name name
    type_email email
    type_password password
    click_create nextPage
  }
}