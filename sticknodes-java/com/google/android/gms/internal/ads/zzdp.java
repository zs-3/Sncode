package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdp implements android.graphics.SurfaceTexture.OnFrameAvailableListener, java.lang.Runnable {
    private static final int[] zza = null;
    private final android.os.Handler zzb;
    private final int[] zzc;
    private android.opengl.EGLDisplay zzd;
    private android.opengl.EGLContext zze;
    private android.opengl.EGLSurface zzf;
    private android.graphics.SurfaceTexture zzg;

    static {
            r0 = 17
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344} // fill-array
            com.google.android.gms.internal.ads.zzdp.zza = r0
            return
    }

    public zzdp(android.os.Handler r1, com.google.android.gms.internal.ads.zzdo r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r1 = 1
            int[] r1 = new int[r1]
            r0.zzc = r1
            return
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture r1) {
            r0 = this;
            android.os.Handler r1 = r0.zzb
            r1.post(r0)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            android.graphics.SurfaceTexture r0 = r1.zzg
            if (r0 == 0) goto L7
            r0.updateTexImage()     // Catch: java.lang.RuntimeException -> L7
        L7:
            return
    }

    public final android.graphics.SurfaceTexture zza() {
            r1 = this;
            android.graphics.SurfaceTexture r0 = r1.zzg
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    public final void zzb(int r14) throws com.google.android.gms.internal.ads.zzdq {
            r13 = this;
            r0 = 0
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r0)
            r9 = 1
            if (r1 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            java.lang.String r3 = "eglGetDisplay failed"
            com.google.android.gms.internal.ads.zzdr.zza(r2, r3)
            r10 = 2
            int[] r2 = new int[r10]
            boolean r2 = android.opengl.EGL14.eglInitialize(r1, r2, r0, r2, r9)
            java.lang.String r3 = "eglInitialize failed"
            com.google.android.gms.internal.ads.zzdr.zza(r2, r3)
            r13.zzd = r1
            android.opengl.EGLConfig[] r11 = new android.opengl.EGLConfig[r9]
            int[] r12 = new int[r9]
            int[] r2 = com.google.android.gms.internal.ads.zzdp.zza
            r3 = 0
            r5 = 0
            r6 = 1
            r8 = 0
            r4 = r11
            r7 = r12
            boolean r1 = android.opengl.EGL14.eglChooseConfig(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r1 == 0) goto L3a
            r2 = r12[r0]
            if (r2 <= 0) goto L3a
            r2 = r11[r0]
            if (r2 == 0) goto L3a
            r2 = 1
            goto L3b
        L3a:
            r2 = 0
        L3b:
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4[r0] = r1
            r1 = r12[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r9] = r1
            r1 = r11[r0]
            r4[r10] = r1
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r5 = "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s"
            java.lang.String r1 = java.lang.String.format(r1, r5, r4)
            com.google.android.gms.internal.ads.zzdr.zza(r2, r1)
            r1 = r11[r0]
            android.opengl.EGLDisplay r2 = r13.zzd
            r4 = 5
            if (r14 != 0) goto L68
            int[] r3 = new int[r3]
            r3 = {x00fe: FILL_ARRAY_DATA , data: [12440, 2, 12344} // fill-array
            goto L6d
        L68:
            int[] r3 = new int[r4]
            r3 = {x0108: FILL_ARRAY_DATA , data: [12440, 2, 12992, 1, 12344} // fill-array
        L6d:
            android.opengl.EGLContext r5 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGLContext r2 = android.opengl.EGL14.eglCreateContext(r2, r1, r5, r3, r0)
            if (r2 == 0) goto L77
            r3 = 1
            goto L78
        L77:
            r3 = 0
        L78:
            java.lang.String r5 = "eglCreateContext failed"
            com.google.android.gms.internal.ads.zzdr.zza(r3, r5)
            r13.zze = r2
            android.opengl.EGLDisplay r3 = r13.zzd
            if (r14 != r9) goto L86
            android.opengl.EGLSurface r14 = android.opengl.EGL14.EGL_NO_SURFACE
            goto La2
        L86:
            if (r14 != r10) goto L8f
            r14 = 7
            int[] r14 = new int[r14]
            r14 = {x0116: FILL_ARRAY_DATA , data: [12375, 1, 12374, 1, 12992, 1, 12344} // fill-array
            goto L94
        L8f:
            int[] r14 = new int[r4]
            r14 = {x0128: FILL_ARRAY_DATA , data: [12375, 1, 12374, 1, 12344} // fill-array
        L94:
            android.opengl.EGLSurface r14 = android.opengl.EGL14.eglCreatePbufferSurface(r3, r1, r14, r0)
            if (r14 == 0) goto L9c
            r1 = 1
            goto L9d
        L9c:
            r1 = 0
        L9d:
            java.lang.String r4 = "eglCreatePbufferSurface failed"
            com.google.android.gms.internal.ads.zzdr.zza(r1, r4)
        La2:
            boolean r1 = android.opengl.EGL14.eglMakeCurrent(r3, r14, r14, r2)
            java.lang.String r2 = "eglMakeCurrent failed"
            com.google.android.gms.internal.ads.zzdr.zza(r1, r2)
            r13.zzf = r14
            int[] r14 = r13.zzc
            android.opengl.GLES20.glGenTextures(r9, r14, r0)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r1 = 0
        Lb8:
            int r2 = android.opengl.GLES20.glGetError()
            if (r2 == 0) goto Le3
            if (r1 == 0) goto Lc5
            r1 = 10
            r14.append(r1)
        Lc5:
            java.lang.String r1 = android.opengl.GLU.gluErrorString(r2)
            if (r1 != 0) goto Ld9
            java.lang.String r1 = java.lang.Integer.toHexString(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "error code: 0x"
            java.lang.String r1 = r2.concat(r1)
        Ld9:
            java.lang.String r2 = "glError: "
            r14.append(r2)
            r14.append(r1)
            r1 = 1
            goto Lb8
        Le3:
            if (r1 != 0) goto Lf4
            int[] r14 = r13.zzc
            android.graphics.SurfaceTexture r1 = new android.graphics.SurfaceTexture
            r14 = r14[r0]
            r1.<init>(r14)
            r13.zzg = r1
            r1.setOnFrameAvailableListener(r13)
            return
        Lf4:
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.zzdq r0 = new com.google.android.gms.internal.ads.zzdq
            r0.<init>(r14)
            throw r0
    }

    public final void zzc() {
            r5 = this;
            android.os.Handler r0 = r5.zzb
            r0.removeCallbacks(r5)
            r0 = 0
            android.graphics.SurfaceTexture r1 = r5.zzg     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L14
            r1.release()     // Catch: java.lang.Throwable -> L62
            r1 = 1
            int[] r2 = r5.zzc     // Catch: java.lang.Throwable -> L62
            r3 = 0
            android.opengl.GLES20.glDeleteTextures(r1, r2, r3)     // Catch: java.lang.Throwable -> L62
        L14:
            android.opengl.EGLDisplay r1 = r5.zzd
            if (r1 == 0) goto L29
            android.opengl.EGLDisplay r2 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L29
            android.opengl.EGLDisplay r1 = r5.zzd
            android.opengl.EGLSurface r2 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r3 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r1, r2, r2, r3)
        L29:
            android.opengl.EGLSurface r1 = r5.zzf
            if (r1 == 0) goto L3c
            android.opengl.EGLSurface r2 = android.opengl.EGL14.EGL_NO_SURFACE
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3c
            android.opengl.EGLDisplay r1 = r5.zzd
            android.opengl.EGLSurface r2 = r5.zzf
            android.opengl.EGL14.eglDestroySurface(r1, r2)
        L3c:
            android.opengl.EGLContext r1 = r5.zze
            if (r1 == 0) goto L45
            android.opengl.EGLDisplay r2 = r5.zzd
            android.opengl.EGL14.eglDestroyContext(r2, r1)
        L45:
            android.opengl.EGL14.eglReleaseThread()
            android.opengl.EGLDisplay r1 = r5.zzd
            if (r1 == 0) goto L59
            android.opengl.EGLDisplay r2 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L59
            android.opengl.EGLDisplay r1 = r5.zzd
            android.opengl.EGL14.eglTerminate(r1)
        L59:
            r5.zzd = r0
            r5.zze = r0
            r5.zzf = r0
            r5.zzg = r0
            return
        L62:
            r1 = move-exception
            android.opengl.EGLDisplay r2 = r5.zzd
            if (r2 == 0) goto L78
            android.opengl.EGLDisplay r3 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L78
            android.opengl.EGLDisplay r2 = r5.zzd
            android.opengl.EGLSurface r3 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r4 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r2, r3, r3, r4)
        L78:
            android.opengl.EGLSurface r2 = r5.zzf
            if (r2 == 0) goto L8b
            android.opengl.EGLSurface r3 = android.opengl.EGL14.EGL_NO_SURFACE
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8b
            android.opengl.EGLDisplay r2 = r5.zzd
            android.opengl.EGLSurface r3 = r5.zzf
            android.opengl.EGL14.eglDestroySurface(r2, r3)
        L8b:
            android.opengl.EGLContext r2 = r5.zze
            if (r2 == 0) goto L94
            android.opengl.EGLDisplay r3 = r5.zzd
            android.opengl.EGL14.eglDestroyContext(r3, r2)
        L94:
            android.opengl.EGL14.eglReleaseThread()
            android.opengl.EGLDisplay r2 = r5.zzd
            if (r2 == 0) goto La9
            android.opengl.EGLDisplay r3 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto La4
            goto La9
        La4:
            android.opengl.EGLDisplay r2 = r5.zzd
            android.opengl.EGL14.eglTerminate(r2)
        La9:
            r5.zzd = r0
            r5.zze = r0
            r5.zzf = r0
            r5.zzg = r0
            throw r1
    }
}
