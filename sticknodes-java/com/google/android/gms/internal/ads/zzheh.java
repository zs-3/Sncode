package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzheh {
    zzheh() {
            r0 = this;
            r0.<init>()
            return
    }

    static final java.lang.String zzc(java.nio.ByteBuffer r10, int r11, int r12) throws com.google.android.gms.internal.ads.zzhbt {
            int r0 = r10.limit()
            int r0 = r0 - r11
            r1 = r11 | r12
            int r0 = r0 - r12
            r0 = r0 | r1
            r1 = 0
            if (r0 < 0) goto Lc2
            int r0 = r11 + r12
            char[] r12 = new char[r12]
            r2 = 0
        L11:
            if (r11 >= r0) goto L26
            byte r3 = r10.get(r11)
            boolean r4 = com.google.android.gms.internal.ads.zzheg.zzd(r3)
            if (r4 == 0) goto L26
            int r11 = r11 + 1
            int r4 = r2 + 1
            char r3 = (char) r3
            r12[r2] = r3
            r2 = r4
            goto L11
        L26:
            r8 = r2
        L27:
            if (r11 >= r0) goto Lbc
            int r2 = r11 + 1
            byte r11 = r10.get(r11)
            boolean r3 = com.google.android.gms.internal.ads.zzheg.zzd(r11)
            if (r3 == 0) goto L50
            int r3 = r8 + 1
            char r11 = (char) r11
            r12[r8] = r11
            r11 = r2
        L3b:
            r8 = r3
            if (r11 >= r0) goto L27
            byte r2 = r10.get(r11)
            boolean r3 = com.google.android.gms.internal.ads.zzheg.zzd(r2)
            if (r3 == 0) goto L27
            int r11 = r11 + 1
            int r3 = r8 + 1
            char r2 = (char) r2
            r12[r8] = r2
            goto L3b
        L50:
            boolean r3 = com.google.android.gms.internal.ads.zzheg.zzf(r11)
            java.lang.String r4 = "Protocol message had invalid UTF-8."
            if (r3 == 0) goto L6e
            if (r2 >= r0) goto L68
            int r3 = r8 + 1
            int r4 = r2 + 1
            byte r2 = r10.get(r2)
            com.google.android.gms.internal.ads.zzheg.zzc(r11, r2, r12, r8)
            r8 = r3
            r11 = r4
            goto L27
        L68:
            com.google.android.gms.internal.ads.zzhbt r10 = new com.google.android.gms.internal.ads.zzhbt
            r10.<init>(r4)
            throw r10
        L6e:
            boolean r3 = com.google.android.gms.internal.ads.zzheg.zze(r11)
            if (r3 == 0) goto L92
            int r3 = r0 + (-1)
            if (r2 >= r3) goto L8c
            int r3 = r8 + 1
            int r4 = r2 + 1
            byte r2 = r10.get(r2)
            int r5 = r4 + 1
            byte r4 = r10.get(r4)
            com.google.android.gms.internal.ads.zzheg.zzb(r11, r2, r4, r12, r8)
            r8 = r3
            r11 = r5
            goto L27
        L8c:
            com.google.android.gms.internal.ads.zzhbt r10 = new com.google.android.gms.internal.ads.zzhbt
            r10.<init>(r4)
            throw r10
        L92:
            int r3 = r0 + (-2)
            if (r2 >= r3) goto Lb6
            int r3 = r2 + 1
            byte r4 = r10.get(r2)
            int r2 = r3 + 1
            byte r5 = r10.get(r3)
            int r9 = r2 + 1
            byte r6 = r10.get(r2)
            r2 = r11
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r12
            r7 = r8
            com.google.android.gms.internal.ads.zzheg.zza(r2, r3, r4, r5, r6, r7)
            int r8 = r8 + 2
            r11 = r9
            goto L27
        Lb6:
            com.google.android.gms.internal.ads.zzhbt r10 = new com.google.android.gms.internal.ads.zzhbt
            r10.<init>(r4)
            throw r10
        Lbc:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r12, r1, r8)
            return r10
        Lc2:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r10 = r10.limit()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2[r1] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r11 = 1
            r2[r11] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r11 = 2
            r2[r11] = r10
            java.lang.String r10 = "buffer limit=%d, index=%d, limit=%d"
            java.lang.String r10 = java.lang.String.format(r10, r2)
            r0.<init>(r10)
            throw r0
    }

    abstract int zza(int r1, byte[] r2, int r3, int r4);

    abstract java.lang.String zzb(byte[] r1, int r2, int r3) throws com.google.android.gms.internal.ads.zzhbt;
}
