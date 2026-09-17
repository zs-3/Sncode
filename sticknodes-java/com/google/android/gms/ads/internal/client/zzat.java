package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzat extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpl zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zzc;

    zzat(com.google.android.gms.ads.internal.client.zzba r1, android.content.Context r2, com.google.android.gms.internal.ads.zzbpl r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r2 = this;
            android.content.Context r0 = r2.zza
            java.lang.String r1 = "ads_preloader"
            com.google.android.gms.ads.internal.client.zzba.zzv(r0, r1)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp r4) throws android.os.RemoteException {
            r3 = this;
            android.content.Context r0 = r3.zza
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            com.google.android.gms.internal.ads.zzbpl r1 = r3.zzb
            r2 = 243220000(0xe7f3e20, float:3.1461089E-30)
            com.google.android.gms.ads.internal.client.zzci r4 = r4.zzg(r0, r1, r2)
            com.google.android.gms.internal.ads.zzbpl r0 = r3.zzb
            r4.zzh(r0)
            return r4
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
            r5 = this;
            android.content.Context r0 = r5.zza
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkn
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L6d
            android.content.Context r0 = r5.zza     // Catch: java.lang.NullPointerException -> L51 android.os.RemoteException -> L53 com.google.android.gms.ads.internal.util.client.zzp -> L55
            java.lang.String r3 = "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl"
            com.google.android.gms.ads.internal.client.zzas r4 = new com.google.android.gms.ads.internal.client.zzas     // Catch: java.lang.NullPointerException -> L51 android.os.RemoteException -> L53 com.google.android.gms.ads.internal.util.client.zzp -> L55
            r4.<init>()     // Catch: java.lang.NullPointerException -> L51 android.os.RemoteException -> L53 com.google.android.gms.ads.internal.util.client.zzp -> L55
            java.lang.Object r0 = com.google.android.gms.ads.internal.util.client.zzq.zzb(r0, r3, r4)     // Catch: java.lang.NullPointerException -> L51 android.os.RemoteException -> L53 com.google.android.gms.ads.internal.util.client.zzp -> L55
            com.google.android.gms.ads.internal.client.zzcj r0 = (com.google.android.gms.ads.internal.client.zzcj) r0     // Catch: java.lang.NullPointerException -> L51 android.os.RemoteException -> L53 com.google.android.gms.ads.internal.util.client.zzp -> L55
            com.google.android.gms.internal.ads.zzbpl r3 = r5.zzb     // Catch: java.lang.NullPointerException -> L51 android.os.RemoteException -> L53 com.google.android.gms.ads.internal.util.client.zzp -> L55
            r4 = 243220000(0xe7f3e20, float:3.1461089E-30)
            android.os.IBinder r0 = r0.zze(r1, r3, r4)     // Catch: java.lang.NullPointerException -> L51 android.os.RemoteException -> L53 com.google.android.gms.ads.internal.util.client.zzp -> L55
            if (r0 != 0) goto L38
            r1 = r2
            goto L4a
        L38:
            java.lang.String r1 = "com.google.android.gms.ads.internal.client.IAdPreloader"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)     // Catch: java.lang.NullPointerException -> L51 android.os.RemoteException -> L53 com.google.android.gms.ads.internal.util.client.zzp -> L55
            boolean r3 = r1 instanceof com.google.android.gms.ads.internal.client.zzci     // Catch: java.lang.NullPointerException -> L51 android.os.RemoteException -> L53 com.google.android.gms.ads.internal.util.client.zzp -> L55
            if (r3 == 0) goto L45
            com.google.android.gms.ads.internal.client.zzci r1 = (com.google.android.gms.ads.internal.client.zzci) r1     // Catch: java.lang.NullPointerException -> L51 android.os.RemoteException -> L53 com.google.android.gms.ads.internal.util.client.zzp -> L55
            goto L4a
        L45:
            com.google.android.gms.ads.internal.client.zzcg r1 = new com.google.android.gms.ads.internal.client.zzcg     // Catch: java.lang.NullPointerException -> L51 android.os.RemoteException -> L53 com.google.android.gms.ads.internal.util.client.zzp -> L55
            r1.<init>(r0)     // Catch: java.lang.NullPointerException -> L51 android.os.RemoteException -> L53 com.google.android.gms.ads.internal.util.client.zzp -> L55
        L4a:
            com.google.android.gms.internal.ads.zzbpl r0 = r5.zzb     // Catch: java.lang.NullPointerException -> L51 android.os.RemoteException -> L53 com.google.android.gms.ads.internal.util.client.zzp -> L55
            r1.zzh(r0)     // Catch: java.lang.NullPointerException -> L51 android.os.RemoteException -> L53 com.google.android.gms.ads.internal.util.client.zzp -> L55
            r2 = r1
            goto L7b
        L51:
            r0 = move-exception
            goto L56
        L53:
            r0 = move-exception
            goto L56
        L55:
            r0 = move-exception
        L56:
            com.google.android.gms.ads.internal.client.zzba r1 = r5.zzc
            android.content.Context r3 = r5.zza
            com.google.android.gms.internal.ads.zzbur r3 = com.google.android.gms.internal.ads.zzbup.zza(r3)
            com.google.android.gms.ads.internal.client.zzba.zzu(r1, r3)
            com.google.android.gms.ads.internal.client.zzba r1 = r5.zzc
            com.google.android.gms.internal.ads.zzbur r1 = com.google.android.gms.ads.internal.client.zzba.zzr(r1)
            java.lang.String r3 = "ClientApiBroker.getAdPreloader"
            r1.zzh(r0, r3)
            goto L7b
        L6d:
            com.google.android.gms.ads.internal.client.zzba r0 = r5.zzc
            android.content.Context r1 = r5.zza
            com.google.android.gms.internal.ads.zzbpl r2 = r5.zzb
            com.google.android.gms.ads.internal.client.zzl r0 = com.google.android.gms.ads.internal.client.zzba.zzc(r0)
            com.google.android.gms.ads.internal.client.zzci r2 = r0.zza(r1, r2)
        L7b:
            return r2
    }
}
