package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzblr implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcas zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzblt zzb;

    zzblr(com.google.android.gms.internal.ads.zzblt r1, com.google.android.gms.internal.ads.zzcas r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcas r2 = r1.zza     // Catch: android.os.DeadObjectException -> L10
            com.google.android.gms.internal.ads.zzblt r0 = r1.zzb     // Catch: android.os.DeadObjectException -> L10
            com.google.android.gms.internal.ads.zzblg r0 = com.google.android.gms.internal.ads.zzblt.zzb(r0)     // Catch: android.os.DeadObjectException -> L10
            com.google.android.gms.internal.ads.zzbln r0 = r0.zzp()     // Catch: android.os.DeadObjectException -> L10
            r2.zzc(r0)     // Catch: android.os.DeadObjectException -> L10
            return
        L10:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzcas r0 = r1.zza
            r0.zzd(r2)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int r4) {
            r3 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onConnectionSuspended: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            com.google.android.gms.internal.ads.zzcas r4 = r3.zza
            r4.zzd(r0)
            return
    }
}
