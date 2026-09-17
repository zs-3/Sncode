package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbab extends com.google.android.gms.internal.ads.zzazw {
    private java.security.MessageDigest zzb;

    public zzbab() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzazw
    public final byte[] zzb(java.lang.String r9) {
            r8 = this;
            java.lang.String r0 = " "
            java.lang.String[] r9 = r9.split(r0)
            int r0 = r9.length
            r1 = 4
            r2 = 1
            r3 = 0
            if (r0 != r2) goto L23
            r9 = r9[r3]
            int r9 = com.google.android.gms.internal.ads.zzbaa.zza(r9)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r2)
            r0.putInt(r9)
            byte[] r9 = r0.array()
            goto L70
        L23:
            r4 = 5
            if (r0 >= r4) goto L4e
            int r0 = r0 + r0
            byte[] r0 = new byte[r0]
            r4 = 0
        L2a:
            int r5 = r9.length
            if (r4 >= r5) goto L6f
            r5 = r9[r4]
            int r5 = com.google.android.gms.internal.ads.zzbaa.zza(r5)
            char r6 = (char) r5
            int r5 = r5 >> 16
            r5 = r5 ^ r6
            byte r6 = (byte) r5
            r7 = 2
            byte[] r7 = new byte[r7]
            r7[r3] = r6
            int r5 = r5 >> 8
            byte r5 = (byte) r5
            r7[r2] = r5
            r6 = r7[r3]
            int r7 = r4 + r4
            r0[r7] = r6
            int r7 = r7 + r2
            r0[r7] = r5
            int r4 = r4 + 1
            goto L2a
        L4e:
            byte[] r0 = new byte[r0]
            r2 = 0
        L51:
            int r4 = r9.length
            if (r2 >= r4) goto L6f
            r4 = r9[r2]
            int r4 = com.google.android.gms.internal.ads.zzbaa.zza(r4)
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r4 >> 8
            int r7 = r4 >> 16
            int r4 = r4 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r6
            r6 = r7 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r6
            r4 = r4 ^ r5
            byte r4 = (byte) r4
            r0[r2] = r4
            int r2 = r2 + 1
            goto L51
        L6f:
            r9 = r0
        L70:
            java.security.MessageDigest r0 = r8.zza()
            r8.zzb = r0
            java.lang.Object r0 = r8.zza
            monitor-enter(r0)
            java.security.MessageDigest r2 = r8.zzb     // Catch: java.lang.Throwable -> L9b
            if (r2 != 0) goto L81
            byte[] r9 = new byte[r3]     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            return r9
        L81:
            r2.reset()     // Catch: java.lang.Throwable -> L9b
            java.security.MessageDigest r2 = r8.zzb     // Catch: java.lang.Throwable -> L9b
            r2.update(r9)     // Catch: java.lang.Throwable -> L9b
            java.security.MessageDigest r9 = r8.zzb     // Catch: java.lang.Throwable -> L9b
            byte[] r9 = r9.digest()     // Catch: java.lang.Throwable -> L9b
            int r2 = r9.length     // Catch: java.lang.Throwable -> L9b
            if (r2 <= r1) goto L93
            goto L94
        L93:
            r1 = r2
        L94:
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L9b
            java.lang.System.arraycopy(r9, r3, r2, r3, r1)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            return r2
        L9b:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r9
    }
}
