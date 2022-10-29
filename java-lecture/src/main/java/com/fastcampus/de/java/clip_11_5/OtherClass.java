package com.fastcampus.de.java.clip_11_5;

public class OtherClass {
    public void call(){
        AccessModifierTest accessModifierTest = new AccessModifierTest();
        accessModifierTest.messageDefault();
        //accessModifierTest.messageInside(); // 호출 되지 않음
        accessModifierTest.messageProtected();
        accessModifierTest.messageOutSide();
    }

    public static void main(String[] args) {
        OtherClass otherclass = new OtherClass();
        otherclass.call();
    }
}
