
public class Main {
    public static void main(String[] args) {

        SentinelGuard guard = new SentinelGuard();

        System.out.println("Starting: Sleeping");

        guard.seeEnemy();
        guard.loseTarget();
        guard.hearNoise();
        guard.seeEnemy();
        guard.loseTarget();
        guard.hearNoise();

        // Test Idle edge case
        System.out.println("\n=== IDLE TEST ===");
        SentinelGuard idleGuard = new SentinelGuard();
        idleGuard.setState(new IdleState(idleGuard));
        idleGuard.loseTarget();
    }
}
