package com.SgtPetrov.SL.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class FirstMob extends ModelBase {
  //fields
    ModelRenderer Body;
    ModelRenderer Left_leg;
    ModelRenderer Right_leg;
    ModelRenderer Head;
    ModelRenderer Right_Arm;
    ModelRenderer Left_Arm;
  
  public FirstMob() {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 0, 14);
      Body.addBox(0F, 0F, 0F, 11, 14, 4);
      Body.setRotationPoint(-5F, 4F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Left_leg = new ModelRenderer(this, 52, 23);
      Left_leg.addBox(-1.5F, 0F, -1.5F, 3, 6, 3);
      Left_leg.setRotationPoint(4F, 18F, 2F);
      Left_leg.setTextureSize(64, 32);
      Left_leg.mirror = true;
      setRotation(Left_leg, 0F, 0F, 0F);
      Right_leg = new ModelRenderer(this, 38, 23);
      Right_leg.addBox(-1.5F, 0F, -1.5F, 3, 6, 3);
      Right_leg.setRotationPoint(-3F, 18F, 2F);
      Right_leg.setTextureSize(64, 32);
      Right_leg.mirror = true;
      setRotation(Right_leg, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 42, 8);
      Head.addBox(-3F, -6F, -3.5F, 6, 6, 5);
      Head.setRotationPoint(0.5F, 4F, 2F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0.0174533F);
      Right_Arm = new ModelRenderer(this, 0, 0);
      Right_Arm.addBox(0F, -1.5F, -1.5F, 10, 3, 3);
      Right_Arm.setRotationPoint(-4F, 6F, 2F);
      Right_Arm.setTextureSize(64, 32);
      Right_Arm.mirror = true;
      setRotation(Right_Arm, 0F, 0F, 2.621101F);
      Left_Arm = new ModelRenderer(this, 27, 0);
      Left_Arm.addBox(0F, -1.5F, -1.5F, 10, 3, 3);
      Left_Arm.setRotationPoint(5F, 6F, 2F);
      Left_Arm.setTextureSize(64, 32);
      Left_Arm.mirror = true;
      setRotation(Left_Arm, 0F, 0F, 0.5205006F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    Left_leg.render(f5);
    Right_leg.render(f5);
    Head.render(f5);
    Right_Arm.render(f5);
    Left_Arm.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par6Entity) {}
}
