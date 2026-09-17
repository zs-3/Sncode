package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdqo implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;

    public zzdqo(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* synthetic */ java.lang.Object zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r1.zzc
            com.google.android.gms.internal.ads.zzcxr r0 = (com.google.android.gms.internal.ads.zzcxr) r0
            com.google.android.gms.internal.ads.zzfhc r0 = r0.zza()
            com.google.android.gms.internal.ads.zzfgp r0 = r0.zzo
            int r0 = r0.zza
            if (r0 == 0) goto L24
            int r0 = r0 + (-1)
            if (r0 == 0) goto L1b
            com.google.android.gms.internal.ads.zzhja r0 = r1.zzb
            com.google.android.gms.internal.ads.zzelx r0 = (com.google.android.gms.internal.ads.zzelx) r0
            com.google.android.gms.internal.ads.zzelw r0 = r0.zza()
            goto L23
        L1b:
            com.google.android.gms.internal.ads.zzhja r0 = r1.zza
            com.google.android.gms.internal.ads.zzelx r0 = (com.google.android.gms.internal.ads.zzelx) r0
            com.google.android.gms.internal.ads.zzelw r0 = r0.zza()
        L23:
            return r0
        L24:
            r0 = 0
            throw r0
    }
}
