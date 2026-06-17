package new_crash;



//import new_crash.commands.AbilityPointsCommands;
//import minecraft_base_mod.items.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
        import net.minecraft.commands.Commands;
        import new_crash.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NewCrash implements ModInitializer {
    public static final String MOD_ID = "new_crash";

    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        LOGGER.info("Hello Fabric world!");



        Items.initialize();



        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            var root = Commands.literal("points");



            dispatcher.register(root);
        });
    }
}