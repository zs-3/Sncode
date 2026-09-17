package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdju implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;

    public zzdju(com.google.android.gms.internal.ads.zzhja r1, com.google.android.gms.internal.ads.zzhja r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* synthetic */ java.lang.Object zzb() {
            r8 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r8.zza
            com.google.android.gms.internal.ads.zzcih r0 = (com.google.android.gms.internal.ads.zzcih) r0
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r0.zza()
            com.google.android.gms.internal.ads.zzayr r0 = new com.google.android.gms.internal.ads.zzayr
            com.google.android.gms.ads.internal.zzu.zzp()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r2 = r1.toString()
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r4 = "native"
            r6 = 0
            r7 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }
}
