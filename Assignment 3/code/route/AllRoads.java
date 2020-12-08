package route;
import geometry.Point;
import java.util.ArrayList;
import geometry.Line;

public class AllRoads
{
    public static void add(Road road)
    {
        roads.add(road);
    }

    public static ArrayList<Road> getRoads() {
        return roads;
    }
    private static ArrayList<Road> roads  = new ArrayList<>();
}