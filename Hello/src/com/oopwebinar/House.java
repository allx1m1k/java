package com.oopwebinar;

/**
 * Created by dima on 13.08.2015.
 */
public class House {

    //инкапсулируем атрибуты
    private Floor[] floors; //это массив экземпляров Floor
    private NumberGenerator numbers;

    //дефолтный конструктор есть по умолчанию
    //public House {
    //    do nothing
    // }

    public House (int count){

        floors = new Floor[count];
            for(int i = 0; i< count;i++) {
                floors[i]=new Floor(i);
            }

    }




    public void settle(Owner owner){
        for (Floor floor: floors) {
            LivingAppartment apartmanet = floor.getFreeApp();
                if (apartmanet != null) {
                    apartmanet.addOwner(owner);
                    break;
                }
        }
    }

    @Override
    public String toString() {
        //return "House{" +
        //                "floors=" + Arrays.toString(floors) +
        //                '}';

        String res = "Huose: \n";
        for (Floor flor: floors) {
            res += floors.toString();
        }
        return res;
    }

}
