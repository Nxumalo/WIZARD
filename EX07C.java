package Wizard;
import java.applet.*;
import java.awt.*;
import MainMenu;


public class EX07C extends Applet{

	MainMenu mainMenu;
	MenuFrame frame;
	
	public void init() {
		resize(320,240);
		frame = new MenuFrame();
		frame.resize(300,200);
		
		mainMenu = new MainMenu(frame);
		mainMenu.CreateMenu();
		frame.show();
	}
	
}

class MenuFrame extends Frame{
	String text = new String("You selected: Nothing");
	
	MenuFrame(){
		super("Select a Sport");
	}
	
	public void paint(Graphics g) {
		g.drawString(text, 10, 10);
	}
	
	public boolean action(Event evt, Object obj) {
		boolean result = false;
		if(evt.target instanceof MenuItem) {
			text = "You selected: "+(String)obj;
			repaint();
			result = true;
		}
		return result;
	}
}
