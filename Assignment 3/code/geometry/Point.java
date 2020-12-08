package geometry;
public class Point
{

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point)
    {
        double x1= point.getX();
        double y1= point.getY();

        double distance = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
        return distance;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    private double x;
    private double y;
}