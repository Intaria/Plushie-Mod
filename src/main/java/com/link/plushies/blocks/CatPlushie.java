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


public class CatPlushie extends Plushie {
    public CatPlushie() {
        super(Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.7f));

    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        switch (dir) {
            case NORTH:
                return Shapes.box(0.35f, 0f, 0f, 0.7f, 0.55f, 1f);
            case SOUTH:
                return Shapes.box(0.35f, 0f, 0f, 0.7f, 0.551f, 1f);
            case EAST:
                return Shapes.box(0f, 0f, 0.35f, 1f, 0.55f, 0.7f);
            case WEST:
                return Shapes.box(0f, 0f, 0.35f, 1f, 0.551f, 0.7f);
            default:
                return Shapes.block();
        }
    }


}
