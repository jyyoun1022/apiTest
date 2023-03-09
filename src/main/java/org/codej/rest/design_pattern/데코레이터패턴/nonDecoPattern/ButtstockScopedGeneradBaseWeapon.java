package org.codej.rest.design_pattern.데코레이터패턴.nonDecoPattern;

public class ButtstockScopedGeneradBaseWeapon implements Weapon{

    @Override
    public void aimAndFire() {
        holding();
        aiming();
        System.out.println("조준하여 총알 발사");
    }
    public void generadeFire(){
        System.out.println("유탄 발사");
    }
    public void aiming(){
        System.out.println("조준중");
    }
    public void holding(){
        System.out.println("견착 완료");
    }
}
