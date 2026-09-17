package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdiz implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;

    public zzdiz(com.google.android.gms.internal.ads.zzhja r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r1.zza
            com.google.android.gms.internal.ads.zzdiw r0 = (com.google.android.gms.internal.ads.zzdiw) r0
            com.google.android.gms.internal.ads.zzdla r0 = r0.zza()
            com.google.android.gms.internal.ads.zzbhn r0 = r0.zze()
            if (r0 == 0) goto L15
            java.lang.String r0 = "banner"
            java.util.Set r0 = java.util.Collections.singleton(r0)
            goto L19
        L15:
            java.util.Set r0 = java.util.Collections.emptySet()
        L19:
            com.google.android.gms.internal.ads.zzhiq.zzb(r0)
            return r0
    }
}
