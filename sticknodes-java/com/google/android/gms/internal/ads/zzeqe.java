package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeqe implements com.google.android.gms.internal.ads.zzexg {
    private final android.os.Bundle zza;

    zzeqe(android.os.Bundle r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            android.os.Bundle r0 = r2.zza
            android.os.Bundle r3 = (android.os.Bundle) r3
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L11
            android.os.Bundle r0 = r2.zza
            java.lang.String r1 = "installed_adapter_data"
            r3.putBundle(r1, r0)
        L11:
            return
    }
}
