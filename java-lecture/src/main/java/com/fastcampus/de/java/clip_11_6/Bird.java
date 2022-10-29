package com.fastcampus.de.java.clip_11_6;

public abstract class Bird {
    private int x,y,z;

    void fly(int x, int y, int z){
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;
        this.z = z;

        if (flyable(z)){
            this.z = z;
        } else{
            System.out.println(z + " 그 높이로는 날 수 없습니다.");
        }
        printLocation();
    }

    public void printLocation(){
        System.out.println("현재 위치 (" + x + ',' + y + ',' + z + ')');
    }

    abstract boolean flyable(int z);

}
