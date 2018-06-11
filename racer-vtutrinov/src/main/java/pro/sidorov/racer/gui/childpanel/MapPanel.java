package pro.sidorov.racer.gui.childpanel;


import pro.sidorov.racer.logic.*;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MapPanel extends JPanel{

	private BorderController borderController;
	private final static int WIDTH = 120;
	private final int CELL = 5;
	private final static int positionPanelX = 10; // расположение сетки по X
	private final static int positionPanelY = 5; // расположение сетки по Y
		
	public MapPanel() {
		setMapBorder();
		setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
	   // Рисуем рабочую область
		g.setColor(Color.WHITE);
		g.fillRect(positionPanelX, positionPanelY, WIDTH*CELL, WIDTH*CELL);
		
		// Рисуем сетку по X
		for (int i = positionPanelX; i <= WIDTH*CELL + positionPanelX; i+= CELL){
			g.setColor(Color.BLACK);
			g.drawLine(positionPanelX,i - positionPanelY,WIDTH*CELL+positionPanelX,i - positionPanelY);
		}
		
		// Рисуем сетку по Y
		for (int i = positionPanelY; i <= WIDTH*CELL + positionPanelY; i+= CELL) {
			g.setColor(Color.BLACK);
			g.drawLine(positionPanelY + i,positionPanelY,i + positionPanelY,WIDTH*CELL + positionPanelY);
		}
		for(int i = 0 ; i < 1; i++) {
			g.setColor(Color.BLUE);
			g.fillRect(positionPanelX+CellController.racer1.getCoordinateX()*CELL+1, positionPanelY+CellController.racer1.getCoordinateY()*CELL+1, CELL-1, CELL-1);
		}
		for(int i = 0 ; i < 1; i++) {
			g.setColor(Color.RED);
			g.fillRect(positionPanelX+CellController.racer2.getCoordinateX()*CELL+1, positionPanelY+CellController.racer2.getCoordinateY()*CELL+1, CELL-1, CELL-1);
		}
		for(int i = 0 ; i < 1; i++) {
			g.setColor(Color.GREEN);
			g.fillRect(positionPanelX+CellController.racer3.getCoordinateX()*CELL+1, positionPanelY+CellController.racer3.getCoordinateY()*CELL+1, CELL-1, CELL-1);
		}
		for(int i = 0 ; i < 1; i++) {
			g.setColor(Color.YELLOW);
			g.fillRect(positionPanelX+CellController.racer4.getCoordinateX()*CELL+1, positionPanelY+CellController.racer4.getCoordinateY()*CELL+1, CELL-1, CELL-1);
		}
		for(int i = 0; i < BorderController.masMap.length; i++) {
			for(int j = 0 ; j < BorderController.masMap.length ; j++) {
				if (BorderController.masMap[i][j] == 1) {
					g.setColor(Color.BLACK);
					g.fillRect(positionPanelX+i*CELL+1, positionPanelY+j*CELL+1,CELL-1,CELL-1);
				}
			}
		}
	}
	private void setMapBorder() {
		borderController = new BorderController();
		borderController.controlGrid();
	}
}

