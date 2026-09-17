package com.badlogic.gdx.graphics.g3d.particles;

/* loaded from: classes.dex */
public class ParticleController implements com.badlogic.gdx.utils.Json.Serializable {
    public float deltaTime;
    public float deltaTimeSqr;
    public com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter emitter;
    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer> influencers;
    public java.lang.String name;
    public com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer<?, ?> renderer;
    public com.badlogic.gdx.math.Vector3 scale;
    public com.badlogic.gdx.math.Matrix4 transform;

    public ParticleController() {
            r4 = this;
            r4.<init>()
            com.badlogic.gdx.math.Matrix4 r0 = new com.badlogic.gdx.math.Matrix4
            r0.<init>()
            r4.transform = r0
            com.badlogic.gdx.math.Vector3 r0 = new com.badlogic.gdx.math.Vector3
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r1)
            r4.scale = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            java.lang.Class<com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer> r1 = com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer.class
            r2 = 1
            r3 = 3
            r0.<init>(r2, r3, r1)
            r4.influencers = r0
            r0 = 1015580809(0x3c888889, float:0.016666668)
            r4.setTimeStep(r0)
            return
    }

    private void setTimeStep(float r1) {
            r0 = this;
            r0.deltaTime = r1
            float r1 = r1 * r1
            r0.deltaTimeSqr = r1
            return
    }

    public void dispose() {
            r2 = this;
            com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter r0 = r2.emitter
            r0.dispose()
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer> r0 = r2.influencers
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer r1 = (com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer) r1
            r1.dispose()
            goto Lb
        L1b:
            return
    }

    public void load(com.badlogic.gdx.assets.AssetManager r3, com.badlogic.gdx.graphics.g3d.particles.ResourceData r4) {
            r2 = this;
            com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter r0 = r2.emitter
            r0.load(r3, r4)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer> r0 = r2.influencers
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer r1 = (com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer) r1
            r1.load(r3, r4)
            goto Lb
        L1b:
            com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer<?, ?> r0 = r2.renderer
            r0.load(r3, r4)
            return
    }

    @Override // com.badlogic.gdx.utils.Json.Serializable
    public void read(com.badlogic.gdx.utils.Json r5, com.badlogic.gdx.utils.JsonValue r6) {
            r4 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "name"
            java.lang.Object r0 = r5.readValue(r1, r0, r6)
            java.lang.String r0 = (java.lang.String) r0
            r4.name = r0
            java.lang.Class<com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter> r0 = com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter.class
            java.lang.String r1 = "emitter"
            java.lang.Object r0 = r5.readValue(r1, r0, r6)
            com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter r0 = (com.badlogic.gdx.graphics.g3d.particles.emitters.Emitter) r0
            r4.emitter = r0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer> r0 = r4.influencers
            java.lang.Class<com.badlogic.gdx.utils.Array> r1 = com.badlogic.gdx.utils.Array.class
            java.lang.Class<com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer> r2 = com.badlogic.gdx.graphics.g3d.particles.influencers.Influencer.class
            java.lang.String r3 = "influencers"
            java.lang.Object r1 = r5.readValue(r3, r1, r2, r6)
            com.badlogic.gdx.utils.Array r1 = (com.badlogic.gdx.utils.Array) r1
            r0.addAll(r1)
            java.lang.Class<com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer> r0 = com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer.class
            java.lang.String r1 = "renderer"
            java.lang.Object r5 = r5.readValue(r1, r0, r6)
            com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer r5 = (com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer) r5
            r4.renderer = r5
            return
    }
}
