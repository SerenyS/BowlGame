import org.w3c.dom.ls.LSOutput;

public class Player {
    private static int score = 0;
    public static int Pins = 10;

    public static void RollOne() {
        int pinsKnockedDownROne = (int) (Math.random() * (11));

        int pinsStanding = Pins - pinsKnockedDownROne;
        if (pinsStanding == 0) {
            setScore(pinsKnockedDownROne);
            System.out.println("Strike");
        } else {
            RollTwo(pinsStanding);
        }
    }

    public static void RollTwo(int pinsStanding) {
        int pinsKnockedDownRTwo = (int) (Math.random() * (pinsStanding));

        int pinsStanding2 = pinsStanding - pinsKnockedDownRTwo;
        if (pinsStanding2 == 0) {
            setScore((10 - pinsStanding) + pinsKnockedDownRTwo);
            System.out.println("Spare");
        } else {
            setScore((10 - pinsStanding) + pinsKnockedDownRTwo);
        }
    }


    public static int getScore() {

        //System.out.println(score);
        return score;
    }

    public static void setScore(int score) {
        Player.score = score;
    }
}
