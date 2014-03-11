package com.mojang.minecraft.level.tile;

import java.util.Random;

import com.mojang.minecraft.level.Level;

public final class RopeBlock extends FlowerBlock {

    protected RopeBlock(int id) {
        super(id);
        float offset = 0.3F;
        setBounds(0.5F - offset, 0F, 0.5F - offset, offset + 0.5F, offset * 3F, offset + 0.5F);
    }

    @Override
    public final void update(Level level, int x, int y, int z, Random rand) {
        if (id != ROPE.id) {
            int var6 = level.getTile(x, y - 1, z);
            if (level.isLit(x, y, z) && (var6 == DIRT.id || var6 == GRASS.id)) {
                if (rand.nextInt(5) == 0) {
                    level.setTileNoUpdate(x, y, z, 0);
                    if (!level.maybeGrowTree(x, y, z)) {
                        level.setTileNoUpdate(x, y, z, id);
                    }
                }

            } else {
                level.setTile(x, y, z, 0);
            }
        }
    }
}
