package net.soundsofthesun.blastdoubling;

import net.fabricmc.api.ModInitializer;
import net.soundsofthesun.blastdoubling.attachment.BRAttachments;
import net.soundsofthesun.blastdoubling.command.BRCommands;

public class BlastDoubling implements ModInitializer {

    public static final String MOD_ID = "blast-doubling";

    @Override
    public void onInitialize() {
        BRAttachments.init();
        BRCommands.init();
    }
}
