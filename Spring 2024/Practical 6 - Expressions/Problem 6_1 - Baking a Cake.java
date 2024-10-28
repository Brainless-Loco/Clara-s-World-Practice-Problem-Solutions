/* PERMITTED COMMANDS
   move, turnLeft, turnRight, treeLeft, treeRight, treeFront, onLeaf, putLeaf, removeLeaf, mushroomFront
   JAVA
   if, while, for
*/
   
class MyClara extends Clara { 
    /**
     * In the 'run()' method you can write your program for Clara 
     */
    int cakeWidth=0;
    int cakeHeight=0;
    boolean movingEast = true;
    void run() {
        // TODO: Write your code below
        while(cakeWidth<1 || cakeWidth>18){
            cakeWidth = readInt("Width of the cake: ");
        }
        while(cakeHeight<1 || cakeHeight>13){
            cakeHeight = readInt("Height of the cake: ");
        }
        while(cakeHeight>0){
            cakeTime();
            reposition();
            cakeHeight = cakeHeight-1;
        }
    }
    void cakeTime(){
        for(int i=1;i<=cakeWidth;i++){
            if(!onLeaf()){
                putLeaf();
            }
            move();
        }
    }
    void reposition(){
        if(movingEast){
            turnLeft();
            move();
            turnLeft();
        }
        else{
            turnRight();
            move();
            turnRight();
        }
        move();
        movingEast = !movingEast;
    }
}