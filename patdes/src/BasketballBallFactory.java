public class BasketballBallFactory implements BallFactory{
    public BasketballBallFactory(){
    }
    @Override
    public Ball createBall() {
        return new BasketballBall();
    }
}
