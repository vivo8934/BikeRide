package bicycles.rides;
import bicycles.Bicycle;
import bicycles.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    public int bikeNo;
    private BicycleType bicycleType;

    { bikeNo = 0; }


    public FunRide(int bikeNo){ this.bikeNo = bikeNo; }
    private static List<Bicycle> bicycles = new ArrayList<>();


    public void accept(Bicycle bicycle){
            if (!bicycles.contains(bicycle) && bicycles.size() < bikeNo){
            bicycles.add(bicycle);
        }
        else {System.out.println("rejected");}
        }



     public int getCountForType(BicycleType bicycleType){
         int myCount = 0;
         for (Bicycle var : bicycles) {
            // System.out.println(var.getBicycleType() == bicycleType);
             if (var.getBicycleType() == bicycleType) {
                 myCount += 1;
             }
         }
         return myCount;

     }

     public int getEnteredCount(){
        return bicycles.size();

     }
}


