package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgxv {
    public static final void zza(java.nio.ByteBuffer r3, java.nio.ByteBuffer r4, java.nio.ByteBuffer r5, int r6) {
            if (r6 < 0) goto L28
            int r0 = r4.remaining()
            if (r0 < r6) goto L28
            int r0 = r5.remaining()
            if (r0 < r6) goto L28
            int r0 = r3.remaining()
            if (r0 < r6) goto L28
            r0 = 0
        L15:
            if (r0 >= r6) goto L27
            byte r1 = r4.get()
            byte r2 = r5.get()
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r3.put(r1)
            int r0 = r0 + 1
            goto L15
        L27:
            return
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "That combination of buffers, offsets and length to xor result in out-of-bond accesses."
            r3.<init>(r4)
            throw r3
    }

    public static byte[] zzb(byte[]... r7) throws java.security.GeneralSecurityException {
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r7.length
            if (r1 >= r3) goto L1b
            r3 = r7[r1]
            int r3 = r3.length
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r4 = r4 - r3
            if (r2 > r4) goto L13
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        L13:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "exceeded size limit"
            r7.<init>(r0)
            throw r7
        L1b:
            byte[] r1 = new byte[r2]
            r2 = 0
            r4 = 0
        L1f:
            if (r2 >= r3) goto L2b
            r5 = r7[r2]
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r0, r1, r4, r6)
            int r4 = r4 + r6
            int r2 = r2 + 1
            goto L1f
        L2b:
            return r1
    }

    public static final byte[] zzc(byte[] r3, int r4, byte[] r5, int r6, int r7) {
            int r6 = r3.length
            int r6 = r6 + (-16)
            if (r6 < r4) goto L1a
            r6 = 16
            byte[] r7 = new byte[r6]
            r0 = 0
        La:
            if (r0 >= r6) goto L19
            int r1 = r0 + r4
            r1 = r3[r1]
            r2 = r5[r0]
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r7[r0] = r1
            int r0 = r0 + 1
            goto La
        L19:
            return r7
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "That combination of buffers, offsets and length to xor result in out-of-bond accesses."
            r3.<init>(r4)
            throw r3
    }
}
