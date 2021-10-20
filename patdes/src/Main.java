public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        BallFactory factory = new FootballBallFactory();
        Ball ball = factory.createBall();
        ball.play();

        BallFactory factory2 = new BasketballBallFactory();
        Ball Ball = factory2.createBall();
        Ball.play();

        BallFactory factory3 = new TennisBallFactory();
        Ball tennisBall = factory3.createBall();
        tennisBall.play();
    }
}
