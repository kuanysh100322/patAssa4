public class FootballBallFactory implements BallFactory{
    public FootballBallFactory(){
    }
    @Override
    public Ball createBall() {
        return new FootballBall();
    }
}
