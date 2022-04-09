package com.matt.f7.entities.classes;

import java.util.*;

import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.physics.box2d.*;

/*
Notes:
Here's how Christos did things:
Sprite for Jump God
https://github.com/ChristosPsimadas/Jump_God/blob/master/core/src/com/shlad/berserk/Sprites/JumpGod.java

But input is handled here:
https://github.com/ChristosPsimadas/Jump_God/blob/master/core/src/com/shlad/berserk/Screens/PlayScreen.java

TODO: follow along with this vid to learn more libgdx
https://www.youtube.com/watch?v=43DrvCp9-is
*/

public class Player extends Sprite {
	private String name;
    private double health, tempHealth;
    private int exp, level, x, y;
    private int equippedIndex;

	// these should be responsible for taking care of the physics
	private World world;
	private Body body;
	private int walkSpeed = 200;
	private int sprintSpeed = 330;

	//! following is commented because those classes don't exist yet
	//! i am copying this stuff from the original F7
    // private Weapon[] weapons = new Weapon[4];
    // private Shield shield;

	// private HashMap<Consumable, Integer> consumablesHashMap = new HashMap<>();private HashMap<Consumable, In

	//TODO: create constructor for new char and loaded char
	public Player(Texture texture) {
		super(texture);
	}

	public Player(String name) {
		super(new Texture("badlogic.jpg"));
		this.name = name;
		this.health = 100;
		this.tempHealth = 100;
		this.exp = 0;
		this.level = 1;
		this.x = 0;
		this.y = 0;
		this.equippedIndex = 0;
	}
}
