package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseLayer;
import UtilsLayer.UtilsClass;

public class MyInfoPage extends BaseLayer
{
@FindBy(xpath="//span[text()='My Info']")
private WebElement myinfo;

@FindBy(name="middleName")
private WebElement nickname;

@FindBy(xpath="(//button[text()=' Save '])[1]")
private WebElement saveclick;

public MyInfoPage() {
	PageFactory.initElements(driver, this);
}
public void clickbutton() {
	UtilsClass.click(myinfo);
}
public void EnterNick(String nick) {
	UtilsClass.sendkeys(nickname,nick);
}
public void clicksave() {
	UtilsClass.click(saveclick);
}
}
