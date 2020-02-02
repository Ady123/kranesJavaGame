package com.github.krane.entities;

import java.awt.Graphics;

public abstract class Creature extends Entity{

	public static final int default_health = 10;
	public static final float default_speed = 3.0f;
	public static final int default_creature_width = 30,
							default_creature_height = 30;
	
	protected float health;
	protected float maxHealth;
	protected float speed;
	
	public Creature(float x, float y, int width, int height) {
		super(x, y, width, height);
		health = default_health;
		maxHealth = default_health;
		speed = default_speed;
	}

	public float getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(float maxHealth) {
		this.maxHealth = maxHealth;
	}

	public float getHealth() {
		return health;
	}

	public void setHealth(float f) {
		this.health = f;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	
}
