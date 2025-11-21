package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	//Settings 
	final int originalTileSize = 16; //Escala de pixeles... No me he decidido :c
	
	final int scale = 3; 
	final int tileSize = originalTileSize * scale ;
	final int maxScreenRow = 16 ;
	final int maxScreenCol = 12;
	final int screenWidth = tileSize * maxScreenCol;
	final int screenHeight = tileSize * maxScreenRow;
	
	
	public GamePanel()
	{
		this.setPreferredSize(new Dimension (screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	
	}
	
}
