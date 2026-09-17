package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzebz implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    protected final com.google.android.gms.internal.ads.zzcas zza;
    protected boolean zzb;
    protected boolean zzc;
    protected com.google.android.gms.internal.ads.zzbva zzd;
    protected android.content.Context zze;
    protected android.os.Looper zzf;
    protected java.util.concurrent.ScheduledExecutorService zzg;

    public zzebz() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzcas r0 = new com.google.android.gms.internal.ads.zzcas
            r0.<init>()
            r1.zza = r0
            r0 = 0
            r1.zzb = r0
            r1.zzc = r0
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r5) {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r5 = r5.getErrorCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = "Remote ad service connection failed, cause: %d."
            java.lang.String r5 = java.lang.String.format(r0, r5, r2)
            com.google.android.gms.ads.internal.util.client.zzm.zze(r5)
            com.google.android.gms.internal.ads.zzeag r0 = new com.google.android.gms.internal.ads.zzeag
            r0.<init>(r1, r5)
            com.google.android.gms.internal.ads.zzcas r5 = r4.zza
            r5.zzd(r0)
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int r5) {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = "Remote ad service connection suspended, cause: %d."
            java.lang.String r5 = java.lang.String.format(r0, r5, r2)
            com.google.android.gms.ads.internal.util.client.zzm.zze(r5)
            com.google.android.gms.internal.ads.zzeag r0 = new com.google.android.gms.internal.ads.zzeag
            r0.<init>(r1, r5)
            com.google.android.gms.internal.ads.zzcas r5 = r4.zza
            r5.zzd(r0)
            return
    }

    protected final synchronized void zzb() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbva r0 = r3.zzd     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L10
            com.google.android.gms.internal.ads.zzbva r0 = new com.google.android.gms.internal.ads.zzbva     // Catch: java.lang.Throwable -> L17
            android.content.Context r1 = r3.zze     // Catch: java.lang.Throwable -> L17
            android.os.Looper r2 = r3.zzf     // Catch: java.lang.Throwable -> L17
            r0.<init>(r1, r2, r3, r3)     // Catch: java.lang.Throwable -> L17
            r3.zzd = r0     // Catch: java.lang.Throwable -> L17
        L10:
            com.google.android.gms.internal.ads.zzbva r0 = r3.zzd     // Catch: java.lang.Throwable -> L17
            r0.checkAvailabilityAndConnect()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r3)
            return
        L17:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    protected final synchronized void zzc() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.zzc = r0     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzbva r0 = r1.zzd     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto La
            monitor-exit(r1)
            return
        La:
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L18
            com.google.android.gms.internal.ads.zzbva r0 = r1.zzd     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.isConnecting()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1d
        L18:
            com.google.android.gms.internal.ads.zzbva r0 = r1.zzd     // Catch: java.lang.Throwable -> L22
            r0.disconnect()     // Catch: java.lang.Throwable -> L22
        L1d:
            android.os.Binder.flushPendingCommands()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r1)
            return
        L22:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
