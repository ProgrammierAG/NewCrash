package new_crash.datagen;

import java.util.concurrent.CompletableFuture;

import static new_crash.item.Items.ENDERITE;
import static new_crash.item.Items.ENDERITE_CHESTPLATE;
import static net.minecraft.world.item.Items.ENDER_PEARL;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;



public class RecipeProvider extends FabricRecipeProvider {

    public RecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected net.minecraft.data.recipes.RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput output) {
        return new net.minecraft.data.recipes.RecipeProvider(registryLookup, output) {
            @Override
            public void buildRecipes() {

                shaped(RecipeCategory.COMBAT, ENDERITE_CHESTPLATE)
                        .pattern("ABA")
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', ENDERITE)
                        .define('B', ENDER_PEARL)
                        .unlockedBy(getHasName(ENDER_PEARL), has(ENDERITE))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "NewCrashRecipeProvider";
    }
}