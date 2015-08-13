package com.oopwebinar;

/**
 * Created by dima on 13.08.2015.
 */
public class LivingAppartment {
    //в квартире много жильцов - это пример аггрегации???
    //аггрегация предпочтительней наследования
    private Owner[] owners;
    private int number;

    //композиция - более специфический случай аггрегации
    //зависимые объекты живут и умирают вместе


    public LivingAppartment(int number, int capacity) {
        //this.owners = owners;
        this.number = number;
        this.owners = new Owner[capacity];
    }

    public void addOwner(Owner owner){

        owners[getFreeRoomIndex()] = owner;
        //todo
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /*
    public void getFreeApp() {

        //toDO
    }
*/

    public int getFreeRoomIndex(){
        for(int index = 0; index < owners.length; index++){
            if(owners[index] == null){
                return index;
            }
        }
        throw new RuntimeException("No free rooms !!!");
    }

}
