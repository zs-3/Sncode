package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzt {
    public static final com.google.android.gms.internal.ads.zzfun zza = null;
    private final java.util.concurrent.atomic.AtomicReference zzb;
    private final java.util.concurrent.atomic.AtomicReference zzc;
    private final java.util.concurrent.atomic.AtomicReference zzd;
    private final java.util.concurrent.atomic.AtomicBoolean zze;
    private boolean zzf;
    private final java.lang.Object zzg;
    private java.lang.String zzh;
    private volatile java.lang.String zzi;
    private boolean zzj;
    private boolean zzk;
    private final java.util.concurrent.Executor zzl;

    static {
            com.google.android.gms.ads.internal.util.zzf r0 = new com.google.android.gms.ads.internal.util.zzf
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.google.android.gms.ads.internal.util.zzt.zza = r0
            return
    }

    public zzt() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r2.zzb = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r1)
            r2.zzc = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.<init>(r1)
            r2.zzd = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.zze = r0
            r0 = 1
            r2.zzf = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzg = r0
            r0 = 0
            r2.zzj = r0
            r2.zzk = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r2.zzl = r0
            return
    }

    public static final boolean zzA(android.content.Context r1, java.lang.String r2) {
            android.content.Context r1 = com.google.android.gms.internal.ads.zzbwk.zza(r1)
            java.lang.String r0 = r1.getPackageName()
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r1)
            int r1 = r1.checkPermission(r2, r0)
            if (r1 != 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    public static final boolean zzB(android.content.Context r0) {
            boolean r0 = com.google.android.gms.common.util.DeviceProperties.isBstar(r0)     // Catch: java.lang.NoSuchMethodError -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }

    public static final boolean zzC(java.lang.String r6) {
            boolean r0 = com.google.android.gms.ads.internal.util.client.zzl.zzk()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeQ
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1b
            return r1
        L1b:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeS
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r0.isEmpty()
            java.lang.String r3 = ";"
            if (r2 != 0) goto L43
            java.lang.String[] r0 = r0.split(r3)
            int r2 = r0.length
            r4 = 0
        L35:
            if (r4 >= r2) goto L43
            r5 = r0[r4]
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L40
            return r1
        L40:
            int r4 = r4 + 1
            goto L35
        L43:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeR
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r0.isEmpty()
            r4 = 1
            if (r2 == 0) goto L57
            return r4
        L57:
            java.lang.String[] r0 = r0.split(r3)
            int r2 = r0.length
            r3 = 0
        L5d:
            if (r3 >= r2) goto L6b
            r5 = r0[r3]
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L68
            return r4
        L68:
            int r3 = r3 + 1
            goto L5d
        L6b:
            return r1
    }

    public static final boolean zzD(android.content.Context r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            android.app.KeyguardManager r1 = zzX(r1)
            if (r1 == 0) goto L12
            boolean r1 = r1.isKeyguardLocked()
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            return r0
    }

    public static final boolean zzE(android.content.Context r3) {
            r0 = 0
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> Lb java.lang.ClassNotFoundException -> L1b
            java.lang.String r1 = "com.google.android.gms.ads.internal.ClientApi"
            r3.loadClass(r1)     // Catch: java.lang.Throwable -> Lb java.lang.ClassNotFoundException -> L1b
            return r0
        Lb:
            r3 = move-exception
            java.lang.String r1 = "Error loading class."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r3)
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "AdUtil.isLiteSdk"
            r1.zzw(r3, r2)
            return r0
        L1b:
            r3 = 1
            return r3
    }

    public static final boolean zzF() {
            int r0 = android.os.Process.myUid()
            if (r0 == 0) goto Ld
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 != r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public static final boolean zzG(android.content.Context r6) {
            r0 = 0
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r6.getSystemService(r1)     // Catch: java.lang.Throwable -> L55
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r6.getSystemService(r2)     // Catch: java.lang.Throwable -> L55
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L55
            if (r2 != 0) goto L16
            goto L55
        L16:
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L1d
            return r0
        L1d:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L55
        L21:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L53
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L55
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Throwable -> L55
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L55
            int r5 = r3.pid     // Catch: java.lang.Throwable -> L55
            if (r4 != r5) goto L21
            int r1 = r3.importance     // Catch: java.lang.Throwable -> L55
            r3 = 100
            if (r1 != r3) goto L53
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L53
            java.lang.String r1 = "power"
            java.lang.Object r6 = r6.getSystemService(r1)     // Catch: java.lang.Throwable -> L55
            android.os.PowerManager r6 = (android.os.PowerManager) r6     // Catch: java.lang.Throwable -> L55
            if (r6 != 0) goto L4c
            goto L53
        L4c:
            boolean r6 = r6.isScreenOn()     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L53
            return r0
        L53:
            r6 = 1
            return r6
        L55:
            return r0
    }

    public static final boolean zzH(android.content.Context r2) {
            r0 = 0
            android.os.Bundle r2 = zzY(r2)     // Catch: android.os.RemoteException -> L1d
            java.lang.String r1 = "com.google.android.gms.ads.INTEGRATION_MANAGER"
            java.lang.String r1 = r2.getString(r1)     // Catch: android.os.RemoteException -> L1d
            java.lang.String r2 = zzZ(r2)     // Catch: android.os.RemoteException -> L1d
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: android.os.RemoteException -> L1d
            if (r2 == 0) goto L1d
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: android.os.RemoteException -> L1d
            if (r2 != 0) goto L1d
            r2 = 1
            return r2
        L1d:
            return r0
    }

    public static final boolean zzI(android.content.Context r5) {
            boolean r0 = r5 instanceof android.app.Activity
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.app.Activity r5 = (android.app.Activity) r5
            android.view.Window r5 = r5.getWindow()
            if (r5 == 0) goto L3e
            android.view.View r0 = r5.getDecorView()
            if (r0 != 0) goto L15
            goto L3e
        L15:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.view.View r3 = r5.getDecorView()
            r4 = 0
            r3.getGlobalVisibleRect(r0, r4)
            android.view.View r5 = r5.getDecorView()
            r5.getWindowVisibleDisplayFrame(r2)
            int r5 = r0.bottom
            if (r5 == 0) goto L3e
            int r5 = r2.bottom
            if (r5 == 0) goto L3e
            int r5 = r0.top
            int r0 = r2.top
            if (r5 != r0) goto L3e
            r5 = 1
            return r5
        L3e:
            return r1
    }

    public static final void zzJ(android.view.View r17, int r18, android.view.MotionEvent r19) {
            r0 = r17
            r1 = 2
            int[] r2 = new int[r1]
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.content.Context r4 = r17.getContext()     // Catch: java.lang.Exception -> L114
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L114
            boolean r5 = r0 instanceof com.google.android.gms.internal.ads.zzdrh     // Catch: java.lang.Exception -> L114
            r6 = 0
            if (r5 == 0) goto L1d
            com.google.android.gms.internal.ads.zzdrh r0 = (com.google.android.gms.internal.ads.zzdrh) r0     // Catch: java.lang.Exception -> L114
            android.view.View r0 = r0.getChildAt(r6)     // Catch: java.lang.Exception -> L114
        L1d:
            boolean r5 = r0 instanceof com.google.android.gms.ads.formats.zzj     // Catch: java.lang.Exception -> L114
            r7 = 1
            if (r5 != 0) goto L2b
            boolean r5 = r0 instanceof com.google.android.gms.ads.nativead.NativeAdView     // Catch: java.lang.Exception -> L114
            if (r5 == 0) goto L27
            goto L2b
        L27:
            java.lang.String r5 = "UNKNOWN"
            r8 = 0
            goto L2e
        L2b:
            java.lang.String r5 = "NATIVE"
            r8 = 1
        L2e:
            boolean r9 = r0.getLocalVisibleRect(r3)     // Catch: java.lang.Exception -> L114
            if (r9 == 0) goto L3d
            int r9 = r3.width()     // Catch: java.lang.Exception -> L114
            int r3 = r3.height()     // Catch: java.lang.Exception -> L114
            goto L3f
        L3d:
            r3 = 0
            r9 = 0
        L3f:
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Exception -> L114
            long r10 = zzw(r0)     // Catch: java.lang.Exception -> L114
            r0.getLocationOnScreen(r2)     // Catch: java.lang.Exception -> L114
            r12 = r2[r6]     // Catch: java.lang.Exception -> L114
            r2 = r2[r7]     // Catch: java.lang.Exception -> L114
            boolean r13 = r0 instanceof com.google.android.gms.internal.ads.zzcgr     // Catch: java.lang.Exception -> L114
            java.lang.String r14 = "none"
            if (r13 == 0) goto L7a
            r13 = r0
            com.google.android.gms.internal.ads.zzcgr r13 = (com.google.android.gms.internal.ads.zzcgr) r13     // Catch: java.lang.Exception -> L114
            com.google.android.gms.internal.ads.zzfgk r13 = r13.zzR()     // Catch: java.lang.Exception -> L114
            if (r13 == 0) goto L7a
            java.lang.String r13 = r13.zzb     // Catch: java.lang.Exception -> L114
            int r15 = r0.hashCode()     // Catch: java.lang.Exception -> L114
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L114
            r1.<init>()     // Catch: java.lang.Exception -> L114
            r1.append(r13)     // Catch: java.lang.Exception -> L114
            java.lang.String r7 = ":"
            r1.append(r7)     // Catch: java.lang.Exception -> L114
            r1.append(r15)     // Catch: java.lang.Exception -> L114
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L114
            r0.setContentDescription(r1)     // Catch: java.lang.Exception -> L114
            goto L7b
        L7a:
            r13 = r14
        L7b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzcff     // Catch: java.lang.Exception -> L114
            if (r1 == 0) goto L92
            r1 = r0
            com.google.android.gms.internal.ads.zzcff r1 = (com.google.android.gms.internal.ads.zzcff) r1     // Catch: java.lang.Exception -> L114
            com.google.android.gms.internal.ads.zzfgh r1 = r1.zzD()     // Catch: java.lang.Exception -> L114
            if (r1 == 0) goto L92
            int r5 = r1.zzb     // Catch: java.lang.Exception -> L114
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfgh.zza(r5)     // Catch: java.lang.Exception -> L114
            int r8 = r1.zze     // Catch: java.lang.Exception -> L114
            java.lang.String r14 = r1.zzE     // Catch: java.lang.Exception -> L114
        L92:
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.Exception -> L114
            java.lang.String r7 = "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>"
            r15 = 15
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch: java.lang.Exception -> L114
            int r16 = r0.hashCode()     // Catch: java.lang.Exception -> L114
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch: java.lang.Exception -> L114
            r15[r6] = r16     // Catch: java.lang.Exception -> L114
            r6 = 1
            r15[r6] = r4     // Catch: java.lang.Exception -> L114
            r4 = 2
            r15[r4] = r14     // Catch: java.lang.Exception -> L114
            r4 = 3
            r15[r4] = r13     // Catch: java.lang.Exception -> L114
            r4 = 4
            r15[r4] = r5     // Catch: java.lang.Exception -> L114
            r4 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L114
            r15[r4] = r5     // Catch: java.lang.Exception -> L114
            r4 = 6
            java.lang.Class r5 = r0.getClass()     // Catch: java.lang.Exception -> L114
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Exception -> L114
            r15[r4] = r5     // Catch: java.lang.Exception -> L114
            r4 = 7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Exception -> L114
            r15[r4] = r5     // Catch: java.lang.Exception -> L114
            r4 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L114
            r15[r4] = r2     // Catch: java.lang.Exception -> L114
            r2 = 9
            int r4 = r0.getWidth()     // Catch: java.lang.Exception -> L114
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L114
            r15[r2] = r4     // Catch: java.lang.Exception -> L114
            r2 = 10
            int r0 = r0.getHeight()     // Catch: java.lang.Exception -> L114
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L114
            r15[r2] = r0     // Catch: java.lang.Exception -> L114
            r0 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L114
            r15[r0] = r2     // Catch: java.lang.Exception -> L114
            r0 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L114
            r15[r0] = r2     // Catch: java.lang.Exception -> L114
            r0 = 13
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Exception -> L114
            r15[r0] = r2     // Catch: java.lang.Exception -> L114
            r0 = 14
            r2 = r18
            r3 = 2
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)     // Catch: java.lang.Exception -> L114
            r15[r0] = r2     // Catch: java.lang.Exception -> L114
            java.lang.String r0 = java.lang.String.format(r1, r7, r15)     // Catch: java.lang.Exception -> L114
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r0)     // Catch: java.lang.Exception -> L114
            return
        L114:
            r0 = move-exception
            java.lang.String r1 = "Failure getting view location."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            return
    }

    public static final android.app.AlertDialog.Builder zzK(android.content.Context r2) {
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            com.google.android.gms.ads.internal.zzu.zzq()
            r1 = 16974374(0x1030226, float:2.4062441E-38)
            r0.<init>(r2, r1)
            return r0
    }

    public static final void zzL(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r4)
            java.util.Iterator r4 = r0.iterator()
        Lc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.ads.internal.util.zzbw r1 = new com.google.android.gms.ads.internal.util.zzbw
            r1.<init>(r2, r3, r0)
            r1.zzb()
            goto Lc
        L21:
            return
    }

    public static final void zzM(android.content.Context r1, java.lang.Throwable r2) {
            if (r1 != 0) goto L3
            goto L14
        L3:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbfa.zzb     // Catch: java.lang.IllegalStateException -> L14
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.IllegalStateException -> L14
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.IllegalStateException -> L14
            boolean r0 = r0.booleanValue()     // Catch: java.lang.IllegalStateException -> L14
            if (r0 == 0) goto L14
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r1, r2)
        L14:
            return
    }

    public static final java.lang.String zzN(java.io.InputStreamReader r4) throws java.io.IOException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r1)
            r1 = 2048(0x800, float:2.87E-42)
            char[] r1 = new char[r1]
        Lb:
            int r2 = r4.read(r1)
            r3 = -1
            if (r2 == r3) goto L17
            r3 = 0
            r0.append(r1, r3, r2)
            goto Lb
        L17:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static final int zzO(java.lang.String r1) {
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L5
            return r1
        L5:
            r1 = move-exception
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "Could not parse value:"
            java.lang.String r1 = r0.concat(r1)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            r1 = 0
            return r1
    }

    public static final java.util.Map zzP(android.net.Uri r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r4.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L11
            java.lang.String r3 = r4.getQueryParameter(r2)
            r0.put(r2, r3)
            goto L11
        L2b:
            return r0
    }

    public static final int[] zzQ(android.app.Activity r3) {
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L21
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r3.findViewById(r0)
            if (r3 == 0) goto L21
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 0
            int r2 = r3.getWidth()
            r0[r1] = r2
            r1 = 1
            int r3 = r3.getHeight()
            r0[r1] = r3
            return r0
        L21:
            int[] r3 = zzu()
            return r3
    }

    public static final int[] zzR(android.app.Activity r6) {
            android.view.Window r0 = r6.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L21
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L21
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L25
        L21:
            int[] r4 = zzu()
        L25:
            int[] r0 = new int[r1]
            com.google.android.gms.ads.internal.util.client.zzf r1 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            r5 = r4[r3]
            int r1 = r1.zzb(r6, r5)
            r0[r3] = r1
            com.google.android.gms.ads.internal.util.client.zzf r1 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            r3 = r4[r2]
            int r6 = r1.zzb(r6, r3)
            r0[r2] = r6
            return r0
    }

    public static final boolean zzS(android.view.View r5, android.os.PowerManager r6, android.app.KeyguardManager r7) {
            com.google.android.gms.ads.internal.util.zzt r0 = com.google.android.gms.ads.internal.zzu.zzp()
            boolean r0 = r0.zzf
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1c
            if (r7 != 0) goto Ld
            goto L1c
        Ld:
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L1c
            boolean r7 = zzn(r5)
            if (r7 == 0) goto L1a
            goto L1c
        L1a:
            r7 = 0
            goto L1d
        L1c:
            r7 = 1
        L1d:
            long r3 = zzw(r5)
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L88
            boolean r0 = r5.isShown()
            if (r0 == 0) goto L88
            if (r6 == 0) goto L35
            boolean r6 = r6.isScreenOn()
            if (r6 == 0) goto L88
        L35:
            if (r7 == 0) goto L88
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzbp
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r7.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5f
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            boolean r6 = r5.getLocalVisibleRect(r6)
            if (r6 != 0) goto L5f
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            boolean r5 = r5.getGlobalVisibleRect(r6)
            if (r5 == 0) goto L88
        L5f:
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzki
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L89
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzkk
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            long r5 = (long) r5
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L87
            goto L88
        L87:
            return r1
        L88:
            r1 = 0
        L89:
            return r1
    }

    public static final void zzT(android.content.Context r2, android.content.Intent r3) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkF
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L26
            zzab(r2, r3)     // Catch: java.lang.SecurityException -> L16
            return
        L16:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r3, r2)
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "AdUtil.startActivityWithUnknownContext"
            r3.zzw(r2, r0)
            return
        L26:
            zzab(r2, r3)
            return
    }

    public static final void zzU(android.content.Context r4, android.net.Uri r5) {
            android.content.Intent r0 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L3c
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1, r5)     // Catch: android.content.ActivityNotFoundException -> L3c
            android.os.Bundle r1 = new android.os.Bundle     // Catch: android.content.ActivityNotFoundException -> L3c
            r1.<init>()     // Catch: android.content.ActivityNotFoundException -> L3c
            r0.putExtras(r1)     // Catch: android.content.ActivityNotFoundException -> L3c
            zzo(r4, r0)     // Catch: android.content.ActivityNotFoundException -> L3c
            java.lang.String r2 = "com.android.browser.application_id"
            java.lang.String r3 = r4.getPackageName()     // Catch: android.content.ActivityNotFoundException -> L3c
            r1.putString(r2, r3)     // Catch: android.content.ActivityNotFoundException -> L3c
            r4.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L3c
            java.lang.String r4 = r5.toString()     // Catch: android.content.ActivityNotFoundException -> L3c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.ActivityNotFoundException -> L3c
            r5.<init>()     // Catch: android.content.ActivityNotFoundException -> L3c
            java.lang.String r0 = "Opening "
            r5.append(r0)     // Catch: android.content.ActivityNotFoundException -> L3c
            r5.append(r4)     // Catch: android.content.ActivityNotFoundException -> L3c
            java.lang.String r4 = " in a new browser."
            r5.append(r4)     // Catch: android.content.ActivityNotFoundException -> L3c
            java.lang.String r4 = r5.toString()     // Catch: android.content.ActivityNotFoundException -> L3c
            com.google.android.gms.ads.internal.util.client.zzm.zze(r4)     // Catch: android.content.ActivityNotFoundException -> L3c
            return
        L3c:
            r4 = move-exception
            java.lang.String r5 = "No browser is found."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r5, r4)
            return
    }

    public static final int[] zzV(android.app.Activity r5) {
            int[] r0 = zzQ(r5)
            r1 = 2
            int[] r1 = new int[r1]
            com.google.android.gms.ads.internal.util.client.zzf r2 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            r3 = 0
            r4 = r0[r3]
            int r2 = r2.zzb(r5, r4)
            r1[r3] = r2
            com.google.android.gms.ads.internal.util.client.zzf r2 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            r3 = 1
            r0 = r0[r3]
            int r5 = r2.zzb(r5, r0)
            r1[r3] = r5
            return r1
    }

    public static final boolean zzW(android.view.View r2, android.content.Context r3) {
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto Lf
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            android.app.KeyguardManager r3 = zzX(r3)
            boolean r2 = zzS(r2, r0, r3)
            return r2
    }

    private static android.app.KeyguardManager zzX(android.content.Context r1) {
            java.lang.String r0 = "keyguard"
            java.lang.Object r1 = r1.getSystemService(r0)
            if (r1 == 0) goto Lf
            boolean r0 = r1 instanceof android.app.KeyguardManager
            if (r0 == 0) goto Lf
            android.app.KeyguardManager r1 = (android.app.KeyguardManager) r1
            return r1
        Lf:
            r1 = 0
            return r1
    }

    private static android.os.Bundle zzY(android.content.Context r2) throws android.os.RemoteException {
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2)     // Catch: java.lang.NullPointerException -> L11 android.content.pm.PackageManager.NameNotFoundException -> L13
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.NullPointerException -> L11 android.content.pm.PackageManager.NameNotFoundException -> L13
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r2, r1)     // Catch: java.lang.NullPointerException -> L11 android.content.pm.PackageManager.NameNotFoundException -> L13
            android.os.Bundle r2 = r2.metaData     // Catch: java.lang.NullPointerException -> L11 android.content.pm.PackageManager.NameNotFoundException -> L13
            return r2
        L11:
            r2 = move-exception
            goto L14
        L13:
            r2 = move-exception
        L14:
            java.lang.String r0 = "Error getting metadata"
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r2)
            r2 = 0
            return r2
    }

    private static java.lang.String zzZ(android.os.Bundle r1) {
            if (r1 != 0) goto L3
            goto L20
        L3:
            java.lang.String r0 = "com.google.android.gms.ads.APPLICATION_ID"
            java.lang.String r1 = r1.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L20
            java.lang.String r0 = "xGN4Vue"
            boolean r0 = r1.matches(r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "^/\\d+~.+$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L20
        L1f:
            return r1
        L20:
            java.lang.String r1 = ""
            return r1
    }

    public static int zza(int r2) {
            r0 = 5000(0x1388, float:7.006E-42)
            if (r2 < r0) goto L5
            return r2
        L5:
            if (r2 <= 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HTTP timeout too low: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " milliseconds. Reverting to default timeout: 60000 milliseconds."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
        L20:
            r2 = 60000(0xea60, float:8.4078E-41)
            return r2
    }

    private static boolean zzaa(java.lang.String r3, java.util.concurrent.atomic.AtomicReference r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r4.get()     // Catch: java.util.regex.PatternSyntaxException -> L2a
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0     // Catch: java.util.regex.PatternSyntaxException -> L2a
            if (r0 == 0) goto L1a
            java.lang.String r2 = r0.pattern()     // Catch: java.util.regex.PatternSyntaxException -> L2a
            boolean r2 = r5.equals(r2)     // Catch: java.util.regex.PatternSyntaxException -> L2a
            if (r2 != 0) goto L21
        L1a:
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r5)     // Catch: java.util.regex.PatternSyntaxException -> L2a
            r4.set(r0)     // Catch: java.util.regex.PatternSyntaxException -> L2a
        L21:
            java.util.regex.Matcher r3 = r0.matcher(r3)     // Catch: java.util.regex.PatternSyntaxException -> L2a
            boolean r3 = r3.matches()     // Catch: java.util.regex.PatternSyntaxException -> L2a
            return r3
        L2a:
            return r1
    }

    private static final void zzab(android.content.Context r1, android.content.Intent r2) {
            r1.startActivity(r2)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            r1.startActivity(r2)
            return
    }

    private static final java.lang.String zzac(android.content.Context r3, java.lang.String r4) {
            if (r4 == 0) goto L8b
            com.google.android.gms.ads.internal.util.zzcg r0 = com.google.android.gms.ads.internal.util.zzcg.zza()     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = r0.zza     // Catch: java.lang.Exception -> L35
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L35
            if (r1 != 0) goto Lf
            goto L32
        Lf:
            boolean r1 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch: java.lang.Exception -> L35
            if (r1 == 0) goto L21
            com.google.android.gms.ads.internal.util.zzce r1 = new com.google.android.gms.ads.internal.util.zzce     // Catch: java.lang.Exception -> L35
            r1.<init>(r3)     // Catch: java.lang.Exception -> L35
            java.lang.Object r1 = com.google.android.gms.ads.internal.util.zzcd.zza(r3, r1)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L35
            goto L30
        L21:
            android.content.Context r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r3)     // Catch: java.lang.Exception -> L35
            com.google.android.gms.ads.internal.util.zzcf r2 = new com.google.android.gms.ads.internal.util.zzcf     // Catch: java.lang.Exception -> L35
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L35
            java.lang.Object r1 = com.google.android.gms.ads.internal.util.zzcd.zza(r3, r2)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L35
        L30:
            r0.zza = r1     // Catch: java.lang.Exception -> L35
        L32:
            java.lang.String r0 = r0.zza     // Catch: java.lang.Exception -> L35
            goto L36
        L35:
            r0 = 0
        L36:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L40
            java.lang.String r0 = android.webkit.WebSettings.getDefaultUserAgent(r3)
        L40:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L4a
            java.lang.String r0 = zzq()
        L4a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " (Mobile; "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: java.lang.Exception -> L7a
            boolean r3 = r3.isCallerInstantApp()     // Catch: java.lang.Exception -> L7a
            if (r3 == 0) goto L84
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7a
            r3.<init>()     // Catch: java.lang.Exception -> L7a
            r3.append(r4)     // Catch: java.lang.Exception -> L7a
            java.lang.String r0 = ";aia"
            r3.append(r0)     // Catch: java.lang.Exception -> L7a
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Exception -> L7a
            goto L84
        L7a:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "AdUtil.getUserAgent"
            r0.zzw(r3, r1)
        L84:
            java.lang.String r3 = ")"
            java.lang.String r3 = r4.concat(r3)
            return r3
        L8b:
            java.lang.String r3 = zzq()
            return r3
    }

    public static java.util.List zzd() {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zza
            com.google.android.gms.internal.ads.zzbcn r0 = com.google.android.gms.ads.internal.client.zzbe.zza()
            java.util.List r0 = r0.zzb()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 44
            com.google.android.gms.internal.ads.zzfxn r3 = com.google.android.gms.internal.ads.zzfxn.zzc(r3)
            com.google.android.gms.internal.ads.zzfym r3 = com.google.android.gms.internal.ads.zzfym.zzb(r3)
            java.lang.Iterable r2 = r3.zzc(r2)
            java.util.Iterator r2 = r2.iterator()
        L31:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L13
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L45
            r1.add(r3)     // Catch: java.lang.NumberFormatException -> L45
            goto L31
        L45:
            java.lang.String r3 = "Experiment ID is not a number"
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            goto L31
        L4b:
            return r1
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.ads.internal.util.zzt r0, boolean r1) {
            r0.zzf = r1
            return
    }

    public static final boolean zzn(android.view.View r2) {
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
    }

    public static final void zzo(android.content.Context r3, android.content.Intent r4) {
            if (r4 != 0) goto L3
            return
        L3:
            android.os.Bundle r0 = r4.getExtras()
            if (r0 == 0) goto Le
            android.os.Bundle r0 = r4.getExtras()
            goto L13
        Le:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L13:
            r1 = 0
            java.lang.String r2 = "android.support.customtabs.extra.SESSION"
            r0.putBinder(r2, r1)
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r1 = "com.android.browser.application_id"
            r0.putString(r1, r3)
            r4.putExtras(r0)
            return
    }

    public static final java.lang.String zzp(android.content.Context r1) throws android.os.RemoteException {
            android.content.Context r0 = r1.getApplicationContext()
            if (r0 == 0) goto La
            android.content.Context r1 = r1.getApplicationContext()
        La:
            android.os.Bundle r1 = zzY(r1)
            java.lang.String r1 = zzZ(r1)
            return r1
    }

    static final java.lang.String zzq() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            java.lang.String r1 = "Mozilla/5.0 (Linux; U; Android"
            r0.append(r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            if (r1 == 0) goto L18
            java.lang.String r2 = " "
            r0.append(r2)
            r0.append(r1)
        L18:
            java.lang.String r1 = "; "
            r0.append(r1)
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0.append(r2)
            java.lang.String r2 = android.os.Build.DEVICE
            if (r2 == 0) goto L3a
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = android.os.Build.DISPLAY
            if (r1 == 0) goto L3a
            java.lang.String r2 = " Build/"
            r0.append(r2)
            r0.append(r1)
        L3a:
            java.lang.String r1 = ") AppleWebKit/533 Version/4.0 Safari/533"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static final java.lang.String zzr() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = android.os.Build.MODEL
            boolean r2 = r1.startsWith(r0)
            if (r2 == 0) goto Lb
            return r1
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }

    public static final java.lang.Integer zzs(android.content.Context r1) {
            java.lang.String r0 = "display"
            java.lang.Object r1 = r1.getSystemService(r0)
            boolean r0 = r1 instanceof android.hardware.display.DisplayManager
            if (r0 == 0) goto L16
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            android.view.Display[] r1 = r1.getDisplays()
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static final android.util.DisplayMetrics zzt(android.view.WindowManager r1) {
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r0)
            return r0
    }

    protected static final int[] zzu() {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            return r0
    }

    public static final java.util.Map zzv(java.lang.String r7) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3d
            r1.<init>(r7)     // Catch: org.json.JSONException -> L3d
            java.util.Iterator r7 = r1.keys()
        Le:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r7.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            org.json.JSONArray r4 = r1.optJSONArray(r2)
            if (r4 == 0) goto Le
            r5 = 0
        L26:
            int r6 = r4.length()
            if (r5 >= r6) goto L38
            java.lang.String r6 = r4.optString(r5)
            if (r6 == 0) goto L35
            r3.add(r6)
        L35:
            int r5 = r5 + 1
            goto L26
        L38:
            r0.put(r2, r3)
            goto Le
        L3c:
            return r0
        L3d:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "AdUtil.getMapOfFileNamesToKeysFromJsonString"
            r1.zzw(r7, r2)
            return r0
    }

    public static final long zzw(android.view.View r3) {
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L3:
            boolean r1 = r3 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L1a
            android.view.View r3 = (android.view.View) r3
            float r1 = r3.getAlpha()
            float r0 = java.lang.Math.min(r0, r1)
            android.view.ViewParent r3 = r3.getParent()
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 > 0) goto L3
        L1a:
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L1f
            goto L20
        L1f:
            r2 = r0
        L20:
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r3
            int r3 = java.lang.Math.round(r2)
            long r0 = (long) r3
            return r0
    }

    public static final android.webkit.WebResourceResponse zzx(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
            java.lang.String r0 = "UTF-8"
            r1 = 0
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            r2.<init>()     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            java.lang.String r3 = "User-Agent"
            com.google.android.gms.ads.internal.util.zzt r4 = com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            java.lang.String r6 = r4.zzc(r5, r6)     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            r2.put(r3, r6)     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            java.lang.String r6 = "Cache-Control"
            java.lang.String r3 = "max-stale=3600"
            r2.put(r6, r3)     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            com.google.android.gms.ads.internal.util.zzbo r6 = new com.google.android.gms.ads.internal.util.zzbo     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            r6.<init>(r5)     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            r5 = 0
            com.google.common.util.concurrent.ListenableFuture r5 = r6.zzb(r5, r7, r2, r1)     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            r6 = 60
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            java.lang.Object r5 = r5.get(r6, r2)     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            if (r5 == 0) goto L4f
            android.webkit.WebResourceResponse r6 = new android.webkit.WebResourceResponse     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            java.lang.String r7 = "application/javascript"
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            byte[] r5 = r5.getBytes(r0)     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            r2.<init>(r5)     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            r6.<init>(r7, r0, r2)     // Catch: java.util.concurrent.TimeoutException -> L43 java.lang.InterruptedException -> L45 java.util.concurrent.ExecutionException -> L47 java.io.IOException -> L49
            return r6
        L43:
            r5 = move-exception
            goto L4a
        L45:
            r5 = move-exception
            goto L4a
        L47:
            r5 = move-exception
            goto L4a
        L49:
            r5 = move-exception
        L4a:
            java.lang.String r6 = "Could not fetch MRAID JS."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r6, r5)
        L4f:
            return r1
    }

    public static final java.lang.String zzy() {
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            android.content.res.Resources r0 = r0.zze()
            if (r0 == 0) goto L11
            int r1 = com.google.android.gms.ads.impl.R.string.s7
            java.lang.String r0 = r0.getString(r1)
            goto L13
        L11:
            java.lang.String r0 = "Test Ad"
        L13:
            return r0
    }

    public static final com.google.android.gms.ads.internal.util.zzbr zzz(android.content.Context r3) {
            r0 = 0
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L3a
            java.lang.String r1 = "com.google.android.gms.ads.internal.util.WorkManagerUtil"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch: java.lang.Exception -> L3a
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L3a
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L3a
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L3a
            java.lang.Object r3 = r3.newInstance(r1)     // Catch: java.lang.Exception -> L3a
            boolean r1 = r3 instanceof android.os.IBinder
            if (r1 != 0) goto L22
            java.lang.String r3 = "Instantiated WorkManagerUtil not instance of IBinder."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r3)
            return r0
        L22:
            android.os.IBinder r3 = (android.os.IBinder) r3
            if (r3 != 0) goto L27
            goto L39
        L27:
            java.lang.String r0 = "com.google.android.gms.ads.internal.util.IWorkManagerUtil"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.internal.util.zzbr
            if (r1 == 0) goto L34
            com.google.android.gms.ads.internal.util.zzbr r0 = (com.google.android.gms.ads.internal.util.zzbr) r0
            goto L39
        L34:
            com.google.android.gms.ads.internal.util.zzbp r0 = new com.google.android.gms.ads.internal.util.zzbp
            r0.<init>(r3)
        L39:
            return r0
        L3a:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "Failed to instantiate WorkManagerUtil"
            r1.zzw(r3, r2)
            return r0
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(android.net.Uri r2) {
            r1 = this;
            com.google.android.gms.ads.internal.util.zzn r0 = new com.google.android.gms.ads.internal.util.zzn
            r0.<init>(r2)
            java.util.concurrent.Executor r2 = r1.zzl
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzj(r0, r2)
            return r2
    }

    public final java.lang.String zzc(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkS
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L22
            java.lang.String r0 = r2.zzi
            if (r0 == 0) goto L19
            java.lang.String r3 = r2.zzi
            return r3
        L19:
            java.lang.String r3 = zzac(r3, r4)
            r2.zzi = r3
            java.lang.String r3 = r2.zzi
            return r3
        L22:
            java.lang.Object r0 = r2.zzg
            monitor-enter(r0)
            java.lang.String r1 = r2.zzh     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r1
        L2b:
            java.lang.String r3 = zzac(r3, r4)     // Catch: java.lang.Throwable -> L33
            r2.zzh = r3     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r3
        L33:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r3
    }

    public final void zzf(android.content.Context r1, java.lang.String r2, boolean r3, java.net.HttpURLConnection r4, boolean r5, int r6) {
            r0 = this;
            int r3 = zza(r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "HTTP timeout: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = " milliseconds."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r5)
            r4.setConnectTimeout(r3)
            r5 = 0
            r4.setInstanceFollowRedirects(r5)
            r4.setReadTimeout(r3)
            java.lang.String r3 = "User-Agent"
            java.lang.String r6 = r4.getRequestProperty(r3)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L3a
            java.lang.String r1 = r0.zzc(r1, r2)
            r4.setRequestProperty(r3, r1)
        L3a:
            r4.setUseCaches(r5)
            return
    }

    final /* synthetic */ void zzg(android.content.Context r1, java.lang.String r2, android.content.SharedPreferences r3, java.lang.String r4) {
            r0 = this;
            java.util.concurrent.atomic.AtomicReference r3 = r0.zzd
            android.os.Bundle r1 = com.google.android.gms.ads.internal.util.zzad.zzb(r1, r2)
            r3.set(r1)
            return
    }

    public final void zzh(android.content.Context r7, java.lang.String r8, java.lang.String r9, android.os.Bundle r10, boolean r11) {
            r6 = this;
            com.google.android.gms.ads.internal.zzu.zzp()
            java.lang.String r9 = zzr()
            java.lang.String r11 = "device"
            r10.putString(r11, r9)
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zza
            com.google.android.gms.internal.ads.zzbcn r9 = com.google.android.gms.ads.internal.client.zzbe.zza()
            java.util.List r9 = r9.zza()
            java.lang.String r11 = ","
            java.lang.String r9 = android.text.TextUtils.join(r11, r9)
            java.lang.String r11 = "eids"
            r10.putString(r11, r9)
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L2d
            java.lang.String r9 = "Empty or null bundle."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r9)
            goto L5b
        L2d:
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzkg
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r11.zza(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.util.concurrent.atomic.AtomicBoolean r11 = r6.zze
            r0 = 1
            boolean r11 = r11.getAndSet(r0)
            if (r11 != 0) goto L50
            java.util.concurrent.atomic.AtomicReference r11 = r6.zzd
            com.google.android.gms.ads.internal.util.zzm r0 = new com.google.android.gms.ads.internal.util.zzm
            r0.<init>(r6, r7, r9)
            android.os.Bundle r9 = com.google.android.gms.ads.internal.util.zzad.zza(r7, r9, r0)
            r11.set(r9)
        L50:
            java.util.concurrent.atomic.AtomicReference r9 = r6.zzd
            java.lang.Object r9 = r9.get()
            android.os.Bundle r9 = (android.os.Bundle) r9
            r10.putAll(r9)
        L5b:
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            com.google.android.gms.ads.internal.util.zzl r5 = new com.google.android.gms.ads.internal.util.zzl
            r5.<init>(r7, r8)
            r4 = 1
            java.lang.String r2 = "gmob-apps"
            r0 = r7
            r1 = r8
            r3 = r10
            com.google.android.gms.ads.internal.util.client.zzf.zzx(r0, r1, r2, r3, r4, r5)
            return
    }

    public final boolean zzi(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzai
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzb
            boolean r3 = zzaa(r3, r1, r0)
            return r3
    }

    public final boolean zzj(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzaj
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzc
            boolean r3 = zzaa(r3, r1, r0)
            return r3
    }

    @android.annotation.SuppressLint({"UnprotectedReceiver"})
    public final boolean zzk(android.content.Context r5) {
            r4 = this;
            boolean r0 = r4.zzk
            if (r0 == 0) goto L6
            r5 = 0
            return r5
        L6:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED"
            r0.addAction(r1)
            com.google.android.gms.internal.ads.zzbcv.zza(r5)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzkE
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L3a
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r1 < r3) goto L3a
            android.content.Context r5 = r5.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzq r1 = new com.google.android.gms.ads.internal.util.zzq
            r1.<init>(r4, r2)
            r2 = 4
            r5.registerReceiver(r1, r0, r2)
            goto L46
        L3a:
            android.content.Context r5 = r5.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzq r1 = new com.google.android.gms.ads.internal.util.zzq
            r1.<init>(r4, r2)
            r5.registerReceiver(r1, r0)
        L46:
            r5 = 1
            r4.zzk = r5
            return r5
    }

    @android.annotation.SuppressLint({"UnprotectedReceiver"})
    public final boolean zzl(android.content.Context r5) {
            r4 = this;
            boolean r0 = r4.zzj
            if (r0 == 0) goto L6
            r5 = 0
            return r5
        L6:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.intent.action.USER_PRESENT"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            r0.addAction(r1)
            com.google.android.gms.internal.ads.zzbcv.zza(r5)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzkE
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L3f
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r1 < r3) goto L3f
            android.content.Context r5 = r5.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzs r1 = new com.google.android.gms.ads.internal.util.zzs
            r1.<init>(r4, r2)
            r2 = 4
            r5.registerReceiver(r1, r0, r2)
            goto L4b
        L3f:
            android.content.Context r5 = r5.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzs r1 = new com.google.android.gms.ads.internal.util.zzs
            r1.<init>(r4, r2)
            r5.registerReceiver(r1, r0)
        L4b:
            r5 = 1
            r4.zzj = r5
            return r5
    }

    public final int zzm(android.content.Context r7, android.net.Uri r8) {
            r6 = this;
            if (r7 != 0) goto L9
            java.lang.String r7 = "Trying to open chrome custom tab on a null context"
            com.google.android.gms.ads.internal.util.zze.zza(r7)
            r7 = 3
            return r7
        L9:
            boolean r0 = r7 instanceof android.app.Activity
            if (r0 != 0) goto L14
            java.lang.String r0 = "Chrome Custom Tabs can only work with Activity context."
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            r0 = 2
            goto L15
        L14:
            r0 = 0
        L15:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzex
            r2 = 1
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r3.zza(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzey
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r5.zza(r4)
            boolean r3 = r3.equals(r5)
            if (r2 != r3) goto L34
            r0 = 9
        L34:
            if (r0 == 0) goto L49
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2)
            r1.setData(r8)
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r8)
            r7.startActivity(r1)
            return r0
        L49:
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r0.zza(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6c
            com.google.android.gms.internal.ads.zzbds r0 = new com.google.android.gms.internal.ads.zzbds
            r0.<init>()
            com.google.android.gms.ads.internal.util.zzo r1 = new com.google.android.gms.ads.internal.util.zzo
            r1.<init>(r6, r0, r7, r8)
            r0.zze(r1)
            r1 = r7
            android.app.Activity r1 = (android.app.Activity) r1
            r0.zzb(r1)
        L6c:
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r0.zza(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L91
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = new androidx.browser.customtabs.CustomTabsIntent$Builder
            r0.<init>()
            androidx.browser.customtabs.CustomTabsIntent r0 = r0.build()
            android.content.Intent r1 = r0.intent
            java.lang.String r2 = com.google.android.gms.internal.ads.zzhjb.zza(r7)
            r1.setPackage(r2)
            r0.launchUrl(r7, r8)
        L91:
            r7 = 5
            return r7
    }
}
