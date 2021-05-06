public class Player {

    private int playerHealth;
    private int playerLevel;
    private int playerScore;
    private Weapon defaultWeapon;
    private boolean isDown=false;
    Weapon weapon=new Weapon();

    public Player() {
        this.playerHealth = 100;
        this.playerLevel = 1;
        this.playerScore = 0;
        this.defaultWeapon=weapon.getWeapon1();
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public int updatePlayerLevel(){
        return this.playerLevel++;
    }

    public int updatePlayerHealth(){
        updatePlayerLevel();
        playerHealth += updatePlayerLevel()*10;
        return playerHealth;
    }

    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public void playerHealthDamage(Player OppositePlayer){
        OppositePlayer.playerHealth -=weapon.getWeaponStrength();
    }

    public boolean isDown(){
        if(this.playerHealth<=0) return isDown = true;
        else return false;
    }

    public void updateWeapon(){

    }

}
