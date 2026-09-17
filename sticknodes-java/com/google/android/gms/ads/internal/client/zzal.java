package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzal extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpl zzb;
    final /* synthetic */ com.google.android.gms.ads.h5.OnH5AdsEventListener zzc;

    zzal(com.google.android.gms.ads.internal.client.zzba r1, android.content.Context r2, com.google.android.gms.internal.ads.zzbpl r3, com.google.android.gms.ads.h5.OnH5AdsEventListener r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* synthetic */ java.lang.Object zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzblf r0 = new com.google.android.gms.internal.ads.zzblf
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp r5) throws android.os.RemoteException {
            r4 = this;
            android.content.Context r0 = r4.zza
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            com.google.android.gms.internal.ads.zzbks r1 = new com.google.android.gms.internal.ads.zzbks
            com.google.android.gms.ads.h5.OnH5AdsEventListener r2 = r4.zzc
            r1.<init>(r2)
            com.google.android.gms.internal.ads.zzbpl r2 = r4.zzb
            r3 = 243220000(0xe7f3e20, float:3.1461089E-30)
            com.google.android.gms.internal.ads.zzbky r5 = r5.zzl(r0, r2, r3, r1)
            return r5
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
            r6 = this;
            android.content.Context r0 = r6.zza
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            android.content.Context r1 = r6.zza     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl"
            com.google.android.gms.ads.internal.client.zzak r3 = new com.google.android.gms.ads.internal.client.zzak     // Catch: java.lang.Throwable -> L26
            r3.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = com.google.android.gms.ads.internal.util.client.zzq.zzb(r1, r2, r3)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzblb r1 = (com.google.android.gms.internal.ads.zzblb) r1     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzbpl r2 = r6.zzb     // Catch: java.lang.Throwable -> L26
            r3 = 243220000(0xe7f3e20, float:3.1461089E-30)
            com.google.android.gms.internal.ads.zzbks r4 = new com.google.android.gms.internal.ads.zzbks     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.ads.h5.OnH5AdsEventListener r5 = r6.zzc     // Catch: java.lang.Throwable -> L26
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.zzbky r0 = r1.zze(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L26
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
    }
}
