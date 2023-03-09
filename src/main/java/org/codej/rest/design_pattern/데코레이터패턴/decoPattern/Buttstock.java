package org.codej.rest.design_pattern.데코레이터패턴.decoPattern;

public class Buttstock extends WeaponAccessory{

    public Buttstock(Weapon rifle) {
        super(rifle);
    }

    @Override
    public void aim_and_fire() {
        holding();
        super.aim_and_fire();
    }
    public void holding(){
        System.out.println("견착 완료");
    }
}
