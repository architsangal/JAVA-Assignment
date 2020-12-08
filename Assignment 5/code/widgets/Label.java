package widgets;

import display.Display;

public class Label extends Widget {

	// has a text string as data - which is provided at create time
	// width and height are determined from this
	// assume each character is 5 units wide and 10 units high
	public Label(String text)
	{
		super(text.length()*5, 10);
		this.text = text;
		setFlag(-1);
	}
	
	public void draw()
	{
		setFlag(0);
		Display.drawText(super.getPos().getX(), super.getPos().getY(), this.text);
	}
	// does not react to mouse events
	
	// provides methods to get text
	
	public String getText() {
		return text;
	}
	private String text;
}
