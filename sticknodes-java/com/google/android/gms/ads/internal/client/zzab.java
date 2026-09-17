package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzab extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpl zzc;

    zzab(com.google.android.gms.ads.internal.client.zzba r1, android.content.Context r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbpl r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r2 = this;
            android.content.Context r0 = r2.zza
            java.lang.String r1 = "rewarded"
            com.google.android.gms.ads.internal.client.zzba.zzv(r0, r1)
            com.google.android.gms.ads.internal.client.zzfr r0 = new com.google.android.gms.ads.internal.client.zzfr
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
            com.google.android.gms.internal.ads.zzbxf r5 = r5.zzp(r0, r1, r2, r3)
            return r5
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
            r3 = this;
            android.content.Context r0 = r3.zza
            java.lang.String r1 = r3.zzb
            com.google.android.gms.internal.ads.zzbpl r2 = r3.zzc
            com.google.android.gms.internal.ads.zzbxf r0 = com.google.android.gms.internal.ads.zzbxr.zza(r0, r1, r2)
            return r0
    }
}
