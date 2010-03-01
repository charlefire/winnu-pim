package winnu;

import winnu.control.WinnuControl;
import winnu.gui.MainForm;
import winnu.test.InitTorque;

public class Main {
    public static void main(String[] args){
    	InitTorque it = new InitTorque();
		it.init();
    	
        WinnuControl control = new WinnuControl();
        MainForm mform = new MainForm(control);
        mform.setVisible(true);
    }
}
