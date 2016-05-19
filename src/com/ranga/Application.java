package com.ranga;
import UpperEssential.UpperEssentialLookAndFeel;
import javax.swing.UIManager;

public class Application {
	public static void main(String[] args) throws Exception {
            UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("./src/dao.theme"));
            
            
            if (Login.log()){
                ABC venta = new ABC();
                venta.setVisible(true);
                   
            }
            else System.exit(0);
            
            
            
	}
}

