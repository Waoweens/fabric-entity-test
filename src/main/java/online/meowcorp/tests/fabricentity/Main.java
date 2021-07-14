package online.meowcorp.tests.fabricentity;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

    public static String modid = "fabric-entity-test";

    public static final ItemGroup FABRIC_ENTITY_TEST = FabricItemGroupBuilder.build(
            new Identifier(modid, "fabric_entity_test"),
            () -> new ItemStack(Blocks.BEDROCK)
    );

    public static final Item FORTNITE_CARD = new Item(
            new FabricItemSettings()
            .group(Main.FABRIC_ENTITY_TEST)
    );

    @Override
    public void onInitialize() {

        Registry.register(Registry.ITEM, new Identifier(modid, "fortnite_card"), FORTNITE_CARD);

    }
}
