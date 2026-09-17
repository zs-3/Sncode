package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzex extends com.google.android.gms.internal.ads.zzbma {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzey zza;

    /* synthetic */ zzex(com.google.android.gms.ads.internal.client.zzey r1, com.google.android.gms.ads.internal.client.zzew r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final void zzb(java.util.List r5) throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.ads.internal.client.zzey r0 = r4.zza
            java.lang.Object r0 = com.google.android.gms.ads.internal.client.zzey.zzh(r0)
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzey r1 = r4.zza     // Catch: java.lang.Throwable -> L3f
            r2 = 0
            com.google.android.gms.ads.internal.client.zzey.zzm(r1, r2)     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.ads.internal.client.zzey r1 = r4.zza     // Catch: java.lang.Throwable -> L3f
            r3 = 1
            com.google.android.gms.ads.internal.client.zzey.zzl(r1, r3)     // Catch: java.lang.Throwable -> L3f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.ads.internal.client.zzey r3 = r4.zza     // Catch: java.lang.Throwable -> L3f
            java.util.ArrayList r3 = com.google.android.gms.ads.internal.client.zzey.zzj(r3)     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.ads.internal.client.zzey r3 = r4.zza     // Catch: java.lang.Throwable -> L3f
            java.util.ArrayList r3 = com.google.android.gms.ads.internal.client.zzey.zzj(r3)     // Catch: java.lang.Throwable -> L3f
            r3.clear()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.ads.initialization.InitializationStatus r5 = com.google.android.gms.ads.internal.client.zzey.zzd(r5)
            int r0 = r1.size()
        L30:
            if (r2 >= r0) goto L3e
            java.lang.Object r3 = r1.get(r2)
            com.google.android.gms.ads.initialization.OnInitializationCompleteListener r3 = (com.google.android.gms.ads.initialization.OnInitializationCompleteListener) r3
            r3.onInitializationComplete(r5)
            int r2 = r2 + 1
            goto L30
        L3e:
            return
        L3f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r5
    }
}
