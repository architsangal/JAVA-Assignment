import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import geometry.*;
import route.*;
class Test
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int locations = Integer.parseInt(br.readLine());
        for(int i=0;i<locations;i++)
        {
            String[] inputs = br.readLine().split(" ");
            AllLocations.add(new Location(inputs[2],Double.parseDouble(inputs[0]),Double.parseDouble(inputs[1])));
        }
        int roads = Integer.parseInt(br.readLine());
        for(int i=0;i<roads;i++)
        {
            String[] inputs = br.readLine().split(" ");
            AllRoads.add(new Road(inputs[2],
            AllLocations.getLocationAtIndex(Integer.parseInt(inputs[0])),
            AllLocations.getLocationAtIndex(Integer.parseInt(inputs[1])),
            Double.parseDouble(inputs[3])));            
        }
        int routes = Integer.parseInt(br.readLine());
        ArrayList<Route> route = new ArrayList<>();
        for(int i=0;i<routes;i++)
        {
            String[] inputs = br.readLine().split(" ");
            int[] arr = new int[Integer.parseInt(inputs[0])];
            for(int j=0;j<Integer.parseInt(inputs[0]);j++)
                arr[j] = Integer.parseInt(inputs[j+1]);
            route.add(new Route(arr));
        }
        for(int i=0;i<routes;i++)
        {
            if(route.get(i).IsValid())
            {
                System.out.printf("Route %d: Length %.2f, max width %.2f: ", 1+i, route.get(i).length_of_route(), route.get(i).getMaxWidth());
                System.out.println(route.get(i).getRoute());
            }
            else
            {
                System.out.println("Route "+ (i+1) +": "+route.get(i).getRoute());
            }
        }
    }
}