package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfnp extends com.google.android.gms.ads.internal.client.zzch {
    private final com.google.android.gms.internal.ads.zzfns zza;

    zzfnp(com.google.android.gms.internal.ads.zzfns r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final com.google.android.gms.internal.ads.zzbao zze(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfns r0 = r1.zza
            com.google.android.gms.internal.ads.zzbao r2 = r0.zza(r2)
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final com.google.android.gms.ads.internal.client.zzby zzf(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfns r0 = r1.zza
            com.google.android.gms.ads.internal.client.zzby r2 = r0.zzb(r2)
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final com.google.android.gms.internal.ads.zzbxf zzg(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfns r0 = r1.zza
            com.google.android.gms.internal.ads.zzbxf r2 = r0.zzc(r2)
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzh(com.google.android.gms.internal.ads.zzbpl r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfns r0 = r1.zza
            r0.zze(r2)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final synchronized void zzi(java.util.List r2, com.google.android.gms.ads.internal.client.zzcf r3) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzfns r0 = r1.zza     // Catch: java.lang.Throwable -> L8
            r0.zzf(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzj(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfns r0 = r1.zza
            boolean r2 = r0.zzg(r2)
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzk(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfns r0 = r1.zza
            boolean r2 = r0.zzh(r2)
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzl(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfns r0 = r1.zza
            boolean r2 = r0.zzi(r2)
            return r2
    }
}
