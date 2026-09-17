package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzewx implements com.google.android.gms.internal.ads.zzexg {
    public final boolean zza;
    public final boolean zzb;
    public final java.lang.String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final java.lang.String zzh;

    zzewx(boolean r1, boolean r2, java.lang.String r3, boolean r4, int r5, int r6, int r7, java.lang.String r8) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r5) {
            r4 = this;
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r0 = r4.zzc
            java.lang.String r1 = "js"
            r5.putString(r1, r0)
            java.lang.String r0 = "is_nonagon"
            r1 = 1
            r5.putBoolean(r0, r1)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdH
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "extra_caps"
            r5.putString(r1, r0)
            int r0 = r4.zze
            java.lang.String r1 = "target_api"
            r5.putInt(r1, r0)
            int r0 = r4.zzf
            java.lang.String r1 = "dv"
            r5.putInt(r1, r0)
            int r0 = r4.zzg
            java.lang.String r1 = "lv"
            r5.putInt(r1, r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfJ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
            java.lang.String r0 = r4.zzh
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L56
            java.lang.String r0 = r4.zzh
            java.lang.String r1 = "ev"
            r5.putString(r1, r0)
        L56:
            java.lang.String r0 = "sdk_env"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.zzfhq.zza(r5, r0)
            com.google.android.gms.internal.ads.zzbeb r2 = com.google.android.gms.internal.ads.zzber.zzc
            java.lang.Object r2 = r2.zze()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.String r3 = "mf"
            r1.putBoolean(r3, r2)
            boolean r2 = r4.zza
            java.lang.String r3 = "instant_app"
            r1.putBoolean(r3, r2)
            boolean r2 = r4.zzb
            java.lang.String r3 = "lite"
            r1.putBoolean(r3, r2)
            boolean r2 = r4.zzd
            java.lang.String r3 = "is_privileged_process"
            r1.putBoolean(r3, r2)
            r5.putBundle(r0, r1)
            java.lang.String r5 = "build_meta"
            android.os.Bundle r0 = com.google.android.gms.internal.ads.zzfhq.zza(r1, r5)
            java.lang.String r2 = "cl"
            java.lang.String r3 = "679313570"
            r0.putString(r2, r3)
            java.lang.String r2 = "rapid_rc"
            java.lang.String r3 = "dev"
            r0.putString(r2, r3)
            java.lang.String r2 = "rapid_rollup"
            java.lang.String r3 = "HEAD"
            r0.putString(r2, r3)
            r1.putBundle(r5, r0)
            return
    }
}
