package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzerr implements com.google.android.gms.internal.ads.zzexg {
    private final double zza;
    private final boolean zzb;

    public zzerr(double r1, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r4) {
            r3 = this;
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r0 = "device"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.zzfhq.zza(r4, r0)
            r4.putBundle(r0, r1)
            java.lang.String r4 = "battery"
            android.os.Bundle r0 = com.google.android.gms.internal.ads.zzfhq.zza(r1, r4)
            r1.putBundle(r4, r0)
            boolean r4 = r3.zzb
            java.lang.String r1 = "is_charging"
            r0.putBoolean(r1, r4)
            double r1 = r3.zza
            java.lang.String r4 = "battery_level"
            r0.putDouble(r4, r1)
            return
    }
}
