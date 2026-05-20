package new_crash.datagen.lang;


import new_crash.item.Enderite;
import new_crash.item.EnderiteChestplate;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static new_crash.item.Items.ENDERITE;
import static new_crash.item.Items.ENDERITE_CHESTPLATE;

public class EnglishLangProvider extends FabricLanguageProvider {
    public static final String LANGUAGE_CODE = "en_us";

    public EnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, LANGUAGE_CODE, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider holderLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ENDERITE_CHESTPLATE, EnderiteChestplate.ENGLISH_NAME);
        translationBuilder.add(EnderiteChestplate.TOOL_TIP_TRANSLATION_KEY, EnderiteChestplate.ENGLISH_TOOL_TIP);

        translationBuilder.add(ENDERITE, Enderite.ENGLISH_NAME);
    }
}
