
public class SentinelGuard {

    private GuardState currentState;

    public void printState() {
        System.out.println("Current State: " +
                currentState.getClass().getSimpleName());
    }

    public SentinelGuard() {
        currentState = new SleepingState(this);
    }

    public void setState(GuardState state) {
        currentState = state;
    }

    public void hearNoise() {
        currentState.hearNoise();
    }

    public void seeEnemy() {
        currentState.seeEnemy();
    }

    public void loseTarget() {
        currentState.loseTarget();
    }
}
