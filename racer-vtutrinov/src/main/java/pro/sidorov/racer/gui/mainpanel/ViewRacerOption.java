package pro.sidorov.racer.gui.mainpanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class ViewRacerOption extends JPanel {
    
	private static final long serialVersionUID = 1L;
	
	private static JPanel formRacer1;
	private static JPanel formRacer2;
	private static JPanel formRacer3;
	private static JPanel formRacer4;
	
	private JTextField forceRacer1;
	private JTextField enduranceRacer1;
	
	private JTextField forceRacer2;
	private JTextField enduranceRacer2;
	
	private JTextField forceRacer3;
	private JTextField enduranceRacer3;
	
	private JTextField forceRacer4;
	private JTextField enduranceRacer4;
	
	private String[] items = {
			"Выберите особенность",
		    "Стаер",
		    "Спринтер",
		    "Нормальный"
	};
	
	private JComboBox<String> comboBox1;
	private JComboBox<String> comboBox2;
	private JComboBox<String> comboBox3;
	private JComboBox<String> comboBox4;
		
	public ViewRacerOption(){
		setupView();
		setupGroupPanels();
		setupViewPanel1();
		setupViewPanel2();
		setupViewPanel3();
		setupViewPanel4();
		setVisible(true);
	}
	

	
	private void setupView() {
		setLayout(new GridLayout(1,4,10,10));
	}
	
	private void setupGroupPanels() {
		formRacer1 = new JPanel();
		formRacer2 = new JPanel();
		formRacer3 = new JPanel();
		formRacer4 = new JPanel();
		
		formRacer1.setLayout(new GridLayout(5,1,10,10));
		add(formRacer1);
		Border etched1 = BorderFactory.createEtchedBorder();
		Border titled1 = BorderFactory.createTitledBorder(etched1, "Панель 1");
		formRacer1.setBorder(titled1);
		
		formRacer2.setLayout(new GridLayout(5,1,10,10));
		add(formRacer2);
		
		Border etched2 = BorderFactory.createEtchedBorder();
		Border titled2 = BorderFactory.createTitledBorder(etched2, "Панель 2");
		formRacer2.setBorder(titled2);
		
		formRacer3.setLayout(new GridLayout(5,1,10,10));
		add(formRacer3);
		
		Border etched3 = BorderFactory.createEtchedBorder();
		Border titled3 = BorderFactory.createTitledBorder(etched3, "Панель 3");
		formRacer3.setBorder(titled3);
		
		formRacer4.setLayout(new GridLayout(5,1,10,10));
		add(formRacer4);
		
		Border etched4 = BorderFactory.createEtchedBorder();
		Border titled4 = BorderFactory.createTitledBorder(etched4, "Панель 4");
		formRacer4.setBorder(titled4);
	}
	
	private void setupViewPanel1() {
		forceRacer1 = new JTextField();
		formRacer1.add(forceRacer1);
		
		enduranceRacer1 = new JTextField();
		formRacer1.add(enduranceRacer1);
		
		comboBox1 = new JComboBox<String>(items);
		formRacer1.add(comboBox1);
		
		ActionListener act1 = new ActionListener() {
			private String qw;
			public void actionPerformed(ActionEvent e) {
				qw = comboBox1.getSelectedItem().toString();
				ViewMainPanel.racerTactic1 = qw;	
			}
		};
		comboBox1.addActionListener(act1);
				
		ViewMainPanel.getFormRacer1(forceRacer1,enduranceRacer1);
		
	}
	
	private void setupViewPanel2() {
		forceRacer2 = new JTextField();
		formRacer2.add(forceRacer2);
		
		enduranceRacer2 = new JTextField();
		formRacer2.add(enduranceRacer2);
		
		comboBox2 = new JComboBox<String>(items);
		formRacer2.add(comboBox2);
		
		ActionListener act2 = new ActionListener() {
			private String qw;
			public void actionPerformed(ActionEvent e) {
				qw = comboBox2.getSelectedItem().toString();
				ViewMainPanel.racerTactic2 = qw;	
			}
		};
		comboBox2.addActionListener(act2);
				
		ViewMainPanel.getFormRacer2(forceRacer2,enduranceRacer2);
	}
	
	private void setupViewPanel3() {
		forceRacer3 = new JTextField();
		formRacer3.add(forceRacer3);
		
		enduranceRacer3 = new JTextField();
		formRacer3.add(enduranceRacer3);
		
		comboBox3 = new JComboBox<String>(items);
		formRacer3.add(comboBox3);
	
		ActionListener act3 = new ActionListener() {
			private String qw;
			public void actionPerformed(ActionEvent e) {
				qw = comboBox3.getSelectedItem().toString();
				ViewMainPanel.racerTactic3 = qw;	
			}
		};
		comboBox3.addActionListener(act3);
		ViewMainPanel.getFormRacer3(forceRacer3,enduranceRacer3);
		
	}
	
	private void setupViewPanel4() {
		forceRacer4 = new JTextField();
		formRacer4.add(forceRacer4);
		
		enduranceRacer4 = new JTextField();
		formRacer4.add(enduranceRacer4);
		
		comboBox4 = new JComboBox<String>(items);
		formRacer4.add(comboBox4);
		
		ActionListener act4 = new ActionListener() {
			private String qw;
			public void actionPerformed(ActionEvent e) {
				qw = comboBox4.getSelectedItem().toString();
				ViewMainPanel.racerTactic4 = qw;	
			}
		};
		comboBox4.addActionListener(act4);
			
		ViewMainPanel.getFormRacer4(forceRacer4,enduranceRacer4);
	}
}
