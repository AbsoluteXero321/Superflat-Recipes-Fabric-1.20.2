package net.xero.superflat.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xero.superflat.SuperflatRecipes;
import net.minecraft.item.Item;

public class ModItems {

    public static final Item END_STRING = registerItem("end_string", new Item(new FabricItemSettings()));
    public static final Item SPAWNER_CORE = registerItem("spawner_core", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(END_STRING);
        entries.add(SPAWNER_CORE);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SuperflatRecipes.MOD_ID, name), item);
    }
    public static void registerModItems() {
        SuperflatRecipes.LOGGER.info("Registering Mod Items for " + SuperflatRecipes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
