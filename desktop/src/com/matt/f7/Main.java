package com.matt.f7;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.matt.f7.F7;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class Main {
	public static void main(String[] args) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("F7");
		//config.setWindowedMode(1920, 1080);
		config.setFullscreenMode(Lwjgl3ApplicationConfiguration.getDisplayMode());
		config.setForegroundFPS(60);
		Lwjgl3Application game = new Lwjgl3Application(new F7(), config);
	}
}
