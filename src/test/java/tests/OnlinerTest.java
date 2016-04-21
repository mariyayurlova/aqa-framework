package tests;


import UI.forms.CatalogForm;
import UI.forms.MainForm;
import UI.forms.SearchForm;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webdriver.BaseTest;

/**
 * Created by Mariya on 18.04.2016.
 */
public class OnlinerTest extends BaseTest {








    public void runTest() throws Throwable {


        logger.step(1);
        MainForm mainForm = new MainForm();
        mainForm.navigateMenu(insert);


        logger.step(2);
        CatalogForm catalogForm = new CatalogForm();
        catalogForm.checkCatalog(catalog);

        logger.step(3);
        catalogForm.checkSection(section);


        logger.step(4);
        SearchForm searchForm = new SearchForm();
        searchForm.checkManufacturer(manufacturer);

        logger.step(5);
        searchForm.inputPrice(price);

        logger.step(6);
        searchForm.inputDate(date);

        logger.step(7);
        searchForm.selectDiagonalFrom(diagonalFrom);

        logger.step(8);
        searchForm.selectDiagonalTo(diagonalTo);

        logger.step(9);
        searchForm.checkResult(manufacturer, date, diagonalFrom, diagonalTo, price);



    };
}
