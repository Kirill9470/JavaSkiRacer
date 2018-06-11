package pro.sidorov.racer.logic;

public class BorderController {
	
	private final static int WIDTH = 120;
	
	public static int[][] masMap;
	
	public void controlGrid() { // Заполняем сетку 0
		masMap = new int[WIDTH][WIDTH];
		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < WIDTH; j++) {
				masMap[i][j] = 0;
				
				if(((i == (CellController.racer1.getCoordinateX() - 2) || i == (CellController.racer4.getCoordinateX() + 2)) && j >= ((WIDTH*2.4)/3)) || (i == CellController.racer1.getCoordinateX() - 1 || i == CellController.racer4.getCoordinateX() + 1)&& j <= ((WIDTH*2.4)/3)) {
					masMap[i][j] = 1;
				}
			}
			
		}
	}
}
