package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbbp implements com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcas zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbq zzb;

    zzbbp(com.google.android.gms.internal.ads.zzbbq r1, com.google.android.gms.internal.ads.zzcas r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbbq r4 = r3.zzb
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzbbq.zzb(r4)
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzcas r0 = r3.zza     // Catch: java.lang.Throwable -> L15
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "Connection failed."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
            r0.zzd(r1)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15
            throw r0
    }
}
