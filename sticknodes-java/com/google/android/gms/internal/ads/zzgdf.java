package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgdf extends java.io.OutputStream {
    zzgdf() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "ByteStreams.nullOutputStream()"
            return r0
    }

    @Override // java.io.OutputStream
    public final void write(int r1) {
            r0 = this;
            return
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            return
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r1, int r2, int r3) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            int r3 = r3 + r2
            int r1 = r1.length
            com.google.android.gms.internal.ads.zzfxz.zzi(r2, r3, r1)
            return
    }
}
