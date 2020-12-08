package route;
import geometry.Point;
import geometry.Line;
import java.util.ArrayList;

public class Route
{
    public Route(int arr[])
    {
        this.roads = new ArrayList<>();
        ArrayList<Road> allRoads = AllRoads.getRoads();
        for(int i : arr)
        {
            this.roads.add(allRoads.get(i));
        }
        this.route = "";
        this.valid = isConnected();
    }

    public double length_of_route()
    {
        double totalLength = 0.0;
        for(Road road: roads)
        {
            totalLength += road.length();
        }
        return totalLength;
    }

    boolean isConnected()
    {
        int fp1 = 0;
        int fp2 = 0;
        if(roads.size() == 1)
        {
            Road road = roads.get(0);
            this.route += "Start at "+ road.getL1().getName() +". Follow "+ road.getName() +" to "+ road.getL2().getName() +".";
        }
        for(int i = 0; i<roads.size(); i++)
        {
            if(i<roads.size()-1)
            {
                Road road = roads.get(i);
                Road nextRoad = roads.get(i+1);
                if(i==0)
                {
                    if(road.getL1()==nextRoad.getL1() || road.getL2()==nextRoad.getL1())
                    {
                        fp1 = 1;
                        if(road.getL1()==nextRoad.getL1())
                            this.route += "Start At " + road.getL2().getName() + "."+" Follow "+road.getName()+" to "+ road.getL1().getName()+".";
                        else if(road.getL2()==nextRoad.getL1())
                            this.route += "Start At " + road.getL1().getName() + "."+" Follow "+road.getName()+" to "+ road.getL2().getName()+".";
                        continue;
                    }
                    else if(road.getL1()==nextRoad.getL2() || road.getL2()==nextRoad.getL2())
                    {
                        fp2 = 1;
                        if(road.getL1()==nextRoad.getL2())
                            this.route += "Start At " + road.getL2().getName() + "."+" Follow "+road.getName()+" to "+ road.getL1().getName()+".";
                        else if(road.getL2()==nextRoad.getL2())
                            this.route += "Start At " + road.getL1().getName() + "."+" Follow "+road.getName()+" to "+ road.getL2().getName()+".";
                        continue;
                    }
                    else
                    {
                        this.route = "Invalid route";
                        return false;
                    }
                }
                else
                {
                    if(fp1 == 1)
                    {
                        if(road.getL2()==nextRoad.getL1())
                        {
                            this.route += " Follow "+road.getName()+" to "+road.getL2().getName()+".";
                            fp1 = 1;
                            fp2 = 0;
                            continue;
                        }
                        else if(road.getL2()==nextRoad.getL2())
                        {
                            this.route += " Follow "+road.getName()+" to "+road.getL2().getName()+".";
                            fp1 = 0;
                            fp2 = 1;
                            continue;
                        }
                        else
                        {
                            this.route = "Invalid route";
                            return false;
                        }
                    }
                    else if(fp2 == 1)
                    {
                        if(road.getL1()==nextRoad.getL1())
                        {
                            this.route += " Follow "+road.getName()+" to "+road.getL1().getName()+".";
                            fp1 = 1;
                            fp2 = 0;
                            continue;
                        }
                        else if(road.getL1()==nextRoad.getL2())
                        {
                            this.route += " Follow "+road.getName()+" to "+road.getL1().getName()+".";
                            fp1 = 0;
                            fp2 = 1;
                            continue;
                        }
                        else
                        {
                            this.route = "Invalid route";
                            return false;
                        }
                    }
                    else
                    {
                        this.route = "Invalid route";
                        return false;
                    }
                }
            }
            else
            {
                Road road = roads.get(i);
                if(fp1 == 1)
                    this.route += " Follow "+road.getName()+" to "+road.getL2().getName()+".";
                else if(fp2 == 1)
                    this.route += " Follow "+road.getName()+" to "+road.getL1().getName()+".";
                else
                {   
                    this.route = "Invalid route";
                    return false;
                }
            }
        }
        return true;
    }

    public double getMaxWidth()
    {
        double  width = Double.MAX_VALUE;
        for(Road road:roads)
        {
            if(width>road.getWidth())
            {
                width = road.getWidth();
            }
        }
        return width;

    }

    public String getRoute() {
        return route;
    }
    public void setRoute(String route) {
        this.route = route;
    }
    public boolean IsValid()
    {
        return valid;
    }

    private boolean valid;
    private String route;
    private ArrayList<Road> roads;
}