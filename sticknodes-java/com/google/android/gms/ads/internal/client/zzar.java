package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzar extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpl zzc;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zzd;

    zzar(com.google.android.gms.ads.internal.client.zzba r1, android.content.Context r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbpl r4) {
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
            android.content.Context r0 = r2.zza
            java.lang.String r1 = "native_ad"
            com.google.android.gms.ads.internal.client.zzba.zzv(r0, r1)
            com.google.android.gms.ads.internal.client.zzfj r0 = new com.google.android.gms.ads.internal.client.zzfj
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp r5) throws android.os.RemoteException {
            r4 = this;
            android.content.Context r0 = r4.zza
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            java.lang.String r1 = r4.zzb
            com.google.android.gms.internal.ads.zzbpl r2 = r4.zzc
            r3 = 243220000(0xe7f3e20, float:3.1461089E-30)
            com.google.android.gms.ads.internal.client.zzbu r5 = r5.zzb(r0, r1, r2, r3)
            return r5
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
            r6 = this;
            android.content.Context r0 = r6.zza
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkn
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L6b
            android.content.Context r0 = r6.zza     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
            android.content.Context r2 = r6.zza     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
            java.lang.String r3 = "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl"
            com.google.android.gms.ads.internal.client.zzaq r4 = new com.google.android.gms.ads.internal.client.zzaq     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
            r4.<init>()     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
            java.lang.Object r2 = com.google.android.gms.ads.internal.util.client.zzq.zzb(r2, r3, r4)     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
            com.google.android.gms.ads.internal.client.zzbv r2 = (com.google.android.gms.ads.internal.client.zzbv) r2     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
            java.lang.String r3 = r6.zzb     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
            com.google.android.gms.internal.ads.zzbpl r4 = r6.zzc     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
            r5 = 243220000(0xe7f3e20, float:3.1461089E-30)
            android.os.IBinder r0 = r2.zze(r0, r3, r4, r5)     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
            if (r0 != 0) goto L3b
            goto L7b
        L3b:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzbu     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
            if (r3 == 0) goto L49
            com.google.android.gms.ads.internal.client.zzbu r2 = (com.google.android.gms.ads.internal.client.zzbu) r2     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
        L47:
            r1 = r2
            goto L7b
        L49:
            com.google.android.gms.ads.internal.client.zzbs r2 = new com.google.android.gms.ads.internal.client.zzbs     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
            r2.<init>(r0)     // Catch: java.lang.NullPointerException -> L4f android.os.RemoteException -> L51 com.google.android.gms.ads.internal.util.client.zzp -> L53
            goto L47
        L4f:
            r0 = move-exception
            goto L54
        L51:
            r0 = move-exception
            goto L54
        L53:
            r0 = move-exception
        L54:
            com.google.android.gms.ads.internal.client.zzba r2 = r6.zzd
            android.content.Context r3 = r6.zza
            com.google.android.gms.internal.ads.zzbur r3 = com.google.android.gms.internal.ads.zzbup.zza(r3)
            com.google.android.gms.ads.internal.client.zzba.zzu(r2, r3)
            com.google.android.gms.ads.internal.client.zzba r2 = r6.zzd
            com.google.android.gms.internal.ads.zzbur r2 = com.google.android.gms.ads.internal.client.zzba.zzr(r2)
            java.lang.String r3 = "ClientApiBroker.createAdLoaderBuilder"
            r2.zzh(r0, r3)
            goto L7b
        L6b:
            com.google.android.gms.ads.internal.client.zzba r0 = r6.zzd
            android.content.Context r1 = r6.zza
            java.lang.String r2 = r6.zzb
            com.google.android.gms.internal.ads.zzbpl r3 = r6.zzc
            com.google.android.gms.ads.internal.client.zzi r0 = com.google.android.gms.ads.internal.client.zzba.zza(r0)
            com.google.android.gms.ads.internal.client.zzbu r1 = r0.zza(r1, r2, r3)
        L7b:
            return r1
    }
}
