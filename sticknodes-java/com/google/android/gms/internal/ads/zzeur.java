package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeur implements com.google.android.gms.internal.ads.zzexg {
    private final java.lang.String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzeur(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r0 = r2.zza
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L11
            java.lang.String r0 = r2.zza
            java.lang.String r1 = "inspector_extras"
            r3.putString(r1, r0)
        L11:
            boolean r0 = r2.zzb
            java.lang.String r1 = "test_mode"
            r3.putInt(r1, r0)
            boolean r0 = r2.zzc
            java.lang.String r1 = "linked_device"
            r3.putInt(r1, r0)
            boolean r0 = r2.zzb
            if (r0 != 0) goto L27
            boolean r0 = r2.zzc
            if (r0 == 0) goto L5b
        L27:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziN
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L42
            boolean r0 = r2.zzd
            r0 = r0 ^ 1
            java.lang.String r1 = "risd"
            r3.putInt(r1, r0)
        L42:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziR
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5b
            boolean r0 = r2.zze
            java.lang.String r1 = "collect_response_logs"
            r3.putBoolean(r1, r0)
        L5b:
            return
    }
}
