package pro.sidorov.racer.gui.childpanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import pro.sidorov.racer.gui.main.ChildForm;
import pro.sidorov.racer.gui.main.MainForm;
import pro.sidorov.racer.gui.mainpanel.ViewMainPanel;
import pro.sidorov.racer.logic.ControllPanelListiner;
import pro.sidorov.racer.runnable.Run;

public class ControllPanel extends JPanel {
	

	ControllPanelListiner control = new ControllPanelListiner();
	
	private MainForm form1;
	
	private JButton startButton; // Старт
	private JButton pauseButton; // Стоп
	private JButton exitButton; // Стоп
	
	public ControllPanel(){ 
		setupView();
		setupButtons();
		setVisible(true);
	}
	
	private void setupView() { 
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	
	
	private void setupButtons() {
		startButton = new JButton("Старт");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control.startModel();
				startButton.setEnabled(false);
				pauseButton.setEnabled(true);
			}
		});
		add(startButton);
		// PAUSE
		pauseButton = new JButton("Стоп");
		pauseButton.setEnabled(false);
		pauseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllPanelListiner.pauseModel();
				startButton.setEnabled(true);
				pauseButton.setEnabled(false);
			}
		});
		add(pauseButton);
		// EXIT
		exitButton = new JButton("Выход");
		exitButton.setEnabled(true);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		add(exitButton);
		
	}
}
