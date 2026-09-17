package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzboo implements com.google.android.gms.internal.ads.zzcaw {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnt zza;
    final /* synthetic */ java.lang.Object zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcas zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbor zzd;

    zzboo(com.google.android.gms.internal.ads.zzbor r1, com.google.android.gms.internal.ads.zzbnt r2, java.lang.Object r3, com.google.android.gms.internal.ads.zzcas r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzboa r5 = (com.google.android.gms.internal.ads.zzboa) r5
            java.lang.String r0 = "callJs > getEngine: Promise fulfilled"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            java.lang.Object r0 = r4.zzb
            com.google.android.gms.internal.ads.zzcas r1 = r4.zzc
            com.google.android.gms.internal.ads.zzbor r2 = r4.zzd
            com.google.android.gms.internal.ads.zzbnt r3 = r4.zza
            com.google.android.gms.internal.ads.zzbor.zzd(r2, r3, r5, r0, r1)
            return
    }
}
