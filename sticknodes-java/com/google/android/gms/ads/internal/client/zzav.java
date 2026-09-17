package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzav extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zzb;

    zzav(com.google.android.gms.ads.internal.client.zzba r1, android.content.Context r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r2 = this;
            android.content.Context r0 = r2.zza
            java.lang.String r1 = "mobile_ads_settings"
            com.google.android.gms.ads.internal.client.zzba.zzv(r0, r1)
            com.google.android.gms.ads.internal.client.zzfn r0 = new com.google.android.gms.ads.internal.client.zzfn
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp r3) throws android.os.RemoteException {
            r2 = this;
            android.content.Context r0 = r2.zza
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            r1 = 243220000(0xe7f3e20, float:3.1461089E-30)
            com.google.android.gms.ads.internal.client.zzcz r3 = r3.zzh(r0, r1)
            return r3
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
            r5 = this;
            android.content.Context r0 = r5.zza
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkn
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L67
            android.content.Context r0 = r5.zza     // Catch: java.lang.NullPointerException -> L4b android.os.RemoteException -> L4d com.google.android.gms.ads.internal.util.client.zzp -> L4f
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: java.lang.NullPointerException -> L4b android.os.RemoteException -> L4d com.google.android.gms.ads.internal.util.client.zzp -> L4f
            android.content.Context r2 = r5.zza     // Catch: java.lang.NullPointerException -> L4b android.os.RemoteException -> L4d com.google.android.gms.ads.internal.util.client.zzp -> L4f
            java.lang.String r3 = "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl"
            com.google.android.gms.ads.internal.client.zzau r4 = new com.google.android.gms.ads.internal.client.zzau     // Catch: java.lang.NullPointerException -> L4b android.os.RemoteException -> L4d com.google.android.gms.ads.internal.util.client.zzp -> L4f
            r4.<init>()     // Catch: java.lang.NullPointerException -> L4b android.os.RemoteException -> L4d com.google.android.gms.ads.internal.util.client.zzp -> L4f
            java.lang.Object r2 = com.google.android.gms.ads.internal.util.client.zzq.zzb(r2, r3, r4)     // Catch: java.lang.NullPointerException -> L4b android.os.RemoteException -> L4d com.google.android.gms.ads.internal.util.client.zzp -> L4f
            com.google.android.gms.ads.internal.client.zzda r2 = (com.google.android.gms.ads.internal.client.zzda) r2     // Catch: java.lang.NullPointerException -> L4b android.os.RemoteException -> L4d com.google.android.gms.ads.internal.util.client.zzp -> L4f
            r3 = 243220000(0xe7f3e20, float:3.1461089E-30)
            android.os.IBinder r0 = r2.zze(r0, r3)     // Catch: java.lang.NullPointerException -> L4b android.os.RemoteException -> L4d com.google.android.gms.ads.internal.util.client.zzp -> L4f
            if (r0 != 0) goto L37
            goto L73
        L37:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)     // Catch: java.lang.NullPointerException -> L4b android.os.RemoteException -> L4d com.google.android.gms.ads.internal.util.client.zzp -> L4f
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzcz     // Catch: java.lang.NullPointerException -> L4b android.os.RemoteException -> L4d com.google.android.gms.ads.internal.util.client.zzp -> L4f
            if (r3 == 0) goto L45
            com.google.android.gms.ads.internal.client.zzcz r2 = (com.google.android.gms.ads.internal.client.zzcz) r2     // Catch: java.lang.NullPointerException -> L4b android.os.RemoteException -> L4d com.google.android.gms.ads.internal.util.client.zzp -> L4f
        L43:
            r1 = r2
            goto L73
        L45:
            com.google.android.gms.ads.internal.client.zzcx r2 = new com.google.android.gms.ads.internal.client.zzcx     // Catch: java.lang.NullPointerException -> L4b android.os.RemoteException -> L4d com.google.android.gms.ads.internal.util.client.zzp -> L4f
            r2.<init>(r0)     // Catch: java.lang.NullPointerException -> L4b android.os.RemoteException -> L4d com.google.android.gms.ads.internal.util.client.zzp -> L4f
            goto L43
        L4b:
            r0 = move-exception
            goto L50
        L4d:
            r0 = move-exception
            goto L50
        L4f:
            r0 = move-exception
        L50:
            com.google.android.gms.ads.internal.client.zzba r2 = r5.zzb
            android.content.Context r3 = r5.zza
            com.google.android.gms.internal.ads.zzbur r3 = com.google.android.gms.internal.ads.zzbup.zza(r3)
            com.google.android.gms.ads.internal.client.zzba.zzu(r2, r3)
            com.google.android.gms.ads.internal.client.zzba r2 = r5.zzb
            com.google.android.gms.internal.ads.zzbur r2 = com.google.android.gms.ads.internal.client.zzba.zzr(r2)
            java.lang.String r3 = "ClientApiBroker.getMobileAdsSettingsManager"
            r2.zzh(r0, r3)
            goto L73
        L67:
            com.google.android.gms.ads.internal.client.zzba r0 = r5.zzb
            android.content.Context r1 = r5.zza
            com.google.android.gms.ads.internal.client.zzff r0 = com.google.android.gms.ads.internal.client.zzba.zzi(r0)
            com.google.android.gms.ads.internal.client.zzcz r1 = r0.zza(r1)
        L73:
            return r1
    }
}
