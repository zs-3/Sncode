package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzggv {
    private final java.io.OutputStream zza;

    private zzggv(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzggv zzb(java.io.OutputStream r1) {
            com.google.android.gms.internal.ads.zzggv r0 = new com.google.android.gms.internal.ads.zzggv
            r0.<init>(r1)
            return r0
    }

    public final void zza(com.google.android.gms.internal.ads.zzgwn r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.zza     // Catch: java.lang.Throwable -> Lb
            r2.zzaU(r0)     // Catch: java.lang.Throwable -> Lb
            java.io.OutputStream r2 = r1.zza
            r2.close()
            return
        Lb:
            r2 = move-exception
            java.io.OutputStream r0 = r1.zza
            r0.close()
            throw r2
    }
}
