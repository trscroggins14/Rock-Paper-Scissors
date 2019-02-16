import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    	System.out.print("Enter Player 1 Name: ");
    	String player1 = input.nextLine();
    	System.out.print("Enter Player 2 Name: ");
    	String player2 = input.nextLine();
    	System.out.print("Enter Move: ");
    	String a = input.nextLine();
    	System.out.print("Enter Move: ");
    	String b = input.nextLine();
    	
    	while (a.equals("rock") || a.equals("paper") || a.equals("scissors") && b.equals("rock") || b.equals("paper") || b.equals("scissors")) {
    	    if (a.equals("rock") && b.equals("rock")) {
    	        System.out.println("Tie");
    	        break;
    	    } else if (a.equals("rock") && b.equals("paper")) {
    	        System.out.println(player2 + " Wins!");
    	        break;
    	    } else if (a.equals("rock") && b.equals("scissors")) {
    	        System.out.println(player1 + " Wins!");
    	        break;
    	    } else if (a.equals("paper") && b.equals("rock")) {
    	        System.out.println(player1 + " Wins!");
    	        break;
    	    } else if (a.equals("paper") && b.equals("paper")) {
    	        System.out.println("Tie!");
    	        break;
    	    } else if (a.equals("paper") && b.equals("scissors")) {
    	        System.out.println(player2 + " Wins!");
    	        break;
    	    } else if (a.equals("scissors") && b.equals("rock")) {
    	        System.out.println(player2 + " Wins!");
    	        break;
    	    } else if (a.equals("scissors") && b.equals("paper")) {
    	        System.out.println(player1 + " Wins!");
    	        break;
    	    } else if (a.equals("scissors") && b.equals("scissors")) {
    	        System.out.println("Tie!");
    	        break;
    	    }
    	}
    }
}