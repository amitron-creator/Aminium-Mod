package fr.amitron.aminium.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

public class KillerSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth(0);
	}
}
