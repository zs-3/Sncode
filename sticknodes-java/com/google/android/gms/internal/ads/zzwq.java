package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzwq {
    private final java.util.Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzwq(int r2) {
            r1 = this;
            java.util.Random r2 = new java.util.Random
            r2.<init>()
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    private zzwq(int r1, java.util.Random r2) {
            r0 = this;
            r1 = 0
            int[] r1 = new int[r1]
            r0.<init>(r1, r2)
            return
    }

    private zzwq(int[] r3, java.util.Random r4) {
            r2 = this;
            r2.<init>()
            r2.zzb = r3
            r2.zza = r4
            int r4 = r3.length
            int[] r4 = new int[r4]
            r2.zzc = r4
            r4 = 0
        Ld:
            int r0 = r3.length
            if (r4 >= r0) goto L19
            int[] r0 = r2.zzc
            r1 = r3[r4]
            r0[r1] = r4
            int r4 = r4 + 1
            goto Ld
        L19:
            return
    }

    public final int zza() {
            r2 = this;
            int[] r0 = r2.zzb
            int r1 = r0.length
            if (r1 <= 0) goto L9
            r1 = 0
            r0 = r0[r1]
            return r0
        L9:
            r0 = -1
            return r0
    }

    public final int zzb() {
            r3 = this;
            int[] r0 = r3.zzb
            int r1 = r0.length
            r2 = -1
            if (r1 <= 0) goto La
            int r1 = r1 + r2
            r0 = r0[r1]
            return r0
        La:
            return r2
    }

    public final int zzc() {
            r1 = this;
            int[] r0 = r1.zzb
            int r0 = r0.length
            return r0
    }

    public final int zzd(int r3) {
            r2 = this;
            int[] r0 = r2.zzc
            r3 = r0[r3]
            int r3 = r3 + 1
            int[] r0 = r2.zzb
            int r1 = r0.length
            if (r3 >= r1) goto Le
            r3 = r0[r3]
            return r3
        Le:
            r3 = -1
            return r3
    }

    public final int zze(int r2) {
            r1 = this;
            int[] r0 = r1.zzc
            r2 = r0[r2]
            r0 = -1
            int r2 = r2 + r0
            if (r2 < 0) goto Ld
            int[] r0 = r1.zzb
            r2 = r0[r2]
            return r2
        Ld:
            return r0
    }

    public final com.google.android.gms.internal.ads.zzwq zzf() {
            r5 = this;
            com.google.android.gms.internal.ads.zzwq r0 = new com.google.android.gms.internal.ads.zzwq
            java.util.Random r1 = r5.zza
            java.util.Random r2 = new java.util.Random
            long r3 = r1.nextLong()
            r2.<init>(r3)
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzwq zzg(int r8, int r9) {
            r7 = this;
            int[] r8 = new int[r9]
            int[] r0 = new int[r9]
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r9) goto L25
            java.util.Random r3 = r7.zza
            int[] r4 = r7.zzb
            int r4 = r4.length
            int r4 = r4 + 1
            int r3 = r3.nextInt(r4)
            r8[r2] = r3
            java.util.Random r3 = r7.zza
            int r4 = r2 + 1
            int r3 = r3.nextInt(r4)
            r5 = r0[r3]
            r0[r2] = r5
            r0[r3] = r2
            r2 = r4
            goto L6
        L25:
            java.util.Arrays.sort(r8)
            int[] r2 = r7.zzb
            int r2 = r2.length
            int r2 = r2 + r9
            int[] r2 = new int[r2]
            r3 = 0
            r4 = 0
        L30:
            int[] r5 = r7.zzb
            int r6 = r5.length
            int r6 = r6 + r9
            if (r1 >= r6) goto L53
            if (r3 >= r9) goto L44
            r6 = r8[r3]
            if (r4 != r6) goto L44
            int r5 = r3 + 1
            r3 = r0[r3]
            r2[r1] = r3
            r3 = r5
            goto L50
        L44:
            int r6 = r4 + 1
            r4 = r5[r4]
            r2[r1] = r4
            if (r4 < 0) goto L4f
            int r4 = r4 + r9
            r2[r1] = r4
        L4f:
            r4 = r6
        L50:
            int r1 = r1 + 1
            goto L30
        L53:
            java.util.Random r8 = r7.zza
            com.google.android.gms.internal.ads.zzwq r9 = new com.google.android.gms.internal.ads.zzwq
            java.util.Random r0 = new java.util.Random
            long r3 = r8.nextLong()
            r0.<init>(r3)
            r9.<init>(r2, r0)
            return r9
    }

    public final com.google.android.gms.internal.ads.zzwq zzh(int r5, int r6) {
            r4 = this;
            int[] r5 = r4.zzb
            int r5 = r5.length
            int r5 = r5 - r6
            int[] r5 = new int[r5]
            r0 = 0
            r1 = 0
        L8:
            int[] r2 = r4.zzb
            int r3 = r2.length
            if (r0 >= r3) goto L20
            r2 = r2[r0]
            if (r2 < 0) goto L16
            if (r2 >= r6) goto L16
            int r1 = r1 + 1
            goto L1d
        L16:
            int r3 = r0 - r1
            if (r2 < 0) goto L1b
            int r2 = r2 - r6
        L1b:
            r5[r3] = r2
        L1d:
            int r0 = r0 + 1
            goto L8
        L20:
            java.util.Random r6 = r4.zza
            com.google.android.gms.internal.ads.zzwq r0 = new com.google.android.gms.internal.ads.zzwq
            java.util.Random r1 = new java.util.Random
            long r2 = r6.nextLong()
            r1.<init>(r2)
            r0.<init>(r5, r1)
            return r0
    }
}
