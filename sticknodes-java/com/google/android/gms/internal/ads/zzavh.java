package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzavh {
    protected static volatile com.google.android.gms.internal.ads.zzftb zza;
    private static final android.os.ConditionVariable zzc = null;
    private static volatile java.util.Random zzd;
    protected volatile java.lang.Boolean zzb;
    private final com.google.android.gms.internal.ads.zzawo zze;

    static {
            android.os.ConditionVariable r0 = new android.os.ConditionVariable
            r0.<init>()
            com.google.android.gms.internal.ads.zzavh.zzc = r0
            r0 = 0
            com.google.android.gms.internal.ads.zzavh.zza = r0
            com.google.android.gms.internal.ads.zzavh.zzd = r0
            return
    }

    public zzavh(com.google.android.gms.internal.ads.zzawo r2) {
            r1 = this;
            r1.<init>()
            r1.zze = r2
            java.util.concurrent.ExecutorService r2 = r2.zzk()
            com.google.android.gms.internal.ads.zzavg r0 = new com.google.android.gms.internal.ads.zzavg
            r0.<init>(r1)
            r2.execute(r0)
            return
    }

    static /* bridge */ /* synthetic */ android.os.ConditionVariable zza() {
            android.os.ConditionVariable r0 = com.google.android.gms.internal.ads.zzavh.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzawo zzb(com.google.android.gms.internal.ads.zzavh r0) {
            com.google.android.gms.internal.ads.zzawo r0 = r0.zze
            return r0
    }

    public static final int zzd() {
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()     // Catch: java.lang.RuntimeException -> L9
            int r0 = r0.nextInt()     // Catch: java.lang.RuntimeException -> L9
            return r0
        L9:
            java.util.Random r0 = com.google.android.gms.internal.ads.zzavh.zzd
            if (r0 != 0) goto L21
            java.lang.Class<com.google.android.gms.internal.ads.zzavh> r0 = com.google.android.gms.internal.ads.zzavh.class
            monitor-enter(r0)
            java.util.Random r1 = com.google.android.gms.internal.ads.zzavh.zzd     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L1c
            java.util.Random r1 = new java.util.Random     // Catch: java.lang.Throwable -> L1e
            r1.<init>()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzavh.zzd = r1     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
        L21:
            java.util.Random r0 = com.google.android.gms.internal.ads.zzavh.zzd
            int r0 = r0.nextInt()
            return r0
    }

    public final void zzc(int r3, int r4, long r5, java.lang.String r7, java.lang.Exception r8) {
            r2 = this;
            android.os.ConditionVariable r0 = com.google.android.gms.internal.ads.zzavh.zzc     // Catch: java.lang.Exception -> L65
            r0.block()     // Catch: java.lang.Exception -> L65
            java.lang.Boolean r0 = r2.zzb     // Catch: java.lang.Exception -> L65
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L65
            if (r0 == 0) goto L65
            com.google.android.gms.internal.ads.zzftb r0 = com.google.android.gms.internal.ads.zzavh.zza     // Catch: java.lang.Exception -> L65
            if (r0 == 0) goto L65
            com.google.android.gms.internal.ads.zzarv r0 = com.google.android.gms.internal.ads.zzarz.zza()     // Catch: java.lang.Exception -> L65
            com.google.android.gms.internal.ads.zzawo r1 = r2.zze     // Catch: java.lang.Exception -> L65
            android.content.Context r1 = r1.zza     // Catch: java.lang.Exception -> L65
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Exception -> L65
            r0.zza(r1)     // Catch: java.lang.Exception -> L65
            r0.zze(r5)     // Catch: java.lang.Exception -> L65
            if (r7 == 0) goto L28
            r0.zzb(r7)     // Catch: java.lang.Exception -> L65
        L28:
            if (r8 == 0) goto L49
            java.io.StringWriter r5 = new java.io.StringWriter     // Catch: java.lang.Exception -> L65
            r5.<init>()     // Catch: java.lang.Exception -> L65
            java.io.PrintWriter r6 = new java.io.PrintWriter     // Catch: java.lang.Exception -> L65
            r6.<init>(r5)     // Catch: java.lang.Exception -> L65
            r8.printStackTrace(r6)     // Catch: java.lang.Exception -> L65
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L65
            r0.zzf(r5)     // Catch: java.lang.Exception -> L65
            java.lang.Class r5 = r8.getClass()     // Catch: java.lang.Exception -> L65
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Exception -> L65
            r0.zzd(r5)     // Catch: java.lang.Exception -> L65
        L49:
            com.google.android.gms.internal.ads.zzftb r5 = com.google.android.gms.internal.ads.zzavh.zza     // Catch: java.lang.Exception -> L65
            com.google.android.gms.internal.ads.zzhbe r6 = r0.zzbn()     // Catch: java.lang.Exception -> L65
            com.google.android.gms.internal.ads.zzarz r6 = (com.google.android.gms.internal.ads.zzarz) r6     // Catch: java.lang.Exception -> L65
            byte[] r6 = r6.zzaV()     // Catch: java.lang.Exception -> L65
            com.google.android.gms.internal.ads.zzfta r5 = r5.zza(r6)     // Catch: java.lang.Exception -> L65
            r5.zza(r3)     // Catch: java.lang.Exception -> L65
            r3 = -1
            if (r4 == r3) goto L62
            r5.zzb(r4)     // Catch: java.lang.Exception -> L65
        L62:
            r5.zzc()     // Catch: java.lang.Exception -> L65
        L65:
            return
    }
}
