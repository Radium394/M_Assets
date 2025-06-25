// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class i_warm_fur_coat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "i_warm_fur_coat"), "main");
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public i_warm_fur_coat(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(60, 69).addBox(-2.0F, 0.0F, -2.1F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(52, 69).addBox(-2.0F, 0.0F, 2.1F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(62, 15).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(60, 4).addBox(-2.0F, 12.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r1 = RightLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(68, 63).addBox(-2.0F, 0.0F, -2.1F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(68, 25).addBox(-2.0F, 0.0F, 2.1F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(28, 63).addBox(-1.8F, 0.0F, -2.1F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(36, 63).addBox(-1.8F, 0.0F, 2.1F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(32, 34).addBox(-1.8F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(47, 25).addBox(-1.8F, 12.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r2 = LeftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(44, 65).addBox(-2.0F, 0.0F, -2.1F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(18, 65).addBox(-2.0F, 0.0F, 2.1F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}