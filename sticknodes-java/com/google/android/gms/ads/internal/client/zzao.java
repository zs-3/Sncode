package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzao extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzs zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zzd;

    zzao(com.google.android.gms.ads.internal.client.zzba r1, android.content.Context r2, com.google.android.gms.ads.internal.client.zzs r3, java.lang.String r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r2 = this;
            android.content.Context r0 = r2.zza
            java.lang.String r1 = "search"
            com.google.android.gms.ads.internal.client.zzba.zzv(r0, r1)
            com.google.android.gms.ads.internal.client.zzfl r0 = new com.google.android.gms.ads.internal.client.zzfl
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp r5) throws android.os.RemoteException {
            r4 = this;
            android.content.Context r0 = r4.zza
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            com.google.android.gms.ads.internal.client.zzs r1 = r4.zzb
            java.lang.String r2 = r4.zzc
            r3 = 243220000(0xe7f3e20, float:3.1461089E-30)
            com.google.android.gms.ads.internal.client.zzby r5 = r5.zzf(r0, r1, r2, r3)
            return r5
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
            r7 = this;
            com.google.android.gms.ads.internal.client.zzba r0 = r7.zzd
            com.google.android.gms.ads.internal.client.zzk r1 = com.google.android.gms.ads.internal.client.zzba.zzb(r0)
            android.content.Context r2 = r7.zza
            com.google.android.gms.ads.internal.client.zzs r3 = r7.zzb
            java.lang.String r4 = r7.zzc
            r5 = 0
            r6 = 3
            com.google.android.gms.ads.internal.client.zzby r0 = r1.zza(r2, r3, r4, r5, r6)
            return r0
    }
}
