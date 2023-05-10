package net.prangellplays.hardcorecrystals.item.custom.lvl1;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.prangellplays.hardcorecrystals.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class StrengthCrystal extends Item {
    public StrengthCrystal(Settings settings) {
        super(settings);

    }
    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (!worldIn.isClient) {
            if (entityIn instanceof LivingEntity player) {
                if (player.getOffHandStack().isOf(ModItems.STRENGTH_CRYSTAL)) {
                    ((LivingEntity) entityIn).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20, 0));
                }
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("Gain The Strength Of An Empire!").formatted(Formatting.DARK_RED));
        }   else {
            tooltip.add(Text.literal("Press Shift To Show Description").formatted(Formatting.WHITE));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
