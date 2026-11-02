
public class Main {
    public static void main(String[] args) {

        SentinelGuard guard = new SentinelGuard();

        guard.loseTarget();  // Idle
        guard.hearNoise();   // Idle to Patrolling
        guard.hearNoise();   // Already Patrolling
        guard.seeEnemy();    // Patrolling to Attacking
        guard.hearNoise();   // Already Attacking
        guard.seeEnemy();    // Remains Attacking
        guard.loseTarget();  // Attacking to Patrolling
        guard.loseTarget();  // No target
    }
}
