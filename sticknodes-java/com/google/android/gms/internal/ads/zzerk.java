package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzerk implements com.google.android.gms.internal.ads.zzexg {
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final boolean zzj;

    public zzerk(int r1, boolean r2, boolean r3, int r4, int r5, int r6, int r7, int r8, float r9, boolean r10) {
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
            r0.zzi = r9
            r0.zzj = r10
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            android.os.Bundle r3 = (android.os.Bundle) r3
            int r0 = r2.zza
            java.lang.String r1 = "am"
            r3.putInt(r1, r0)
            boolean r0 = r2.zzb
            java.lang.String r1 = "ma"
            r3.putBoolean(r1, r0)
            boolean r0 = r2.zzc
            java.lang.String r1 = "sp"
            r3.putBoolean(r1, r0)
            int r0 = r2.zzd
            java.lang.String r1 = "muv"
            r3.putInt(r1, r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkD
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3e
            int r0 = r2.zze
            java.lang.String r1 = "muv_min"
            r3.putInt(r1, r0)
            int r0 = r2.zzf
            java.lang.String r1 = "muv_max"
            r3.putInt(r1, r0)
        L3e:
            int r0 = r2.zzg
            java.lang.String r1 = "rm"
            r3.putInt(r1, r0)
            int r0 = r2.zzh
            java.lang.String r1 = "riv"
            r3.putInt(r1, r0)
            float r0 = r2.zzi
            java.lang.String r1 = "android_app_volume"
            r3.putFloat(r1, r0)
            boolean r0 = r2.zzj
            java.lang.String r1 = "android_app_muted"
            r3.putBoolean(r1, r0)
            return
    }
}
