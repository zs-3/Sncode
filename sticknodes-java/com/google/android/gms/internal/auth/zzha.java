package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzha {
    private static final com.google.android.gms.internal.auth.zzha zza = null;
    private int zzb;
    private int[] zzc;
    private java.lang.Object[] zzd;
    private boolean zze;

    static {
            com.google.android.gms.internal.auth.zzha r0 = new com.google.android.gms.internal.auth.zzha
            r1 = 0
            int[] r2 = new int[r1]
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.<init>(r1, r2, r3, r1)
            com.google.android.gms.internal.auth.zzha.zza = r0
            return
    }

    private zzha() {
            r4 = this;
            r0 = 8
            int[] r1 = new int[r0]
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r3 = 1
            r4.<init>(r2, r1, r0, r3)
            return
    }

    private zzha(int r1, int[] r2, java.lang.Object[] r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            return
    }

    public static com.google.android.gms.internal.auth.zzha zza() {
            com.google.android.gms.internal.auth.zzha r0 = com.google.android.gms.internal.auth.zzha.zza
            return r0
    }

    static com.google.android.gms.internal.auth.zzha zzc(com.google.android.gms.internal.auth.zzha r6, com.google.android.gms.internal.auth.zzha r7) {
            int r0 = r6.zzb
            int r1 = r7.zzb
            int r0 = r0 + r1
            int[] r1 = r6.zzc
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            int[] r2 = r7.zzc
            int r3 = r6.zzb
            int r4 = r7.zzb
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r1, r3, r4)
            java.lang.Object[] r2 = r6.zzd
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.Object[] r3 = r7.zzd
            int r6 = r6.zzb
            int r7 = r7.zzb
            java.lang.System.arraycopy(r3, r5, r2, r6, r7)
            com.google.android.gms.internal.auth.zzha r6 = new com.google.android.gms.internal.auth.zzha
            r7 = 1
            r6.<init>(r0, r1, r2, r7)
            return r6
    }

    static com.google.android.gms.internal.auth.zzha zzd() {
            com.google.android.gms.internal.auth.zzha r0 = new com.google.android.gms.internal.auth.zzha
            r1 = 8
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r4 = 1
            r0.<init>(r3, r2, r1, r4)
            return r0
    }

    private final void zzi(int r4) {
            r3 = this;
            int[] r0 = r3.zzc
            int r1 = r0.length
            if (r4 <= r1) goto L21
            int r1 = r3.zzb
            int r2 = r1 / 2
            int r1 = r1 + r2
            if (r1 < r4) goto Ld
            r4 = r1
        Ld:
            r1 = 8
            if (r4 >= r1) goto L13
            r4 = 8
        L13:
            int[] r0 = java.util.Arrays.copyOf(r0, r4)
            r3.zzc = r0
            java.lang.Object[] r0 = r3.zzd
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
            r3.zzd = r4
        L21:
            return
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
            boolean r2 = r9 instanceof com.google.android.gms.internal.auth.zzha
            if (r2 != 0) goto Ld
            return r1
        Ld:
            com.google.android.gms.internal.auth.zzha r9 = (com.google.android.gms.internal.auth.zzha) r9
            int r2 = r8.zzb
            int r3 = r9.zzb
            if (r2 != r3) goto L3d
            int[] r3 = r8.zzc
            int[] r4 = r9.zzc
            r5 = 0
        L1a:
            if (r5 >= r2) goto L26
            r6 = r3[r5]
            r7 = r4[r5]
            if (r6 == r7) goto L23
            goto L3d
        L23:
            int r5 = r5 + 1
            goto L1a
        L26:
            java.lang.Object[] r2 = r8.zzd
            java.lang.Object[] r9 = r9.zzd
            int r3 = r8.zzb
            r4 = 0
        L2d:
            if (r4 >= r3) goto L3c
            r5 = r2[r4]
            r6 = r9[r4]
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L3d
            int r4 = r4 + 1
            goto L2d
        L3c:
            return r0
        L3d:
            return r1
    }

    public final int hashCode() {
            r8 = this;
            int r0 = r8.zzb
            int r1 = r0 + 527
            int[] r2 = r8.zzc
            r3 = 17
            r4 = 0
            r5 = 0
            r6 = 17
        Lc:
            if (r5 >= r0) goto L16
            int r6 = r6 * 31
            r7 = r2[r5]
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto Lc
        L16:
            int r1 = r1 * 31
            int r1 = r1 + r6
            java.lang.Object[] r0 = r8.zzd
            int r2 = r8.zzb
        L1d:
            if (r4 >= r2) goto L2b
            int r3 = r3 * 31
            r5 = r0[r4]
            int r5 = r5.hashCode()
            int r3 = r3 + r5
            int r4 = r4 + 1
            goto L1d
        L2b:
            int r1 = r1 * 31
            int r1 = r1 + r3
            return r1
    }

    final com.google.android.gms.internal.auth.zzha zzb(com.google.android.gms.internal.auth.zzha r7) {
            r6 = this;
            com.google.android.gms.internal.auth.zzha r0 = com.google.android.gms.internal.auth.zzha.zza
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L9
            return r6
        L9:
            r6.zze()
            int r0 = r6.zzb
            int r1 = r7.zzb
            int r0 = r0 + r1
            r6.zzi(r0)
            int[] r1 = r7.zzc
            int[] r2 = r6.zzc
            int r3 = r6.zzb
            int r4 = r7.zzb
            r5 = 0
            java.lang.System.arraycopy(r1, r5, r2, r3, r4)
            java.lang.Object[] r1 = r7.zzd
            java.lang.Object[] r2 = r6.zzd
            int r3 = r6.zzb
            int r7 = r7.zzb
            java.lang.System.arraycopy(r1, r5, r2, r3, r7)
            r6.zzb = r0
            return r6
    }

    final void zze() {
            r1 = this;
            boolean r0 = r1.zze
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public final void zzf() {
            r1 = this;
            boolean r0 = r1.zze
            if (r0 == 0) goto L7
            r0 = 0
            r1.zze = r0
        L7:
            return
    }

    final void zzg(java.lang.StringBuilder r4, int r5) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.zzb
            if (r0 >= r1) goto L19
            int[] r1 = r3.zzc
            r1 = r1[r0]
            int r1 = r1 >>> 3
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Object[] r2 = r3.zzd
            r2 = r2[r0]
            com.google.android.gms.internal.auth.zzfz.zzb(r4, r5, r1, r2)
            int r0 = r0 + 1
            goto L1
        L19:
            return
    }

    final void zzh(int r3, java.lang.Object r4) {
            r2 = this;
            r2.zze()
            int r0 = r2.zzb
            int r0 = r0 + 1
            r2.zzi(r0)
            int[] r0 = r2.zzc
            int r1 = r2.zzb
            r0[r1] = r3
            java.lang.Object[] r3 = r2.zzd
            r3[r1] = r4
            int r1 = r1 + 1
            r2.zzb = r1
            return
    }
}
