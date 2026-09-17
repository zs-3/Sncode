package com.badlogic.gdx.graphics.g3d.particles;

/* loaded from: classes.dex */
public class ParticleEffect implements com.badlogic.gdx.utils.Disposable {
    private com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.ParticleController> controllers;

    public ParticleEffect() {
            r4 = this;
            r4.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            java.lang.Class<com.badlogic.gdx.graphics.g3d.particles.ParticleController> r1 = com.badlogic.gdx.graphics.g3d.particles.ParticleController.class
            r2 = 1
            r3 = 3
            r0.<init>(r2, r3, r1)
            r4.controllers = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.ParticleController> r0 = r3.controllers
            int r0 = r0.size
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.ParticleController> r2 = r3.controllers
            java.lang.Object r2 = r2.get(r1)
            com.badlogic.gdx.graphics.g3d.particles.ParticleController r2 = (com.badlogic.gdx.graphics.g3d.particles.ParticleController) r2
            r2.dispose()
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    public void load(com.badlogic.gdx.assets.AssetManager r3, com.badlogic.gdx.graphics.g3d.particles.ResourceData r4) {
            r2 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.ParticleController> r0 = r2.controllers
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.graphics.g3d.particles.ParticleController r1 = (com.badlogic.gdx.graphics.g3d.particles.ParticleController) r1
            r1.load(r3, r4)
            goto L6
        L16:
            return
    }

    public void setBatch(com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch<?>> r6) {
            r5 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g3d.particles.ParticleController> r0 = r5.controllers
            com.badlogic.gdx.utils.Array$ArrayIterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            com.badlogic.gdx.graphics.g3d.particles.ParticleController r1 = (com.badlogic.gdx.graphics.g3d.particles.ParticleController) r1
            com.badlogic.gdx.utils.Array$ArrayIterator r2 = r6.iterator()
        L16:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6
            java.lang.Object r3 = r2.next()
            com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch r3 = (com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch) r3
            com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderer<?, ?> r4 = r1.renderer
            boolean r3 = r4.setBatch(r3)
            if (r3 == 0) goto L16
            goto L6
        L2b:
            return
    }
}
