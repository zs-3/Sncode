package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfje {
    private final java.util.HashMap zza;

    public zzfje() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    public final com.google.android.gms.internal.ads.zzfjd zza(com.google.android.gms.internal.ads.zzfiu r2, android.content.Context r3, com.google.android.gms.internal.ads.zzfim r4, com.google.android.gms.internal.ads.zzfjk r5) {
            r1 = this;
            java.util.HashMap r0 = r1.zza
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.zzfjd r0 = (com.google.android.gms.internal.ads.zzfjd) r0
            if (r0 != 0) goto L23
            com.google.android.gms.internal.ads.zzfir r0 = new com.google.android.gms.internal.ads.zzfir
            com.google.android.gms.internal.ads.zzfix r3 = com.google.android.gms.internal.ads.zzfix.zza(r2, r3)
            r0.<init>(r3)
            com.google.android.gms.internal.ads.zzfjm r3 = new com.google.android.gms.internal.ads.zzfjm
            r3.<init>(r0, r4, r5)
            com.google.android.gms.internal.ads.zzfjd r4 = new com.google.android.gms.internal.ads.zzfjd
            r4.<init>(r0, r3)
            java.util.HashMap r3 = r1.zza
            r3.put(r2, r4)
            return r4
        L23:
            return r0
    }
}
