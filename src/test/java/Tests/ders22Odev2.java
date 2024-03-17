package Tests;

import common.PageManager;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class ders22Odev2 {
    PageManager pageManager = new PageManager();

    @BeforeSuite
    public void before() {
        pageManager.webTablesPage.openWebTables();
    }

    // add butonuna tıkla ve formu aç
    @Test(priority = 1)
    public void addClick() {
        pageManager.webTablesPage.addButtonClick.click();
    }

    // formda tüm alanları doldur submit et
    @Test(priority = 2)
    public void nameDoldur() {
        pageManager.webTablesPage.nameDoldur.click();
        pageManager.webTablesPage.nameDoldur.setValue("ozge");
    }
    @Test(priority = 3)
    public void surNameDoldur() {
        pageManager.webTablesPage.surNameDoldur.click();
        pageManager.webTablesPage.surNameDoldur.setValue("yalin");
}
    @Test(priority = 4)
    public void emailuDoldur() {
        pageManager.webTablesPage.emailDoldur.click();
        pageManager.webTablesPage.emailDoldur.setValue("ozgeyalin@gmail.com");
    }
    @Test(priority = 5)
    public void ageDoldur() {
        pageManager.webTablesPage.ageDoldur.click();
        pageManager.webTablesPage.ageDoldur.setValue("30");
    }
    @Test(priority = 6)
    public void salaryDoldur() {
        pageManager.webTablesPage.salaryDoldur.click();
        pageManager.webTablesPage.salaryDoldur.setValue("0");
    }
    @Test(priority = 7)
    public void departmentDoldur() {
        pageManager.webTablesPage.departmentDoldur.click();
        pageManager.webTablesPage.departmentDoldur.setValue("Kalite");
    }
    @Test(priority = 8)
    public void submit() {
        pageManager.webTablesPage.submitClick.click();
    }
    @Test(priority = 9)
    public void duzenleClick(){
        pageManager.webTablesPage.duzenle.click();
    }
    @Test(priority = 10)
    public void duzenleyas(){
        pageManager.webTablesPage.ageDoldur.click();
        pageManager.webTablesPage.ageDoldur.clear();
        pageManager.webTablesPage.ageDoldur.type("32");
    }
    @Test(priority = 11)
    public void submitAge(){
        pageManager.webTablesPage.submitClick.click();
        String ageText=pageManager.webTablesPage.newAge.getText();
        Assertions.assertThat(ageText).isEqualTo("32");
    }
}