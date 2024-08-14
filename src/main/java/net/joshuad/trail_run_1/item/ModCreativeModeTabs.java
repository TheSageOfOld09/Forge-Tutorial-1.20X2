package net.joshuad.trail_run_1.item;

import block.ModBlocks;
import net.joshuad.trail_run_1.Trial_Run_1;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Trial_Run_1.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ORES_EXTENDED = CREATIVE_MODE_TABS.register("ores_extended",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.ores_extended"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.AQUAMARINE.get());

                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.AQUAMARINE_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
