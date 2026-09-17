package com.google.android.gms.ads.nonagon.util.logging.csi;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class CsiParamDefaults_Factory implements com.google.android.gms.internal.ads.zzhii<com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults> {
    private final com.google.android.gms.internal.ads.zzhja zza;
    private final com.google.android.gms.internal.ads.zzhja zzb;

    public CsiParamDefaults_Factory(com.google.android.gms.internal.ads.zzhja<android.content.Context> r1, com.google.android.gms.internal.ads.zzhja<com.google.android.gms.ads.internal.util.client.VersionInfoParcel> r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory create(com.google.android.gms.internal.ads.zzhja<android.content.Context> r1, com.google.android.gms.internal.ads.zzhja<com.google.android.gms.ads.internal.util.client.VersionInfoParcel> r2) {
            com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory r0 = new com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults newInstance(android.content.Context r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2) {
            com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults r0 = new com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults
            r0.<init>(r1, r2)
            return r0
    }

    public com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults get() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r2.zza
            java.lang.Object r0 = r0.zzb()
            android.content.Context r0 = (android.content.Context) r0
            com.google.android.gms.internal.ads.zzhja r1 = r2.zzb
            java.lang.Object r1 = r1.zzb()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = (com.google.android.gms.ads.internal.util.client.VersionInfoParcel) r1
            com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults r0 = newInstance(r0, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r1 = this;
            com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults r0 = r1.get()
            return r0
    }
}
