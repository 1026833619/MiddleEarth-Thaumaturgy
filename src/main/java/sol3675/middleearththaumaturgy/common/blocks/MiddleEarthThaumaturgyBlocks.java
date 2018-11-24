package sol3675.middleearththaumaturgy.common.blocks;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import sol3675.middleearththaumaturgy.config.MeetCfg;

public class MiddleEarthThaumaturgyBlocks {
	
	public static Block blockStorage;
	
	public static Block compressedEssentiaJar;
	public static Block x2compressedEssentiaJar;
	public static Block extralargeEssentiaJar;
	
	public static Block bookshelfInventarium;
	
	public static void addBlocks() {
		
		blockStorage = GameRegistry.registerBlock(new BlockStorage(),ItemBlockStorage.class , "Storage");
		
		if(MeetCfg.compressedJars)
		{
			compressedEssentiaJar = GameRegistry.registerBlock(new BlockCompressedEssentiaJars().setBlockName("CompressedEssentiaJar"), "CompressedEssentiaJar");
			x2compressedEssentiaJar = GameRegistry.registerBlock(new Blockx2CompressedEssentiaJar().setBlockName("x2CompressedEssentiaJar"), "x2CompressedEssentiaJar");
		}
		
		if(MeetCfg.extralargeJar)
		{
			extralargeEssentiaJar = GameRegistry.registerBlock(new BlockExtralargeEssentiaJar().setBlockName("ExtralargeEssentiaJar"), "ExtralargeEssentiaJar");
		}
		
		if(Loader.isModLoaded("Automagy") && MeetCfg.automagy)
		{
			bookshelfInventarium = GameRegistry.registerBlock(new BlockBookshelfInventarium().setBlockName("BookshelfInventarium"), "BookshelfInventarium");
		}
		
	}

}
