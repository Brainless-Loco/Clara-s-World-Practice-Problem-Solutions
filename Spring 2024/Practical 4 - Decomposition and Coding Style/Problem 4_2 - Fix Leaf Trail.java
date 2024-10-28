/* PERMITTED COMMANDS
   Clara commands:
   move(); turnLeft(); turnRight(); treeLeft(); treeRight(); treeFront(); onLeaf(); putLeaf(); removeLeaf(); mushroomFront();
   JAVA commands:
   if, else, for, while, do, &&, ||, ! */
   
class MyClara extends Clara { 
    /**
     * In the 'run()' method you can write your program for Clara 
     */
    void run() {
        // TODO: Write your code below
        /* move();
        if (!onLeaf()) {
            putLeaf();
            turnLeft();          #thats your code!
        }
        if (treeFront()){
            
        }
        */
       while (!mushroomFront()) { 
            if (!onLeaf()) {        
                putLeaf();          
            }
            if (treeFront()) {
                turnLeft();
            } else {
                move();             
            }
            if (!onLeaf()) {
            putLeaf();
        }
       }
    }
}