import java.util.*;

public class main {

    int[][] map = new int[3][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        printMatrix(askUserInterface());


	}

    public int[][] askUserInterface() {
    	String n;
		Scanner sc = new Scanner(System.in);
		System.out.println("which position?");
		while(!sc.hasNext()){
			sc.next();
			System.out.println("out of position, try again");
		}
		String[] rawInput =sc.nextLine().split(",");
        int[][] intInput = new int[3][3];
        return intInput[rawInput[0]][rawInput[1]] = 1;

    }
    	
    	 
    public void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    


}
