package org.codej.rest.design_pattern.데코레이터패턴.nonDecoPattern;

public class BaseWeapon implements Weapon{
    @Override
    public void aimAndFire() {
        System.out.println("총알 발사");
    }
}
