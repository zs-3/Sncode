package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaib {
    private final com.google.android.gms.internal.ads.zzek zza;
    private int zzb;

    public zzaib() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 8
            r0.<init>(r1)
            r2.zza = r0
            return
    }

    private final long zzb(com.google.android.gms.internal.ads.zzadc r8) throws java.io.IOException {
            r7 = this;
            com.google.android.gms.internal.ads.zzek r0 = r7.zza
            byte[] r0 = r0.zzN()
            com.google.android.gms.internal.ads.zzacq r8 = (com.google.android.gms.internal.ads.zzacq) r8
            r1 = 0
            r2 = 1
            r8.zzm(r0, r1, r2, r1)
            com.google.android.gms.internal.ads.zzek r0 = r7.zza
            byte[] r0 = r0.zzN()
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L4a
            r3 = 128(0x80, float:1.794E-43)
            r4 = 0
        L1c:
            int r5 = r4 + 1
            r6 = r0 & r3
            if (r6 != 0) goto L26
            int r3 = r3 >> 1
            r4 = r5
            goto L1c
        L26:
            int r3 = ~r3
            r0 = r0 & r3
            com.google.android.gms.internal.ads.zzek r3 = r7.zza
            byte[] r3 = r3.zzN()
            r8.zzm(r3, r2, r4, r1)
        L31:
            if (r1 >= r4) goto L43
            int r8 = r0 << 8
            com.google.android.gms.internal.ads.zzek r0 = r7.zza
            int r1 = r1 + 1
            byte[] r0 = r0.zzN()
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r8
            goto L31
        L43:
            int r8 = r7.zzb
            int r8 = r8 + r5
            r7.zzb = r8
            long r0 = (long) r0
            return r0
        L4a:
            r0 = -9223372036854775808
            return r0
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzadc r14) throws java.io.IOException {
            r13 = this;
            long r0 = r14.zzd()
            r2 = 1024(0x400, double:5.06E-321)
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L12
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L11
            goto L12
        L11:
            r2 = r0
        L12:
            com.google.android.gms.internal.ads.zzek r4 = r13.zza
            byte[] r4 = r4.zzN()
            r5 = r14
            com.google.android.gms.internal.ads.zzacq r5 = (com.google.android.gms.internal.ads.zzacq) r5
            r7 = 0
            r8 = 4
            r5.zzm(r4, r7, r8, r7)
            com.google.android.gms.internal.ads.zzek r4 = r13.zza
            long r9 = r4.zzu()
            r13.zzb = r8
        L28:
            r11 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            r4 = 1
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 == 0) goto L57
            int r8 = (int) r2
            int r11 = r13.zzb
            int r11 = r11 + r4
            r13.zzb = r11
            if (r11 != r8) goto L39
            return r7
        L39:
            com.google.android.gms.internal.ads.zzek r8 = r13.zza
            byte[] r8 = r8.zzN()
            r5.zzm(r8, r7, r4, r7)
            r4 = 8
            long r8 = r9 << r4
            com.google.android.gms.internal.ads.zzek r4 = r13.zza
            byte[] r4 = r4.zzN()
            r4 = r4[r7]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r10 = -256(0xffffffffffffff00, double:NaN)
            long r8 = r8 & r10
            long r10 = (long) r4
            long r9 = r8 | r10
            goto L28
        L57:
            long r2 = r13.zzb(r14)
            int r8 = r13.zzb
            long r8 = (long) r8
            r10 = -9223372036854775808
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 == 0) goto L97
            long r8 = r8 + r2
            if (r6 != 0) goto L68
            goto L6d
        L68:
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L6d
            goto L97
        L6d:
            int r0 = r13.zzb
            long r0 = (long) r0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L94
            long r0 = r13.zzb(r14)
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 != 0) goto L7d
            return r7
        L7d:
            long r0 = r13.zzb(r14)
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L93
            if (r6 == 0) goto L6d
            int r1 = (int) r0
            r5.zzl(r1, r7)
            int r0 = r13.zzb
            int r0 = r0 + r1
            r13.zzb = r0
            goto L6d
        L93:
            return r7
        L94:
            if (r2 != 0) goto L97
            return r4
        L97:
            return r7
    }
}
