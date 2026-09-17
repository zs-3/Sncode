package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeta implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;

    public zzeta(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r4 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r4.zza
            com.google.android.gms.internal.ads.zzeud r0 = (com.google.android.gms.internal.ads.zzeud) r0
            com.google.android.gms.internal.ads.zzeub r0 = r0.zza()
            com.google.android.gms.internal.ads.zzhja r1 = r4.zzb
            com.google.android.gms.internal.ads.zzchu r1 = (com.google.android.gms.internal.ads.zzchu) r1
            android.content.Context r1 = r1.zza()
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzkY
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L30
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r1 = com.google.android.gms.ads.internal.util.zzt.zzB(r1)
            if (r1 == 0) goto L30
            com.google.android.gms.internal.ads.zzgbc r0 = com.google.android.gms.internal.ads.zzgbc.zzo(r0)
            goto L34
        L30:
            com.google.android.gms.internal.ads.zzgbc r0 = com.google.android.gms.internal.ads.zzgbc.zzn()
        L34:
            com.google.android.gms.internal.ads.zzhiq.zzb(r0)
            return r0
    }
}
