package route;
import geometry.Point;
import geometry.Line;
public class Road
{
    public Road(String name, Location l1, Location l2, double width)
    {
        this.name = name;
        this.width = width;
        this.l1 = l1;
        this.l2 = l2;
        this.line = new Line(l1.getPoint(), l2.getPoint());
    }
    public double length()
    {
        return this.line.length();
    }
    public String getName() {
        return name;
    }
    public Line getLine() {
        return line;
    }
    public double getWidth() {
        return width;
    }
    public Location getL1() {
        return l1;
    }
    public Location getL2() {
        return l2;
    }
    private String name;
    private Line line;
    private double width;
    private Location l1;
    private Location l2;

}