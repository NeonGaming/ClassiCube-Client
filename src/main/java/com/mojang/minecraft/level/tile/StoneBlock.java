package com.mojang.minecraft.level.tile;

public final class StoneBlock extends Block {

	public StoneBlock(int var1) {
		super(var1);
	}

	public final int getDrop() {
		return cobblestone.id;
	}
}
