package new_crash.datagen;


import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import new_crash.items.Enderite;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {valueLookupBuilder(Enderite.REPAIRS_ENDERITE_ARMOR)
            .add(Items.ENDER_PEARL)
            .setReplace(false);
    }
}