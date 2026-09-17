package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeqp implements com.google.android.gms.internal.ads.zzexg {
    private final com.google.android.gms.ads.internal.client.zzy zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final boolean zzc;

    public zzeqp(com.google.android.gms.ads.internal.client.zzy r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r4) {
            r3 = this;
            android.os.Bundle r4 = (android.os.Bundle) r4
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfg
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r3.zzb
            int r1 = r1.clientJarVersion
            if (r1 < r0) goto L1f
            java.lang.String r0 = "app_open_version"
            java.lang.String r1 = "2"
            r4.putString(r0, r1)
        L1f:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfh
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L38
            boolean r0 = r3.zzc
            java.lang.String r1 = "app_switched"
            r4.putBoolean(r1, r0)
        L38:
            com.google.android.gms.ads.internal.client.zzy r0 = r3.zza
            if (r0 == 0) goto L51
            int r0 = r0.zza
            r1 = 1
            java.lang.String r2 = "avo"
            if (r0 != r1) goto L49
            java.lang.String r0 = "p"
            r4.putString(r2, r0)
            return
        L49:
            r1 = 2
            if (r0 != r1) goto L51
            java.lang.String r0 = "l"
            r4.putString(r2, r0)
        L51:
            return
    }
}
