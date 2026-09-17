package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbbz {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbca zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzbbz(com.google.android.gms.internal.ads.zzbca r1, byte[] r2, com.google.android.gms.internal.ads.zzbby r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    public static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzbbz r0) {
            r0.zzd()
            return
    }

    private final synchronized void zzd() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbca r0 = r2.zza     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            boolean r1 = r0.zzb     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            if (r1 == 0) goto L30
            com.google.android.gms.internal.ads.zzayq r0 = r0.zza     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            byte[] r1 = r2.zzb     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            r0.zzj(r1)     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            com.google.android.gms.internal.ads.zzbca r0 = r2.zza     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            com.google.android.gms.internal.ads.zzayq r0 = r0.zza     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            r1 = 0
            r0.zzi(r1)     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            com.google.android.gms.internal.ads.zzbca r0 = r2.zza     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            com.google.android.gms.internal.ads.zzayq r0 = r0.zza     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            int r1 = r2.zzc     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            r0.zzg(r1)     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            com.google.android.gms.internal.ads.zzbca r0 = r2.zza     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            com.google.android.gms.internal.ads.zzayq r0 = r0.zza     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            r1 = 0
            r0.zzh(r1)     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            com.google.android.gms.internal.ads.zzbca r0 = r2.zza     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            com.google.android.gms.internal.ads.zzayq r0 = r0.zza     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            r0.zzf()     // Catch: java.lang.Throwable -> L32 android.os.RemoteException -> L34
            monitor-exit(r2)
            return
        L30:
            monitor-exit(r2)
            return
        L32:
            r0 = move-exception
            goto L3c
        L34:
            r0 = move-exception
            java.lang.String r1 = "Clearcut log failed"
            com.google.android.gms.ads.internal.util.client.zzm.zzf(r1, r0)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r2)
            return
        L3c:
            monitor-exit(r2)
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzbbz zza(int r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    public final synchronized void zzc() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbca r0 = r2.zza     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.internal.ads.zzbca.zza(r0)     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.internal.ads.zzbbx r1 = new com.google.android.gms.internal.ads.zzbbx     // Catch: java.lang.Throwable -> L11
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            r0.execute(r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r2)
            return
        L11:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
