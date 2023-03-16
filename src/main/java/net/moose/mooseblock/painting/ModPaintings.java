package net.moose.mooseblock.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moose.mooseblock.mooseblock;

public class ModPaintings {

    public static final PaintingVariant WIDEPEEPOAUSSIE = registerPainting("widepeepoaussie",
            new PaintingVariant(64,32));
    public static final PaintingVariant SOKKA_MISERY = registerPainting("sokka_misery",
            new PaintingVariant(32,32));
    public static final PaintingVariant NUTWIT = registerPainting("nutwit",
            new PaintingVariant(32,32));


    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(mooseblock.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        mooseblock.LOGGER.debug("Registering Paintings for " + mooseblock.MOD_ID);
    }



}
