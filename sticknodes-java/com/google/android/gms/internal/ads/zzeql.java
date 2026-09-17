package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeql implements com.google.android.gms.internal.ads.zzexg {
    private final java.lang.String zza;
    private final boolean zzb;

    public zzeql(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            java.lang.String r0 = r2.zza
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r0 == 0) goto L1a
            java.lang.String r0 = "pii"
            android.os.Bundle r3 = com.google.android.gms.internal.ads.zzfhq.zza(r3, r0)
            java.lang.String r0 = r2.zza
            java.lang.String r1 = "afai"
            r3.putString(r1, r0)
            boolean r0 = r2.zzb
            java.lang.String r1 = "is_afai_lat"
            r3.putBoolean(r1, r0)
        L1a:
            return
    }
}
