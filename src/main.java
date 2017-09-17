import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("which position?");
		while(!sc.hasNext()){
			sc.next();
			System.out.println("out of position, try again");
		}
		a=sc.nextLine();
		String b[]=a.split(",");
		System.out.println(b[0]);
		System.out.println(b[1]);
		//System.out.println(askUserInterface());

	}

   // public String askUserInterface() {
   // 	String n;
    	
    	 
    	
	//	return ;
        // Ask user for an input and return the input


    


}
