package pro.sidorov.racer.model;

import javax.swing.JOptionPane;

public class Racer {
	
	private String name;
	private int racerX;
	private int racerY;
	private int speed;
	private int enduration;
	private String tactic;
	
	public void setOptions(String name,int x, int y,int speed, int enduration, String tactic) { // Получаем параметры
		this.name = name;
		this.racerX = x - 1;
		this.racerY = y - 1;
		this.speed = speed;
		this.enduration = enduration;
		this.tactic = tactic;
		
		System.out.println(this.racerX);
		System.out.println(this.racerY);
		System.out.println(this.speed);
		System.out.println(this.enduration);
		System.out.println(this.tactic);
	}
	
	public int getCoordinateX() { // получаем координату X
		return racerX;
	}
	
    public int getCoordinateY() { // получаем координату Y
    	return racerY;
	}
    
    public void move() {
    	
        switch(this.tactic) {
        
        	case "Спринтер":
        	
        		if(this.racerY > 80) {
        			if(this.enduration > 0) {
	        			this.racerY = this.racerY - (speed + 2);
	        			this.enduration = this.enduration - (speed + 2);
        			}
        			if(this.enduration <= 0) {
	        			this.racerY = this.racerY - (speed/speed);
	        			
        			}
        		}
        		if(this.racerY <= 80 && this.racerY >= 40) {
        			if(this.enduration > 0) {
        				this.racerY = this.racerY - speed;
	        			this.enduration = this.enduration - speed;
        			}
        			if(this.enduration <= 0) {
	        			this.racerY = this.racerY - (speed/speed);
	        			
        			}
        		}
        		if(this.racerY < 40) {
        			if(this.enduration > 0) {
	        			this.racerY = this.racerY - (speed - 2);
	        			this.enduration = this.enduration - (speed - 2);
        			}
        			if(this.enduration <= 0) {
	        			this.racerY = this.racerY - (speed/speed);
	        			
        			}
        		}
        		if (this.racerY <= 0) {
            		this.racerY = 0;
            	}
        		break;
        		
        	case "Стаер":
        		
        		if(this.racerY > 80) {
        			if(this.enduration > 0) {
	        			this.racerY = this.racerY - (speed - 2);
	        			this.enduration = this.enduration - (speed - 2);
        			}
        			if(this.enduration <= 0) {
	        			this.racerY = this.racerY - (speed/speed);
	        			
        			}
        		}
        		if(this.racerY <= 80 && this.racerY >= 40) {
        			if(this.enduration > 0) {
        				this.racerY = this.racerY - speed;
	        			this.enduration = this.enduration - speed;
        			}
        			if(this.enduration <= 0) {
	        			this.racerY = this.racerY - (speed/speed);
	        			
        			}
        		}
        		if(this.racerY < 40) {
        			if(this.enduration > 0) {
	        			this.racerY = this.racerY - (speed + 2);
	        			this.enduration = this.enduration - (speed + 2);
        			}
        			if(this.enduration <= 0) {
	        			this.racerY = this.racerY - (speed/speed);
	        			
        			}
        		}
        		if (this.racerY <= 0) {
            		this.racerY = 0;
            	}
        		System.out.println(this.racerY);
        		System.out.println(this.enduration);
        		break;
        		
        	case "Нормальный":
        		
        		if(this.enduration > 0) {
        			this.racerY = this.racerY - speed;
        			this.enduration = this.enduration - speed;
        		}
        		if(this.enduration <= 0) {
        			this.racerY = this.racerY - (speed/speed);
        		}
        		if (this.racerY <= 0) {
            		this.racerY = 0;
            	}
        		break;
        }
    	
    }
    public void win() {
    	Object[] options = { "Готово" };
    	if (this.racerY <= 0) {
    		int exit = JOptionPane.showOptionDialog(null,
	                   "Победил " + this.name,"Ski simulator",
	                   JOptionPane.PLAIN_MESSAGE,
	                   JOptionPane.QUESTION_MESSAGE,
	                   null,
	                   options,
	                   options[0]);
			if(exit == 0) {
				System.exit(0);
			}
    	}
    }
}
	
    
