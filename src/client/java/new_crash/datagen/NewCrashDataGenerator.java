package new_crash.datagen;

import new_crash.datagen.ItemTagProvider;
import new_crash.datagen.ModelProvider;
import new_crash.datagen.RecipeProvider;
import new_crash.datagen.lang.EnglishLangProvider;
import new_crash.datagen.lang.GermanLangProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;


public class NewCrashDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(EnglishLangProvider::new);
		pack.addProvider(GermanLangProvider::new);
		pack.addProvider(ModelProvider::new);
		pack.addProvider(RecipeProvider:: new);
		pack.addProvider(ItemTagProvider:: new);

	}
}
