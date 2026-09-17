package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzapc implements com.google.android.gms.internal.ads.zzapb {
    private final java.nio.channels.FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzapc(java.nio.channels.FileChannel r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final long zza() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzb(java.security.MessageDigest[] r9, long r10, int r12) throws java.io.IOException {
            r8 = this;
            long r0 = r8.zzb
            long r4 = r0 + r10
            long r6 = (long) r12
            java.nio.channels.FileChannel r2 = r8.zza
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY
            java.nio.MappedByteBuffer r10 = r2.map(r3, r4, r6)
            r10.load()
            r11 = 0
            r12 = 0
        L12:
            int r0 = r9.length
            if (r12 >= r0) goto L20
            r0 = r9[r12]
            r10.position(r11)
            r0.update(r10)
            int r12 = r12 + 1
            goto L12
        L20:
            return
    }
}
