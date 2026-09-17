package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeig extends com.google.android.gms.internal.ads.zzbpq implements com.google.android.gms.internal.ads.zzczk {
    private com.google.android.gms.internal.ads.zzbpr zza;
    private com.google.android.gms.internal.ads.zzczj zzb;

    public zzeig() {
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

    public final synchronized void zzc(com.google.android.gms.internal.ads.zzbpr r1) {
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

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zze() throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zze()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzf() throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzf()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzg(int r2) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzczj r0 = r1.zzb     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zza(r2)     // Catch: java.lang.Throwable -> Lc
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

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zze r2) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzczj r0 = r1.zzb     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzb(r2)     // Catch: java.lang.Throwable -> Lc
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

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzi(int r2, java.lang.String r3) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzczj r0 = r1.zzb     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzc(r2, r3)     // Catch: java.lang.Throwable -> Lc
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

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzj(int r2) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzj(r2)     // Catch: java.lang.Throwable -> Lc
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

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze r2) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzk(r2)     // Catch: java.lang.Throwable -> Lc
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

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzl(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzl(r2)     // Catch: java.lang.Throwable -> Lc
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

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzm() throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzm()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzn() throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzn()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzo() throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L8
            r0.zzo()     // Catch: java.lang.Throwable -> L13
        L8:
            com.google.android.gms.internal.ads.zzczj r0 = r1.zzb     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L11
            r0.zzd()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return
        L11:
            monitor-exit(r1)
            return
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzp() throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzp()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzq(java.lang.String r2, java.lang.String r3) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzq(r2, r3)     // Catch: java.lang.Throwable -> Lc
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

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzr(com.google.android.gms.internal.ads.zzbgw r1, java.lang.String r2) throws android.os.RemoteException {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzs(com.google.android.gms.internal.ads.zzbwy r2) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzs(r2)     // Catch: java.lang.Throwable -> Lc
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

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzt(com.google.android.gms.internal.ads.zzbxc r2) throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzt(r2)     // Catch: java.lang.Throwable -> Lc
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

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzu() throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzu()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzv() throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzv()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzw() throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzw()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzx() throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzx()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final synchronized void zzy() throws android.os.RemoteException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbpr r0 = r1.zza     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            r0.zzy()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        La:
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
