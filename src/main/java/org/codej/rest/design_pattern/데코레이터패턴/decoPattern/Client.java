package org.codej.rest.design_pattern.데코레이터패턴.decoPattern;

public class Client {
    public static void main(String[] args) {
        // 1. 유탄 발사기가 달린총
        Weapon generade_rifle = new Generade(new BaseWeapon());
        generade_rifle.aim_and_fire();
        System.out.println();
        //2. 개머리판을 장착하고 스코프를 달은 총
        Weapon buttstock_scoped_rifle = new Buttstock(new Scoped(new BaseWeapon()));
        buttstock_scoped_rifle.aim_and_fire();
        System.out.println();

        //3. 유탄 발사기 + 개머리판 + 스코프가 달린총
        Weapon buttstock_socped_generade_rifle = new Buttstock(new Scoped(new Generade(new BaseWeapon())));
        buttstock_socped_generade_rifle.aim_and_fire();
    }
}
