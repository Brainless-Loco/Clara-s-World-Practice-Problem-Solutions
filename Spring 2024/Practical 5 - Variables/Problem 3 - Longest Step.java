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
        int longestStep = 0;
        int currentStep = 0;
        while(!onLeaf()) {
            if(treeFront()){
                turnLeft();
                move();
                turnRight();
                currentStep = 0;
            }
            else{
                move();
                currentStep = currentStep + 1;
                if(currentStep>longestStep){
                    longestStep = currentStep;
                }
            }
        }
        removeLeaf();
        System.out.println("longest step = "+longestStep);
    }
}