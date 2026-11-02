

public class Main {
    public static void main(String[] args) {

        SentinelGuard guard = new SentinelGuard();

        guard.seeEnemy();    // Sleeping - ignores enemy
        guard.loseTarget();  // Sleeping - ignores target
        guard.hearNoise();   // Sleeping to Patrolling
        guard.seeEnemy();    // Patrolling to Attacking
        guard.loseTarget();  // Attacking to Patrolling
    }
}

