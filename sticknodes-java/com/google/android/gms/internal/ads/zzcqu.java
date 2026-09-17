package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcqu extends com.google.android.gms.internal.ads.zzcqr {
    private final android.content.Context zzc;
    private final android.view.View zzd;
    private final com.google.android.gms.internal.ads.zzcfo zze;
    private final com.google.android.gms.internal.ads.zzfgi zzf;
    private final com.google.android.gms.internal.ads.zzctc zzg;
    private final com.google.android.gms.internal.ads.zzdla zzh;
    private final com.google.android.gms.internal.ads.zzdgc zzi;
    private final com.google.android.gms.internal.ads.zzhic zzj;
    private final java.util.concurrent.Executor zzk;
    private com.google.android.gms.ads.internal.client.zzs zzl;

    zzcqu(com.google.android.gms.internal.ads.zzctd r1, android.content.Context r2, com.google.android.gms.internal.ads.zzfgi r3, android.view.View r4, com.google.android.gms.internal.ads.zzcfo r5, com.google.android.gms.internal.ads.zzctc r6, com.google.android.gms.internal.ads.zzdla r7, com.google.android.gms.internal.ads.zzdgc r8, com.google.android.gms.internal.ads.zzhic r9, java.util.concurrent.Executor r10) {
            r0 = this;
            r0.<init>(r1)
            r0.zzc = r2
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r3
            r0.zzg = r6
            r0.zzh = r7
            r0.zzi = r8
            r0.zzj = r9
            r0.zzk = r10
            return
    }

    public static /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzcqu r2) {
            com.google.android.gms.internal.ads.zzdla r0 = r2.zzh
            com.google.android.gms.internal.ads.zzbhn r1 = r0.zze()
            if (r1 != 0) goto L9
            return
        L9:
            com.google.android.gms.internal.ads.zzbhn r0 = r0.zze()     // Catch: android.os.RemoteException -> L1f
            com.google.android.gms.internal.ads.zzhic r1 = r2.zzj     // Catch: android.os.RemoteException -> L1f
            java.lang.Object r1 = r1.zzb()     // Catch: android.os.RemoteException -> L1f
            com.google.android.gms.ads.internal.client.zzby r1 = (com.google.android.gms.ads.internal.client.zzby) r1     // Catch: android.os.RemoteException -> L1f
            android.content.Context r2 = r2.zzc     // Catch: android.os.RemoteException -> L1f
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L1f
            r0.zze(r1, r2)     // Catch: android.os.RemoteException -> L1f
            return
        L1f:
            r2 = move-exception
            java.lang.String r0 = "RemoteException when notifyAdLoad is called"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final int zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfgt r0 = r1.zza
            com.google.android.gms.internal.ads.zzfgs r0 = r0.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            int r0 = r0.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final int zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhw
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2c
            com.google.android.gms.internal.ads.zzfgh r0 = r2.zzb
            boolean r0 = r0.zzag
            if (r0 == 0) goto L2c
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhx
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2c
            r0 = 0
            return r0
        L2c:
            com.google.android.gms.internal.ads.zzfgt r0 = r2.zza
            com.google.android.gms.internal.ads.zzfgs r0 = r0.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            int r0 = r0.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final android.view.View zzd() {
            r1 = this;
            android.view.View r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzctc r0 = r1.zzg     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zza()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final com.google.android.gms.internal.ads.zzfgi zzf() {
            r4 = this;
            com.google.android.gms.ads.internal.client.zzs r0 = r4.zzl
            if (r0 == 0) goto L9
            com.google.android.gms.internal.ads.zzfgi r0 = com.google.android.gms.internal.ads.zzfhi.zzb(r0)
            return r0
        L9:
            com.google.android.gms.internal.ads.zzfgh r0 = r4.zzb
            boolean r1 = r0.zzac
            r2 = 0
            if (r1 == 0) goto L3d
            java.util.List r0 = r0.zza
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L16
            java.lang.String r3 = "FirstParty"
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L16
            goto L3d
        L2d:
            android.view.View r0 = r4.zzd
            com.google.android.gms.internal.ads.zzfgi r1 = new com.google.android.gms.internal.ads.zzfgi
            int r3 = r0.getWidth()
            int r0 = r0.getHeight()
            r1.<init>(r3, r0, r2)
            return r1
        L3d:
            com.google.android.gms.internal.ads.zzfgh r0 = r4.zzb
            java.util.List r0 = r0.zzr
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.zzfgi r0 = (com.google.android.gms.internal.ads.zzfgi) r0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final com.google.android.gms.internal.ads.zzfgi zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfgi r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final void zzh() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdgc r0 = r1.zzi
            r0.zza()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final void zzi(android.view.ViewGroup r3, com.google.android.gms.ads.internal.client.zzs r4) {
            r2 = this;
            if (r3 == 0) goto L19
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zze
            if (r0 == 0) goto L19
            com.google.android.gms.internal.ads.zzchi r1 = com.google.android.gms.internal.ads.zzchi.zzc(r4)
            r0.zzaj(r1)
            int r0 = r4.zzc
            r3.setMinimumHeight(r0)
            int r0 = r4.zzf
            r3.setMinimumWidth(r0)
            r2.zzl = r4
        L19:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcte
    public final void zzk() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcqt r0 = new com.google.android.gms.internal.ads.zzcqt
            r0.<init>(r2)
            java.util.concurrent.Executor r1 = r2.zzk
            r1.execute(r0)
            super.zzk()
            return
    }
}
