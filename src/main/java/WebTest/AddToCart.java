package WebTest;

import org.junit.Assert;
import org.openqa.selenium.By;

public class  AddToCart extends Utils {

    private By _ClickOnItem= By.xpath(" ");
    private By _EntertQuantity=By.xpath("//input[@id='quantity_wanted']");
    private By _SelectSize=By.xpath("");
    private By _ClickColor=By.xpath("");
    private By _ClickAddToCart=By.xpath("");
    private By _verifyProductAddSuccessfully=By.xpath("");


    public void ClickOnItem (){

        clickElements(_ClickOnItem);
        enterText(_EntertQuantity);
     selectValueFromDropDown(_SelectSize);
        selectValueFromDropDown(_ClickColor);
        clickElements(_ClickAddToCart);
        Assert.assertEquals("Product successfully added to your shopping cart.\n",_verifyProductAddSuccessfully);
    }
    }

