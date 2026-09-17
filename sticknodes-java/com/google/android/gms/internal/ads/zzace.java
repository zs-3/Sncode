package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzace {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = null;

    static {
            r0 = 14
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048} // fill-array
            com.google.android.gms.internal.ads.zzace.zzb = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzacd zza(com.google.android.gms.internal.ads.zzej r11) {
            r0 = 16
            int r1 = r11.zzd(r0)
            int r0 = r11.zzd(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r11.zzd(r0)
            r3 = 7
            goto L19
        L18:
            r3 = 4
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r11.zzd(r0)
            r3 = 0
            r4 = 3
            if (r1 != r4) goto L3d
            r1 = 0
        L2c:
            int r5 = r11.zzd(r0)
            int r1 = r1 + r5
            boolean r5 = r11.zzp()
            if (r5 != 0) goto L39
            int r1 = r1 + r4
            goto L3d
        L39:
            int r1 = r1 + 1
            int r1 = r1 << r0
            goto L2c
        L3d:
            r5 = 10
            int r5 = r11.zzd(r5)
            boolean r6 = r11.zzp()
            if (r6 == 0) goto L52
            int r6 = r11.zzd(r4)
            if (r6 <= 0) goto L52
            r11.zzn(r0)
        L52:
            boolean r6 = r11.zzp()
            r8 = 44100(0xac44, float:6.1797E-41)
            r9 = 48000(0xbb80, float:6.7262E-41)
            r10 = 1
            if (r10 == r6) goto L63
            r6 = 44100(0xac44, float:6.1797E-41)
            goto L66
        L63:
            r6 = 48000(0xbb80, float:6.7262E-41)
        L66:
            int r11 = r11.zzd(r2)
            if (r6 != r8) goto L76
            r8 = 13
            if (r11 != r8) goto L76
            int[] r11 = com.google.android.gms.internal.ads.zzace.zzb
            r11 = r11[r8]
            r8 = r11
            goto La6
        L76:
            if (r6 != r9) goto La5
            r8 = 14
            if (r11 >= r8) goto La5
            int[] r3 = com.google.android.gms.internal.ads.zzace.zzb
            r3 = r3[r11]
            int r5 = r5 % 5
            r8 = 8
            if (r5 == r10) goto L9b
            r9 = 11
            if (r5 == r0) goto L96
            if (r5 == r4) goto L9b
            if (r5 == r2) goto L8f
            goto La0
        L8f:
            if (r11 == r4) goto La2
            if (r11 == r8) goto La2
            if (r11 != r9) goto La0
            goto La2
        L96:
            if (r11 == r8) goto La2
            if (r11 != r9) goto La0
            goto La2
        L9b:
            if (r11 == r4) goto La2
            if (r11 != r8) goto La0
            goto La2
        La0:
            r8 = r3
            goto La6
        La2:
            int r3 = r3 + 1
            goto La0
        La5:
            r8 = 0
        La6:
            com.google.android.gms.internal.ads.zzacd r11 = new com.google.android.gms.internal.ads.zzacd
            r5 = 2
            r9 = 0
            r3 = r11
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public static void zzb(int r2, com.google.android.gms.internal.ads.zzek r3) {
            r0 = 7
            r3.zzI(r0)
            byte[] r3 = r3.zzN()
            r0 = 0
            r1 = -84
            r3[r0] = r1
            r0 = 1
            r1 = 64
            r3[r0] = r1
            r0 = 2
            r1 = -1
            r3[r0] = r1
            r0 = 3
            r3[r0] = r1
            int r0 = r2 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1 = 4
            r3[r1] = r0
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1 = 5
            r3[r1] = r0
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0 = 6
            r3[r0] = r2
            return
    }
}
