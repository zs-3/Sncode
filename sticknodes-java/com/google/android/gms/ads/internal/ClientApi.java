package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class ClientApi extends com.google.android.gms.ads.internal.client.zzco {
    @com.google.android.gms.common.annotation.KeepForSdk
    public ClientApi() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzbu zzb(com.google.android.gms.dynamic.IObjectWrapper r1, java.lang.String r2, com.google.android.gms.internal.ads.zzbpl r3, int r4) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.zzcho r3 = com.google.android.gms.internal.ads.zzcho.zzb(r1, r3, r4)
            com.google.android.gms.internal.ads.zzene r4 = new com.google.android.gms.internal.ads.zzene
            r4.<init>(r3, r1, r2)
            return r4
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzby zzc(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.ads.internal.client.zzs r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbpl r4, int r5) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.zzcho r2 = com.google.android.gms.internal.ads.zzcho.zzb(r1, r4, r5)
            com.google.android.gms.internal.ads.zzfbh r2 = r2.zzt()
            r2.zza(r3)
            r2.zzb(r1)
            com.google.android.gms.internal.ads.zzfbi r1 = r2.zzc()
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzfg
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r5 < r2) goto L2f
            com.google.android.gms.internal.ads.zzfcn r1 = r1.zza()
            return r1
        L2f:
            com.google.android.gms.ads.internal.client.zzfl r1 = new com.google.android.gms.ads.internal.client.zzfl
            r1.<init>()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzby zzd(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.ads.internal.client.zzs r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbpl r4, int r5) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.zzcho r4 = com.google.android.gms.internal.ads.zzcho.zzb(r1, r4, r5)
            com.google.android.gms.internal.ads.zzfcv r4 = r4.zzu()
            r4.zzc(r1)
            r4.zza(r2)
            r4.zzb(r3)
            com.google.android.gms.internal.ads.zzfcw r1 = r4.zzd()
            com.google.android.gms.internal.ads.zzenh r1 = r1.zza()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzby zze(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.ads.internal.client.zzs r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbpl r4, int r5) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.zzcho r4 = com.google.android.gms.internal.ads.zzcho.zzb(r1, r4, r5)
            com.google.android.gms.internal.ads.zzfem r4 = r4.zzv()
            r4.zzc(r1)
            r4.zza(r2)
            r4.zzb(r3)
            com.google.android.gms.internal.ads.zzfen r1 = r4.zzd()
            com.google.android.gms.internal.ads.zzeoj r1 = r1.zza()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzby zzf(com.google.android.gms.dynamic.IObjectWrapper r5, com.google.android.gms.ads.internal.client.zzs r6, java.lang.String r7, int r8) {
            r4 = this;
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)
            android.content.Context r5 = (android.content.Context) r5
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r2 = 1
            r3 = 0
            r0.<init>(r1, r8, r2, r3)
            com.google.android.gms.ads.internal.zzt r8 = new com.google.android.gms.ads.internal.zzt
            r8.<init>(r5, r6, r7, r0)
            return r8
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzci zzg(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.ads.zzbpl r2, int r3) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.zzcho r1 = com.google.android.gms.internal.ads.zzcho.zzb(r1, r2, r3)
            com.google.android.gms.internal.ads.zzfnp r1 = r1.zzA()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzcz zzh(com.google.android.gms.dynamic.IObjectWrapper r2, int r3) {
            r1 = this;
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.content.Context r2 = (android.content.Context) r2
            r0 = 0
            com.google.android.gms.internal.ads.zzcho r2 = com.google.android.gms.internal.ads.zzcho.zzb(r2, r0, r3)
            com.google.android.gms.internal.ads.zzcmd r2 = r2.zzc()
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.ads.internal.client.zzdu zzi(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.ads.zzbpl r2, int r3) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.zzcho r1 = com.google.android.gms.internal.ads.zzcho.zzb(r1, r2, r3)
            com.google.android.gms.internal.ads.zzdxy r1 = r1.zzm()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbgg zzj(com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.dynamic.IObjectWrapper r4) {
            r2 = this;
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            com.google.android.gms.internal.ads.zzdll r0 = new com.google.android.gms.internal.ads.zzdll
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r0.<init>(r3, r4, r1)
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbgm zzk(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.dynamic.IObjectWrapper r4) {
            r1 = this;
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)
            java.util.HashMap r4 = (java.util.HashMap) r4
            com.google.android.gms.internal.ads.zzdlj r0 = new com.google.android.gms.internal.ads.zzdlj
            r0.<init>(r2, r3, r4)
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbky zzl(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.ads.zzbpl r2, int r3, com.google.android.gms.internal.ads.zzbkv r4) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.zzcho r2 = com.google.android.gms.internal.ads.zzcho.zzb(r1, r2, r3)
            com.google.android.gms.internal.ads.zzdvm r2 = r2.zzk()
            r2.zzb(r1)
            r2.zza(r4)
            com.google.android.gms.internal.ads.zzdvn r1 = r2.zzc()
            com.google.android.gms.internal.ads.zzdvk r1 = r1.zzd()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbtf zzm(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.ads.zzbpl r2, int r3) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.zzcho r1 = com.google.android.gms.internal.ads.zzcho.zzb(r1, r2, r3)
            com.google.android.gms.internal.ads.zzefj r1 = r1.zzn()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbtm zzn(com.google.android.gms.dynamic.IObjectWrapper r4) {
            r3 = this;
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)
            android.app.Activity r4 = (android.app.Activity) r4
            android.content.Intent r0 = r4.getIntent()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzb(r0)
            if (r0 != 0) goto L16
            com.google.android.gms.ads.internal.overlay.zzw r0 = new com.google.android.gms.ads.internal.overlay.zzw
            r0.<init>(r4)
            goto L4b
        L16:
            int r1 = r0.zzk
            r2 = 1
            if (r1 == r2) goto L46
            r2 = 2
            if (r1 == r2) goto L40
            r2 = 3
            if (r1 == r2) goto L3a
            r2 = 4
            if (r1 == r2) goto L33
            r0 = 5
            if (r1 == r0) goto L2d
            com.google.android.gms.ads.internal.overlay.zzw r0 = new com.google.android.gms.ads.internal.overlay.zzw
            r0.<init>(r4)
            goto L4b
        L2d:
            com.google.android.gms.ads.internal.overlay.zzaf r0 = new com.google.android.gms.ads.internal.overlay.zzaf
            r0.<init>(r4)
            goto L4b
        L33:
            com.google.android.gms.ads.internal.overlay.zzab r1 = new com.google.android.gms.ads.internal.overlay.zzab
            r1.<init>(r4, r0)
            r0 = r1
            goto L4b
        L3a:
            com.google.android.gms.ads.internal.overlay.zzai r0 = new com.google.android.gms.ads.internal.overlay.zzai
            r0.<init>(r4)
            goto L4b
        L40:
            com.google.android.gms.ads.internal.overlay.zzah r0 = new com.google.android.gms.ads.internal.overlay.zzah
            r0.<init>(r4)
            goto L4b
        L46:
            com.google.android.gms.ads.internal.overlay.zzv r0 = new com.google.android.gms.ads.internal.overlay.zzv
            r0.<init>(r4)
        L4b:
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbwp zzo(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.ads.zzbpl r2, int r3) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.zzcho r2 = com.google.android.gms.internal.ads.zzcho.zzb(r1, r2, r3)
            com.google.android.gms.internal.ads.zzfga r2 = r2.zzw()
            r2.zzb(r1)
            com.google.android.gms.internal.ads.zzfgb r1 = r2.zzc()
            com.google.android.gms.internal.ads.zzfge r1 = r1.zzb()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbxf zzp(com.google.android.gms.dynamic.IObjectWrapper r1, java.lang.String r2, com.google.android.gms.internal.ads.zzbpl r3, int r4) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.zzcho r3 = com.google.android.gms.internal.ads.zzcho.zzb(r1, r3, r4)
            com.google.android.gms.internal.ads.zzfga r3 = r3.zzw()
            r3.zzb(r1)
            r3.zza(r2)
            com.google.android.gms.internal.ads.zzfgb r1 = r3.zzc()
            com.google.android.gms.internal.ads.zzffy r1 = r1.zza()
            return r1
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final com.google.android.gms.internal.ads.zzbzl zzq(com.google.android.gms.dynamic.IObjectWrapper r1, com.google.android.gms.internal.ads.zzbpl r2, int r3) {
            r0 = this;
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.zzcho r1 = com.google.android.gms.internal.ads.zzcho.zzb(r1, r2, r3)
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r1 = r1.zzq()
            return r1
    }
}
