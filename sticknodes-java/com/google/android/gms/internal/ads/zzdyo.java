package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdyo implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;

    public zzdyo(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3) {
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
            java.lang.Object r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzavn r0 = (com.google.android.gms.internal.ads.zzavn) r0
            com.google.android.gms.internal.ads.zzhja r1 = r4.zzb
            com.google.android.gms.internal.ads.zzchu r1 = (com.google.android.gms.internal.ads.zzchu) r1
            android.content.Context r1 = r1.zza()
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzfkb.zzc()
            com.google.android.gms.internal.ads.zzdyl r3 = new com.google.android.gms.internal.ads.zzdyl
            r3.<init>(r0, r1)
            com.google.common.util.concurrent.ListenableFuture r0 = r2.zzb(r3)
            com.google.android.gms.internal.ads.zzhiq.zzb(r0)
            return r0
    }
}
