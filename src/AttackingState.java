
public class AttackingState implements GuardState {

    private SentinelGuard guard;

    public AttackingState(SentinelGuard guard) {
        this.guard = guard;
    }

    public void hearNoise() {
        System.out.println("Guard is too busy fighting.");
    }

    public void seeEnemy() {
        System.out.println("Guard spotted an enemy and is attacking!");
    }

    public void loseTarget() {
        System.out.println("Guard is searching for the enemy.");
        guard.setState(new PatrollingState(guard));
    }
}
