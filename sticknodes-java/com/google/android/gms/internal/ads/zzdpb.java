package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdpb extends com.google.android.gms.internal.ads.zzbgv {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdkp zzb;
    private com.google.android.gms.internal.ads.zzdlp zzc;
    private com.google.android.gms.internal.ads.zzdkk zzd;

    public zzdpb(android.content.Context r1, com.google.android.gms.internal.ads.zzdkp r2, com.google.android.gms.internal.ads.zzdlp r3, com.google.android.gms.internal.ads.zzdkk r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdkk zzc(com.google.android.gms.internal.ads.zzdpb r0) {
            com.google.android.gms.internal.ads.zzdkk r0 = r0.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzb
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzj()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final com.google.android.gms.internal.ads.zzbfz zzf() throws android.os.RemoteException {
            r3 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r3.zzd     // Catch: java.lang.NullPointerException -> Lb
            com.google.android.gms.internal.ads.zzdkm r0 = r0.zzc()     // Catch: java.lang.NullPointerException -> Lb
            com.google.android.gms.internal.ads.zzbfz r0 = r0.zza()     // Catch: java.lang.NullPointerException -> Lb
            return r0
        Lb:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "InternalNativeCustomTemplateAdShim.getMediaContent"
            r1.zzw(r0, r2)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final com.google.android.gms.internal.ads.zzbgc zzg(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzb
            androidx.collection.SimpleArrayMap r0 = r0.zzh()
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.ads.zzbgc r2 = (com.google.android.gms.internal.ads.zzbgc) r2
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final com.google.android.gms.dynamic.IObjectWrapper zzh() {
            r1 = this;
            android.content.Context r0 = r1.zza
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final java.lang.String zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzb
            java.lang.String r0 = r0.zzA()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final java.lang.String zzj(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzb
            androidx.collection.SimpleArrayMap r0 = r0.zzi()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final java.util.List zzk() {
            r7 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r7.zzb     // Catch: java.lang.NullPointerException -> L45
            androidx.collection.SimpleArrayMap r0 = r0.zzh()     // Catch: java.lang.NullPointerException -> L45
            com.google.android.gms.internal.ads.zzdkp r1 = r7.zzb     // Catch: java.lang.NullPointerException -> L45
            androidx.collection.SimpleArrayMap r1 = r1.zzi()     // Catch: java.lang.NullPointerException -> L45
            int r2 = r0.size()     // Catch: java.lang.NullPointerException -> L45
            int r3 = r1.size()     // Catch: java.lang.NullPointerException -> L45
            int r2 = r2 + r3
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.NullPointerException -> L45
            r3 = 0
            r4 = 0
            r5 = 0
        L1a:
            int r6 = r0.size()     // Catch: java.lang.NullPointerException -> L45
            if (r4 >= r6) goto L2d
            java.lang.Object r6 = r0.keyAt(r4)     // Catch: java.lang.NullPointerException -> L45
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.NullPointerException -> L45
            r2[r5] = r6     // Catch: java.lang.NullPointerException -> L45
            int r5 = r5 + 1
            int r4 = r4 + 1
            goto L1a
        L2d:
            int r0 = r1.size()     // Catch: java.lang.NullPointerException -> L45
            if (r3 >= r0) goto L40
            java.lang.Object r0 = r1.keyAt(r3)     // Catch: java.lang.NullPointerException -> L45
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NullPointerException -> L45
            r2[r5] = r0     // Catch: java.lang.NullPointerException -> L45
            int r5 = r5 + 1
            int r3 = r3 + 1
            goto L2d
        L40:
            java.util.List r0 = java.util.Arrays.asList(r2)     // Catch: java.lang.NullPointerException -> L45
            return r0
        L45:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "InternalNativeCustomTemplateAdShim.getAvailableAssetNames"
            r1.zzw(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zzl() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzd
            if (r0 == 0) goto L7
            r0.zzb()
        L7:
            r0 = 0
            r1.zzd = r0
            r1.zzc = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zzm() {
            r3 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r3.zzb     // Catch: java.lang.NullPointerException -> L29
            java.lang.String r0 = r0.zzC()     // Catch: java.lang.NullPointerException -> L29
            java.lang.String r1 = "Google"
            boolean r1 = java.util.Objects.equals(r0, r1)     // Catch: java.lang.NullPointerException -> L29
            if (r1 == 0) goto L14
            java.lang.String r0 = "Illegal argument specified for omid partner name."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.NullPointerException -> L29
            return
        L14:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.NullPointerException -> L29
            if (r1 == 0) goto L20
            java.lang.String r0 = "Not starting OMID session. OM partner name has not been configured."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.NullPointerException -> L29
            return
        L20:
            com.google.android.gms.internal.ads.zzdkk r1 = r3.zzd     // Catch: java.lang.NullPointerException -> L29
            if (r1 == 0) goto L28
            r2 = 0
            r1.zzf(r0, r2)     // Catch: java.lang.NullPointerException -> L29
        L28:
            return
        L29:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement"
            r1.zzw(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zzn(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzd
            if (r0 == 0) goto L7
            r0.zzF(r2)
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zzo() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzd
            if (r0 == 0) goto L7
            r0.zzJ()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zzp(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            boolean r0 = r2 instanceof android.view.View
            if (r0 != 0) goto L9
            goto L1a
        L9:
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zzb
            com.google.android.gms.internal.ads.zzegf r0 = r0.zzu()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zzd
            if (r0 == 0) goto L1a
            android.view.View r2 = (android.view.View) r2
            r0.zzK(r2)
        L1a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final boolean zzq() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r2.zzd
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r0 = r0.zzX()
            if (r0 == 0) goto Lc
            goto Ld
        Lc:
            return r1
        Ld:
            com.google.android.gms.internal.ads.zzdkp r0 = r2.zzb
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzr()
            if (r0 != 0) goto L16
            return r1
        L16:
            com.google.android.gms.internal.ads.zzdkp r0 = r2.zzb
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzs()
            if (r0 == 0) goto L1f
            return r1
        L1f:
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final boolean zzr(com.google.android.gms.dynamic.IObjectWrapper r3) {
            r2 = this;
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 != 0) goto L9
            goto L27
        L9:
            com.google.android.gms.internal.ads.zzdlp r0 = r2.zzc
            if (r0 == 0) goto L27
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            boolean r3 = r0.zzf(r3)
            if (r3 == 0) goto L27
            com.google.android.gms.internal.ads.zzdkp r3 = r2.zzb
            com.google.android.gms.internal.ads.zzcfo r3 = r3.zzq()
            com.google.android.gms.internal.ads.zzdpa r0 = new com.google.android.gms.internal.ads.zzdpa
            java.lang.String r1 = "_videoMediaView"
            r0.<init>(r2, r1)
            r3.zzar(r0)
            r3 = 1
            return r3
        L27:
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final boolean zzs(com.google.android.gms.dynamic.IObjectWrapper r3) {
            r2 = this;
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 != 0) goto L9
            goto L27
        L9:
            com.google.android.gms.internal.ads.zzdlp r0 = r2.zzc
            if (r0 == 0) goto L27
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            boolean r3 = r0.zzg(r3)
            if (r3 == 0) goto L27
            com.google.android.gms.internal.ads.zzdkp r3 = r2.zzb
            com.google.android.gms.internal.ads.zzcfo r3 = r3.zzs()
            com.google.android.gms.internal.ads.zzdpa r0 = new com.google.android.gms.internal.ads.zzdpa
            java.lang.String r1 = "_videoMediaView"
            r0.<init>(r2, r1)
            r3.zzar(r0)
            r3 = 1
            return r3
        L27:
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final boolean zzt() {
            r3 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r3.zzb
            com.google.android.gms.internal.ads.zzegf r0 = r0.zzu()
            if (r0 == 0) goto L2d
            com.google.android.gms.internal.ads.zzega r1 = com.google.android.gms.ads.internal.zzu.zzA()
            com.google.android.gms.internal.ads.zzfoi r0 = r0.zza()
            r1.zzk(r0)
            com.google.android.gms.internal.ads.zzdkp r0 = r3.zzb
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzr()
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzdkp r0 = r3.zzb
            com.google.android.gms.internal.ads.zzcfo r0 = r0.zzr()
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            java.lang.String r2 = "onSdkLoaded"
            r0.zzd(r2, r1)
        L2b:
            r0 = 1
            return r0
        L2d:
            java.lang.String r0 = "Trying to start OMID session before creation."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            r0 = 0
            return r0
    }
}
