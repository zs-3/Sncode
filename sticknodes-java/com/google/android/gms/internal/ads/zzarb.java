package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzarb extends java.io.FilterInputStream {
    private final java.net.HttpURLConnection zza;

    zzarb(java.net.HttpURLConnection r2) {
            r1 = this;
            java.io.InputStream r0 = r2.getInputStream()     // Catch: java.io.IOException -> L5
            goto L9
        L5:
            java.io.InputStream r0 = r2.getErrorStream()
        L9:
            r1.<init>(r0)
            r1.zza = r2
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
            r1 = this;
            super.close()
            java.net.HttpURLConnection r0 = r1.zza
            r0.disconnect()
            return
    }
}
