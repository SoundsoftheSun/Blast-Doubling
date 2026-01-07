package net.soundsofthesun.blastdoubling.attachment;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record BRDoubling(Integer denominator) {
    public static Codec<BRDoubling> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("denominator").forGetter(BRDoubling::denominator)
    ).apply(instance, BRDoubling::new));

    public static BRDoubling DEFAULT = new BRDoubling(4);
}
