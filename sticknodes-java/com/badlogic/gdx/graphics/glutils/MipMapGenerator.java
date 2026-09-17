package com.badlogic.gdx.graphics.glutils;

/* loaded from: classes.dex */
public class MipMapGenerator {
    private static boolean useHWMipMap = true;

    static {
            return
    }

    public static void generateMipMap(int r2, com.badlogic.gdx.graphics.Pixmap r3, int r4, int r5) {
            boolean r0 = com.badlogic.gdx.graphics.glutils.MipMapGenerator.useHWMipMap
            if (r0 != 0) goto L8
            generateMipMapCPU(r2, r3, r4, r5)
            return
        L8:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.Android
            if (r0 == r1) goto L2b
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.WebGL
            if (r0 == r1) goto L2b
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r0 != r1) goto L27
            goto L2b
        L27:
            generateMipMapDesktop(r2, r3, r4, r5)
            goto L2e
        L2b:
            generateMipMapGLES20(r2, r3)
        L2e:
            return
    }

    private static void generateMipMapCPU(int r23, com.badlogic.gdx.graphics.Pixmap r24, int r25, int r26) {
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r3 = r24.getGLInternalFormat()
            int r4 = r24.getWidth()
            int r5 = r24.getHeight()
            int r7 = r24.getGLFormat()
            int r8 = r24.getGLType()
            java.nio.ByteBuffer r9 = r24.getPixels()
            r2 = 0
            r6 = 0
            r1 = r23
            r0.glTexImage2D(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            if (r0 != 0) goto L34
            r0 = r25
            r1 = r26
            if (r0 != r1) goto L2c
            goto L34
        L2c:
            com.badlogic.gdx.utils.GdxRuntimeException r0 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r1 = "texture width and height must be square when using mipmapping."
            r0.<init>(r1)
            throw r0
        L34:
            int r0 = r24.getWidth()
            int r0 = r0 / 2
            int r1 = r24.getHeight()
            int r1 = r1 / 2
            r2 = 1
            r11 = r0
            r12 = r1
            r1 = 1
            r0 = r24
        L46:
            if (r11 <= 0) goto La0
            if (r12 <= 0) goto La0
            com.badlogic.gdx.graphics.Pixmap r15 = new com.badlogic.gdx.graphics.Pixmap
            com.badlogic.gdx.graphics.Pixmap$Format r3 = r0.getFormat()
            r15.<init>(r11, r12, r3)
            com.badlogic.gdx.graphics.Pixmap$Blending r3 = com.badlogic.gdx.graphics.Pixmap.Blending.None
            r15.setBlending(r3)
            r5 = 0
            r6 = 0
            int r7 = r0.getWidth()
            int r8 = r0.getHeight()
            r9 = 0
            r10 = 0
            r3 = r15
            r4 = r0
            r3.drawPixmap(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 <= r2) goto L6e
            r0.dispose()
        L6e:
            com.badlogic.gdx.graphics.GL20 r13 = com.badlogic.gdx.Gdx.gl
            int r16 = r15.getGLInternalFormat()
            int r17 = r15.getWidth()
            int r18 = r15.getHeight()
            r19 = 0
            int r20 = r15.getGLFormat()
            int r21 = r15.getGLType()
            java.nio.ByteBuffer r22 = r15.getPixels()
            r14 = r23
            r0 = r15
            r15 = r1
            r13.glTexImage2D(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            int r3 = r0.getWidth()
            int r11 = r3 / 2
            int r3 = r0.getHeight()
            int r12 = r3 / 2
            int r1 = r1 + 1
            goto L46
        La0:
            return
    }

    private static void generateMipMapDesktop(int r11, com.badlogic.gdx.graphics.Pixmap r12, int r13, int r14) {
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            java.lang.String r1 = "GL_ARB_framebuffer_object"
            boolean r0 = r0.supportsExtension(r1)
            if (r0 != 0) goto L2f
            com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
            java.lang.String r1 = "GL_EXT_framebuffer_object"
            boolean r0 = r0.supportsExtension(r1)
            if (r0 != 0) goto L2f
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl20
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.badlogic.gdx.backends.lwjgl3.Lwjgl3GLES20"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2f
            com.badlogic.gdx.graphics.GL30 r0 = com.badlogic.gdx.Gdx.gl30
            if (r0 == 0) goto L2b
            goto L2f
        L2b:
            generateMipMapCPU(r11, r12, r13, r14)
            goto L54
        L2f:
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r3 = 0
            int r4 = r12.getGLInternalFormat()
            int r5 = r12.getWidth()
            int r6 = r12.getHeight()
            r7 = 0
            int r8 = r12.getGLFormat()
            int r9 = r12.getGLType()
            java.nio.ByteBuffer r10 = r12.getPixels()
            r2 = r11
            r1.glTexImage2D(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.badlogic.gdx.graphics.GL20 r12 = com.badlogic.gdx.Gdx.gl20
            r12.glGenerateMipmap(r11)
        L54:
            return
    }

    private static void generateMipMapGLES20(int r10, com.badlogic.gdx.graphics.Pixmap r11) {
            com.badlogic.gdx.graphics.GL20 r0 = com.badlogic.gdx.Gdx.gl
            int r3 = r11.getGLInternalFormat()
            int r4 = r11.getWidth()
            int r5 = r11.getHeight()
            int r7 = r11.getGLFormat()
            int r8 = r11.getGLType()
            java.nio.ByteBuffer r9 = r11.getPixels()
            r2 = 0
            r6 = 0
            r1 = r10
            r0.glTexImage2D(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.badlogic.gdx.graphics.GL20 r11 = com.badlogic.gdx.Gdx.gl20
            r11.glGenerateMipmap(r10)
            return
    }
}
