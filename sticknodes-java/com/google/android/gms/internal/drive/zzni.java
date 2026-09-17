package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzni extends com.google.android.gms.internal.drive.zznh {
    zzni() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.drive.zznh
    final int zzb(int r7, byte[] r8, int r9, int r10) {
            r6 = this;
        L0:
            if (r9 >= r10) goto L9
            r7 = r8[r9]
            if (r7 < 0) goto L9
            int r9 = r9 + 1
            goto L0
        L9:
            r7 = 0
            if (r9 < r10) goto Ld
            return r7
        Ld:
            if (r9 < r10) goto L10
            return r7
        L10:
            int r0 = r9 + 1
            r9 = r8[r9]
            if (r9 >= 0) goto L76
            r1 = -32
            r2 = -1
            r3 = -65
            if (r9 >= r1) goto L2b
            if (r0 < r10) goto L20
            return r9
        L20:
            r1 = -62
            if (r9 < r1) goto L2a
            int r9 = r0 + 1
            r0 = r8[r0]
            if (r0 <= r3) goto Ld
        L2a:
            return r2
        L2b:
            r4 = -16
            if (r9 >= r4) goto L51
            int r4 = r10 + (-1)
            if (r0 < r4) goto L38
            int r7 = com.google.android.gms.internal.drive.zznf.zzh(r8, r0, r10)
            return r7
        L38:
            int r4 = r0 + 1
            r0 = r8[r0]
            if (r0 > r3) goto L50
            r5 = -96
            if (r9 != r1) goto L44
            if (r0 < r5) goto L50
        L44:
            r1 = -19
            if (r9 != r1) goto L4a
            if (r0 >= r5) goto L50
        L4a:
            int r9 = r4 + 1
            r0 = r8[r4]
            if (r0 <= r3) goto Ld
        L50:
            return r2
        L51:
            int r1 = r10 + (-2)
            if (r0 < r1) goto L5a
            int r7 = com.google.android.gms.internal.drive.zznf.zzh(r8, r0, r10)
            return r7
        L5a:
            int r1 = r0 + 1
            r0 = r8[r0]
            if (r0 > r3) goto L75
            int r9 = r9 << 28
            int r0 = r0 + 112
            int r9 = r9 + r0
            int r9 = r9 >> 30
            if (r9 != 0) goto L75
            int r9 = r1 + 1
            r0 = r8[r1]
            if (r0 > r3) goto L75
            int r0 = r9 + 1
            r9 = r8[r9]
            if (r9 <= r3) goto L76
        L75:
            return r2
        L76:
            r9 = r0
            goto Ld
    }

    @Override // com.google.android.gms.internal.drive.zznh
    final int zzb(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            r7 = this;
            int r0 = r8.length()
            int r11 = r11 + r10
            r1 = 0
        L6:
            r2 = 128(0x80, float:1.794E-43)
            if (r1 >= r0) goto L1a
            int r3 = r1 + r10
            if (r3 >= r11) goto L1a
            char r4 = r8.charAt(r1)
            if (r4 >= r2) goto L1a
            byte r2 = (byte) r4
            r9[r3] = r2
            int r1 = r1 + 1
            goto L6
        L1a:
            if (r1 != r0) goto L1e
            int r10 = r10 + r0
            return r10
        L1e:
            int r10 = r10 + r1
        L1f:
            if (r1 >= r0) goto Lff
            char r3 = r8.charAt(r1)
            if (r3 >= r2) goto L31
            if (r10 >= r11) goto L31
            int r4 = r10 + 1
            byte r3 = (byte) r3
            r9[r10] = r3
        L2e:
            r10 = r4
            goto Lb5
        L31:
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L4b
            int r4 = r11 + (-2)
            if (r10 > r4) goto L4b
            int r4 = r10 + 1
            int r5 = r3 >>> 6
            r5 = r5 | 960(0x3c0, float:1.345E-42)
            byte r5 = (byte) r5
            r9[r10] = r5
            int r10 = r4 + 1
            r3 = r3 & 63
            r3 = r3 | r2
            byte r3 = (byte) r3
            r9[r4] = r3
            goto Lb5
        L4b:
            r4 = 57343(0xdfff, float:8.0355E-41)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r5) goto L55
            if (r4 >= r3) goto L75
        L55:
            int r6 = r11 + (-3)
            if (r10 > r6) goto L75
            int r4 = r10 + 1
            int r5 = r3 >>> 12
            r5 = r5 | 480(0x1e0, float:6.73E-43)
            byte r5 = (byte) r5
            r9[r10] = r5
            int r10 = r4 + 1
            int r5 = r3 >>> 6
            r5 = r5 & 63
            r5 = r5 | r2
            byte r5 = (byte) r5
            r9[r4] = r5
            int r4 = r10 + 1
            r3 = r3 & 63
            r3 = r3 | r2
            byte r3 = (byte) r3
            r9[r10] = r3
            goto L2e
        L75:
            int r6 = r11 + (-4)
            if (r10 > r6) goto Lc2
            int r4 = r1 + 1
            int r5 = r8.length()
            if (r4 == r5) goto Lba
            char r1 = r8.charAt(r4)
            boolean r5 = java.lang.Character.isSurrogatePair(r3, r1)
            if (r5 == 0) goto Lb9
            int r1 = java.lang.Character.toCodePoint(r3, r1)
            int r3 = r10 + 1
            int r5 = r1 >>> 18
            r5 = r5 | 240(0xf0, float:3.36E-43)
            byte r5 = (byte) r5
            r9[r10] = r5
            int r10 = r3 + 1
            int r5 = r1 >>> 12
            r5 = r5 & 63
            r5 = r5 | r2
            byte r5 = (byte) r5
            r9[r3] = r5
            int r3 = r10 + 1
            int r5 = r1 >>> 6
            r5 = r5 & 63
            r5 = r5 | r2
            byte r5 = (byte) r5
            r9[r10] = r5
            int r10 = r3 + 1
            r1 = r1 & 63
            r1 = r1 | r2
            byte r1 = (byte) r1
            r9[r3] = r1
            r1 = r4
        Lb5:
            int r1 = r1 + 1
            goto L1f
        Lb9:
            r1 = r4
        Lba:
            com.google.android.gms.internal.drive.zznj r8 = new com.google.android.gms.internal.drive.zznj
            int r1 = r1 + (-1)
            r8.<init>(r1, r0)
            throw r8
        Lc2:
            if (r5 > r3) goto Lde
            if (r3 > r4) goto Lde
            int r9 = r1 + 1
            int r11 = r8.length()
            if (r9 == r11) goto Ld8
            char r8 = r8.charAt(r9)
            boolean r8 = java.lang.Character.isSurrogatePair(r3, r8)
            if (r8 != 0) goto Lde
        Ld8:
            com.google.android.gms.internal.drive.zznj r8 = new com.google.android.gms.internal.drive.zznj
            r8.<init>(r1, r0)
            throw r8
        Lde:
            java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
            r9 = 37
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r9)
            java.lang.String r9 = "Failed writing "
            r11.append(r9)
            r11.append(r3)
            java.lang.String r9 = " at index "
            r11.append(r9)
            r11.append(r10)
            java.lang.String r9 = r11.toString()
            r8.<init>(r9)
            throw r8
        Lff:
            return r10
    }

    @Override // com.google.android.gms.internal.drive.zznh
    final java.lang.String zzg(byte[] r12, int r13, int r14) throws com.google.android.gms.internal.drive.zzkq {
            r11 = this;
            r0 = r13 | r14
            int r1 = r12.length
            int r1 = r1 - r13
            int r1 = r1 - r14
            r0 = r0 | r1
            r1 = 0
            r2 = 1
            if (r0 < 0) goto Lab
            int r0 = r13 + r14
            char[] r14 = new char[r14]
            r3 = 0
        Lf:
            if (r13 >= r0) goto L22
            r4 = r12[r13]
            boolean r5 = com.google.android.gms.internal.drive.zzng.zzh(r4)
            if (r5 == 0) goto L22
            int r13 = r13 + 1
            int r5 = r3 + 1
            com.google.android.gms.internal.drive.zzng.zzb(r4, r14, r3)
            r3 = r5
            goto Lf
        L22:
            r8 = r3
        L23:
            if (r13 >= r0) goto La5
            int r3 = r13 + 1
            r13 = r12[r13]
            boolean r4 = com.google.android.gms.internal.drive.zzng.zzh(r13)
            if (r4 == 0) goto L4a
            int r4 = r8 + 1
            com.google.android.gms.internal.drive.zzng.zzb(r13, r14, r8)
        L34:
            if (r3 >= r0) goto L47
            r13 = r12[r3]
            boolean r5 = com.google.android.gms.internal.drive.zzng.zzh(r13)
            if (r5 == 0) goto L47
            int r3 = r3 + 1
            int r5 = r4 + 1
            com.google.android.gms.internal.drive.zzng.zzb(r13, r14, r4)
            r4 = r5
            goto L34
        L47:
            r13 = r3
            r8 = r4
            goto L23
        L4a:
            boolean r4 = com.google.android.gms.internal.drive.zzng.zzi(r13)
            if (r4 == 0) goto L63
            if (r3 >= r0) goto L5e
            int r4 = r3 + 1
            r3 = r12[r3]
            int r5 = r8 + 1
            com.google.android.gms.internal.drive.zzng.zzb(r13, r3, r14, r8)
            r13 = r4
            r8 = r5
            goto L23
        L5e:
            com.google.android.gms.internal.drive.zzkq r12 = com.google.android.gms.internal.drive.zzkq.zzdn()
            throw r12
        L63:
            boolean r4 = com.google.android.gms.internal.drive.zzng.zzj(r13)
            if (r4 == 0) goto L82
            int r4 = r0 + (-1)
            if (r3 >= r4) goto L7d
            int r4 = r3 + 1
            r3 = r12[r3]
            int r5 = r4 + 1
            r4 = r12[r4]
            int r6 = r8 + 1
            com.google.android.gms.internal.drive.zzng.zzb(r13, r3, r4, r14, r8)
            r13 = r5
            r8 = r6
            goto L23
        L7d:
            com.google.android.gms.internal.drive.zzkq r12 = com.google.android.gms.internal.drive.zzkq.zzdn()
            throw r12
        L82:
            int r4 = r0 + (-2)
            if (r3 >= r4) goto La0
            int r4 = r3 + 1
            r5 = r12[r3]
            int r3 = r4 + 1
            r6 = r12[r4]
            int r9 = r3 + 1
            r7 = r12[r3]
            int r10 = r8 + 1
            r3 = r13
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r14
            com.google.android.gms.internal.drive.zzng.zzb(r3, r4, r5, r6, r7, r8)
            int r10 = r10 + r2
            r13 = r9
            r8 = r10
            goto L23
        La0:
            com.google.android.gms.internal.drive.zzkq r12 = com.google.android.gms.internal.drive.zzkq.zzdn()
            throw r12
        La5:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r14, r1, r8)
            return r12
        Lab:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r12 = r12.length
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r3[r1] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r3[r2] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            r13 = 2
            r3[r13] = r12
            java.lang.String r12 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r12 = java.lang.String.format(r12, r3)
            r0.<init>(r12)
            throw r0
    }
}
