import java.io.*;
import java.util.*;

import static java.lang.String.valueOf;

public class operations {
    public routesD[] getFlightDetails(File f) {
        int count = 0;
        try (
                BufferedReader br = new BufferedReader(new FileReader(f))) {
            while (br.readLine() != null) {
                count++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       // System.out.println(count);
        routesD[] obj = new routesD[count];
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            int i = 0;
            String temp;
            while ((temp = br.readLine()) != null) {
                String[] tempArray = temp.split(",");

                int fliDis = Integer.parseInt(tempArray[2].trim());

                obj[i] = new routesD(tempArray[0].trim(), tempArray[1].trim(), fliDis, tempArray[3].trim(), tempArray[4].trim());
                i++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // for (routesD x : obj)
        //     System.out.println(x);
        return obj;
    }

    public void showDirectFlights(routesD[] obj, String fromcity) {
        Scanner scan = new Scanner(System.in);
        int c=0;
        for(int i=0;i<obj.length;i++)
        {
            if(obj[i].getFrom().equals(fromcity))
            {
                c++;
            }
        }
        routesD[] directFlights = new routesD[c];
        int i = 0;
        for (routesD x : obj) {
            if (fromcity.equals(x.getFrom()))

            {
                System.out.println(x);

                directFlights[i] = x;

                i++;
            }
        }
        System.out.println("From your selected city "+directFlights.length);
        sortDirectFlights(directFlights);



    }






    public  static  void sortDirectFlights( routesD[] directFlights) {





        for(int i=1;i<directFlights.length;i++){
            for(int j=0;j<directFlights.length-i;j++){
                if(directFlights[j].getTo().compareTo(directFlights[j+1].getTo())>0){


                    routesD temp=directFlights[j];
                    directFlights[j]=directFlights[j+1];
                    directFlights[j+1]=temp;

                }

            }
        }
        System.out.println();
        for(int i=0;i<directFlights.length;i++)
            System.out.println(directFlights[i]);

    }

    void showAllConnections(routesD[] obj, String fromcity, String tocity){
        // for(routesD x:obj)
        System.out.println("the direct flights");
        System.out.println("*****************************");
        for(int i=0;i<obj.length;i++)
        {
            if(fromcity.equals(obj[i].getFrom())&&tocity.equals(obj[i].getTo()))
            {
                System.out.println(obj[i]);
            }

        }
        System.out.println("*****************************");
        System.out.println("connecting flights");


        int count=0;
        for(int i=0;i<obj.length;i++)
        {if(fromcity.equals(obj[i].getFrom()))
        {
            count++;
        }
        }
        routesD[] temp = new routesD[count];
        //String [] temp=new String[count];
        //for(int m=0;m< temp.length;m++)
        int t=0;
        for(int i=0;i<obj.length;i++){
            if(fromcity.equals(obj[i].getFrom()))
            {

                temp[t]=obj[i];
                t++;

            }
        }



        for(int i=0;i< temp.length;i++)
            for(int j=0;j<obj.length;j++)
            {
                if(temp[i].getTo().equals(obj[j].getFrom())&&obj[j].getTo().equals(tocity)){

                    System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*");
                    if(temp[i].getTo().equals(obj[j].getFrom())){System.out.println(temp[i]);
                    }
                    for(int n=0;n<obj.length;n++) {
                        if (fromcity.equals(obj[j].getFrom()))
                        {
                            System.out.println(obj[n]);
                        }

                    }

                    System.out.println(obj[j]);
                }
            }


    }




}
