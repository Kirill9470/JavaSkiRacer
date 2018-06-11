package pro.sidorov.racer.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import pro.sidorov.racer.gui.childpanel.ChildFormPanel;
import pro.sidorov.racer.gui.childpanel.MapPanel;



public class ControllPanelListiner {
	
	private static Timer timer;
	private MapPanel map;
	private CellController cellController;
	
	public void startModel() { // Запускаем таймер 
		cellController = new CellController();
		timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				map = ChildFormPanel.mapPanel; // Отрисовываем сетку
				cellController.move();
				map.repaint();
				cellController.win();
			}  
		  }
	    );
		timer.start();
	}
	public static void pauseModel() { // Пауза таймера
		timer.stop();
	}
}
