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

public class PuffCrystal extends Item {
    public PuffCrystal(Settings settings) {
        super(settings);

    }
        @Override
        public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn,int itemSlot, boolean isSelected){
            if (!worldIn.isClient) {
                if (entityIn instanceof LivingEntity player) {
                    if (player.getOffHandStack().isOf(ModItems.PUFF_CRYSTAL)) {
                        ((LivingEntity) entityIn).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 20, 0));

                    }
                }
            }
        }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("Watch As The Clouds Fly Pass!").formatted(Formatting.GRAY));
        }   else {
            tooltip.add(Text.literal("Press Shift To Show Description").formatted(Formatting.WHITE));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
