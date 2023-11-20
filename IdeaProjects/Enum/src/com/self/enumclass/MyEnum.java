package com.self.enumclass;

public class MyEnum {
    public static void main(String[] args) {
        Weekday[] weeks = Weekday.values();
        for (Weekday week : weeks ){
            System.out.println(week.name() + " ：" + week.getDesc());
        }
    }
}

enum Weekday {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");
    private final String desc;

    private Weekday(String desc){
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
