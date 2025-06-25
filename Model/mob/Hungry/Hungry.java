// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Hungry<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "hungry"), "main");
	private final ModelPart Model;
	private final ModelPart L_leg;
	private final ModelPart L_foot;
	private final ModelPart R_leg;
	private final ModelPart R_foot;
	private final ModelPart Body;
	private final ModelPart down;
	private final ModelPart up;
	private final ModelPart Head;
	private final ModelPart L_hand;
	private final ModelPart L_arm;
	private final ModelPart R_hand;
	private final ModelPart R_arm;

	public Hungry(ModelPart root) {
		this.Model = root.getChild("Model");
		this.L_leg = this.Model.getChild("L_leg");
		this.L_foot = this.L_leg.getChild("L_foot");
		this.R_leg = this.Model.getChild("R_leg");
		this.R_foot = this.R_leg.getChild("R_foot");
		this.Body = this.Model.getChild("Body");
		this.down = this.Body.getChild("down");
		this.up = this.down.getChild("up");
		this.Head = this.up.getChild("Head");
		this.L_hand = this.up.getChild("L_hand");
		this.L_arm = this.L_hand.getChild("L_arm");
		this.R_hand = this.up.getChild("R_hand");
		this.R_arm = this.R_hand.getChild("R_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Model = partdefinition.addOrReplaceChild("Model", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition L_leg = Model.addOrReplaceChild("L_leg", CubeListBuilder.create().texOffs(0, 31).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition L_foot = L_leg.addOrReplaceChild("L_foot", CubeListBuilder.create().texOffs(32, 38).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition R_leg = Model.addOrReplaceChild("R_leg", CubeListBuilder.create().texOffs(20, 48).addBox(-2.0F, 0.0F, 0.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 10).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		PartDefinition R_foot = R_leg.addOrReplaceChild("R_foot", CubeListBuilder.create().texOffs(16, 38).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition Body = Model.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition down = Body.addOrReplaceChild("down", CubeListBuilder.create().texOffs(0, 24).addBox(-4.0F, -3.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(40, 28).addBox(-4.0F, -6.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 42).addBox(2.0F, -6.0F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition up = down.addOrReplaceChild("up", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(48, 0).addBox(-4.0F, -2.0F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(40, 21).addBox(1.0F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition Head = up.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition L_hand = up.addOrReplaceChild("L_hand", CubeListBuilder.create().texOffs(24, 27).addBox(0.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -4.0F, 0.0F));

		PartDefinition L_arm = L_hand.addOrReplaceChild("L_arm", CubeListBuilder.create().texOffs(12, 48).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 5.0F, 0.0F));

		PartDefinition R_hand = up.addOrReplaceChild("R_hand", CubeListBuilder.create().texOffs(24, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -4.0F, 0.0F));

		PartDefinition R_arm = R_hand.addOrReplaceChild("R_arm", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 4.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Model.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}