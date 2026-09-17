package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaju {
    public final com.google.android.gms.internal.ads.zzajr zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzaju(com.google.android.gms.internal.ads.zzajr r6, long[] r7, int[] r8, int r9, long[] r10, int[] r11, long r12) {
            r5 = this;
            r5.<init>()
            int r0 = r8.length
            int r1 = r10.length
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            int r0 = r7.length
            if (r0 != r1) goto L14
            r4 = 1
            goto L15
        L14:
            r4 = 0
        L15:
            com.google.android.gms.internal.ads.zzdi.zzd(r4)
            int r4 = r11.length
            if (r4 != r1) goto L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            com.google.android.gms.internal.ads.zzdi.zzd(r2)
            r5.zza = r6
            r5.zzc = r7
            r5.zzd = r8
            r5.zze = r9
            r5.zzf = r10
            r5.zzg = r11
            r5.zzh = r12
            r5.zzb = r0
            if (r4 <= 0) goto L3b
            int r4 = r4 + (-1)
            r6 = r11[r4]
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = r6 | r7
            r11[r4] = r6
        L3b:
            return
    }

    public final int zza(long r4) {
            r3 = this;
            long[] r0 = r3.zzf
            r1 = 1
            r2 = 0
            int r4 = com.google.android.gms.internal.ads.zzeu.zzc(r0, r4, r1, r2)
        L8:
            if (r4 < 0) goto L15
            int[] r5 = r3.zzg
            r5 = r5[r4]
            r5 = r5 & r1
            if (r5 == 0) goto L12
            return r4
        L12:
            int r4 = r4 + (-1)
            goto L8
        L15:
            r4 = -1
            return r4
    }

    public final int zzb(long r4) {
            r3 = this;
            long[] r0 = r3.zzf
            r1 = 1
            r2 = 0
            int r4 = com.google.android.gms.internal.ads.zzeu.zza(r0, r4, r1, r2)
        L8:
            long[] r5 = r3.zzf
            int r5 = r5.length
            if (r4 >= r5) goto L18
            int[] r5 = r3.zzg
            r5 = r5[r4]
            r5 = r5 & r1
            if (r5 == 0) goto L15
            return r4
        L15:
            int r4 = r4 + 1
            goto L8
        L18:
            r4 = -1
            return r4
    }
}
