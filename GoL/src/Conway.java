import java.util.Arrays;

public class Conway {
	GridCanvas grid;
	static int printCount = 0;
	public Conway(int rows, int cols, int size) {
		grid = new GridCanvas(rows, cols, size);

		grid.turnOn(2, 1);
		grid.turnOn(2, 2);
		grid.turnOn(2, 3);
		grid.turnOn(1, 7);
		grid.turnOn(2, 7);
		grid.turnOn(3, 7);
	}

	public void mainLoop() {
		while (true) {
			this.update();
			grid.repaint();
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				System.out.println("You shouldn't be here");
			}
		}

	}

	private int countAlive(int r, int c) {
		int count = 0;
		count += grid.test(r - 1, c - 1);
		count += grid.test(r - 1, c);
		count += grid.test(r - 1, c + 1);
		count += grid.test(r, c - 1);
		count += grid.test(r, c + 1);
		count += grid.test(r + 1, c - 1);
		count += grid.test(r + 1, c);
		count += grid.test(r + 1, c + 1);

		return count;
	}

	public void update() {
		int[][] counts = countNeighbors();
		updateGrid(counts);
	}

	private void updateGrid(int[][] counts) {
		int rows = grid.numRow();
		int cols = grid.numCols();
		if(printCount < 10)
		{
			System.out.println(Arrays.toString(counts[0]));
			printCount++;
		}
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				Cell cell = grid.getCell(r, c);
				updateCell(cell, counts[r][c]);
			}
		}

	}

	private static void updateCell(Cell cell, int count) {
		if (cell.isOn()) {
			if (count < 2 || count > 3) {
				cell.turnOff();
			}
		} else {
			if (count == 3) {
				cell.turnOn();
			}
		}

	}

	private int[][] countNeighbors() {
		int rows = grid.numRow();
		int cols = grid.numCols();

		int[][] counts = new int[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				counts[r][c] = countAlive(r, c);
			}
		}
		return counts;
	}
}
