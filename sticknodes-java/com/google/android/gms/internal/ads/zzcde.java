package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcde implements com.google.android.gms.internal.ads.zzhhu {
    private final java.nio.ByteBuffer zza;

    zzcde(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.<init>()
            java.nio.ByteBuffer r1 = r1.duplicate()
            r0.zza = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final int zza(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.zza
            int r0 = r0.remaining()
            if (r0 != 0) goto L10
            int r0 = r4.remaining()
            if (r0 <= 0) goto L10
            r4 = -1
            return r4
        L10:
            int r0 = r4.remaining()
            java.nio.ByteBuffer r1 = r3.zza
            int r1 = r1.remaining()
            int r0 = java.lang.Math.min(r0, r1)
            byte[] r1 = new byte[r0]
            java.nio.ByteBuffer r2 = r3.zza
            r2.get(r1)
            r4.put(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final long zzb() throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.zza
            int r0 = r0.position()
            long r0 = (long) r0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final long zzc() throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.zza
            int r0 = r0.limit()
            long r0 = (long) r0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final java.nio.ByteBuffer zzd(long r2, long r4) throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.zza
            int r3 = (int) r2
            int r2 = r0.position()
            r0.position(r3)
            java.nio.ByteBuffer r3 = r1.zza
            java.nio.ByteBuffer r3 = r3.slice()
            int r5 = (int) r4
            r3.limit(r5)
            java.nio.ByteBuffer r4 = r1.zza
            r4.position(r2)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final void zze(long r2) throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.zza
            int r3 = (int) r2
            r0.position(r3)
            return
    }
}
