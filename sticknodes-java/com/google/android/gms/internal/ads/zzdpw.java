package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdpw extends com.google.android.gms.internal.ads.zzdpg implements com.google.android.gms.internal.ads.zzdga {
    private com.google.android.gms.internal.ads.zzdga zza;

    public zzdpw() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final synchronized void zzdG() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdga r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzdG()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final synchronized void zzdf() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdga r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzdf()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    protected final synchronized void zzi(com.google.android.gms.ads.internal.client.zza r1, com.google.android.gms.internal.ads.zzbim r2, com.google.android.gms.ads.internal.overlay.zzr r3, com.google.android.gms.internal.ads.zzbio r4, com.google.android.gms.ads.internal.overlay.zzac r5, com.google.android.gms.internal.ads.zzdga r6) {
            r0 = this;
            monitor-enter(r0)
            super.zzh(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L8
            r0.zza = r6     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
