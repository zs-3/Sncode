package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbrv implements com.google.android.gms.ads.mediation.rtb.SignalCallbacks {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbrn zza;

    zzbrv(com.google.android.gms.internal.ads.zzbrx r1, com.google.android.gms.internal.ads.zzbrn r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(com.google.android.gms.ads.AdError r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbrn r0 = r1.zza     // Catch: android.os.RemoteException -> La
            com.google.android.gms.ads.internal.client.zze r2 = r2.zza()     // Catch: android.os.RemoteException -> La
            r0.zzg(r2)     // Catch: android.os.RemoteException -> La
            return
        La:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbrn r0 = r1.zza     // Catch: android.os.RemoteException -> L6
            r0.zzf(r2)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbrn r0 = r1.zza     // Catch: android.os.RemoteException -> L6
            r0.zze(r2)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }
}
