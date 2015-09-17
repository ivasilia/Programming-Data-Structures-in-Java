package wumpus.controller;

import javax.swing.JFrame;

import wumpus.gui.LabyrinthView;
import wumpus.model.Labyrinth;
import wumpus.model.Position;

public class LabyrinthController {
	private Labyrinth labyrinth;
	private LabyrinthView view;
	
	public LabyrinthController(Labyrinth labyrinth){
		this.labyrinth = labyrinth;
		view = new LabyrinthView("Wumpus Game", labyrinth, this);
	}

	public void moveDown() {
		int hx = labyrinth.getHeroX();
		int hy = labyrinth.getHeroY();
		if (hy < labyrinth.getHeight() - 1) {
			labyrinth.setHeroY(hy + 1);
		}
		System.out.println("Hero X=" + labyrinth.getHeroX() 
		+ ", Y=" + labyrinth.getHeroY());		
	}
	
	public void moveUp() {
		int hx = labyrinth.getHeroX();
		int hy = labyrinth.getHeroY();
		if (hy > 0) {
			labyrinth.setHeroY(hy - 1);
		}
		System.out.println("Hero X=" + labyrinth.getHeroX() 
		+ ", Y=" + labyrinth.getHeroY());		
		
	}

	public void moveLeft() {
		int hx = labyrinth.getHeroX();
		int hy = labyrinth.getHeroY();
		if (hx > 0) {
			labyrinth.setHeroX(hx - 1);
		}
		System.out.println("Hero X=" + labyrinth.getHeroX() 
		+ ", Y=" + labyrinth.getHeroY());		
		
	}

	public void moveRight() {
		int hx = labyrinth.getHeroX();
		int hy = labyrinth.getHeroY();
		if (hx < labyrinth.getWidth() - 1) {
			labyrinth.setHeroX(hx + 1);
		}
		System.out.println("Hero X=" + labyrinth.getHeroX() 
		+ ", Y=" + labyrinth.getHeroY());		
		
	}

	
	public static void main(String[] args) {
		Labyrinth lab = new Labyrinth(
				Labyrinth.WIDTH, Labyrinth.HEIGHT, //Labyrinth size
				new Position(5,4), //Wumpus
				new Position(9,7), //Gold
				new Position[] { // Pits
					new Position(2,4), 
					new Position(6,9), 
					new Position(2,7), 
					new Position(8,3), 
				}	
			);
		
		LabyrinthController c = new LabyrinthController(lab);
	}


}
