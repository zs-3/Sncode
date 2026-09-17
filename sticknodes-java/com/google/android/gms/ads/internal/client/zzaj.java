package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzaj extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpl zzb;

    zzaj(com.google.android.gms.ads.internal.client.zzba r1, android.content.Context r2, com.google.android.gms.internal.ads.zzbpl r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r1 = this;
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
            com.google.android.gms.internal.ads.zzbtf r4 = r4.zzm(r0, r1, r2)
            return r4
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
            r4 = this;
            android.content.Context r0 = r4.zza
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            android.content.Context r1 = r4.zza     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl"
            com.google.android.gms.ads.internal.client.zzai r3 = new com.google.android.gms.ads.internal.client.zzai     // Catch: java.lang.Throwable -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = com.google.android.gms.ads.internal.util.client.zzq.zzb(r1, r2, r3)     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.internal.ads.zzbti r1 = (com.google.android.gms.internal.ads.zzbti) r1     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.internal.ads.zzbpl r2 = r4.zzb     // Catch: java.lang.Throwable -> L1f
            r3 = 243220000(0xe7f3e20, float:3.1461089E-30)
            com.google.android.gms.internal.ads.zzbtf r0 = r1.zze(r0, r2, r3)     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }
}
