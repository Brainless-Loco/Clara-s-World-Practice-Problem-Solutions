/* PERMITTED COMMANDS
   move(); turnLeft(); turnRight(); treeLeft(); treeRight(); treeFront(); onLeaf(); putLeaf(); removeLeaf();
   JAVA
   if, else, for, while, do, !, ||, && 
   variables
*/
   
class MyClara extends Clara { 
    /**
     * In the 'run()' method you can write your program for Clara 
     */
    void run() {
        // TODO: Write your code 
        int collectedLeaves = 0;
        int steps = 0;

        while (!treeLeft() || !treeRight() || !treeFront()) {
            if (onLeaf()) {
                removeLeaf();
                collectedLeaves = collectedLeaves+1;
            }
            if (treeFront() ) {
                turnRight();
            }else {
                move();
                steps = steps+1;
            }
        }
        if (onLeaf()) {
            removeLeaf();
            collectedLeaves = collectedLeaves+1;
        }
        System.out.println(collectedLeaves+" leaves, "+steps+" steps");
    }
}