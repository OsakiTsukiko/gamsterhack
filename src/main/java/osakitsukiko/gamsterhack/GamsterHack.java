package osakitsukiko.gamsterhack;

import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import osakitsukiko.gamsterhack.modules.*;
import org.slf4j.Logger;

public class GamsterHack extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Gamster Hack");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Gamster Hack");

        // Modules
        Modules.get().add(new AutoPanic());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {

        return "osakitsukiko.gamsterhack";
    }
}
