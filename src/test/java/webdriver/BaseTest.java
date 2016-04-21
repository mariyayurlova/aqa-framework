package webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * An abstract class that describes the basic test application contains
 * methods for logging and field test settings (options)
 */
public abstract class BaseTest extends BaseEntity{


	protected String insert;
	protected String catalog;
	protected String section;
	protected String manufacturer;
	protected String price;
	protected String date;
	protected String diagonalFrom;
	protected String diagonalTo;

	@Test
	@Parameters({"insert", "catalog", "section", "manufacturer", "price", "date", "diagonalFrom", "diagonalTo"})
	public void readParam(String insert, String catalog, String section, String manufacturer, String price, String date, String diagonalFrom, String diagonalTo) throws Throwable {
		this.insert = insert;
		this.catalog = catalog;
		this.section = section;
		this.manufacturer = manufacturer;
		this.price = price;
		this.date = date;
		this.diagonalFrom = diagonalFrom;
		this.diagonalTo = diagonalTo;

	}


	/**
	 * To override.
	 */
	public abstract void runTest() throws Throwable;

	/**
	 * Test
	 * @throws Throwable Throwable
	 */





	@Test
	@Parameters({"insert", "catalog", "section", "manufacturer", "price", "date", "diagonalFrom", "diagonalTo"})
	public void xTest() throws Throwable {
		Class<? extends BaseTest> currentClass = this.getClass();

		browser.windowMaximise();

		try {

			logger.logTestName(currentClass.getName());
			browser.navigate(Browser.getBaseUrl());
			runTest();
			logger.logTestEnd(currentClass.getName());
		} catch (Throwable e) {
			
				logger.warn("");
				logger.warnRed(getLoc("loc.test.failed"));
				logger.warn("");
				logger.fatal(e.getMessage());
			}
		
	}

	/**
	 * Format logging
	 * @param message Message
	 * @return Message
	 */
	protected String formatLogMsg(final String message) {
		return message;
	}

}
