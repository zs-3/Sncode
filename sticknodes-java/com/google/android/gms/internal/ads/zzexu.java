package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzexu implements com.google.android.gms.internal.ads.zzexg {
    public final java.lang.String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzexu(java.lang.String r1, int r2, int r3, int r4, boolean r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r5) {
            r4 = this;
            java.lang.String r0 = r4.zza
            android.os.Bundle r5 = (android.os.Bundle) r5
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = r4.zza
            java.lang.String r3 = "carrier"
            com.google.android.gms.internal.ads.zzfhq.zzf(r5, r3, r2, r0)
            int r0 = r4.zzb
            r2 = -2
            if (r0 == r2) goto L17
            goto L18
        L17:
            r1 = 0
        L18:
            java.lang.String r2 = "cnt"
            com.google.android.gms.internal.ads.zzfhq.zze(r5, r2, r0, r1)
            int r0 = r4.zzc
            java.lang.String r1 = "gnt"
            r5.putInt(r1, r0)
            int r0 = r4.zzd
            java.lang.String r1 = "pt"
            r5.putInt(r1, r0)
            java.lang.String r0 = "device"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.zzfhq.zza(r5, r0)
            r5.putBundle(r0, r1)
            java.lang.String r5 = "network"
            android.os.Bundle r0 = com.google.android.gms.internal.ads.zzfhq.zza(r1, r5)
            r1.putBundle(r5, r0)
            int r5 = r4.zzf
            java.lang.String r1 = "active_network_state"
            r0.putInt(r1, r5)
            boolean r5 = r4.zze
            java.lang.String r1 = "active_network_metered"
            r0.putBoolean(r1, r5)
            return
    }
}
