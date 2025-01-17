package gregification.config;

import gregification.common.GFValues;
import net.minecraftforge.common.config.Config;

@Config(modid = GFValues.MODID)
public class GFConfig {

    @Config.Comment("Config options for Ex Nihilo features")
    public static ExNihiloCfg exNihilo = new ExNihiloCfg();

    @Config.Comment("Config options for Open Computers features")
    public static OpenComputersCfg openComputers = new OpenComputersCfg();

    @Config.Comment("Config options for Forestry features")
    public static ForestryCfg forestry = new ForestryCfg();

    @Config.Comment("Config options for Mystical Agriculture features")
    public static MysticalAgricultureCfg mysticalAgriculture = new MysticalAgricultureCfg();

}
