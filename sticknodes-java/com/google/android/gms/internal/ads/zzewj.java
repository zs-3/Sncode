package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzewj implements com.google.android.gms.internal.ads.zzexg {
    private final java.lang.String zza;
    private final android.os.Bundle zzb;

    public zzewj(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r0 = r2.zza
            java.lang.String r1 = "rtb"
            r3.putString(r1, r0)
            android.os.Bundle r0 = r2.zzb
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L18
            android.os.Bundle r0 = r2.zzb
            java.lang.String r1 = "adapter_initialization_status"
            r3.putBundle(r1, r0)
        L18:
            return
    }
}
