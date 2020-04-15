public class Frames {
    private static Player player;
    private static int totalScored;

    public Frames(Player player) {
    }

    public static void FramesRun() {
        for (int i = 0; i < 11; i++) { // 10 frames
            player.RollOne();
            int FrameScore = player.getScore();
            setTotalScored(totalScored + FrameScore);
        }
    }

    public static int getTotalScored() {
        System.out.println("Total Score " + totalScored);
        return totalScored;
    }

    public static void setTotalScored(int totalScored) {
        Frames.totalScored = totalScored;
    }


}
