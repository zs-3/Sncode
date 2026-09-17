package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzggu {
    private final java.io.InputStream zza;

    private zzggu(java.io.InputStream r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzggu zzb(byte[] r2) {
            com.google.android.gms.internal.ads.zzggu r0 = new com.google.android.gms.internal.ads.zzggu
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgwn zza() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.zza     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.zzhao r1 = com.google.android.gms.internal.ads.zzhao.zza()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.zzgwn r0 = com.google.android.gms.internal.ads.zzgwn.zzg(r0, r1)     // Catch: java.lang.Throwable -> L10
            java.io.InputStream r1 = r2.zza
            r1.close()
            return r0
        L10:
            r0 = move-exception
            java.io.InputStream r1 = r2.zza
            r1.close()
            throw r0
    }
}
