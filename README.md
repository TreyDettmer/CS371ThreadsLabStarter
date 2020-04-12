# CS371ThreadsLabStarter

Checkpoint 5: I added an image with the stack trace. The critical sections are the draw, addStar, removeStar, and setSize methods in the StarAnimation class. These sections involve the modify or iterate over the Vector of stars. The error occurs because as the draw method iterates over the stars, stars are being removed and added by another thread at the same time.
