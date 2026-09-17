package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbzw {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzcah zzb;
    private final java.util.LinkedList zzc;
    private final java.lang.Object zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;

    zzbzw(com.google.android.gms.common.util.Clock r5, com.google.android.gms.internal.ads.zzcah r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.zzd = r0
            r0 = -1
            r4.zzg = r0
            r4.zzh = r0
            r2 = 0
            r4.zzi = r2
            r4.zzj = r0
            r4.zzk = r0
            r4.zza = r5
            r4.zzb = r6
            r4.zze = r7
            r4.zzf = r8
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r4.zzc = r5
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzb(com.google.android.gms.internal.ads.zzbzw r0) {
            com.google.android.gms.common.util.Clock r0 = r0.zza
            return r0
    }

    public final android.os.Bundle zza() {
            r5 = this;
            java.lang.Object r0 = r5.zzd
            monitor-enter(r0)
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L6c
            r1.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "seq_num"
            java.lang.String r3 = r5.zze     // Catch: java.lang.Throwable -> L6c
            r1.putString(r2, r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "slotid"
            java.lang.String r3 = r5.zzf     // Catch: java.lang.Throwable -> L6c
            r1.putString(r2, r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "ismediation"
            r3 = 0
            r1.putBoolean(r2, r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "treq"
            long r3 = r5.zzj     // Catch: java.lang.Throwable -> L6c
            r1.putLong(r2, r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "tresponse"
            long r3 = r5.zzk     // Catch: java.lang.Throwable -> L6c
            r1.putLong(r2, r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "timp"
            long r3 = r5.zzg     // Catch: java.lang.Throwable -> L6c
            r1.putLong(r2, r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "tload"
            long r3 = r5.zzh     // Catch: java.lang.Throwable -> L6c
            r1.putLong(r2, r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "pcc"
            long r3 = r5.zzi     // Catch: java.lang.Throwable -> L6c
            r1.putLong(r2, r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "tfetch"
            r3 = -1
            r1.putLong(r2, r3)     // Catch: java.lang.Throwable -> L6c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6c
            r2.<init>()     // Catch: java.lang.Throwable -> L6c
            java.util.LinkedList r3 = r5.zzc     // Catch: java.lang.Throwable -> L6c
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L6c
        L51:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L65
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzbzv r4 = (com.google.android.gms.internal.ads.zzbzv) r4     // Catch: java.lang.Throwable -> L6c
            android.os.Bundle r4 = r4.zzb()     // Catch: java.lang.Throwable -> L6c
            r2.add(r4)     // Catch: java.lang.Throwable -> L6c
            goto L51
        L65:
            java.lang.String r3 = "tclick"
            r1.putParcelableArrayList(r3, r2)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            return r1
        L6c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r1
    }

    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    public final void zzd() {
            r6 = this;
            java.lang.Object r0 = r6.zzd
            monitor-enter(r0)
            long r1 = r6.zzk     // Catch: java.lang.Throwable -> L2b
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L29
            com.google.android.gms.internal.ads.zzbzv r1 = new com.google.android.gms.internal.ads.zzbzv     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2b
            r1.zzd()     // Catch: java.lang.Throwable -> L2b
            java.util.LinkedList r2 = r6.zzc     // Catch: java.lang.Throwable -> L2b
            r2.add(r1)     // Catch: java.lang.Throwable -> L2b
            long r1 = r6.zzi     // Catch: java.lang.Throwable -> L2b
            r3 = 1
            long r1 = r1 + r3
            r6.zzi = r1     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzcah r1 = r6.zzb     // Catch: java.lang.Throwable -> L2b
            r1.zzf()     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzcah r1 = r6.zzb     // Catch: java.lang.Throwable -> L2b
            r1.zze(r6)     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r1
    }

    public final void zze() {
            r7 = this;
            java.lang.Object r0 = r7.zzd
            monitor-enter(r0)
            long r1 = r7.zzk     // Catch: java.lang.Throwable -> L2d
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L2b
            java.util.LinkedList r1 = r7.zzc     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L2b
            java.util.LinkedList r1 = r7.zzc     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r1.getLast()     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbzv r1 = (com.google.android.gms.internal.ads.zzbzv) r1     // Catch: java.lang.Throwable -> L2d
            long r5 = r1.zza()     // Catch: java.lang.Throwable -> L2d
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L2b
            r1.zzc()     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzcah r1 = r7.zzb     // Catch: java.lang.Throwable -> L2d
            r1.zze(r7)     // Catch: java.lang.Throwable -> L2d
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r1
    }

    public final void zzf() {
            r6 = this;
            java.lang.Object r0 = r6.zzd
            monitor-enter(r0)
            long r1 = r6.zzk     // Catch: java.lang.Throwable -> L25
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L1e
            long r1 = r6.zzg     // Catch: java.lang.Throwable -> L25
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1e
            com.google.android.gms.common.util.Clock r1 = r6.zza     // Catch: java.lang.Throwable -> L25
            long r1 = r1.elapsedRealtime()     // Catch: java.lang.Throwable -> L25
            r6.zzg = r1     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzcah r1 = r6.zzb     // Catch: java.lang.Throwable -> L25
            r1.zze(r6)     // Catch: java.lang.Throwable -> L25
        L1e:
            com.google.android.gms.internal.ads.zzcah r1 = r6.zzb     // Catch: java.lang.Throwable -> L25
            r1.zzg()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r1
    }

    public final void zzg() {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzcah r1 = r2.zzb     // Catch: java.lang.Throwable -> La
            r1.zzh()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public final void zzh(boolean r6) {
            r5 = this;
            java.lang.Object r6 = r5.zzd
            monitor-enter(r6)
            long r0 = r5.zzk     // Catch: java.lang.Throwable -> L15
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L13
            com.google.android.gms.common.util.Clock r0 = r5.zza     // Catch: java.lang.Throwable -> L15
            long r0 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L15
            r5.zzh = r0     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    public final void zzi() {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzcah r1 = r2.zzb     // Catch: java.lang.Throwable -> La
            r1.zzi()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzm r5) {
            r4 = this;
            java.lang.Object r0 = r4.zzd
            monitor-enter(r0)
            com.google.android.gms.common.util.Clock r1 = r4.zza     // Catch: java.lang.Throwable -> L12
            long r1 = r1.elapsedRealtime()     // Catch: java.lang.Throwable -> L12
            r4.zzj = r1     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.internal.ads.zzcah r3 = r4.zzb     // Catch: java.lang.Throwable -> L12
            r3.zzj(r5, r1)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
    }

    public final void zzk(long r5) {
            r4 = this;
            java.lang.Object r0 = r4.zzd
            monitor-enter(r0)
            r4.zzk = r5     // Catch: java.lang.Throwable -> L12
            r1 = -1
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L10
            com.google.android.gms.internal.ads.zzcah r5 = r4.zzb     // Catch: java.lang.Throwable -> L12
            r5.zze(r4)     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
    }
}
