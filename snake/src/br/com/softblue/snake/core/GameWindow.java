package br.com.softblue.snake.core;

import java.awt.Graphics;

import javax.swing.JFrame;

import br.com.softblue.snake.graphics.Renderer;
import br.com.softblue.snake.scene.Background;
import br.com.softblue.snake.scene.Snake;
import br.com.softblue.snake.util.Constants;

@SuppressWarnings("serial")
public class GameWindow extends JFrame {
	private Renderer renderer;

	public GameWindow() {
		renderer = new Renderer();
		
		Background background = new Background();
		renderer.add(background);
		
		Snake snake = new Snake();
		renderer.add(snake);
		
		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		setResizable(false);
		setTitle(Constants.WINDOW_TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public Renderer getRenderer() {
		return renderer;
	}
	
	@Override
	public void paint(Graphics g) {
		renderer.render(g);
	}
}
