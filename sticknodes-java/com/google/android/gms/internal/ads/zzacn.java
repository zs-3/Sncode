package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzacn {
    public static void zza(long r10, com.google.android.gms.internal.ads.zzek r12, com.google.android.gms.internal.ads.zzaeh[] r13) {
        L0:
            int r0 = r12.zzb()
            r1 = 1
            if (r0 <= r1) goto L75
            int r0 = zzc(r12)
            int r2 = zzc(r12)
            int r3 = r12.zzd()
            int r3 = r3 + r2
            r4 = -1
            if (r2 == r4) goto L66
            int r4 = r12.zzb()
            if (r2 <= r4) goto L1e
            goto L66
        L1e:
            r4 = 4
            if (r0 != r4) goto L71
            r0 = 8
            if (r2 < r0) goto L71
            int r0 = r12.zzm()
            int r2 = r12.zzq()
            r4 = 49
            r5 = 0
            if (r2 != r4) goto L3a
            int r2 = r12.zzg()
            r6 = r2
            r2 = 49
            goto L3b
        L3a:
            r6 = 0
        L3b:
            int r7 = r12.zzm()
            r8 = 47
            if (r2 != r8) goto L48
            r12.zzM(r1)
            r2 = 47
        L48:
            r9 = 181(0xb5, float:2.54E-43)
            if (r0 != r9) goto L55
            if (r2 == r4) goto L50
            if (r2 != r8) goto L55
        L50:
            r0 = 3
            if (r7 != r0) goto L55
            r0 = 1
            goto L56
        L55:
            r0 = 0
        L56:
            if (r2 != r4) goto L60
            r2 = 1195456820(0x47413934, float:49465.203)
            if (r6 != r2) goto L5e
            goto L5f
        L5e:
            r1 = 0
        L5f:
            r0 = r0 & r1
        L60:
            if (r0 == 0) goto L71
            zzb(r10, r12, r13)
            goto L71
        L66:
            java.lang.String r0 = "CeaUtil"
            java.lang.String r1 = "Skipping remainder of malformed SEI NAL unit."
            com.google.android.gms.internal.ads.zzea.zzf(r0, r1)
            int r3 = r12.zze()
        L71:
            r12.zzL(r3)
            goto L0
        L75:
            return
    }

    public static void zzb(long r15, com.google.android.gms.internal.ads.zzek r17, com.google.android.gms.internal.ads.zzaeh[] r18) {
            r0 = r17
            r1 = r18
            int r2 = r17.zzm()
            r3 = r2 & 64
            if (r3 == 0) goto L3e
            r2 = r2 & 31
            r3 = 1
            r0.zzM(r3)
            int r4 = r17.zzd()
            int r5 = r1.length
            r6 = 0
            r7 = 0
        L19:
            if (r7 >= r5) goto L3e
            int r12 = r2 * 3
            r8 = r1[r7]
            r0.zzL(r4)
            r8.zzq(r0, r12)
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r11 == 0) goto L30
            r9 = 1
            goto L31
        L30:
            r9 = 0
        L31:
            com.google.android.gms.internal.ads.zzdi.zzf(r9)
            r11 = 1
            r13 = 0
            r14 = 0
            r9 = r15
            r8.zzs(r9, r11, r12, r13, r14)
            int r7 = r7 + 1
            goto L19
        L3e:
            return
    }

    private static int zzc(com.google.android.gms.internal.ads.zzek r3) {
            r0 = 0
        L1:
            int r1 = r3.zzb()
            if (r1 != 0) goto L9
            r3 = -1
            return r3
        L9:
            int r1 = r3.zzm()
            int r0 = r0 + r1
            r2 = 255(0xff, float:3.57E-43)
            if (r1 == r2) goto L1
            return r0
    }
}
