package com.myself.DynamicBinding;

public class Father {
    public String myself = "爸爸";
    public int num=10;
    public String str="Father";
    public int getNum(){
        return this.num;
    }
    public String getStr(){
        System.out.println("Father的this："+this.hashCode());
        return this.str;
    }
    public String getSelf(){
        return this.myself;
    }
}
