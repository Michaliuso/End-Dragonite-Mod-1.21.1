package com.michaliu.enddragonite.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.michaliu.enddragonite.EndDragoniteMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Dragonite_Shard = registerItem("dragonite_shard", new Item(new Item.Settings()));
    public static final Item Dragonite_Gem = registerItem("dragonite_gem", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EndDragoniteMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EndDragoniteMod.LOGGER.info("Registering Mod Items for " + EndDragoniteMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(Dragonite_Shard);
            entries.add(Dragonite_Gem);
        });
    }
}