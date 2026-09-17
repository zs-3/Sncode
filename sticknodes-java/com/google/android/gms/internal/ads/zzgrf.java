package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgrf extends java.lang.RuntimeException {
    public zzgrf(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public zzgrf(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public zzgrf(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static java.lang.Object zza(com.google.android.gms.internal.ads.zzgre r1) {
            java.lang.Object r1 = r1.zza()     // Catch: java.lang.Exception -> L5
            return r1
        L5:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzgrf r0 = new com.google.android.gms.internal.ads.zzgrf
            r0.<init>(r1)
            throw r0
    }
}
