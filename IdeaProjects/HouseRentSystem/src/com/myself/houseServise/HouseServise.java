package com.myself.houseServise;
import com.myself.houseModel.House;
public class HouseServise {
    private House[] houses;
    private int currentNum;

    public int getCurrentNum() {
        return currentNum;
    }

    public HouseServise(int length){
        houses = new House[length];
        houses[0] = new House("1","肥贤","135","天河区",600,"未出租");
        currentNum = 1;
    }

    public House[] houseList(){
        return houses;
    }

    public House findById(String id){
        for (int i = 0; i < houses.length; i++) {
            if(houses[i]!=null && houses[i].getId().equals(id)){
                return houses[i];
            }
        }
        return null;
    }
    public boolean add(House h){
        if(currentNum == houses.length) return false;

        h.setId(++currentNum + "");
        houses[currentNum-1] = h;
        return true;

    }

    public boolean delete(String id){
        boolean res = false;
        House[] newHouse = new House[houses.length];
        int currentI = 0;
        for (int i = 0; i < newHouse.length; i++,currentI++) {
            if(houses[i].getId().equals(id)){
                newHouse[i] = ++currentI >= houses.length ? null : houses[currentI];
                res = true;
                currentNum--;
            }else{
                newHouse[i] = currentI >= houses.length ? null: houses[currentI];
            }
        }
//        重置id
        for (int i = 0; i < newHouse.length; i++) {
            if(newHouse[i]==null) break;
            newHouse[i].setId(i+1+"");
        }
        houses = newHouse;
        return res;
    }

}
