package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcxw implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;

    public zzcxw(com.google.android.gms.internal.ads.zzcxv r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3, com.google.android.gms.internal.ads.zzhja r4, com.google.android.gms.internal.ads.zzhja r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r7 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r7.zza
            java.lang.Object r0 = r0.zzb()
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            com.google.android.gms.internal.ads.zzhja r0 = r7.zzb
            com.google.android.gms.internal.ads.zzcih r0 = (com.google.android.gms.internal.ads.zzcih) r0
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r0.zza()
            com.google.android.gms.internal.ads.zzhja r0 = r7.zzc
            com.google.android.gms.internal.ads.zzctv r0 = (com.google.android.gms.internal.ads.zzctv) r0
            com.google.android.gms.internal.ads.zzfgh r0 = r0.zza()
            com.google.android.gms.internal.ads.zzbyg r6 = new com.google.android.gms.internal.ads.zzbyg
            r6.<init>()
            com.google.android.gms.internal.ads.zzbyh r4 = r0.zzA
            r1 = 0
            if (r4 == 0) goto L32
            com.google.android.gms.internal.ads.zzfgm r0 = r0.zzs
            if (r0 != 0) goto L29
            r5 = r1
            goto L2c
        L29:
            java.lang.String r0 = r0.zzb
            r5 = r0
        L2c:
            com.google.android.gms.internal.ads.zzbyf r0 = new com.google.android.gms.internal.ads.zzbyf
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
        L32:
            return r1
    }
}
