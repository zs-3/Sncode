package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzetp implements com.google.android.gms.internal.ads.zzexg {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.os.Bundle zzc;

    /* synthetic */ zzetp(java.lang.String r1, java.lang.String r2, android.os.Bundle r3, com.google.android.gms.internal.ads.zzeto r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r0 = r2.zza
            java.lang.String r1 = "consent_string"
            r3.putString(r1, r0)
            java.lang.String r0 = r2.zzb
            java.lang.String r1 = "fc_consent"
            r3.putString(r1, r0)
            android.os.Bundle r0 = r2.zzc
            java.lang.String r1 = "iab_consent_info"
            r3.putBundle(r1, r0)
            return
    }
}
