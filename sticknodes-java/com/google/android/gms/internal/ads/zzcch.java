package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcch extends java.lang.Thread implements android.graphics.SurfaceTexture.OnFrameAvailableListener, com.google.android.gms.internal.ads.zzccf {
    private static final float[] zza = null;
    private volatile boolean zzA;
    private volatile boolean zzB;
    private final com.google.android.gms.internal.ads.zzccg zzb;
    private final float[] zzc;
    private final float[] zzd;
    private final float[] zze;
    private final float[] zzf;
    private final float[] zzg;
    private final float[] zzh;
    private final float[] zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private android.graphics.SurfaceTexture zzo;
    private android.graphics.SurfaceTexture zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private final java.nio.FloatBuffer zzt;
    private final java.util.concurrent.CountDownLatch zzu;
    private final java.lang.Object zzv;
    private javax.microedition.khronos.egl.EGL10 zzw;
    private javax.microedition.khronos.egl.EGLDisplay zzx;
    private javax.microedition.khronos.egl.EGLContext zzy;
    private javax.microedition.khronos.egl.EGLSurface zzz;

    static {
            r0 = 12
            float[] r0 = new float[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [-1082130432, -1082130432, -1082130432, 1065353216, -1082130432, -1082130432, -1082130432, 1065353216, -1082130432, 1065353216, 1065353216, -1082130432} // fill-array
            com.google.android.gms.internal.ads.zzcch.zza = r0
            return
    }

    public zzcch(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "SphericalVideoProcessor"
            r3.<init>(r0)
            float[] r0 = com.google.android.gms.internal.ads.zzcch.zza
            int r1 = r0.length
            r1 = 48
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r1 = r1.order(r2)
            java.nio.FloatBuffer r1 = r1.asFloatBuffer()
            r3.zzt = r1
            java.nio.FloatBuffer r0 = r1.put(r0)
            r1 = 0
            r0.position(r1)
            r0 = 9
            float[] r1 = new float[r0]
            r3.zzc = r1
            float[] r1 = new float[r0]
            r3.zzd = r1
            float[] r1 = new float[r0]
            r3.zze = r1
            float[] r1 = new float[r0]
            r3.zzf = r1
            float[] r1 = new float[r0]
            r3.zzg = r1
            float[] r1 = new float[r0]
            r3.zzh = r1
            float[] r0 = new float[r0]
            r3.zzi = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r3.zzj = r0
            com.google.android.gms.internal.ads.zzccg r0 = new com.google.android.gms.internal.ads.zzccg
            r0.<init>(r4)
            r3.zzb = r0
            r0.zzb(r3)
            java.util.concurrent.CountDownLatch r4 = new java.util.concurrent.CountDownLatch
            r0 = 1
            r4.<init>(r0)
            r3.zzu = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r3.zzv = r4
            return
    }

    private static final void zzh(java.lang.String r2) {
            int r0 = android.opengl.GLES20.glGetError()
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = ": glError "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            java.lang.String r0 = "SphericalVideoRenderer"
            android.util.Log.e(r0, r2)
        L1f:
            return
    }

    private static final void zzi(float[] r13, float[] r14, float[] r15) {
            r0 = 0
            r1 = r14[r0]
            r2 = r15[r0]
            float r1 = r1 * r2
            r2 = 1
            r3 = r14[r2]
            r4 = 3
            r5 = r15[r4]
            float r3 = r3 * r5
            r5 = 2
            r6 = r14[r5]
            r7 = 6
            r8 = r15[r7]
            float r6 = r6 * r8
            float r1 = r1 + r3
            float r1 = r1 + r6
            r13[r0] = r1
            r1 = r14[r0]
            r3 = r15[r2]
            float r1 = r1 * r3
            r3 = r14[r2]
            r6 = 4
            r8 = r15[r6]
            float r3 = r3 * r8
            r8 = r14[r5]
            r9 = 7
            r10 = r15[r9]
            float r8 = r8 * r10
            float r1 = r1 + r3
            float r1 = r1 + r8
            r13[r2] = r1
            r1 = r14[r0]
            r3 = r15[r5]
            float r1 = r1 * r3
            r3 = r14[r2]
            r8 = 5
            r10 = r15[r8]
            float r3 = r3 * r10
            r10 = r14[r5]
            r11 = 8
            r12 = r15[r11]
            float r10 = r10 * r12
            float r1 = r1 + r3
            float r1 = r1 + r10
            r13[r5] = r1
            r1 = r14[r4]
            r3 = r15[r0]
            float r1 = r1 * r3
            r3 = r14[r6]
            r10 = r15[r4]
            float r3 = r3 * r10
            r10 = r14[r8]
            r12 = r15[r7]
            float r10 = r10 * r12
            float r1 = r1 + r3
            float r1 = r1 + r10
            r13[r4] = r1
            r1 = r14[r4]
            r3 = r15[r2]
            float r1 = r1 * r3
            r3 = r14[r6]
            r10 = r15[r6]
            float r3 = r3 * r10
            r10 = r14[r8]
            r12 = r15[r9]
            float r10 = r10 * r12
            float r1 = r1 + r3
            float r1 = r1 + r10
            r13[r6] = r1
            r1 = r14[r4]
            r3 = r15[r5]
            float r1 = r1 * r3
            r3 = r14[r6]
            r10 = r15[r8]
            float r3 = r3 * r10
            r10 = r14[r8]
            r12 = r15[r11]
            float r10 = r10 * r12
            float r1 = r1 + r3
            float r1 = r1 + r10
            r13[r8] = r1
            r1 = r14[r7]
            r0 = r15[r0]
            float r1 = r1 * r0
            r0 = r14[r9]
            r3 = r15[r4]
            float r0 = r0 * r3
            r3 = r14[r11]
            r4 = r15[r7]
            float r3 = r3 * r4
            float r1 = r1 + r0
            float r1 = r1 + r3
            r13[r7] = r1
            r0 = r14[r7]
            r1 = r15[r2]
            float r0 = r0 * r1
            r1 = r14[r9]
            r2 = r15[r6]
            float r1 = r1 * r2
            r2 = r14[r11]
            float r0 = r0 + r1
            r1 = r15[r9]
            float r2 = r2 * r1
            float r0 = r0 + r2
            r13[r9] = r0
            r0 = r14[r7]
            r1 = r15[r5]
            float r0 = r0 * r1
            r1 = r14[r9]
            r2 = r15[r8]
            float r1 = r1 * r2
            r14 = r14[r11]
            r15 = r15[r11]
            float r14 = r14 * r15
            float r0 = r0 + r1
            float r0 = r0 + r14
            r13[r11] = r0
            return
    }

    private static final void zzj(float[] r6, float r7) {
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r6[r0] = r1
            r0 = 1
            r1 = 0
            r6[r0] = r1
            r0 = 2
            r6[r0] = r1
            r0 = 3
            r6[r0] = r1
            double r2 = (double) r7
            double r4 = java.lang.Math.cos(r2)
            float r7 = (float) r4
            r0 = 4
            r6[r0] = r7
            double r4 = java.lang.Math.sin(r2)
            double r4 = -r4
            float r7 = (float) r4
            r0 = 5
            r6[r0] = r7
            r7 = 6
            r6[r7] = r1
            double r0 = java.lang.Math.sin(r2)
            float r7 = (float) r0
            r0 = 7
            r6[r0] = r7
            double r0 = java.lang.Math.cos(r2)
            float r7 = (float) r0
            r0 = 8
            r6[r0] = r7
            return
    }

    private static final void zzk(float[] r5, float r6) {
            double r0 = (double) r6
            double r2 = java.lang.Math.cos(r0)
            float r6 = (float) r2
            r2 = 0
            r5[r2] = r6
            double r2 = java.lang.Math.sin(r0)
            double r2 = -r2
            float r6 = (float) r2
            r2 = 1
            r5[r2] = r6
            r6 = 2
            r2 = 0
            r5[r6] = r2
            double r3 = java.lang.Math.sin(r0)
            float r6 = (float) r3
            r3 = 3
            r5[r3] = r6
            double r0 = java.lang.Math.cos(r0)
            float r6 = (float) r0
            r0 = 4
            r5[r0] = r6
            r6 = 5
            r5[r6] = r2
            r6 = 6
            r5[r6] = r2
            r6 = 7
            r5[r6] = r2
            r6 = 8
            r0 = 1065353216(0x3f800000, float:1.0)
            r5[r6] = r0
            return
    }

    private static final int zzl(int r3, java.lang.String r4) {
            int r0 = android.opengl.GLES20.glCreateShader(r3)
            java.lang.String r1 = "createShader"
            zzh(r1)
            if (r0 == 0) goto L59
            android.opengl.GLES20.glShaderSource(r0, r4)
            java.lang.String r4 = "shaderSource"
            zzh(r4)
            android.opengl.GLES20.glCompileShader(r0)
            java.lang.String r4 = "compileShader"
            zzh(r4)
            r4 = 35713(0x8b81, float:5.0045E-41)
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 0
            android.opengl.GLES20.glGetShaderiv(r0, r4, r1, r2)
            java.lang.String r4 = "getShaderiv"
            zzh(r4)
            r4 = r1[r2]
            if (r4 != 0) goto L59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Could not compile shader "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r3 = ":"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "SphericalVideoRenderer"
            android.util.Log.e(r4, r3)
            java.lang.String r3 = android.opengl.GLES20.glGetShaderInfoLog(r0)
            android.util.Log.e(r4, r3)
            android.opengl.GLES20.glDeleteShader(r0)
            java.lang.String r3 = "deleteShader"
            zzh(r3)
            return r2
        L59:
            return r0
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture r2) {
            r1 = this;
            int r2 = r1.zzs
            int r2 = r2 + 1
            r1.zzs = r2
            java.lang.Object r2 = r1.zzv
            monitor-enter(r2)
            java.lang.Object r0 = r1.zzv     // Catch: java.lang.Throwable -> L10
            r0.notifyAll()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r15 = this;
            android.graphics.SurfaceTexture r0 = r15.zzp
            if (r0 == 0) goto L37c
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r15.zzw = r0
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r15.zzx = r0
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 != r1) goto L20
        L1d:
            r0 = 0
            goto L87
        L20:
            int[] r1 = new int[r3]
            javax.microedition.khronos.egl.EGL10 r7 = r15.zzw
            boolean r0 = r7.eglInitialize(r0, r1)
            if (r0 != 0) goto L2b
            goto L1d
        L2b:
            int[] r0 = new int[r5]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r7 = 11
            int[] r9 = new int[r7]
            r9 = {x0388: FILL_ARRAY_DATA , data: [12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r15.zzw
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.zzx
            r11 = 1
            r10 = r1
            r12 = r0
            boolean r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12)
            if (r7 != 0) goto L45
        L43:
            r0 = r4
            goto L4b
        L45:
            r0 = r0[r6]
            if (r0 <= 0) goto L43
            r0 = r1[r6]
        L4b:
            if (r0 != 0) goto L4e
            goto L1d
        L4e:
            int[] r1 = new int[r2]
            r1 = {x03a2: FILL_ARRAY_DATA , data: [12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r15.zzw
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.zzx
            javax.microedition.khronos.egl.EGLContext r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r7.eglCreateContext(r8, r0, r9, r1)
            r15.zzy = r1
            if (r1 == 0) goto L1d
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r7) goto L66
            goto L1d
        L66:
            javax.microedition.khronos.egl.EGL10 r1 = r15.zzw
            javax.microedition.khronos.egl.EGLDisplay r7 = r15.zzx
            android.graphics.SurfaceTexture r8 = r15.zzp
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r7, r0, r8, r4)
            r15.zzz = r0
            if (r0 == 0) goto L1d
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L79
            goto L1d
        L79:
            javax.microedition.khronos.egl.EGL10 r1 = r15.zzw
            javax.microedition.khronos.egl.EGLDisplay r7 = r15.zzx
            javax.microedition.khronos.egl.EGLContext r8 = r15.zzy
            boolean r0 = r1.eglMakeCurrent(r7, r0, r0, r8)
            if (r0 != 0) goto L86
            goto L1d
        L86:
            r0 = 1
        L87:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbn
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r7.zza(r1)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r1.zzk()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto La8
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r7.zza(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto Laa
        La8:
            java.lang.String r1 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        Laa:
            r7 = 35633(0x8b31, float:4.9932E-41)
            int r1 = zzl(r7, r1)
            if (r1 != 0) goto Lb6
        Lb3:
            r9 = 0
            goto L138
        Lb6:
            com.google.android.gms.internal.ads.zzbcm r7 = com.google.android.gms.internal.ads.zzbcv.zzbo
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r8 = r8.zza(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r7.zzk()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto Ld7
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r8.zza(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto Ld9
        Ld7:
            java.lang.String r7 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        Ld9:
            r8 = 35632(0x8b30, float:4.9931E-41)
            int r7 = zzl(r8, r7)
            if (r7 != 0) goto Le3
            goto Lb3
        Le3:
            java.lang.String r8 = "createProgram"
            int r9 = android.opengl.GLES20.glCreateProgram()
            zzh(r8)
            if (r9 == 0) goto L138
            android.opengl.GLES20.glAttachShader(r9, r1)
            java.lang.String r1 = "attachShader"
            zzh(r1)
            android.opengl.GLES20.glAttachShader(r9, r7)
            java.lang.String r1 = "attachShader"
            zzh(r1)
            android.opengl.GLES20.glLinkProgram(r9)
            java.lang.String r1 = "linkProgram"
            zzh(r1)
            r1 = 35714(0x8b82, float:5.0046E-41)
            int[] r7 = new int[r5]
            android.opengl.GLES20.glGetProgramiv(r9, r1, r7, r6)
            java.lang.String r1 = "getProgramiv"
            zzh(r1)
            r1 = r7[r6]
            if (r1 == r5) goto L130
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = "Could not link program: "
            android.util.Log.e(r1, r7)
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r9)
            java.lang.String r7 = "SphericalVideoRenderer"
            android.util.Log.e(r7, r1)
            android.opengl.GLES20.glDeleteProgram(r9)
            java.lang.String r1 = "deleteProgram"
            zzh(r1)
            goto Lb3
        L130:
            android.opengl.GLES20.glValidateProgram(r9)
            java.lang.String r1 = "validateProgram"
            zzh(r1)
        L138:
            r15.zzq = r9
            android.opengl.GLES20.glUseProgram(r9)
            java.lang.String r1 = "useProgram"
            zzh(r1)
            int r1 = r15.zzq
            java.lang.String r7 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r7)
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r11 = 0
            r12 = 12
            java.nio.FloatBuffer r13 = r15.zzt
            r8 = r1
            android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13)
            java.lang.String r7 = "vertexAttribPointer"
            zzh(r7)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            zzh(r1)
            int[] r1 = new int[r5]
            android.opengl.GLES20.glGenTextures(r5, r1, r6)
            java.lang.String r7 = "genTextures"
            zzh(r7)
            r1 = r1[r6]
            r7 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r7, r1)
            java.lang.String r8 = "bindTextures"
            zzh(r8)
            r8 = 10240(0x2800, float:1.4349E-41)
            r9 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            zzh(r8)
            r8 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            zzh(r8)
            r8 = 10242(0x2802, float:1.4352E-41)
            r9 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            zzh(r8)
            r8 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r7 = "texParameteri"
            zzh(r7)
            int r7 = r15.zzq
            java.lang.String r8 = "uVMat"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8)
            r15.zzr = r7
            r8 = 9
            float[] r8 = new float[r8]
            r8 = {x03ac: FILL_ARRAY_DATA , data: [1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            android.opengl.GLES20.glUniformMatrix3fv(r7, r5, r6, r8, r6)
            int r7 = r15.zzq
            if (r0 == 0) goto L34e
            if (r7 != 0) goto L1c3
            goto L34e
        L1c3:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r15.zzo = r0
            r0.setOnFrameAvailableListener(r15)
            java.util.concurrent.CountDownLatch r0 = r15.zzu
            r0.countDown()
            com.google.android.gms.internal.ads.zzccg r0 = r15.zzb
            r0.zzc()
            r15.zzA = r5     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
        L1d9:
            boolean r0 = r15.zzB     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            if (r0 == 0) goto L1df
            goto L32d
        L1df:
            int r0 = r15.zzs     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            if (r0 <= 0) goto L1ef
            android.graphics.SurfaceTexture r0 = r15.zzo     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r0.updateTexImage()     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            int r0 = r15.zzs     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            int r0 = r0 + (-1)
            r15.zzs = r0     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            goto L1df
        L1ef:
            com.google.android.gms.internal.ads.zzccg r0 = r15.zzb     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r1 = r15.zzc     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            boolean r0 = r0.zze(r1)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r1 = 5
            r7 = 4
            r8 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            if (r0 == 0) goto L267
            float r0 = r15.zzj     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            boolean r0 = java.lang.Float.isNaN(r0)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            if (r0 == 0) goto L25c
            float[] r0 = r15.zzc     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r9 = new float[r2]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r10 = 0
            r9[r6] = r10     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r11 = 1065353216(0x3f800000, float:1.0)
            r9[r5] = r11     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r9[r3] = r10     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r11 = new float[r2]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r12 = r0[r6]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r13 = r9[r6]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r12 = r12 * r13
            r14 = r0[r5]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r9 = r9[r5]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r14 = r14 * r9
            float r12 = r12 + r14
            r14 = r0[r3]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r14 = r14 * r10
            float r12 = r12 + r14
            r11[r6] = r12     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r12 = r0[r2]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r12 = r12 * r13
            r14 = r0[r7]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r14 = r14 * r9
            float r12 = r12 + r14
            r14 = r0[r1]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r14 = r14 * r10
            float r12 = r12 + r14
            r11[r5] = r12     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r12 = 6
            r12 = r0[r12]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r12 = r12 * r13
            r13 = 7
            r13 = r0[r13]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r13 = r13 * r9
            float r12 = r12 + r13
            r9 = 8
            r0 = r0[r9]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r0 = r0 * r10
            float r12 = r12 + r0
            r11[r3] = r12     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r0 = r11[r5]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            double r9 = (double) r0     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r0 = r11[r6]     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            double r11 = (double) r0     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            double r9 = java.lang.Math.atan2(r9, r11)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r0 = (float) r9     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r0 = r0 + r8
            float r0 = -r0
            r15.zzj = r0     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
        L25c:
            float[] r0 = r15.zzh     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r8 = r15.zzj     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r9 = r15.zzk     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r8 = r8 + r9
            zzk(r0, r8)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            goto L273
        L267:
            float[] r0 = r15.zzc     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            zzj(r0, r8)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r0 = r15.zzh     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r8 = r15.zzk     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            zzk(r0, r8)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
        L273:
            float[] r0 = r15.zzd     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r8 = 1070141403(0x3fc90fdb, float:1.5707964)
            zzj(r0, r8)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r0 = r15.zze     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r8 = r15.zzh     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r9 = r15.zzd     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            zzi(r0, r8, r9)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r0 = r15.zzf     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r8 = r15.zzc     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r9 = r15.zze     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            zzi(r0, r8, r9)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r0 = r15.zzg     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r8 = r15.zzl     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            zzj(r0, r8)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r0 = r15.zzi     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r8 = r15.zzg     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r9 = r15.zzf     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            zzi(r0, r8, r9)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            int r0 = r15.zzr     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float[] r8 = r15.zzi     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            android.opengl.GLES20.glUniformMatrix3fv(r0, r5, r6, r8, r6)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            android.opengl.GLES20.glDrawArrays(r1, r6, r7)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            java.lang.String r0 = "drawArrays"
            zzh(r0)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            android.opengl.GLES20.glFinish()     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            javax.microedition.khronos.egl.EGL10 r0 = r15.zzw     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            javax.microedition.khronos.egl.EGLDisplay r1 = r15.zzx     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            javax.microedition.khronos.egl.EGLSurface r7 = r15.zzz     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r0.eglSwapBuffers(r1, r7)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            boolean r0 = r15.zzA     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            if (r0 == 0) goto L2fe
            int r0 = r15.zzn     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            int r1 = r15.zzm     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            android.opengl.GLES20.glViewport(r6, r6, r0, r1)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            java.lang.String r0 = "viewport"
            zzh(r0)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            int r0 = r15.zzq     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            java.lang.String r1 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            int r1 = r15.zzq     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            java.lang.String r7 = "uFOVy"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r7)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            int r7 = r15.zzn     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            int r8 = r15.zzm     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            r9 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r7 <= r8) goto L2f1
            android.opengl.GLES20.glUniform1f(r0, r9)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            int r0 = r15.zzm     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r0 = r0 * r9
            int r7 = r15.zzn     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r0 = r0 / r7
            android.opengl.GLES20.glUniform1f(r1, r0)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            goto L2fc
        L2f1:
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r7 = r7 * r9
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            float r7 = r7 / r8
            android.opengl.GLES20.glUniform1f(r0, r7)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
        L2fc:
            r15.zzA = r6     // Catch: java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
        L2fe:
            java.lang.Object r0 = r15.zzv     // Catch: java.lang.InterruptedException -> L1d9 java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L1d9 java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
            boolean r1 = r15.zzB     // Catch: java.lang.Throwable -> L315
            if (r1 != 0) goto L312
            boolean r1 = r15.zzA     // Catch: java.lang.Throwable -> L315
            if (r1 != 0) goto L312
            int r1 = r15.zzs     // Catch: java.lang.Throwable -> L315
            if (r1 != 0) goto L312
            java.lang.Object r1 = r15.zzv     // Catch: java.lang.Throwable -> L315
            r1.wait()     // Catch: java.lang.Throwable -> L315
        L312:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L315
            goto L1d9
        L315:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L315
            throw r1     // Catch: java.lang.InterruptedException -> L1d9 java.lang.Throwable -> L318 java.lang.IllegalStateException -> L328
        L318:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)     // Catch: java.lang.Throwable -> L33d
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L33d
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            r1.zzw(r0, r2)     // Catch: java.lang.Throwable -> L33d
            goto L32d
        L328:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.Throwable -> L33d
        L32d:
            com.google.android.gms.internal.ads.zzccg r0 = r15.zzb
            r0.zzd()
            android.graphics.SurfaceTexture r0 = r15.zzo
            r0.setOnFrameAvailableListener(r4)
            r15.zzo = r4
            r15.zzg()
            return
        L33d:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzccg r1 = r15.zzb
            r1.zzd()
            android.graphics.SurfaceTexture r1 = r15.zzo
            r1.setOnFrameAvailableListener(r4)
            r15.zzo = r4
            r15.zzg()
            throw r0
        L34e:
            javax.microedition.khronos.egl.EGL10 r0 = r15.zzw
            int r0 = r0.eglGetError()
            java.lang.String r0 = android.opengl.GLUtils.getEGLErrorString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "EGL initialization failed: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r1.zzw(r2, r0)
            r15.zzg()
            java.util.concurrent.CountDownLatch r0 = r15.zzu
            r0.countDown()
            return
        L37c:
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)
            java.util.concurrent.CountDownLatch r0 = r15.zzu
            r0.countDown()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zza() {
            r2 = this;
            java.lang.Object r0 = r2.zzv
            monitor-enter(r0)
            java.lang.Object r1 = r2.zzv     // Catch: java.lang.Throwable -> La
            r1.notifyAll()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public final android.graphics.SurfaceTexture zzb() {
            r1 = this;
            android.graphics.SurfaceTexture r0 = r1.zzp
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.concurrent.CountDownLatch r0 = r1.zzu     // Catch: java.lang.InterruptedException -> Lb
            r0.await()     // Catch: java.lang.InterruptedException -> Lb
        Lb:
            android.graphics.SurfaceTexture r0 = r1.zzo
            return r0
    }

    public final void zzc(int r2, int r3) {
            r1 = this;
            java.lang.Object r0 = r1.zzv
            monitor-enter(r0)
            r1.zzn = r2     // Catch: java.lang.Throwable -> L11
            r1.zzm = r3     // Catch: java.lang.Throwable -> L11
            r2 = 1
            r1.zzA = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r1.zzv     // Catch: java.lang.Throwable -> L11
            r2.notifyAll()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public final void zzd(android.graphics.SurfaceTexture r1, int r2, int r3) {
            r0 = this;
            r0.zzn = r2
            r0.zzm = r3
            r0.zzp = r1
            return
    }

    public final void zze() {
            r2 = this;
            java.lang.Object r0 = r2.zzv
            monitor-enter(r0)
            r1 = 1
            r2.zzB = r1     // Catch: java.lang.Throwable -> L10
            r1 = 0
            r2.zzp = r1     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r2.zzv     // Catch: java.lang.Throwable -> L10
            r1.notifyAll()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    public final void zzf(float r4, float r5) {
            r3 = this;
            int r0 = r3.zzn
            int r1 = r3.zzm
            if (r0 > r1) goto L7
            r0 = r1
        L7:
            float r1 = r3.zzk
            r2 = 1071605491(0x3fdf66f3, float:1.7453293)
            float r4 = r4 * r2
            float r0 = (float) r0
            float r4 = r4 / r0
            float r1 = r1 - r4
            r3.zzk = r1
            float r4 = r3.zzl
            float r5 = r5 * r2
            float r5 = r5 / r0
            float r4 = r4 - r5
            r3.zzl = r4
            r5 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 >= 0) goto L27
            r3.zzl = r5
            r4 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
        L27:
            r5 = 1070141403(0x3fc90fdb, float:1.5707964)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L30
            r3.zzl = r5
        L30:
            return
    }

    final boolean zzg() {
            r5 = this;
            javax.microedition.khronos.egl.EGLSurface r0 = r5.zzz
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L21
            javax.microedition.khronos.egl.EGLSurface r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 == r3) goto L21
            javax.microedition.khronos.egl.EGL10 r0 = r5.zzw
            javax.microedition.khronos.egl.EGLDisplay r1 = r5.zzx
            javax.microedition.khronos.egl.EGLContext r4 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            boolean r0 = r0.eglMakeCurrent(r1, r3, r3, r4)
            javax.microedition.khronos.egl.EGL10 r1 = r5.zzw
            javax.microedition.khronos.egl.EGLDisplay r3 = r5.zzx
            javax.microedition.khronos.egl.EGLSurface r4 = r5.zzz
            boolean r1 = r1.eglDestroySurface(r3, r4)
            r1 = r1 | r0
            r5.zzz = r2
        L21:
            javax.microedition.khronos.egl.EGLContext r0 = r5.zzy
            if (r0 == 0) goto L30
            javax.microedition.khronos.egl.EGL10 r3 = r5.zzw
            javax.microedition.khronos.egl.EGLDisplay r4 = r5.zzx
            boolean r0 = r3.eglDestroyContext(r4, r0)
            r1 = r1 | r0
            r5.zzy = r2
        L30:
            javax.microedition.khronos.egl.EGLDisplay r0 = r5.zzx
            if (r0 == 0) goto L3e
            javax.microedition.khronos.egl.EGL10 r3 = r5.zzw
            boolean r0 = r3.eglTerminate(r0)
            r0 = r0 | r1
            r5.zzx = r2
            return r0
        L3e:
            return r1
    }
}
