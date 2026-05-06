package new_crash.item;


import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

    public class Items {

        public static final Enderite ENDERITE = register(Enderite::new, Enderite.ITEM_KEY);




        public static <T extends Item> T register(Supplier<T> itemFactory, ResourceKey<Item> key) {
            T item = itemFactory.get();

            Registry.register(BuiltInRegistries.ITEM, key, item);
            return item;
        }

        public static void initialize() {}
    }



