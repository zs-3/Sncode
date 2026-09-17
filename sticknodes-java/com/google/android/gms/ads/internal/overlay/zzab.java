package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzab extends com.google.android.gms.internal.ads.zzbtl {
    private final com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zza;
    private final android.app.Activity zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzab(android.app.Activity r2, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzc = r0
            r1.zzd = r0
            r1.zze = r0
            r1.zza = r3
            r1.zzb = r2
            return
    }

    private final synchronized void zzb() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzd     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L14
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r2.zza     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.ads.internal.overlay.zzr r0 = r0.zzc     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto Lf
            r1 = 4
            r0.zzdu(r1)     // Catch: java.lang.Throwable -> L16
        Lf:
            r0 = 1
            r2.zzd = r0     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            return
        L14:
            monitor-exit(r2)
            return
        L16:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final boolean zzH() throws android.os.RemoteException {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzh(int r1, int r2, android.content.Intent r3) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzi() throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper r1) throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzl(android.os.Bundle r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziv
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L1c
            boolean r0 = r3.zze
            if (r0 != 0) goto L1c
            android.app.Activity r0 = r3.zzb
            r0.requestWindowFeature(r1)
        L1c:
            r0 = 0
            if (r4 == 0) goto L28
            java.lang.String r2 = "com.google.android.gms.ads.internal.overlay.hasResumed"
            boolean r2 = r4.getBoolean(r2, r0)
            if (r2 == 0) goto L28
            r0 = 1
        L28:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r3.zza
            if (r2 != 0) goto L32
            android.app.Activity r4 = r3.zzb
            r4.finish()
            return
        L32:
            if (r0 == 0) goto L3a
            android.app.Activity r4 = r3.zzb
            r4.finish()
            return
        L3a:
            if (r4 != 0) goto L6b
            com.google.android.gms.ads.internal.client.zza r4 = r2.zzb
            if (r4 == 0) goto L43
            r4.onAdClicked()
        L43:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r3.zza
            com.google.android.gms.internal.ads.zzdga r4 = r4.zzu
            if (r4 == 0) goto L4c
            r4.zzdG()
        L4c:
            android.app.Activity r4 = r3.zzb
            android.content.Intent r4 = r4.getIntent()
            if (r4 == 0) goto L6b
            android.app.Activity r4 = r3.zzb
            android.content.Intent r4 = r4.getIntent()
            java.lang.String r0 = "shouldCallOnOverlayOpened"
            boolean r4 = r4.getBooleanExtra(r0, r1)
            if (r4 == 0) goto L6b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r3.zza
            com.google.android.gms.ads.internal.overlay.zzr r4 = r4.zzc
            if (r4 == 0) goto L6b
            r4.zzdr()
        L6b:
            android.app.Activity r4 = r3.zzb
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r3.zza
            com.google.android.gms.ads.internal.zzu.zzh()
            com.google.android.gms.ads.internal.overlay.zzc r1 = r0.zza
            com.google.android.gms.ads.internal.overlay.zzac r0 = r0.zzi
            com.google.android.gms.ads.internal.overlay.zzaa r2 = r1.zzi
            boolean r4 = com.google.android.gms.ads.internal.overlay.zza.zzb(r4, r1, r0, r2)
            if (r4 != 0) goto L83
            android.app.Activity r4 = r3.zzb
            r4.finish()
        L83:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzm() throws android.os.RemoteException {
            r1 = this;
            android.app.Activity r0 = r1.zzb
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto Lb
            r1.zzb()
        Lb:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzo() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zza
            com.google.android.gms.ads.internal.overlay.zzr r0 = r0.zzc
            if (r0 == 0) goto L9
            r0.zzdk()
        L9:
            android.app.Activity r0 = r1.zzb
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L14
            r1.zzb()
        L14:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzp(int r1, java.lang.String[] r2, int[] r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzq() throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzr() throws android.os.RemoteException {
            r1 = this;
            boolean r0 = r1.zzc
            if (r0 == 0) goto La
            android.app.Activity r0 = r1.zzb
            r0.finish()
            return
        La:
            r0 = 1
            r1.zzc = r0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zza
            com.google.android.gms.ads.internal.overlay.zzr r0 = r0.zzc
            if (r0 == 0) goto L16
            r0.zzdH()
        L16:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzs(android.os.Bundle r3) throws android.os.RemoteException {
            r2 = this;
            boolean r0 = r2.zzc
            java.lang.String r1 = "com.google.android.gms.ads.internal.overlay.hasResumed"
            r3.putBoolean(r1, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzt() throws android.os.RemoteException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzu() throws android.os.RemoteException {
            r1 = this;
            android.app.Activity r0 = r1.zzb
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto Lb
            r1.zzb()
        Lb:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzv() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.zza
            com.google.android.gms.ads.internal.overlay.zzr r0 = r0.zzc
            if (r0 == 0) goto L9
            r0.zzdt()
        L9:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzx() throws android.os.RemoteException {
            r1 = this;
            r0 = 1
            r1.zze = r0
            return
    }
}
