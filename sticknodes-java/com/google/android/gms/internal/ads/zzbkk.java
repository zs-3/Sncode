package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbkk implements com.google.android.gms.internal.ads.zzbkl {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcas zza;

    zzbkk(com.google.android.gms.internal.ads.zzbkm r1, com.google.android.gms.internal.ads.zzcas r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void zza(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzboc r0 = new com.google.android.gms.internal.ads.zzboc
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzcas r2 = r1.zza
            r2.zzd(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void zzb(org.json.JSONObject r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcas r0 = r1.zza
            r0.zzc(r2)
            return
    }
}
