package main;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	//Testing around and getting the hang of java

			JFrame window = new JFrame();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setResizable(false);
			window.setTitle("Heavens sang in ding dong dang");
			GamePanel gamePanel = new GamePanel();
			
			window.add(gamePanel);
			
			
			window.pack();
			 
			window.setLocationRelativeTo(window);
			window.setVisible(true);
			
			
			
		

	
	}
	public static void Box() {
		Boolean cont = false;
		
		String name = JOptionPane.showInputDialog("Who are you?");
		JOptionPane.showMessageDialog(null, "Very well, welcome traveler " + name);
	}
	public static void Inpt()
	{
		//Nadie me la pueda pelarrrlskef

		
		Scanner scan = new Scanner(System.in);
		System.out.println("What ya looking at?");
		
		
		String thinga = scan.nextLine();
		
		
		System.out.println("You are looking at: " +  thinga);
			
		//String color1 = JOptionPane.showInputDialog("Is it blue?");
		
		
		
	}	
	

}
