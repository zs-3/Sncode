package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfri implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    protected final com.google.android.gms.internal.ads.zzfsg zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.util.concurrent.LinkedBlockingQueue zzd;
    private final android.os.HandlerThread zze;
    private final com.google.android.gms.internal.ads.zzfqz zzf;
    private final long zzg;
    private final int zzh;

    public zzfri(android.content.Context r7, int r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, com.google.android.gms.internal.ads.zzfqz r13) {
            r6 = this;
            r6.<init>()
            r6.zzb = r10
            r6.zzh = r9
            r6.zzc = r11
            r6.zzf = r13
            android.os.HandlerThread r8 = new android.os.HandlerThread
            java.lang.String r9 = "GassDGClient"
            r8.<init>(r9)
            r6.zze = r8
            r8.start()
            long r9 = java.lang.System.currentTimeMillis()
            r6.zzg = r9
            com.google.android.gms.internal.ads.zzfsg r9 = new com.google.android.gms.internal.ads.zzfsg
            android.os.Looper r2 = r8.getLooper()
            r5 = 19621000(0x12b6488, float:3.1479867E-38)
            r0 = r9
            r1 = r7
            r3 = r6
            r4 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.zza = r9
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            r6.zzd = r7
            r9.checkAvailabilityAndConnect()
            return
    }

    private final void zzd(int r3, long r4, java.lang.Exception r6) {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            com.google.android.gms.internal.ads.zzfqz r4 = r2.zzf
            r4.zzc(r3, r0, r6)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzfsl r6 = r5.zzc()
            if (r6 == 0) goto L44
            com.google.android.gms.internal.ads.zzfsq r0 = new com.google.android.gms.internal.ads.zzfsq     // Catch: java.lang.Throwable -> L2c
            r1 = 1
            int r2 = r5.zzh     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r5.zzb     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r5.zzc     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzfss r6 = r6.zzf(r0)     // Catch: java.lang.Throwable -> L2c
            long r0 = r5.zzg     // Catch: java.lang.Throwable -> L2c
            r2 = 5011(0x1393, float:7.022E-42)
            r3 = 0
            r5.zzd(r2, r0, r3)     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.LinkedBlockingQueue r0 = r5.zzd     // Catch: java.lang.Throwable -> L2c
            r0.put(r6)     // Catch: java.lang.Throwable -> L2c
        L23:
            r5.zzb()
            android.os.HandlerThread r6 = r5.zze
            r6.quit()
            return
        L2c:
            r6 = move-exception
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L3a
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            r6 = 2010(0x7da, float:2.817E-42)
            long r1 = r5.zzg     // Catch: java.lang.Throwable -> L3a
            r5.zzd(r6, r1, r0)     // Catch: java.lang.Throwable -> L3a
            goto L23
        L3a:
            r6 = move-exception
            r5.zzb()
            android.os.HandlerThread r0 = r5.zze
            r0.quit()
            throw r6
        L44:
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r4) {
            r3 = this;
            long r0 = r3.zzg     // Catch: java.lang.InterruptedException -> L13
            r4 = 4012(0xfac, float:5.622E-42)
            r2 = 0
            r3.zzd(r4, r0, r2)     // Catch: java.lang.InterruptedException -> L13
            java.util.concurrent.LinkedBlockingQueue r4 = r3.zzd     // Catch: java.lang.InterruptedException -> L13
            com.google.android.gms.internal.ads.zzfss r0 = new com.google.android.gms.internal.ads.zzfss     // Catch: java.lang.InterruptedException -> L13
            r1 = 1
            r0.<init>(r2, r1)     // Catch: java.lang.InterruptedException -> L13
            r4.put(r0)     // Catch: java.lang.InterruptedException -> L13
        L13:
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int r4) {
            r3 = this;
            long r0 = r3.zzg     // Catch: java.lang.InterruptedException -> L13
            r4 = 4011(0xfab, float:5.62E-42)
            r2 = 0
            r3.zzd(r4, r0, r2)     // Catch: java.lang.InterruptedException -> L13
            java.util.concurrent.LinkedBlockingQueue r4 = r3.zzd     // Catch: java.lang.InterruptedException -> L13
            com.google.android.gms.internal.ads.zzfss r0 = new com.google.android.gms.internal.ads.zzfss     // Catch: java.lang.InterruptedException -> L13
            r1 = 1
            r0.<init>(r2, r1)     // Catch: java.lang.InterruptedException -> L13
            r4.put(r0)     // Catch: java.lang.InterruptedException -> L13
        L13:
            return
    }

    public final com.google.android.gms.internal.ads.zzfss zza(int r5) {
            r4 = this;
            r5 = 0
            java.util.concurrent.LinkedBlockingQueue r0 = r4.zzd     // Catch: java.lang.InterruptedException -> Lf
            r1 = 50000(0xc350, double:2.47033E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> Lf
            java.lang.Object r0 = r0.poll(r1, r3)     // Catch: java.lang.InterruptedException -> Lf
            com.google.android.gms.internal.ads.zzfss r0 = (com.google.android.gms.internal.ads.zzfss) r0     // Catch: java.lang.InterruptedException -> Lf
            goto L18
        Lf:
            r0 = move-exception
            r1 = 2009(0x7d9, float:2.815E-42)
            long r2 = r4.zzg
            r4.zzd(r1, r2, r0)
            r0 = r5
        L18:
            r1 = 3004(0xbbc, float:4.21E-42)
            long r2 = r4.zzg
            r4.zzd(r1, r2, r5)
            if (r0 == 0) goto L2f
            int r1 = r0.zzc
            r2 = 7
            if (r1 != r2) goto L2b
            r1 = 3
            com.google.android.gms.internal.ads.zzfqz.zzg(r1)
            goto L2f
        L2b:
            r1 = 2
            com.google.android.gms.internal.ads.zzfqz.zzg(r1)
        L2f:
            if (r0 != 0) goto L37
            com.google.android.gms.internal.ads.zzfss r0 = new com.google.android.gms.internal.ads.zzfss
            r1 = 1
            r0.<init>(r5, r1)
        L37:
            return r0
    }

    public final void zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfsg r0 = r1.zza
            if (r0 == 0) goto L17
            boolean r0 = r0.isConnected()
            if (r0 != 0) goto L12
            com.google.android.gms.internal.ads.zzfsg r0 = r1.zza
            boolean r0 = r0.isConnecting()
            if (r0 == 0) goto L17
        L12:
            com.google.android.gms.internal.ads.zzfsg r0 = r1.zza
            r0.disconnect()
        L17:
            return
    }

    protected final com.google.android.gms.internal.ads.zzfsl zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfsg r0 = r1.zza     // Catch: java.lang.Throwable -> L7
            com.google.android.gms.internal.ads.zzfsl r0 = r0.zzp()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }
}
