package phase.astral_express;

import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AstralExpress implements ModInitializer
{
    public static final String MOD_ID = "astral_express";

    //items
    public static final Item CUSTOM_ITEM =
            Registry.register(Registries.ITEM, new Identifier("tutorial", "custom_item"),
                    new Item(new FabricItemSettings()));

    @Override
    public void onInitialize() {
        System.out.println("Astral Express Main initializing");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.add(CUSTOM_ITEM);
        });

        System.out.println("Astral Express Main initialized");
    }
}
