package dev.latvian.mods.kubejs.tinkersconstruct;

import com.google.gson.JsonObject;
import dev.latvian.mods.kubejs.recipe.RecipeJS;

public abstract class TinkersRecipeJS extends RecipeJS {
	public JsonObject createFluid(String id, int amount) {
		JsonObject o = new JsonObject();

		if (id.startsWith("#")) {
			o.addProperty("tag", id.substring(1));
		} else {
			o.addProperty("name", id);
		}

		o.addProperty("amount", amount);
		return o;
	}
}
