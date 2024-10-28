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
    boolean movingEast = true;
    void run() {
        while(!treeFront()){
            placeCheckerBoardRow();
            reposition();
        }
    }
    void placeCheckerBoardRow(){
        boolean placeLeaf = true;
        while(!treeFront()){
            if(placeLeaf){
                putLeaf();
            }
            placeLeaf = !placeLeaf;
            move();
        }
    }
    void reposition(){
        if(movingEast){
            if(!treeLeft()){
                turnLeft();
                move();
                turnLeft();
            }
        }else{
            if(!treeRight()){
                turnRight();
                move();
                turnRight();
            }
        }
        movingEast = !movingEast;
    }
}