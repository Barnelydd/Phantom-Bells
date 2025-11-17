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
			
			window.setLocationRelativeTo(window);
			window.setVisible(true);
			window.pack();
			
			
			/*
			int[][] setiado = { '1920' , '1280'},
					 {'2880', '1920'} ;
					 
					 
					 //Luego le añadimos public a esta mrd que me está dando problemas
					 //El truquito recién inventado como que no me va a funcionar eh
					 final int ResY = setiado[1];
					 final int ResX = setiado[2];
					 
					 System.out.println("La resolucion es de: " + ResY + " por " + ResX );
			 * */

	
	}
	public static void Box() {
		Boolean cont = false;
		
		String name = JOptionPane.showInputDialog("Who are you?");
		JOptionPane.showMessageDialog(null, "Very well, welcome traveler " + name);
	}
	public static void Inpt()
	{
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("What ya looking at?");
		
		
		String thinga = scan.nextLine();
		
		
		System.out.println("You are looking at: " +  thinga);
		 * */
		
		//String color1 = JOptionPane.showInputDialog("Is it blue?");
		
		
		
	}	
	

}
