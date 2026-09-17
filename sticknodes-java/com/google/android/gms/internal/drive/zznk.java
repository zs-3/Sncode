package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zznk extends com.google.android.gms.internal.drive.zznh {
    zznk() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int zza(byte[] r2, int r3, long r4, int r6) {
            if (r6 == 0) goto L27
            r0 = 1
            if (r6 == r0) goto L1e
            r0 = 2
            if (r6 != r0) goto L18
            byte r6 = com.google.android.gms.internal.drive.zznd.zza(r2, r4)
            r0 = 1
            long r4 = r4 + r0
            byte r2 = com.google.android.gms.internal.drive.zznd.zza(r2, r4)
            int r2 = com.google.android.gms.internal.drive.zznf.zzd(r3, r6, r2)
            return r2
        L18:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L1e:
            byte r2 = com.google.android.gms.internal.drive.zznd.zza(r2, r4)
            int r2 = com.google.android.gms.internal.drive.zznf.zzs(r3, r2)
            return r2
        L27:
            int r2 = com.google.android.gms.internal.drive.zznf.zzaz(r3)
            return r2
    }

    @Override // com.google.android.gms.internal.drive.zznh
    final int zzb(int r16, byte[] r17, int r18, int r19) {
            r15 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r1 | r2
            int r4 = r0.length
            int r4 = r4 - r2
            r3 = r3 | r4
            r4 = 2
            r5 = 3
            r6 = 0
            if (r3 < 0) goto Lb7
            long r7 = (long) r1
            long r1 = (long) r2
            long r1 = r1 - r7
            int r2 = (int) r1
            r1 = 16
            r9 = 1
            if (r2 >= r1) goto L1c
            r1 = 0
            goto L2e
        L1c:
            r11 = r7
            r1 = 0
        L1e:
            if (r1 >= r2) goto L2d
            long r13 = r11 + r9
            byte r3 = com.google.android.gms.internal.drive.zznd.zza(r0, r11)
            if (r3 >= 0) goto L29
            goto L2e
        L29:
            int r1 = r1 + 1
            r11 = r13
            goto L1e
        L2d:
            r1 = r2
        L2e:
            int r2 = r2 - r1
            long r11 = (long) r1
            long r7 = r7 + r11
        L31:
            r1 = 0
        L32:
            if (r2 <= 0) goto L41
            long r11 = r7 + r9
            byte r1 = com.google.android.gms.internal.drive.zznd.zza(r0, r7)
            if (r1 < 0) goto L40
            int r2 = r2 + (-1)
            r7 = r11
            goto L32
        L40:
            r7 = r11
        L41:
            if (r2 != 0) goto L44
            return r6
        L44:
            int r2 = r2 + (-1)
            r3 = -32
            r11 = -65
            r12 = -1
            if (r1 >= r3) goto L62
            if (r2 != 0) goto L50
            return r1
        L50:
            int r2 = r2 + (-1)
            r3 = -62
            if (r1 < r3) goto L61
            long r13 = r7 + r9
            byte r1 = com.google.android.gms.internal.drive.zznd.zza(r0, r7)
            if (r1 <= r11) goto L5f
            goto L61
        L5f:
            r7 = r13
            goto L31
        L61:
            return r12
        L62:
            r13 = -16
            if (r1 >= r13) goto L8c
            if (r2 >= r4) goto L6d
            int r0 = zza(r0, r1, r7, r2)
            return r0
        L6d:
            int r2 = r2 + (-2)
            long r13 = r7 + r9
            byte r7 = com.google.android.gms.internal.drive.zznd.zza(r0, r7)
            if (r7 > r11) goto L8b
            r8 = -96
            if (r1 != r3) goto L7d
            if (r7 < r8) goto L8b
        L7d:
            r3 = -19
            if (r1 != r3) goto L83
            if (r7 >= r8) goto L8b
        L83:
            long r7 = r13 + r9
            byte r1 = com.google.android.gms.internal.drive.zznd.zza(r0, r13)
            if (r1 <= r11) goto L31
        L8b:
            return r12
        L8c:
            if (r2 >= r5) goto L93
            int r0 = zza(r0, r1, r7, r2)
            return r0
        L93:
            int r2 = r2 + (-3)
            long r13 = r7 + r9
            byte r3 = com.google.android.gms.internal.drive.zznd.zza(r0, r7)
            if (r3 > r11) goto Lb6
            int r1 = r1 << 28
            int r3 = r3 + 112
            int r1 = r1 + r3
            int r1 = r1 >> 30
            if (r1 != 0) goto Lb6
            long r7 = r13 + r9
            byte r1 = com.google.android.gms.internal.drive.zznd.zza(r0, r13)
            if (r1 > r11) goto Lb6
            long r13 = r7 + r9
            byte r1 = com.google.android.gms.internal.drive.zznd.zza(r0, r7)
            if (r1 <= r11) goto L5f
        Lb6:
            return r12
        Lb7:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r1 = 1
            r5[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r5[r4] = r0
            java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r0 = java.lang.String.format(r0, r5)
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.android.gms.internal.drive.zznh
    final int zzb(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
            r22 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            long r4 = (long) r2
            long r6 = (long) r3
            long r6 = r6 + r4
            int r8 = r23.length()
            java.lang.String r9 = " at index "
            java.lang.String r10 = "Failed writing "
            if (r8 > r3) goto L146
            int r11 = r1.length
            int r11 = r11 - r3
            if (r11 < r2) goto L146
            r2 = 0
        L1a:
            r3 = 128(0x80, float:1.794E-43)
            r11 = 1
            if (r2 >= r8) goto L2f
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L2f
            long r11 = r11 + r4
            byte r3 = (byte) r13
            com.google.android.gms.internal.drive.zznd.zza(r1, r4, r3)
            int r2 = r2 + 1
            r4 = r11
            goto L1a
        L2f:
            if (r2 != r8) goto L33
            int r0 = (int) r4
            return r0
        L33:
            if (r2 >= r8) goto L144
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L4b
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 >= 0) goto L4b
            long r14 = r4 + r11
            byte r13 = (byte) r13
            com.google.android.gms.internal.drive.zznd.zza(r1, r4, r13)
            r4 = r11
            r12 = r14
        L47:
            r11 = 128(0x80, float:1.794E-43)
            goto Lfb
        L4b:
            r14 = 2048(0x800, float:2.87E-42)
            if (r13 >= r14) goto L75
            r14 = 2
            long r14 = r6 - r14
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 > 0) goto L75
            long r14 = r4 + r11
            int r3 = r13 >>> 6
            r3 = r3 | 960(0x3c0, float:1.345E-42)
            byte r3 = (byte) r3
            com.google.android.gms.internal.drive.zznd.zza(r1, r4, r3)
            long r3 = r14 + r11
            r5 = r13 & 63
            r13 = 128(0x80, float:1.794E-43)
            r5 = r5 | r13
            byte r5 = (byte) r5
            com.google.android.gms.internal.drive.zznd.zza(r1, r14, r5)
            r20 = r11
            r11 = 128(0x80, float:1.794E-43)
            r12 = r3
            r4 = r20
            goto Lfb
        L75:
            r3 = 57343(0xdfff, float:8.0355E-41)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r14) goto L7f
            if (r3 >= r13) goto Lae
        L7f:
            r15 = 3
            long r15 = r6 - r15
            int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r17 > 0) goto Lae
            long r14 = r4 + r11
            int r3 = r13 >>> 12
            r3 = r3 | 480(0x1e0, float:6.73E-43)
            byte r3 = (byte) r3
            com.google.android.gms.internal.drive.zznd.zza(r1, r4, r3)
            long r3 = r14 + r11
            int r5 = r13 >>> 6
            r5 = r5 & 63
            r11 = 128(0x80, float:1.794E-43)
            r5 = r5 | r11
            byte r5 = (byte) r5
            com.google.android.gms.internal.drive.zznd.zza(r1, r14, r5)
            r14 = 1
            long r18 = r3 + r14
            r5 = r13 & 63
            r5 = r5 | r11
            byte r5 = (byte) r5
            com.google.android.gms.internal.drive.zznd.zza(r1, r3, r5)
            r12 = r18
            r4 = 1
            goto L47
        Lae:
            r11 = 4
            long r11 = r6 - r11
            int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r15 > 0) goto L10f
            int r3 = r2 + 1
            if (r3 == r8) goto L107
            char r2 = r0.charAt(r3)
            boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
            if (r11 == 0) goto L106
            int r2 = java.lang.Character.toCodePoint(r13, r2)
            r11 = 1
            long r13 = r4 + r11
            int r15 = r2 >>> 18
            r15 = r15 | 240(0xf0, float:3.36E-43)
            byte r15 = (byte) r15
            com.google.android.gms.internal.drive.zznd.zza(r1, r4, r15)
            long r4 = r13 + r11
            int r15 = r2 >>> 12
            r15 = r15 & 63
            r11 = 128(0x80, float:1.794E-43)
            r12 = r15 | 128(0x80, float:1.794E-43)
            byte r12 = (byte) r12
            com.google.android.gms.internal.drive.zznd.zza(r1, r13, r12)
            r12 = 1
            long r14 = r4 + r12
            int r16 = r2 >>> 6
            r12 = r16 & 63
            r12 = r12 | r11
            byte r12 = (byte) r12
            com.google.android.gms.internal.drive.zznd.zza(r1, r4, r12)
            r4 = 1
            long r12 = r14 + r4
            r2 = r2 & 63
            r2 = r2 | r11
            byte r2 = (byte) r2
            com.google.android.gms.internal.drive.zznd.zza(r1, r14, r2)
            r2 = r3
        Lfb:
            int r2 = r2 + 1
            r3 = 128(0x80, float:1.794E-43)
            r20 = r4
            r4 = r12
            r11 = r20
            goto L33
        L106:
            r2 = r3
        L107:
            com.google.android.gms.internal.drive.zznj r0 = new com.google.android.gms.internal.drive.zznj
            int r2 = r2 + (-1)
            r0.<init>(r2, r8)
            throw r0
        L10f:
            if (r14 > r13) goto L127
            if (r13 > r3) goto L127
            int r1 = r2 + 1
            if (r1 == r8) goto L121
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
            if (r0 != 0) goto L127
        L121:
            com.google.android.gms.internal.drive.zznj r0 = new com.google.android.gms.internal.drive.zznj
            r0.<init>(r2, r8)
            throw r0
        L127:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r1 = 46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r10)
            r2.append(r13)
            r2.append(r9)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L144:
            int r0 = (int) r4
            return r0
        L146:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            int r8 = r8 + (-1)
            char r0 = r0.charAt(r8)
            int r2 = r2 + r3
            r3 = 37
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r10)
            r4.append(r0)
            r4.append(r9)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
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
            if (r0 < 0) goto Lc7
            int r0 = r13 + r14
            char[] r14 = new char[r14]
            r3 = 0
        Lf:
            if (r13 >= r0) goto L25
            long r4 = (long) r13
            byte r4 = com.google.android.gms.internal.drive.zznd.zza(r12, r4)
            boolean r5 = com.google.android.gms.internal.drive.zzng.zzh(r4)
            if (r5 == 0) goto L25
            int r13 = r13 + 1
            int r5 = r3 + 1
            com.google.android.gms.internal.drive.zzng.zzb(r4, r14, r3)
            r3 = r5
            goto Lf
        L25:
            r8 = r3
        L26:
            if (r13 >= r0) goto Lc1
            int r3 = r13 + 1
            long r4 = (long) r13
            byte r13 = com.google.android.gms.internal.drive.zznd.zza(r12, r4)
            boolean r4 = com.google.android.gms.internal.drive.zzng.zzh(r13)
            if (r4 == 0) goto L53
            int r4 = r8 + 1
            com.google.android.gms.internal.drive.zzng.zzb(r13, r14, r8)
        L3a:
            if (r3 >= r0) goto L50
            long r5 = (long) r3
            byte r13 = com.google.android.gms.internal.drive.zznd.zza(r12, r5)
            boolean r5 = com.google.android.gms.internal.drive.zzng.zzh(r13)
            if (r5 == 0) goto L50
            int r3 = r3 + 1
            int r5 = r4 + 1
            com.google.android.gms.internal.drive.zzng.zzb(r13, r14, r4)
            r4 = r5
            goto L3a
        L50:
            r13 = r3
            r8 = r4
            goto L26
        L53:
            boolean r4 = com.google.android.gms.internal.drive.zzng.zzi(r13)
            if (r4 == 0) goto L6f
            if (r3 >= r0) goto L6a
            int r4 = r3 + 1
            long r5 = (long) r3
            byte r3 = com.google.android.gms.internal.drive.zznd.zza(r12, r5)
            int r5 = r8 + 1
            com.google.android.gms.internal.drive.zzng.zzb(r13, r3, r14, r8)
            r13 = r4
            r8 = r5
            goto L26
        L6a:
            com.google.android.gms.internal.drive.zzkq r12 = com.google.android.gms.internal.drive.zzkq.zzdn()
            throw r12
        L6f:
            boolean r4 = com.google.android.gms.internal.drive.zzng.zzj(r13)
            if (r4 == 0) goto L94
            int r4 = r0 + (-1)
            if (r3 >= r4) goto L8f
            int r4 = r3 + 1
            long r5 = (long) r3
            byte r3 = com.google.android.gms.internal.drive.zznd.zza(r12, r5)
            int r5 = r4 + 1
            long r6 = (long) r4
            byte r4 = com.google.android.gms.internal.drive.zznd.zza(r12, r6)
            int r6 = r8 + 1
            com.google.android.gms.internal.drive.zzng.zzb(r13, r3, r4, r14, r8)
            r13 = r5
            r8 = r6
            goto L26
        L8f:
            com.google.android.gms.internal.drive.zzkq r12 = com.google.android.gms.internal.drive.zzkq.zzdn()
            throw r12
        L94:
            int r4 = r0 + (-2)
            if (r3 >= r4) goto Lbc
            int r4 = r3 + 1
            long r5 = (long) r3
            byte r5 = com.google.android.gms.internal.drive.zznd.zza(r12, r5)
            int r3 = r4 + 1
            long r6 = (long) r4
            byte r6 = com.google.android.gms.internal.drive.zznd.zza(r12, r6)
            int r9 = r3 + 1
            long r3 = (long) r3
            byte r7 = com.google.android.gms.internal.drive.zznd.zza(r12, r3)
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
            goto L26
        Lbc:
            com.google.android.gms.internal.drive.zzkq r12 = com.google.android.gms.internal.drive.zzkq.zzdn()
            throw r12
        Lc1:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r14, r1, r8)
            return r12
        Lc7:
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
