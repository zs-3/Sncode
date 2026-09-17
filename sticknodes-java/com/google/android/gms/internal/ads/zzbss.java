package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbss implements com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement {
    private final com.google.android.gms.internal.ads.zzbgw zza;

    public zzbss(com.google.android.gms.internal.ads.zzbgw r2) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            r2.zzm()     // Catch: android.os.RemoteException -> L9
            return
        L9:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(android.view.View r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbgw r0 = r1.zza     // Catch: android.os.RemoteException -> La
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> La
            r0.zzp(r2)     // Catch: android.os.RemoteException -> La
            return
        La:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbgw r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            boolean r0 = r0.zzt()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }
}
