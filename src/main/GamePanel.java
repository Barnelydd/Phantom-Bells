package main;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {

	//Resolución
	final int originalTileSize = 16; //Escala de pixeles... No me he decidido :c
	
	final int scale = 3; 
	final int tileSize = originalTileSize * scale ;
	final int maxScreenRow = 16 ;
	final int maxScreenCol = 12;
	final int screenWidth = tileSize * maxScreenCol;
	final int screenHeight = tileSize * maxScreenRow;
	KeyHandler keyH = new KeyHandler();
	Thread gameThread;
	
	int playerX = 100;
	int playerY = 100;
	int playerSpeed = 80 ;
	int FPS = 60;
	
	
	public GamePanel()
	{
		this.setPreferredSize(new Dimension (screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);
		run();		
	}
	
	public void startGameThread () {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	
	@Override
	public void run ()
	{
		while(gameThread != null) {
			System.out.println("They se me rolliiiiiiiing");
		double drawInterval = 1000000000/FPS;
		double nextDrawTime = System.nanoTime() + drawInterval;
			
			
			update();
			
			
			repaint();
			
			
			try {
				
				double remainingTime = nextDrawTime - System.nanoTime();
				Thread.sleep((long) remainingTime);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		
		}
		
	}
	
	public void update() {
		
		if (keyH.upPress == true){
			playerY -= playerSpeed; 
		}
		else if (keyH.downPress == true) {
			playerY += playerSpeed;
		}
		else if (keyH.leftPress) {
		playerX -= playerSpeed;	
		}
		else if (keyH.rightPress) {
			playerX += playerSpeed;
		}
		
	}
	public void paintComponent (Graphics g ) {
		super.paintComponent (g) ; 
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.white);
		g2.fillRect (playerX, playerY, tileSize, tileSize);
	
		g2.dispose();
	}

	public void repaint() {
		
	}
}
