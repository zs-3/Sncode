package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzuk {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private com.google.android.gms.internal.ads.zzgf zzc;

    public zzuk(com.google.android.gms.internal.ads.zzadg r1, com.google.android.gms.internal.ads.zzakt r2) {
            r0 = this;
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zza = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzb = r1
            return
    }

    public final void zza(com.google.android.gms.internal.ads.zzgf r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgf r0 = r1.zzc
            if (r2 == r0) goto L10
            r1.zzc = r2
            java.util.Map r2 = r1.zza
            r2.clear()
            java.util.Map r2 = r1.zzb
            r2.clear()
        L10:
            return
    }
}
