package new_crash.items;


import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import java.util.function.Supplier;

    public class Items {

        public static final Enderite ENDERITE = register(Enderite::new);



        public static <T extends Items> T register(Supplier<T> itemFactory) {
            T item = itemFactory.get();

            Registry.register(BuiltInRegistries.ITEM, item.getItemKey(), item);
            return item;
        }

        public static void initialize() {}
    }



