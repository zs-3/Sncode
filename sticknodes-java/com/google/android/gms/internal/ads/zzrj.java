package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzrj {
    private static final byte[] zza = null;
    private static final byte[] zzb = null;
    private java.nio.ByteBuffer zzc;
    private int zzd;
    private int zze;

    static {
            r0 = 47
            byte[] r0 = new byte[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0} // fill-array
            com.google.android.gms.internal.ads.zzrj.zza = r0
            r0 = 44
            byte[] r0 = new byte[r0]
            r0 = {x0030: FILL_ARRAY_DATA , data: [79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            com.google.android.gms.internal.ads.zzrj.zzb = r0
            return
    }

    public zzrj() {
            r1 = this;
            r1.<init>()
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzct.zza
            r1.zzc = r0
            r0 = 0
            r1.zze = r0
            r0 = 2
            r1.zzd = r0
            return
    }

    private static final void zzc(java.nio.ByteBuffer r2, long r3, int r5, int r6, boolean r7) {
            r0 = 79
            r2.put(r0)
            r0 = 103(0x67, float:1.44E-43)
            r2.put(r0)
            r2.put(r0)
            r0 = 83
            r2.put(r0)
            r0 = 0
            r2.put(r0)
            r1 = 1
            if (r1 == r7) goto L1b
            r7 = 0
            goto L1c
        L1b:
            r7 = 2
        L1c:
            r2.put(r7)
            r2.putLong(r3)
            r2.putInt(r0)
            r2.putInt(r5)
            r2.putInt(r0)
            long r3 = (long) r6
            byte r3 = com.google.android.gms.internal.ads.zzgdx.zza(r3)
            r2.put(r3)
            return
    }

    public final void zza(com.google.android.gms.internal.ads.zzhq r22, java.util.List r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            java.nio.ByteBuffer r2 = r1.zzc
            java.util.Objects.requireNonNull(r2)
            int r2 = r2.limit()
            java.nio.ByteBuffer r3 = r1.zzc
            int r3 = r3.position()
            int r2 = r2 - r3
            if (r2 != 0) goto L17
            return
        L17:
            int r2 = r0.zzd
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 != r5) goto L35
            int r2 = r23.size()
            if (r2 == r4) goto L2c
            int r2 = r23.size()
            r7 = 3
            if (r2 != r7) goto L35
        L2c:
            r2 = r23
            java.lang.Object r2 = r2.get(r6)
            r3 = r2
            byte[] r3 = (byte[]) r3
        L35:
            java.nio.ByteBuffer r2 = r1.zzc
            int r7 = r2.position()
            int r8 = r2.limit()
            int r9 = r8 - r7
            int r10 = r0.zzd
            int r11 = r9 + 255
            r12 = 255(0xff, float:3.57E-43)
            int r11 = r11 / r12
            int r13 = r11 + 27
            int r13 = r13 + r9
            if (r10 != r5) goto L59
            if (r3 == 0) goto L53
            int r10 = r3.length
            int r10 = r10 + 28
            goto L55
        L53:
            r10 = 47
        L55:
            int r14 = r10 + 44
            int r13 = r13 + r14
            goto L5a
        L59:
            r10 = 0
        L5a:
            java.nio.ByteBuffer r14 = r0.zzc
            int r14 = r14.capacity()
            if (r14 >= r13) goto L6f
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.allocate(r13)
            java.nio.ByteOrder r14 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r13 = r13.order(r14)
            r0.zzc = r13
            goto L74
        L6f:
            java.nio.ByteBuffer r13 = r0.zzc
            r13.clear()
        L74:
            java.nio.ByteBuffer r13 = r0.zzc
            int r14 = r0.zzd
            r15 = 22
            if (r14 != r5) goto Lc1
            if (r3 == 0) goto Lb7
            r16 = 0
            r18 = 0
            r19 = 1
            r20 = 1
            r14 = r13
            r4 = 22
            r15 = r16
            r17 = r18
            r18 = r19
            r19 = r20
            zzc(r14, r15, r17, r18, r19)
            int r14 = r3.length
            long r4 = (long) r14
            byte r4 = com.google.android.gms.internal.ads.zzgdx.zza(r4)
            r13.put(r4)
            r13.put(r3)
            byte[] r3 = r13.array()
            int r4 = r13.arrayOffset()
            int r14 = r14 + 28
            int r3 = com.google.android.gms.internal.ads.zzeu.zze(r3, r4, r14, r6)
            r4 = 22
            r13.putInt(r4, r3)
            r13.position(r14)
            goto Lbc
        Lb7:
            byte[] r3 = com.google.android.gms.internal.ads.zzrj.zza
            r13.put(r3)
        Lbc:
            byte[] r3 = com.google.android.gms.internal.ads.zzrj.zzb
            r13.put(r3)
        Lc1:
            int r3 = com.google.android.gms.internal.ads.zzadw.zzc(r2)
            int r4 = r0.zze
            int r4 = r4 + r3
            r0.zze = r4
            int r3 = r0.zzd
            long r14 = (long) r4
            r18 = 0
            r4 = r13
            r16 = r3
            r17 = r11
            zzc(r13, r14, r16, r17, r18)
            r3 = 0
        Ld8:
            if (r3 >= r11) goto Leb
            if (r9 < r12) goto Le3
            r5 = -1
            r4.put(r5)
            int r9 = r9 + (-255)
            goto Le8
        Le3:
            byte r5 = (byte) r9
            r4.put(r5)
            r9 = 0
        Le8:
            int r3 = r3 + 1
            goto Ld8
        Leb:
            if (r7 >= r8) goto Lf7
            byte r3 = r2.get(r7)
            r4.put(r3)
            int r7 = r7 + 1
            goto Leb
        Lf7:
            int r3 = r2.limit()
            r2.position(r3)
            r4.flip()
            int r2 = r0.zzd
            r3 = 2
            if (r2 != r3) goto L124
            byte[] r2 = r4.array()
            int r3 = r4.arrayOffset()
            int r3 = r3 + r10
            int r3 = r3 + 44
            int r5 = r4.limit()
            int r7 = r4.position()
            int r5 = r5 - r7
            int r2 = com.google.android.gms.internal.ads.zzeu.zze(r2, r3, r5, r6)
            int r10 = r10 + 66
            r4.putInt(r10, r2)
            goto L13e
        L124:
            byte[] r2 = r4.array()
            int r3 = r4.arrayOffset()
            int r5 = r4.limit()
            int r7 = r4.position()
            int r5 = r5 - r7
            int r2 = com.google.android.gms.internal.ads.zzeu.zze(r2, r3, r5, r6)
            r3 = 22
            r4.putInt(r3, r2)
        L13e:
            int r2 = r0.zzd
            r3 = 1
            int r2 = r2 + r3
            r0.zzd = r2
            r0.zzc = r4
            r22.zzb()
            java.nio.ByteBuffer r2 = r0.zzc
            int r2 = r2.remaining()
            r1.zzj(r2)
            java.nio.ByteBuffer r2 = r1.zzc
            java.nio.ByteBuffer r3 = r0.zzc
            r2.put(r3)
            r22.zzk()
            return
    }

    public final void zzb() {
            r1 = this;
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzct.zza
            r1.zzc = r0
            r0 = 0
            r1.zze = r0
            r0 = 2
            r1.zzd = r0
            return
    }
}
