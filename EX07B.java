package Wizard;
import java.applet.*;
import java.awt.*;

public class EX07B extends Applet {

	public void init() {
		resize(320,240);
		
		Frame frame = new Frame();
		
		TestDialog dlg = new TestDialog(frame);
		dlg.show();
		
	}
	
}
class TestDialog extends Dialog{
	
	MyControls ctrls;
	
	public TestDialog(Frame parent) {
		super(parent, "Test Dialog",false);
		
		setFont(new Font("Dialog",Font.BOLD,12));
		
		ctrls = new MyControls(this);
		ctrls.CreateControls();
		
	}
	
	public boolean action(Event evt,Object args) {
		boolean result = false;
		
		if("Close".equals(evt.arg)) {
			dispose();
			result = true;
		}
		return result;
	}
}