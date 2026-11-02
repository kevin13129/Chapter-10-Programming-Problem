
public class IdleState implements GuardState {

    private SentinelGuard guard;

    public IdleState(SentinelGuard guard) {
        this.guard = guard;
    }

    public void hearNoise() {
        System.out.println("Guard is investigating a noise.");
        guard.setState(new PatrollingState(guard));
    }

    public void seeEnemy() {
        System.out.println("Guard spotted an enemy and is attacking!");
        guard.setState(new AttackingState(guard));
    }

    public void loseTarget() {
        System.out.println("No target to lose.");
    }
}
