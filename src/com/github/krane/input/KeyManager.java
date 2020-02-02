package com.github.krane.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{

	
	
	private boolean[] keys;
	
	public boolean up, down, left, right;
	
	public boolean shift, q;
	
	public KeyManager()
	{
		keys = new boolean[256];
	}
	
	
	public void tick() {
		up = keys[KeyEvent.VK_UP];
		down = keys[KeyEvent.VK_DOWN];
		left = keys[KeyEvent.VK_LEFT];
		right = keys[KeyEvent.VK_RIGHT];
		shift = keys[KeyEvent.VK_SHIFT];
		q = keys[KeyEvent.VK_Q];
		
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {

		
	}

	
	
	
}
