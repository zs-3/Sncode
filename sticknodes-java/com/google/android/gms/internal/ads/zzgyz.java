package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzgyz extends java.io.FilterInputStream {
    private int zza;

    zzgyz(java.io.InputStream r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zza = r2
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws java.io.IOException {
            r2 = this;
            int r0 = super.available()
            int r1 = r2.zza
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
            r3 = this;
            int r0 = r3.zza
            r1 = -1
            if (r0 > 0) goto L6
            return r1
        L6:
            int r0 = super.read()
            if (r0 < 0) goto L11
            int r2 = r3.zza
            int r2 = r2 + r1
            r3.zza = r2
        L11:
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            int r0 = r1.zza
            if (r0 > 0) goto L6
            r2 = -1
            return r2
        L6:
            int r4 = java.lang.Math.min(r4, r0)
            int r2 = super.read(r2, r3, r4)
            if (r2 < 0) goto L15
            int r3 = r1.zza
            int r3 = r3 - r2
            r1.zza = r3
        L15:
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.zza
            long r0 = (long) r0
            long r3 = java.lang.Math.min(r3, r0)
            long r3 = super.skip(r3)
            int r4 = (int) r3
            if (r4 < 0) goto L13
            int r3 = r2.zza
            int r3 = r3 - r4
            r2.zza = r3
        L13:
            long r3 = (long) r4
            return r3
    }
}
