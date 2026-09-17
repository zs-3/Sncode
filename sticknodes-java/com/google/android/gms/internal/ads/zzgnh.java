package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgnh {
    int[] zza;
    private final int zzb;

    public zzgnh(byte[] r3, int r4) throws java.security.InvalidKeyException {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 32
            if (r0 != r1) goto L11
            int[] r3 = com.google.android.gms.internal.ads.zzgnf.zze(r3)
            r2.zza = r3
            r2.zzb = r4
            return
        L11:
            java.security.InvalidKeyException r3 = new java.security.InvalidKeyException
            java.lang.String r4 = "The key length in bytes must be 32."
            r3.<init>(r4)
            throw r3
    }

    abstract int zza();

    abstract int[] zzb(int[] r1, int r2);

    final java.nio.ByteBuffer zzc(byte[] r5, int r6) {
            r4 = this;
            int[] r5 = com.google.android.gms.internal.ads.zzgnf.zze(r5)
            int[] r5 = r4.zzb(r5, r6)
            java.lang.Object r6 = r5.clone()
            int[] r6 = (int[]) r6
            com.google.android.gms.internal.ads.zzgnf.zzc(r6)
            r0 = 0
            r1 = 0
        L13:
            r2 = 16
            if (r1 >= r2) goto L21
            r2 = r5[r1]
            r3 = r6[r1]
            int r2 = r2 + r3
            r5[r1] = r2
            int r1 = r1 + 1
            goto L13
        L21:
            r6 = 64
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r6 = r6.order(r1)
            java.nio.IntBuffer r1 = r6.asIntBuffer()
            r1.put(r5, r0, r2)
            return r6
    }

    public final byte[] zzd(byte[] r8, java.nio.ByteBuffer r9) throws java.security.GeneralSecurityException {
            r7 = this;
            int r0 = r9.remaining()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r8.length
            int r2 = r7.zza()
            if (r1 != r2) goto L38
            int r1 = r9.remaining()
            int r2 = r1 / 64
            r3 = 0
        L16:
            int r4 = r2 + 1
            if (r3 >= r4) goto L33
            int r5 = r7.zzb
            int r5 = r5 + r3
            java.nio.ByteBuffer r5 = r7.zzc(r8, r5)
            int r4 = r4 + (-1)
            r6 = 64
            if (r3 != r4) goto L2d
            int r4 = r1 % 64
            com.google.android.gms.internal.ads.zzgxv.zza(r0, r9, r5, r4)
            goto L30
        L2d:
            com.google.android.gms.internal.ads.zzgxv.zza(r0, r9, r5, r6)
        L30:
            int r3 = r3 + 1
            goto L16
        L33:
            byte[] r8 = r0.array()
            return r8
        L38:
            int r8 = r7.zza()
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The nonce length (in bytes) must be "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
    }
}
