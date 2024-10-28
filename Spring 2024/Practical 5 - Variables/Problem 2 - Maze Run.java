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
        // TODO: Write your code below
        boolean leftTurn = true;

        while (!mushroomFront()) {
            
            if(treeFront()) {
                if(leftTurn) {
                    turnLeft();
                }
                else{
                    turnRight();
                }
                leftTurn = true;
            }
            if (onLeaf()) {
                removeLeaf();
                leftTurn = false;
            }else{
                move();
            }
        }
    }
}