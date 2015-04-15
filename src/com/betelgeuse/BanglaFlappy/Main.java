package com.betelgeuse.BanglaFlappy;

import com.badlogic.gdx.*;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "বাংলাফ্ল্যাপি";
		cfg.useGL20 = false;
		cfg.width = 288;
		cfg.height = 512;
		cfg.useGL20 = true;
		cfg.addIcon("data/logo.png", Files.FileType.Internal);
		new LwjglApplication(new BFGame(), cfg);
	}
}