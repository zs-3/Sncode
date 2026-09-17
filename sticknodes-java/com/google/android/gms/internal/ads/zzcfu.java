package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcfu implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ java.util.List zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ android.net.Uri zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zzd;

    zzcfu(com.google.android.gms.internal.ads.zzcfw r1, java.util.List r2, java.lang.String r3, android.net.Uri r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r2) {
            r1 = this;
            android.net.Uri r2 = r1.zzc
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Failed to parse gmsg params for: "
            java.lang.String r2 = r0.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r4) {
            r3 = this;
            java.util.Map r4 = (java.util.Map) r4
            java.util.List r0 = r3.zza
            java.lang.String r1 = r3.zzb
            com.google.android.gms.internal.ads.zzcfw r2 = r3.zzd
            com.google.android.gms.internal.ads.zzcfw.zze(r2, r4, r0, r1)
            return
    }
}
