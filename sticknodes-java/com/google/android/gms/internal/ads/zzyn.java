package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzyn {
    private final int[] zza;
    private final com.google.android.gms.internal.ads.zzwy[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final com.google.android.gms.internal.ads.zzwy zze;

    zzyn(java.lang.String[] r1, int[] r2, com.google.android.gms.internal.ads.zzwy[] r3, int[] r4, int[][][] r5, com.google.android.gms.internal.ads.zzwy r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            r0.zzd = r5
            r0.zzc = r4
            r0.zze = r6
            return
    }

    public final int zza(int r8, int r9, boolean r10) {
            r7 = this;
            com.google.android.gms.internal.ads.zzwy[] r10 = r7.zzb
            r10 = r10[r8]
            com.google.android.gms.internal.ads.zzcd r10 = r10.zzb(r9)
            int r10 = r10.zza
            int[] r0 = new int[r10]
            r1 = 0
            r2 = 0
            r3 = 0
        Lf:
            if (r2 >= r10) goto L26
            int[][][] r4 = r7.zzd
            r4 = r4[r8]
            r4 = r4[r9]
            r4 = r4[r2]
            r4 = r4 & 7
            r5 = 4
            if (r4 != r5) goto L23
            int r4 = r3 + 1
            r0[r3] = r2
            r3 = r4
        L23:
            int r2 = r2 + 1
            goto Lf
        L26:
            int[] r10 = java.util.Arrays.copyOf(r0, r3)
            r0 = 0
            r2 = 16
            r2 = 0
            r3 = 0
            r4 = 16
        L31:
            int r5 = r10.length
            if (r1 >= r5) goto L63
            r5 = r10[r1]
            com.google.android.gms.internal.ads.zzwy[] r6 = r7.zzb
            r6 = r6[r8]
            com.google.android.gms.internal.ads.zzcd r6 = r6.zzb(r9)
            com.google.android.gms.internal.ads.zzaf r5 = r6.zzb(r5)
            java.lang.String r5 = r5.zzn
            int r6 = r3 + 1
            if (r3 != 0) goto L4a
            r0 = r5
            goto L51
        L4a:
            boolean r3 = java.util.Objects.equals(r0, r5)
            r3 = r3 ^ 1
            r2 = r2 | r3
        L51:
            int[][][] r3 = r7.zzd
            r3 = r3[r8]
            r3 = r3[r9]
            r3 = r3[r1]
            r3 = r3 & 24
            int r4 = java.lang.Math.min(r4, r3)
            int r1 = r1 + 1
            r3 = r6
            goto L31
        L63:
            if (r2 == 0) goto L6e
            int[] r9 = r7.zzc
            r8 = r9[r8]
            int r8 = java.lang.Math.min(r4, r8)
            return r8
        L6e:
            return r4
    }

    public final int zzb(int r2, int r3, int r4) {
            r1 = this;
            int[][][] r0 = r1.zzd
            r2 = r0[r2]
            r2 = r2[r3]
            r2 = r2[r4]
            return r2
    }

    public final int zzc(int r2) {
            r1 = this;
            int[] r0 = r1.zza
            r2 = r0[r2]
            return r2
    }

    public final com.google.android.gms.internal.ads.zzwy zzd(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzwy[] r0 = r1.zzb
            r2 = r0[r2]
            return r2
    }

    public final com.google.android.gms.internal.ads.zzwy zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzwy r0 = r1.zze
            return r0
    }
}
