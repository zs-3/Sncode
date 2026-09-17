package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcj {
    public final int zza;
    private final com.google.android.gms.internal.ads.zzcd zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
            r0 = 0
            r1 = 36
            java.lang.Integer.toString(r0, r1)
            r0 = 1
            java.lang.Integer.toString(r0, r1)
            r0 = 3
            java.lang.Integer.toString(r0, r1)
            r0 = 4
            java.lang.Integer.toString(r0, r1)
            return
    }

    public zzcj(com.google.android.gms.internal.ads.zzcd r5, boolean r6, int[] r7, boolean[] r8) {
            r4 = this;
            r4.<init>()
            int r0 = r5.zza
            r4.zza = r0
            int r1 = r7.length
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L11
            int r1 = r8.length
            if (r0 != r1) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            com.google.android.gms.internal.ads.zzdi.zzd(r1)
            r4.zzb = r5
            if (r6 == 0) goto L1c
            if (r0 <= r2) goto L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            r4.zzc = r2
            java.lang.Object r5 = r7.clone()
            int[] r5 = (int[]) r5
            r4.zzd = r5
            java.lang.Object r5 = r8.clone()
            boolean[] r5 = (boolean[]) r5
            r4.zze = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L37
            java.lang.Class<com.google.android.gms.internal.ads.zzcj> r2 = com.google.android.gms.internal.ads.zzcj.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L37
        L10:
            com.google.android.gms.internal.ads.zzcj r5 = (com.google.android.gms.internal.ads.zzcj) r5
            boolean r2 = r4.zzc
            boolean r3 = r5.zzc
            if (r2 != r3) goto L37
            com.google.android.gms.internal.ads.zzcd r2 = r4.zzb
            com.google.android.gms.internal.ads.zzcd r3 = r5.zzb
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L37
            int[] r2 = r4.zzd
            int[] r3 = r5.zzd
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L37
            boolean[] r2 = r4.zze
            boolean[] r5 = r5.zze
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L37
            return r0
        L37:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            com.google.android.gms.internal.ads.zzcd r0 = r3.zzb
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int[] r1 = r3.zzd
            boolean r2 = r3.zzc
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            boolean[] r1 = r3.zze
            int r0 = r0 * 31
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    public final int zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcd r0 = r1.zzb
            int r0 = r0.zzc
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaf zzb(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcd r0 = r1.zzb
            com.google.android.gms.internal.ads.zzaf r2 = r0.zzb(r2)
            return r2
    }

    public final boolean zzc() {
            r6 = this;
            boolean[] r0 = r6.zze
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            r4 = 1
            if (r3 >= r1) goto L11
            boolean r5 = r0[r3]
            if (r5 != r4) goto Le
            r2 = 1
            goto L11
        Le:
            int r3 = r3 + 1
            goto L5
        L11:
            return r2
    }

    public final boolean zzd(int r2) {
            r1 = this;
            boolean[] r0 = r1.zze
            boolean r2 = r0[r2]
            return r2
    }
}
