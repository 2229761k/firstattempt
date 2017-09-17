import java.util.*;

public class main {

    int[][] map = new int[3][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        printMatrix(askUserInterface());


	}

    public static void startGame() {
        boolean player1 = True;
        boolean player2 = False;

        // TODO: task2:


    }

    public static boolean checkGameCondition() {
        // check if map has end condition.
        /*

            2 1 1
            2 0 0
            2 1 0

        */

    }

    public static int[][] askUserInterface() {
    	String n;
		Scanner sc = new Scanner(System.in);
		System.out.println("which position?");
		while(!sc.hasNext()){
			sc.next();
			System.out.println("out of position, try again");
		}
		String[] rawInput =sc.nextLine().split(",");
        int[][] intInput = new int[3][3];
        
        // TODO: task1:
        // check x and y boundary. if x and y is greater than 3, retry for an input
        int x = Integer.parseInt(rawInput[0]);
        int y = Integer.parseInt(rawInput[1]);
        intInput[x][y] = 1;
        return intInput;

    }
    	
    	 
    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    


}
