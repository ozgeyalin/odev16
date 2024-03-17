package Tests;
import common.PageManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ders22Odev1 {
    PageManager pageManager = new PageManager();
    @BeforeMethod
    public void before(){
        pageManager.elementsPage.open();
    }
    @Test
    public void buttonsClick(){
        pageManager.elementsPage.buttonsClick.click();
        pageManager.elementsPage.clickMeClick.click();
        String text=pageManager.elementsPage.clickMeText.getText();
        assertThat(text).isEqualTo("You have done a dynamic click");
    }
}