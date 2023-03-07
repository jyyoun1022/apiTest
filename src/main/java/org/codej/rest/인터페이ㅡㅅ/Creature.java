package org.codej.rest.인터페이ㅡㅅ;

public abstract class Creature {//생명체
    // 추상클래스
    // 동물,물고기
    //extends (확장,연장) 상속받은
    int age;


}
abstract class Animal extends Creature{
}
abstract class Fish extends Creature {

}
class Plant extends Creature{

}
class Tiger extends Animal implements Swimming{
    @Override
    public void swim() {
        System.out.println("네 발로 수영함");
    }
}
class People extends Animal implements Swimming{
    @Override
    public void swim() {
        System.out.println("배우면 수영이 가능함");
    }
}
class Whale extends Fish implements Swimming{
    @Override
    public void swim() {
        System.out.println("그냥함");
    }
}
