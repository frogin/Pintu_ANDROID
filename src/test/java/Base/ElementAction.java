package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementAction extends BaseUtil {

    private  BaseUtil base;

    public void hover(WebElement element) {
        WebElement elems= element;
        Actions builder = new Actions(driver);
        Actions hoverOverRegistrar = builder.moveToElement(elems);
        hoverOverRegistrar.perform();

    }

    public String getText(By element) {
        String text = driver.findElement(element).getText();
        return text;
    }

    public void Click(WebElement element) {
        element.click();
    }

}

