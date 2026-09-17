package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdvt implements com.google.android.gms.internal.ads.zzdvd {
    private final long zza;
    private final com.google.android.gms.internal.ads.zzdvi zzb;
    private final com.google.android.gms.internal.ads.zzffy zzc;

    zzdvt(long r1, android.content.Context r3, com.google.android.gms.internal.ads.zzdvi r4, com.google.android.gms.internal.ads.zzcho r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r4
            com.google.android.gms.internal.ads.zzfga r1 = r5.zzw()
            r1.zzb(r3)
            r1.zza(r6)
            com.google.android.gms.internal.ads.zzfgb r1 = r1.zzc()
            com.google.android.gms.internal.ads.zzffy r1 = r1.zza()
            r0.zzc = r1
            return
    }

    static /* bridge */ /* synthetic */ long zzd(com.google.android.gms.internal.ads.zzdvt r2) {
            long r0 = r2.zza
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdvi zze(com.google.android.gms.internal.ads.zzdvt r0) {
            com.google.android.gms.internal.ads.zzdvi r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdvd
    public final void zza() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdvd
    public final void zzb(com.google.android.gms.ads.internal.client.zzm r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzffy r0 = r2.zzc     // Catch: android.os.RemoteException -> Lb
            com.google.android.gms.internal.ads.zzdvr r1 = new com.google.android.gms.internal.ads.zzdvr     // Catch: android.os.RemoteException -> Lb
            r1.<init>(r2)     // Catch: android.os.RemoteException -> Lb
            r0.zzf(r3, r1)     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdvd
    public final void zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzffy r0 = r2.zzc     // Catch: android.os.RemoteException -> L15
            com.google.android.gms.internal.ads.zzdvs r1 = new com.google.android.gms.internal.ads.zzdvs     // Catch: android.os.RemoteException -> L15
            r1.<init>(r2)     // Catch: android.os.RemoteException -> L15
            r0.zzk(r1)     // Catch: android.os.RemoteException -> L15
            com.google.android.gms.internal.ads.zzffy r0 = r2.zzc     // Catch: android.os.RemoteException -> L15
            r1 = 0
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L15
            r0.zzm(r1)     // Catch: android.os.RemoteException -> L15
            return
        L15:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }
}
