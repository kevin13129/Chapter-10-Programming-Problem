## Phase 4

Comparing Phase 1 to now, I think the State Pattern would be easier to maintain in a larger project. With the enum approach, I had to check the current state in different methods. Now each state handles its own behavior, so adding new states is easier. It did take more classes to set up, but I can see how that would help keep things organized as the project grows.