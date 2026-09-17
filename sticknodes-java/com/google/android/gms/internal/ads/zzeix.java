package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeix implements com.google.android.gms.internal.ads.zzegm {
    private final com.google.android.gms.internal.ads.zzdru zza;

    public zzeix(com.google.android.gms.internal.ads.zzdru r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzegm
    public final com.google.android.gms.internal.ads.zzegn zza(java.lang.String r3, org.json.JSONObject r4) throws com.google.android.gms.internal.ads.zzfhj {
            r2 = this;
            com.google.android.gms.internal.ads.zzdru r0 = r2.zza
            com.google.android.gms.internal.ads.zzfia r4 = r0.zzc(r3, r4)
            com.google.android.gms.internal.ads.zzeig r0 = new com.google.android.gms.internal.ads.zzeig
            r0.<init>()
            com.google.android.gms.internal.ads.zzegn r1 = new com.google.android.gms.internal.ads.zzegn
            r1.<init>(r4, r0, r3)
            return r1
    }
}
