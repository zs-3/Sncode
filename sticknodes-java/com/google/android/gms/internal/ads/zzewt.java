package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzewt implements com.google.android.gms.internal.ads.zzexg {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final java.lang.String zzd;
    public final java.lang.Long zze;

    public zzewt(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.Long r5) {
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
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r4) {
            r3 = this;
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r0 = r3.zza
            java.lang.String r1 = "gmp_app_id"
            com.google.android.gms.internal.ads.zzfhq.zzc(r4, r1, r0)
            java.lang.String r0 = r3.zzb
            java.lang.String r1 = "fbs_aiid"
            com.google.android.gms.internal.ads.zzfhq.zzc(r4, r1, r0)
            java.lang.String r0 = r3.zzc
            java.lang.String r1 = "fbs_aeid"
            com.google.android.gms.internal.ads.zzfhq.zzc(r4, r1, r0)
            java.lang.String r0 = r3.zzd
            java.lang.String r1 = "apm_id_origin"
            com.google.android.gms.internal.ads.zzfhq.zzc(r4, r1, r0)
            java.lang.Long r0 = r3.zze
            if (r0 == 0) goto L2b
            long r0 = r0.longValue()
            java.lang.String r2 = "sai_timeout"
            r4.putLong(r2, r0)
        L2b:
            return
    }
}
