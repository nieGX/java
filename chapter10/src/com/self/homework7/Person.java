package com.self.homework7;

public class Person {
    private String name;
    private IVehicles Vehicle;

    public Person(String name, IVehicles vehicle) {
        this.name = name;
        Vehicle = vehicle;
    }

    public void road(){
        System.out.println("一般路况：");
        if(!(Vehicle instanceof Horse)){
            Vehicle = VehicleFactory.getHorse();
        }
        Vehicle.work();
    }

    public void passRiver(){
        System.out.println("过通天河：");
        if(!(Vehicle instanceof Boat)){
            Vehicle = VehicleFactory.getBoat();
        }
        Vehicle.work();
    }
    public void passFireMountain(){
        System.out.println("路过火焰山：");
        if(!(Vehicle instanceof Plane)){
            Vehicle = VehicleFactory.getPlane();
        }
        Vehicle.work();
    }
}
