package pro.sidorov.racer.gui.mainpanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

import pro.sidorov.racer.gui.main.ChildForm;

import pro.sidorov.racer.logic.CellController;
import pro.sidorov.racer.runnable.Run;

public class ViewMainPanel extends JPanel{
	/**
	 * 
	 */
	
	private ChildForm form1;
	
	private static final long serialVersionUID = 1L;
	
	private final String regex = "[0-9]+";
	
	private JButton buttonStart;
	private JButton buttonExit;
	private JButton buttonReset;
	
	private static JTextField jTextField1Form1;
	private static JTextField jTextField2Form1;
	
	private static JTextField jTextField1Form2;
	private static JTextField jTextField2Form2;
	
	private static JTextField jTextField1Form3;
	private static JTextField jTextField2Form3;
	
	private static JTextField jTextField1Form4;
	private static JTextField jTextField2Form4;
	
	private int speed1;
	private int enduration1;
	
	private int speed2;
	private int enduration2;
	
	private int speed3;
	private int enduration3;
	
	private int speed4;
	private int enduration4;
	
	public static String racerTactic1;
	public static String racerTactic2;
	public static String racerTactic3;
	public static String racerTactic4;
	
	
	public ViewMainPanel(){
		super();
		setupView();
		setupViewPanel();
		setVisible(true);
	}

	public void initListeners() { // В класс попадают значения из ViewRacerOption и здесь по нажатию кнопки значения должны попадать в модель
		buttonStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CellController cellController = new CellController();
				if(e.getSource() == buttonStart) {
					
						if(jTextField1Form1.getText().matches(regex) == false ||
						   jTextField2Form1.getText().matches(regex) == false ||
						   jTextField1Form2.getText().matches(regex) == false ||
						   jTextField2Form2.getText().matches(regex) == false ||
						   jTextField1Form3.getText().matches(regex) == false ||
						   jTextField2Form3.getText().matches(regex) == false ||
						   jTextField1Form4.getText().matches(regex) == false ||
						   jTextField2Form4.getText().matches(regex) == false) 
						{
							JOptionPane.showMessageDialog(null, "Заполните поля цифрами");
						}		
						else if(racerTactic1 == null || racerTactic1 == "Выберите особенность" ||
						   racerTactic2 == null || racerTactic2 == "Выберите особенность" ||	
						   racerTactic3 == null || racerTactic3 == "Выберите особенность" ||
						   racerTactic4 == null || racerTactic4 == "Выберите особенность") 
						{
							JOptionPane.showMessageDialog(null, "Выберите особенность");	
						}
						else {
							
							speed1 = Integer.parseInt(jTextField1Form1.getText());
							enduration1 = Integer.parseInt(jTextField2Form1.getText());
							speed2 = Integer.parseInt(jTextField1Form2.getText());
							enduration2 = Integer.parseInt(jTextField2Form2.getText());
							speed3 = Integer.parseInt(jTextField1Form3.getText());
							enduration3 = Integer.parseInt(jTextField2Form3.getText());
							speed4 = Integer.parseInt(jTextField1Form4.getText());
							enduration4 = Integer.parseInt(jTextField2Form4.getText());
							
							cellController.setPositionRacer1(speed1, enduration1, racerTactic1);
							cellController.setPositionRacer2(speed2, enduration2, racerTactic2);
							cellController.setPositionRacer3(speed3, enduration3, racerTactic3);
							cellController.setPositionRacer4(speed4, enduration4, racerTactic4);
							
							
							form1 = new ChildForm();
							form1.setVisible(true);
							Run.mainForm.dispose();;
						}
				}
            }
		});
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
            }
		});
//		buttonReset.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				form1 = new ChildForm();
//				form1.setVisible(true);
//            }
//		});
	}
	
	static void getFormRacer1(JTextField text1,JTextField text2) {
		jTextField1Form1 = text1;
		jTextField2Form1 = text2;
	}
	
	static void getFormRacer2(JTextField text1,JTextField text2) {
		jTextField1Form2 = text1;
		jTextField2Form2 = text2;
	}

	static void getFormRacer3(JTextField text1,JTextField text2) {
		jTextField1Form3 = text1;
		jTextField2Form3 = text2;
	}
	
	static void getFormRacer4(JTextField text1,JTextField text2) {
		jTextField1Form4 = text1;
		jTextField2Form4 = text2;
	}
	
	private void setupView() {
		setLayout(new GridLayout(1,3,30,30));
		Border etched = BorderFactory.createEtchedBorder();
		Border titled = BorderFactory.createTitledBorder(etched, "Контрольная панель");
		setBorder(titled);
	}
	private void setupViewPanel() {
		buttonStart = new JButton("Начать моделирование");
		add(buttonStart);
		buttonExit = new JButton("Выход");
		add(buttonExit);
		buttonReset = new JButton("Очистить формы?"); // Пока не понял как сделать 
		add(buttonReset);
		initListeners();
	}
}
