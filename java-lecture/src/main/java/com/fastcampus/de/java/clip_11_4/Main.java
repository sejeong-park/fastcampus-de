package com.fastcampus.de.java.clip_11_4;

public class Main {
    static class Animal {
        String name;

        Animal(String name){
            this.name = name;
        }

        public void cry(){
            System.out.println(name + " is crying.");
        }
    }
    static class Dog extends Animal {

        String breed;

        Dog(String name, String breed) {
            super(name);
            this.breed = breed;
        }

        public void bark(){
            System.out.println(name + "(" + breed + ")" + "is barking");
        }
    }

    static class Giraffe extends Animal {

        Giraffe(String name){
            super(name);
        }
        @Override
        public void cry(){
            System.out.println(name + " cannot cry.");
        }

    }


    public static void main(String[] args) {
        Dog dog = new Dog("코코", "허스키");
        dog.cry();
        dog.bark();

        Animal animal  = dog; // Type 선언을 Animal로 해서 Bark를 상속 받을 수 없음
        animal.cry();

        Animal giraffe = new Giraffe("기린이");
        giraffe.cry();

    }

}
