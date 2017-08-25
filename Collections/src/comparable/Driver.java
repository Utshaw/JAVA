package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        MyCar myCar = new MyCar("123456",99000);
        MyCar myCar1 = new MyCar("789456",1000000);
        MyCar myCar2 = new MyCar("664",55000);

        List<MyCar> myCarList = new ArrayList<MyCar>();
        myCarList.add(myCar);
        myCarList.add(myCar1);
        myCarList.add(myCar2);

        Collections.sort(myCarList);

        for(MyCar singleCar : myCarList)
        {
            System.out.println(singleCar);
        }
    }
}
