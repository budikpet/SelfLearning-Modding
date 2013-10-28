package com.SgtPetrov.SL.block;
import com.SgtPetrov.SL.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
/* P�i kliknut� prav�m tla��tkem se zm�n� po�as� na nede�tivo a �as se p�esune na 0. */

public class OnBlockClicked extends BlockSL {

    public OnBlockClicked(int id) {
        super(id, Material.cloth);
        
        this.setUnlocalizedName(Strings.ON_BLOCK_CLICKED_NAME);
    }
    
    public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer entityPlayer, int par6, float par7, float par8, float par9) 
    {
        if(!world.isDaytime()) {
            world.setWorldTime(0);
        }
        
        if(world.isRaining()) {
            world.toggleRain();
        }
        return true;
    }
}
