package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzax extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.widget.FrameLayout zza;
    final /* synthetic */ android.widget.FrameLayout zzb;
    final /* synthetic */ android.content.Context zzc;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zzd;

    zzax(com.google.android.gms.ads.internal.client.zzba r1, android.widget.FrameLayout r2, android.widget.FrameLayout r3, android.content.Context r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r2 = this;
            android.content.Context r0 = r2.zzc
            java.lang.String r1 = "native_ad_view_delegate"
            com.google.android.gms.ads.internal.client.zzba.zzv(r0, r1)
            com.google.android.gms.ads.internal.client.zzfo r0 = new com.google.android.gms.ads.internal.client.zzfo
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp r3) throws android.os.RemoteException {
            r2 = this;
            android.widget.FrameLayout r0 = r2.zzb
            android.widget.FrameLayout r1 = r2.zza
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            com.google.android.gms.internal.ads.zzbgg r3 = r3.zzj(r1, r0)
            return r3
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
            r6 = this;
            android.content.Context r0 = r6.zzc
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkn
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L61
            android.content.Context r0 = r6.zzc     // Catch: java.lang.NullPointerException -> L44 android.os.RemoteException -> L46 com.google.android.gms.ads.internal.util.client.zzp -> L48
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: java.lang.NullPointerException -> L44 android.os.RemoteException -> L46 com.google.android.gms.ads.internal.util.client.zzp -> L48
            android.widget.FrameLayout r1 = r6.zza     // Catch: java.lang.NullPointerException -> L44 android.os.RemoteException -> L46 com.google.android.gms.ads.internal.util.client.zzp -> L48
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: java.lang.NullPointerException -> L44 android.os.RemoteException -> L46 com.google.android.gms.ads.internal.util.client.zzp -> L48
            android.widget.FrameLayout r2 = r6.zzb     // Catch: java.lang.NullPointerException -> L44 android.os.RemoteException -> L46 com.google.android.gms.ads.internal.util.client.zzp -> L48
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: java.lang.NullPointerException -> L44 android.os.RemoteException -> L46 com.google.android.gms.ads.internal.util.client.zzp -> L48
            android.content.Context r3 = r6.zzc     // Catch: java.lang.NullPointerException -> L44 android.os.RemoteException -> L46 com.google.android.gms.ads.internal.util.client.zzp -> L48
            java.lang.String r4 = "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl"
            com.google.android.gms.ads.internal.client.zzaw r5 = new com.google.android.gms.ads.internal.client.zzaw     // Catch: java.lang.NullPointerException -> L44 android.os.RemoteException -> L46 com.google.android.gms.ads.internal.util.client.zzp -> L48
            r5.<init>()     // Catch: java.lang.NullPointerException -> L44 android.os.RemoteException -> L46 com.google.android.gms.ads.internal.util.client.zzp -> L48
            java.lang.Object r3 = com.google.android.gms.ads.internal.util.client.zzq.zzb(r3, r4, r5)     // Catch: java.lang.NullPointerException -> L44 android.os.RemoteException -> L46 com.google.android.gms.ads.internal.util.client.zzp -> L48
            com.google.android.gms.internal.ads.zzbgj r3 = (com.google.android.gms.internal.ads.zzbgj) r3     // Catch: java.lang.NullPointerException -> L44 android.os.RemoteException -> L46 com.google.android.gms.ads.internal.util.client.zzp -> L48
            r4 = 243220000(0xe7f3e20, float:3.1461089E-30)
            android.os.IBinder r0 = r3.zze(r0, r1, r2, r4)     // Catch: java.lang.NullPointerException -> L44 android.os.RemoteException -> L46 com.google.android.gms.ads.internal.util.client.zzp -> L48
            com.google.android.gms.internal.ads.zzbgg r0 = com.google.android.gms.internal.ads.zzbgf.zzdA(r0)     // Catch: java.lang.NullPointerException -> L44 android.os.RemoteException -> L46 com.google.android.gms.ads.internal.util.client.zzp -> L48
            goto L71
        L44:
            r0 = move-exception
            goto L49
        L46:
            r0 = move-exception
            goto L49
        L48:
            r0 = move-exception
        L49:
            com.google.android.gms.ads.internal.client.zzba r1 = r6.zzd
            android.content.Context r2 = r6.zzc
            com.google.android.gms.internal.ads.zzbur r2 = com.google.android.gms.internal.ads.zzbup.zza(r2)
            com.google.android.gms.ads.internal.client.zzba.zzu(r1, r2)
            com.google.android.gms.ads.internal.client.zzba r1 = r6.zzd
            com.google.android.gms.internal.ads.zzbur r1 = com.google.android.gms.ads.internal.client.zzba.zzr(r1)
            java.lang.String r2 = "ClientApiBroker.createNativeAdViewDelegate"
            r1.zzh(r0, r2)
            r0 = 0
            goto L71
        L61:
            com.google.android.gms.ads.internal.client.zzba r0 = r6.zzd
            android.content.Context r1 = r6.zzc
            android.widget.FrameLayout r2 = r6.zza
            android.widget.FrameLayout r3 = r6.zzb
            com.google.android.gms.internal.ads.zzbib r0 = com.google.android.gms.ads.internal.client.zzba.zzl(r0)
            com.google.android.gms.internal.ads.zzbgg r0 = r0.zza(r1, r2, r3)
        L71:
            return r0
    }
}
