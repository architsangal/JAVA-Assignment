package route;
import geometry.Point;
public class Location
{
    public Location(String name, double x, double y)
    {
        this.name = name;
        this.point = new Point(x,y);
    }

    public String getName() {
        return name;
    }

    public Point getPoint() {
        return point;
    }

    private String name;
    private Point point;
}