package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfrg implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    protected final com.google.android.gms.internal.ads.zzfsg zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.util.concurrent.LinkedBlockingQueue zzd;
    private final android.os.HandlerThread zze;

    public zzfrg(android.content.Context r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r6.<init>()
            r6.zzb = r8
            r6.zzc = r9
            android.os.HandlerThread r8 = new android.os.HandlerThread
            java.lang.String r9 = "GassClient"
            r8.<init>(r9)
            r6.zze = r8
            r8.start()
            com.google.android.gms.internal.ads.zzfsg r9 = new com.google.android.gms.internal.ads.zzfsg
            android.os.Looper r2 = r8.getLooper()
            r5 = 9200000(0x8c6180, float:1.2891946E-38)
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

    static com.google.android.gms.internal.ads.zzath zza() {
            com.google.android.gms.internal.ads.zzasm r0 = com.google.android.gms.internal.ads.zzath.zza()
            r1 = 32768(0x8000, double:1.61895E-319)
            r0.zzD(r1)
            com.google.android.gms.internal.ads.zzhbe r0 = r0.zzbn()
            com.google.android.gms.internal.ads.zzath r0 = (com.google.android.gms.internal.ads.zzath) r0
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfsl r4 = r3.zzd()
            if (r4 == 0) goto L39
            com.google.android.gms.internal.ads.zzfsh r0 = new com.google.android.gms.internal.ads.zzfsh     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r3.zzb     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = r3.zzc     // Catch: java.lang.Throwable -> L25
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzfsj r4 = r4.zze(r0)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzath r4 = r4.zza()     // Catch: java.lang.Throwable -> L25
            java.util.concurrent.LinkedBlockingQueue r0 = r3.zzd     // Catch: java.lang.Throwable -> L25
            r0.put(r4)     // Catch: java.lang.Throwable -> L25
        L1c:
            r3.zzc()
            android.os.HandlerThread r4 = r3.zze
            r4.quit()
            return
        L25:
            java.util.concurrent.LinkedBlockingQueue r4 = r3.zzd     // Catch: java.lang.InterruptedException -> L1c java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.zzath r0 = zza()     // Catch: java.lang.InterruptedException -> L1c java.lang.Throwable -> L2f
            r4.put(r0)     // Catch: java.lang.InterruptedException -> L1c java.lang.Throwable -> L2f
            goto L1c
        L2f:
            r4 = move-exception
            r3.zzc()
            android.os.HandlerThread r0 = r3.zze
            r0.quit()
            throw r4
        L39:
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            java.util.concurrent.LinkedBlockingQueue r2 = r1.zzd     // Catch: java.lang.InterruptedException -> L9
            com.google.android.gms.internal.ads.zzath r0 = zza()     // Catch: java.lang.InterruptedException -> L9
            r2.put(r0)     // Catch: java.lang.InterruptedException -> L9
        L9:
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int r2) {
            r1 = this;
            java.util.concurrent.LinkedBlockingQueue r2 = r1.zzd     // Catch: java.lang.InterruptedException -> L9
            com.google.android.gms.internal.ads.zzath r0 = zza()     // Catch: java.lang.InterruptedException -> L9
            r2.put(r0)     // Catch: java.lang.InterruptedException -> L9
        L9:
            return
    }

    public final com.google.android.gms.internal.ads.zzath zzb(int r4) {
            r3 = this;
            java.util.concurrent.LinkedBlockingQueue r4 = r3.zzd     // Catch: java.lang.InterruptedException -> Ld
            r0 = 5000(0x1388, double:2.4703E-320)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> Ld
            java.lang.Object r4 = r4.poll(r0, r2)     // Catch: java.lang.InterruptedException -> Ld
            com.google.android.gms.internal.ads.zzath r4 = (com.google.android.gms.internal.ads.zzath) r4     // Catch: java.lang.InterruptedException -> Ld
            goto Le
        Ld:
            r4 = 0
        Le:
            if (r4 != 0) goto L14
            com.google.android.gms.internal.ads.zzath r4 = zza()
        L14:
            return r4
    }

    public final void zzc() {
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

    protected final com.google.android.gms.internal.ads.zzfsl zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfsg r0 = r1.zza     // Catch: java.lang.Throwable -> L7
            com.google.android.gms.internal.ads.zzfsl r0 = r0.zzp()     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }
}
