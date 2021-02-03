package net.sunconure11.covetedmobs.client.model.entity.living;
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.google.common.collect.ImmutableList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.minecraft.client.util.math.MatrixStack;
import net.sunconure11.covetedmobs.common.entity.living.BlindwormEntity;

@Environment(EnvType.CLIENT)
public class BlindwormModel<T extends BlindwormEntity> extends AnimalModel<T> {
	private final ModelPart body;
	private final ModelPart bodyB;
	private final ModelPart neck00;
	private final ModelPart neck01;
	private final ModelPart head;
	private final ModelPart snout;
	private final ModelPart lowerJaw;
	private final ModelPart RightEye;
	private final ModelPart LeftEye;
	private final ModelPart headB;
	private final ModelPart tail00;
	private final ModelPart tail01;
	private final ModelPart tail01b;
	private final ModelPart tail02;
	private final ModelPart tail03;

	public BlindwormModel() {
		textureWidth = 64;
		textureHeight = 65;

		body = new ModelPart(this);
		body.setPivot(0.0F, 22.5F, 1.9F);
		body.setTextureOffset(25, 15).addCuboid(-2.2F, -1.49F, -6.0F, 4.0F, 3.0F, 9.0F, 0.021F, true);

		bodyB = new ModelPart(this);
		bodyB.setPivot(0.0F, 0.0F, 0.0F);
		body.addChild(bodyB);
		bodyB.setTextureOffset(25, 28).addCuboid(1.2F, -1.49F, -6.0F, 1.0F, 3.0F, 9.0F, 0.02F, true);

		neck00 = new ModelPart(this);
		neck00.setPivot(0.0F, 0.0F, -5.9F);
		body.addChild(neck00);
		neck00.setTextureOffset(0, 16).addCuboid(-2.0F, -1.5F, -3.9F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		neck01 = new ModelPart(this);
		neck01.setPivot(0.0F, 0.0F, -3.6F);
		neck00.addChild(neck01);
		neck01.setTextureOffset(0, 24).addCuboid(-2.0F, -1.5F, -3.2F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		head = new ModelPart(this);
		head.setPivot(0.0F, 0.3F, -3.9F);
		neck01.addChild(head);
		setRotationAngle(head, 0.1396F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addCuboid(-2.4F, -2.0F, -2.5F, 4.0F, 3.0F, 5.0F, -0.001F, true);

		snout = new ModelPart(this);
		snout.setPivot(0.0F, -0.8F, -1.9F);
		head.addChild(snout);
		setRotationAngle(snout, 0.0873F, 0.0F, 0.0F);
		snout.setTextureOffset(0, 10).addCuboid(-2.0F, -1.0F, -2.2F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		lowerJaw = new ModelPart(this);
		lowerJaw.setPivot(0.0F, 0.9F, 1.0F);
		head.addChild(lowerJaw);
		setRotationAngle(lowerJaw, -0.0873F, 0.0F, 0.0F);
		lowerJaw.setTextureOffset(15, 8).addCuboid(-2.0F, -0.5F, -4.8F, 4.0F, 1.0F, 5.0F, -0.01F, false);

		RightEye = new ModelPart(this);
		RightEye.setPivot(-1.4F, -0.2F, 0.0F);
		head.addChild(RightEye);
		setRotationAngle(RightEye, 0.0F, -0.1222F, 0.192F);
		RightEye.setTextureOffset(32, 0).addCuboid(-1.5F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		LeftEye = new ModelPart(this);
		LeftEye.setPivot(1.3F, -0.2F, 0.0F);
		head.addChild(LeftEye);
		setRotationAngle(LeftEye, 0.0F, 0.1222F, -0.192F);
		LeftEye.setTextureOffset(32, 0).addCuboid(-0.5F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		headB = new ModelPart(this);
		headB.setPivot(0.0F, 0.0F, 0.0F);
		head.addChild(headB);
		headB.setTextureOffset(19, 0).addCuboid(1.3F, -2.0F, -2.5F, 1.0F, 3.0F, 5.0F, 0.0F, true);

		tail00 = new ModelPart(this);
		tail00.setPivot(0.0F, 0.0F, 3.4F);
		body.addChild(tail00);
		tail00.setTextureOffset(0, 33).addCuboid(-2.0F, -1.49F, -0.5F, 4.0F, 3.0F, 7.0F, 0.0F, false);

		tail01 = new ModelPart(this);
		tail01.setPivot(0.0F, 0.0F, 5.9F);
		tail00.addChild(tail01);
		tail01.setTextureOffset(23, 45).addCuboid(-1.5F, -1.1F, -1.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);

		tail01b = new ModelPart(this);
		tail01b.setPivot(0.0F, 0.5F, 0.0F);
		tail01.addChild(tail01b);
		tail01b.setTextureOffset(22, 55).addCuboid(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 7.0F, -0.001F, false);

		tail02 = new ModelPart(this);
		tail02.setPivot(0.0F, 0.5F, 6.7F);
		tail01.addChild(tail02);
		tail02.setTextureOffset(41, 40).addCuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);

		tail03 = new ModelPart(this);
		tail03.setPivot(0.0F, 0.5F, 5.9F);
		tail02.addChild(tail03);
		tail03.setTextureOffset(43, 54).addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}

	private void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {

	}

	@Override
	protected Iterable<ModelPart> getHeadParts() {
		return ImmutableList.of();
	}

	@Override
	protected Iterable<ModelPart> getBodyParts() {
		return ImmutableList.of(body);
	}
}