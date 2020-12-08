package widgets;

import display.Display;

public abstract class Widget
{
	Widget(int width, int height)
	{
		this.width = width;
		this.height = height;
		flag = -1;// executing the widget for the first time
	}
	
	//public void setPos(Location p) {    // what is appropriate access specifier here?
		// position of lower left corner of widget in global coordinates of Display
		
	//}
	
	//public Location getPos() {   // what is the appropriate access specifier here?
		
	//}

	public void setPos(Location pos)
	{
		this.pos = pos;
	}
	public Location getPos()
	{
		return pos;
	}

	protected abstract void draw(); // widget uses methods of Display to draw an outline
					      // and any text within the outline
	// widgets should redraw themselves only if they have changed since last 
	// draw 

	// ----------------------------------------------------------
	
	// public int getWidth() {  }
	// public int getHeight() {  }
	
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}	
	
	
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}

	// add other protected/public methods as needed
	private int width;
	private int height;
	private Location pos;
	private int flag;
	// flag for checking if it is required to redraw any of the widgets

/*
	Not required------------------------------------------------------------------------------

	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}

*/
}