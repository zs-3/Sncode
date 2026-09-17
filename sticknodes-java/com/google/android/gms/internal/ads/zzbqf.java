package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbqf implements com.google.android.gms.ads.mediation.InitializationCompleteCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbly zza;

    zzbqf(com.google.android.gms.internal.ads.zzbqm r1, com.google.android.gms.internal.ads.zzbly r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbly r0 = r1.zza     // Catch: android.os.RemoteException -> L6
            r0.zze(r2)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbly r0 = r2.zza     // Catch: android.os.RemoteException -> L6
            r0.zzf()     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            return
    }
}
