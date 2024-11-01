/* PERMITTED COMMANDS
   move, turnLeft, turnRight, treeLeft, treeRight, treeFront, onLeaf, putLeaf, removeLeaf, mushroomFront
   JAVA
   if, while, for
*/

class MyClara extends Clara {
    /**
     * In the 'run()' method you can write your program for Clara 
     */
    void run() {
        // TODO: Write your code below
        while (!treeFront()) {
            move();
            while (!treeRight()) {
                turnRight();
                move();
            }
            if (onLeaf()) {
                shortCut();

            }
            while (treeRight() && treeLeft()) {
                putLeaf();
                shortCut();

            }
        }
    }
    void shortCut() {
        turnLeft();
        turnLeft();
        move();
        turnRight();
    }

}