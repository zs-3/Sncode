package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcne implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;

    public zzcne(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final com.google.android.gms.internal.ads.zzcnd zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r3.zza
            com.google.android.gms.internal.ads.zzhim r0 = (com.google.android.gms.internal.ads.zzhim) r0
            java.util.Map r0 = r0.zzd()
            com.google.android.gms.internal.ads.zzhja r1 = r3.zzb
            com.google.android.gms.internal.ads.zzhim r1 = (com.google.android.gms.internal.ads.zzhim) r1
            java.util.Map r1 = r1.zzd()
            com.google.android.gms.internal.ads.zzcnd r2 = new com.google.android.gms.internal.ads.zzcnd
            r2.<init>(r0, r1)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcnd r0 = r1.zza()
            return r0
    }
}
