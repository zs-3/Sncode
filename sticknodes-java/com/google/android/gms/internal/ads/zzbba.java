package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbba implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbc zza;

    zzbba(com.google.android.gms.internal.ads.zzbbc r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbbc r3 = r2.zza
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzbbc.zze(r3)
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbbc r0 = r2.zza     // Catch: java.lang.Throwable -> L1b android.os.DeadObjectException -> L1d
            com.google.android.gms.internal.ads.zzbbf r1 = com.google.android.gms.internal.ads.zzbbc.zzc(r0)     // Catch: java.lang.Throwable -> L1b android.os.DeadObjectException -> L1d
            if (r1 == 0) goto L28
            com.google.android.gms.internal.ads.zzbbf r1 = com.google.android.gms.internal.ads.zzbbc.zzc(r0)     // Catch: java.lang.Throwable -> L1b android.os.DeadObjectException -> L1d
            com.google.android.gms.internal.ads.zzbbi r1 = r1.zzq()     // Catch: java.lang.Throwable -> L1b android.os.DeadObjectException -> L1d
            com.google.android.gms.internal.ads.zzbbc.zzk(r0, r1)     // Catch: java.lang.Throwable -> L1b android.os.DeadObjectException -> L1d
            goto L28
        L1b:
            r0 = move-exception
            goto L33
        L1d:
            r0 = move-exception
            java.lang.String r1 = "Unable to obtain a cache service instance."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)     // Catch: java.lang.Throwable -> L1b
            com.google.android.gms.internal.ads.zzbbc r0 = r2.zza     // Catch: java.lang.Throwable -> L1b
            com.google.android.gms.internal.ads.zzbbc.zzh(r0)     // Catch: java.lang.Throwable -> L1b
        L28:
            com.google.android.gms.internal.ads.zzbbc r0 = r2.zza     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbbc.zze(r0)     // Catch: java.lang.Throwable -> L1b
            r0.notifyAll()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            return
        L33:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            throw r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbbc r3 = r2.zza
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzbbc.zze(r3)
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbbc r0 = r2.zza     // Catch: java.lang.Throwable -> L18
            r1 = 0
            com.google.android.gms.internal.ads.zzbbc.zzk(r0, r1)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.internal.ads.zzbbc r0 = r2.zza     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbbc.zze(r0)     // Catch: java.lang.Throwable -> L18
            r0.notifyAll()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r0
    }
}
