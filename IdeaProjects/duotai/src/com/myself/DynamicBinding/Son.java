package com.myself.DynamicBinding;

public class Son extends Father{
    public String myself = "儿子";
    public int num=100;
    public String str="Son";
    public String getStr(){
        System.out.println("Son的this："+this.hashCode());
        return this.str;
    }
    public int getNum(){
        return this.num;
    }
}
