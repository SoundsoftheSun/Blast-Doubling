package net.soundsofthesun.blastdoubling.attachment;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record BRBonus(Integer multiplier) {
    public static Codec<BRBonus> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("multiplier").forGetter(BRBonus::multiplier)
    ).apply(instance, BRBonus::new));

    public static BRBonus DEFAULT = new BRBonus(1);
}
