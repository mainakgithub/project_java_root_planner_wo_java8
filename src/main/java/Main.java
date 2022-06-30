import java.io.*;
//import java.nio.charset.StandardCharsets;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        File f = new File("C:\\Java_git_push\\java_root_planner_wo_java8\\src\\main\\java\\routes.csv");

        operations operation=new operations();
        routesD[] obj=operation.getFlightDetails(f);
        System.out.format("%15s      %15s       %15s          %15s       %15s\n", "From City", "To City", "Distance","Time", "Price");

        for(routesD x :obj)
        {
            System.out.println(x);
        }
        System.out.println("enter from city");
        String fromcity=scan.nextLine();

        operation.showDirectFlights(obj , fromcity);

        System.out.println("enter   tocity");

        String tocity=scan.nextLine();

        operation.showAllConnections(obj ,fromcity,tocity);

        // operation.sortDirectFlights(obj , fromcity);



    }
}




