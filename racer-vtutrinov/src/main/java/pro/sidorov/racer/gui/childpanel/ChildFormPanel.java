package pro.sidorov.racer.gui.childpanel;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;


public class ChildFormPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static JPanel centerGroupPanel;
	public static JPanel rightGroupPanel;
	
	public static MapPanel mapPanel;
	public static ControllPanel controllPanel;
	
	public ChildFormPanel(){
		setupView();
		setupGroupPanels();
		setupMapPanel();
		setVisible(true);
	}
// ---------------------------------------Настройки вида------------------------------------------------------------
	private void setupView() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	}
// ---------------------------------------------------------------------------------------------------------------
// ------------------------------Настройки группы панелей-------------------------------------------------------------------
	private void setupGroupPanels() {
		centerGroupPanel = new JPanel();
		centerGroupPanel.setLayout(new BoxLayout(centerGroupPanel, BoxLayout.X_AXIS));
		add(centerGroupPanel);
		rightGroupPanel = new JPanel();
		rightGroupPanel.setLayout(new BoxLayout(rightGroupPanel, BoxLayout.Y_AXIS));
		add(rightGroupPanel);
	}
// ---------------------------------------------------------------------------------------------------------------
// Добавление панели	
	private void setupMapPanel() {
		Border etched = BorderFactory.createMatteBorder(10, 10, 10, 10, Color.BLUE);
		centerGroupPanel.setBorder(etched);
		
		Border etched1 = BorderFactory.createMatteBorder(10, 10, 40, 10, Color.BLUE);
		rightGroupPanel.setBorder(etched1);
		
		mapPanel = new MapPanel();
		centerGroupPanel.add(mapPanel); 
		
		controllPanel = new ControllPanel();
		rightGroupPanel.add(controllPanel);
		centerGroupPanel.setBackground(Color.RED);
	}
}
