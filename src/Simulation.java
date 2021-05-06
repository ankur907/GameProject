public class Simulation {

    public static void main(String args[]){

        Team team1=new Team();
        Team team2=new Team();
        Team team3=new Team();
        Team team4=new Team();
        Team team5=new Team();

            while(((team1.getxCord() !=0) && (team1.getyCord() !=0)) || ((team2.getxCord() !=0) && (team2.getyCord() !=0)) ){
                if(team1.getxCord()>0){
                    team1.minusXCord();
                    System.out.println("team1 x " + team1.getxCord());
                }
                if(team1.getyCord()>0){
                    team1.minusYCord();
                    System.out.println("team1 y " +team1.getyCord());
                }
                if(team2.getxCord()>0){
                    team2.minusXCord();
                    System.out.println("team2 x "+team2.getxCord());
                }
                if(team2.getyCord()>0){
                    team2.minusYCord();
                    System.out.println("team2 y " +team2.getyCord());
                }

                if(  isIntersect(team1.getxCord(), team1.getyCord(), team2.getxCord(), team2.getyCord(), team1.getRadius(), team2.getRadius()) >=0){
                    System.out.println("Circles intersecting");
                }

                if(team1.getxCord() ==0 && team1.getyCord() ==0) {
                    System.out.println("team1 has reached to 0,0");
                }

                if(team2.getxCord() ==0 && team2.getyCord() ==0) {
                    System.out.println("team2 has reached to 0,0");

                }

            }
    }

    public static int isIntersect(int x1, int y1, int x2,
                           int y2, int r1, int r2)
    {

        int distSq = (x1 - x2) * (x1 - x2) +
                (y1 - y2) * (y1 - y2);
        int radSumSq = (r1 + r2) * (r1 + r2);
        if (distSq == radSumSq)
            return 1;
        else if (distSq > radSumSq)
            return -1;
        else
            return 0;
    }
}
