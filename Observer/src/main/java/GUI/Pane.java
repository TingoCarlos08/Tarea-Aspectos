package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Pane extends JFrame {
	private JPanel PanelPrincipal;
	private JButton btnRojo ;
	private JButton btnVerde ;
	private JButton btnAzul ;
	private JLabel messageLabel;
	
	public Pane() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		PanelPrincipal = new JPanel();
		messageLabel=new JLabel();
		
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelPrincipal);
		
		btnRojo = new JButton("Red");
		btnVerde = new JButton("Green");
		btnAzul = new JButton("Blue");
		
		btnRojo.setBackground(Color.RED);
        btnVerde.setBackground(Color.GREEN);
        btnAzul.setBackground(Color.BLUE);
        btnRojo.setForeground(Color.WHITE);
        btnVerde.setForeground(Color.WHITE);
        btnAzul.setForeground(Color.WHITE);
        btnRojo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        btnVerde.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        btnAzul.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        PanelPrincipal.setLayout(new FlowLayout(FlowLayout.CENTER));
        PanelPrincipal.setPreferredSize(new Dimension(450, 300));

        
		btnRojo.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				ButtonEvent.updateBackground(getPane(),Color.red);
				ButtonEvent.setLabelContent(messageLabel, "red");
				
			}	
				});
		btnAzul.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				ButtonEvent.updateBackground(getPane(),Color.blue);
				ButtonEvent.setLabelContent(messageLabel, "blue");
				
			}	
				});
		btnVerde.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				ButtonEvent.updateBackground(getPane(),Color.green);
				ButtonEvent.setLabelContent(messageLabel, "green");
				
			}	
				});
		PanelPrincipal.add(btnRojo);
		PanelPrincipal.add(btnVerde);
		PanelPrincipal.add(btnAzul);
		
		
		PanelPrincipal.add(messageLabel);
		
	}
	
	public JPanel getPane() {
		return this.PanelPrincipal;
	}
	public JButton getBtnRed() {
		return this.btnRojo;
	}
	public JButton getBtnBlue() {
		return this.btnAzul;
	}
	public JButton getBtnGreen() {
		return this.btnVerde;
	}
	public JLabel getLabel() {
		return this.messageLabel;
	}
}
