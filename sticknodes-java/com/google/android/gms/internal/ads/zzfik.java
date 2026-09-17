package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfik implements com.google.android.gms.internal.ads.zzcyd {
    private final java.util.HashSet zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzcah zzc;

    public zzfik(android.content.Context r2, com.google.android.gms.internal.ads.zzcah r3) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            r1.zzc = r3
            return
    }

    public final android.os.Bundle zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcah r0 = r2.zzc
            android.content.Context r1 = r2.zzb
            android.os.Bundle r0 = r0.zzn(r1, r2)
            return r0
    }

    public final synchronized void zzc(java.util.HashSet r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashSet r0 = r1.zza     // Catch: java.lang.Throwable -> Ld
            r0.clear()     // Catch: java.lang.Throwable -> Ld
            java.util.HashSet r0 = r1.zza     // Catch: java.lang.Throwable -> Ld
            r0.addAll(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final synchronized void zzdB(com.google.android.gms.ads.internal.client.zze r2) {
            r1 = this;
            monitor-enter(r1)
            int r2 = r2.zza     // Catch: java.lang.Throwable -> L11
            r0 = 3
            if (r2 == r0) goto Lf
            com.google.android.gms.internal.ads.zzcah r2 = r1.zzc     // Catch: java.lang.Throwable -> L11
            java.util.HashSet r0 = r1.zza     // Catch: java.lang.Throwable -> L11
            r2.zzl(r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        Lf:
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
