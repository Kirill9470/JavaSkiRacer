package pro.sidorov.racer.logic;
import pro.sidorov.racer.model.Racer;

public class CellController {
	
	private final static int WIDTH = 120;
	
	public static Racer racer1 = new Racer();
	public static Racer racer2 = new Racer();
	public static Racer racer3 = new Racer();
	public static Racer racer4 = new Racer();
	
	public void move() { // Движение
		racer1.move();
		racer2.move();
		racer3.move();
		racer4.move();
	}	
	public void win() { // Победа
		racer1.win();
		racer2.win();
		racer3.win();
		racer4.win();
	}
	public void setPositionRacer1(int speed, int enduration, String tactic) { 
		racer1.setOptions("гонщик 1",(WIDTH/2 - 1),WIDTH,speed,enduration,tactic);
	}
	public void setPositionRacer2(int speed, int enduration, String tactic) { 
		racer2.setOptions("гонщик 2",WIDTH/2,WIDTH,speed,enduration,tactic);
	}
	public void setPositionRacer3(int speed, int enduration, String tactic) { 
		racer3.setOptions("гонщик 3",(WIDTH/2 + 1),WIDTH,speed,enduration,tactic);
	}
	public void setPositionRacer4(int speed, int enduration, String tactic) { 
		racer4.setOptions("гонщик 4",(WIDTH/2 + 2),WIDTH,speed,enduration,tactic);
	}
}
