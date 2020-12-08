package route;
import geometry.Point;
import java.util.ArrayList;

import geometry.Line;

public class AllLocations
{
    public static void add(Location location)
    {
        locations.add(location);
    }

    public static Location getLocationAtIndex(int i)
    {
        return locations.get(i);
    }
    private static ArrayList<Location> locations = new ArrayList<>();
}