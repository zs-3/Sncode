package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfrl implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    private final com.google.android.gms.internal.ads.zzfsg zza;
    private final com.google.android.gms.internal.ads.zzfsa zzb;
    private final java.lang.Object zzc;
    private boolean zzd;
    private boolean zze;

    zzfrl(android.content.Context r8, android.os.Looper r9, com.google.android.gms.internal.ads.zzfsa r10) {
            r7 = this;
            r7.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r7.zzc = r0
            r0 = 0
            r7.zzd = r0
            r7.zze = r0
            r7.zzb = r10
            com.google.android.gms.internal.ads.zzfsg r10 = new com.google.android.gms.internal.ads.zzfsg
            r6 = 12800000(0xc35000, float:1.793662E-38)
            r1 = r10
            r2 = r8
            r3 = r9
            r4 = r7
            r5 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.zza = r10
            return
    }

    private final void zzb() {
            r2 = this;
            java.lang.Object r0 = r2.zzc
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzfsg r1 = r2.zza     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isConnected()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L13
            com.google.android.gms.internal.ads.zzfsg r1 = r2.zza     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isConnecting()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L18
        L13:
            com.google.android.gms.internal.ads.zzfsg r1 = r2.zza     // Catch: java.lang.Throwable -> L1d
            r1.disconnect()     // Catch: java.lang.Throwable -> L1d
        L18:
            android.os.Binder.flushPendingCommands()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle r4) {
            r3 = this;
            java.lang.Object r4 = r3.zzc
            monitor-enter(r4)
            boolean r0 = r3.zze     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L9
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            return
        L9:
            r0 = 1
            r3.zze = r0     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzfsg r0 = r3.zza     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzfsl r0 = r0.zzp()     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzfse r1 = new com.google.android.gms.internal.ads.zzfse     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzfsa r2 = r3.zzb     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L24
            byte[] r2 = r2.zzaV()     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L24
            r1.<init>(r2)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L24
            r0.zzg(r1)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> L24
        L20:
            r3.zzb()     // Catch: java.lang.Throwable -> L2b
            goto L29
        L24:
            r0 = move-exception
            r3.zzb()     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            throw r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int r1) {
            r0 = this;
            return
    }

    final void zza() {
            r2 = this;
            java.lang.Object r0 = r2.zzc
            monitor-enter(r0)
            boolean r1 = r2.zzd     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto Lf
            r1 = 1
            r2.zzd = r1     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.internal.ads.zzfsg r1 = r2.zza     // Catch: java.lang.Throwable -> L11
            r1.checkAvailabilityAndConnect()     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }
}
