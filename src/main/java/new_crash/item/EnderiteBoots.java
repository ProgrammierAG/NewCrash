package new_crash.item;


import net.minecraft.world.item.Item;

import com.mojang.serialization.Codec;
import new_crash.NewCrash;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Consumer;



public class EnderiteBoots extends Item {
    public static final String NAME_ID = "enderite_boots";
    public static final String ENGLISH_NAME = "Enderite Boots";
    public static final String GERMAN_NAME = "Enderite Stiefel";

    public static final ResourceKey<Item> ITEM_KEY = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(NewCrash.MOD_ID, NAME_ID));

    public static final String TOOL_TIP_TRANSLATION_KEY = "item." + ITEM_KEY.identifier() + ".tool_tip";
    public static final String ENGLISH_TOOL_TIP = "";
    public static final String GERMAN_TOOL_TIP = "";







    EnderiteBoots() {
        super(new Properties()
                .setId(ITEM_KEY)
                .stacksTo(1)
                .rarity(Rarity.UNCOMMON)
                .humanoidArmor(Enderite.ARMOR_MATERIAL, ArmorType.BOOTS)
                .durability(ArmorType.BOOTS.getDurability(Enderite.BASE_DURABILITY))
        );
    }


    public ResourceKey<Item> getItemKey() {
        return ITEM_KEY;
    }
}

