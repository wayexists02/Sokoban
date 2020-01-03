package game;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class SokobanGUI extends JPanel {
	private int stage = 1;
	private boolean start = false;
	
	private static SokobanGUI inst = null;
	public static SokobanGUI getInstance() {
		if (inst == null)
			inst = new SokobanGUI();
		return inst;
	}
	private SokobanGUI() {
		
	}
	
	public void start() {
		JFrame frm = createFrame("Sokoban", 800, 600);
		
		JMenuBar jmb = createMenuBar();
		frm.setJMenuBar(jmb);		
		
		frm.add(this);
		frm.setResizable(false);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2d.setBackground(new Color(255, 200, 200));
		g2d.clearRect(0, 0, getWidth(), getHeight());
		
		SokobanManager manager = SokobanManager.getInstance();
		int[][] origBoard = Board.BOARDS[stage-1];
		int[][] board = manager.getBoard();
		
		int y = origBoard.length;
		int x = origBoard[0].length;
		
		int wlen = getWidth()/x;
		int hlen = getHeight()/y;
		
		if (!start) {
			for (int i = 0; i < y; i++) {
				for (int j = 0; j < x; j++) {
					switch (origBoard[i][j]) {
					case Board.BLOCK :
						g2d.setPaint(new Color(30, 10, 10));
						g2d.fillRect(j * wlen, i * hlen, wlen, hlen);
						break;
					case Board.OBJECT :
						g2d.setPaint(new Color(100, 70, 70));
						g2d.fillRect(j * wlen + wlen/10, i * hlen + hlen/10, wlen * 4/5, hlen * 4/5);
						break;
					case Board.BLANK :
						g2d.setPaint(new Color(255, 200, 200));
						g2d.fillRect(j * wlen, i * hlen, wlen, hlen);
						break;
					case Board.TARGET :
						g2d.setPaint(Color.GRAY);
						g2d.fillOval(j * wlen, i * hlen, wlen, hlen);
						break;
					case Board.PLAYER :
						g2d.setPaint(Color.BLUE);
						g2d.fillOval(j * wlen, i * hlen, wlen, hlen);
						break;
					}
				}
			}
			start = true;
		}
		else {
			for (int i = 0; i < y; i++) {
				for (int j = 0; j < x; j++) {
					if (origBoard[i][j] == Board.TARGET && board[i][j] == Board.BLANK) {
						g2d.setPaint(Color.GRAY);
						g2d.fillOval(j * wlen, i * hlen, wlen, hlen);
					}
					else {
						switch (board[i][j]) {
						case Board.BLOCK :
							g2d.setPaint(new Color(30, 10, 10));
							g2d.fillRect(j * wlen, i * hlen, wlen, hlen);
							break;
						case Board.OBJECT :
							g2d.setPaint(new Color(100, 70, 70));
							g2d.fillRect(j * wlen + wlen/10, i * hlen + hlen/10, wlen * 4/5, hlen * 4/5);
							break;
						case Board.BLANK :
							g2d.setPaint(new Color(255, 200, 200));
							g2d.fillRect(j * wlen, i * hlen, wlen, hlen);
							break;
						case Board.TARGET :
							g2d.setPaint(Color.GRAY);
							g2d.fillOval(j * wlen, i * hlen, wlen, hlen);
							break;
						case Board.PLAYER :
							g2d.setPaint(Color.BLUE);
							g2d.fillOval(j * wlen, i * hlen, wlen, hlen);
							break;
						}
					}
				}
			}
		}
	}
	
	public void endGame() {
		JOptionPane.showMessageDialog(null, "Congraturation!", "End Game", JOptionPane.INFORMATION_MESSAGE);
	}
	public void nextStageMessage() {
		JOptionPane.showMessageDialog(null, "Good! Click to go next round.", "Next", JOptionPane.INFORMATION_MESSAGE);
	}
	private JFrame createFrame(String title, int width, int height) {
		JFrame frm = new JFrame(title);
		frm.setSize(width, height);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		int xPos = (int)((tk.getScreenSize().getWidth() - width)/2);
		int yPos = (int)((tk.getScreenSize().getHeight() - height)/2);
		frm.setLocation(xPos, yPos);
		
		frm.addKeyListener(new FrameKeyListener());
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		return frm;
	}
	private JMenuBar createMenuBar() {
		JMenuBar mb = new JMenuBar();
		
		JMenu mOption = new JMenu("Option");
		
		JMenuItem miNew = new JMenuItem("New Game");
		miNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stage = 1;
				SokobanManager.getInstance().restart();
			}
		});
		mOption.add(miNew);
		
		JMenuItem miRestart = new JMenuItem("Restart");
		miRestart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SokobanManager.getInstance().restart();
			}
		});
		mOption.add(miRestart);
		
		JMenuItem miExit = new JMenuItem("Exit");
		miExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mOption.add(miExit);
		
		mb.add(mOption);
		
		return mb;
	}
	public int getStage() { return stage; }
	public void nextStage() { 
		stage++;
		start = false;
	}
}