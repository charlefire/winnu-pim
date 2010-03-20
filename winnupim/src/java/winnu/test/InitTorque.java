package winnu.test;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.torque.Torque;

public class InitTorque {
	public void init() {
		try {
			PropertiesConfiguration c = new PropertiesConfiguration();
			c.load( getClass().getResourceAsStream("resources/Torque.properties") );
			Torque.init( c );
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
}
