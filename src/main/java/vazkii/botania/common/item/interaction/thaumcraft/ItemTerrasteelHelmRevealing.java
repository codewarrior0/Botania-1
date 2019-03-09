/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 *
 * File Created @ [Jul 28, 2014, 6:22:51 PM (GMT)]
 */
package vazkii.botania.common.item.interaction.thaumcraft;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;
import vazkii.botania.client.lib.LibResources;
import vazkii.botania.common.core.handler.ConfigHandler;
import vazkii.botania.common.item.equipment.armor.terrasteel.ItemTerrasteelHelm;
import vazkii.botania.common.lib.LibItemNames;

public class ItemTerrasteelHelmRevealing extends ItemTerrasteelHelm {

	public ItemTerrasteelHelmRevealing(Properties props) {
		super(props);
	}

	@Override
	public String getArmorTextureAfterInk(ItemStack stack, EntityEquipmentSlot slot) {
		return ConfigHandler.enableArmorModels ?  LibResources.MODEL_TERRASTEEL_NEW : LibResources.MODEL_TERRASTEEL_2;
	}

}