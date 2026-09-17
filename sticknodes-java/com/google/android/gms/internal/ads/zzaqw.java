package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaqw extends java.io.FilterInputStream {
    private final long zza;
    private long zzb;

    zzaqw(java.io.InputStream r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zza = r2
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
            r5 = this;
            int r0 = super.read()
            r1 = -1
            if (r0 == r1) goto Le
            long r1 = r5.zzb
            r3 = 1
            long r1 = r1 + r3
            r5.zzb = r1
        Le:
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            int r3 = super.read(r3, r4, r5)
            r4 = -1
            if (r3 == r4) goto Ld
            long r4 = r2.zzb
            long r0 = (long) r3
            long r4 = r4 + r0
            r2.zzb = r4
        Ld:
            return r3
    }

    final long zza() {
            r4 = this;
            long r0 = r4.zza
            long r2 = r4.zzb
            long r0 = r0 - r2
            return r0
    }
}
