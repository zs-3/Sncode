package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeuc implements com.google.android.gms.internal.ads.zzexg {
    private final java.lang.Integer zza;

    public zzeuc(java.lang.Integer r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            java.lang.Integer r0 = r2.zza
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r0 == 0) goto L15
            int r0 = r0.intValue()
            r1 = 20
            int r0 = java.lang.Math.min(r0, r1)
            java.lang.String r1 = "dspct"
            r3.putInt(r1, r0)
        L15:
            return
    }
}
