package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcbx extends android.widget.FrameLayout implements com.google.android.gms.internal.ads.zzcbo {
    final com.google.android.gms.internal.ads.zzccl zza;
    private final com.google.android.gms.internal.ads.zzccj zzb;
    private final android.widget.FrameLayout zzc;
    private final android.view.View zzd;
    private final com.google.android.gms.internal.ads.zzbdk zze;
    private final long zzf;
    private final com.google.android.gms.internal.ads.zzcbp zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private java.lang.String zzn;
    private java.lang.String[] zzo;
    private android.graphics.Bitmap zzp;
    private final android.widget.ImageView zzq;
    private boolean zzr;

    public zzcbx(android.content.Context r16, com.google.android.gms.internal.ads.zzccj r17, int r18, boolean r19, com.google.android.gms.internal.ads.zzbdk r20, com.google.android.gms.internal.ads.zzcci r21) {
            r15 = this;
            r0 = r15
            r8 = r16
            r7 = r18
            r9 = r20
            r15.<init>(r16)
            r10 = r17
            r0.zzb = r10
            r0.zze = r9
            android.widget.FrameLayout r11 = new android.widget.FrameLayout
            r11.<init>(r8)
            r0.zzc = r11
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r12 = -1
            r1.<init>(r12, r12)
            r15.addView(r11, r1)
            com.google.android.gms.ads.internal.zza r1 = r17.zzj()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.ads.internal.zza r1 = r17.zzj()
            com.google.android.gms.internal.ads.zzcbq r1 = r1.zza
            com.google.android.gms.internal.ads.zzcck r13 = new com.google.android.gms.internal.ads.zzcck
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r17.zzn()
            java.lang.String r4 = r17.zzdi()
            com.google.android.gms.internal.ads.zzbdh r6 = r17.zzk()
            r1 = r13
            r2 = r16
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = 3
            if (r7 != r1) goto L4c
            com.google.android.gms.internal.ads.zzcfd r1 = new com.google.android.gms.internal.ads.zzcfd
            r1.<init>(r8, r13)
            goto L8b
        L4c:
            r1 = 2
            if (r7 != r1) goto L63
            com.google.android.gms.internal.ads.zzcdb r14 = new com.google.android.gms.internal.ads.zzcdb
            boolean r6 = com.google.android.gms.internal.ads.zzcbq.zza(r17)
            r1 = r14
            r2 = r16
            r3 = r13
            r4 = r17
            r5 = r19
            r7 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L8b
        L63:
            com.google.android.gms.internal.ads.zzcbn r13 = new com.google.android.gms.internal.ads.zzcbn
            boolean r7 = com.google.android.gms.internal.ads.zzcbq.zza(r17)
            com.google.android.gms.internal.ads.zzcck r14 = new com.google.android.gms.internal.ads.zzcck
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r17.zzn()
            java.lang.String r4 = r17.zzdi()
            com.google.android.gms.internal.ads.zzbdh r6 = r17.zzk()
            r1 = r14
            r2 = r16
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = r13
            r3 = r17
            r4 = r19
            r5 = r7
            r6 = r21
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L8b:
            r0.zzg = r1
            android.view.View r2 = new android.view.View
            r2.<init>(r8)
            r0.zzd = r2
            r3 = 0
            r2.setBackgroundColor(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 17
            r3.<init>(r12, r12, r4)
            r11.addView(r1, r3)
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzM
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lbf
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r12, r12)
            r11.addView(r2, r3)
            r11.bringChildToFront(r2)
        Lbf:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzJ
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Ld4
            r15.zzn()
        Ld4:
            android.widget.ImageView r2 = new android.widget.ImageView
            r2.<init>(r8)
            r0.zzq = r2
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzO
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.zzf = r2
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzL
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.zzk = r2
            if (r9 == 0) goto L10e
            r3 = 1
            if (r3 == r2) goto L107
            java.lang.String r2 = "0"
            goto L109
        L107:
            java.lang.String r2 = "1"
        L109:
            java.lang.String r3 = "spinner_used"
            r9.zzd(r3, r2)
        L10e:
            com.google.android.gms.internal.ads.zzccl r2 = new com.google.android.gms.internal.ads.zzccl
            r2.<init>(r15)
            r0.zza = r2
            r1.zzr(r15)
            return
    }

    private final void zzJ() {
            r2 = this;
            com.google.android.gms.internal.ads.zzccj r0 = r2.zzb
            android.app.Activity r0 = r0.zzi()
            if (r0 != 0) goto L9
            goto L23
        L9:
            boolean r0 = r2.zzi
            if (r0 == 0) goto L23
            boolean r0 = r2.zzj
            if (r0 != 0) goto L23
            com.google.android.gms.internal.ads.zzccj r0 = r2.zzb
            android.app.Activity r0 = r0.zzi()
            android.view.Window r0 = r0.getWindow()
            r1 = 128(0x80, float:1.794E-43)
            r0.clearFlags(r1)
            r0 = 0
            r2.zzi = r0
        L23:
            return
    }

    private final void zzK(java.lang.String r6, java.lang.String... r7) {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Integer r1 = r5.zzl()
            if (r1 == 0) goto L14
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "playerId"
            r0.put(r2, r1)
        L14:
            java.lang.String r1 = "event"
            r0.put(r1, r6)
            int r6 = r7.length
            r1 = 0
            r2 = 0
            r3 = r2
        L1d:
            if (r1 >= r6) goto L2c
            r4 = r7[r1]
            if (r3 != 0) goto L25
            r3 = r4
            goto L29
        L25:
            r0.put(r3, r4)
            r3 = r2
        L29:
            int r1 = r1 + 1
            goto L1d
        L2c:
            com.google.android.gms.internal.ads.zzccj r6 = r5.zzb
            java.lang.String r7 = "onVideoEvent"
            r6.zzd(r7, r0)
            return
    }

    private final boolean zzL() {
            r1 = this;
            android.widget.ImageView r0 = r1.zzq
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    static /* bridge */ /* synthetic */ void zzm(com.google.android.gms.internal.ads.zzcbx r0, java.lang.String r1, java.lang.String[] r2) {
            r0.zzK(r1, r2)
            return
    }

    public final void finalize() throws java.lang.Throwable {
            r3 = this;
            com.google.android.gms.internal.ads.zzccl r0 = r3.zza     // Catch: java.lang.Throwable -> L17
            r0.zza()     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.zzcbp r0 = r3.zzg     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zze     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.zzcbr r2 = new com.google.android.gms.internal.ads.zzcbr     // Catch: java.lang.Throwable -> L17
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L17
            r1.execute(r2)     // Catch: java.lang.Throwable -> L17
        L13:
            super.finalize()
            return
        L17:
            r0 = move-exception
            super.finalize()
            throw r0
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean r3) {
            r2 = this;
            super.onWindowFocusChanged(r3)
            if (r3 == 0) goto Lb
            com.google.android.gms.internal.ads.zzccl r0 = r2.zza
            r0.zzb()
            goto L14
        Lb:
            com.google.android.gms.internal.ads.zzccl r0 = r2.zza
            r0.zza()
            long r0 = r2.zzl
            r2.zzm = r0
        L14:
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcbt r1 = new com.google.android.gms.internal.ads.zzcbt
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcbo
    public final void onWindowVisibilityChanged(int r3) {
            r2 = this;
            super.onWindowVisibilityChanged(r3)
            if (r3 != 0) goto Lc
            com.google.android.gms.internal.ads.zzccl r3 = r2.zza
            r3.zzb()
            r3 = 1
            goto L16
        Lc:
            com.google.android.gms.internal.ads.zzccl r3 = r2.zza
            r3.zza()
            long r0 = r2.zzl
            r2.zzm = r0
            r3 = 0
        L16:
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcbw r1 = new com.google.android.gms.internal.ads.zzcbw
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    public final void zzA(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r1.zzg
            if (r0 != 0) goto L5
            return
        L5:
            r0.zzz(r2)
            return
    }

    public final void zzB(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r1.zzg
            if (r0 != 0) goto L5
            return
        L5:
            r0.zzA(r2)
            return
    }

    public final void zzC(int r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzM
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1c
            android.widget.FrameLayout r0 = r2.zzc
            r0.setBackgroundColor(r3)
            android.view.View r0 = r2.zzd
            r0.setBackgroundColor(r3)
        L1c:
            return
    }

    public final void zzD(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r1.zzg
            if (r0 != 0) goto L5
            return
        L5:
            r0.zzB(r2)
            return
    }

    public final void zzE(java.lang.String r1, java.lang.String[] r2) {
            r0 = this;
            r0.zzn = r1
            r0.zzo = r2
            return
    }

    public final void zzF(int r3, int r4, int r5, int r6) {
            r2 = this;
            boolean r0 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r0 == 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Set video bounds to x:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ";y:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ";w:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ";h:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
        L32:
            if (r5 == 0) goto L48
            if (r6 != 0) goto L37
            goto L48
        L37:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r5, r6)
            r5 = 0
            r0.setMargins(r3, r4, r5, r5)
            android.widget.FrameLayout r3 = r2.zzc
            r3.setLayoutParams(r0)
            r2.requestLayout()
        L48:
            return
    }

    public final void zzG(float r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r2.zzg
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzccn r1 = r0.zzb
            r1.zze(r3)
            r0.zzn()
            return
    }

    public final void zzH(float r2, float r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r1.zzg
            if (r0 == 0) goto L7
            r0.zzu(r2, r3)
        L7:
            return
    }

    public final void zzI() {
            r3 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r3.zzg
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzccn r1 = r0.zzb
            r2 = 0
            r1.zzd(r2)
            r0.zzn()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbV
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            com.google.android.gms.internal.ads.zzccl r0 = r2.zza
            r0.zza()
        L17:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "ended"
            r2.zzK(r1, r0)
            r2.zzJ()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzb(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "what"
            r0[r1] = r2
            r1 = 1
            r0[r1] = r4
            r4 = 2
            java.lang.String r1 = "extra"
            r0[r4] = r1
            r4 = 3
            r0[r4] = r5
            java.lang.String r4 = "error"
            r3.zzK(r4, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzc(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r0 = 0
            java.lang.String r1 = "what"
            r3[r0] = r1
            r0 = 1
            java.lang.String r1 = "ExoPlayerAdapter exception"
            r3[r0] = r1
            r0 = 2
            java.lang.String r1 = "extra"
            r3[r0] = r1
            r0 = 3
            r3[r0] = r4
            java.lang.String r4 = "exception"
            r2.zzK(r4, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzd() {
            r3 = this;
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "pause"
            r3.zzK(r2, r1)
            r3.zzJ()
            r3.zzh = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zze() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbV
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            com.google.android.gms.internal.ads.zzccl r0 = r3.zza
            r0.zzb()
        L17:
            com.google.android.gms.internal.ads.zzccj r0 = r3.zzb
            android.app.Activity r0 = r0.zzi()
            r1 = 1
            if (r0 != 0) goto L21
            goto L50
        L21:
            boolean r0 = r3.zzi
            if (r0 != 0) goto L50
            com.google.android.gms.internal.ads.zzccj r0 = r3.zzb
            android.app.Activity r0 = r0.zzi()
            android.view.Window r0 = r0.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.flags
            r2 = 128(0x80, float:1.794E-43)
            r0 = r0 & r2
            if (r0 == 0) goto L3c
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            r3.zzj = r0
            if (r0 != 0) goto L50
            com.google.android.gms.internal.ads.zzccj r0 = r3.zzb
            android.app.Activity r0 = r0.zzi()
            android.view.Window r0 = r0.getWindow()
            r0.addFlags(r2)
            r3.zzi = r1
        L50:
            r3.zzh = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzf() {
            r7 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r7.zzg
            if (r0 != 0) goto L5
            goto L4b
        L5:
            long r1 = r7.zzm
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L4b
            int r0 = r0.zzc()
            float r0 = (float) r0
            r1 = 5
            com.google.android.gms.internal.ads.zzcbp r2 = r7.zzg
            int r3 = r2.zze()
            int r2 = r2.zzd()
            r4 = 6
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = 0
            java.lang.String r6 = "duration"
            r4[r5] = r6
            r5 = 1
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r6
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4[r5] = r0
            r0 = 2
            java.lang.String r5 = "videoWidth"
            r4[r0] = r5
            r0 = 3
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4[r0] = r3
            r0 = 4
            java.lang.String r3 = "videoHeight"
            r4[r0] = r3
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r4[r1] = r0
            java.lang.String r0 = "canplaythrough"
            r7.zzK(r0, r4)
        L4b:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzg() {
            r2 = this;
            android.view.View r0 = r2.zzd
            r1 = 4
            r0.setVisibility(r1)
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcbs r1 = new com.google.android.gms.internal.ads.zzcbs
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzh() {
            r2 = this;
            com.google.android.gms.internal.ads.zzccl r0 = r2.zza
            r0.zzb()
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcbu r1 = new com.google.android.gms.internal.ads.zzcbu
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzi() {
            r4 = this;
            boolean r0 = r4.zzr
            if (r0 == 0) goto L2e
            android.graphics.Bitmap r0 = r4.zzp
            if (r0 == 0) goto L2e
            boolean r0 = r4.zzL()
            if (r0 != 0) goto L2e
            android.widget.ImageView r0 = r4.zzq
            android.graphics.Bitmap r1 = r4.zzp
            r0.setImageBitmap(r1)
            android.widget.ImageView r0 = r4.zzq
            r0.invalidate()
            android.widget.FrameLayout r0 = r4.zzc
            android.widget.ImageView r1 = r4.zzq
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r0.addView(r1, r2)
            android.widget.FrameLayout r0 = r4.zzc
            android.widget.ImageView r1 = r4.zzq
            r0.bringChildToFront(r1)
        L2e:
            com.google.android.gms.internal.ads.zzccl r0 = r4.zza
            r0.zza()
            long r0 = r4.zzl
            r4.zzm = r0
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcbv r1 = new com.google.android.gms.internal.ads.zzcbv
            r1.<init>(r4)
            r0.post(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzj(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.zzk
            if (r0 != 0) goto L5
            goto L41
        L5:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzN
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r1.zza(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r4 = r4 / r1
            r1 = 1
            int r4 = java.lang.Math.max(r4, r1)
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r5 = r5 / r0
            int r5 = java.lang.Math.max(r5, r1)
            android.graphics.Bitmap r0 = r3.zzp
            if (r0 == 0) goto L42
            int r0 = r0.getWidth()
            if (r0 != r4) goto L42
            android.graphics.Bitmap r0 = r3.zzp
            int r0 = r0.getHeight()
            if (r0 == r5) goto L41
            goto L42
        L41:
            return
        L42:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r0)
            r3.zzp = r4
            r4 = 0
            r3.zzr = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzk() {
            r5 = this;
            boolean r0 = r5.zzh
            if (r0 == 0) goto L11
            boolean r0 = r5.zzL()
            if (r0 == 0) goto L11
            android.widget.FrameLayout r0 = r5.zzc
            android.widget.ImageView r1 = r5.zzq
            r0.removeView(r1)
        L11:
            com.google.android.gms.internal.ads.zzcbp r0 = r5.zzg
            if (r0 != 0) goto L16
            goto L75
        L16:
            android.graphics.Bitmap r0 = r5.zzp
            if (r0 == 0) goto L75
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.elapsedRealtime()
            com.google.android.gms.internal.ads.zzcbp r2 = r5.zzg
            android.graphics.Bitmap r3 = r5.zzp
            android.graphics.Bitmap r2 = r2.getBitmap(r3)
            if (r2 == 0) goto L2f
            r2 = 1
            r5.zzr = r2
        L2f:
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()
            long r2 = r2.elapsedRealtime()
            long r2 = r2 - r0
            boolean r0 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r0 == 0) goto L57
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Spinner frame grab took "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "ms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r0)
        L57:
            long r0 = r5.zzf
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L75
            java.lang.String r0 = "Spinner frame grab crossed jank threshold! Suspending spinner."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            r0 = 0
            r5.zzk = r0
            r0 = 0
            r5.zzp = r0
            com.google.android.gms.internal.ads.zzbdk r0 = r5.zze
            if (r0 == 0) goto L75
            java.lang.String r1 = java.lang.Long.toString(r2)
            java.lang.String r2 = "spinner_jank"
            r0.zzd(r2, r1)
        L75:
            return
    }

    public final java.lang.Integer zzl() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r1.zzg
            if (r0 == 0) goto L9
            java.lang.Integer r0 = r0.zzw()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final void zzn() {
            r5 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r5.zzg
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Context r0 = r0.getContext()
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            android.content.res.Resources r0 = r0.zze()
            if (r0 != 0) goto L1b
            java.lang.String r0 = "AdMob - "
            goto L21
        L1b:
            int r2 = com.google.android.gms.ads.impl.R.string.watermark_label_prefix
            java.lang.String r0 = r0.getString(r2)
        L21:
            com.google.android.gms.internal.ads.zzcbp r2 = r5.zzg
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r2.zzj()
            java.lang.String r0 = r0.concat(r2)
            r1.setText(r0)
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r1.setTextColor(r0)
            r0 = -256(0xffffffffffffff00, float:NaN)
            r1.setBackgroundColor(r0)
            android.widget.FrameLayout r0 = r5.zzc
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r4 = 17
            r2.<init>(r3, r3, r4)
            r0.addView(r1, r2)
            android.widget.FrameLayout r0 = r5.zzc
            r0.bringChildToFront(r1)
            return
    }

    public final void zzo() {
            r1 = this;
            com.google.android.gms.internal.ads.zzccl r0 = r1.zza
            r0.zza()
            com.google.android.gms.internal.ads.zzcbp r0 = r1.zzg
            if (r0 == 0) goto Lc
            r0.zzt()
        Lc:
            r1.zzJ()
            return
    }

    final /* synthetic */ void zzp() {
            r2 = this;
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "firstFrameRendered"
            r2.zzK(r1, r0)
            return
    }

    final /* synthetic */ void zzq(boolean r4) {
            r3 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "hasWindowFocus"
            r0[r1] = r2
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1 = 1
            r0[r1] = r4
            java.lang.String r4 = "windowFocusChanged"
            r3.zzK(r4, r0)
            return
    }

    public final void zzr(java.lang.Integer r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r3.zzg
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = r3.zzn
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L17
            com.google.android.gms.internal.ads.zzcbp r0 = r3.zzg
            java.lang.String r1 = r3.zzn
            java.lang.String[] r2 = r3.zzo
            r0.zzC(r1, r2, r4)
            return
        L17:
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r0 = "no_src"
            r3.zzK(r0, r4)
            return
    }

    public final void zzs() {
            r3 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r3.zzg
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzccn r1 = r0.zzb
            r2 = 1
            r1.zzd(r2)
            r0.zzn()
            return
    }

    final void zzt() {
            r9 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r9.zzg
            if (r0 != 0) goto L6
            goto Lb2
        L6:
            int r0 = r0.zza()
            long r0 = (long) r0
            long r2 = r9.zzl
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto Lb2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lb2
            float r2 = (float) r0
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzbT
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r4
            java.lang.String r4 = "timeupdate"
            r5 = 1
            java.lang.String r6 = "time"
            r7 = 0
            r8 = 2
            if (r3 == 0) goto La3
            r3 = 12
            java.lang.String[] r3 = new java.lang.String[r3]
            r3[r7] = r6
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3[r5] = r2
            java.lang.String r2 = "totalBytes"
            r3[r8] = r2
            r2 = 3
            com.google.android.gms.internal.ads.zzcbp r5 = r9.zzg
            long r5 = r5.zzh()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3[r2] = r5
            r2 = 4
            java.lang.String r5 = "qoeCachedBytes"
            r3[r2] = r5
            r2 = 5
            com.google.android.gms.internal.ads.zzcbp r5 = r9.zzg
            long r5 = r5.zzf()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3[r2] = r5
            r2 = 6
            java.lang.String r5 = "qoeLoadedBytes"
            r3[r2] = r5
            r2 = 7
            com.google.android.gms.internal.ads.zzcbp r5 = r9.zzg
            long r5 = r5.zzg()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3[r2] = r5
            r2 = 8
            java.lang.String r5 = "droppedFrames"
            r3[r2] = r5
            r2 = 9
            com.google.android.gms.internal.ads.zzcbp r5 = r9.zzg
            int r5 = r5.zzb()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3[r2] = r5
            r2 = 10
            java.lang.String r5 = "reportTime"
            r3[r2] = r5
            r2 = 11
            com.google.android.gms.common.util.Clock r5 = com.google.android.gms.ads.internal.zzu.zzB()
            long r5 = r5.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3[r2] = r5
            r9.zzK(r4, r3)
            goto Lb0
        La3:
            java.lang.String[] r3 = new java.lang.String[r8]
            r3[r7] = r6
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3[r5] = r2
            r9.zzK(r4, r3)
        Lb0:
            r9.zzl = r0
        Lb2:
            return
    }

    public final void zzu() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r1.zzg
            if (r0 != 0) goto L5
            return
        L5:
            r0.zzo()
            return
    }

    public final void zzv() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r1.zzg
            if (r0 != 0) goto L5
            return
        L5:
            r0.zzp()
            return
    }

    public final void zzw(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r1.zzg
            if (r0 != 0) goto L5
            return
        L5:
            r0.zzq(r2)
            return
    }

    public final void zzx(android.view.MotionEvent r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r1.zzg
            if (r0 != 0) goto L5
            return
        L5:
            r0.dispatchTouchEvent(r2)
            return
    }

    public final void zzy(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r1.zzg
            if (r0 != 0) goto L5
            return
        L5:
            r0.zzx(r2)
            return
    }

    public final void zzz(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r1.zzg
            if (r0 != 0) goto L5
            return
        L5:
            r0.zzy(r2)
            return
    }
}
