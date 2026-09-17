package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzepa implements com.google.android.gms.internal.ads.zzexg {
    private final boolean zza;

    public zzepa(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r2.zza
            android.os.Bundle r3 = (android.os.Bundle) r3
            r1 = 1
            if (r1 == r0) goto La
            java.lang.String r0 = "0"
            goto Lc
        La:
            java.lang.String r0 = "1"
        Lc:
            java.lang.String r1 = "adid_p"
            r3.putString(r1, r0)
            return
    }
}
