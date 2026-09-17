package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcpt implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;

    public zzcpt(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r3.zza
            java.lang.Object r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzcpm r0 = (com.google.android.gms.internal.ads.zzcpm) r0
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzfkb.zzc()
            com.google.android.gms.internal.ads.zzhja r2 = r3.zzb
            java.lang.Object r2 = r2.zzb()
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            if (r2 != 0) goto L1b
            java.util.Set r0 = java.util.Collections.emptySet()
            goto L24
        L1b:
            com.google.android.gms.internal.ads.zzdfs r2 = new com.google.android.gms.internal.ads.zzdfs
            r2.<init>(r0, r1)
            java.util.Set r0 = java.util.Collections.singleton(r2)
        L24:
            com.google.android.gms.internal.ads.zzhiq.zzb(r0)
            return r0
    }
}
