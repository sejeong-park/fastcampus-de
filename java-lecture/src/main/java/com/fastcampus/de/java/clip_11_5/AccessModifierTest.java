package com.fastcampus.de.java.clip_11_5;

public class AccessModifierTest {

    private void messageInside(){
        System.out.println("This is private modifier");
    }
    void messageDefault(){
        messageInside();
        System.out.println("This is default(package-private) modifier");
    }
    protected void messageProtected(){
        messageInside();
        System.out.println("This is protected modifier");
    }
    public void messageOutSide(){
        messageInside();
        System.out.println("This is public modifier");
    }

}
