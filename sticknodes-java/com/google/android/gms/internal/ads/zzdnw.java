package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdnw implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcas zza;

    zzdnw(com.google.android.gms.internal.ads.zzdnx r1, com.google.android.gms.internal.ads.zzcas r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "Failed to load media data due to video view load failure."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)
            com.google.android.gms.internal.ads.zzcas r0 = r1.zza
            r0.zzd(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzcfo r4 = (com.google.android.gms.internal.ads.zzcfo) r4
            if (r4 == 0) goto L17
            com.google.android.gms.internal.ads.zzcdh r0 = new com.google.android.gms.internal.ads.zzcdh
            com.google.android.gms.internal.ads.zzdnv r1 = new com.google.android.gms.internal.ads.zzdnv
            r1.<init>(r3)
            r0.<init>(r1)
            java.lang.String r1 = "/video"
            r4.zzag(r1, r0)
            r4.zzaa()
            return
        L17:
            com.google.android.gms.internal.ads.zzcas r4 = r3.zza
            com.google.android.gms.internal.ads.zzeki r0 = new com.google.android.gms.internal.ads.zzeki
            r1 = 1
            java.lang.String r2 = "Missing webview from video view future."
            r0.<init>(r1, r2)
            r4.zzd(r0)
            return
    }
}
