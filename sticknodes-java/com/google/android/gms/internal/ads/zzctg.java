package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzctg implements com.google.android.gms.internal.ads.zzcth {
    private final java.util.Map zza;

    zzctg(java.util.Map r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcth
    public final com.google.android.gms.internal.ads.zzegk zza(int r1, java.lang.String r2) {
            r0 = this;
            java.util.Map r1 = r0.zza
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.ads.zzegk r1 = (com.google.android.gms.internal.ads.zzegk) r1
            return r1
    }
}
