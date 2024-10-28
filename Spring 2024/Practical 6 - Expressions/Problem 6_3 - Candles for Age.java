/* PERMITTED COMMANDS
   move, turnLeft, turnRight, treeLeft, treeRight, treeFront, onLeaf, putLeaf, removeLeaf, mushroomFront
   JAVA
   if, while, for
*/
   
class MyClara extends Clara { 
    /**
     * In the 'run()' method you can write your program for Clara 
     */
    int age = 0;
    int candlesHeight = 0;
    boolean movingEast = true;

    void run() {
        // TODO: Write your code below
        for(int i=1;i<=4;i++){
            putLeaves(18);
            reposition();
        }
        age = readInt("How old is your Grandmother tuning? :");
        candlesHeight = age % 10 == 0 ? 1 : age % 10;
        moveForward((18-(((age/10)*2)-1))/2);

        for(int i=1;i<=(age/10);i++){
            move();
            turnLeft();
            candleTime();
            turnLeft();
            move();
        }
    }

    void candleTime(){
        putLeaves(candlesHeight);
        turnLeft();
        turnLeft();
        moveForward(candlesHeight);
    }

    void reposition(){
        if (movingEast) turnLeft(); else turnRight();
        move();
        if (movingEast) turnLeft(); else turnRight();
        move();
        movingEast = !movingEast;
    }
    void putLeaves(int totalLeaves){
        for(int i=1;i<=totalLeaves;i++){
            putLeaf();
            move();
        }
    }
    void moveForward(int steps){
        for(int i=1;i<=steps;i++) move();
    }
}