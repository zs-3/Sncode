package com.badlogic.gdx.graphics.g3d.particles.renderers;

import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;

/* loaded from: classes.dex */
public abstract class ParticleControllerRenderer<D, T extends com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch<D>> extends com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent {
    protected T batch;

    protected ParticleControllerRenderer() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract boolean isCompatible(com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch<?> r1);

    public boolean setBatch(com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch<?> r2) {
            r1 = this;
            boolean r0 = r1.isCompatible(r2)
            if (r0 == 0) goto La
            r1.batch = r2
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }
}
