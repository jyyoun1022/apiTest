package org.codej.rest.design_pattern.데코레이터패턴.decoPattern;

public abstract class WeaponAccessory implements Weapon{
    private Weapon rifle;

    public WeaponAccessory(Weapon rifle) {
        this.rifle = rifle;
    }

    @Override
    public void aim_and_fire() {
        rifle.aim_and_fire(); //위임
    }
}
