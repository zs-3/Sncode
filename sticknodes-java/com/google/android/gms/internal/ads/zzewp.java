package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzewp implements com.google.android.gms.internal.ads.zzexg {
    private final java.lang.String zza;

    public zzewp(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            java.lang.String r0 = r2.zza
            android.os.Bundle r3 = (android.os.Bundle) r3
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.String r0 = r2.zza
            java.lang.String r1 = "query_info"
            r3.putString(r1, r0)
            return
    }
}
