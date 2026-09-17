package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzety implements com.google.android.gms.internal.ads.zzexg {
    public final java.lang.String zza;
    public final boolean zzb;

    public zzety(java.lang.String r1, boolean r2) {
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
            java.lang.String r0 = r2.zza
            java.lang.String r1 = "gct"
            r3.putString(r1, r0)
            boolean r0 = r2.zzb
            if (r0 == 0) goto L14
            java.lang.String r0 = "de"
            java.lang.String r1 = "1"
            r3.putString(r0, r1)
        L14:
            return
    }
}
