package com.badlogic.gdx;

/* loaded from: classes.dex */
public interface Graphics {

    public static class BufferFormat {
        public final int a;
        public final int b;
        public final boolean coverageSampling;
        public final int depth;
        public final int g;
        public final int r;
        public final int samples;
        public final int stencil;

        public BufferFormat(int r1, int r2, int r3, int r4, int r5, int r6, int r7, boolean r8) {
                r0 = this;
                r0.<init>()
                r0.r = r1
                r0.g = r2
                r0.b = r3
                r0.a = r4
                r0.depth = r5
                r0.stencil = r6
                r0.samples = r7
                r0.coverageSampling = r8
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "r: "
                r0.append(r1)
                int r1 = r2.r
                r0.append(r1)
                java.lang.String r1 = ", g: "
                r0.append(r1)
                int r1 = r2.g
                r0.append(r1)
                java.lang.String r1 = ", b: "
                r0.append(r1)
                int r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ", a: "
                r0.append(r1)
                int r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ", depth: "
                r0.append(r1)
                int r1 = r2.depth
                r0.append(r1)
                java.lang.String r1 = ", stencil: "
                r0.append(r1)
                int r1 = r2.stencil
                r0.append(r1)
                java.lang.String r1 = ", num samples: "
                r0.append(r1)
                int r1 = r2.samples
                r0.append(r1)
                java.lang.String r1 = ", coverage sampling: "
                r0.append(r1)
                boolean r1 = r2.coverageSampling
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class DisplayMode {
        public final int bitsPerPixel;
        public final int height;
        public final int refreshRate;
        public final int width;

        protected DisplayMode(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.width = r1
                r0.height = r2
                r0.refreshRate = r3
                r0.bitsPerPixel = r4
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r2.width
                r0.append(r1)
                java.lang.String r1 = "x"
                r0.append(r1)
                int r1 = r2.height
                r0.append(r1)
                java.lang.String r1 = ", bpp: "
                r0.append(r1)
                int r1 = r2.bitsPerPixel
                r0.append(r1)
                java.lang.String r1 = ", hz: "
                r0.append(r1)
                int r1 = r2.refreshRate
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public enum GraphicsType extends java.lang.Enum<com.badlogic.gdx.Graphics.GraphicsType> {
        private static final /* synthetic */ com.badlogic.gdx.Graphics.GraphicsType[] $VALUES = null;
        public static final com.badlogic.gdx.Graphics.GraphicsType AndroidGL = null;
        public static final com.badlogic.gdx.Graphics.GraphicsType JGLFW = null;
        public static final com.badlogic.gdx.Graphics.GraphicsType LWJGL = null;
        public static final com.badlogic.gdx.Graphics.GraphicsType LWJGL3 = null;
        public static final com.badlogic.gdx.Graphics.GraphicsType Mock = null;
        public static final com.badlogic.gdx.Graphics.GraphicsType WebGL = null;
        public static final com.badlogic.gdx.Graphics.GraphicsType iOSGL = null;

        static {
                com.badlogic.gdx.Graphics$GraphicsType r0 = new com.badlogic.gdx.Graphics$GraphicsType
                java.lang.String r1 = "AndroidGL"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.Graphics.GraphicsType.AndroidGL = r0
                com.badlogic.gdx.Graphics$GraphicsType r1 = new com.badlogic.gdx.Graphics$GraphicsType
                java.lang.String r3 = "LWJGL"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.Graphics.GraphicsType.LWJGL = r1
                com.badlogic.gdx.Graphics$GraphicsType r3 = new com.badlogic.gdx.Graphics$GraphicsType
                java.lang.String r5 = "WebGL"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.Graphics.GraphicsType.WebGL = r3
                com.badlogic.gdx.Graphics$GraphicsType r5 = new com.badlogic.gdx.Graphics$GraphicsType
                java.lang.String r7 = "iOSGL"
                r8 = 3
                r5.<init>(r7, r8)
                com.badlogic.gdx.Graphics.GraphicsType.iOSGL = r5
                com.badlogic.gdx.Graphics$GraphicsType r7 = new com.badlogic.gdx.Graphics$GraphicsType
                java.lang.String r9 = "JGLFW"
                r10 = 4
                r7.<init>(r9, r10)
                com.badlogic.gdx.Graphics.GraphicsType.JGLFW = r7
                com.badlogic.gdx.Graphics$GraphicsType r9 = new com.badlogic.gdx.Graphics$GraphicsType
                java.lang.String r11 = "Mock"
                r12 = 5
                r9.<init>(r11, r12)
                com.badlogic.gdx.Graphics.GraphicsType.Mock = r9
                com.badlogic.gdx.Graphics$GraphicsType r11 = new com.badlogic.gdx.Graphics$GraphicsType
                java.lang.String r13 = "LWJGL3"
                r14 = 6
                r11.<init>(r13, r14)
                com.badlogic.gdx.Graphics.GraphicsType.LWJGL3 = r11
                r13 = 7
                com.badlogic.gdx.Graphics$GraphicsType[] r13 = new com.badlogic.gdx.Graphics.GraphicsType[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                com.badlogic.gdx.Graphics.GraphicsType.$VALUES = r13
                return
        }

        GraphicsType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.Graphics.GraphicsType valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.Graphics$GraphicsType> r0 = com.badlogic.gdx.Graphics.GraphicsType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.Graphics$GraphicsType r1 = (com.badlogic.gdx.Graphics.GraphicsType) r1
                return r1
        }

        public static com.badlogic.gdx.Graphics.GraphicsType[] values() {
                com.badlogic.gdx.Graphics$GraphicsType[] r0 = com.badlogic.gdx.Graphics.GraphicsType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.Graphics$GraphicsType[] r0 = (com.badlogic.gdx.Graphics.GraphicsType[]) r0
                return r0
        }
    }

    public static class Monitor {
        public final java.lang.String name;
        public final int virtualX;
        public final int virtualY;

        protected Monitor(int r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.virtualX = r1
                r0.virtualY = r2
                r0.name = r3
                return
        }
    }

    int getBackBufferHeight();

    int getBackBufferWidth();

    float getDeltaTime();

    com.badlogic.gdx.Graphics.DisplayMode getDisplayMode();

    int getHeight();

    float getPpiX();

    float getPpiY();

    int getWidth();

    boolean isContinuousRendering();

    boolean isGL30Available();

    void requestRendering();

    void setContinuousRendering(boolean r1);

    boolean supportsExtension(java.lang.String r1);
}
