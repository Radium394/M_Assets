// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class gus_mack<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "gus_mack"), "main");
	private final ModelPart Head;

	public gus_mack(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 25).addBox(1.0F, -5.0F, -4.7F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(4, 25).addBox(-3.0F, -5.0F, -4.7F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(12, 25).addBox(-1.0F, -5.0F, -4.7F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(20, 2).addBox(-2.0F, -2.2F, -6.2F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-1.0F, -3.2F, -5.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-4.0F, -3.0F, -5.2F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 18).addBox(-4.0F, -7.0F, -5.2F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(19, -1).addBox(-4.0F, -6.0F, 3.8F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(7, 26).addBox(-1.0F, -8.0F, 3.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 8).addBox(-1.0F, -8.0F, -5.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-1, 8).addBox(-5.0F, -6.0F, -4.2F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -9.0F, -4.2F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(16, 8).addBox(4.1F, -6.0F, -4.2F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(8, 22).addBox(3.0F, -5.0F, -5.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 22).addBox(-4.0F, -5.0F, -5.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 6).addBox(-1.0F, -4.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.2F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 21).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -0.6F, -7.1F, 0.2182F, -0.2182F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}