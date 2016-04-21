package UI.forms;

import org.openqa.selenium.By;
import org.testng.Assert;
import webdriver.BaseForm;
import webdriver.elements.Label;

/**
 * Created by Mariya on 18.04.2016.
 */
public class CatalogForm extends BaseForm {

    private String locCatalog = "//li/span/span[text()='%s']";
    private Label lblCatalog;
    private String locSection = "//li/span/a[text()='%s']";
    private Label lblSection;

    /**
     * Конструктор
     */
    public CatalogForm() {
        super(By.className("catalog-navigation-classifier__item-title-wrapper"), "Onliner.by");
    }





    /**
     * Находим и выбираем раздел каталога
     * @param catalog каталог
     */
    public void checkCatalog(String catalog){
        lblCatalog = new Label (By.xpath((String.format(locCatalog,catalog))), "Catalog");
        lblCatalog.clickAndWait((String.format(locCatalog,catalog)), "catalog-navigation-classifier__item-title-wrapper");
    }

    /**
     * Находим и выбираем секцию в разделе
     * @param section каталог
     */
    public void checkSection(String section){
        lblSection = new Label (By.xpath((String.format(locSection,section))), "Section");
        lblSection.clickAndWait((String.format(locSection,section)), "catalog-navigation-classifier__item-title-wrapper");
    }




}
