package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzczu extends com.google.android.gms.internal.ads.zzddr implements com.google.android.gms.internal.ads.zzbim {
    private final android.os.Bundle zzb;

    zzczu(java.util.Set r1) {
            r0 = this;
            r0.<init>(r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final synchronized void zza(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            monitor-enter(r0)
            android.os.Bundle r1 = r0.zzb     // Catch: java.lang.Throwable -> L10
            r1.putAll(r2)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.zzczt r1 = new com.google.android.gms.internal.ads.zzczt     // Catch: java.lang.Throwable -> L10
            r1.<init>()     // Catch: java.lang.Throwable -> L10
            r0.zzq(r1)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized android.os.Bundle zzb() {
            r2 = this;
            monitor-enter(r2)
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> La
            android.os.Bundle r1 = r2.zzb     // Catch: java.lang.Throwable -> La
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
