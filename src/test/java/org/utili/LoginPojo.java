package org.utili;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

  public LoginPojo() {
PageFactory.initElements(driver, this);
  }
  
  @FindBy(id="email")
  private WebElement user ;


  @FindBy(id="pass")
  private WebElement pass ;
  
  @FindBy(xpath="//button[@type='submit']")
  private WebElement login ;

public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}

public WebElement getLogin() {
	return login;
}

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}
