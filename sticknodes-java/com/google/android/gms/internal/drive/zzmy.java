package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzmy {
    private static final com.google.android.gms.internal.drive.zzmy zzvr = null;
    private int count;
    private boolean zznh;
    private int zzrr;
    private java.lang.Object[] zzue;
    private int[] zzvs;

    static {
            com.google.android.gms.internal.drive.zzmy r0 = new com.google.android.gms.internal.drive.zzmy
            r1 = 0
            int[] r2 = new int[r1]
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.<init>(r1, r2, r3, r1)
            com.google.android.gms.internal.drive.zzmy.zzvr = r0
            return
    }

    private zzmy() {
            r4 = this;
            r0 = 8
            int[] r1 = new int[r0]
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r3 = 1
            r4.<init>(r2, r1, r0, r3)
            return
    }

    private zzmy(int r2, int[] r3, java.lang.Object[] r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.zzrr = r0
            r1.count = r2
            r1.zzvs = r3
            r1.zzue = r4
            r1.zznh = r5
            return
    }

    static com.google.android.gms.internal.drive.zzmy zza(com.google.android.gms.internal.drive.zzmy r6, com.google.android.gms.internal.drive.zzmy r7) {
            int r0 = r6.count
            int r1 = r7.count
            int r0 = r0 + r1
            int[] r1 = r6.zzvs
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            int[] r2 = r7.zzvs
            int r3 = r6.count
            int r4 = r7.count
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r1, r3, r4)
            java.lang.Object[] r2 = r6.zzue
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.Object[] r3 = r7.zzue
            int r6 = r6.count
            int r7 = r7.count
            java.lang.System.arraycopy(r3, r5, r2, r6, r7)
            com.google.android.gms.internal.drive.zzmy r6 = new com.google.android.gms.internal.drive.zzmy
            r7 = 1
            r6.<init>(r0, r1, r2, r7)
            return r6
    }

    private static void zzb(int r2, java.lang.Object r3, com.google.android.gms.internal.drive.zzns r4) throws java.io.IOException {
            int r0 = r2 >>> 3
            r2 = r2 & 7
            if (r2 == 0) goto L56
            r1 = 1
            if (r2 == r1) goto L4c
            r1 = 2
            if (r2 == r1) goto L46
            r1 = 3
            if (r2 == r1) goto L26
            r1 = 5
            if (r2 != r1) goto L1c
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r4.zzf(r0, r2)
            return
        L1c:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            com.google.android.gms.internal.drive.zzkr r3 = com.google.android.gms.internal.drive.zzkq.zzdl()
            r2.<init>(r3)
            throw r2
        L26:
            int r2 = r4.zzcd()
            int r1 = com.google.android.gms.internal.drive.zzkk.zze.zzsi
            if (r2 != r1) goto L3a
            r4.zzak(r0)
            com.google.android.gms.internal.drive.zzmy r3 = (com.google.android.gms.internal.drive.zzmy) r3
            r3.zzb(r4)
            r4.zzal(r0)
            return
        L3a:
            r4.zzal(r0)
            com.google.android.gms.internal.drive.zzmy r3 = (com.google.android.gms.internal.drive.zzmy) r3
            r3.zzb(r4)
            r4.zzak(r0)
            return
        L46:
            com.google.android.gms.internal.drive.zzjc r3 = (com.google.android.gms.internal.drive.zzjc) r3
            r4.zza(r0, r3)
            return
        L4c:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r4.zzc(r0, r2)
            return
        L56:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r4.zzi(r0, r2)
            return
    }

    public static com.google.android.gms.internal.drive.zzmy zzfa() {
            com.google.android.gms.internal.drive.zzmy r0 = com.google.android.gms.internal.drive.zzmy.zzvr
            return r0
    }

    static com.google.android.gms.internal.drive.zzmy zzfb() {
            com.google.android.gms.internal.drive.zzmy r0 = new com.google.android.gms.internal.drive.zzmy
            r0.<init>()
            return r0
    }

    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 != 0) goto L8
            return r1
        L8:
            boolean r2 = r9 instanceof com.google.android.gms.internal.drive.zzmy
            if (r2 != 0) goto Ld
            return r1
        Ld:
            com.google.android.gms.internal.drive.zzmy r9 = (com.google.android.gms.internal.drive.zzmy) r9
            int r2 = r8.count
            int r3 = r9.count
            if (r2 != r3) goto L47
            int[] r3 = r8.zzvs
            int[] r4 = r9.zzvs
            r5 = 0
        L1a:
            if (r5 >= r2) goto L27
            r6 = r3[r5]
            r7 = r4[r5]
            if (r6 == r7) goto L24
            r2 = 0
            goto L28
        L24:
            int r5 = r5 + 1
            goto L1a
        L27:
            r2 = 1
        L28:
            if (r2 == 0) goto L47
            java.lang.Object[] r2 = r8.zzue
            java.lang.Object[] r9 = r9.zzue
            int r3 = r8.count
            r4 = 0
        L31:
            if (r4 >= r3) goto L42
            r5 = r2[r4]
            r6 = r9[r4]
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3f
            r9 = 0
            goto L43
        L3f:
            int r4 = r4 + 1
            goto L31
        L42:
            r9 = 1
        L43:
            if (r9 != 0) goto L46
            goto L47
        L46:
            return r0
        L47:
            return r1
    }

    public final int hashCode() {
            r8 = this;
            int r0 = r8.count
            int r1 = r0 + 527
            int r1 = r1 * 31
            int[] r2 = r8.zzvs
            r3 = 0
            r4 = 17
            r5 = 0
            r6 = 17
        Le:
            if (r5 >= r0) goto L18
            int r6 = r6 * 31
            r7 = r2[r5]
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto Le
        L18:
            int r1 = r1 + r6
            int r1 = r1 * 31
            java.lang.Object[] r0 = r8.zzue
            int r2 = r8.count
        L1f:
            if (r3 >= r2) goto L2d
            int r4 = r4 * 31
            r5 = r0[r3]
            int r5 = r5.hashCode()
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L1f
        L2d:
            int r1 = r1 + r4
            return r1
    }

    final void zza(com.google.android.gms.internal.drive.zzns r4) throws java.io.IOException {
            r3 = this;
            int r0 = r4.zzcd()
            int r1 = com.google.android.gms.internal.drive.zzkk.zze.zzsj
            if (r0 != r1) goto L1f
            int r0 = r3.count
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L1e
            int[] r1 = r3.zzvs
            r1 = r1[r0]
            int r1 = r1 >>> 3
            java.lang.Object[] r2 = r3.zzue
            r2 = r2[r0]
            r4.zza(r1, r2)
            int r0 = r0 + (-1)
            goto Lc
        L1e:
            return
        L1f:
            r0 = 0
        L20:
            int r1 = r3.count
            if (r0 >= r1) goto L34
            int[] r1 = r3.zzvs
            r1 = r1[r0]
            int r1 = r1 >>> 3
            java.lang.Object[] r2 = r3.zzue
            r2 = r2[r0]
            r4.zza(r1, r2)
            int r0 = r0 + 1
            goto L20
        L34:
            return
    }

    final void zza(java.lang.StringBuilder r4, int r5) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.count
            if (r0 >= r1) goto L19
            int[] r1 = r3.zzvs
            r1 = r1[r0]
            int r1 = r1 >>> 3
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Object[] r2 = r3.zzue
            r2 = r2[r0]
            com.google.android.gms.internal.drive.zzlt.zza(r4, r5, r1, r2)
            int r0 = r0 + 1
            goto L1
        L19:
            return
    }

    final void zzb(int r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r3.zznh
            if (r0 == 0) goto L31
            int r0 = r3.count
            int[] r1 = r3.zzvs
            int r2 = r1.length
            if (r0 != r2) goto L22
            r2 = 4
            if (r0 >= r2) goto L11
            r2 = 8
            goto L13
        L11:
            int r2 = r0 >> 1
        L13:
            int r0 = r0 + r2
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.zzvs = r1
            java.lang.Object[] r1 = r3.zzue
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.zzue = r0
        L22:
            int[] r0 = r3.zzvs
            int r1 = r3.count
            r0[r1] = r4
            java.lang.Object[] r4 = r3.zzue
            r4[r1] = r5
            int r1 = r1 + 1
            r3.count = r1
            return
        L31:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
    }

    public final void zzb(com.google.android.gms.internal.drive.zzns r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.count
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r4.zzcd()
            int r1 = com.google.android.gms.internal.drive.zzkk.zze.zzsi
            if (r0 != r1) goto L21
            r0 = 0
        Le:
            int r1 = r3.count
            if (r0 >= r1) goto L20
            int[] r1 = r3.zzvs
            r1 = r1[r0]
            java.lang.Object[] r2 = r3.zzue
            r2 = r2[r0]
            zzb(r1, r2, r4)
            int r0 = r0 + 1
            goto Le
        L20:
            return
        L21:
            int r0 = r3.count
            int r0 = r0 + (-1)
        L25:
            if (r0 < 0) goto L35
            int[] r1 = r3.zzvs
            r1 = r1[r0]
            java.lang.Object[] r2 = r3.zzue
            r2 = r2[r0]
            zzb(r1, r2, r4)
            int r0 = r0 + (-1)
            goto L25
        L35:
            return
    }

    public final void zzbp() {
            r1 = this;
            r0 = 0
            r1.zznh = r0
            return
    }

    public final int zzcx() {
            r6 = this;
            int r0 = r6.zzrr
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            r0 = 0
            r1 = 0
        L8:
            int r2 = r6.count
            if (r0 >= r2) goto L78
            int[] r2 = r6.zzvs
            r2 = r2[r0]
            int r3 = r2 >>> 3
            r2 = r2 & 7
            if (r2 == 0) goto L66
            r4 = 1
            if (r2 == r4) goto L57
            r5 = 2
            if (r2 == r5) goto L4c
            r5 = 3
            if (r2 == r5) goto L3b
            r4 = 5
            if (r2 != r4) goto L31
            java.lang.Object[] r2 = r6.zzue
            r2 = r2[r0]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = com.google.android.gms.internal.drive.zzjr.zzj(r3, r2)
            goto L74
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            com.google.android.gms.internal.drive.zzkr r1 = com.google.android.gms.internal.drive.zzkq.zzdl()
            r0.<init>(r1)
            throw r0
        L3b:
            int r2 = com.google.android.gms.internal.drive.zzjr.zzab(r3)
            int r2 = r2 << r4
            java.lang.Object[] r3 = r6.zzue
            r3 = r3[r0]
            com.google.android.gms.internal.drive.zzmy r3 = (com.google.android.gms.internal.drive.zzmy) r3
            int r3 = r3.zzcx()
            int r2 = r2 + r3
            goto L74
        L4c:
            java.lang.Object[] r2 = r6.zzue
            r2 = r2[r0]
            com.google.android.gms.internal.drive.zzjc r2 = (com.google.android.gms.internal.drive.zzjc) r2
            int r2 = com.google.android.gms.internal.drive.zzjr.zzc(r3, r2)
            goto L74
        L57:
            java.lang.Object[] r2 = r6.zzue
            r2 = r2[r0]
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            int r2 = com.google.android.gms.internal.drive.zzjr.zzg(r3, r4)
            goto L74
        L66:
            java.lang.Object[] r2 = r6.zzue
            r2 = r2[r0]
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            int r2 = com.google.android.gms.internal.drive.zzjr.zze(r3, r4)
        L74:
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L8
        L78:
            r6.zzrr = r1
            return r1
    }

    public final int zzfc() {
            r4 = this;
            int r0 = r4.zzrr
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            r0 = 0
            r1 = 0
        L8:
            int r2 = r4.count
            if (r0 >= r2) goto L20
            int[] r2 = r4.zzvs
            r2 = r2[r0]
            int r2 = r2 >>> 3
            java.lang.Object[] r3 = r4.zzue
            r3 = r3[r0]
            com.google.android.gms.internal.drive.zzjc r3 = (com.google.android.gms.internal.drive.zzjc) r3
            int r2 = com.google.android.gms.internal.drive.zzjr.zzd(r2, r3)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L8
        L20:
            r4.zzrr = r1
            return r1
    }
}
