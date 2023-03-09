package org.codej.rest.design_pattern.데코레이터패턴.decoPattern;

public class Generade extends WeaponAccessory{

    public Generade(Weapon rifle) {
        super(rifle);
    }

    @Override
    public void aim_and_fire() {
        super.aim_and_fire(); //부모 메서드를 호출함으로써 자신을 감싸고 있는 장식자의 메서드를 호출
        generade_fire();
    }
    public void generade_fire(){
        System.out.println("유탄발사");
    }
}
