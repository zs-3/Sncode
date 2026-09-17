package com.badlogic.gdx.graphics.g3d.particles.emitters;

/* loaded from: classes.dex */
public abstract class Emitter extends com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent {
    public int maxParticleCount;
    public int minParticleCount;

    public Emitter() {
            r1 = this;
            r1.<init>()
            r0 = 4
            r1.maxParticleCount = r0
            return
    }

    @Override // com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent, com.badlogic.gdx.utils.Json.Serializable
    public void read(com.badlogic.gdx.utils.Json r3, com.badlogic.gdx.utils.JsonValue r4) {
            r2 = this;
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.String r1 = "minParticleCount"
            java.lang.Object r1 = r3.readValue(r1, r0, r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.minParticleCount = r1
            java.lang.String r1 = "maxParticleCount"
            java.lang.Object r3 = r3.readValue(r1, r0, r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.maxParticleCount = r3
            return
    }
}
