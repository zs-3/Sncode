package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeih extends com.google.android.gms.internal.ads.zzbww implements com.google.android.gms.internal.ads.zzczk {
    private com.google.android.gms.internal.ads.zzbwx zza;
    private com.google.android.gms.internal.ads.zzczj zzb;
    private com.google.android.gms.internal.ads.zzdgl zzc;

    public zzeih() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final synchronized void zza(com.google.android.gms.internal.ads.zzczj r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzb = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzc(com.google.android.gms.internal.ads.zzbwx r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zza = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzd(com.google.android.gms.internal.ads.zzdgl r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzc = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final synchronized void zze(com.google.android.gms.dynamic.IObjectWrapper r1) throws android.os.RemoteException {
            r0 = this;
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbwx r1 = r0.zza     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto Le
            com.google.android.gms.internal.ads.zzelm r1 = (com.google.android.gms.internal.ads.zzelm) r1     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.zzcxy r1 = r1.zzb     // Catch: java.lang.Throwable -> L10
            r1.onAdClicked()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return
        Le:
            monitor-exit(r0)
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final synchronized void zzf(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbwx r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzf(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final synchronized void zzg(com.google.android.gms.dynamic.IObjectWrapper r1, int r2) throws android.os.RemoteException {
            r0 = this;
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzczj r1 = r0.zzb     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            r1.zza(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        La:
            monitor-exit(r0)
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final synchronized void zzh(com.google.android.gms.dynamic.IObjectWrapper r1) throws android.os.RemoteException {
            r0 = this;
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbwx r1 = r0.zza     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto Le
            com.google.android.gms.internal.ads.zzelm r1 = (com.google.android.gms.internal.ads.zzelm) r1     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.zzczh r1 = r1.zzc     // Catch: java.lang.Throwable -> L10
            r1.zzb()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return
        Le:
            monitor-exit(r0)
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final synchronized void zzi(com.google.android.gms.dynamic.IObjectWrapper r1) throws android.os.RemoteException {
            r0 = this;
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzczj r1 = r0.zzb     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto La
            r1.zzd()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        La:
            monitor-exit(r0)
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final synchronized void zzj(com.google.android.gms.dynamic.IObjectWrapper r1) throws android.os.RemoteException {
            r0 = this;
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbwx r1 = r0.zza     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto Le
            com.google.android.gms.internal.ads.zzelm r1 = (com.google.android.gms.internal.ads.zzelm) r1     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.zzdag r1 = r1.zza     // Catch: java.lang.Throwable -> L10
            r1.zzdr()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return
        Le:
            monitor-exit(r0)
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final synchronized void zzk(com.google.android.gms.dynamic.IObjectWrapper r1, int r2) throws android.os.RemoteException {
            r0 = this;
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzdgl r1 = r0.zzc     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            com.google.android.gms.internal.ads.zzell r1 = (com.google.android.gms.internal.ads.zzell) r1     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.ads.zzegn r1 = r1.zzc     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.zza     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "Fail to initialize adapter "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L1a:
            monitor-exit(r0)
            return
        L1c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final synchronized void zzl(com.google.android.gms.dynamic.IObjectWrapper r3) throws android.os.RemoteException {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdgl r3 = r2.zzc     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1a
            r0 = r3
            com.google.android.gms.internal.ads.zzell r0 = (com.google.android.gms.internal.ads.zzell) r0     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.ads.zzeln r0 = r0.zzd     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzeln.zzc(r0)     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.ads.zzelk r1 = new com.google.android.gms.internal.ads.zzelk     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.ads.zzell r3 = (com.google.android.gms.internal.ads.zzell) r3     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            r0.execute(r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)
            return
        L1a:
            monitor-exit(r2)
            return
        L1c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final synchronized void zzm(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.ads.zzbwy r2) throws android.os.RemoteException {
            r0 = this;
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbwx r1 = r0.zza     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto Le
            com.google.android.gms.internal.ads.zzelm r1 = (com.google.android.gms.internal.ads.zzelm) r1     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.zzdgj r1 = r1.zzd     // Catch: java.lang.Throwable -> L10
            r1.zza(r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return
        Le:
            monitor-exit(r0)
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final synchronized void zzn(com.google.android.gms.dynamic.IObjectWrapper r1) throws android.os.RemoteException {
            r0 = this;
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbwx r1 = r0.zza     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto Le
            com.google.android.gms.internal.ads.zzelm r1 = (com.google.android.gms.internal.ads.zzelm) r1     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.zzczh r1 = r1.zzc     // Catch: java.lang.Throwable -> L10
            r1.zze()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return
        Le:
            monitor-exit(r0)
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final synchronized void zzo(com.google.android.gms.dynamic.IObjectWrapper r1) throws android.os.RemoteException {
            r0 = this;
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbwx r1 = r0.zza     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto Le
            com.google.android.gms.internal.ads.zzelm r1 = (com.google.android.gms.internal.ads.zzelm) r1     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.zzdgj r1 = r1.zzd     // Catch: java.lang.Throwable -> L10
            r1.zzc()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return
        Le:
            monitor-exit(r0)
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
