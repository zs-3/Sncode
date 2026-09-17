package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzadi {
    public static int zza(com.google.android.gms.internal.ads.zzek r0, int r1) {
            switch(r1) {
                case 1: goto L1f;
                case 2: goto L19;
                case 3: goto L19;
                case 4: goto L19;
                case 5: goto L19;
                case 6: goto L12;
                case 7: goto Lb;
                case 8: goto L5;
                case 9: goto L5;
                case 10: goto L5;
                case 11: goto L5;
                case 12: goto L5;
                case 13: goto L5;
                case 14: goto L5;
                case 15: goto L5;
                default: goto L3;
            }
        L3:
            r0 = -1
            return r0
        L5:
            r0 = 256(0x100, float:3.59E-43)
            int r1 = r1 + (-8)
            int r0 = r0 << r1
            return r0
        Lb:
            int r0 = r0.zzq()
            int r0 = r0 + 1
            return r0
        L12:
            int r0 = r0.zzm()
            int r0 = r0 + 1
            return r0
        L19:
            r0 = 576(0x240, float:8.07E-43)
            int r1 = r1 + (-2)
            int r0 = r0 << r1
            return r0
        L1f:
            r0 = 192(0xc0, float:2.69E-43)
            return r0
    }

    public static long zzb(com.google.android.gms.internal.ads.zzadc r5, com.google.android.gms.internal.ads.zzadm r6) throws java.io.IOException {
            r5.zzj()
            r0 = 1
            r5.zzg(r0)
            byte[] r1 = new byte[r0]
            r2 = 0
            r5.zzh(r1, r2, r0)
            r1 = r1[r2]
            r1 = r1 & r0
            if (r0 == r1) goto L14
            r3 = 0
            goto L15
        L14:
            r3 = 1
        L15:
            r4 = 2
            r5.zzg(r4)
            if (r0 == r1) goto L1d
            r0 = 6
            goto L1e
        L1d:
            r0 = 7
        L1e:
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            r1.<init>(r0)
            byte[] r4 = r1.zzN()
            int r0 = com.google.android.gms.internal.ads.zzadf.zza(r5, r4, r2, r0)
            r1.zzK(r0)
            r5.zzj()
            com.google.android.gms.internal.ads.zzadh r5 = new com.google.android.gms.internal.ads.zzadh
            r5.<init>()
            boolean r6 = zzd(r1, r6, r3, r5)
            if (r6 == 0) goto L3f
            long r5 = r5.zza
            return r5
        L3f:
            r5 = 0
            com.google.android.gms.internal.ads.zzbo r5 = com.google.android.gms.internal.ads.zzbo.zza(r5, r5)
            throw r5
    }

    public static boolean zzc(com.google.android.gms.internal.ads.zzek r21, com.google.android.gms.internal.ads.zzadm r22, int r23, com.google.android.gms.internal.ads.zzadh r24) {
            r0 = r21
            r1 = r22
            int r2 = r21.zzd()
            long r3 = r21.zzu()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r23
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L19
            return r9
        L19:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = 0
        L24:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 8
            long r13 = r3 >> r13
            r15 = 4
            long r15 = r3 >> r15
            long r17 = r3 >> r10
            long r3 = r3 & r7
            r19 = 15
            long r9 = r15 & r19
            int r10 = (int) r9
            r9 = 7
            r15 = -1
            if (r10 > r9) goto L41
            int r9 = r1.zzg
            int r9 = r9 + r15
            if (r10 != r9) goto Laf
            goto L4a
        L41:
            r9 = 10
            if (r10 > r9) goto Laf
            int r9 = r1.zzg
            r10 = 2
            if (r9 != r10) goto Laf
        L4a:
            r9 = 7
            long r9 = r17 & r9
            int r10 = (int) r9
            if (r10 != 0) goto L52
            goto L56
        L52:
            int r9 = r1.zzi
            if (r10 != r9) goto Laf
        L56:
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto Laf
            r3 = r24
            boolean r3 = zzd(r0, r1, r5, r3)
            if (r3 == 0) goto Laf
            long r3 = r11 & r19
            int r4 = (int) r3
            int r3 = zza(r0, r4)
            if (r3 == r15) goto Laf
            int r4 = r1.zzb
            if (r3 > r4) goto Laf
            long r3 = r13 & r19
            int r5 = r1.zze
            int r4 = (int) r3
            if (r4 != 0) goto L77
            goto L99
        L77:
            r3 = 11
            if (r4 > r3) goto L80
            int r1 = r1.zzf
            if (r4 == r1) goto L99
            goto Laf
        L80:
            if (r4 != r6) goto L8b
            int r1 = r21.zzm()
            int r1 = r1 * 1000
            if (r1 != r5) goto Laf
            goto L99
        L8b:
            r1 = 14
            if (r4 > r1) goto Laf
            int r3 = r21.zzq()
            if (r4 != r1) goto L97
            int r3 = r3 * 10
        L97:
            if (r3 != r5) goto Laf
        L99:
            int r1 = r21.zzm()
            int r3 = r21.zzd()
            byte[] r0 = r21.zzN()
            int r3 = r3 + r15
            r4 = 0
            int r0 = com.google.android.gms.internal.ads.zzeu.zzf(r0, r2, r3, r4)
            if (r1 != r0) goto Laf
            r0 = 1
            return r0
        Laf:
            r0 = 0
            return r0
    }

    private static boolean zzd(com.google.android.gms.internal.ads.zzek r2, com.google.android.gms.internal.ads.zzadm r3, boolean r4, com.google.android.gms.internal.ads.zzadh r5) {
            long r0 = r2.zzx()     // Catch: java.lang.NumberFormatException -> L10
            if (r4 == 0) goto L7
            goto Lc
        L7:
            int r2 = r3.zzb
            long r2 = (long) r2
            long r0 = r0 * r2
        Lc:
            r5.zza = r0
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }
}
