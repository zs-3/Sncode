package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdum implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;
    private final com.google.android.gms.internal.ads.zzhja zzc;
    private final com.google.android.gms.internal.ads.zzhja zzd;

    public zzdum(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2, com.google.android.gms.internal.ads.zzhja r3, com.google.android.gms.internal.ads.zzhja r4, com.google.android.gms.internal.ads.zzhja r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r7 = this;
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzfkb.zzc()
            com.google.android.gms.internal.ads.zzhja r0 = r7.zza
            java.lang.Object r0 = r0.zzb()
            r2 = r0
            com.google.android.gms.ads.internal.util.client.zzr r2 = (com.google.android.gms.ads.internal.util.client.zzr) r2
            com.google.android.gms.internal.ads.zzhja r0 = r7.zzb
            com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory r0 = (com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory) r0
            com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults r3 = r0.get()
            com.google.android.gms.internal.ads.zzhja r0 = r7.zzc
            com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder_Factory r0 = (com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder_Factory) r0
            com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder r4 = r0.get()
            com.google.android.gms.internal.ads.zzhja r0 = r7.zzd
            com.google.android.gms.internal.ads.zzchu r0 = (com.google.android.gms.internal.ads.zzchu) r0
            android.content.Context r5 = r0.zza()
            com.google.android.gms.internal.ads.zzdui r6 = new com.google.android.gms.internal.ads.zzdui
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }
}
