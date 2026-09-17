package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhao {
    static final com.google.android.gms.internal.ads.zzhao zza = null;
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private static volatile com.google.android.gms.internal.ads.zzhao zzd;
    private final java.util.Map zze;

    static {
            com.google.android.gms.internal.ads.zzhao r0 = new com.google.android.gms.internal.ads.zzhao
            r1 = 1
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzhao.zza = r0
            return
    }

    zzhao() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zze = r0
            return
    }

    zzhao(boolean r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.zze = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzhao zza() {
            int r0 = com.google.android.gms.internal.ads.zzhcz.zza
            com.google.android.gms.internal.ads.zzhao r0 = com.google.android.gms.internal.ads.zzhao.zza
            return r0
    }

    public static com.google.android.gms.internal.ads.zzhao zzb() {
            java.lang.Class<com.google.android.gms.internal.ads.zzhao> r0 = com.google.android.gms.internal.ads.zzhao.class
            com.google.android.gms.internal.ads.zzhao r1 = com.google.android.gms.internal.ads.zzhao.zzd
            if (r1 == 0) goto L7
            return r1
        L7:
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzhao r1 = com.google.android.gms.internal.ads.zzhao.zzd     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        Le:
            int r1 = com.google.android.gms.internal.ads.zzhcz.zza     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.internal.ads.zzhao r1 = com.google.android.gms.internal.ads.zzhaw.zzb(r0)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.internal.ads.zzhao.zzd = r1     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    public final com.google.android.gms.internal.ads.zzhbc zzc(com.google.android.gms.internal.ads.zzhcp r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzhan r0 = new com.google.android.gms.internal.ads.zzhan
            r0.<init>(r2, r3)
            java.util.Map r2 = r1.zze
            java.lang.Object r2 = r2.get(r0)
            com.google.android.gms.internal.ads.zzhbc r2 = (com.google.android.gms.internal.ads.zzhbc) r2
            return r2
    }
}
