package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
final class zzbc extends com.google.android.gms.internal.fido.zzbe {
    final char[] zza;

    zzbc(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            com.google.android.gms.internal.fido.zzbb r4 = new com.google.android.gms.internal.fido.zzbb
            java.lang.String r5 = "0123456789ABCDEF"
            char[] r5 = r5.toCharArray()
            java.lang.String r0 = "base16()"
            r4.<init>(r0, r5)
            r5 = 0
            r3.<init>(r4, r5)
            r5 = 512(0x200, float:7.175E-43)
            char[] r5 = new char[r5]
            r3.zza = r5
            char[] r5 = com.google.android.gms.internal.fido.zzbb.zzc(r4)
            int r5 = r5.length
            r0 = 0
            r1 = 16
            if (r5 != r1) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = 0
        L24:
            com.google.android.gms.internal.fido.zzam.zzc(r5)
        L27:
            r5 = 256(0x100, float:3.59E-43)
            if (r0 >= r5) goto L44
            char[] r5 = r3.zza
            int r1 = r0 >>> 4
            char r1 = r4.zza(r1)
            r5[r0] = r1
            char[] r5 = r3.zza
            r1 = r0 | 256(0x100, float:3.59E-43)
            r2 = r0 & 15
            char r2 = r4.zza(r2)
            r5[r1] = r2
            int r0 = r0 + 1
            goto L27
        L44:
            return
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    final void zza(java.lang.Appendable r3, byte[] r4, int r5, int r6) throws java.io.IOException {
            r2 = this;
            int r5 = r4.length
            r0 = 0
            com.google.android.gms.internal.fido.zzam.zze(r0, r6, r5)
        L5:
            if (r0 >= r6) goto L1e
            r5 = r4[r0]
            r5 = r5 & 255(0xff, float:3.57E-43)
            char[] r1 = r2.zza
            char r1 = r1[r5]
            r3.append(r1)
            char[] r1 = r2.zza
            r5 = r5 | 256(0x100, float:3.59E-43)
            char r5 = r1[r5]
            r3.append(r5)
            int r0 = r0 + 1
            goto L5
        L1e:
            return
    }
}
