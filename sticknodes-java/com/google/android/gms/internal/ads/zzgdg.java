package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgdg extends java.io.FilterInputStream {
    private long zza;
    private long zzb;

    zzgdg(java.io.InputStream r3, long r4) {
            r2 = this;
            r2.<init>(r3)
            r0 = -1
            r2.zzb = r0
            java.util.Objects.requireNonNull(r3)
            r0 = 0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 < 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            java.lang.String r0 = "limit must be non-negative"
            com.google.android.gms.internal.ads.zzfxz.zzf(r3, r0)
            r2.zza = r4
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws java.io.IOException {
            r4 = this;
            java.io.InputStream r0 = r4.in
            int r0 = r0.available()
            long r0 = (long) r0
            long r2 = r4.zza
            long r0 = java.lang.Math.min(r0, r2)
            int r1 = (int) r0
            return r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int r3) {
            r2 = this;
            monitor-enter(r2)
            java.io.InputStream r0 = r2.in     // Catch: java.lang.Throwable -> Lc
            r0.mark(r3)     // Catch: java.lang.Throwable -> Lc
            long r0 = r2.zza     // Catch: java.lang.Throwable -> Lc
            r2.zzb = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
            r6 = this;
            long r0 = r6.zza
            r2 = -1
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto La
            return r2
        La:
            java.io.InputStream r0 = r6.in
            int r0 = r0.read()
            if (r0 == r2) goto L19
            long r1 = r6.zza
            r3 = -1
            long r1 = r1 + r3
            r6.zza = r1
        L19:
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            long r0 = r6.zza
            r2 = -1
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto La
            return r2
        La:
            long r3 = (long) r9
            long r0 = java.lang.Math.min(r3, r0)
            int r9 = (int) r0
            java.io.InputStream r0 = r6.in
            int r7 = r0.read(r7, r8, r9)
            if (r7 == r2) goto L1e
            long r8 = r6.zza
            long r0 = (long) r7
            long r8 = r8 - r0
            r6.zza = r8
        L1e:
            return r7
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            java.io.InputStream r0 = r5.in     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.markSupported()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L24
            long r0 = r5.zzb     // Catch: java.lang.Throwable -> L2c
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c
            java.io.InputStream r0 = r5.in     // Catch: java.lang.Throwable -> L2c
            r0.reset()     // Catch: java.lang.Throwable -> L2c
            long r0 = r5.zzb     // Catch: java.lang.Throwable -> L2c
            r5.zza = r0     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r5)
            return
        L1c:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "Mark not set"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L24:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "Mark not supported"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long r3) throws java.io.IOException {
            r2 = this;
            long r0 = r2.zza
            long r3 = java.lang.Math.min(r3, r0)
            java.io.InputStream r0 = r2.in
            long r3 = r0.skip(r3)
            long r0 = r2.zza
            long r0 = r0 - r3
            r2.zza = r0
            return r3
    }
}
