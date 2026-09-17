package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeom {
    private final com.google.android.gms.internal.ads.zzeor zza;
    private final java.lang.String zzb;
    private com.google.android.gms.ads.internal.client.zzdy zzc;

    public zzeom(com.google.android.gms.internal.ads.zzeor r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzeom r0, com.google.android.gms.ads.internal.client.zzdy r1) {
            r0.zzc = r1
            return
    }

    public final synchronized java.lang.String zza() {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            com.google.android.gms.ads.internal.client.zzdy r1 = r3.zzc     // Catch: java.lang.Throwable -> Lc android.os.RemoteException -> Le
            if (r1 == 0) goto La
            java.lang.String r0 = r1.zzg()     // Catch: java.lang.Throwable -> Lc android.os.RemoteException -> Le
        La:
            monitor-exit(r3)
            return r0
        Lc:
            r0 = move-exception
            goto L16
        Le:
            r1 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r1)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r3)
            return r0
        L16:
            monitor-exit(r3)
            throw r0
    }

    public final synchronized java.lang.String zzb() {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            com.google.android.gms.ads.internal.client.zzdy r1 = r3.zzc     // Catch: java.lang.Throwable -> Lc android.os.RemoteException -> Le
            if (r1 == 0) goto La
            java.lang.String r0 = r1.zzg()     // Catch: java.lang.Throwable -> Lc android.os.RemoteException -> Le
        La:
            monitor-exit(r3)
            return r0
        Lc:
            r0 = move-exception
            goto L16
        Le:
            r1 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r2, r1)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r3)
            return r0
        L16:
            monitor-exit(r3)
            throw r0
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm r4, int r5) throws android.os.RemoteException {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            r3.zzc = r0     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.zzeos r0 = new com.google.android.gms.internal.ads.zzeos     // Catch: java.lang.Throwable -> L17
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.zzeol r5 = new com.google.android.gms.internal.ads.zzeol     // Catch: java.lang.Throwable -> L17
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r3.zzb     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.zzeor r2 = r3.zza     // Catch: java.lang.Throwable -> L17
            r2.zzb(r4, r1, r0, r5)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r3)
            return
        L17:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized boolean zze() throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzeor r0 = r1.zza     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.zza()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
