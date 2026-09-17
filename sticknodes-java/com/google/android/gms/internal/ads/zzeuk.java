package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeuk implements com.google.android.gms.internal.ads.zzexg {
    private final java.lang.Boolean zza;

    public zzeuk(java.lang.Boolean r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            java.lang.Boolean r0 = r2.zza
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r0 == 0) goto Lf
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "hw_accel"
            r3.putBoolean(r1, r0)
        Lf:
            return
    }
}
