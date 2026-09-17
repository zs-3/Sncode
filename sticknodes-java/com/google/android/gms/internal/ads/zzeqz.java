package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeqz implements com.google.android.gms.internal.ads.zzexg {
    final java.lang.String zza;
    final int zzb;

    public zzeqz(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            java.lang.String r0 = r2.zza
            android.os.Bundle r3 = (android.os.Bundle) r3
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L27
            int r0 = r2.zzb
            r1 = -1
            if (r0 != r1) goto L10
            goto L27
        L10:
            java.lang.String r0 = "pii"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.zzfhq.zza(r3, r0)
            r3.putBundle(r0, r1)
            java.lang.String r3 = r2.zza
            java.lang.String r0 = "pvid"
            r1.putString(r0, r3)
            int r3 = r2.zzb
            java.lang.String r0 = "pvid_s"
            r1.putInt(r0, r3)
        L27:
            return
    }
}
