public class Weapon {
    private int weaponStrength;
    private Weapon weapon1;
    private Weapon weapon2;
    private Weapon weapon3;
    private Weapon weapon4;
    private Weapon weapon5;
    private Weapon weapon6;
    private Weapon weapon7;
    private Weapon weapon8;
    private Weapon weapon9;
    private Weapon weapon10;

    public Weapon(){

    }
    public Weapon(int weaponStrength) {
        this.weaponStrength = weaponStrength;
        weapon1=new Weapon(10);
        weapon2=new Weapon(20);
        weapon3=new Weapon(30);
        weapon4=new Weapon(40);
        weapon5=new Weapon(50);
        weapon6=new Weapon(60);
        weapon7=new Weapon(70);
        weapon8=new Weapon(80);
        weapon9=new Weapon(90);
        weapon10=new Weapon(100);
    }

    public int getWeaponStrength() {
        return weaponStrength;
    }

    public void setWeaponStrength(int weaponStrength) {
        this.weaponStrength = weaponStrength;
    }

    public Weapon getWeapon1() {
        return weapon1;
    }




}
