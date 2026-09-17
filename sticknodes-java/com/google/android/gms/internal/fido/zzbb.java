package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
final class zzbb {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final java.lang.String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    zzbb(java.lang.String r10, char[] r11) {
            r9 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = 0
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L2b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = 1
            goto L15
        L14:
            r7 = 0
        L15:
            java.lang.String r8 = "Non-ASCII character: %s"
            com.google.android.gms.internal.fido.zzam.zzd(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L1f
            goto L20
        L1f:
            r6 = 0
        L20:
            java.lang.String r7 = "Duplicate character: %s"
            com.google.android.gms.internal.fido.zzam.zzd(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L2b:
            r9.<init>(r10, r11, r1, r3)
            return
    }

    private zzbb(java.lang.String r4, char[] r5, byte[] r6, boolean r7) {
            r3 = this;
            r3.<init>()
            r3.zze = r4
            java.util.Objects.requireNonNull(r5)
            r3.zzf = r5
            int r4 = r5.length     // Catch: java.lang.ArithmeticException -> L42
            java.math.RoundingMode r7 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L42
            int r7 = com.google.android.gms.internal.fido.zzbh.zzb(r4, r7)     // Catch: java.lang.ArithmeticException -> L42
            r3.zzb = r7     // Catch: java.lang.ArithmeticException -> L42
            int r5 = java.lang.Integer.numberOfTrailingZeros(r7)
            int r0 = 3 - r5
            r1 = 1
            int r0 = r1 << r0
            r3.zzc = r0
            int r5 = r7 >> r5
            r3.zzd = r5
            int r4 = r4 + (-1)
            r3.zza = r4
            r3.zzg = r6
            boolean[] r4 = new boolean[r0]
            r5 = 0
            r6 = 0
        L2c:
            int r7 = r3.zzd
            if (r6 >= r7) goto L3f
            int r7 = r6 * 8
            int r0 = r3.zzb
            java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
            int r7 = com.google.android.gms.internal.fido.zzbh.zza(r7, r0, r2)
            r4[r7] = r1
            int r6 = r6 + 1
            goto L2c
        L3f:
            r3.zzh = r5
            return
        L42:
            r4 = move-exception
            int r5 = r5.length
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Illegal alphabet length "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5, r4)
            throw r6
    }

    static /* bridge */ /* synthetic */ char[] zzc(com.google.android.gms.internal.fido.zzbb r0) {
            char[] r0 = r0.zzf
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.fido.zzbb
            r1 = 0
            if (r0 == 0) goto L15
            com.google.android.gms.internal.fido.zzbb r3 = (com.google.android.gms.internal.fido.zzbb) r3
            boolean r0 = r3.zzh
            char[] r0 = r2.zzf
            char[] r3 = r3.zzf
            boolean r3 = java.util.Arrays.equals(r0, r3)
            if (r3 == 0) goto L15
            r3 = 1
            return r3
        L15:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            char[] r0 = r1.zzf
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + 1237
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    final char zza(int r2) {
            r1 = this;
            char[] r0 = r1.zzf
            char r2 = r0[r2]
            return r2
    }

    public final boolean zzb(char r2) {
            r1 = this;
            byte[] r2 = r1.zzg
            r0 = 61
            r2 = r2[r0]
            r0 = -1
            if (r2 == r0) goto Lb
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }
}
