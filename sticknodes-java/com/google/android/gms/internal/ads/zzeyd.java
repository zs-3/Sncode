package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeyd implements com.google.android.gms.internal.ads.zzexg {
    final java.lang.String zza;
    final int zzb;

    /* synthetic */ zzeyd(java.lang.String r1, int r2, com.google.android.gms.internal.ads.zzeyc r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            android.os.Bundle r3 = (android.os.Bundle) r3
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjZ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2d
            java.lang.String r0 = r2.zza
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = r2.zza
            java.lang.String r1 = "topics"
            r3.putString(r1, r0)
        L23:
            int r0 = r2.zzb
            r1 = -1
            if (r0 == r1) goto L2d
            java.lang.String r1 = "atps"
            r3.putInt(r1, r0)
        L2d:
            return
    }
}
