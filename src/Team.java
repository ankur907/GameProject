import jdk.jshell.execution.Util;

public class Team {

    private Player[] players=new Player[Utilities.getRandomInt(50,100)];
    Player player=new Player();
    private int radius;
    private int xCord;
    private int yCord;
    boolean isDefeated=false;

    public Team(){
        this.radius = 10* players.length;
        this.xCord = Utilities.getRandomInt(10, 20);
        this.yCord = Utilities.getRandomInt(10,20);
    }

    public Player[] getPlayers() {
        return players;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getxCord() {
        return xCord;
    }

    public void setxCord(int xCord) {
        this.xCord = xCord;
    }

    public int getyCord() {
        return yCord;
    }

    public void setyCord(int yCord) {
        this.yCord = yCord;
    }

    public int minusXCord(){
      return this.xCord--;
    }

    public int minusYCord(){
       return this.yCord--;
    }

    public void attackPlayer(Player OppositePlayer){
            while(!OppositePlayer.isDown()){
                player.playerHealthDamage(OppositePlayer);
            }
           player.updatePlayerHealth();
    }




}

