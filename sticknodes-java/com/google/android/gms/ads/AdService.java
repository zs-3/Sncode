package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class AdService extends android.app.IntentService {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
            r1 = this;
            java.lang.String r0 = "AdService"
            r1.<init>(r0)
            return
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(android.content.Intent r3) {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzba r0 = com.google.android.gms.ads.internal.client.zzbc.zza()     // Catch: android.os.RemoteException -> L11
            com.google.android.gms.internal.ads.zzbph r1 = new com.google.android.gms.internal.ads.zzbph     // Catch: android.os.RemoteException -> L11
            r1.<init>()     // Catch: android.os.RemoteException -> L11
            com.google.android.gms.internal.ads.zzbtf r0 = r0.zzo(r2, r1)     // Catch: android.os.RemoteException -> L11
            r0.zze(r3)     // Catch: android.os.RemoteException -> L11
            return
        L11:
            r3 = move-exception
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "RemoteException calling handleNotificationIntent: "
            java.lang.String r3 = r0.concat(r3)
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r3)
            return
    }
}
