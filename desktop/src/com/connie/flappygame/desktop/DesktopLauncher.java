package com.connie.flappygame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.connie.flappygame.FlappyGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width=FlappyGame.WIDTH;
		config.height=FlappyGame.HEIGHT;
		config.title=FlappyGame.TITLE;
		new LwjglApplication(new FlappyGame(), config);
	}
}
