package com.stepdefinition;


	import java.util.List;
	import java.util.Set;import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Local {
		static WebDriver driver;
		public void getUrl() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahesh hunt\\Music\\MavenProject\\driver\\chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
	   // driver=new ChromeDriver();
	    //return driver;

		}
			
		//1
		public static void LoadUrl(String url) {
		driver.get(url);

		}
		//2
		public static void type(WebElement element, String data) {
		element.sendKeys(data);

		}
		
		//3
		public static void btnClick(WebElement element) {
		element.click();

		}
		//4
		public static void quitBrowser(WebDriver driver) {
		driver.quit();

		}
		//5
		public static void getAttr(WebElement element) {
		element.getAttribute(null);

		}
		//6
		public static void getT(WebDriver driver) {
		driver.getTitle();
		
		}
		//7
		public static void getCU(WebDriver driver) {
		driver.getCurrentUrl();

		}
		//8
		public static void manage(WebDriver driver) {
		driver.manage();

		}
		//9
		public static void sleep(int sec) throws InterruptedException {
		Thread.sleep(sec);

		}
		//10
		public static void switchTo(WebDriver driver) {
			driver.switchTo();

		}
		//11
		public static void getProp(String data) {
		System.getProperty(data);

		}
		//12
		public static void close(WebDriver driver) {
		driver.close();

		}
		//13
		public static void findEl(WebDriver driver) {
		driver.findElement(null);
		}
		//14
		public static void clear(WebElement element) {
		element.clear();
		}
		//15
		public static void isDisp(WebElement element) {
		element.isDisplayed();
		}
		//16
		public static void submit(WebElement element) {
		element.submit();

		}
		//17
		public static void isSelect(WebElement element) {
		element.isSelected();

		}
		//18
		public static void isEnabled(WebElement element) {
		element.isEnabled();

		}
		//19
		public static void getWhandle(WebDriver driver) {
		driver.getWindowHandle();

		}
		//20
		public static void selectByI(WebElement element, int index) {
		Select select=new Select(element);
		select.selectByIndex(index);

		}
		//21
		public static void selectByV(WebElement element, String data) {
		Select select=new Select(element);
		select.selectByValue(data);

		}
		//22
		public static void selectByVisText(WebElement element, String data) {
		Select select= new Select(element);
		select.selectByVisibleText(data);

		}
		//23
		public static void getOp(WebElement element) {
		Select select=new Select(element);
		List<WebElement> list = select.getOptions();
		System.out.println(list);
		}
		//24
		public static void getAllSelOp(WebElement element) {
		Select select=new Select(element);
		List<WebElement> list = select.getAllSelectedOptions();
		System.out.println(list);

		}
		//25
		public static void getFirstSelOp(WebElement element) {
		Select select=new Select(element);
		WebElement list = select.getFirstSelectedOption();
		System.out.println(list);
		}
		//26
		public static void isMul(WebElement  element) {
		Select select=new Select(element);
		boolean mul = select.isMultiple();
		System.out.println(mul);

		}
		//27
		public static void deselectByI(WebElement element, int index) {
		Select select=new Select(element);
		select.deselectByIndex(index);

		}
		//28
		public static void deselectByV(WebElement element, String data) {
		Select select= new Select(element);
		select.deselectByValue(data);

		}
		//29
		public static void deselectByVisText(WebElement element, String data) {
		Select select= new Select(element);
		select.deselectByVisibleText(data);

		}
		//30
		public static void deselAll(WebElement element) {
		Select select= new Select(element);
		select.deselectAll();

		}
		//31
		public static void ok(WebDriver driver) {
		Alert al=driver.switchTo().alert();
		al.accept();

		}
		//32
		public static void cancel(WebDriver driver) {
		Alert al=driver.switchTo().alert();
		al.dismiss();

		}
		//33
		public static void getText(WebDriver driver, String text) {
		Alert al=driver.switchTo().alert();
		String data = al.getText();
		System.out.println(data);

		}
		//34
		public static void getWinHandle(WebDriver driver, String text) {
		String data = driver.getWindowHandle();
		System.out.println(data);

		}
		//35
		public static void getWinHandles(WebDriver driver, String text) {
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);

		}
		//36
		public static void alIsPresent(WebDriverWait waits, WebDriver driver, int sec) {
		WebDriverWait wait= new WebDriverWait(driver,100);
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		
		}
		//37
		public void navigate(String url) {
			driver.navigate().to(url);
			
		}
		//38
		public void navigateBack() {
			driver.navigate().back();
		}
		//39
		public void navigateForward() {
			driver.navigate().forward();
}

	}



