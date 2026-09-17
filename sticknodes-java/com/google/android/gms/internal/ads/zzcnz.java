package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcnz implements com.google.android.gms.internal.ads.zzcng {
    private final com.google.android.gms.internal.ads.zzbyp zza;

    zzcnz(com.google.android.gms.internal.ads.zzbyp r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcng
    public final void zza(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "timestamp"
            long r0 = r4.optLong(r0)
            java.lang.String r2 = "npa_reset"
            boolean r2 = r4.optBoolean(r2)
            if (r2 == 0) goto L10
            r4 = -1
            goto L16
        L10:
            java.lang.String r2 = "npa"
            boolean r4 = r4.optBoolean(r2)
        L16:
            com.google.android.gms.internal.ads.zzbyp r2 = r3.zza
            r2.zzb(r4, r0)
            return
    }
}
