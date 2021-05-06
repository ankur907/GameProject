public class Utilities {

    public static int getRandomInt(int min,int max)
    {
        return (int) Math.floor((Math.random() * (max - min)) + min);
    }
}
