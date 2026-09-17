package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzaz extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.view.View zza;
    final /* synthetic */ java.util.HashMap zzb;
    final /* synthetic */ java.util.HashMap zzc;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zzd;

    zzaz(com.google.android.gms.ads.internal.client.zzba r1, android.view.View r2, java.util.HashMap r3, java.util.HashMap r4) {
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
            android.view.View r0 = r2.zza
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "native_ad_view_holder_delegate"
            com.google.android.gms.ads.internal.client.zzba.zzv(r0, r1)
            com.google.android.gms.ads.internal.client.zzfp r0 = new com.google.android.gms.ads.internal.client.zzfp
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp r4) throws android.os.RemoteException {
            r3 = this;
            java.util.HashMap r0 = r3.zzc
            java.util.HashMap r1 = r3.zzb
            android.view.View r2 = r3.zza
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            com.google.android.gms.internal.ads.zzbgm r4 = r4.zzk(r2, r1, r0)
            return r4
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
            r6 = this;
            android.view.View r0 = r6.zza
            android.content.Context r0 = r0.getContext()
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkn
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6a
            android.view.View r0 = r6.zza     // Catch: java.lang.NullPointerException -> L49 android.os.RemoteException -> L4b com.google.android.gms.ads.internal.util.client.zzp -> L4d
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: java.lang.NullPointerException -> L49 android.os.RemoteException -> L4b com.google.android.gms.ads.internal.util.client.zzp -> L4d
            java.util.HashMap r1 = r6.zzb     // Catch: java.lang.NullPointerException -> L49 android.os.RemoteException -> L4b com.google.android.gms.ads.internal.util.client.zzp -> L4d
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: java.lang.NullPointerException -> L49 android.os.RemoteException -> L4b com.google.android.gms.ads.internal.util.client.zzp -> L4d
            java.util.HashMap r2 = r6.zzc     // Catch: java.lang.NullPointerException -> L49 android.os.RemoteException -> L4b com.google.android.gms.ads.internal.util.client.zzp -> L4d
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: java.lang.NullPointerException -> L49 android.os.RemoteException -> L4b com.google.android.gms.ads.internal.util.client.zzp -> L4d
            android.view.View r3 = r6.zza     // Catch: java.lang.NullPointerException -> L49 android.os.RemoteException -> L4b com.google.android.gms.ads.internal.util.client.zzp -> L4d
            android.content.Context r3 = r3.getContext()     // Catch: java.lang.NullPointerException -> L49 android.os.RemoteException -> L4b com.google.android.gms.ads.internal.util.client.zzp -> L4d
            java.lang.String r4 = "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl"
            com.google.android.gms.ads.internal.client.zzay r5 = new com.google.android.gms.ads.internal.client.zzay     // Catch: java.lang.NullPointerException -> L49 android.os.RemoteException -> L4b com.google.android.gms.ads.internal.util.client.zzp -> L4d
            r5.<init>()     // Catch: java.lang.NullPointerException -> L49 android.os.RemoteException -> L4b com.google.android.gms.ads.internal.util.client.zzp -> L4d
            java.lang.Object r3 = com.google.android.gms.ads.internal.util.client.zzq.zzb(r3, r4, r5)     // Catch: java.lang.NullPointerException -> L49 android.os.RemoteException -> L4b com.google.android.gms.ads.internal.util.client.zzp -> L4d
            com.google.android.gms.internal.ads.zzbgp r3 = (com.google.android.gms.internal.ads.zzbgp) r3     // Catch: java.lang.NullPointerException -> L49 android.os.RemoteException -> L4b com.google.android.gms.ads.internal.util.client.zzp -> L4d
            android.os.IBinder r0 = r3.zze(r0, r1, r2)     // Catch: java.lang.NullPointerException -> L49 android.os.RemoteException -> L4b com.google.android.gms.ads.internal.util.client.zzp -> L4d
            com.google.android.gms.internal.ads.zzbgm r0 = com.google.android.gms.internal.ads.zzbgl.zze(r0)     // Catch: java.lang.NullPointerException -> L49 android.os.RemoteException -> L4b com.google.android.gms.ads.internal.util.client.zzp -> L4d
            goto L7a
        L49:
            r0 = move-exception
            goto L4e
        L4b:
            r0 = move-exception
            goto L4e
        L4d:
            r0 = move-exception
        L4e:
            com.google.android.gms.ads.internal.client.zzba r1 = r6.zzd
            android.view.View r2 = r6.zza
            android.content.Context r2 = r2.getContext()
            com.google.android.gms.internal.ads.zzbur r2 = com.google.android.gms.internal.ads.zzbup.zza(r2)
            com.google.android.gms.ads.internal.client.zzba.zzu(r1, r2)
            com.google.android.gms.ads.internal.client.zzba r1 = r6.zzd
            com.google.android.gms.internal.ads.zzbur r1 = com.google.android.gms.ads.internal.client.zzba.zzr(r1)
            java.lang.String r2 = "ClientApiBroker.createNativeAdViewHolderDelegate"
            r1.zzh(r0, r2)
            r0 = 0
            goto L7a
        L6a:
            com.google.android.gms.ads.internal.client.zzba r0 = r6.zzd
            android.view.View r1 = r6.zza
            java.util.HashMap r2 = r6.zzb
            java.util.HashMap r3 = r6.zzc
            com.google.android.gms.internal.ads.zzbic r0 = com.google.android.gms.ads.internal.client.zzba.zzm(r0)
            com.google.android.gms.internal.ads.zzbgm r0 = r0.zza(r1, r2, r3)
        L7a:
            return r0
    }
}
