public class TennisBallFactory implements BallFactory{
    public TennisBallFactory(){
    }
    @Override
    public Ball createBall() {
        return new TennisBall();
    }
}
