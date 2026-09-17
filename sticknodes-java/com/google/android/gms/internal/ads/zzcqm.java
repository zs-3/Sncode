package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcqm extends com.google.android.gms.internal.ads.zzban {
    private final com.google.android.gms.internal.ads.zzcql zza;
    private final com.google.android.gms.ads.internal.client.zzby zzb;
    private final com.google.android.gms.internal.ads.zzfcf zzc;
    private boolean zzd;
    private final com.google.android.gms.internal.ads.zzdud zze;

    public zzcqm(com.google.android.gms.internal.ads.zzcql r3, com.google.android.gms.ads.internal.client.zzby r4, com.google.android.gms.internal.ads.zzfcf r5, com.google.android.gms.internal.ads.zzdud r6) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzaL
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2.zzd = r0
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            r2.zze = r6
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final com.google.android.gms.ads.internal.client.zzby zze() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzby r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final com.google.android.gms.ads.internal.client.zzdy zzf() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzgy
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L14
            r0 = 0
            return r0
        L14:
            com.google.android.gms.internal.ads.zzcql r0 = r2.zza
            com.google.android.gms.internal.ads.zzcxt r0 = r0.zzm()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzg(boolean r1) {
            r0 = this;
            r0.zzd = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzh(com.google.android.gms.ads.internal.client.zzdr r3) {
            r2 = this;
            java.lang.String r0 = "setOnPaidEventListener must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzfcf r0 = r2.zzc
            if (r0 == 0) goto L20
            boolean r0 = r3.zzf()     // Catch: android.os.RemoteException -> L15
            if (r0 != 0) goto L1b
            com.google.android.gms.internal.ads.zzdud r0 = r2.zze     // Catch: android.os.RemoteException -> L15
            r0.zze()     // Catch: android.os.RemoteException -> L15
            goto L1b
        L15:
            r0 = move-exception
            java.lang.String r1 = "Error in making CSI ping for reporting paid event callback"
            com.google.android.gms.ads.internal.util.client.zzm.zzf(r1, r0)
        L1b:
            com.google.android.gms.internal.ads.zzfcf r0 = r2.zzc
            r0.zzn(r3)
        L20:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbao
    public final void zzi(com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.internal.ads.zzbav r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfcf r0 = r2.zzc     // Catch: android.os.RemoteException -> L13
            r0.zzp(r4)     // Catch: android.os.RemoteException -> L13
            com.google.android.gms.internal.ads.zzcql r0 = r2.zza     // Catch: android.os.RemoteException -> L13
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch: android.os.RemoteException -> L13
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: android.os.RemoteException -> L13
            boolean r1 = r2.zzd     // Catch: android.os.RemoteException -> L13
            r0.zzd(r3, r4, r1)     // Catch: android.os.RemoteException -> L13
            return
        L13:
            r3 = move-exception
            java.lang.String r4 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r4, r3)
            return
    }
}
