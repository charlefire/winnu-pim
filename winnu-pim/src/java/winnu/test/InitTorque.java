package winnu.test;
import java.io.FileInputStream;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.torque.Torque;

public class InitTorque {
	public void init() {
		try {
			FileInputStream configStream = new FileInputStream("Torque.properties");
			PropertiesConfiguration c = new PropertiesConfiguration();
			c.load( configStream );
			Torque.init( c );
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
}
