package UI.forms;


import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Label;

/**
 * Created by Mariya on 18.04.2016.
 */
public class MainForm extends BaseForm {

    private String locatorLabel = "//li/a/span[text()='%s']";
    private Label label;



    /**
     * Конструктор
     */

    public MainForm() {
        super(By.className("fast-search__input"), "Onliner.by");
    }




    /**
     * Находим и выбираем каталог
     * @param insert каталог
     */
    public void navigateMenu(String insert){
        label = new Label (By.xpath((String.format(locatorLabel,insert))), "Catalog");
        label.clickAndWait(((String.format(locatorLabel,insert))),"fast-search__input");
    }









}
