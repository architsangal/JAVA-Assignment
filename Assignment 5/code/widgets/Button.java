package widgets;

import display.Display;

public class Button extends Widget implements Clickable {
	
	public Button(int width, int height)
	{
		super(width, height);
	}
	
	// has methods to get/set text
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	// implements/overrides draw to draw a box at the correct position and size
	// and displays the text of the button
	
	@Override
	protected void draw() {
		if(getFlag() == 1 || getFlag() == -1)
		{
			setFlag(0);
			Display.drawBox(getPos().getX(), getPos().getY(), getPos().getX()+getWidth(), getPos().getY()+getHeight());
			Display.drawText(getPos().getX(), getPos().getY(), text);
		}
		else // no neeed of redrawing
		{
			return;
		}
	}
	
	// implement the onClick method to check if the click is within its bounds
	// and if so, invokes protected method handleClick
	public void onClick(Location p){
		if((super.getPos().getX() <= p.getX() && p.getX() <= super.getPos().getX() + super.getWidth()) &&
		(super.getPos().getY() <= p.getY() && p.getY() <= super.getPos().getY() + super.getHeight())){
			handleClick();
		}
	}

	
	// should we make this abstract?
	/*
		We can do that but according to me it is better to override the function in child classes as
		if we make this function abstract then the class button will not have any objects. It would
		be easier if want to generalise the package. So, logically overriding is a good option. Although,
		it is very much possible to make this function abstract, as we then may define handleClick()
		individually but sometimes code may be repeated for similar buttons.
	*/

	protected void handleClick() {   
		System.out.println("Button hasn't been assigned any task yet");
	}
	
	
	private String text;
}
