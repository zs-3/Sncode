package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
final class zzbd extends com.google.android.gms.internal.fido.zzbe {
    zzbd(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
            r1 = this;
            com.google.android.gms.internal.fido.zzbb r0 = new com.google.android.gms.internal.fido.zzbb
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = com.google.android.gms.internal.fido.zzbb.zzc(r0)
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            com.google.android.gms.internal.fido.zzam.zzc(r2)
            return
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    final void zza(java.lang.Appendable r6, byte[] r7, int r8, int r9) throws java.io.IOException {
            r5 = this;
            int r8 = r7.length
            r0 = 0
            com.google.android.gms.internal.fido.zzam.zze(r0, r9, r8)
            r8 = r9
        L6:
            r1 = 3
            if (r8 < r1) goto L54
            int r1 = r0 + 1
            r0 = r7[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r7[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r1 = r1 + 1
            r3 = r7[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            com.google.android.gms.internal.fido.zzbb r4 = r5.zzb
            int r0 = r0 << 16
            int r2 = r2 << 8
            r0 = r0 | r2
            r0 = r0 | r3
            int r2 = r0 >>> 18
            char r2 = r4.zza(r2)
            r6.append(r2)
            com.google.android.gms.internal.fido.zzbb r2 = r5.zzb
            int r3 = r0 >>> 12
            r3 = r3 & 63
            char r2 = r2.zza(r3)
            r6.append(r2)
            com.google.android.gms.internal.fido.zzbb r2 = r5.zzb
            int r3 = r0 >>> 6
            r3 = r3 & 63
            char r2 = r2.zza(r3)
            r6.append(r2)
            com.google.android.gms.internal.fido.zzbb r2 = r5.zzb
            r0 = r0 & 63
            char r0 = r2.zza(r0)
            r6.append(r0)
            int r0 = r1 + 1
            int r8 = r8 + (-3)
            goto L6
        L54:
            if (r0 >= r9) goto L5a
            int r9 = r9 - r0
            r5.zzc(r6, r7, r0, r9)
        L5a:
            return
    }
}
