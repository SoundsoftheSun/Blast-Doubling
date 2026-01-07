package net.soundsofthesun.blastdoubling.attachment;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record BRCookTime(Integer multiplier) {
    public static Codec<BRCookTime> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("multiplier").forGetter(BRCookTime::multiplier)
    ).apply(instance, BRCookTime::new));

    public static BRCookTime DEFAULT = new BRCookTime(2);
}
