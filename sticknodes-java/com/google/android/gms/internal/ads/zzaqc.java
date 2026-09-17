package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzaqc implements java.lang.Comparable {
    private final com.google.android.gms.internal.ads.zzaqn zza;
    private final int zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private final java.lang.Object zze;
    private final com.google.android.gms.internal.ads.zzaqg zzf;
    private java.lang.Integer zzg;
    private com.google.android.gms.internal.ads.zzaqf zzh;
    private boolean zzi;
    private com.google.android.gms.internal.ads.zzapl zzj;
    private com.google.android.gms.internal.ads.zzaqb zzk;
    private final com.google.android.gms.internal.ads.zzapq zzl;

    public zzaqc(int r3, java.lang.String r4, com.google.android.gms.internal.ads.zzaqg r5) {
            r2 = this;
            r2.<init>()
            boolean r0 = com.google.android.gms.internal.ads.zzaqn.zza
            r1 = 0
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzaqn r0 = new com.google.android.gms.internal.ads.zzaqn
            r0.<init>()
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2.zza = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zze = r0
            r0 = 0
            r2.zzi = r0
            r2.zzj = r1
            r2.zzb = r3
            r2.zzc = r4
            r2.zzf = r5
            com.google.android.gms.internal.ads.zzapq r3 = new com.google.android.gms.internal.ads.zzapq
            r3.<init>()
            r2.zzl = r3
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L40
            android.net.Uri r3 = android.net.Uri.parse(r4)
            if (r3 == 0) goto L40
            java.lang.String r3 = r3.getHost()
            if (r3 == 0) goto L40
            int r0 = r3.hashCode()
        L40:
            r2.zzd = r0
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzaqn zzi(com.google.android.gms.internal.ads.zzaqc r0) {
            com.google.android.gms.internal.ads.zzaqn r0 = r0.zza
            return r0
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaqc r2 = (com.google.android.gms.internal.ads.zzaqc) r2
            java.lang.Integer r0 = r1.zzg
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.zzg
            int r2 = r2.intValue()
            int r0 = r0 - r2
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.zzd
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.zzw()
            java.lang.Integer r1 = r4.zzg
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[ ] "
            r2.append(r3)
            java.lang.String r3 = r4.zzc
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            java.lang.String r3 = "0x"
            java.lang.String r0 = r3.concat(r0)
            r2.append(r0)
            java.lang.String r0 = " NORMAL "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public final int zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzapq r0 = r1.zzl
            int r0 = r0.zzb()
            return r0
    }

    public final int zzc() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    public final com.google.android.gms.internal.ads.zzapl zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzapl r0 = r1.zzj
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaqc zze(com.google.android.gms.internal.ads.zzapl r1) {
            r0 = this;
            r0.zzj = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaqc zzf(com.google.android.gms.internal.ads.zzaqf r1) {
            r0 = this;
            r0.zzh = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaqc zzg(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zzg = r1
            return r0
    }

    protected abstract com.google.android.gms.internal.ads.zzaqi zzh(com.google.android.gms.internal.ads.zzapy r1);

    public final java.lang.String zzj() {
            r3 = this;
            int r0 = r3.zzb
            java.lang.String r1 = r3.zzc
            if (r0 == 0) goto L20
            r0 = 1
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "-"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
        L20:
            return r1
    }

    public final java.lang.String zzk() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public java.util.Map zzl() throws com.google.android.gms.internal.ads.zzapk {
            r1 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
    }

    public final void zzm(java.lang.String r4) {
            r3 = this;
            boolean r0 = com.google.android.gms.internal.ads.zzaqn.zza
            if (r0 == 0) goto L11
            com.google.android.gms.internal.ads.zzaqn r0 = r3.zza
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            long r1 = r1.getId()
            r0.zza(r4, r1)
        L11:
            return
    }

    public final void zzn(com.google.android.gms.internal.ads.zzaql r3) {
            r2 = this;
            java.lang.Object r0 = r2.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzaqg r1 = r2.zzf     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            r1.zza(r3)
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    protected abstract void zzo(java.lang.Object r1);

    final void zzp(java.lang.String r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzaqf r0 = r4.zzh
            if (r0 == 0) goto L7
            r0.zzb(r4)
        L7:
            boolean r0 = com.google.android.gms.internal.ads.zzaqn.zza
            if (r0 == 0) goto L3d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r2 == r3) goto L2f
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            com.google.android.gms.internal.ads.zzaqa r3 = new com.google.android.gms.internal.ads.zzaqa
            r3.<init>(r4, r5, r0)
            r2.post(r3)
            return
        L2f:
            com.google.android.gms.internal.ads.zzaqn r2 = r4.zza
            r2.zza(r5, r0)
            com.google.android.gms.internal.ads.zzaqn r5 = r4.zza
            java.lang.String r0 = r4.toString()
            r5.zzb(r0)
        L3d:
            return
    }

    public final void zzq() {
            r2 = this;
            java.lang.Object r0 = r2.zze
            monitor-enter(r0)
            r1 = 1
            r2.zzi = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    final void zzr() {
            r2 = this;
            java.lang.Object r0 = r2.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzaqb r1 = r2.zzk     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Lb
            r1.zza(r2)
        Lb:
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    final void zzs(com.google.android.gms.internal.ads.zzaqi r3) {
            r2 = this;
            java.lang.Object r0 = r2.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzaqb r1 = r2.zzk     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Lb
            r1.zzb(r2, r3)
        Lb:
            return
        Lc:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    final void zzt(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaqf r0 = r1.zzh
            if (r0 == 0) goto L7
            r0.zzc(r1, r2)
        L7:
            return
    }

    final void zzu(com.google.android.gms.internal.ads.zzaqb r2) {
            r1 = this;
            java.lang.Object r0 = r1.zze
            monitor-enter(r0)
            r1.zzk = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public final boolean zzv() {
            r2 = this;
            java.lang.Object r0 = r2.zze
            monitor-enter(r0)
            boolean r1 = r2.zzi     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final boolean zzw() {
            r2 = this;
            java.lang.Object r0 = r2.zze
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            r0 = 0
            return r0
        L6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }

    public byte[] zzx() throws com.google.android.gms.internal.ads.zzapk {
            r1 = this;
            r0 = 0
            return r0
    }

    public final com.google.android.gms.internal.ads.zzapq zzy() {
            r1 = this;
            com.google.android.gms.internal.ads.zzapq r0 = r1.zzl
            return r0
    }
}
