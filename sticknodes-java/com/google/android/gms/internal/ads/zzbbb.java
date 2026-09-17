package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbbb implements com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbc zza;

    zzbbb(com.google.android.gms.internal.ads.zzbbc r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbbc r4 = r3.zza
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzbbc.zze(r4)
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzbbc r0 = r3.zza     // Catch: java.lang.Throwable -> L23
            r1 = 0
            com.google.android.gms.internal.ads.zzbbc.zzk(r0, r1)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zzbbc r0 = r3.zza     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zzbbf r2 = com.google.android.gms.internal.ads.zzbbc.zzc(r0)     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L18
            com.google.android.gms.internal.ads.zzbbc.zzf(r0, r1)     // Catch: java.lang.Throwable -> L23
        L18:
            com.google.android.gms.internal.ads.zzbbc r0 = r3.zza     // Catch: java.lang.Throwable -> L23
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbbc.zze(r0)     // Catch: java.lang.Throwable -> L23
            r0.notifyAll()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
            throw r0
    }
}
