package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcpx implements com.google.android.gms.internal.ads.zzhii {
    private final com.google.android.gms.internal.ads.zzhja zza;

    public zzcpx(com.google.android.gms.internal.ads.zzhja r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhja r0 = r2.zza
            com.google.android.gms.internal.ads.zzctv r0 = (com.google.android.gms.internal.ads.zzctv) r0
            com.google.android.gms.internal.ads.zzfgh r0 = r0.zza()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L10
            java.lang.String r0 = r0.zzz     // Catch: org.json.JSONException -> L10
            r1.<init>(r0)     // Catch: org.json.JSONException -> L10
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }
}
