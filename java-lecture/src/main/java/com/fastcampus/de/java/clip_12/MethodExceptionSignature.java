package com.fastcampus.de.java.clip_12;

public class MethodExceptionSignature {
    static void methodThrowsException() throws Exception {


    }
    static void methodThrowsRuntimesException() throws RuntimeException {

    }

    public static void main(String[] args) {
        methodThrowsRuntimesException();
        try {
            methodThrowsException();
        } catch (Exception e) {
            throw new RuntimeException(e) ;
        }
    }

}
