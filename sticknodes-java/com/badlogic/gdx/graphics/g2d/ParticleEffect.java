package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public class ParticleEffect implements com.badlogic.gdx.utils.Disposable {
    private final com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.ParticleEmitter> emitters;
    protected float motionScale;
    private boolean ownsTexture;
    protected float xSizeScale;
    protected float ySizeScale;

    public ParticleEffect() {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.xSizeScale = r0
            r2.ySizeScale = r0
            r2.motionScale = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r1 = 8
            r0.<init>(r1)
            r2.emitters = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            boolean r0 = r4.ownsTexture
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.ParticleEmitter> r1 = r4.emitters
            int r1 = r1.size
        La:
            if (r0 >= r1) goto L33
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.ParticleEmitter> r2 = r4.emitters
            java.lang.Object r2 = r2.get(r0)
            com.badlogic.gdx.graphics.g2d.ParticleEmitter r2 = (com.badlogic.gdx.graphics.g2d.ParticleEmitter) r2
            com.badlogic.gdx.utils.Array r2 = r2.getSprites()
            com.badlogic.gdx.utils.Array$ArrayIterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()
            com.badlogic.gdx.graphics.g2d.Sprite r3 = (com.badlogic.gdx.graphics.g2d.Sprite) r3
            com.badlogic.gdx.graphics.Texture r3 = r3.getTexture()
            r3.dispose()
            goto L1c
        L30:
            int r0 = r0 + 1
            goto La
        L33:
            return
    }

    public void load(com.badlogic.gdx.files.FileHandle r1, com.badlogic.gdx.files.FileHandle r2) {
            r0 = this;
            r0.loadEmitters(r1)
            r0.loadEmitterImages(r2)
            return
    }

    public void load(com.badlogic.gdx.files.FileHandle r1, com.badlogic.gdx.graphics.g2d.TextureAtlas r2, java.lang.String r3) {
            r0 = this;
            r0.loadEmitters(r1)
            r0.loadEmitterImages(r2, r3)
            return
    }

    public void loadEmitterImages(com.badlogic.gdx.files.FileHandle r11) {
            r10 = this;
            r0 = 1
            r10.ownsTexture = r0
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.ParticleEmitter> r1 = r10.emitters
            int r1 = r1.size
            r0.<init>(r1)
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.ParticleEmitter> r1 = r10.emitters
            int r1 = r1.size
            r2 = 0
        L11:
            if (r2 >= r1) goto L70
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.ParticleEmitter> r3 = r10.emitters
            java.lang.Object r3 = r3.get(r2)
            com.badlogic.gdx.graphics.g2d.ParticleEmitter r3 = (com.badlogic.gdx.graphics.g2d.ParticleEmitter) r3
            com.badlogic.gdx.utils.Array r4 = r3.getImagePaths()
            int r4 = r4.size
            if (r4 != 0) goto L24
            goto L6d
        L24:
            com.badlogic.gdx.utils.Array r4 = new com.badlogic.gdx.utils.Array
            r4.<init>()
            com.badlogic.gdx.utils.Array r5 = r3.getImagePaths()
            com.badlogic.gdx.utils.Array$ArrayIterator r5 = r5.iterator()
        L31:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6a
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.io.File r7 = new java.io.File
            r8 = 92
            r9 = 47
            java.lang.String r6 = r6.replace(r8, r9)
            r7.<init>(r6)
            java.lang.String r6 = r7.getName()
            java.lang.Object r7 = r0.get(r6)
            com.badlogic.gdx.graphics.g2d.Sprite r7 = (com.badlogic.gdx.graphics.g2d.Sprite) r7
            if (r7 != 0) goto L66
            com.badlogic.gdx.graphics.g2d.Sprite r7 = new com.badlogic.gdx.graphics.g2d.Sprite
            com.badlogic.gdx.files.FileHandle r8 = r11.child(r6)
            com.badlogic.gdx.graphics.Texture r8 = r10.loadTexture(r8)
            r7.<init>(r8)
            r0.put(r6, r7)
        L66:
            r4.add(r7)
            goto L31
        L6a:
            r3.setSprites(r4)
        L6d:
            int r2 = r2 + 1
            goto L11
        L70:
            return
    }

    public void loadEmitterImages(com.badlogic.gdx.graphics.g2d.TextureAtlas r11, java.lang.String r12) {
            r10 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.ParticleEmitter> r0 = r10.emitters
            int r0 = r0.size
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L89
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.ParticleEmitter> r3 = r10.emitters
            java.lang.Object r3 = r3.get(r2)
            com.badlogic.gdx.graphics.g2d.ParticleEmitter r3 = (com.badlogic.gdx.graphics.g2d.ParticleEmitter) r3
            com.badlogic.gdx.utils.Array r4 = r3.getImagePaths()
            int r4 = r4.size
            if (r4 != 0) goto L19
            goto L85
        L19:
            com.badlogic.gdx.utils.Array r4 = new com.badlogic.gdx.utils.Array
            r4.<init>()
            com.badlogic.gdx.utils.Array r5 = r3.getImagePaths()
            com.badlogic.gdx.utils.Array$ArrayIterator r5 = r5.iterator()
        L26:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L82
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.io.File r7 = new java.io.File
            r8 = 92
            r9 = 47
            java.lang.String r6 = r6.replace(r8, r9)
            r7.<init>(r6)
            java.lang.String r6 = r7.getName()
            r7 = 46
            int r7 = r6.lastIndexOf(r7)
            r8 = -1
            if (r7 == r8) goto L50
            java.lang.String r6 = r6.substring(r1, r7)
        L50:
            if (r12 == 0) goto L61
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r12)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L61:
            com.badlogic.gdx.graphics.g2d.Sprite r7 = r11.createSprite(r6)
            if (r7 == 0) goto L6b
            r4.add(r7)
            goto L26
        L6b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "SpriteSheet missing image: "
            r12.append(r0)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L82:
            r3.setSprites(r4)
        L85:
            int r2 = r2 + 1
            goto L6
        L89:
            return
    }

    public void loadEmitters(com.badlogic.gdx.files.FileHandle r6) {
            r5 = this;
            java.io.InputStream r0 = r6.read()
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.ParticleEmitter> r1 = r5.emitters
            r1.clear()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            r0 = 512(0x200, float:7.175E-43)
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
        L16:
            com.badlogic.gdx.graphics.g2d.ParticleEmitter r0 = r5.newEmitter(r2)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.ParticleEmitter> r1 = r5.emitters     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r1.add(r0)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            if (r0 != 0) goto L16
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r2)
            return
        L29:
            r6 = move-exception
            r1 = r2
            goto L49
        L2c:
            r0 = move-exception
            r1 = r2
            goto L32
        L2f:
            r6 = move-exception
            goto L49
        L31:
            r0 = move-exception
        L32:
            com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r3.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "Error loading effect: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L2f
            r3.append(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r6, r0)     // Catch: java.lang.Throwable -> L2f
            throw r2     // Catch: java.lang.Throwable -> L2f
        L49:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r1)
            throw r6
    }

    protected com.badlogic.gdx.graphics.Texture loadTexture(com.badlogic.gdx.files.FileHandle r3) {
            r2 = this;
            com.badlogic.gdx.graphics.Texture r0 = new com.badlogic.gdx.graphics.Texture
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    protected com.badlogic.gdx.graphics.g2d.ParticleEmitter newEmitter(java.io.BufferedReader r2) throws java.io.IOException {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.ParticleEmitter r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter
            r0.<init>(r2)
            return r0
    }
}
