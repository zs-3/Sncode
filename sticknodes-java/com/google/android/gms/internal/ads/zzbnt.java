package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbnt extends com.google.android.gms.internal.ads.zzcaz {
    private final java.lang.Object zza;
    private final com.google.android.gms.internal.ads.zzbny zzb;
    private boolean zzc;

    public zzbnt(com.google.android.gms.internal.ads.zzbny r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzbny zza(com.google.android.gms.internal.ads.zzbnt r0) {
            com.google.android.gms.internal.ads.zzbny r0 = r0.zzb
            return r0
    }

    public final void zzb() {
            r3 = this;
            java.lang.String r0 = "release: Trying to acquire lock"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            java.lang.String r1 = "release: Lock acquired"
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r3.zzc     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L18
            java.lang.String r1 = "release: Lock already released"
            com.google.android.gms.ads.internal.util.zze.zza(r1)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return
        L18:
            r1 = 1
            r3.zzc = r1     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbnq r1 = new com.google.android.gms.internal.ads.zzbnq     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzcav r2 = new com.google.android.gms.internal.ads.zzcav     // Catch: java.lang.Throwable -> L3c
            r2.<init>()     // Catch: java.lang.Throwable -> L3c
            r3.zzj(r1, r2)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbnr r1 = new com.google.android.gms.internal.ads.zzbnr     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbns r2 = new com.google.android.gms.internal.ads.zzbns     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3c
            r3.zzj(r1, r2)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "release: Lock released"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        L3c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r1
    }
}
