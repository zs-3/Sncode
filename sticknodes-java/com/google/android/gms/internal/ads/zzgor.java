package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgor {
    private java.util.HashMap zza;

    public zzgor() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    public final com.google.android.gms.internal.ads.zzgot zza() {
            r3 = this;
            java.util.HashMap r0 = r3.zza
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzgot r0 = new com.google.android.gms.internal.ads.zzgot
            java.util.HashMap r1 = r3.zza
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r2 = 0
            r0.<init>(r1, r2)
            r3.zza = r2
            return r0
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot call build() twice"
            r0.<init>(r1)
            throw r0
    }
}
