/* PERMITTED COMMANDS
   move, turnLeft, turnRight, treeLeft, treeRight, treeFront, onLeaf, putLeaf, removeLeaf, mushroomFront
   JAVA
   if, while, for
*/
   
class MyClara extends Clara { 
    /**
     * In the 'run()' method you can write your program for Clara 
     */
    
    int cakeHeight = 0;
    int cakeWidth = 0;
    void run() {
        while (cakeHeight > 11 || cakeHeight < 1) {
            cakeHeight = readInt("Height of cake: ");
        }
        while (cakeWidth > 18 || cakeWidth < 1) {
            cakeWidth = readInt("Width of cake: ");
        }
        while(cakeHeight>0){
            cakeTime();
            turnLeft();
            turnLeft();
            cakeTime();
            turnRight();
            move();
            turnRight();
            cakeHeight = cakeHeight-1;
        }
        for(int i=1;i<=cakeWidth/2;i++){
            move();
            turnLeft();
            candleTime();
            turnRight();
            turnRight();
            candleTime();
            turnLeft();
            move();
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
    void candleTime(){
        for(int j=1;j<=3;j++){
            if(!onLeaf()){
                putLeaf();
            }
            move();
        }
    }
}