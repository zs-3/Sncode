package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeuv implements com.google.android.gms.internal.ads.zzexg {
    public final android.os.Bundle zza;

    public zzeuv(android.os.Bundle r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r5) {
            r4 = this;
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r0 = "device"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.zzfhq.zza(r5, r0)
            android.os.Bundle r2 = r4.zza
            java.lang.String r3 = "android_mem_info"
            r1.putBundle(r3, r2)
            r5.putBundle(r0, r1)
            return
    }
}
