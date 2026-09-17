package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcdb extends com.google.android.gms.internal.ads.zzcbp implements android.view.TextureView.SurfaceTextureListener, com.google.android.gms.internal.ads.zzcbz {
    private final com.google.android.gms.internal.ads.zzccj zzc;
    private final com.google.android.gms.internal.ads.zzcck zzd;
    private final com.google.android.gms.internal.ads.zzcci zze;
    private com.google.android.gms.internal.ads.zzcbo zzf;
    private android.view.Surface zzg;
    private com.google.android.gms.internal.ads.zzcca zzh;
    private java.lang.String zzi;
    private java.lang.String[] zzj;
    private boolean zzk;
    private int zzl;
    private com.google.android.gms.internal.ads.zzcch zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcdb(android.content.Context r1, com.google.android.gms.internal.ads.zzcck r2, com.google.android.gms.internal.ads.zzccj r3, boolean r4, boolean r5, com.google.android.gms.internal.ads.zzcci r6) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.zzl = r1
            r0.zzc = r3
            r0.zzd = r2
            r0.zzn = r4
            r0.zze = r6
            r0.setSurfaceTextureListener(r0)
            r2.zza(r0)
            return
    }

    private static java.lang.String zzT(java.lang.String r2, java.lang.Exception r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = ":"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
            return r2
    }

    private final void zzU() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r2.zzh
            if (r0 == 0) goto L8
            r1 = 1
            r0.zzQ(r1)
        L8:
            return
    }

    private final void zzV() {
            r2 = this;
            boolean r0 = r2.zzo
            if (r0 == 0) goto L5
            goto L21
        L5:
            r0 = 1
            r2.zzo = r0
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcda r1 = new com.google.android.gms.internal.ads.zzcda
            r1.<init>(r2)
            r0.post(r1)
            r2.zzn()
            com.google.android.gms.internal.ads.zzcck r0 = r2.zzd
            r0.zzb()
            boolean r0 = r2.zzp
            if (r0 == 0) goto L21
            r2.zzp()
        L21:
            return
    }

    private final void zzW(boolean r6, java.lang.Integer r7) {
            r5 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r5.zzh
            if (r0 == 0) goto Lb
            if (r6 == 0) goto L7
            goto Lb
        L7:
            r0.zzP(r7)
            return
        Lb:
            java.lang.String r1 = r5.zzi
            if (r1 == 0) goto Le1
            android.view.Surface r1 = r5.zzg
            if (r1 != 0) goto L15
            goto Le1
        L15:
            if (r6 == 0) goto L2a
            boolean r6 = r5.zzad()
            if (r6 == 0) goto L24
            r0.zzU()
            r5.zzY()
            goto L2a
        L24:
            java.lang.String r6 = "No valid ExoPlayerAdapter exists when switch source."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r6)
            return
        L2a:
            java.lang.String r6 = r5.zzi
            java.lang.String r0 = "cache:"
            boolean r6 = r6.startsWith(r0)
            r0 = 0
            if (r6 == 0) goto L9c
            com.google.android.gms.internal.ads.zzccj r6 = r5.zzc
            java.lang.String r1 = r5.zzi
            com.google.android.gms.internal.ads.zzcdv r6 = r6.zzp(r1)
            boolean r1 = r6 instanceof com.google.android.gms.internal.ads.zzcee
            if (r1 == 0) goto L5b
            com.google.android.gms.internal.ads.zzcee r6 = (com.google.android.gms.internal.ads.zzcee) r6
            com.google.android.gms.internal.ads.zzcca r6 = r6.zza()
            r5.zzh = r6
            r6.zzP(r7)
            com.google.android.gms.internal.ads.zzcca r6 = r5.zzh
            boolean r6 = r6.zzV()
            if (r6 == 0) goto L55
            goto Lc1
        L55:
            java.lang.String r6 = "Precached video player has been released."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r6)
            return
        L5b:
            boolean r1 = r6 instanceof com.google.android.gms.internal.ads.zzceb
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzceb r6 = (com.google.android.gms.internal.ads.zzceb) r6
            java.lang.String r1 = r5.zzF()
            java.nio.ByteBuffer r2 = r6.zzk()
            boolean r3 = r6.zzl()
            java.lang.String r6 = r6.zzi()
            if (r6 != 0) goto L79
            java.lang.String r6 = "Stream cache URL is null."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r6)
            return
        L79:
            com.google.android.gms.internal.ads.zzcca r7 = r5.zzE(r7)
            r5.zzh = r7
            r4 = 1
            android.net.Uri[] r4 = new android.net.Uri[r4]
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r4[r0] = r6
            r7.zzG(r4, r1, r2, r3)
            goto Lc1
        L8c:
            java.lang.String r6 = r5.zzi
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Stream cache miss: "
            java.lang.String r6 = r7.concat(r6)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r6)
            return
        L9c:
            com.google.android.gms.internal.ads.zzcca r6 = r5.zzE(r7)
            r5.zzh = r6
            java.lang.String r6 = r5.zzF()
            java.lang.String[] r7 = r5.zzj
            int r7 = r7.length
            android.net.Uri[] r7 = new android.net.Uri[r7]
            r1 = 0
        Lac:
            java.lang.String[] r2 = r5.zzj
            int r3 = r2.length
            if (r1 >= r3) goto Lbc
            r2 = r2[r1]
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r7[r1] = r2
            int r1 = r1 + 1
            goto Lac
        Lbc:
            com.google.android.gms.internal.ads.zzcca r1 = r5.zzh
            r1.zzF(r7, r6)
        Lc1:
            com.google.android.gms.internal.ads.zzcca r6 = r5.zzh
            r6.zzL(r5)
            android.view.Surface r6 = r5.zzg
            r5.zzZ(r6, r0)
            com.google.android.gms.internal.ads.zzcca r6 = r5.zzh
            boolean r6 = r6.zzV()
            if (r6 == 0) goto Le1
            com.google.android.gms.internal.ads.zzcca r6 = r5.zzh
            int r6 = r6.zzt()
            r5.zzl = r6
            r7 = 3
            if (r6 != r7) goto Le1
            r5.zzV()
        Le1:
            return
    }

    private final void zzX() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r2.zzh
            if (r0 == 0) goto L8
            r1 = 0
            r0.zzQ(r1)
        L8:
            return
    }

    private final void zzY() {
            r3 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r3.zzh
            if (r0 == 0) goto L20
            r0 = 0
            r1 = 1
            r3.zzZ(r0, r1)
            com.google.android.gms.internal.ads.zzcca r2 = r3.zzh
            if (r2 == 0) goto L17
            r2.zzL(r0)
            com.google.android.gms.internal.ads.zzcca r2 = r3.zzh
            r2.zzH()
            r3.zzh = r0
        L17:
            r3.zzl = r1
            r0 = 0
            r3.zzk = r0
            r3.zzo = r0
            r3.zzp = r0
        L20:
            return
    }

    private final void zzZ(android.view.Surface r2, boolean r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r1.zzh
            if (r0 == 0) goto Lf
            r0.zzS(r2, r3)     // Catch: java.io.IOException -> L8
            return
        L8:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r3, r2)
            return
        Lf:
            java.lang.String r2 = "Trying to set surface before player is initialized."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            return
    }

    private final void zzaa() {
            r2 = this;
            int r0 = r2.zzq
            int r1 = r2.zzr
            r2.zzab(r0, r1)
            return
    }

    private final void zzab(int r1, int r2) {
            r0 = this;
            if (r2 <= 0) goto L6
            float r1 = (float) r1
            float r2 = (float) r2
            float r1 = r1 / r2
            goto L8
        L6:
            r1 = 1065353216(0x3f800000, float:1.0)
        L8:
            float r2 = r0.zzs
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L13
            r0.zzs = r1
            r0.requestLayout()
        L13:
            return
    }

    private final boolean zzac() {
            r2 = this;
            boolean r0 = r2.zzad()
            if (r0 == 0) goto Lc
            int r0 = r2.zzl
            r1 = 1
            if (r0 == r1) goto Lc
            return r1
        Lc:
            r0 = 0
            return r0
    }

    private final boolean zzad() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r1.zzh
            if (r0 == 0) goto L10
            boolean r0 = r0.zzV()
            if (r0 == 0) goto L10
            boolean r0 = r1.zzk
            if (r0 != 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    protected final void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            int r5 = r4.getMeasuredWidth()
            int r6 = r4.getMeasuredHeight()
            float r0 = r4.zzs
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L28
            com.google.android.gms.internal.ads.zzcch r1 = r4.zzm
            if (r1 != 0) goto L28
            float r1 = (float) r5
            float r2 = (float) r6
            float r2 = r1 / r2
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L20
            float r1 = r1 / r0
            int r6 = (int) r1
        L20:
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto L28
            float r5 = (float) r6
            float r5 = r5 * r0
            int r5 = (int) r5
        L28:
            r4.setMeasuredDimension(r5, r6)
            com.google.android.gms.internal.ads.zzcch r0 = r4.zzm
            if (r0 == 0) goto L32
            r0.zzc(r5, r6)
        L32:
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r4, int r5, int r6) {
            r3 = this;
            boolean r0 = r3.zzn
            r1 = 0
            if (r0 == 0) goto L29
            com.google.android.gms.internal.ads.zzcch r0 = new com.google.android.gms.internal.ads.zzcch
            android.content.Context r2 = r3.getContext()
            r0.<init>(r2)
            r3.zzm = r0
            r0.zzd(r4, r5, r6)
            com.google.android.gms.internal.ads.zzcch r0 = r3.zzm
            r0.start()
            com.google.android.gms.internal.ads.zzcch r0 = r3.zzm
            android.graphics.SurfaceTexture r0 = r0.zzb()
            if (r0 == 0) goto L22
            r4 = r0
            goto L29
        L22:
            com.google.android.gms.internal.ads.zzcch r0 = r3.zzm
            r0.zze()
            r3.zzm = r1
        L29:
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r4)
            r3.zzg = r0
            com.google.android.gms.internal.ads.zzcca r4 = r3.zzh
            if (r4 != 0) goto L39
            r4 = 0
            r3.zzW(r4, r1)
            goto L46
        L39:
            r4 = 1
            r3.zzZ(r0, r4)
            com.google.android.gms.internal.ads.zzcci r4 = r3.zze
            boolean r4 = r4.zza
            if (r4 != 0) goto L46
            r3.zzU()
        L46:
            int r4 = r3.zzq
            if (r4 == 0) goto L53
            int r4 = r3.zzr
            if (r4 != 0) goto L4f
            goto L53
        L4f:
            r3.zzaa()
            goto L56
        L53:
            r3.zzab(r5, r6)
        L56:
            com.google.android.gms.internal.ads.zzfun r4 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzccx r5 = new com.google.android.gms.internal.ads.zzccx
            r5.<init>(r3)
            r4.post(r5)
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r3) {
            r2 = this;
            r2.zzo()
            com.google.android.gms.internal.ads.zzcch r3 = r2.zzm
            r0 = 0
            if (r3 == 0) goto Ld
            r3.zze()
            r2.zzm = r0
        Ld:
            com.google.android.gms.internal.ads.zzcca r3 = r2.zzh
            r1 = 1
            if (r3 == 0) goto L21
            r2.zzX()
            android.view.Surface r3 = r2.zzg
            if (r3 == 0) goto L1c
            r3.release()
        L1c:
            r2.zzg = r0
            r2.zzZ(r0, r1)
        L21:
            com.google.android.gms.internal.ads.zzfun r3 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcct r0 = new com.google.android.gms.internal.ads.zzcct
            r0.<init>(r2)
            r3.post(r0)
            return r1
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture r2, int r3, int r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcch r2 = r1.zzm
            if (r2 == 0) goto L7
            r2.zzc(r3, r4)
        L7:
            com.google.android.gms.internal.ads.zzfun r2 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzccs r0 = new com.google.android.gms.internal.ads.zzccs
            r0.<init>(r1, r3, r4)
            r2.post(r0)
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcck r0 = r2.zzd
            r0.zzf(r2)
            com.google.android.gms.internal.ads.zzcbo r0 = r2.zzf
            com.google.android.gms.internal.ads.zzccd r1 = r2.zza
            r1.zza(r3, r0)
            return
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AdExoPlayerView3 window visibility changed to "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzccr r1 = new com.google.android.gms.internal.ads.zzccr
            r1.<init>(r2, r3)
            r0.post(r1)
            super.onWindowVisibilityChanged(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzA(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r1.zzh
            if (r0 == 0) goto L7
            r0.zzN(r2)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzB(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r1.zzh
            if (r0 == 0) goto L7
            r0.zzR(r2)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzC(java.lang.String r4, java.lang.String[] r5, java.lang.Integer r6) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            r0 = 1
            r1 = 0
            if (r5 != 0) goto Le
            java.lang.String[] r5 = new java.lang.String[r0]
            r5[r1] = r4
            r3.zzj = r5
            goto L17
        Le:
            int r2 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r2)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r3.zzj = r5
        L17:
            java.lang.String r5 = r3.zzi
            com.google.android.gms.internal.ads.zzcci r2 = r3.zze
            boolean r2 = r2.zzk
            if (r2 == 0) goto L2d
            if (r5 == 0) goto L2d
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L2d
            int r5 = r3.zzl
            r2 = 4
            if (r5 != r2) goto L2d
            goto L2e
        L2d:
            r0 = 0
        L2e:
            r3.zzi = r4
            r3.zzW(r0, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzD(int r1, int r2) {
            r0 = this;
            r0.zzq = r1
            r0.zzr = r2
            r0.zzaa()
            return
    }

    final com.google.android.gms.internal.ads.zzcca zzE(java.lang.Integer r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzcew r0 = new com.google.android.gms.internal.ads.zzcew
            com.google.android.gms.internal.ads.zzcci r1 = r4.zze
            com.google.android.gms.internal.ads.zzccj r2 = r4.zzc
            android.content.Context r3 = r2.getContext()
            r0.<init>(r3, r1, r2, r5)
            java.lang.String r5 = "ExoPlayerAdapter initialized."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r5)
            return r0
    }

    final java.lang.String zzF() {
            r3 = this;
            com.google.android.gms.internal.ads.zzccj r0 = r3.zzc
            com.google.android.gms.ads.internal.util.zzt r1 = com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r2 = r0.getContext()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r0.zzn()
            java.lang.String r0 = r0.afmaVersion
            java.lang.String r0 = r1.zzc(r2, r0)
            return r0
    }

    final /* synthetic */ void zzG(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r2.zzf
            if (r0 == 0) goto L9
            java.lang.String r1 = "ExoPlayerAdapter error"
            r0.zzb(r1, r3)
        L9:
            return
    }

    final /* synthetic */ void zzH() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r1.zzf
            if (r0 == 0) goto L7
            r0.zza()
        L7:
            return
    }

    final /* synthetic */ void zzI() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r1.zzf
            if (r0 == 0) goto L7
            r0.zzf()
        L7:
            return
    }

    final /* synthetic */ void zzJ(boolean r2, long r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzccj r0 = r1.zzc
            r0.zzv(r2, r3)
            return
    }

    final /* synthetic */ void zzK(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r2.zzf
            if (r0 == 0) goto L9
            java.lang.String r1 = "ExoPlayerAdapter exception"
            r0.zzc(r1, r3)
        L9:
            return
    }

    final /* synthetic */ void zzL() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r1.zzf
            if (r0 == 0) goto L7
            r0.zzg()
        L7:
            return
    }

    final /* synthetic */ void zzM() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r1.zzf
            if (r0 == 0) goto L7
            r0.zzh()
        L7:
            return
    }

    final /* synthetic */ void zzN() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r1.zzf
            if (r0 == 0) goto L7
            r0.zzi()
        L7:
            return
    }

    final /* synthetic */ void zzO(int r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r1.zzf
            if (r0 == 0) goto L7
            r0.zzj(r2, r3)
        L7:
            return
    }

    final /* synthetic */ void zzP() {
            r3 = this;
            com.google.android.gms.internal.ads.zzccn r0 = r3.zzb
            float r0 = r0.zza()
            com.google.android.gms.internal.ads.zzcca r1 = r3.zzh
            if (r1 == 0) goto L16
            r2 = 0
            r1.zzT(r0, r2)     // Catch: java.io.IOException -> Lf
            return
        Lf:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)
            return
        L16:
            java.lang.String r0 = "Trying to set volume before player is initialized."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
    }

    final /* synthetic */ void zzQ(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r1.zzf
            if (r0 == 0) goto L7
            r0.onWindowVisibilityChanged(r2)
        L7:
            return
    }

    final /* synthetic */ void zzR() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r1.zzf
            if (r0 == 0) goto L7
            r0.zzd()
        L7:
            return
    }

    final /* synthetic */ void zzS() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbo r0 = r1.zzf
            if (r0 == 0) goto L7
            r0.zze()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zza() {
            r2 = this;
            boolean r0 = r2.zzac()
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzcca r0 = r2.zzh
            long r0 = r0.zzy()
            int r1 = (int) r0
            return r1
        Le:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r1.zzh
            if (r0 == 0) goto L9
            int r0 = r0.zzr()
            return r0
        L9:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzc() {
            r2 = this;
            boolean r0 = r2.zzac()
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzcca r0 = r2.zzh
            long r0 = r0.zzz()
            int r1 = (int) r0
            return r1
        Le:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzd() {
            r1 = this;
            int r0 = r1.zzr
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zze() {
            r1 = this;
            int r0 = r1.zzq
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzf() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r2.zzh
            if (r0 == 0) goto L9
            long r0 = r0.zzx()
            return r0
        L9:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzg() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r2.zzh
            if (r0 == 0) goto L9
            long r0 = r0.zzA()
            return r0
        L9:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzh() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r2.zzh
            if (r0 == 0) goto L9
            long r0 = r0.zzB()
            return r0
        L9:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzi(boolean r3, long r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzccj r0 = r2.zzc
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.android.gms.internal.ads.zzccu r1 = new com.google.android.gms.internal.ads.zzccu
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
        Le:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final java.lang.String zzj() {
            r2 = this;
            boolean r0 = r2.zzn
            r1 = 1
            if (r1 == r0) goto L8
            java.lang.String r0 = ""
            goto La
        L8:
            java.lang.String r0 = " spherical"
        La:
            java.lang.String r1 = "ExoPlayer/2"
            java.lang.String r0 = r1.concat(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzk(java.lang.String r3, java.lang.Exception r4) {
            r2 = this;
            java.lang.String r3 = zzT(r3, r4)
            java.lang.String r0 = "ExoPlayerAdapter error: "
            java.lang.String r0 = r0.concat(r3)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            r0 = 1
            r2.zzk = r0
            com.google.android.gms.internal.ads.zzcci r0 = r2.zze
            boolean r0 = r0.zza
            if (r0 == 0) goto L19
            r2.zzX()
        L19:
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzccy r1 = new com.google.android.gms.internal.ads.zzccy
            r1.<init>(r2, r3)
            r0.post(r1)
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r0 = "AdExoPlayerView.onError"
            r3.zzv(r4, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzl(java.lang.String r3, java.lang.Exception r4) {
            r2 = this;
            java.lang.String r3 = "onLoadException"
            java.lang.String r3 = zzT(r3, r4)
            java.lang.String r0 = "ExoPlayerAdapter exception: "
            java.lang.String r0 = r0.concat(r3)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "AdExoPlayerView.onException"
            r0.zzv(r4, r1)
            com.google.android.gms.internal.ads.zzfun r4 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzccv r0 = new com.google.android.gms.internal.ads.zzccv
            r0.<init>(r2, r3)
            r4.post(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzm(int r2) {
            r1 = this;
            int r0 = r1.zzl
            if (r0 == r2) goto L2e
            r1.zzl = r2
            r0 = 3
            if (r2 == r0) goto L2b
            r0 = 4
            if (r2 == r0) goto Ld
            goto L2e
        Ld:
            com.google.android.gms.internal.ads.zzcci r2 = r1.zze
            boolean r2 = r2.zza
            if (r2 == 0) goto L16
            r1.zzX()
        L16:
            com.google.android.gms.internal.ads.zzcck r2 = r1.zzd
            r2.zze()
            com.google.android.gms.internal.ads.zzccn r2 = r1.zzb
            r2.zzc()
            com.google.android.gms.internal.ads.zzfun r2 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzccz r0 = new com.google.android.gms.internal.ads.zzccz
            r0.<init>(r1)
            r2.post(r0)
            return
        L2b:
            r1.zzV()
        L2e:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp, com.google.android.gms.internal.ads.zzccm
    public final void zzn() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzccq r1 = new com.google.android.gms.internal.ads.zzccq
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzo() {
            r2 = this;
            boolean r0 = r2.zzac()
            if (r0 == 0) goto L29
            com.google.android.gms.internal.ads.zzcci r0 = r2.zze
            boolean r0 = r0.zza
            if (r0 == 0) goto Lf
            r2.zzX()
        Lf:
            com.google.android.gms.internal.ads.zzcca r0 = r2.zzh
            r1 = 0
            r0.zzO(r1)
            com.google.android.gms.internal.ads.zzcck r0 = r2.zzd
            r0.zze()
            com.google.android.gms.internal.ads.zzccn r0 = r2.zzb
            r0.zzc()
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzccw r1 = new com.google.android.gms.internal.ads.zzccw
            r1.<init>(r2)
            r0.post(r1)
        L29:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzp() {
            r2 = this;
            boolean r0 = r2.zzac()
            r1 = 1
            if (r0 == 0) goto L2f
            com.google.android.gms.internal.ads.zzcci r0 = r2.zze
            boolean r0 = r0.zza
            if (r0 == 0) goto L10
            r2.zzU()
        L10:
            com.google.android.gms.internal.ads.zzcca r0 = r2.zzh
            r0.zzO(r1)
            com.google.android.gms.internal.ads.zzcck r0 = r2.zzd
            r0.zzc()
            com.google.android.gms.internal.ads.zzccn r0 = r2.zzb
            r0.zzb()
            com.google.android.gms.internal.ads.zzccd r0 = r2.zza
            r0.zzb()
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzccp r1 = new com.google.android.gms.internal.ads.zzccp
            r1.<init>(r2)
            r0.post(r1)
            return
        L2f:
            r2.zzp = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzq(int r4) {
            r3 = this;
            boolean r0 = r3.zzac()
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzcca r0 = r3.zzh
            long r1 = (long) r4
            r0.zzI(r1)
        Lc:
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
            if (r2 == 0) goto L6
            r0 = 0
            r1.zzC(r2, r0, r0)
        L6:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzt() {
            r1 = this;
            boolean r0 = r1.zzad()
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzcca r0 = r1.zzh
            r0.zzU()
            r1.zzY()
        Le:
            com.google.android.gms.internal.ads.zzcck r0 = r1.zzd
            r0.zze()
            com.google.android.gms.internal.ads.zzccn r0 = r1.zzb
            r0.zzc()
            com.google.android.gms.internal.ads.zzcck r0 = r1.zzd
            r0.zzd()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzu(float r2, float r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcch r0 = r1.zzm
            if (r0 == 0) goto L7
            r0.zzf(r2, r3)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzv() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcco r1 = new com.google.android.gms.internal.ads.zzcco
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final java.lang.Integer zzw() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r1.zzh
            if (r0 == 0) goto L9
            java.lang.Integer r0 = r0.zzC()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzx(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r1.zzh
            if (r0 == 0) goto L7
            r0.zzJ(r2)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzy(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r1.zzh
            if (r0 == 0) goto L7
            r0.zzK(r2)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzz(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcca r0 = r1.zzh
            if (r0 == 0) goto L7
            r0.zzM(r2)
        L7:
            return
    }
}
