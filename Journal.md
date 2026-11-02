## Phase 3

In this phase I added a SleepingState without changing the other state classes. I only had to create the new class and update SentinelGuard to start in that state. From what I understand, this follows the Open-Closed Principle because we can add new behavior without having to rewrite the existing states.