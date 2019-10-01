package com.cicleClass;

import com.CicleInterface.Cicle;
import java.lang.String;


public class CicleBike implements Cicle {

    public void name(String val_name){
        System.out.println("Name "+val_name);
    };
    public void speed(int val_speed){
        System.out.println("Speed "+val_speed);
    };
    public void wheels(int val_wheels){
        System.out.println("wheel "+val_wheels);
    };

}
