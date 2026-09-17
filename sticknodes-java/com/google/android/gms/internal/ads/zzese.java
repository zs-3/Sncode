package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzese implements com.google.android.gms.internal.ads.zzexg {
    private final org.json.JSONObject zza;
    private final org.json.JSONObject zzb;

    public zzese(org.json.JSONObject r1, org.json.JSONObject r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            org.json.JSONObject r0 = r2.zza
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "fwd_cld"
            r3.putString(r1, r0)
        Lf:
            org.json.JSONObject r0 = r2.zzb
            if (r0 == 0) goto L1c
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "fwd_common_cld"
            r3.putString(r1, r0)
        L1c:
            return
    }
}
