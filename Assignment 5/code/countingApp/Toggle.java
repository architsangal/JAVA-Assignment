package countingApp;

import display.Display;
import widgets.Button;

public class Toggle extends Button {

	Toggle(int width, int height)
	{
		super(width, height);
		state = 1;
	}

	@Override
	public void draw() {
		setFlag(0);
		Display.drawCircle(getWidth()/2+getPos().getX(), getHeight()/2+getPos().getY(), getHeight()/2);
		if(state == -1)
			Display.drawText(getPos().getX(), getPos().getY(), "Down");
		else
			Display.drawText(getPos().getX(), getPos().getY(), "Up");
	}

	@Override
	protected void handleClick() {
		if(state == 1)
			state = -1;
		else if(state == -1)
			state = 1;

		setFlag(1);
	}
	
	// redefines draw so that it draws a circular outline 
	// (instead of the default rectangular outline of Button)
	// "position" of Toggle is defined as the lower left corner of the
	// box that would enclose the circle
	
	
	
	// Toggles its state on each click. 
	// Displays the text "Up" or "Down" accordingly
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}

	// has a method to get its current state
	private int state;
	
}
