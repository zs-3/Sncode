package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public class Gdx2DPixmap implements com.badlogic.gdx.utils.Disposable {
    long basePtr;
    int format;
    int height;
    long[] nativeData;
    java.nio.ByteBuffer pixelPtr;
    int width;

    public Gdx2DPixmap(int r4, int r5, int r6) throws com.badlogic.gdx.utils.GdxRuntimeException {
            r3 = this;
            r3.<init>()
            r0 = 4
            long[] r0 = new long[r0]
            r3.nativeData = r0
            java.nio.ByteBuffer r0 = newPixmap(r0, r4, r5, r6)
            r3.pixelPtr = r0
            if (r0 == 0) goto L2a
            long[] r4 = r3.nativeData
            r5 = 0
            r5 = r4[r5]
            r3.basePtr = r5
            r5 = 1
            r5 = r4[r5]
            int r6 = (int) r5
            r3.width = r6
            r5 = 2
            r5 = r4[r5]
            int r6 = (int) r5
            r3.height = r6
            r5 = 3
            r5 = r4[r5]
            int r4 = (int) r5
            r3.format = r4
            return
        L2a:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to allocate memory for pixmap: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "x"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = ", "
            r1.append(r4)
            java.lang.String r4 = getFormatString(r6)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public Gdx2DPixmap(byte[] r2, int r3, int r4, int r5) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            r0 = 4
            long[] r0 = new long[r0]
            r1.nativeData = r0
            java.nio.ByteBuffer r2 = load(r0, r2, r3, r4)
            r1.pixelPtr = r2
            if (r2 == 0) goto L31
            long[] r2 = r1.nativeData
            r3 = 0
            r3 = r2[r3]
            r1.basePtr = r3
            r3 = 1
            r3 = r2[r3]
            int r4 = (int) r3
            r1.width = r4
            r3 = 2
            r3 = r2[r3]
            int r4 = (int) r3
            r1.height = r4
            r3 = 3
            r3 = r2[r3]
            int r2 = (int) r3
            r1.format = r2
            if (r5 == 0) goto L30
            if (r5 == r2) goto L30
            r1.convert(r5)
        L30:
            return
        L31:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error loading pixmap: "
            r3.append(r4)
            java.lang.String r4 = getFailureReason()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private static native void clear(long r0, int r2);

    private void convert(int r10) {
            r9 = this;
            com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r8 = new com.badlogic.gdx.graphics.g2d.Gdx2DPixmap
            int r0 = r9.width
            int r1 = r9.height
            r8.<init>(r0, r1, r10)
            r10 = 0
            r8.setBlend(r10)
            int r6 = r9.width
            int r7 = r9.height
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r0.drawPixmap(r1, r2, r3, r4, r5, r6, r7)
            r9.dispose()
            long r0 = r8.basePtr
            r9.basePtr = r0
            int r10 = r8.format
            r9.format = r10
            int r10 = r8.height
            r9.height = r10
            long[] r10 = r8.nativeData
            r9.nativeData = r10
            java.nio.ByteBuffer r10 = r8.pixelPtr
            r9.pixelPtr = r10
            int r10 = r8.width
            r9.width = r10
            return
    }

    private static native void drawPixmap(long r0, long r2, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11);

    private static native void free(long r0);

    public static native java.lang.String getFailureReason();

    private static java.lang.String getFormatString(int r0) {
            switch(r0) {
                case 1: goto L15;
                case 2: goto L12;
                case 3: goto Lf;
                case 4: goto Lc;
                case 5: goto L9;
                case 6: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "unknown"
            return r0
        L6:
            java.lang.String r0 = "rgba4444"
            return r0
        L9:
            java.lang.String r0 = "rgb565"
            return r0
        Lc:
            java.lang.String r0 = "rgba8888"
            return r0
        Lf:
            java.lang.String r0 = "rgb888"
            return r0
        L12:
            java.lang.String r0 = "luminance alpha"
            return r0
        L15:
            java.lang.String r0 = "alpha"
            return r0
    }

    private static native int getPixel(long r0, int r2, int r3);

    private static native java.nio.ByteBuffer load(long[] r0, byte[] r1, int r2, int r3);

    private static native java.nio.ByteBuffer newPixmap(long[] r0, int r1, int r2, int r3);

    private static native void setBlend(long r0, int r2);

    private static native void setPixel(long r0, int r2, int r3, int r4);

    private static native void setScale(long r0, int r2);

    public static int toGlFormat(int r3) {
            switch(r3) {
                case 1: goto L23;
                case 2: goto L20;
                case 3: goto L1d;
                case 4: goto L1a;
                case 5: goto L1d;
                case 6: goto L1a;
                default: goto L3;
            }
        L3:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown format: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L1a:
            r3 = 6408(0x1908, float:8.98E-42)
            return r3
        L1d:
            r3 = 6407(0x1907, float:8.978E-42)
            return r3
        L20:
            r3 = 6410(0x190a, float:8.982E-42)
            return r3
        L23:
            r3 = 6406(0x1906, float:8.977E-42)
            return r3
    }

    public static int toGlType(int r3) {
            switch(r3) {
                case 1: goto L22;
                case 2: goto L22;
                case 3: goto L22;
                case 4: goto L22;
                case 5: goto L1e;
                case 6: goto L1a;
                default: goto L3;
            }
        L3:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown format: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L1a:
            r3 = 32819(0x8033, float:4.5989E-41)
            return r3
        L1e:
            r3 = 33635(0x8363, float:4.7133E-41)
            return r3
        L22:
            r3 = 5121(0x1401, float:7.176E-42)
            return r3
    }

    public void clear(int r3) {
            r2 = this;
            long r0 = r2.basePtr
            clear(r0, r3)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            long r0 = r2.basePtr
            free(r0)
            return
    }

    public void drawPixmap(com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r14, int r15, int r16, int r17, int r18, int r19, int r20) {
            r13 = this;
            r0 = r14
            long r0 = r0.basePtr
            r12 = r13
            long r2 = r12.basePtr
            r4 = r15
            r5 = r16
            r6 = r19
            r7 = r20
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            drawPixmap(r0, r2, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public void drawPixmap(com.badlogic.gdx.graphics.g2d.Gdx2DPixmap r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22) {
            r13 = this;
            r0 = r14
            long r0 = r0.basePtr
            r12 = r13
            long r2 = r12.basePtr
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            drawPixmap(r0, r2, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public int getFormat() {
            r1 = this;
            int r0 = r1.format
            return r0
    }

    public int getGLFormat() {
            r1 = this;
            int r0 = r1.getGLInternalFormat()
            return r0
    }

    public int getGLInternalFormat() {
            r1 = this;
            int r0 = r1.format
            int r0 = toGlFormat(r0)
            return r0
    }

    public int getGLType() {
            r1 = this;
            int r0 = r1.format
            int r0 = toGlType(r0)
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public int getPixel(int r3, int r4) {
            r2 = this;
            long r0 = r2.basePtr
            int r3 = getPixel(r0, r3, r4)
            return r3
    }

    public java.nio.ByteBuffer getPixels() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.pixelPtr
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    public void setBlend(int r3) {
            r2 = this;
            long r0 = r2.basePtr
            setBlend(r0, r3)
            return
    }

    public void setPixel(int r3, int r4, int r5) {
            r2 = this;
            long r0 = r2.basePtr
            setPixel(r0, r3, r4, r5)
            return
    }

    public void setScale(int r3) {
            r2 = this;
            long r0 = r2.basePtr
            setScale(r0, r3)
            return
    }
}
