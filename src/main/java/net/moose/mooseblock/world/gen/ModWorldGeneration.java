package net.moose.mooseblock.world.gen;

public class ModWorldGeneration {
    public static void  generateModWorldGen(){
        ModTreeGeneration.generateTrees();
        ModOreGeneration.generateOres();
    }
}

