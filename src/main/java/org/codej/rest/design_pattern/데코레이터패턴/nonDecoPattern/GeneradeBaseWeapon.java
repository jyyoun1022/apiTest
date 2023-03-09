package org.codej.rest.design_pattern.데코레이터패턴.nonDecoPattern;

public class GeneradeBaseWeapon implements Weapon{
    @Override
    public void aimAndFire() {
        System.out.println("총알 발사");
    }
    public void generadeFire(){
        System.out.println("유탄 발사");
    }
}
