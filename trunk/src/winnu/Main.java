package winnu;

import winnu.control.WinnuControl;
import winnu.gui.MainForm;

public class Main {
    public static void main(String[] args){
        WinnuControl control = new WinnuControl();
        MainForm mform = new MainForm(control);
        mform.setVisible(true);
    }
}
