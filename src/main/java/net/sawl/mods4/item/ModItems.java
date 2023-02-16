package net.sawl.mods4.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sawl.mods4.TutorialMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> Zircon = ITEMS.register("zircon",
            () -> new Item(new Item.Properties() .tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_Zircon = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties() .tab(CreativeModeTab.TAB_MISC)));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}