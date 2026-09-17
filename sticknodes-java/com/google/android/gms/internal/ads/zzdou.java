package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdou extends com.google.android.gms.internal.ads.zzbmi implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, com.google.android.gms.internal.ads.zzbfo {
    private android.view.View zza;
    private com.google.android.gms.ads.internal.client.zzeb zzb;
    private com.google.android.gms.internal.ads.zzdkk zzc;
    private boolean zzd;
    private boolean zze;

    public zzdou(com.google.android.gms.internal.ads.zzdkk r2, com.google.android.gms.internal.ads.zzdkp r3) {
            r1 = this;
            r1.<init>()
            android.view.View r0 = r3.zzf()
            r1.zza = r0
            com.google.android.gms.ads.internal.client.zzeb r0 = r3.zzj()
            r1.zzb = r0
            r1.zzc = r2
            r2 = 0
            r1.zzd = r2
            r1.zze = r2
            com.google.android.gms.internal.ads.zzcfo r2 = r3.zzs()
            if (r2 == 0) goto L23
            com.google.android.gms.internal.ads.zzcfo r2 = r3.zzs()
            r2.zzap(r1)
        L23:
            return
    }

    private final void zzg() {
            r5 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r5.zzc
            if (r0 == 0) goto L19
            android.view.View r1 = r5.zza
            if (r1 == 0) goto L19
            java.util.Map r2 = java.util.Collections.emptyMap()
            java.util.Map r3 = java.util.Collections.emptyMap()
            android.view.View r4 = r5.zza
            boolean r4 = com.google.android.gms.internal.ads.zzdkk.zzY(r4)
            r0.zzB(r1, r2, r3, r4)
        L19:
            return
    }

    private final void zzh() {
            r2 = this;
            android.view.View r0 = r2.zza
            if (r0 != 0) goto L5
            goto L14
        L5:
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L14
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r2.zza
            r0.removeView(r1)
        L14:
            return
    }

    private static final void zzi(com.google.android.gms.internal.ads.zzbmm r0, int r1) {
            r0.zze(r1)     // Catch: android.os.RemoteException -> L4
            return
        L4:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r0 = this;
            r0.zzg()
            return
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
            r0 = this;
            r0.zzg()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final com.google.android.gms.ads.internal.client.zzeb zzb() throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            boolean r0 = r1.zzd
            if (r0 == 0) goto L10
            java.lang.String r0 = "getVideoController: Instream ad should not be used after destroyed"
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)
            r0 = 0
            return r0
        L10:
            com.google.android.gms.ads.internal.client.zzeb r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final com.google.android.gms.internal.ads.zzbfz zzc() {
            r3 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            boolean r0 = r3.zzd
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r0 = "getVideoController: Instream ad should not be used after destroyed"
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)
            return r1
        L10:
            com.google.android.gms.internal.ads.zzdkk r0 = r3.zzc
            if (r0 == 0) goto L23
            com.google.android.gms.internal.ads.zzdkm r2 = r0.zzc()
            if (r2 == 0) goto L23
            com.google.android.gms.internal.ads.zzdkm r0 = r0.zzc()
            com.google.android.gms.internal.ads.zzbfz r0 = r0.zza()
            return r0
        L23:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zzd() throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            r1.zzh()
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzc
            if (r0 == 0) goto Lf
            r0.zzb()
        Lf:
            r0 = 0
            r1.zzc = r0
            r1.zza = r0
            r1.zzb = r0
            r0 = 1
            r1.zzd = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
            r1 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            com.google.android.gms.internal.ads.zzdot r0 = new com.google.android.gms.internal.ads.zzdot
            r0.<init>(r1)
            r1.zzf(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper r4, com.google.android.gms.internal.ads.zzbmm r5) throws android.os.RemoteException {
            r3 = this;
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            boolean r0 = r3.zzd
            if (r0 == 0) goto L13
            java.lang.String r4 = "Instream ad can not be shown after destroy()."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r4)
            r4 = 2
            zzi(r5, r4)
            return
        L13:
            android.view.View r0 = r3.zza
            if (r0 == 0) goto L5e
            com.google.android.gms.ads.internal.client.zzeb r1 = r3.zzb
            if (r1 != 0) goto L1c
            goto L5e
        L1c:
            boolean r0 = r3.zze
            r1 = 1
            if (r0 == 0) goto L2a
            java.lang.String r4 = "Instream ad should not be used again."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r4)
            zzi(r5, r1)
            return
        L2a:
            r3.zze = r1
            r3.zzh()
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r0 = r3.zza
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r4.addView(r0, r1)
            com.google.android.gms.ads.internal.zzu.zzx()
            android.view.View r4 = r3.zza
            com.google.android.gms.internal.ads.zzcba.zza(r4, r3)
            com.google.android.gms.ads.internal.zzu.zzx()
            android.view.View r4 = r3.zza
            com.google.android.gms.internal.ads.zzcba.zzb(r4, r3)
            r3.zzg()
            r5.zzf()     // Catch: android.os.RemoteException -> L57
            return
        L57:
            r4 = move-exception
            java.lang.String r5 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r5, r4)
            return
        L5e:
            if (r0 != 0) goto L63
            java.lang.String r4 = "can not get video view."
            goto L65
        L63:
            java.lang.String r4 = "can not get video controller."
        L65:
            java.lang.String r0 = "Instream internal error: "
            java.lang.String r4 = r0.concat(r4)
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r4)
            r4 = 0
            zzi(r5, r4)
            return
    }
}
