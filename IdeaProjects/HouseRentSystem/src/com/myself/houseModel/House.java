package com.myself.houseModel;

/**
 * 房屋实体类
 * */
public class House {
    private String id; // 房屋编号
    private String owner;// 屋主
    private String mobile;// 屋主电话
    private String address;// 房屋地址
    private int rent;// 月租金
    private String status;// 出租状态 (已出租/未出租)

    public House(String id, String owner, String mobile, String address, int rent, String status) {
        this.id = id;
        this.owner = owner;
        this.mobile = mobile;
        this.address = address;
        this.rent = rent;
        this.status = status;
    }

    @Override
    public String toString() {
        return  id + "\t\t" + owner + "\t\t" + mobile + "\t\t" + address + "\t" + rent + "\t\t" + status ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
