## Phase 2

In this phase I replaced the enum and if statements with separate state classes. From what I understand, SentinelGuard is now the Context, meaning it holds the current state and passes the commands to it. Each state handles its own behavior and decides when to switch states. I think this is cleaner because we don't have to keep checking the enum every time something happens.