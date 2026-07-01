package new_crash.datagen;

import new_crash.item.Items;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerator) { }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(Items.ENDERITE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.ENDERITE_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.ENDERITE_BOOTS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.ENDERITE_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(Items.ENDERITE_HELMET, ModelTemplates.FLAT_ITEM);
    }


    @Override
    public String getName() {
        return "NewCrashModelProvider";
    }
}