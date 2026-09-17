package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzduv implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzdur zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;

    public zzduv(com.google.android.gms.internal.ads.zzdur r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static java.util.Set zza(com.google.android.gms.internal.ads.zzdur r0, com.google.android.gms.internal.ads.zzdvb r1, java.util.concurrent.Executor r2) {
            java.util.Set r0 = com.google.android.gms.internal.ads.zzdur.zzd(r1, r2)
            com.google.android.gms.internal.ads.zzhiq.zzb(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r3.zzb
            java.lang.Object r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzdvb r0 = (com.google.android.gms.internal.ads.zzdvb) r0
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzfkb.zzc()
            com.google.android.gms.internal.ads.zzdur r2 = r3.zza
            java.util.Set r0 = zza(r2, r0, r1)
            return r0
    }
}
