package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzfg implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfi zza;

    zzfg(com.google.android.gms.ads.internal.client.zzfi r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzfi r0 = r2.zza
            com.google.android.gms.ads.internal.client.zzfj r0 = r0.zza
            com.google.android.gms.ads.internal.client.zzbl r1 = com.google.android.gms.ads.internal.client.zzfj.zzb(r0)
            if (r1 == 0) goto L19
            com.google.android.gms.ads.internal.client.zzbl r0 = com.google.android.gms.ads.internal.client.zzfj.zzb(r0)     // Catch: android.os.RemoteException -> L13
            r1 = 1
            r0.zze(r1)     // Catch: android.os.RemoteException -> L13
            return
        L13:
            r0 = move-exception
            java.lang.String r1 = "Could not notify onAdFailedToLoad event."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)
        L19:
            return
    }
}
