package com.projectkorra.projectkorra.ability;

import com.projectkorra.projectkorra.util.ParticleEffect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

import com.projectkorra.projectkorra.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class PlantAbility extends WaterAbility implements SubAbility {

	public PlantAbility(final Player player) {
		super(player);
	}

	@Override
	public Class<? extends Ability> getParentAbility() {
		return WaterAbility.class;
	}

	@Override
	public Element getElement() {
		return Element.PLANT;
	}

	// Because Plantbending deserves particles too!
	public void playPlantbendingParticles(final Location loc, final int amount, final double xOffset, final double yOffset, final double zOffset) {
			loc.getWorld().spawnParticle(Particle.BLOCK_CRACK, loc, amount, xOffset, yOffset, zOffset, Material.OAK_LEAVES);
	}

}
