package phase.astral_express;

import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;

import static net.minecraft.item.Items.register;

public class ItemInit implements ItemRegistryContainer
{
    public static final Item TEST = new Item(new FabricItemSettings());
}
