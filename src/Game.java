public class Game {

    Player playerOne = new Player();
    Player playerTwo = new Player();
    Frames frameScore1 = new Frames(playerOne);
    Frames frameScore2 = new Frames(playerTwo);

    public void PlayerOne() {
        playerOne.RollOne();
        frameScore1.FramesRun();
        frameScore1.getTotalScored();

    }

    public void PlayerTwo() {
        playerTwo.RollOne();
        frameScore2.FramesRun();
        frameScore2.getTotalScored();
    }
}
