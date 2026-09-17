package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzdzr implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    protected final com.google.android.gms.internal.ads.zzcas zza;
    protected final java.lang.Object zzb;
    protected boolean zzc;
    protected boolean zzd;
    protected com.google.android.gms.internal.ads.zzbwa zze;
    protected com.google.android.gms.internal.ads.zzbux zzf;

    public zzdzr() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzcas r0 = new com.google.android.gms.internal.ads.zzcas
            r0.<init>()
            r1.zza = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzb = r0
            r0 = 0
            r1.zzc = r0
            r1.zzd = r0
            return
    }

    static void zzc(android.content.Context r1, com.google.common.util.concurrent.ListenableFuture r2, java.util.concurrent.Executor r3) {
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbej.zzj
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbej.zzh
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1d
            goto L1e
        L1d:
            return
        L1e:
            com.google.android.gms.internal.ads.zzdzp r0 = new com.google.android.gms.internal.ads.zzdzp
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgfo.zzr(r2, r0, r3)
            return
    }

    public void onConnectionFailed(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            java.lang.String r2 = "Disconnected from remote ad request service."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            com.google.android.gms.internal.ads.zzeag r2 = new com.google.android.gms.internal.ads.zzeag
            r0 = 1
            r2.<init>(r0)
            com.google.android.gms.internal.ads.zzcas r0 = r1.zza
            r0.zzd(r2)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int r1) {
            r0 = this;
            java.lang.String r1 = "Cannot connect to remote service, fallback to local instance."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)
            return
    }

    protected final void zzb() {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            r1 = 1
            r2.zzd = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbux r1 = r2.zzf     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.isConnected()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L16
            com.google.android.gms.internal.ads.zzbux r1 = r2.zzf     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.isConnecting()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1b
        L16:
            com.google.android.gms.internal.ads.zzbux r1 = r2.zzf     // Catch: java.lang.Throwable -> L20
            r1.disconnect()     // Catch: java.lang.Throwable -> L20
        L1b:
            android.os.Binder.flushPendingCommands()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
    }
}
