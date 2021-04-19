import java.awt.EventQueue;
import java.text.SimpleDateFormat;  
import java.util.Date;  

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;

public class advanced_ATM_System {
	
	public static double sold_curent = 0;
	public static double suma_retrasa =0;
	public static double suma_depusa = 0;
	public static int flag_retragere =0;
	public static int flag_depunere = 0;
	public static int counter = 0;

	private JFrame frmAtmsystem;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;
	//private final Action action = new SwingAction();
	//private JButton btnNewButton;
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					advanced_ATM_System window = new advanced_ATM_System();
					window.frmAtmsystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public advanced_ATM_System() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
		private void initialize() {
		 

		// ------------CREARE FRAME ----------------------------
		frmAtmsystem = new JFrame();
		frmAtmsystem.setTitle("ATM_SYSTEM");
		frmAtmsystem.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frmAtmsystem.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				 

				 
				
			}
		});
		 
		frmAtmsystem.setBounds(100, 100, 1281, 581);
		frmAtmsystem.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frmAtmsystem.getContentPane().setLayout(null);
		
		// -----------CREARE PANEL-URI ---------------------------
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(170, 11, 344, 155);
		frmAtmsystem.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(SystemColor.activeCaptionBorder);
		panel_1.setBounds(678, 11, 579, 493);
		frmAtmsystem.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
			
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.activeCaptionBorder);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(524, 11, 150, 155);
		frmAtmsystem.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3_1.setBackground(SystemColor.activeCaptionBorder);
		panel_3_1.setBounds(10, 11, 150, 155);
		frmAtmsystem.getContentPane().add(panel_3_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.activeCaptionBorder);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(131, 190, 441, 314);
		frmAtmsystem.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		
		
		// ---------- CREARE LABEL-URI -----------------------------
		
		JLabel lblNewLabel = new JLabel("DOBANDA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 11, 53, 35);
		panel_1.add(lblNewLabel);
		
		final JLabel lblNewLabel_2 = new JLabel("                        INTRODUCETI PIN-UL ");
		lblNewLabel_2.setBounds(28, 34, 284, 25);
		panel.add(lblNewLabel_2);
		
		
		final JLabel lblNewLabel_3 = new JLabel("OBTINETI IMPRUMUT");
		lblNewLabel_3.setBounds(193, 9, 130, 14);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);
		
		final JLabel lblNewLabel_4 = new JLabel("DEPUNERE");
		lblNewLabel_4.setBounds(245, 130, 78, 14);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setVisible(false);
		
		final JLabel lblNewLabel_5 = new JLabel("RETRAGERE");
		lblNewLabel_5.setBounds(10, 130, 80, 14);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setVisible(false);
		
		final JLabel lblNewLabel_6 = new JLabel("INTEROGARE SOLD");
		lblNewLabel_6.setBounds(10, 9, 130, 14);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setVisible(false);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setVisible(false);
		textField_5.setBounds(115, 58, 64, 32);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(38, 58, 274, 44);
		panel.add(passwordField);
		 
		 
		
		JLabel lblNumarAni = new JLabel("NUMAR ANI");
		lblNumarAni.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNumarAni.setBounds(10, 68, 60, 35);
		panel_1.add(lblNumarAni);
		
		JLabel lblSumaImprumutata = new JLabel("SUMA IMPRUMUTATA");
		lblSumaImprumutata.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblSumaImprumutata.setBounds(0, 114, 110, 35);
		panel_1.add(lblSumaImprumutata);
		
		JLabel lblPlataLunara = new JLabel("PLATA LUNARA");
		lblPlataLunara.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPlataLunara.setBounds(10, 171, 85, 35);
		panel_1.add(lblPlataLunara);
		
		JLabel lblTotalPlata = new JLabel("TOTAL PLATA");
		lblTotalPlata.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotalPlata.setBounds(10, 267, 115, 35);
		panel_1.add(lblTotalPlata);
		
		 
		
		
		// ---------- CREARE CASETE TEXT -----------------------------
		
		textField = new JTextField();
		textField.setBounds(113, 11, 75, 35);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			//---------ACCEPTA DOAR CIFRE ------------
			public void keyTyped(KeyEvent e) {
			char iNumber = e.getKeyChar();
			if(!(Character.isDigit(iNumber))
				|| (iNumber == KeyEvent.VK_BACK_SPACE) 
				|| (iNumber == KeyEvent.VK_DELETE)){
			e.consume();
		}
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(113, 68, 75, 35);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(113, 114, 75, 35);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(113, 160, 75, 35);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(113, 269, 75, 35);
		panel_1.add(textField_4);
		 
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(SystemColor.inactiveCaptionBorder);
		textArea_1.setBounds(198, 16, 371, 432);
		panel_1.add(textArea_1);
		
		 
		
		// ---------- CREARE BUTOANE ---------------------------------
		final JButton btnNewButton_4 =  new JButton("CALCULEAZA ");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setBackground(SystemColor.inactiveCaption);
		btnNewButton_4.setEnabled(false);
		
		// ------------------- CALCULAM IMPRUMUTUL BANCAR --------------------
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double dobanda_anuala = Double.parseDouble(textField.getText());
				double dobanda_lunara = dobanda_anuala / 1200;
				 				
				int nr_ani = Integer.parseInt(textField_1.getText());
				double suma_imprumutata  = Double.parseDouble(textField_2.getText());
				
				
				double plata_lunara = suma_imprumutata * dobanda_lunara  /(1 - 1/Math.pow(1 + dobanda_lunara,nr_ani *12));
				String plata_lunara_0  ;
				plata_lunara_0 = Double.toString(plata_lunara);
				plata_lunara_0 = String.format(" %.2f lei",plata_lunara);
				textField_3.setText(plata_lunara_0);
				
				double total_plata = plata_lunara * nr_ani * 12;
				String total_plata_0;
				total_plata_0 = String.format(" %.2f lei",total_plata);
				textField_4.setText(total_plata_0);
				
				
			}
		});
		btnNewButton_4.setBounds(10, 459, 134, 23);
		panel_1.add(btnNewButton_4);
		
		final JButton btnNewButton_5 = new JButton("RESET");
		btnNewButton_5.setBackground(SystemColor.inactiveCaption);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_5.setEnabled(false);
		
		//-------------------- RESETAM CASETELE TEXT -------------------------- 
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textArea_1.setText("");
				
				
				
			}
		});
		btnNewButton_5.setBounds(326, 459, 89, 23);
		panel_1.add(btnNewButton_5);
		
		final JButton btnNewButton_6 = new JButton("FINALIZEAZA");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_6.setForeground(new Color(0, 0, 0));
		btnNewButton_6.setBackground(SystemColor.inactiveCaption);
		btnNewButton_6.setEnabled(false);
		btnNewButton_6.addActionListener(new ActionListener() {
			
			// -------- EMITERE CHITANTA CU DETALIILE IMPRUMUTULUI --------------
			public void actionPerformed(ActionEvent e) {
				
				// -------------PRELUAM INFORMATIILE DE LA CASETELE TEXT -------------
				String dobanda =          String.format(textField.getText());
				String nr_ani =           String.format(textField_1.getText());
				String suma_imprumutata = String.format(textField_2.getText());
				String plata_lunara  =    String.format(textField_3.getText());
				String total_plata =      String.format(textField_4.getText());
				double suma_imprumutata_0;
				
				int refs = 1325 + (int) (Math.random()* 4238);
				
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate  = new SimpleDateFormat("dd-MM-yyyy");
				Tdate.format(timer.getTime());
				
				textArea_1.setText("\t\tING BANK \n"+"www.ing.ro"+ "\t\t\t\t0376127654"+"\n\n\t Sistem de gestionare a imprumuturilor bancare \n" + 
				"\nReferinta: \t" + refs +
				"\nNR CARD : ************2301"+
				"\nATM A0846001" +
				"\n===========================================\t " +
				"\n Dobanda : \t " + dobanda + "%" +
				"\n Nr de ani in care trebuie platit imprumutul: " + nr_ani +
				"\n Suma imprumutata: \t "  + suma_imprumutata + "\tlei"+
				"\n Plata lunara:  " + plata_lunara + 
				"\n TOTAL plata:  " + total_plata +
				
				"\n===========================================\t" +
				"\nLOCATIE: Str. Macesului nr.1204"+
				"\nCRAIOVA,DOLJ"+
				"\n\nDate : " + Tdate.format(timer.getTime()) + 
				"\t\tTime: " + tTime.format(timer.getTime()) + 
				"\n\n\t\t Multumim,\n" + "\t\t\tING Bank" );
				
				lblNewLabel_6.setText("INTEROGARE SOLD");
				suma_imprumutata_0 = Double.parseDouble(textField_2.getText());  
				 
				sold_curent = sold_curent +  suma_imprumutata_0;
				
			}
		});
		btnNewButton_6.setBounds(170, 459, 126, 23);
		panel_1.add(btnNewButton_6);
		
		
		final JButton btnNewButton_7 = new JButton("EXIT");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_7.setBackground(SystemColor.inactiveCaption);
		btnNewButton_7.setEnabled(false);
		
		// -------------------- SETARE ACTIUNE DE IESIRE PT BUTONUL EXIT ------------------
		btnNewButton_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frmAtmsystem, "Doriti sa inchideti fereastra? ", "Sistem gestionare imprumut bancar",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
			
			System.exit(0);
		}
				
			}
		});
		 
				
		btnNewButton_7.setBounds(480, 459, 89, 23);
		panel_1.add(btnNewButton_7);
		
		 
		
		 
		
		 
		
		
		
		
		// -----------------CREARE BUTOANE SAGETI STANGA/DREAPTA --------------------
		 
		
				// ----------- BUTONUL SAGEATA DREAPTA JOS -------------
				final JButton btnNewButton_1_1 = new JButton("");
				btnNewButton_1_1.setEnabled(false);
				btnNewButton_1_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						flag_depunere = 1;
						flag_retragere = 0;
						lblNewLabel_6.setVisible(false);
						lblNewLabel_3.setVisible(false);
						lblNewLabel_5.setVisible(false);
						lblNewLabel_4.setVisible(false);
						lblNewLabel_2.setVisible(true);
						lblNewLabel_2.setText("                SUMA DORITA PT DEPUNERE: ");
						lblNewLabel_2.setForeground (Color.black);
						textField_5.setEnabled(true);
						textField_5.setVisible(true);
						textArea_1.setText("");
						
						
					}
				});
				btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button_right_arrow.jpg"));
				btnNewButton_1_1.setBounds(10, 104, 133, 40);
				panel_3.add(btnNewButton_1_1);
				
				
				
				// ----------- BUTONUL SAGEATA DREAPTA SUS -------------
				final JButton btnNewButton_2 = new JButton("");
				btnNewButton_2.setEnabled(false);
				// ---------- ACTIVAM ANUMITE BUTOANE ---------------
				btnNewButton_2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						btnNewButton_4.setEnabled(true);
						btnNewButton_5.setEnabled(true);
						btnNewButton_6.setEnabled(true);
						btnNewButton_7.setEnabled(true);
						textArea_1.setText("");
						
					};
				});
				
				btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button_right_arrow.jpg"));
				btnNewButton_2.setBounds(10, 11, 133, 40);
				panel_3.add(btnNewButton_2);
				
				 
				
				
				// ----------- BUTONUL SAGEATA STANGA JOS -------------
				final JButton btnNewButton_1_1_2 = new JButton("");
				btnNewButton_1_1_2.setEnabled(false);
				btnNewButton_1_1_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						flag_retragere = 1;
						flag_depunere = 0;
						lblNewLabel_6.setVisible(false);
						lblNewLabel_5.setVisible(false);
						lblNewLabel_3.setVisible(false);
						lblNewLabel_4.setVisible(false);
						lblNewLabel_2.setVisible(true);
						lblNewLabel_2.setText("                SUMA DORITA PT RETRAGERE: ");
						textField_5.setEnabled(true);
						textField_5.setVisible(true);
						textArea_1.setText(""); 
						
						
						
						
					}
				});
				btnNewButton_1_1_2.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button_left_arrow.jpg"));
				btnNewButton_1_1_2.setBounds(10, 104, 133, 40);
				panel_3_1.add(btnNewButton_1_1_2);
				
				
				// ----------- BUTONUL SAGEATA STANGA SUS -------------
				final JButton btnNewButton_2_1 = new JButton("");
				btnNewButton_2_1.setEnabled(false);
				btnNewButton_2_1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						passwordField.setEnabled(false);
						lblNewLabel_2.setEnabled(false);
						//lblNewLabel_3.setEnabled(false);
						//lblNewLabel_4.setEnabled(false);
						//lblNewLabel_5.setEnabled(false);
						lblNewLabel_6.setText("Solt curent: " + sold_curent);
						textArea_1.setText("");
						
						
					}
				});
				
				btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button_left_arrow.jpg"));
				btnNewButton_2_1.setBounds(10, 11, 133, 40);
				panel_3_1.add(btnNewButton_2_1);
				
				 
			
			
		// ----------- CREARE TASTATURA NUMERICA -----------------------
				
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag_retragere == 0 && flag_depunere == 0) {
				String Enter_number = passwordField.getText() + "1";
				passwordField.setText(Enter_number);
				}
				
				else{
					
					String Enter_number = textField_5.getText() + "1";
					textField_5.setText(Enter_number);
					
					
				}
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button1.jpg"));
		btnNewButton_3.setBounds(10, 11, 72, 66);
		panel_4.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(flag_retragere == 0 && flag_depunere == 0) {
					String Enter_number = passwordField.getText() + "2";
					passwordField.setText(Enter_number);
					}
					
					else{
						
						String Enter_number = textField_5.getText() + "2";
						textField_5.setText(Enter_number);
						
						
					}
			}
		});
		btnNewButton_3_1.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button2.jpg"));
		btnNewButton_3_1.setBounds(92, 11, 72, 66);
		panel_4.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(flag_retragere == 0 && flag_depunere == 0) {
					String Enter_number = passwordField.getText() + "3";
					passwordField.setText(Enter_number);
					}
					
					else{
						
						String Enter_number = textField_5.getText() + "3";
						textField_5.setText(Enter_number);
						
						
					}
			}
		});
		btnNewButton_3_2.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button3.jpg"));
		btnNewButton_3_2.setBounds(175, 11, 72, 66);
		panel_4.add(btnNewButton_3_2);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			// --------------- EXIT ---------------
			public void actionPerformed(ActionEvent e) {
				
			
			System.exit(0);
		
				 
			}
		});
		btnNewButton_1_1_1.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button_cancel.jpg"));
		btnNewButton_1_1_1.setBounds(257, 11, 173, 66);
		panel_4.add(btnNewButton_1_1_1);
		
		
		JButton btnNewButton_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			// -------------- DEZACTIVAM ANUMITE BUTOANE -----------
			public void actionPerformed(ActionEvent e) {
				
				 
				if(flag_retragere== 0 && flag_depunere == 0) {
										lblNewLabel_2.setText("                        INTRODUCETI PIN-UL");
										passwordField.setText(null);
										}
				
				textField_5.setText("");
				btnNewButton_4.setEnabled(false);
				btnNewButton_5.setEnabled(false);
				btnNewButton_6.setEnabled(false);
				btnNewButton_7.setEnabled(false);
				
			}
		});
		btnNewButton_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button_clear.jpg"));
		btnNewButton_1_1_1_1.setBounds(257, 88, 173, 66);
		panel_4.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_3_3 = new JButton("");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag_retragere == 0 && flag_depunere == 0) {
					String Enter_number = passwordField.getText() + "4";
					passwordField.setText(Enter_number);
					}
					
					else{
						
						String Enter_number = textField_5.getText() + "4";
						textField_5.setText(Enter_number);
						
						
					}
			}
		});
		btnNewButton_3_3.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button4.jpg"));
		btnNewButton_3_3.setBounds(10, 88, 72, 66);
		panel_4.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_1_1 = new JButton("");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag_retragere == 0 && flag_depunere == 0) {
					String Enter_number = passwordField.getText() + "5";
					passwordField.setText(Enter_number);
					}
					
					else{
						
						String Enter_number = textField_5.getText() + "5";
						textField_5.setText(Enter_number);
						
						
					}
			}
		});
		btnNewButton_3_1_1.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button5.jpg"));
		btnNewButton_3_1_1.setBounds(92, 88, 72, 66);
		panel_4.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_2_1 = new JButton("");
		btnNewButton_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag_retragere == 0 && flag_depunere == 0) {
					String Enter_number = passwordField.getText() + "6";
					passwordField.setText(Enter_number);
					}
					
					else{
						
						String Enter_number = textField_5.getText() + "6";
						textField_5.setText(Enter_number);
						
						
					}
			}
		});
		btnNewButton_3_2_1.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button6.jpg"));
		btnNewButton_3_2_1.setBounds(175, 88, 72, 66);
		panel_4.add(btnNewButton_3_2_1);
		
		 
		
		 
		
		JButton btnNewButton_3_4 = new JButton("");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag_retragere == 0 && flag_depunere == 0) {
					String Enter_number = passwordField.getText() + "7";
					passwordField.setText(Enter_number);
					}
					
					else{
						
						String Enter_number = textField_5.getText() + "7";
						textField_5.setText(Enter_number);
						
						
					}
			}
		});
		btnNewButton_3_4.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button7.jpg"));
		btnNewButton_3_4.setBounds(10, 165, 72, 66);
		panel_4.add(btnNewButton_3_4);
		
		JButton btnNewButton_3_1_2 = new JButton("");
		btnNewButton_3_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag_retragere == 0 && flag_depunere == 0) {
					String Enter_number = passwordField.getText() + "8";
					passwordField.setText(Enter_number);
					}
					
					else{
						
						String Enter_number = textField_5.getText() + "8";
						textField_5.setText(Enter_number);
						
						
					}
			}
		});
		btnNewButton_3_1_2.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button8.jpg"));
		btnNewButton_3_1_2.setBounds(92, 165, 72, 66);
		panel_4.add(btnNewButton_3_1_2);
		
		
		JButton btnNewButton_3_2_2 = new JButton("");
		btnNewButton_3_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag_retragere == 0 && flag_depunere == 0) {
					String Enter_number = passwordField.getText() + "9";
					passwordField.setText(Enter_number);
					}
					
					else{
						
						String Enter_number = textField_5.getText() + "9";
						textField_5.setText(Enter_number);
						
						
					}
				
			}
		});
		btnNewButton_3_2_2.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button9.jpg"));
		btnNewButton_3_2_2.setBounds(175, 165, 72, 66);
		panel_4.add(btnNewButton_3_2_2);
		
		
		JButton btnNewButton_3_5 = new JButton("");
		btnNewButton_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag_retragere == 0 && flag_depunere == 0) {
					String Enter_number = passwordField.getText() + "0";
					passwordField.setText(Enter_number);
					}
					
					else{
						
						String Enter_number = textField_5.getText() + "0";
						textField_5.setText(Enter_number);
						
						
					}
			}
		});
		btnNewButton_3_5.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button0.jpg"));
		btnNewButton_3_5.setBounds(92, 242, 72, 66);
		panel_4.add(btnNewButton_3_5);
		
		
		JButton btnNewButton_1_1_1_3 = new JButton("");
		btnNewButton_1_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1_3.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button_empty2.jpg"));
		btnNewButton_1_1_1_3.setBounds(257, 242, 173, 66);
		panel_4.add(btnNewButton_1_1_1_3);
		
		JButton btnNewButton_3_6 = new JButton("");
		btnNewButton_3_6.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button_empty.jpg"));
		btnNewButton_3_6.setBounds(175, 242, 72, 66);
		panel_4.add(btnNewButton_3_6);
		
		JButton btnNewButton_3_7 = new JButton("");
		btnNewButton_3_7.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button_empty.jpg"));
		btnNewButton_3_7.setBounds(10, 242, 72, 66);
		panel_4.add(btnNewButton_3_7);
		
		
		
		JButton btnNewButton_1_1_1_2 = new JButton("");
		btnNewButton_1_1_1_2.addActionListener(new ActionListener(){ 
		// ---------------- VALIDAM PIN-UL UTILIZATORULUI -----------  
			public void actionPerformed(ActionEvent e){
			
				int pin1 = Integer.parseInt(passwordField.getText());
				if(pin1 == 1212){
						btnNewButton_2.setEnabled(true);
						btnNewButton_2_1.setEnabled(true);
						btnNewButton_1_1_2.setEnabled(true);
						btnNewButton_1_1.setEnabled(true);
						lblNewLabel_3.setVisible(true);
						lblNewLabel_4.setVisible(true);
						lblNewLabel_5.setVisible(true);
						lblNewLabel_6.setVisible(true);
						lblNewLabel_2.setVisible(false);
						passwordField.setVisible(false);
				}
				else { // IN CAZUL IN CARE PIN-UL ESTE INCORECT
						counter++;
						lblNewLabel_2.setText("           PIN INCORECT." +	" \tINCERCATI DIN NOU" );
						passwordField.setText(null);
				
				};
				if(counter == 3) {
					
					JOptionPane.showConfirmDialog(frmAtmsystem, "CARD BLOCAT!! ", "Eroare",JOptionPane.PLAIN_MESSAGE);
					
					System.exit(0);
					
				}
				
				if(flag_retragere == 1){
					
					suma_retrasa = Double.parseDouble(textField_5.getText());
					if(suma_retrasa % 5 == 0) {
						
						if(sold_curent >= suma_retrasa) {
							
							
							if(JOptionPane.showConfirmDialog(frmAtmsystem, "Doriti chitanta ? ", "Retragere",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
								
							
								// -------------PRELUAM INFORMATIILE DE LA CASETELE TEXT -------------
								String retragere =          String.format(textField_5.getText());
								
								
								int refs = 1325 + (int) (Math.random()* 4238);
								
								Calendar timer = Calendar.getInstance();
								timer.getTime();
								
								SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
								tTime.format(timer.getTime());
								SimpleDateFormat Tdate  = new SimpleDateFormat("dd-MM-yyyy");
								Tdate.format(timer.getTime());
								
								textArea_1.setText("\t\tING BANK \n"+"www.ing.ro"+ "\t\t\t\t0376127654"+"\n\nTIP TRANZACTIE : RETRAGERE "+ 
								"\n===========================================\t "+
								"\nID TRANZACTIE: \t" + refs +
								"\nNR CARD : ************2301"+
								"\nATM A0846001" +
								"\n===========================================\t " +
								 
								"\nTRANZACTION FEE : 0.00 " + "RON" +
								"\nSUMA RETRASA : \t " + retragere + " RON" +
								"\nSOLD CURENT: " + (sold_curent - suma_retrasa) + "RON"+
								 								
								"\n===========================================\t" +
								"\nLOCATIE: Str. Macesului nr.1204"+
								"\nCRAIOVA,DOLJ"+
								"\n\nDate : " + Tdate.format(timer.getTime()) + 
								"\t\tTime: " + tTime.format(timer.getTime()) + 
								 
								"\n\n\t\t Multumim,\n" + "\t\t\tING Bank" );
								
								
							}
							
							
							
							sold_curent = sold_curent - suma_retrasa;
							lblNewLabel_6.setText("INTEROGARE SOLD");
							textField_5.setText("");
							textField_5.setVisible(false);
						}
						else {
							JOptionPane.showConfirmDialog(frmAtmsystem, "FONDURI INSUFICIENTE ! ", "Eroare",JOptionPane.PLAIN_MESSAGE);
							
							lblNewLabel_2.setVisible(false);
							lblNewLabel_6.setVisible(true);
							lblNewLabel_5.setVisible(true);
							lblNewLabel_3.setVisible(true);
							lblNewLabel_6.setText("INTEROGARE SOLD");
							lblNewLabel_2.setText("");
							lblNewLabel_2.setForeground (Color.black);
							//lblNewLabel_5.setEnabled(false);
							//btnNewButton_1_1_2.setEnabled(false);
							textField_5.setVisible(false);
							textField_5.setText("");
							 
						}
					
					 
					}
				
					else {
						
						JOptionPane.showConfirmDialog(frmAtmsystem, "Introduceti multiplu de 5 ! ", "Eroare",JOptionPane.PLAIN_MESSAGE);
						lblNewLabel_2.setVisible(true);
						lblNewLabel_2.setText("                            SUMA DORITA PT RETRAGERE:");
					
						lblNewLabel_6.setVisible(false);
						lblNewLabel_5.setVisible(false);
						lblNewLabel_4.setVisible(false);
						lblNewLabel_3.setVisible(false);
						
						 
						textField_5.setText("");
						textField_5.setVisible(true);
						 
					
					};
						
						
						
						
				}				
				else if(flag_depunere == 1) {
					
					suma_depusa = Double.parseDouble(textField_5.getText());
					if(suma_depusa % 5 == 0) {
						
						
				 
							suma_depusa  = Double.parseDouble(textField_5.getText());
							sold_curent = sold_curent + suma_depusa;
							 
							lblNewLabel_6.setVisible(true);
							lblNewLabel_6.setText("INTEROGARE SOLD");
							
							textField_5.setText("");
							textField_5.setVisible(false);
				 
					}
					else {
						
						JOptionPane.showConfirmDialog(frmAtmsystem, "Introduceti multiplu de 5 ! ", "Eroare",JOptionPane.PLAIN_MESSAGE);
						lblNewLabel_6.setVisible(false);
						lblNewLabel_5.setVisible(false);
						lblNewLabel_4.setVisible(false);
						lblNewLabel_3.setVisible(false);
						
						
						lblNewLabel_2.setVisible(true);
						lblNewLabel_2.setText("                            SUMA DORITA PT DEPUNERE:");
						textField_5.setText("");
						 
					
					};
				 
				};
			};
								 
				
		});
		
		btnNewButton_1_1_1_2.setIcon(new ImageIcon("C:\\Users\\drops\\OneDrive\\Documents\\NetBeansProjects\\ATM2\\button_enter.jpg"));
		btnNewButton_1_1_1_2.setBounds(257, 165, 173, 66);
		panel_4.add(btnNewButton_1_1_1_2);
		
		/*final JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(27, 416, 295, 52);
		frmAtmsystem.getContentPane().add(lblNewLabel_1);*/
		
		 
		 
		 
		
		 
		
		 
		
		 
		
			
		}
}
