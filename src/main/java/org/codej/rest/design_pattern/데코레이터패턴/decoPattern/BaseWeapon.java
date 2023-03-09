package org.codej.rest.design_pattern.데코레이터패턴.decoPattern;

public class BaseWeapon implements Weapon{
    @Override
    public void aim_and_fire() {
        System.out.println("총알발사");
    }
}
