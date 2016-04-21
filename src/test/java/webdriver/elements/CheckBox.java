package webdriver.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Mariya on 17.04.2016.
 */
public class CheckBox extends BaseElement {

    WebElement check;

    protected CheckBox(By loc) {
        super(loc);
    }

    public CheckBox(By loc, String nameOf) {
        super(loc, nameOf);
    }

    protected CheckBox(String stringLocator, String nameOfElement) {
        super(stringLocator, nameOfElement);
    }

    @Override
    protected String getElementType() {
        return null;
    }

    public boolean isEnabled(){
        return this.getElement().isEnabled();
    }


    public void check(String checkbox){

        if (isChecked(checkbox)==true){

        }
        else
        {
            check.click();
        }




    }

    public boolean isChecked(String checkbox){
        check = browser.getDriver().findElement(By.xpath(checkbox));
        if(check.isSelected())
        {
            return true;
        }
        else
            return false;

    }

    public void unCheck(String checkbox){

        if (isChecked(checkbox)==true){
            check.click();
        }
        else
        {
        }


    }



    public void ifChecking(String checkbox){
        waitForIsElementPresent();
        WebElement check = browser.getDriver().findElement(By.xpath(checkbox));
        check.click();
    }
}
