package BaseLayer;

import java.time.Duration;

import UtilityLayer.DriverFactory;

public class BaseClass extends DriverFactory {

	
	public void initialization(String driverName) 
	{
		setDriver(driverName);
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		getDriver().get("https://ui.cogmento.com");

	}

}
