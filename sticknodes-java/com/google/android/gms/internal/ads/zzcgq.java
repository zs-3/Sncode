package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcgq extends com.google.android.gms.ads.internal.client.zzea {
    private final com.google.android.gms.internal.ads.zzccj zza;
    private final java.lang.Object zzb;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzee zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private com.google.android.gms.internal.ads.zzbhk zzn;

    public zzcgq(com.google.android.gms.internal.ads.zzccj r2, float r3, boolean r4, boolean r5) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzb = r0
            r0 = 1
            r1.zzh = r0
            r1.zza = r2
            r1.zzi = r3
            r1.zzc = r4
            r1.zzd = r5
            return
    }

    private final void zzw(int r9, int r10, boolean r11, boolean r12) {
            r8 = this;
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.android.gms.internal.ads.zzcgp r7 = new com.google.android.gms.internal.ads.zzcgp
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r7)
            return
    }

    private final void zzx(java.lang.String r2, java.util.Map r3) {
            r1 = this;
            if (r3 != 0) goto L8
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            goto Le
        L8:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r3)
            r3 = r0
        Le:
            java.lang.String r0 = "action"
            r3.put(r0, r2)
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.android.gms.internal.ads.zzcgo r0 = new com.google.android.gms.internal.ads.zzcgo
            r0.<init>(r1, r3)
            r2.execute(r0)
            return
    }

    public final void zzc(float r4, float r5, int r6, boolean r7, float r8) {
            r3 = this;
            java.lang.Object r0 = r3.zzb
            monitor-enter(r0)
            float r1 = r3.zzi     // Catch: java.lang.Throwable -> L5f
            r2 = 1
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L12
            float r1 = r3.zzk     // Catch: java.lang.Throwable -> L5f
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 == 0) goto L11
            goto L12
        L11:
            r2 = 0
        L12:
            r3.zzi = r5     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzmr     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r5 = r1.zza(r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L5f
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L5f
            if (r5 != 0) goto L28
            r3.zzj = r4     // Catch: java.lang.Throwable -> L5f
        L28:
            boolean r4 = r3.zzh     // Catch: java.lang.Throwable -> L5f
            r3.zzh = r7     // Catch: java.lang.Throwable -> L5f
            int r5 = r3.zze     // Catch: java.lang.Throwable -> L5f
            r3.zze = r6     // Catch: java.lang.Throwable -> L5f
            float r1 = r3.zzk     // Catch: java.lang.Throwable -> L5f
            r3.zzk = r8     // Catch: java.lang.Throwable -> L5f
            float r8 = r8 - r1
            float r8 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> L5f
            r1 = 953267991(0x38d1b717, float:1.0E-4)
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto L49
            com.google.android.gms.internal.ads.zzccj r8 = r3.zza     // Catch: java.lang.Throwable -> L5f
            android.view.View r8 = r8.zzF()     // Catch: java.lang.Throwable -> L5f
            r8.invalidate()     // Catch: java.lang.Throwable -> L5f
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L4d
            goto L5b
        L4d:
            com.google.android.gms.internal.ads.zzbhk r8 = r3.zzn     // Catch: android.os.RemoteException -> L55
            if (r8 == 0) goto L5b
            r8.zze()     // Catch: android.os.RemoteException -> L55
            goto L5b
        L55:
            r8 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r8)
        L5b:
            r3.zzw(r5, r6, r4, r7)
            return
        L5f:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            throw r4
    }

    final /* synthetic */ void zzd(int r8, int r9, boolean r10, boolean r11) {
            r7 = this;
            java.lang.Object r0 = r7.zzb
            monitor-enter(r0)
            boolean r1 = r7.zzg     // Catch: java.lang.Throwable -> L72
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lf
            if (r9 != r3) goto Lf
            r9 = 1
            r4 = 1
            r5 = 1
            goto L11
        Lf:
            r4 = r9
            r5 = 0
        L11:
            if (r8 == r9) goto L15
            r8 = 1
            goto L16
        L15:
            r8 = 0
        L16:
            if (r8 == 0) goto L1d
            if (r4 != r3) goto L1d
            r9 = 1
            r4 = 1
            goto L1e
        L1d:
            r9 = 0
        L1e:
            if (r8 == 0) goto L25
            r6 = 2
            if (r4 != r6) goto L25
            r6 = 1
            goto L26
        L25:
            r6 = 0
        L26:
            if (r8 == 0) goto L2d
            r8 = 3
            if (r4 != r8) goto L2d
            r8 = 1
            goto L2e
        L2d:
            r8 = 0
        L2e:
            if (r1 != 0) goto L32
            if (r5 == 0) goto L33
        L32:
            r2 = 1
        L33:
            r7.zzg = r2     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L41
            com.google.android.gms.ads.internal.client.zzee r1 = r7.zzf     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r1 == 0) goto L41
            r1.zzi()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            goto L41
        L3f:
            r8 = move-exception
            goto L6b
        L41:
            if (r9 == 0) goto L4a
            com.google.android.gms.ads.internal.client.zzee r9 = r7.zzf     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r9 == 0) goto L4a
            r9.zzh()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
        L4a:
            if (r6 == 0) goto L53
            com.google.android.gms.ads.internal.client.zzee r9 = r7.zzf     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r9 == 0) goto L53
            r9.zzg()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
        L53:
            if (r8 == 0) goto L61
            com.google.android.gms.ads.internal.client.zzee r8 = r7.zzf     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r8 == 0) goto L5c
            r8.zze()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
        L5c:
            com.google.android.gms.internal.ads.zzccj r8 = r7.zza     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            r8.zzw()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
        L61:
            if (r10 == r11) goto L70
            com.google.android.gms.ads.internal.client.zzee r8 = r7.zzf     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r8 == 0) goto L70
            r8.zzf(r11)     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            goto L70
        L6b:
            java.lang.String r9 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r9, r8)     // Catch: java.lang.Throwable -> L72
        L70:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            return
        L72:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            throw r8
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            float r1 = r2.zzk     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            float r1 = r2.zzj     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            float r1 = r2.zzi     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            int r1 = r2.zze     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final com.google.android.gms.ads.internal.client.zzee zzi() throws android.os.RemoteException {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzee r1 = r2.zzf     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean r2) {
            r1 = this;
            r0 = 1
            if (r0 == r2) goto L6
            java.lang.String r2 = "unmute"
            goto L8
        L6:
            java.lang.String r2 = "mute"
        L8:
            r0 = 0
            r1.zzx(r2, r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() {
            r2 = this;
            java.lang.String r0 = "pause"
            r1 = 0
            r2.zzx(r0, r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() {
            r2 = this;
            java.lang.String r0 = "play"
            r1 = 0
            r2.zzx(r0, r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(com.google.android.gms.ads.internal.client.zzee r2) {
            r1 = this;
            java.lang.Object r0 = r1.zzb
            monitor-enter(r0)
            r1.zzf = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() {
            r2 = this;
            java.lang.String r0 = "stop"
            r1 = 0
            r2.zzx(r0, r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() {
            r3 = this;
            java.lang.Object r0 = r3.zzb
            boolean r1 = r3.zzp()
            monitor-enter(r0)
            r2 = 0
            if (r1 != 0) goto L16
            boolean r1 = r3.zzm     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            boolean r1 = r3.zzd     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            r2 = 1
            goto L16
        L14:
            r1 = move-exception
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r2
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() {
            r3 = this;
            java.lang.Object r0 = r3.zzb
            monitor-enter(r0)
            boolean r1 = r3.zzc     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            if (r1 == 0) goto Ld
            boolean r1 = r3.zzl     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Ld
            r2 = 1
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            boolean r1 = r2.zzh     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    final /* synthetic */ void zzr(java.util.Map r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzccj r0 = r2.zza
            java.lang.String r1 = "pubVideoCmd"
            r0.zzd(r1, r3)
            return
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzgb r10) {
            r9 = this;
            java.lang.Object r0 = r9.zzb
            boolean r1 = r10.zza
            boolean r2 = r10.zzb
            boolean r10 = r10.zzc
            monitor-enter(r0)
            r9.zzl = r2     // Catch: java.lang.Throwable -> L37
            r9.zzm = r10     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            r0 = 1
            if (r0 == r1) goto L14
            java.lang.String r1 = "0"
            goto L16
        L14:
            java.lang.String r1 = "1"
        L16:
            r4 = r1
            if (r0 == r2) goto L1c
            java.lang.String r1 = "0"
            goto L1e
        L1c:
            java.lang.String r1 = "1"
        L1e:
            r6 = r1
            if (r0 == r10) goto L24
            java.lang.String r10 = "0"
            goto L26
        L24:
            java.lang.String r10 = "1"
        L26:
            r8 = r10
            java.lang.String r7 = "clickToExpandRequested"
            java.lang.String r5 = "customControlsRequested"
            java.lang.String r3 = "muteStart"
            java.lang.String r10 = "initialState"
            java.util.Map r0 = com.google.android.gms.common.util.CollectionUtils.mapOf(r3, r4, r5, r6, r7, r8)
            r9.zzx(r10, r0)
            return
        L37:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r10
    }

    public final void zzt(float r2) {
            r1 = this;
            java.lang.Object r0 = r1.zzb
            monitor-enter(r0)
            r1.zzj = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public final void zzu() {
            r4 = this;
            java.lang.Object r0 = r4.zzb
            monitor-enter(r0)
            boolean r1 = r4.zzh     // Catch: java.lang.Throwable -> Lf
            int r2 = r4.zze     // Catch: java.lang.Throwable -> Lf
            r3 = 3
            r4.zze = r3     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            r4.zzw(r2, r3, r1, r1)
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public final void zzv(com.google.android.gms.internal.ads.zzbhk r2) {
            r1 = this;
            java.lang.Object r0 = r1.zzb
            monitor-enter(r0)
            r1.zzn = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }
}
