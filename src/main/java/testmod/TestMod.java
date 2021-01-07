package testmod;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TestMod.MODID, name = TestMod.NAME, version = TestMod.VERSION)
public class TestMod
{
    public static final String MODID = "testmod";
    public static final String NAME = "Test Mod";
    public static final String VERSION = "0.0.0.1";
    
    public static final Logger LOGGER = LogManager.getLogger(TestMod.MODID);

    //@SidedProxy(clientSide="com.example.examplemod.ClientOnlyProxy", serverSide="com.example.examplemod.DedicatedServerProxy")
    //public static CommonProxy proxy;
    

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //proxy.preInit();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	//proxy.init();
    	LOGGER.info(TestMod.NAME+" says Hi!");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	//proxy.postInit();
    }
    
    public static String prependModID(String name) {return MODID+":"+name;}
}
