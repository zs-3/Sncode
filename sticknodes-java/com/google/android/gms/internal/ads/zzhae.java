package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzhae extends com.google.android.gms.internal.ads.zzhaj {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    zzhae(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            if (r2 < 0) goto L14
            r0 = 20
            int r2 = java.lang.Math.max(r2, r0)
            byte[] r2 = new byte[r2]
            r1.zza = r2
            int r2 = r2.length
            r1.zzb = r2
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bufferSize must be >= 0"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final int zzb() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer."
            r0.<init>(r1)
            throw r0
    }

    final void zzc(byte r3) {
            r2 = this;
            int r0 = r2.zzc
            int r1 = r0 + 1
            r2.zzc = r1
            byte[] r1 = r2.zza
            r1[r0] = r3
            int r3 = r2.zzd
            int r3 = r3 + 1
            r2.zzd = r3
            return
    }

    final void zzd(int r5) {
            r4 = this;
            int r0 = r4.zzc
            int r1 = r0 + 1
            r4.zzc = r1
            r2 = r5 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            byte[] r3 = r4.zza
            r3[r0] = r2
            int r0 = r1 + 1
            r4.zzc = r0
            int r2 = r5 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r1] = r2
            int r1 = r0 + 1
            r4.zzc = r1
            int r2 = r5 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r0] = r2
            int r0 = r1 + 1
            r4.zzc = r0
            int r5 = r5 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r3[r1] = r5
            int r5 = r4.zzd
            int r5 = r5 + 4
            r4.zzd = r5
            return
    }

    final void zze(long r9) {
            r8 = this;
            int r0 = r8.zzc
            int r1 = r0 + 1
            r8.zzc = r1
            r2 = 255(0xff, double:1.26E-321)
            long r4 = r9 & r2
            int r5 = (int) r4
            byte r4 = (byte) r5
            byte[] r5 = r8.zza
            r5[r0] = r4
            int r0 = r1 + 1
            r8.zzc = r0
            r4 = 8
            long r6 = r9 >> r4
            long r6 = r6 & r2
            int r7 = (int) r6
            byte r6 = (byte) r7
            r5[r1] = r6
            int r1 = r0 + 1
            r8.zzc = r1
            r6 = 16
            long r6 = r9 >> r6
            long r6 = r6 & r2
            int r7 = (int) r6
            byte r6 = (byte) r7
            r5[r0] = r6
            int r0 = r1 + 1
            r8.zzc = r0
            r6 = 24
            long r6 = r9 >> r6
            long r2 = r2 & r6
            int r3 = (int) r2
            byte r2 = (byte) r3
            r5[r1] = r2
            int r1 = r0 + 1
            r8.zzc = r1
            r2 = 32
            long r2 = r9 >> r2
            int r3 = (int) r2
            r2 = r3 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r5[r0] = r2
            int r0 = r1 + 1
            r8.zzc = r0
            r2 = 40
            long r2 = r9 >> r2
            int r3 = (int) r2
            r2 = r3 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r5[r1] = r2
            int r1 = r0 + 1
            r8.zzc = r1
            r2 = 48
            long r2 = r9 >> r2
            int r3 = (int) r2
            r2 = r3 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r5[r0] = r2
            int r0 = r1 + 1
            r8.zzc = r0
            r0 = 56
            long r9 = r9 >> r0
            int r10 = (int) r9
            r9 = r10 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r5[r1] = r9
            int r9 = r8.zzd
            int r9 = r9 + r4
            r8.zzd = r9
            return
    }

    final void zzf(int r7) {
            r6 = this;
            boolean r0 = com.google.android.gms.internal.ads.zzhaj.zzH()
            if (r0 == 0) goto L39
            int r0 = r6.zzc
            long r0 = (long) r0
        L9:
            r2 = r7 & (-128(0xffffffffffffff80, float:NaN))
            if (r2 != 0) goto L25
            byte[] r2 = r6.zza
            int r3 = r6.zzc
            int r4 = r3 + 1
            r6.zzc = r4
            long r3 = (long) r3
            byte r7 = (byte) r7
            com.google.android.gms.internal.ads.zzhef.zzq(r2, r3, r7)
            int r7 = r6.zzc
            long r2 = (long) r7
            long r2 = r2 - r0
            int r7 = r6.zzd
            int r0 = (int) r2
            int r7 = r7 + r0
            r6.zzd = r7
            return
        L25:
            byte[] r2 = r6.zza
            int r3 = r6.zzc
            int r4 = r3 + 1
            r6.zzc = r4
            long r3 = (long) r3
            r5 = r7 | 128(0x80, float:1.794E-43)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            com.google.android.gms.internal.ads.zzhef.zzq(r2, r3, r5)
            int r7 = r7 >>> 7
            goto L9
        L39:
            r0 = r7 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L4f
            byte[] r0 = r6.zza
            int r1 = r6.zzc
            int r2 = r1 + 1
            r6.zzc = r2
            byte r7 = (byte) r7
            r0[r1] = r7
            int r7 = r6.zzd
            int r7 = r7 + 1
            r6.zzd = r7
            return
        L4f:
            byte[] r0 = r6.zza
            int r1 = r6.zzc
            int r2 = r1 + 1
            r6.zzc = r2
            r2 = r7 | 128(0x80, float:1.794E-43)
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
            int r0 = r6.zzd
            int r0 = r0 + 1
            r6.zzd = r0
            int r7 = r7 >>> 7
            goto L39
    }

    final void zzg(long r12) {
            r11 = this;
            boolean r0 = com.google.android.gms.internal.ads.zzhaj.zzH()
            r1 = 7
            r2 = 0
            r4 = -128(0xffffffffffffff80, double:NaN)
            if (r0 == 0) goto L40
            int r0 = r11.zzc
            long r6 = (long) r0
        Le:
            long r8 = r12 & r4
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            int r8 = (int) r12
            if (r0 != 0) goto L2d
            byte[] r12 = r11.zza
            int r13 = r11.zzc
            int r0 = r13 + 1
            r11.zzc = r0
            long r0 = (long) r13
            byte r13 = (byte) r8
            com.google.android.gms.internal.ads.zzhef.zzq(r12, r0, r13)
            int r12 = r11.zzc
            long r12 = (long) r12
            long r12 = r12 - r6
            int r0 = r11.zzd
            int r13 = (int) r12
            int r0 = r0 + r13
            r11.zzd = r0
            return
        L2d:
            byte[] r0 = r11.zza
            int r9 = r11.zzc
            int r10 = r9 + 1
            r11.zzc = r10
            long r9 = (long) r9
            r8 = r8 | 128(0x80, float:1.794E-43)
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            com.google.android.gms.internal.ads.zzhef.zzq(r0, r9, r8)
            long r12 = r12 >>> r1
            goto Le
        L40:
            long r6 = r12 & r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            int r6 = (int) r12
            if (r0 != 0) goto L59
            byte[] r12 = r11.zza
            int r13 = r11.zzc
            int r0 = r13 + 1
            r11.zzc = r0
            byte r0 = (byte) r6
            r12[r13] = r0
            int r12 = r11.zzd
            int r12 = r12 + 1
            r11.zzd = r12
            return
        L59:
            byte[] r0 = r11.zza
            int r7 = r11.zzc
            int r8 = r7 + 1
            r11.zzc = r8
            r6 = r6 | 128(0x80, float:1.794E-43)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r0[r7] = r6
            int r0 = r11.zzd
            int r0 = r0 + 1
            r11.zzd = r0
            long r12 = r12 >>> r1
            goto L40
    }
}
