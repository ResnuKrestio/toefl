package toefl.main.exercise.view;

import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ScoreFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;	

	/**
	 * Create the frame.
	 */
	public ScoreFrame(int score) {
		setType(Type.UTILITY);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Score");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelScore = new JPanel();
		panelScore.setBounds(0, 0, 444, 176);
		contentPane.add(panelScore);
		panelScore.setLayout(null);
		
		JLabel lblYourScoreIs = new JLabel("Your Score is");
		lblYourScoreIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourScoreIs.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblYourScoreIs.setBounds(151, 11, 135, 22);
		panelScore.add(lblYourScoreIs);
		
		JLabel lblScore = new JLabel(Integer.toString(score));
		lblScore.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblScore.setBounds(198, 44, 50, 50);
		panelScore.add(lblScore);
		
		JButton btnSaveToMyb = new JButton("SAVE TO MY PROGRESS");
		btnSaveToMyb.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSaveToMyb.setBounds(10, 142, 160, 30);
		panelScore.add(btnSaveToMyb);
		
		JButton btnNewButton = new JButton("CANCEL");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(274, 142, 160, 30);
		panelScore.add(btnNewButton);
		
	}
}
