package org.codej.rest.design_pattern.데코레이터패턴.nonDecoPattern;

public class ScopedBaseWeapon implements Weapon{
    @Override
    public void aimAndFire() {
        aiming();
        System.out.println("조준하여 총알 발사");
    }
    public void aiming(){
        System.out.println("조준 중");
    }
}
