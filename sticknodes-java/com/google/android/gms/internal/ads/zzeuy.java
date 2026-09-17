package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeuy implements com.google.android.gms.internal.ads.zzexg {
    public final com.google.android.gms.internal.ads.zzfgg zza;

    public zzeuy(com.google.android.gms.internal.ads.zzfgg r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            android.os.Bundle r3 = (android.os.Bundle) r3
            com.google.android.gms.internal.ads.zzfgg r0 = r2.zza
            if (r0 == 0) goto L2e
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzly
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2e
            com.google.android.gms.internal.ads.zzfgg r0 = r2.zza
            boolean r0 = r0.zzd()
            java.lang.String r1 = "render_in_browser"
            r3.putBoolean(r1, r0)
            com.google.android.gms.internal.ads.zzfgg r0 = r2.zza
            boolean r0 = r0.zzc()
            java.lang.String r1 = "disable_ml"
            r3.putBoolean(r1, r0)
        L2e:
            return
    }
}
