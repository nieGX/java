package com.myself.houseView;
import com.myself.houseServise.HouseServise;
import com.myself.houseModel.House;
import com.myself.utils.Utils;

import javax.rmi.CORBA.Util;

/**
 * 房屋出租系统主界面
 * */
public class HouseView {
    public String splitSymbol = "===============";
    private String meanCode;
    private Boolean loop = true;

    private HouseServise houseServise = new HouseServise(2);
    public void StartMenu(){
        do{
            System.out.println(splitSymbol + "房屋出租系统菜单" + splitSymbol);
            System.out.println("\t\t\t\t"+"1 新 增 房 源");
            System.out.println("\t\t\t\t"+"2 查 找 房 屋");
            System.out.println("\t\t\t\t"+"3 删 除 房 屋 信 息");
            System.out.println("\t\t\t\t"+"4 修 改 房 屋 信 息");
            System.out.println("\t\t\t\t"+"5 房 屋 列 表");
            System.out.println("\t\t\t\t"+"6 退      出");
            System.out.println();
            System.out.print("请输入您要选择的菜单代码(1-6)：");

            meanCode = Utils.readString();

            switch (meanCode){
                case "1":
//                    System.out.println("1");
                    addHouse();
                    break;
                case "2":
//                    System.out.println("2");
                    findHouse();
                    break;
                case "3":
//                    System.out.println("3");
                    delHouse();
                    break;
                case "4":
//                    System.out.println("4");
                    updateHouse();
                    break;
                case "5":
//                    System.out.println("5");
                    getHouseList();
                    break;
                case "6":
                    System.out.println("确认退出房屋出租系统?(Y/N)：");
                    if(Utils.readStringFirst()!='Y') break;

                    setLoop(false);
                    System.out.println();
                    System.out.println("您已退出房屋出租系统");
                    System.out.println();
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    System.out.println();
            }
        }while (loop);
    }

    public void getHouseList(){
        System.out.println(splitSymbol + splitSymbol +"房屋列表"+ splitSymbol + splitSymbol);
        System.out.println("编号\t\t"+"屋主\t\t"+"电话\t\t"+"地址\t\t"+"租金\t\t"+"状态(已出租/未出租)");
        House[] list = houseServise.houseList();
        for (int i = 0; i < list.length; i++) {
            if(list[i]==null) break;
            System.out.println(list[i]);

        }
        System.out.println(splitSymbol + splitSymbol+"房屋列表结束" + splitSymbol+ splitSymbol + '\n');
    }

    public void findHouse(){
        System.out.println(splitSymbol + splitSymbol +"查找房屋"+ splitSymbol + splitSymbol);
        System.out.print("请输入要查找的房屋ID：");
        String findId = Utils.readString();
        House res = houseServise.findById(findId);
        if(res==null){
            System.out.println("未查找到此房屋信息");
        }else{
            System.out.println(res);
        }
    }

    public void addHouse(){
        System.out.println(splitSymbol + splitSymbol +"新增房源"+ splitSymbol + splitSymbol);
        System.out.print("请输入屋主：");
        String name = Utils.readString();
        System.out.print("请输入电话：");
        String mobile = Utils.readString();
        System.out.print("请输入地址：");
        String address = Utils.readString();
        System.out.print("请输入状态：");
        String status = Utils.readString();
        System.out.print("请输入月租金：");
        int rent = Utils.readInt();
        House h = new House("null",name,mobile,address,rent,status);
        if(houseServise.add(h)){
            System.out.println("新增房源成功");
        }else{
            System.out.println("列表已满，新增失败");
        }
    }

    public void updateHouse(){
        System.out.println(splitSymbol + splitSymbol +"修改房屋信息"+ splitSymbol + splitSymbol);
        System.out.print("请输入要修改的房屋ID(-1退出)：");
        String findId = Utils.readString();
        if(findId.equals("-1")){
            System.out.println(splitSymbol + splitSymbol +"放弃修改房屋信息"+ splitSymbol + splitSymbol);
            return;
        }

        House h = houseServise.findById(findId);
        if(h==null){
            System.out.println(splitSymbol + splitSymbol +"要修改的房屋信息不存在"+ splitSymbol + splitSymbol);
            return;
        }
        // 读取并丢弃缓冲区中的换行符
        Utils.readStringLine();

        System.out.println("请输入要修改的内容，回车键表示跳过此项修改");
        System.out.print("屋主("+h.getOwner()+")：");
        String owner = Utils.readStringLine();
        if(!owner.equals("")){
            h.setOwner(owner);
        }
        System.out.print("电话("+h.getMobile()+")：");
        String mobile = Utils.readStringLine();
        if(!mobile.equals("")){
            h.setMobile(mobile);
        }
        System.out.print("地址("+h.getAddress()+")：");
        String address = Utils.readStringLine();
        if(!address.equals("")){
            h.setAddress(address);
        }
        System.out.print("月租("+h.getRent()+")：");
        String rent = Utils.readStringLine();
        if(!rent.equals("")){
            h.setRent(Integer.parseInt(rent));
        }
        System.out.print("状态("+h.getStatus()+")：");
        String status = Utils.readStringLine();
        if(!status.equals("")){
            h.setStatus(status);
        }

        System.out.println(splitSymbol + splitSymbol +"修改房屋信息成功"+ splitSymbol + splitSymbol);
    }

    public void delHouse(){
        if(houseServise.getCurrentNum()==1){
            System.out.println("删除失败，必须保留至少一条房屋信息");
            return;
        }
        System.out.println(splitSymbol + splitSymbol +"删除房屋信息"+ splitSymbol + splitSymbol);
        System.out.print("请输入要删除的房屋ID(-1退出)：");
        int houseId = Utils.readInt();
        if(houseId==-1) return;

        System.out.print("您确认要删除这条房屋信息吗?(y/n):");
        char confirm = Utils.readStringFirst();
        if(confirm != 'y') return;

        if(houseServise.delete(houseId+"")){
            System.out.println("删除房屋信息成功");
        }else{
            System.out.println("删除房屋信息失败，未找到此ID信息");
        }

    }

    public void setLoop(Boolean loop) {
        this.loop = loop;
    }
}
