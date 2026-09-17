package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdyp implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;

    public zzdyp(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* synthetic */ java.lang.Object zzb() {
            r4 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r4.zza
            java.lang.Object r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzflg r0 = (com.google.android.gms.internal.ads.zzflg) r0
            com.google.android.gms.internal.ads.zzhja r1 = r4.zzb
            java.lang.Object r1 = r1.zzb()
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.ads.internal.util.zzab r2 = com.google.android.gms.ads.internal.zzu.zzq()
            android.webkit.CookieManager r1 = r2.zza(r1)
            com.google.android.gms.internal.ads.zzfla r2 = com.google.android.gms.internal.ads.zzfla.zzv
            com.google.android.gms.internal.ads.zzdym r3 = new com.google.android.gms.internal.ads.zzdym
            r3.<init>(r1)
            com.google.android.gms.internal.ads.zzfkx r0 = com.google.android.gms.internal.ads.zzfkq.zza(r3, r2, r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 1
            com.google.android.gms.internal.ads.zzfkx r0 = r0.zzi(r2, r1)
            com.google.android.gms.internal.ads.zzdyn r1 = new com.google.android.gms.internal.ads.zzdyn
            r1.<init>()
            com.google.android.gms.internal.ads.zzfkr r2 = new com.google.android.gms.internal.ads.zzfkr
            r2.<init>(r1)
            java.lang.Class<java.lang.Exception> r1 = java.lang.Exception.class
            com.google.android.gms.internal.ads.zzfkx r0 = r0.zzc(r1, r2)
            com.google.android.gms.internal.ads.zzfkl r0 = r0.zza()
            return r0
    }
}
