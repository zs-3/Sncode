package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public class Pixmap implements com.badlogic.gdx.utils.Disposable {
    private com.badlogic.gdx.graphics.Pixmap.Blending blending;
    int color;
    private boolean disposed;
    private com.badlogic.gdx.graphics.Pixmap.Filter filter;
    final com.badlogic.gdx.graphics.g2d.Gdx2DPixmap pixmap;

    public enum Blending extends java.lang.Enum<com.badlogic.gdx.graphics.Pixmap.Blending> {
        private static final /* synthetic */ com.badlogic.gdx.graphics.Pixmap.Blending[] $VALUES = null;
        public static final com.badlogic.gdx.graphics.Pixmap.Blending None = null;
        public static final com.badlogic.gdx.graphics.Pixmap.Blending SourceOver = null;

        static {
                com.badlogic.gdx.graphics.Pixmap$Blending r0 = new com.badlogic.gdx.graphics.Pixmap$Blending
                java.lang.String r1 = "None"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.graphics.Pixmap.Blending.None = r0
                com.badlogic.gdx.graphics.Pixmap$Blending r1 = new com.badlogic.gdx.graphics.Pixmap$Blending
                java.lang.String r3 = "SourceOver"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.graphics.Pixmap.Blending.SourceOver = r1
                r3 = 2
                com.badlogic.gdx.graphics.Pixmap$Blending[] r3 = new com.badlogic.gdx.graphics.Pixmap.Blending[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.badlogic.gdx.graphics.Pixmap.Blending.$VALUES = r3
                return
        }

        Blending(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.graphics.Pixmap.Blending valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.graphics.Pixmap$Blending> r0 = com.badlogic.gdx.graphics.Pixmap.Blending.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.graphics.Pixmap$Blending r1 = (com.badlogic.gdx.graphics.Pixmap.Blending) r1
                return r1
        }

        public static com.badlogic.gdx.graphics.Pixmap.Blending[] values() {
                com.badlogic.gdx.graphics.Pixmap$Blending[] r0 = com.badlogic.gdx.graphics.Pixmap.Blending.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.graphics.Pixmap$Blending[] r0 = (com.badlogic.gdx.graphics.Pixmap.Blending[]) r0
                return r0
        }
    }

    public enum Filter extends java.lang.Enum<com.badlogic.gdx.graphics.Pixmap.Filter> {
        private static final /* synthetic */ com.badlogic.gdx.graphics.Pixmap.Filter[] $VALUES = null;
        public static final com.badlogic.gdx.graphics.Pixmap.Filter BiLinear = null;
        public static final com.badlogic.gdx.graphics.Pixmap.Filter NearestNeighbour = null;

        static {
                com.badlogic.gdx.graphics.Pixmap$Filter r0 = new com.badlogic.gdx.graphics.Pixmap$Filter
                java.lang.String r1 = "NearestNeighbour"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.graphics.Pixmap.Filter.NearestNeighbour = r0
                com.badlogic.gdx.graphics.Pixmap$Filter r1 = new com.badlogic.gdx.graphics.Pixmap$Filter
                java.lang.String r3 = "BiLinear"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.graphics.Pixmap.Filter.BiLinear = r1
                r3 = 2
                com.badlogic.gdx.graphics.Pixmap$Filter[] r3 = new com.badlogic.gdx.graphics.Pixmap.Filter[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.badlogic.gdx.graphics.Pixmap.Filter.$VALUES = r3
                return
        }

        Filter(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.graphics.Pixmap.Filter valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.graphics.Pixmap$Filter> r0 = com.badlogic.gdx.graphics.Pixmap.Filter.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.graphics.Pixmap$Filter r1 = (com.badlogic.gdx.graphics.Pixmap.Filter) r1
                return r1
        }

        public static com.badlogic.gdx.graphics.Pixmap.Filter[] values() {
                com.badlogic.gdx.graphics.Pixmap$Filter[] r0 = com.badlogic.gdx.graphics.Pixmap.Filter.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.graphics.Pixmap$Filter[] r0 = (com.badlogic.gdx.graphics.Pixmap.Filter[]) r0
                return r0
        }
    }

    public enum Format extends java.lang.Enum<com.badlogic.gdx.graphics.Pixmap.Format> {
        private static final /* synthetic */ com.badlogic.gdx.graphics.Pixmap.Format[] $VALUES = null;
        public static final com.badlogic.gdx.graphics.Pixmap.Format Alpha = null;
        public static final com.badlogic.gdx.graphics.Pixmap.Format Intensity = null;
        public static final com.badlogic.gdx.graphics.Pixmap.Format LuminanceAlpha = null;
        public static final com.badlogic.gdx.graphics.Pixmap.Format RGB565 = null;
        public static final com.badlogic.gdx.graphics.Pixmap.Format RGB888 = null;
        public static final com.badlogic.gdx.graphics.Pixmap.Format RGBA4444 = null;
        public static final com.badlogic.gdx.graphics.Pixmap.Format RGBA8888 = null;

        static {
                com.badlogic.gdx.graphics.Pixmap$Format r0 = new com.badlogic.gdx.graphics.Pixmap$Format
                java.lang.String r1 = "Alpha"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.graphics.Pixmap.Format.Alpha = r0
                com.badlogic.gdx.graphics.Pixmap$Format r1 = new com.badlogic.gdx.graphics.Pixmap$Format
                java.lang.String r3 = "Intensity"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.graphics.Pixmap.Format.Intensity = r1
                com.badlogic.gdx.graphics.Pixmap$Format r3 = new com.badlogic.gdx.graphics.Pixmap$Format
                java.lang.String r5 = "LuminanceAlpha"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.graphics.Pixmap.Format.LuminanceAlpha = r3
                com.badlogic.gdx.graphics.Pixmap$Format r5 = new com.badlogic.gdx.graphics.Pixmap$Format
                java.lang.String r7 = "RGB565"
                r8 = 3
                r5.<init>(r7, r8)
                com.badlogic.gdx.graphics.Pixmap.Format.RGB565 = r5
                com.badlogic.gdx.graphics.Pixmap$Format r7 = new com.badlogic.gdx.graphics.Pixmap$Format
                java.lang.String r9 = "RGBA4444"
                r10 = 4
                r7.<init>(r9, r10)
                com.badlogic.gdx.graphics.Pixmap.Format.RGBA4444 = r7
                com.badlogic.gdx.graphics.Pixmap$Format r9 = new com.badlogic.gdx.graphics.Pixmap$Format
                java.lang.String r11 = "RGB888"
                r12 = 5
                r9.<init>(r11, r12)
                com.badlogic.gdx.graphics.Pixmap.Format.RGB888 = r9
                com.badlogic.gdx.graphics.Pixmap$Format r11 = new com.badlogic.gdx.graphics.Pixmap$Format
                java.lang.String r13 = "RGBA8888"
                r14 = 6
                r11.<init>(r13, r14)
                com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888 = r11
                r13 = 7
                com.badlogic.gdx.graphics.Pixmap$Format[] r13 = new com.badlogic.gdx.graphics.Pixmap.Format[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                com.badlogic.gdx.graphics.Pixmap.Format.$VALUES = r13
                return
        }

        Format(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.graphics.Pixmap.Format fromGdx2DPixmapFormat(int r3) {
                r0 = 1
                if (r3 != r0) goto L6
                com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.Alpha
                return r3
            L6:
                r0 = 2
                if (r3 != r0) goto Lc
                com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.LuminanceAlpha
                return r3
            Lc:
                r0 = 5
                if (r3 != r0) goto L12
                com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.RGB565
                return r3
            L12:
                r0 = 6
                if (r3 != r0) goto L18
                com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA4444
                return r3
            L18:
                r0 = 3
                if (r3 != r0) goto L1e
                com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.RGB888
                return r3
            L1e:
                r0 = 4
                if (r3 != r0) goto L24
                com.badlogic.gdx.graphics.Pixmap$Format r3 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
                return r3
            L24:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unknown Gdx2DPixmap Format: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        public static int toGdx2DPixmapFormat(com.badlogic.gdx.graphics.Pixmap.Format r3) {
                com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.Alpha
                r1 = 1
                if (r3 != r0) goto L6
                return r1
            L6:
                com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.Intensity
                if (r3 != r0) goto Lb
                return r1
            Lb:
                com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.LuminanceAlpha
                if (r3 != r0) goto L11
                r3 = 2
                return r3
            L11:
                com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.RGB565
                if (r3 != r0) goto L17
                r3 = 5
                return r3
            L17:
                com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA4444
                if (r3 != r0) goto L1d
                r3 = 6
                return r3
            L1d:
                com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.RGB888
                if (r3 != r0) goto L23
                r3 = 3
                return r3
            L23:
                com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.RGBA8888
                if (r3 != r0) goto L29
                r3 = 4
                return r3
            L29:
                com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unknown Format: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        public static int toGlFormat(com.badlogic.gdx.graphics.Pixmap.Format r0) {
                int r0 = toGdx2DPixmapFormat(r0)
                int r0 = com.badlogic.gdx.graphics.g2d.Gdx2DPixmap.toGlFormat(r0)
                return r0
        }

        public static int toGlType(com.badlogic.gdx.graphics.Pixmap.Format r0) {
                int r0 = toGdx2DPixmapFormat(r0)
                int r0 = com.badlogic.gdx.graphics.g2d.Gdx2DPixmap.toGlType(r0)
                return r0
        }

        public static com.badlogic.gdx.graphics.Pixmap.Format valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.graphics.Pixmap$Format> r0 = com.badlogic.gdx.graphics.Pixmap.Format.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.graphics.Pixmap$Format r1 = (com.badlogic.gdx.graphics.Pixmap.Format) r1
                return r1
        }

        public static com.badlogic.gdx.graphics.Pixmap.Format[] values() {
                com.badlogic.gdx.graphics.Pixmap$Format[] r0 = com.badlogic.gdx.graphics.Pixmap.Format.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.graphics.Pixmap$Format[] r0 = (com.badlogic.gdx.graphics.Pixmap.Format[]) r0
                return r0
        }
    }

    public Pixmap(int r2, int r3, com.badlogic.gdx.graphics.Pixmap.Format r4) {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.graphics.Pixmap$Blending r0 = com.badlogic.gdx.graphics.Pixmap.Blending.SourceOver
            r1.blending = r0
            com.badlogic.gdx.graphics.Pixmap$Filter r0 = com.badlogic.gdx.graphics.Pixmap.Filter.BiLinear
            r1.filter = r0
            r0 = 0
            r1.color = r0
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = new com.badlogic.gdx.graphics.g2d.Gdx2DPixmap
            int r4 = com.badlogic.gdx.graphics.Pixmap.Format.toGdx2DPixmapFormat(r4)
            r0.<init>(r2, r3, r4)
            r1.pixmap = r0
            r2 = 0
            r1.setColor(r2, r2, r2, r2)
            r1.fill()
            return
    }

    public Pixmap(com.badlogic.gdx.files.FileHandle r5) {
            r4 = this;
            r4.<init>()
            com.badlogic.gdx.graphics.Pixmap$Blending r0 = com.badlogic.gdx.graphics.Pixmap.Blending.SourceOver
            r4.blending = r0
            com.badlogic.gdx.graphics.Pixmap$Filter r0 = com.badlogic.gdx.graphics.Pixmap.Filter.BiLinear
            r4.filter = r0
            r0 = 0
            r4.color = r0
            byte[] r1 = r5.readBytes()     // Catch: java.lang.Exception -> L1b
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r2 = new com.badlogic.gdx.graphics.g2d.Gdx2DPixmap     // Catch: java.lang.Exception -> L1b
            int r3 = r1.length     // Catch: java.lang.Exception -> L1b
            r2.<init>(r1, r0, r3, r0)     // Catch: java.lang.Exception -> L1b
            r4.pixmap = r2     // Catch: java.lang.Exception -> L1b
            return
        L1b:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Couldn't load file: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
    }

    public Pixmap(byte[] r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.graphics.Pixmap$Blending r0 = com.badlogic.gdx.graphics.Pixmap.Blending.SourceOver
            r2.blending = r0
            com.badlogic.gdx.graphics.Pixmap$Filter r0 = com.badlogic.gdx.graphics.Pixmap.Filter.BiLinear
            r2.filter = r0
            r0 = 0
            r2.color = r0
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r1 = new com.badlogic.gdx.graphics.g2d.Gdx2DPixmap     // Catch: java.io.IOException -> L16
            r1.<init>(r3, r4, r5, r0)     // Catch: java.io.IOException -> L16
            r2.pixmap = r1     // Catch: java.io.IOException -> L16
            return
        L16:
            r3 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r4 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r5 = "Couldn't load pixmap from image data"
            r4.<init>(r5, r3)
            throw r4
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            boolean r0 = r2.disposed
            if (r0 != 0) goto Ld
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = r2.pixmap
            r0.dispose()
            r0 = 1
            r2.disposed = r0
            return
        Ld:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Pixmap already disposed!"
            r0.<init>(r1)
            throw r0
    }

    public void drawPixel(int r2, int r3, int r4) {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = r1.pixmap
            r0.setPixel(r2, r3, r4)
            return
    }

    public void drawPixmap(com.badlogic.gdx.graphics.Pixmap r9, int r10, int r11) {
            r8 = this;
            int r6 = r9.getWidth()
            int r7 = r9.getHeight()
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.drawPixmap(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void drawPixmap(com.badlogic.gdx.graphics.Pixmap r9, int r10, int r11, int r12, int r13, int r14, int r15) {
            r8 = this;
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = r8.pixmap
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r1 = r9.pixmap
            r2 = r12
            r3 = r13
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r15
            r0.drawPixmap(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void drawPixmap(com.badlogic.gdx.graphics.Pixmap r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20) {
            r11 = this;
            r0 = r11
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r1 = r0.pixmap
            r2 = r12
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r2 = r2.pixmap
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r1.drawPixmap(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public void fill() {
            r2 = this;
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = r2.pixmap
            int r1 = r2.color
            r0.clear(r1)
            return
    }

    public com.badlogic.gdx.graphics.Pixmap.Format getFormat() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = r1.pixmap
            int r0 = r0.getFormat()
            com.badlogic.gdx.graphics.Pixmap$Format r0 = com.badlogic.gdx.graphics.Pixmap.Format.fromGdx2DPixmapFormat(r0)
            return r0
    }

    public int getGLFormat() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = r1.pixmap
            int r0 = r0.getGLFormat()
            return r0
    }

    public int getGLInternalFormat() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = r1.pixmap
            int r0 = r0.getGLInternalFormat()
            return r0
    }

    public int getGLType() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = r1.pixmap
            int r0 = r0.getGLType()
            return r0
    }

    public int getHeight() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = r1.pixmap
            int r0 = r0.getHeight()
            return r0
    }

    public int getPixel(int r2, int r3) {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = r1.pixmap
            int r2 = r0.getPixel(r2, r3)
            return r2
    }

    public java.nio.ByteBuffer getPixels() {
            r2 = this;
            boolean r0 = r2.disposed
            if (r0 != 0) goto Lb
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = r2.pixmap
            java.nio.ByteBuffer r0 = r0.getPixels()
            return r0
        Lb:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "Pixmap already disposed"
            r0.<init>(r1)
            throw r0
    }

    public int getWidth() {
            r1 = this;
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = r1.pixmap
            int r0 = r0.getWidth()
            return r0
    }

    public boolean isDisposed() {
            r1 = this;
            boolean r0 = r1.disposed
            return r0
    }

    public void setBlending(com.badlogic.gdx.graphics.Pixmap.Blending r3) {
            r2 = this;
            r2.blending = r3
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = r2.pixmap
            com.badlogic.gdx.graphics.Pixmap$Blending r1 = com.badlogic.gdx.graphics.Pixmap.Blending.None
            if (r3 != r1) goto La
            r3 = 0
            goto Lb
        La:
            r3 = 1
        Lb:
            r0.setBlend(r3)
            return
    }

    public void setColor(float r1, float r2, float r3, float r4) {
            r0 = this;
            int r1 = com.badlogic.gdx.graphics.Color.rgba8888(r1, r2, r3, r4)
            r0.color = r1
            return
    }

    public void setColor(com.badlogic.gdx.graphics.Color r4) {
            r3 = this;
            float r0 = r4.r
            float r1 = r4.g
            float r2 = r4.b
            float r4 = r4.a
            int r4 = com.badlogic.gdx.graphics.Color.rgba8888(r0, r1, r2, r4)
            r3.color = r4
            return
    }

    public void setFilter(com.badlogic.gdx.graphics.Pixmap.Filter r3) {
            r2 = this;
            r2.filter = r3
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r0 = r2.pixmap
            com.badlogic.gdx.graphics.Pixmap$Filter r1 = com.badlogic.gdx.graphics.Pixmap.Filter.NearestNeighbour
            if (r3 != r1) goto La
            r3 = 0
            goto Lb
        La:
            r3 = 1
        Lb:
            r0.setScale(r3)
            return
    }
}
