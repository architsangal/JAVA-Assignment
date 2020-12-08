package widgets;

import java.util.ArrayList;
import display.*;

public class Panel extends Widget {


	
	public Panel(int width, int height)
	{
		super(width, height);
		setFlag(-1);
		widgets = new ArrayList<>();
		
	}

	public void addWidget(Widget w, Location loc) {
		// add a child widget
		// position of lower left of child is at loc in Panel coordinates
		
		Location location_wrt_panel = new Location(this.getPos().getX() + loc.getX(), this.getPos().getY() + loc.getY());
		w.setPos(location_wrt_panel);
		widgets.add(w);
	}
	
	// implements/overrides draw. Draws a box corresponding to its size and
	// calls draw on each child widget

	@Override
	public void draw()
	{
		if(this.getFlag() == 1 || this.getFlag() == -1)
		{
			if(this.getFlag() == -1)
				Display.drawBox(getPos().getX(), getPos().getY(), getPos().getX()+getWidth(), getPos().getY()+getHeight());
			for(Widget widget: widgets)
			{
				if(widget.getFlag() == 1 || widget.getFlag() == -1)
				{
					widget.draw();
				}
			}
			if(getFlag() == -1)
			{
				setFlag(1);
			}
		}
	}

	public int getFlag() {
		
		if(super.getFlag() == -1)
			return super.getFlag();
		
		setFlag(0);
		for(Widget widget:widgets)
		{
			if(widget.getFlag() == 1)
				setFlag(1);
		}

		return super.getFlag();
	}
	
	private ArrayList<Widget> widgets;
}
/*
	Not required --------------------------------------------------------------------
	
	public void setLocation(Location location)
	{
		super.setPos(location);
	}

*/