package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbbn extends java.io.PushbackInputStream {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbo zza;

    zzbbn(com.google.android.gms.internal.ads.zzbbo r1, java.io.InputStream r2, int r3) {
            r0 = this;
            r0.zza = r1
            r1 = 1
            r0.<init>(r2, r1)
            return
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbbo r0 = r1.zza     // Catch: java.lang.Throwable -> Ld
            com.google.android.gms.internal.ads.zzbbq r0 = r0.zzc     // Catch: java.lang.Throwable -> Ld
            com.google.android.gms.internal.ads.zzbbq.zze(r0)     // Catch: java.lang.Throwable -> Ld
            super.close()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
