package countingApp;

import display.Display;
import widgets.*;


public class CountingApp {
	public CountingApp(Display d) {
		// Display object made available at construction. Cannot be changed
		this.disp = d;
	}
	
	public void init() {
		// sets up widgets
		
		// create a Panel with location 50,50 and width 400, height 200
		Panel panel = new Panel(400,200);
		disp.set(panel, 50, 50);
		
		// creates the following widgets, which are added as children of this panel
		// Note locations are relative to Panel
		// - Toggle button:   location 100, 60, size 50, 50
		// - Counter button:  location 200, 60, size 100, 40
		// - Label: location  150, 150, text: "Vote up or down"
		
		Toggle toggle = new Toggle(50, 50);
		Location location = new Location(100, 60);
		panel.addWidget(toggle, location);

		Counter counter = new Counter(toggle,100, 40);
		location = new Location(200, 60);
		panel.addWidget(counter, location);

		Label label = new Label("Vote up or down");
		location = new Location(150, 150);
		panel.addWidget(label, location);
		
		// registers those widgets that are Clickable with Display
		disp.registerClickable(toggle);
		disp.registerClickable(counter);

		disp.redisplay();
	}
	
	public void addPanel(int width, int height, int x0, int y0)
	{
		Panel panel = new Panel(width, height);
		disp.set(panel, x0, y0);
	}

	private Display disp;
}
