package net.moose.mooseblock.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.moose.mooseblock.block.ModBlocks;
import net.moose.mooseblock.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {

    public ModRecipeGenerator(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter)
    {
        // FIX PLANKS AFTER ITEMS TAGS
        // offerPlanksRecipe(exporter,ModBlocks.MOOD_PLANKS, ItemTags.OAK_LOGS,4);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModBlocks.MOOD_WOOD)
                .pattern("XX")
                .pattern("XX")
                .pattern("  ")
                .input('X',ModBlocks.MOOD_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MOOD_LOG),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MOOD_LOG))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.MOOD_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModBlocks.STRIPPED_MOOD_WOOD)
                .pattern("XX")
                .pattern("XX")
                .pattern("  ")
                .input('X',ModBlocks.STRIPPED_MOOD_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_MOOD_LOG),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_MOOD_LOG))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.STRIPPED_MOOD_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STICK, 4)
                .pattern("X")
                .pattern("X")
                .pattern(" ")
                .input('X',ModBlocks.MOOD_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MOOD_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MOOD_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.STICK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOOD_STAIRS, 4)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .input('X',ModBlocks.MOOD_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MOOD_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MOOD_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.MOOD_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOOD_SLAB, 3)
                .pattern("   ")
                .pattern("   ")
                .pattern("XXX")
                .input('X',ModBlocks.MOOD_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MOOD_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MOOD_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.MOOD_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CRAFTING_TABLE)
                .pattern("XX")
                .pattern("XX")
                .pattern("  ")
                .input('X',ModBlocks.MOOD_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MOOD_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MOOD_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.CRAFTING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CARTOGRAPHY_TABLE)
                .pattern("PP")
                .pattern("XX")
                .pattern("XX")
                .input('X',ModBlocks.MOOD_PLANKS)
                .input('P',Items.PAPER)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MOOD_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MOOD_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.CARTOGRAPHY_TABLE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CHEST)
                .pattern("XXX")
                .pattern("X X")
                .pattern("XXX")
                .input('X',ModBlocks.MOOD_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MOOD_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MOOD_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.CHEST)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BARREL)
                .pattern("XxX")
                .pattern("X X")
                .pattern("XxX")
                .input('X',ModBlocks.MOOD_PLANKS)
                .input('x',ModBlocks.MOOD_SLAB)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MOOD_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MOOD_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.BARREL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WOODEN_AXE)
                .pattern("XX")
                .pattern("XS")
                .pattern(" S")
                .input('X',ModBlocks.MOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MOOD_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MOOD_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.WOODEN_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WOODEN_HOE)
                .pattern("XX")
                .pattern(" S")
                .pattern(" S")
                .input('X',ModBlocks.MOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MOOD_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MOOD_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.WOODEN_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WOODEN_SHOVEL)
                .pattern("X")
                .pattern("S")
                .pattern("S")
                .input('X',ModBlocks.MOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MOOD_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MOOD_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.WOODEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WOODEN_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("S")
                .input('X',ModBlocks.MOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MOOD_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MOOD_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.WOODEN_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WOODEN_PICKAXE)
                .pattern("XXX")
                .pattern(" S ")
                .pattern(" S ")
                .input('X',ModBlocks.MOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MOOD_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MOOD_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.WOODEN_PICKAXE)));


        offerSmelting(exporter, List.of(ModItems.RAW_GOXITE), RecipeCategory.MISC, ModItems.GOXITE,
                0.5f, 200,"moosite");
        offerBlasting(exporter, List.of(ModItems.RAW_GOXITE), RecipeCategory.MISC, ModItems.GOXITE,
                0.5f, 100,"moosite");
        offerSmelting(exporter, List.of(ModBlocks.GOXITE_ORE), RecipeCategory.MISC, ModItems.GOXITE,
                0.5f, 200,"moosite");
        offerBlasting(exporter, List.of(ModBlocks.GOXITE_ORE), RecipeCategory.MISC, ModItems.GOXITE,
                0.5f, 100,"moosite");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_GOXITE_ORE), RecipeCategory.MISC, ModItems.GOXITE,
                0.5f, 200,"moosite");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_GOXITE_ORE), RecipeCategory.MISC, ModItems.GOXITE,
                0.5f, 100,"moosite");

        offerSmelting(exporter, List.of(ModItems.RAW_BORPITE), RecipeCategory.MISC, ModItems.BORPITE,
                0.5f, 200,"moosite");
        offerBlasting(exporter, List.of(ModItems.RAW_BORPITE), RecipeCategory.MISC, ModItems.BORPITE,
                0.5f, 100,"moosite");
        offerSmelting(exporter, List.of(ModBlocks.BORPITE_ORE), RecipeCategory.MISC, ModItems.BORPITE,
                0.5f, 200,"moosite");
        offerBlasting(exporter, List.of(ModBlocks.BORPITE_ORE), RecipeCategory.MISC, ModItems.BORPITE,
                0.5f, 100,"moosite");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_BORPITE_ORE), RecipeCategory.MISC, ModItems.BORPITE,
                0.5f, 200,"moosite");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_BORPITE_ORE), RecipeCategory.MISC, ModItems.BORPITE,
                0.5f, 100,"moosite");

        offerSmelting(exporter, List.of(ModBlocks.MOOSITE_ORE), RecipeCategory.MISC, ModItems.MOOSITE,
                0.5f, 200,"moosite");
        offerBlasting(exporter, List.of(ModBlocks.MOOSITE_ORE), RecipeCategory.MISC, ModItems.MOOSITE,
                0.5f, 100,"moosite");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_MOOSITE_ORE), RecipeCategory.MISC, ModItems.MOOSITE,
                0.5f, 200,"moosite");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_MOOSITE_ORE), RecipeCategory.MISC, ModItems.MOOSITE,
                0.5f, 100,"moosite");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_GNEISS, 4)
                .pattern("XX ")
                .pattern("XX ")
                .pattern("   ")
                .input('X',ModBlocks.GNEISS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.GNEISS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.GNEISS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.POLISHED_GNEISS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GNEISS_STAIRS, 4)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .input('X',ModBlocks.GNEISS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.GNEISS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.GNEISS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.GNEISS_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GNEISS_SLAB, 3)
                .pattern("   ")
                .pattern("   ")
                .pattern("XXX")
                .input('X',ModBlocks.GNEISS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.GNEISS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.GNEISS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.GNEISS_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_GNEISS_STAIRS, 4)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .input('X',ModBlocks.POLISHED_GNEISS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_GNEISS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_GNEISS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.POLISHED_GNEISS_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_GNEISS_SLAB, 3)
                .pattern("   ")
                .pattern("   ")
                .pattern("XXX")
                .input('X',ModBlocks.POLISHED_GNEISS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_GNEISS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_GNEISS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.POLISHED_GNEISS_SLAB)));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GOXITE, RecipeCategory.DECORATIONS,
                ModBlocks.BLOCK_OF_GOXITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_GOXITE, RecipeCategory.DECORATIONS,
                ModBlocks.BLOCK_OF_RAW_GOXITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BORPITE, RecipeCategory.DECORATIONS,
                ModBlocks.BLOCK_OF_BORPITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_BORPITE, RecipeCategory.DECORATIONS,
                ModBlocks.BLOCK_OF_RAW_BORPITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOOSITE, RecipeCategory.DECORATIONS,
                ModBlocks.BLOCK_OF_MOOSITE);

        offerSingleOutputShapelessRecipe(exporter,ModItems.TOMATO_SEEDS,ModItems.TOMATO,"tomato_seeds");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.GOXITE_BOOTS)
                .pattern("   ")
                .pattern("X X")
                .pattern("X X")
                .input('X',ModItems.GOXITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.GOXITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.GOXITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.GOXITE_BOOTS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.GOXITE_CHESTPLATE)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .input('X',ModItems.GOXITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.GOXITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.GOXITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.GOXITE_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.GOXITE_LEGGINGS)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .input('X',ModItems.GOXITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.GOXITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.GOXITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.GOXITE_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.GOXITE_HELMET)
                .pattern("XXX")
                .pattern("X X")
                .pattern("   ")
                .input('X',ModItems.GOXITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.GOXITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.GOXITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.GOXITE_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.GOXITE_AXE)
                .pattern("XX")
                .pattern("XS")
                .pattern(" S")
                .input('X',ModItems.GOXITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.GOXITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.GOXITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.GOXITE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.GOXITE_HOE)
                .pattern("XX")
                .pattern(" S")
                .pattern(" S")
                .input('X',ModItems.GOXITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.GOXITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.GOXITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.GOXITE_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.GOXITE_SHOVEL)
                .pattern("X")
                .pattern("S")
                .pattern("S")
                .input('X',ModItems.GOXITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.GOXITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.GOXITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.GOXITE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.GOXITE_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("S")
                .input('X',ModItems.GOXITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.GOXITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.GOXITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.GOXITE_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.GOXITE_PICKAXE)
                .pattern("XXX")
                .pattern(" S ")
                .pattern(" S ")
                .input('X',ModItems.GOXITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.GOXITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.GOXITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.GOXITE_PICKAXE)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BORPITE_BOOTS)
                .pattern("   ")
                .pattern("X X")
                .pattern("X X")
                .input('X',ModItems.BORPITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BORPITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BORPITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BORPITE_BOOTS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BORPITE_CHESTPLATE)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .input('X',ModItems.BORPITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BORPITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BORPITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BORPITE_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BORPITE_LEGGINGS)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .input('X',ModItems.BORPITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BORPITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BORPITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BORPITE_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BORPITE_HELMET)
                .pattern("XXX")
                .pattern("X X")
                .pattern("   ")
                .input('X',ModItems.BORPITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BORPITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BORPITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BORPITE_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BORPITE_AXE)
                .pattern("XX")
                .pattern("XS")
                .pattern(" S")
                .input('X',ModItems.BORPITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BORPITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BORPITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BORPITE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BORPITE_HOE)
                .pattern("XX")
                .pattern(" S")
                .pattern(" S")
                .input('X',ModItems.BORPITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BORPITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BORPITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BORPITE_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BORPITE_SHOVEL)
                .pattern("X")
                .pattern("S")
                .pattern("S")
                .input('X',ModItems.BORPITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BORPITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BORPITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BORPITE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BORPITE_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("S")
                .input('X',ModItems.BORPITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BORPITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BORPITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BORPITE_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BORPITE_PICKAXE)
                .pattern("XXX")
                .pattern(" S ")
                .pattern(" S ")
                .input('X',ModItems.BORPITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BORPITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BORPITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.BORPITE_PICKAXE)));

        // ADDED MANUALLY UNTIL I FIND A FIX

//        SmithingRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_BOOTS),Ingredient.ofItems(ModItems.MOOSITE),
//                RecipeCategory.MISC, ModItems.MOOSITE_BOOTS);
//        SmithingRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_CHESTPLATE),Ingredient.ofItems(ModItems.MOOSITE),
//                RecipeCategory.MISC, ModItems.MOOSITE_CHESTPLATE);
//        SmithingRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_LEGGINGS),Ingredient.ofItems(ModItems.MOOSITE),
//                RecipeCategory.MISC, ModItems.MOOSITE_LEGGINGS);
//        SmithingRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_HELMET),Ingredient.ofItems(ModItems.MOOSITE),
//                RecipeCategory.MISC, ModItems.MOOSITE_HELMET);
//        SmithingRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_AXE),Ingredient.ofItems(ModItems.MOOSITE),
//                RecipeCategory.MISC, ModItems.MOOSITE_AXE);
//        SmithingRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_HOE),Ingredient.ofItems(ModItems.MOOSITE),
//                RecipeCategory.MISC, ModItems.MOOSITE_HOE);
//        SmithingRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_SHOVEL),Ingredient.ofItems(ModItems.MOOSITE),
//                RecipeCategory.MISC, ModItems.MOOSITE_SHOVEL);
//        SmithingRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_SWORD),Ingredient.ofItems(ModItems.MOOSITE),
//                RecipeCategory.MISC, ModItems.MOOSITE_SWORD);
//        SmithingRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_PICKAXE), Ingredient.ofItems(ModItems.MOOSITE),
//                RecipeCategory.MISC, ModItems.MOOSITE_PICKAXE);



                    }
}
