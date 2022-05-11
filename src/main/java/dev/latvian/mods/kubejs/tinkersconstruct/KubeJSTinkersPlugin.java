package dev.latvian.mods.kubejs.tinkersconstruct;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.RegisterRecipeHandlersEvent;
import net.minecraft.resources.ResourceLocation;

/**
 * @author LatvianModder
 */
public class KubeJSTinkersPlugin extends KubeJSPlugin {
	@Override
	public void addRecipes(RegisterRecipeHandlersEvent event) {
		event.register(new ResourceLocation("tconstruct:casting_table"), CastingTableRecipeJS::new);
		event.register(new ResourceLocation("tconstruct:casting_basin"), CastingBasinRecipeJS::new);
	}
}