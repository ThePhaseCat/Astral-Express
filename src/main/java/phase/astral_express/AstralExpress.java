package phase.astral_express;

import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AstralExpress implements ModInitializer
{
    public static final String MOD_ID = "astral_express";

    private static final ItemGroup AstralExpressItemGroup = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ItemInit.TEST))
            .displayName(Text.translatable("Astral Express"))
            .entries((context, entries) ->{
                entries.add(new ItemStack(ItemInit.TEST));
            })
            .build();

    @Override
    public void onInitialize() {
        System.out.println("Astral Express Main initializing");

        FieldRegistrationHandler.register(ItemInit.class, MOD_ID, false);
        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "astral_express"), AstralExpressItemGroup);

        System.out.println("Astral Express Main initialized");
    }
}
