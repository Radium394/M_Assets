// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class i_warm_hat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "i_warm_hat"), "main");
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public i_warm_hat(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 23).addBox(-4.5F, -0.2F, -2.4F, 9.0F, 13.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(24, 75).addBox(-0.8F, 0.0F, -2.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(73, 39).addBox(-2.5F, 10.7F, -2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 34).addBox(-4.6F, -0.3F, -2.5F, 2.0F, 13.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(28, 34).addBox(2.6F, -0.3F, -2.5F, 2.0F, 13.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(60, 25).addBox(2.6F, -0.3F, 0.7F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 61).addBox(-4.6F, -0.3F, 0.7F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 48).addBox(-2.9F, -0.3F, 2.7F, 6.0F, 13.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(10, 60).addBox(1.3F, -0.3F, -2.5F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.7F, -0.3F, -2.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-0.7F, 7.7F, -2.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(74, 14).addBox(-4.0F, 0.6F, -2.6F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(67, 50).addBox(-2.1F, 0.8F, -2.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(29, 6).addBox(-3.9F, 0.8F, -2.7F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 75).addBox(-3.0F, 10.1F, -2.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 13).addBox(0.8F, 0.7F, -2.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(29, 0).addBox(-5.0F, -2.5F, 2.5F, 10.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(51, 21).addBox(-4.0F, 1.5F, 1.4F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 6).addBox(-5.0F, -2.6F, 2.6F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(74, 8).addBox(3.6F, -1.5F, 0.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(73, 50).addBox(3.7F, -1.6F, 0.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(73, 19).addBox(-5.6F, -1.5F, 0.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(72, 33).addBox(-5.7F, -1.6F, 0.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(28, 13).addBox(-5.0F, 11.9F, -3.0F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 8).addBox(-1.0F, 11.8F, -3.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 27).addBox(-1.0F, 12.0F, -3.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 12).addBox(3.1F, 11.8F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(73, 50).addBox(3.1F, 12.0F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 34).addBox(-3.9F, 11.8F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 37).addBox(-3.9F, 12.0F, -3.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(-3.9F, 12.0F, 2.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 34).addBox(-3.9F, 11.8F, 2.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 41).addBox(3.1F, 12.0F, 2.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(15, 41).addBox(3.1F, 11.8F, 2.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 75).addBox(-9.9F, -17.2F, -2.6F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 75).addBox(-9.9F, -14.0F, -2.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.5585F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(74, 73).addBox(-8.7F, -17.9F, -2.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 75).addBox(-10.9F, -17.9F, -2.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 23.9F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(47, 46).addBox(-3.5F, 7.0F, -2.4F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(60, 53).addBox(-3.6F, 6.8F, -0.3F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(60, 40).addBox(-3.6F, 6.8F, -2.5F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(68, 4).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(66, 8).addBox(-3.0F, 10.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(52, 49).addBox(-3.0F, -2.0F, -2.0F, 0.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r3 = RightArm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 49).addBox(-2.0F, -2.0F, -3.0F, 0.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r4 = RightArm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(44, 49).addBox(-1.0F, -2.0F, -2.0F, 0.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r5 = RightArm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 30).addBox(-2.0F, -2.0F, -1.0F, 0.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(62, 45).addBox(-1.4F, 6.8F, -2.5F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(62, 58).addBox(-1.4F, 6.8F, -0.3F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 41).addBox(-1.5F, 7.0F, -2.4F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(67, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(65, 19).addBox(-1.0F, 10.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 37).addBox(-1.0F, -2.0F, -2.0F, 0.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r6 = LeftArm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 44).addBox(-2.0F, -2.0F, -3.0F, 0.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r7 = LeftArm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 47).addBox(-1.0F, -2.0F, -2.0F, 0.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r8 = LeftArm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 47).addBox(-2.0F, -2.0F, -1.0F, 0.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}