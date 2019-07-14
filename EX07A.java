package Wizard;
import java.applet.*;
import java.awt.*;
import MyControls;

public class EX07A {
	
	MyControls ctrls;
	
	public void init() {
		
		ctrls = new MyControls(this);
		ctrls.CreateControls();
		
		public boolean action(Event evt, Object obj) {
			if("Add".equals(obj)) {
				String str = ctrls.NewText.getText();
				ctrls.ItemList.addItem(str);
				return true;
			}
			return false;
		}
	}

}
