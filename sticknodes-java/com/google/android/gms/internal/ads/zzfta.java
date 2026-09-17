package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfta {
    final /* synthetic */ com.google.android.gms.internal.ads.zzftb zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfta(com.google.android.gms.internal.ads.zzftb r1, byte[] r2, com.google.android.gms.internal.ads.zzfsz r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    public final com.google.android.gms.internal.ads.zzfta zza(int r1) {
            r0 = this;
            r0.zzd = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfta zzb(int r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    public final synchronized void zzc() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzftb r0 = r3.zza     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            boolean r1 = r0.zzb     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            if (r1 == 0) goto L31
            com.google.android.gms.internal.ads.zzfte r0 = r0.zza     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            byte[] r1 = r3.zzb     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            r0.zzj(r1)     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            com.google.android.gms.internal.ads.zzftb r0 = r3.zza     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            com.google.android.gms.internal.ads.zzfte r0 = r0.zza     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            int r1 = r3.zzc     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            r0.zzi(r1)     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            com.google.android.gms.internal.ads.zzftb r0 = r3.zza     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            com.google.android.gms.internal.ads.zzfte r0 = r0.zza     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            int r1 = r3.zzd     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            r0.zzg(r1)     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            com.google.android.gms.internal.ads.zzftb r0 = r3.zza     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            com.google.android.gms.internal.ads.zzfte r0 = r0.zza     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            r1 = 0
            r0.zzh(r1)     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            com.google.android.gms.internal.ads.zzftb r0 = r3.zza     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            com.google.android.gms.internal.ads.zzfte r0 = r0.zza     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            r0.zzf()     // Catch: java.lang.Throwable -> L33 android.os.RemoteException -> L35
            monitor-exit(r3)
            return
        L31:
            monitor-exit(r3)
            return
        L33:
            r0 = move-exception
            goto L3f
        L35:
            r0 = move-exception
            java.lang.String r1 = "GASS"
            java.lang.String r2 = "Clearcut log failed"
            android.util.Log.d(r1, r2, r0)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r3)
            return
        L3f:
            monitor-exit(r3)
            throw r0
    }
}
