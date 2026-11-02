
public class SentinelGuard {

    enum State {
        IDLE, PATROLLING, ATTACKING
    }

    private State currentState = State.IDLE;

    public void hearNoise() {
        if (currentState == State.IDLE) {
            currentState = State.PATROLLING;
            System.out.println("Guard is investigating a noise.");
        } else if (currentState == State.PATROLLING) {
            System.out.println("Guard is already on alert.");
        } else {
            System.out.println("Guard is too busy fighting.");
        }
    }

    public void seeEnemy() {
        currentState = State.ATTACKING;
        System.out.println("Guard spotted an enemy and is attacking!");
    }

    public void loseTarget() {
        if (currentState == State.ATTACKING) {
            currentState = State.PATROLLING;
            System.out.println("Guard is searching for the enemy.");
        } else {
            System.out.println("No target to lose.");
        }
    }
}
