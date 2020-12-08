package geometry;
import java.util.ArrayList;
public class Line
{
    public Line(Point p1,Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length()
    {
        return p1.distance(p2);
    }

    public static double totalLength(ArrayList<Line> lines)
    {
        double total_length = 0;
        for(Line i : lines)
        {
            total_length += i.length();
        }
        return total_length;
    }

    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }
    public void setP1(Point p1) {
        this.p1 = p1;
    }
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    private Point p1;
    private Point p2;
}