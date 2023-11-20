package com.myself.duotaiParams;

public class Test {
    public void showEmpAnnual(Employee e){
        System.out.println(e.getName()+" 的年薪为 "+e.getAnnual());
    }
    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }
    }

    public static void main(String[] args) {
        Worker worker = new Worker("肥贤", 3000);
        Manager manager = new Manager("马云", 1, 3000000);
        Test test = new Test();
        test.showEmpAnnual(worker);
        test.showEmpAnnual(manager);
        test.testWork(worker);
        test.testWork(manager);

    }
}

/**
 * 定义员工类Employee，包含姓名和月工资[private]，以及计算年工资getAnnual的方法。
 * 普通员工和经理继承了员工类，经理类多了奖金bonus属性和管理manage方法，普通员工类多了work方法，普通员工和经理类要求分别重写getAnnual方法
 * 测试类中添加一个方法showEmpAnnal(Employee e)，实现获取任何员工对象的年工资,并在main方法中调用该方法 [e.getAnnual0]
 * 测试类中添加一个方法，testWork,如果是普通员工，则调用work方法，如果是经理，则调用manage方法
 * */


