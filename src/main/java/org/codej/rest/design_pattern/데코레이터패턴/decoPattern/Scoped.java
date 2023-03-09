package org.codej.rest.design_pattern.데코레이터패턴.decoPattern;

public class Scoped extends WeaponAccessory{

    public Scoped(Weapon rifle) {
        super(rifle);
    }

    @Override
    public void aim_and_fire() {
        aiming();
        super.aim_and_fire();
    }

    public void aiming(){
        System.out.println("조준 중..");
    }
}
