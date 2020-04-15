public class GameTest
/**
 * The Game has 10 Frames
 * In each Frame each player gets two rolls
 * All pins down first roll = Strike
 * All pins down second roll = Spare
 * Constant pins
 *
 *TDD
 */

{
    // static void main(String[] args) {
    //  int playerTwoScore =0;
    //int PlayerOne = 0;
    //int PlayerTwo = 1;
    //int NumberOfPins = 10;
    //int NumberOfRolls = 2;
    //for(int i =0; i <11; i++){ // 10 frames

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


