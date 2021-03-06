package tk.zenithseeker.sectionsign.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.SharedConstants;

@Mixin(SharedConstants.class)
public class SharedConstantsMixin {
	@Overwrite
	public static boolean isAllowedChatCharacter(char chr) {
		return chr >= ' ' && chr != '\u007f';
	}
}
