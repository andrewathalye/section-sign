package tk.zenithseeker.sectionsign.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.ChatFormatting;

@Mixin(ChatFormatting.class)
public class ChatFormattingMixin {
	@Overwrite
	public static String stripFormatting(String string) {
		return string;
	}
}
