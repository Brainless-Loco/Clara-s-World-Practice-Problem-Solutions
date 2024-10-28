/* PERMITTED COMMANDS
   move(); turnLeft(); putLeaf(); removeLeaf();
*/
   
class MyClara extends Clara { 
    /**
     * In the 'run()' method you can write your program for Clara 
     */
    void run() {
        // TODO: Write your code below
        move();
        turnRight();
        move();
        turnLeft();
        moveTwice();
        turnLeft();
        moveTwice();
        turnRight();
        moveTwice();
        turnRight();
        moveTwice();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
        move();
        removeLeaf();
        turnRight();
        move();
    } 
    void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    void moveTwice() {
        move();
        move();
    }
}