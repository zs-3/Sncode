package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzjv implements android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener, com.google.android.gms.internal.ads.zzabq, com.google.android.gms.internal.ads.zzpr, com.google.android.gms.internal.ads.zzxb, com.google.android.gms.internal.ads.zztw, com.google.android.gms.internal.ads.zzhx, com.google.android.gms.internal.ads.zzht {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ com.google.android.gms.internal.ads.zzjz zza;

    /* synthetic */ zzjv(com.google.android.gms.internal.ads.zzjz r1, com.google.android.gms.internal.ads.zzju r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r2, int r3, int r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzjz.zzK(r0, r2)
            com.google.android.gms.internal.ads.zzjz r2 = r1.zza
            com.google.android.gms.internal.ads.zzjz.zzI(r2, r3, r4)
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r2 = r1.zza
            r0 = 0
            com.google.android.gms.internal.ads.zzjz.zzL(r2, r0)
            com.google.android.gms.internal.ads.zzjz r2 = r1.zza
            r0 = 0
            com.google.android.gms.internal.ads.zzjz.zzI(r2, r0, r0)
            r2 = 1
            return r2
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture r1, int r2, int r3) {
            r0 = this;
            com.google.android.gms.internal.ads.zzjz r1 = r0.zza
            com.google.android.gms.internal.ads.zzjz.zzI(r1, r2, r3)
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r1) {
            r0 = this;
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder r1, int r2, int r3, int r4) {
            r0 = this;
            com.google.android.gms.internal.ads.zzjz r1 = r0.zza
            com.google.android.gms.internal.ads.zzjz.zzI(r1, r3, r4)
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder r1) {
            r0 = this;
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r2 = r1.zza
            r0 = 0
            com.google.android.gms.internal.ads.zzjz.zzI(r2, r0, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zza(java.lang.Exception r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzv(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzb(java.lang.String r8, long r9, long r11) {
            r7 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r7.zza
            com.google.android.gms.internal.ads.zzma r1 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r2 = r8
            r3 = r9
            r5 = r11
            r1.zzw(r2, r3, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzc(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzx(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzd(com.google.android.gms.internal.ads.zzia r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzy(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(com.google.android.gms.internal.ads.zzia r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzz(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzf(com.google.android.gms.internal.ads.zzaf r2, com.google.android.gms.internal.ads.zzib r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzA(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzB(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzh(java.lang.Exception r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzC(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzi(com.google.android.gms.internal.ads.zzps r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzD(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzj(com.google.android.gms.internal.ads.zzps r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzE(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzk(int r8, long r9, long r11) {
            r7 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r7.zza
            com.google.android.gms.internal.ads.zzma r1 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r2 = r8
            r3 = r9
            r5 = r11
            r1.zzF(r2, r3, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzl(int r2, long r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzG(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzm(java.lang.Object r2, long r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzH(r2, r3)
            com.google.android.gms.internal.ads.zzjz r3 = r1.zza
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzjz.zzG(r3)
            if (r4 != r2) goto L22
            com.google.android.gms.internal.ads.zzdz r2 = com.google.android.gms.internal.ads.zzjz.zzD(r3)
            r3 = 26
            com.google.android.gms.internal.ads.zzjt r4 = new com.google.android.gms.internal.ads.zzjt
            r4.<init>()
            r2.zzd(r3, r4)
            r2.zzc()
        L22:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzn(boolean r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r3.zza
            boolean r1 = com.google.android.gms.internal.ads.zzjz.zzQ(r0)
            if (r1 != r4) goto L9
            return
        L9:
            com.google.android.gms.internal.ads.zzjz.zzH(r0, r4)
            com.google.android.gms.internal.ads.zzjz r0 = r3.zza
            com.google.android.gms.internal.ads.zzdz r0 = com.google.android.gms.internal.ads.zzjz.zzD(r0)
            r1 = 23
            com.google.android.gms.internal.ads.zzjr r2 = new com.google.android.gms.internal.ads.zzjr
            r2.<init>(r4)
            r0.zzd(r1, r2)
            r0.zzc()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzo(java.lang.Exception r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzI(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzp(java.lang.String r8, long r9, long r11) {
            r7 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r7.zza
            com.google.android.gms.internal.ads.zzma r1 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r2 = r8
            r3 = r9
            r5 = r11
            r1.zzJ(r2, r3, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzq(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzK(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzr(com.google.android.gms.internal.ads.zzia r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzL(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzs(com.google.android.gms.internal.ads.zzia r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzM(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzt(long r2, int r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzN(r2, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzu(com.google.android.gms.internal.ads.zzaf r2, com.google.android.gms.internal.ads.zzib r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r1.zza
            com.google.android.gms.internal.ads.zzma r0 = com.google.android.gms.internal.ads.zzjz.zzF(r0)
            r0.zzO(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzv(com.google.android.gms.internal.ads.zzcp r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzjz r0 = r2.zza
            com.google.android.gms.internal.ads.zzdz r0 = com.google.android.gms.internal.ads.zzjz.zzD(r0)
            com.google.android.gms.internal.ads.zzjs r1 = new com.google.android.gms.internal.ads.zzjs
            r1.<init>(r3)
            r3 = 25
            r0.zzd(r3, r1)
            r0.zzc()
            return
    }
}
