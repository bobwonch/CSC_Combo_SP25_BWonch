import javax.swing.JFrame;

public class GameDriver {

	public static void main(String[] args) {
		String title = "Bob's Game of Life";
		Conway game = new Conway(15, 30, 20);
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game.grid);
		frame.pack();
		frame.setVisible(true);
		game.mainLoop();
		
	}
}
