package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends android.app.Activity {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    public NotificationHandlerActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            com.google.android.gms.ads.internal.client.zzba r2 = com.google.android.gms.ads.internal.client.zzbc.zza()     // Catch: android.os.RemoteException -> L20
            com.google.android.gms.internal.ads.zzbph r0 = new com.google.android.gms.internal.ads.zzbph     // Catch: android.os.RemoteException -> L20
            r0.<init>()     // Catch: android.os.RemoteException -> L20
            com.google.android.gms.internal.ads.zzbtf r2 = r2.zzo(r1, r0)     // Catch: android.os.RemoteException -> L20
            if (r2 != 0) goto L18
            java.lang.String r2 = "OfflineUtils is null"
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)     // Catch: android.os.RemoteException -> L20
            return
        L18:
            android.content.Intent r0 = r1.getIntent()     // Catch: android.os.RemoteException -> L20
            r2.zze(r0)     // Catch: android.os.RemoteException -> L20
            return
        L20:
            r2 = move-exception
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "RemoteException calling handleNotificationIntent: "
            java.lang.String r2 = r0.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)
            return
    }

    @Override // android.app.Activity
    protected final void onResume() {
            r0 = this;
            super.onResume()
            r0.finish()
            return
    }
}
