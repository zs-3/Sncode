package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfhy {
    private static com.google.android.gms.internal.ads.zzfhy zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcw zzc;
    private final java.util.concurrent.atomic.AtomicReference zzd;

    zzfhy(android.content.Context r2, com.google.android.gms.ads.internal.client.zzcw r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.zzd = r0
            r1.zzb = r2
            r1.zzc = r3
            return
    }

    static com.google.android.gms.ads.internal.client.zzcw zza(android.content.Context r5) {
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.InstantiationException -> L27 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.ClassNotFoundException -> L2d java.lang.ClassCastException -> L2f
            java.lang.String r1 = "com.google.android.gms.ads.internal.client.LiteSdkInfo"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.InstantiationException -> L27 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.ClassNotFoundException -> L2d java.lang.ClassCastException -> L2f
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.InstantiationException -> L27 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.ClassNotFoundException -> L2d java.lang.ClassCastException -> L2f
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.InstantiationException -> L27 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.ClassNotFoundException -> L2d java.lang.ClassCastException -> L2f
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.InstantiationException -> L27 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.ClassNotFoundException -> L2d java.lang.ClassCastException -> L2f
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.InstantiationException -> L27 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.ClassNotFoundException -> L2d java.lang.ClassCastException -> L2f
            r1[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.InstantiationException -> L27 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.ClassNotFoundException -> L2d java.lang.ClassCastException -> L2f
            java.lang.Object r5 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.InstantiationException -> L27 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.ClassNotFoundException -> L2d java.lang.ClassCastException -> L2f
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.InstantiationException -> L27 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.ClassNotFoundException -> L2d java.lang.ClassCastException -> L2f
            com.google.android.gms.ads.internal.client.zzcw r5 = com.google.android.gms.ads.internal.client.zzcv.asInterface(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.InstantiationException -> L27 java.lang.IllegalAccessException -> L29 java.lang.NoSuchMethodException -> L2b java.lang.ClassNotFoundException -> L2d java.lang.ClassCastException -> L2f
            return r5
        L25:
            r5 = move-exception
            goto L30
        L27:
            r5 = move-exception
            goto L30
        L29:
            r5 = move-exception
            goto L30
        L2b:
            r5 = move-exception
            goto L30
        L2d:
            r5 = move-exception
            goto L30
        L2f:
            r5 = move-exception
        L30:
            java.lang.String r0 = "Failed to retrieve lite SDK info."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r5)
            r5 = 0
            return r5
    }

    public static com.google.android.gms.internal.ads.zzfhy zzd(android.content.Context r7) {
            java.lang.Class<com.google.android.gms.internal.ads.zzfhy> r0 = com.google.android.gms.internal.ads.zzfhy.class
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzfhy r1 = com.google.android.gms.internal.ads.zzfhy.zza     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r1
        L9:
            android.content.Context r7 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbes.zzb     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L34
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L34
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L34
            r3 = 0
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L2b
            r3 = 243220703(0xe7f40df, double:1.201669937E-315)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L2b
            com.google.android.gms.ads.internal.client.zzcw r5 = zza(r7)     // Catch: java.lang.Throwable -> L34
        L2b:
            com.google.android.gms.internal.ads.zzfhy r1 = new com.google.android.gms.internal.ads.zzfhy     // Catch: java.lang.Throwable -> L34
            r1.<init>(r7, r5)     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.zzfhy.zza = r1     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r1
        L34:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r7
    }

    private final com.google.android.gms.ads.internal.client.zzfc zzg() {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzcw r0 = r2.zzc
            r1 = 0
            if (r0 == 0) goto La
            com.google.android.gms.ads.internal.client.zzfc r0 = r0.getLiteSdkVersion()     // Catch: android.os.RemoteException -> La
            return r0
        La:
            return r1
    }

    public final com.google.android.gms.internal.ads.zzbpl zzb() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzd
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzbpl r0 = (com.google.android.gms.internal.ads.zzbpl) r0
            return r0
    }

    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc(int r3, boolean r4, int r5) {
            r2 = this;
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r3 = r2.zzb
            boolean r3 = com.google.android.gms.ads.internal.util.zzt.zzE(r3)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel
            r0 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r1 = 1
            r4.<init>(r0, r5, r1, r3)
            com.google.android.gms.internal.ads.zzbeb r5 = com.google.android.gms.internal.ads.zzbes.zzc
            java.lang.Object r5 = r5.zze()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L21
            goto L30
        L21:
            com.google.android.gms.ads.internal.client.zzfc r5 = r2.zzg()
            if (r5 == 0) goto L30
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel
            int r5 = r5.zza()
            r4.<init>(r0, r5, r1, r3)
        L30:
            return r4
    }

    public final java.lang.String zze() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzfc r0 = r1.zzg()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.zzb()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final void zzf(com.google.android.gms.internal.ads.zzbpl r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbes.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L22
            com.google.android.gms.ads.internal.client.zzcw r0 = r3.zzc
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L19
        L15:
            com.google.android.gms.internal.ads.zzbpl r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L13
        L19:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L1e
            r4 = r0
        L1e:
            com.google.android.gms.internal.ads.zzfhx.zza(r2, r1, r4)
            return
        L22:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfhx.zza(r0, r1, r4)
            return
    }
}
