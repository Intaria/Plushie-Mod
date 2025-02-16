package com.link.plushies.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WardenPlushie extends Plushie {
    public WardenPlushie() {
        super(Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.6F));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        switch (dir) {
            case NORTH:
                return Shapes.box(0.15f, 0f, 0.25f, 0.85f, 1.15f, 0.6f);
            case SOUTH:
                return Shapes.box(0.15f, 0f, 0.45f, 0.95f, 1.15f, 0.7f);
            case EAST:
                return Shapes.box(0.35f, 0f, 0.25f, 0.65f, 1.151f, 0.85f);
            case WEST:
                return Shapes.box(0.25f, 0f, 0.1f, 0.65f, 1.15f, 0.85f);
            default:
                return Shapes.block();
        }
    }
}
