package new_crash.items;

import new_crash.MinecraftBaseMod;
import new_crash.NewCrash;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;


public class Enderite extends ModItems {
        public static final String NAME_ID = "Enderite";
        public static final String ENGLISH_NAME = "Enderite";
        public static final String GERMAN_NAME = "Enderite";

    public static final ResourceKey<Item> ITEM_KEY = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MinecraftBaseMod.MOD_ID, NAME_ID));

    public Enderite() {
        super(new Properties().setId(ITEM_KEY));
    }

    @Override
    public ResourceKey<Item> getItemKey() {
        return ITEM_KEY;
    }
}
