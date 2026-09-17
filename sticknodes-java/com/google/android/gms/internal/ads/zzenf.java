package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzenf extends com.google.android.gms.ads.internal.client.zzbq {
    private final com.google.android.gms.internal.ads.zzeom zza;

    public zzenf(android.content.Context r3, com.google.android.gms.internal.ads.zzcho r4, com.google.android.gms.internal.ads.zzfha r5, com.google.android.gms.internal.ads.zzdla r6, com.google.android.gms.ads.internal.client.zzbl r7) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzeoo r0 = new com.google.android.gms.internal.ads.zzeoo
            com.google.android.gms.internal.ads.zzdud r1 = r4.zzj()
            r0.<init>(r6, r1)
            r0.zze(r7)
            com.google.android.gms.internal.ads.zzeoy r6 = new com.google.android.gms.internal.ads.zzeoy
            r6.<init>(r4, r3, r0, r5)
            com.google.android.gms.internal.ads.zzeom r3 = new com.google.android.gms.internal.ads.zzeom
            java.lang.String r4 = r5.zzL()
            r3.<init>(r6, r4)
            r2.zza = r3
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized java.lang.String zze() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzeom r0 = r1.zza     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = r0.zza()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized java.lang.String zzf() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzeom r0 = r1.zza     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = r0.zzb()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(com.google.android.gms.ads.internal.client.zzm r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.ads.zzeom r0 = r2.zza
            r1 = 1
            r0.zzd(r3, r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzm r2, int r3) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzeom r0 = r1.zza     // Catch: java.lang.Throwable -> L8
            r0.zzd(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized boolean zzi() throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzeom r0 = r1.zza     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.zze()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
