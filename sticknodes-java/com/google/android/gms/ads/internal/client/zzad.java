package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzad extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.app.Activity zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zzb;

    zzad(com.google.android.gms.ads.internal.client.zzba r1, android.app.Activity r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r2 = this;
            android.app.Activity r0 = r2.zza
            java.lang.String r1 = "ad_overlay"
            com.google.android.gms.ads.internal.client.zzba.zzv(r0, r1)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp r2) throws android.os.RemoteException {
            r1 = this;
            android.app.Activity r0 = r1.zza
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            com.google.android.gms.internal.ads.zzbtm r2 = r2.zzn(r0)
            return r2
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
            r4 = this;
            android.app.Activity r0 = r4.zza
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkn
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
            android.app.Activity r0 = r4.zza     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            android.app.Activity r1 = r4.zza     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            java.lang.String r2 = "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl"
            com.google.android.gms.ads.internal.client.zzac r3 = new com.google.android.gms.ads.internal.client.zzac     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            r3.<init>()     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            java.lang.Object r1 = com.google.android.gms.ads.internal.util.client.zzq.zzb(r1, r2, r3)     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            com.google.android.gms.internal.ads.zzbtp r1 = (com.google.android.gms.internal.ads.zzbtp) r1     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            android.os.IBinder r0 = r1.zze(r0)     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            com.google.android.gms.internal.ads.zzbtm r0 = com.google.android.gms.internal.ads.zzbtl.zzI(r0)     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            goto L62
        L35:
            r0 = move-exception
            goto L3a
        L37:
            r0 = move-exception
            goto L3a
        L39:
            r0 = move-exception
        L3a:
            com.google.android.gms.ads.internal.client.zzba r1 = r4.zzb
            android.app.Activity r2 = r4.zza
            android.content.Context r2 = r2.getApplicationContext()
            com.google.android.gms.internal.ads.zzbur r2 = com.google.android.gms.internal.ads.zzbup.zza(r2)
            com.google.android.gms.ads.internal.client.zzba.zzu(r1, r2)
            com.google.android.gms.ads.internal.client.zzba r1 = r4.zzb
            com.google.android.gms.internal.ads.zzbur r1 = com.google.android.gms.ads.internal.client.zzba.zzr(r1)
            java.lang.String r2 = "ClientApiBroker.createAdOverlay"
            r1.zzh(r0, r2)
            r0 = 0
            goto L62
        L56:
            com.google.android.gms.ads.internal.client.zzba r0 = r4.zzb
            android.app.Activity r1 = r4.zza
            com.google.android.gms.internal.ads.zzbtj r0 = com.google.android.gms.ads.internal.client.zzba.zzp(r0)
            com.google.android.gms.internal.ads.zzbtm r0 = r0.zza(r1)
        L62:
            return r0
    }
}
