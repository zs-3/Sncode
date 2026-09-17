package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcrf implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;

    public zzcrf(com.google.android.gms.internal.ads.zzcqy r1, com.google.android.gms.internal.ads.zzhja r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r3.zza
            com.google.android.gms.internal.ads.zzcsh r0 = (com.google.android.gms.internal.ads.zzcsh) r0
            com.google.android.gms.internal.ads.zzcsg r0 = r0.zza()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzmh
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L26
            com.google.android.gms.internal.ads.zzdfs r1 = new com.google.android.gms.internal.ads.zzdfs
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zza
            r1.<init>(r0, r2)
            com.google.android.gms.internal.ads.zzgbc r0 = com.google.android.gms.internal.ads.zzgbc.zzo(r1)
            goto L2a
        L26:
            com.google.android.gms.internal.ads.zzgbc r0 = com.google.android.gms.internal.ads.zzgbc.zzn()
        L2a:
            com.google.android.gms.internal.ads.zzhiq.zzb(r0)
            return r0
    }
}
