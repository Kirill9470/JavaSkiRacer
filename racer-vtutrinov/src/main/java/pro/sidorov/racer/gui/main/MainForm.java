package pro.sidorov.racer.gui.main;

import javax.swing.*;

import pro.sidorov.racer.gui.mainpanel.MainFormPanel;

public class MainForm extends JFrame {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	private JPanel panelOption;
	private MainFormPanel mainFormPanel;
	
	public MainForm(){
		setupView();
		setupGroupPanels();
		setupViewPanel();
		setVisible(true);
	}
	
	private void setupView() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
		}
		catch (Exception e) { 
			e.printStackTrace();
		}
		setTitle("Ski Emulator");
		setBounds( 100,100, 1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void setupGroupPanels() {
		panelOption = new JPanel();
		panelOption.setLayout(new BoxLayout(panelOption, BoxLayout.Y_AXIS));
		add(panelOption);
	}
	
	private void setupViewPanel() {
		mainFormPanel = new MainFormPanel();
		panelOption.add(mainFormPanel);
	}
}