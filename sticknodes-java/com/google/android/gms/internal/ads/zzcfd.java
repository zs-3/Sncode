package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcfd extends com.google.android.gms.internal.ads.zzcbp {
    private final com.google.android.gms.internal.ads.zzcck zzc;
    private com.google.android.gms.internal.ads.zzcfe zzd;
    private android.net.Uri zze;
    private com.google.android.gms.internal.ads.zzcbo zzf;
    private boolean zzg;
    private int zzh;

    public zzcfd(android.content.Context r1, com.google.android.gms.internal.ads.zzcck r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.zzh = r1
            r1 = 0
            r0.zzg = r1
            r0.zzc = r2
            r2.zza(r0)
            return
    }

    private final boolean zzm() {
            r3 = this;
            int r0 = r3.zzh
            r1 = 1
            if (r0 == r1) goto Ld
            r2 = 2
            if (r0 == r2) goto Ld
            com.google.android.gms.internal.ads.zzcfe r0 = r3.zzd
            if (r0 == 0) goto Ld
            return r1
        Ld:
            r0 = 0
            return r0
    }

    private final void zzv(int r3) {
            r2 = this;
            r0 = 4
            if (r3 != r0) goto Le
            com.google.android.gms.internal.ads.zzcck r0 = r2.zzc
            r0.zzc()
            com.google.android.gms.internal.ads.zzccn r0 = r2.zzb
            r0.zzb()
            goto L1c
        Le:
            int r1 = r2.zzh
            if (r1 != r0) goto L1c
            com.google.android.gms.internal.ads.zzcck r0 = r2.zzc
            r0.zze()
            com.google.android.gms.internal.ads.zzccn r0 = r2.zzb
            r0.zzc()
        L1c:
            r2.zzh = r3
            return
    }

    @Override // android.view.View
    public final java.lang.String toString() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzcfd> r0 = com.google.android.gms.internal.ads.zzcfd.class
            java.lang.String r0 = r0.getName()
            int r1 = r3.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "@"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zza() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzb() {
            r1 = this;
            boolean r0 = r1.zzm()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzc() {
            r1 = this;
            boolean r0 = r1.zzm()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzd() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zze() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzf() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzg() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzh() {
            r2 = this;
            r0 = 0
            return r0
    }

    final /* synthetic */ void zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r1.zzf
            if (r0 == 0) goto L7
            r0.zzd()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final java.lang.String zzj() {
            r1 = this;
            java.lang.String r0 = "ImmersivePlayer"
            return r0
    }

    final /* synthetic */ void zzk() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r2.zzf
            if (r0 == 0) goto L13
            boolean r1 = r2.zzg
            if (r1 != 0) goto Le
            r0.zzg()
            r0 = 1
            r2.zzg = r0
        Le:
            com.google.android.gms.internal.ads.zzcbo r0 = r2.zzf
            r0.zze()
        L13:
            return
    }

    final /* synthetic */ void zzl() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r1.zzf
            if (r0 == 0) goto L7
            r0.zzf()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp, com.google.android.gms.internal.ads.zzccm
    public final void zzn() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfe r0 = r1.zzd
            if (r0 == 0) goto L9
            com.google.android.gms.internal.ads.zzccn r0 = r1.zzb
            r0.zza()
        L9:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzo() {
            r2 = this;
            java.lang.String r0 = "AdImmersivePlayerView pause"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            boolean r0 = r2.zzm()
            if (r0 == 0) goto L26
            com.google.android.gms.internal.ads.zzcfe r0 = r2.zzd
            boolean r0 = r0.zzd()
            if (r0 == 0) goto L26
            com.google.android.gms.internal.ads.zzcfe r0 = r2.zzd
            r0.zza()
            r0 = 5
            r2.zzv(r0)
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcfc r1 = new com.google.android.gms.internal.ads.zzcfc
            r1.<init>(r2)
            r0.post(r1)
        L26:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzp() {
            r2 = this;
            java.lang.String r0 = "AdImmersivePlayerView play"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            boolean r0 = r2.zzm()
            if (r0 == 0) goto L23
            com.google.android.gms.internal.ads.zzcfe r0 = r2.zzd
            r0.zzb()
            r0 = 4
            r2.zzv(r0)
            com.google.android.gms.internal.ads.zzccd r0 = r2.zza
            r0.zzb()
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcfb r1 = new com.google.android.gms.internal.ads.zzcfb
            r1.<init>(r2)
            r0.post(r1)
        L23:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzq(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AdImmersivePlayerView seek "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzr(com.google.android.gms.internal.ads.zzcbo r1) {
            r0 = this;
            r0.zzf = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzs(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L21
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.zze = r2
            com.google.android.gms.internal.ads.zzcfe r0 = new com.google.android.gms.internal.ads.zzcfe
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            r1.zzd = r0
            r2 = 3
            r1.zzv(r2)
            com.google.android.gms.internal.ads.zzfun r2 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcfa r0 = new com.google.android.gms.internal.ads.zzcfa
            r0.<init>(r1)
            r2.post(r0)
        L21:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzt() {
            r1 = this;
            java.lang.String r0 = "AdImmersivePlayerView stop"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzcfe r0 = r1.zzd
            if (r0 == 0) goto L13
            r0.zzc()
            r0 = 0
            r1.zzd = r0
            r0 = 1
            r1.zzv(r0)
        L13:
            com.google.android.gms.internal.ads.zzcck r0 = r1.zzc
            r0.zzd()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzu(float r1, float r2) {
            r0 = this;
            return
    }
}
