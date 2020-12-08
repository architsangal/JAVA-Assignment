package countingApp;
import widgets.*;

public class Counter extends Button {

	
	
	// has a reference to an instance of Toggle button
	Counter(Toggle toggle, int width, int height)
	{
		super(width, height);
		this.toggle = toggle;
		this.counter = 0;
		setText(counter+"");
	}	
	
	// Everytime it is clicked, it increments or decrements counter by 1
	// depending on state of the Toggle instance
	@Override
	protected void handleClick() {
		counter = counter + toggle.getState();
		setText(counter+"");
		setFlag(1);
	}
	// Shows the current count as its text
	
	private int counter;
	private Toggle toggle;
}
