package org.fortheloss.sticknodes.splashscreen2023;

/* loaded from: classes2.dex */
public class Particle implements com.badlogic.gdx.utils.Disposable {
    private org.fortheloss.sticknodes.splashscreen2023.IEmitter emitter;
    private float friction;
    private float gravity;
    private float height;
    private boolean outOfBounds;
    private float rotation;
    private float scale;
    private float spinSpeed;
    private com.badlogic.gdx.graphics.g2d.TextureRegion tr;
    private float velX;
    private float velY;
    private float width;
    private float x;
    private float y;

    public Particle(org.fortheloss.sticknodes.splashscreen2023.IEmitter r2, com.badlogic.gdx.graphics.g2d.TextureRegion r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.outOfBounds = r0
            r1.emitter = r2
            r1.tr = r3
            r1.x = r4
            r1.y = r5
            r1.velX = r6
            r1.velY = r7
            r1.scale = r10
            r1.rotation = r8
            r1.spinSpeed = r9
            r1.gravity = r11
            r1.friction = r12
            int r2 = r3.getRegionWidth()
            float r2 = (float) r2
            r1.width = r2
            int r2 = r3.getRegionHeight()
            float r2 = (float) r2
            r1.height = r2
            return
    }

    public void act(float r6) {
            r5 = this;
            boolean r0 = r5.outOfBounds
            if (r0 == 0) goto L5
            return
        L5:
            float r0 = r5.velX
            float r1 = r5.friction
            double r1 = (double) r1
            double r3 = (double) r6
            double r1 = java.lang.Math.pow(r1, r3)
            float r1 = (float) r1
            float r0 = r0 * r1
            r5.velX = r0
            float r1 = r5.velY
            float r2 = r5.gravity
            float r2 = r2 * r6
            float r1 = r1 + r2
            r5.velY = r1
            float r2 = r5.rotation
            float r3 = r5.spinSpeed
            float r3 = r3 * r6
            float r2 = r2 + r3
            r5.rotation = r2
            float r2 = r5.x
            float r0 = r0 * r6
            float r2 = r2 + r0
            r5.x = r2
            float r0 = r5.y
            float r1 = r1 * r6
            float r0 = r0 + r1
            r5.y = r0
            org.fortheloss.sticknodes.splashscreen2023.IEmitter r6 = r5.emitter
            com.badlogic.gdx.scenes.scene2d.Stage r6 = r6.getStage()
            float r0 = r5.x
            float r6 = r6.getWidth()
            r1 = 1112014848(0x42480000, float:50.0)
            float r6 = r6 + r1
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L55
            float r6 = r5.x
            r0 = -1035468800(0xffffffffc2480000, float:-50.0)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 < 0) goto L55
            float r6 = r5.y
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L5d
        L55:
            r6 = 1
            r5.outOfBounds = r6
            org.fortheloss.sticknodes.splashscreen2023.IEmitter r6 = r5.emitter
            r6.removeParticle(r5)
        L5d:
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.emitter = r0
            r1.tr = r0
            return
    }

    public void draw(com.badlogic.gdx.graphics.g2d.Batch r13, float r14) {
            r12 = this;
            boolean r0 = r12.outOfBounds
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1065353216(0x3f800000, float:1.0)
            r13.setColor(r0, r0, r0, r14)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r12.tr
            float r3 = r12.x
            float r4 = r12.y
            float r7 = r12.width
            r14 = 1056964608(0x3f000000, float:0.5)
            float r5 = r7 * r14
            float r8 = r12.height
            float r6 = r8 * r14
            float r10 = r12.scale
            float r11 = r12.rotation
            r1 = r13
            r9 = r10
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }
}
