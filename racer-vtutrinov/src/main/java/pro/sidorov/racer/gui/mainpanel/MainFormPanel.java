package pro.sidorov.racer.gui.mainpanel;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class MainFormPanel extends JPanel {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel1;
	private JPanel panel2;
	
	private ViewRacerOption viewRacerOption;
	private ViewMainPanel viewMainPanel;
	
	Color color = UIManager.getColor ( "Panel.background" );
	
	public MainFormPanel(){
		super();
		setupView();
		setupGroupPanels();
		setupViewPanel();
		setVisible(true);
	}
	
	private void setupView() {
		setLayout(new BorderLayout(0,160));
//		setBackground(Color.BLUE);
	}
	
	private void setupGroupPanels() {
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		add(panel1);
//		panel1.setPreferredSize(new Dimension(100,10));
		
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		add(panel2,BorderLayout.SOUTH);
//		panel2.setSize(1000,250);
	}
	
	private void setupViewPanel() {
		Border etched = BorderFactory.createMatteBorder(20, 10, 20, 10, color);
		panel1.setBorder(etched);
		
		Border etched1 = BorderFactory.createMatteBorder(10, 10, 40, 10, color);
		panel2.setBorder(etched1);
		
		viewRacerOption = new ViewRacerOption();
	
		viewMainPanel = new ViewMainPanel();
		
		panel1.add(viewRacerOption);
		panel2.add(viewMainPanel);
	}
}
