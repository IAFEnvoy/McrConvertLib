package net.iafenvoy.mcrconvertlib.misc;

import net.iafenvoy.mcrconvertlib.render.EntityRendererBase;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

import java.util.HashMap;

public enum Stage {
    First, Second;

    public static StagedEntityTextureProvider ofProvider(String modId, String... textures) {
        return new StagedEntityTextureProvider(modId, textures);
    }

    public interface StagedEntity {
        Stage getStage();
    }

    public static class StagedEntityTextureProvider {
        private final HashMap<Stage, String> textureIds = new HashMap<>();
        private String eyeTextureId = null;
        private final String modId;

        public StagedEntityTextureProvider(String modId, String... textures) {
            Stage[] stages = Stage.values();
            for (int i = 0; i < stages.length && i < textures.length; i++)
                this.textureIds.put(stages[i], textures[i]);
            this.modId = modId;
        }

        public StagedEntityTextureProvider setEyeTextureId(String eyeTextureId) {
            this.eyeTextureId = eyeTextureId;
            return this;
        }

        public Identifier getTexture() {
            return this.getTexture(Stage.First);
        }

        public Identifier getTexture(Stage stage) {
            return new Identifier(this.modId, "textures/entities/" + this.getTextureId(stage) + ".png");
        }

        private String getTextureId(Stage stage) {
            if (this.textureIds.containsKey(stage))
                return this.textureIds.get(stage);
            if (this.textureIds.size() == 0)
                return "";
            return this.textureIds.get(Stage.First);
        }

        public <T extends MobEntity> EntityRendererBase<T> createRenderer(EntityRendererFactory.Context context) {
            return new EntityRendererBase<>(context, this, new Identifier(this.modId, this.eyeTextureId));
        }
    }
}
