package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdwi implements com.google.android.gms.internal.ads.zzdfb {
    private final android.os.Bundle zza;

    public zzdwi() {
            r1 = this;
            r1.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.zza = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdfb
    public final void zza(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdfb
    public final synchronized void zzb(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            android.os.Bundle r3 = r1.zza     // Catch: java.lang.Throwable -> L9
            r0 = 3
            r3.putInt(r2, r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzdfb
    public final synchronized void zzc(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            android.os.Bundle r0 = r2.zza     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r0.putInt(r3, r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzdfb
    public final synchronized void zzd(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            android.os.Bundle r0 = r2.zza     // Catch: java.lang.Throwable -> L9
            r1 = 2
            r0.putInt(r3, r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzdfb
    public final void zze() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdfb
    public final void zzf() {
            r0 = this;
            return
    }

    public final synchronized android.os.Bundle zzg() {
            r2 = this;
            monitor-enter(r2)
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> La
            android.os.Bundle r1 = r2.zza     // Catch: java.lang.Throwable -> La
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
