package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzan extends com.google.android.gms.ads.internal.client.zzbb {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzs zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbpl zzd;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzba zze;

    zzan(com.google.android.gms.ads.internal.client.zzba r1, android.content.Context r2, com.google.android.gms.ads.internal.client.zzs r3, java.lang.String r4, com.google.android.gms.internal.ads.zzbpl r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r2 = this;
            android.content.Context r0 = r2.zza
            java.lang.String r1 = "app_open"
            com.google.android.gms.ads.internal.client.zzba.zzv(r0, r1)
            com.google.android.gms.ads.internal.client.zzfl r0 = new com.google.android.gms.ads.internal.client.zzfl
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.ads.internal.client.zzcp r8) throws android.os.RemoteException {
            r7 = this;
            android.content.Context r0 = r7.zza
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            com.google.android.gms.ads.internal.client.zzs r3 = r7.zzb
            java.lang.String r4 = r7.zzc
            com.google.android.gms.internal.ads.zzbpl r5 = r7.zzd
            r6 = 243220000(0xe7f3e20, float:3.1461089E-30)
            r1 = r8
            com.google.android.gms.ads.internal.client.zzby r8 = r1.zzc(r2, r3, r4, r5, r6)
            return r8
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ java.lang.Object zzc() throws android.os.RemoteException {
            r7 = this;
            com.google.android.gms.ads.internal.client.zzba r0 = r7.zze
            com.google.android.gms.ads.internal.client.zzk r1 = com.google.android.gms.ads.internal.client.zzba.zzb(r0)
            android.content.Context r2 = r7.zza
            com.google.android.gms.ads.internal.client.zzs r3 = r7.zzb
            java.lang.String r4 = r7.zzc
            com.google.android.gms.internal.ads.zzbpl r5 = r7.zzd
            r6 = 4
            com.google.android.gms.ads.internal.client.zzby r0 = r1.zza(r2, r3, r4, r5, r6)
            return r0
    }
}
