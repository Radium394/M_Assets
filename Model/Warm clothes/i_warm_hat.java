// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Warm clothes<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "warm_clothes"), "main");
	private final ModelPart Head;

	public Warm clothes(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -10.0F, -4.0F, 10.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(28, 23).addBox(-4.0F, -10.3F, -3.0F, 8.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(53, 0).addBox(-4.0F, -9.5F, -4.6F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-5.0F, -6.0F, -3.0F, 10.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(54, 9).addBox(12.4F, -27.5F, -3.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(56, 5).addBox(12.5F, -27.5F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 25.0F, 0.0F, 0.0F, 0.0F, -0.2967F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 17).addBox(-7.5F, -30.0F, -3.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(54, 59).addBox(-8.6F, -30.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 25.0F, 0.0F, 0.0F, 0.0F, 0.1222F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}