package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzevt implements com.google.android.gms.internal.ads.zzexg {
    private final android.os.Bundle zza;

    public zzevt(android.os.Bundle r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r2) {
            r1 = this;
            android.os.Bundle r2 = (android.os.Bundle) r2
            android.os.Bundle r0 = r1.zza
            if (r0 == 0) goto L9
            r2.putAll(r0)
        L9:
            return
    }
}
