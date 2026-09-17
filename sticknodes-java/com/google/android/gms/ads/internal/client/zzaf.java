package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzaf extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpl zzb;

    zzaf(com.google.android.gms.ads.internal.client.zzba r1, android.content.Context r2, com.google.android.gms.internal.ads.zzbpl r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r2 = this;
            android.content.Context r0 = r2.zza
            java.lang.String r1 = "out_of_context_tester"
            com.google.android.gms.ads.internal.client.zzba.zzv(r0, r1)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp r4) throws android.os.RemoteException {
            r3 = this;
            android.content.Context r0 = r3.zza
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziW
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L25
            com.google.android.gms.internal.ads.zzbpl r0 = r3.zzb
            r2 = 243220000(0xe7f3e20, float:3.1461089E-30)
            com.google.android.gms.ads.internal.client.zzdu r4 = r4.zzi(r1, r0, r2)
            return r4
        L25:
            r4 = 0
            return r4
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
            r5 = this;
            android.content.Context r0 = r5.zza
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziW
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L45
            android.content.Context r0 = r5.zza     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            java.lang.String r3 = "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl"
            com.google.android.gms.ads.internal.client.zzae r4 = new com.google.android.gms.ads.internal.client.zzae     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            r4.<init>()     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            java.lang.Object r0 = com.google.android.gms.ads.internal.util.client.zzq.zzb(r0, r3, r4)     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            com.google.android.gms.ads.internal.client.zzdv r0 = (com.google.android.gms.ads.internal.client.zzdv) r0     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            com.google.android.gms.internal.ads.zzbpl r3 = r5.zzb     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            r4 = 243220000(0xe7f3e20, float:3.1461089E-30)
            com.google.android.gms.ads.internal.client.zzdu r2 = r0.zze(r1, r3, r4)     // Catch: java.lang.NullPointerException -> L35 android.os.RemoteException -> L37 com.google.android.gms.ads.internal.util.client.zzp -> L39
            goto L45
        L35:
            r0 = move-exception
            goto L3a
        L37:
            r0 = move-exception
            goto L3a
        L39:
            r0 = move-exception
        L3a:
            android.content.Context r1 = r5.zza
            com.google.android.gms.internal.ads.zzbur r1 = com.google.android.gms.internal.ads.zzbup.zza(r1)
            java.lang.String r3 = "ClientApiBroker.getOutOfContextTester"
            r1.zzh(r0, r3)
        L45:
            return r2
    }
}
