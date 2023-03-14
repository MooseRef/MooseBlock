package net.moose.mooseblock.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DiceIcosahedronItem extends Item {

    public DiceIcosahedronItem(Settings settings) {
        super(settings);
    }




    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand)
    {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            outputRandomNumber(user);
            outputRandomNumberRoll(user);
            user.getItemCooldownManager().set(this, 100);


        }
        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("roll.twentytooltip").formatted(Formatting.DARK_PURPLE));

        } else {
            tooltip.add(Text.translatable("roll.tooltip").formatted(Formatting.LIGHT_PURPLE));
        }


        super.appendTooltip(stack, world, tooltip, context);
    }

   private void outputRandomNumber(PlayerEntity player) {
        player.sendMessage(Text.translatable("roll.outcome"));
    }

    private void outputRandomNumberRoll(PlayerEntity player) {
        player.sendMessage(Text.literal("!!!  " + getRandomNumber() + "  !!!"));
    }


    private int getRandomNumber() {
        return Random.createLocal().nextBetween(1,20);
}



}
