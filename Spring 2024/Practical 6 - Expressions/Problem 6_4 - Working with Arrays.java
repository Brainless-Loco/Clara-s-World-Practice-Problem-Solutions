/* PERMITTED COMMANDS 
   move, turnLeft, turnRight, treeLeft, treeRight, treeFront, onLeaf, putLeaf, removeLeaf, mushroomFront,
   addTree(x, y),
   JAVA
   if, while, for, do, &&, !, ||, variables, arrays
*/
   
class MyClara extends Clara { 
    
    int [][] treeArray = {
        {0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,1,0,0,0,0,0},
        {0,0,0,0,1,1,1,0,0,0,0},
        {0,0,0,1,1,1,1,1,0,0,0},
        {0,0,1,1,1,1,1,1,1,0,0},
        {0,1,1,1,1,1,1,1,1,1,0},
        {1,1,1,1,1,1,1,1,1,1,1}
    };
    
    void run() {
        turnRight();
        move();
        turnLeft();
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= 10; j++) {
                int col = i%2==1 ? j : 10 - j;  
                if (onLeaf()) {
                    removeLeaf();
                }
                if (treeArray[i][col] == 1) {
                    addTree(col, i); 
                }
                if (j < 10) {
                    move();
                }
            }
            
            if (i > 0) {
                if (i%2==1) {
                    turnLeft();
                    move();
                    turnLeft();
                    
                } else {
                    turnRight();
                    move();
                    turnRight();
                }
            }
        }
        turnLeft();
        while(!treeFront()) move();
        turnLeft();
        
    }
}
