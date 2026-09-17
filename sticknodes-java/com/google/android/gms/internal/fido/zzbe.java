package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
class zzbe extends com.google.android.gms.internal.fido.zzbf {
    final com.google.android.gms.internal.fido.zzbb zzb;
    final java.lang.Character zzc;

    zzbe(com.google.android.gms.internal.fido.zzbb r4, java.lang.Character r5) {
            r3 = this;
            r3.<init>()
            r3.zzb = r4
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L17
            r5.charValue()
            r2 = 61
            boolean r4 = r4.zzb(r2)
            if (r4 != 0) goto L15
            goto L17
        L15:
            r4 = 0
            goto L18
        L17:
            r4 = 1
        L18:
            if (r4 == 0) goto L1d
            r3.zzc = r5
            return
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "Padding character %s was already in alphabet"
            java.lang.String r5 = com.google.android.gms.internal.fido.zzan.zza(r5, r1)
            r4.<init>(r5)
            throw r4
    }

    zzbe(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
            r1 = this;
            com.google.android.gms.internal.fido.zzbb r0 = new com.google.android.gms.internal.fido.zzbb
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.fido.zzbe
            r1 = 0
            if (r0 == 0) goto L21
            com.google.android.gms.internal.fido.zzbe r4 = (com.google.android.gms.internal.fido.zzbe) r4
            com.google.android.gms.internal.fido.zzbb r0 = r3.zzb
            com.google.android.gms.internal.fido.zzbb r2 = r4.zzb
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L21
            java.lang.Character r0 = r3.zzc
            java.lang.Character r4 = r4.zzc
            if (r0 == r4) goto L1f
            if (r0 == 0) goto L21
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L21
        L1f:
            r4 = 1
            return r4
        L21:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            com.google.android.gms.internal.fido.zzbb r0 = r2.zzb
            int r0 = r0.hashCode()
            java.lang.Character r1 = r2.zzc
            if (r1 != 0) goto Lc
            r1 = 0
            goto L10
        Lc:
            int r1 = r1.hashCode()
        L10:
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BaseEncoding."
            r0.<init>(r1)
            com.google.android.gms.internal.fido.zzbb r1 = r3.zzb
            r0.append(r1)
            com.google.android.gms.internal.fido.zzbb r1 = r3.zzb
            int r1 = r1.zzb
            r2 = 8
            int r2 = r2 % r1
            if (r2 == 0) goto L2e
            java.lang.Character r1 = r3.zzc
            if (r1 != 0) goto L1f
            java.lang.String r1 = ".omitPadding()"
            r0.append(r1)
            goto L2e
        L1f:
            java.lang.String r1 = ".withPadChar('"
            r0.append(r1)
            java.lang.Character r1 = r3.zzc
            r0.append(r1)
            java.lang.String r1 = "')"
            r0.append(r1)
        L2e:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    void zza(java.lang.Appendable r3, byte[] r4, int r5, int r6) throws java.io.IOException {
            r2 = this;
            int r5 = r4.length
            r0 = 0
            com.google.android.gms.internal.fido.zzam.zze(r0, r6, r5)
        L5:
            if (r0 >= r6) goto L1a
            com.google.android.gms.internal.fido.zzbb r5 = r2.zzb
            int r5 = r5.zzd
            int r1 = r6 - r0
            int r5 = java.lang.Math.min(r5, r1)
            r2.zzc(r3, r4, r0, r5)
            com.google.android.gms.internal.fido.zzbb r5 = r2.zzb
            int r5 = r5.zzd
            int r0 = r0 + r5
            goto L5
        L1a:
            return
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    final int zzb(int r4) {
            r3 = this;
            com.google.android.gms.internal.fido.zzbb r0 = r3.zzb
            int r1 = r0.zzc
            int r0 = r0.zzd
            java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
            int r4 = com.google.android.gms.internal.fido.zzbh.zza(r4, r0, r2)
            int r1 = r1 * r4
            return r1
    }

    final void zzc(java.lang.Appendable r8, byte[] r9, int r10, int r11) throws java.io.IOException {
            r7 = this;
            int r0 = r10 + r11
            int r1 = r9.length
            com.google.android.gms.internal.fido.zzam.zze(r10, r0, r1)
            com.google.android.gms.internal.fido.zzbb r0 = r7.zzb
            int r0 = r0.zzd
            r1 = 0
            if (r11 > r0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            com.google.android.gms.internal.fido.zzam.zzc(r0)
            r2 = 0
            r0 = 0
        L16:
            r4 = 8
            if (r0 >= r11) goto L26
            int r5 = r10 + r0
            r5 = r9[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            long r2 = r2 | r5
            long r2 = r2 << r4
            int r0 = r0 + 1
            goto L16
        L26:
            int r9 = r11 + 1
            int r9 = r9 * 8
            com.google.android.gms.internal.fido.zzbb r10 = r7.zzb
            int r10 = r10.zzb
            int r9 = r9 - r10
        L2f:
            int r10 = r11 * 8
            if (r1 >= r10) goto L4a
            int r10 = r9 - r1
            long r5 = r2 >>> r10
            com.google.android.gms.internal.fido.zzbb r10 = r7.zzb
            int r0 = r10.zza
            int r6 = (int) r5
            r0 = r0 & r6
            char r10 = r10.zza(r0)
            r8.append(r10)
            com.google.android.gms.internal.fido.zzbb r10 = r7.zzb
            int r10 = r10.zzb
            int r1 = r1 + r10
            goto L2f
        L4a:
            java.lang.Character r9 = r7.zzc
            if (r9 == 0) goto L66
        L4e:
            com.google.android.gms.internal.fido.zzbb r9 = r7.zzb
            int r9 = r9.zzd
            int r9 = r9 * 8
            if (r1 >= r9) goto L66
            java.lang.Character r9 = r7.zzc
            r9.charValue()
            r9 = 61
            r8.append(r9)
            com.google.android.gms.internal.fido.zzbb r9 = r7.zzb
            int r9 = r9.zzb
            int r1 = r1 + r9
            goto L4e
        L66:
            return
    }
}
