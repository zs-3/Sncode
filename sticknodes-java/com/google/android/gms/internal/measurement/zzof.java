package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzof {
    private static final com.google.android.gms.internal.measurement.zzof zza = null;
    private int zzb;
    private int[] zzc;
    private java.lang.Object[] zzd;
    private int zze;
    private boolean zzf;

    static {
            com.google.android.gms.internal.measurement.zzof r0 = new com.google.android.gms.internal.measurement.zzof
            r1 = 0
            int[] r2 = new int[r1]
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.<init>(r1, r2, r3, r1)
            com.google.android.gms.internal.measurement.zzof.zza = r0
            return
    }

    private zzof() {
            r4 = this;
            r0 = 8
            int[] r1 = new int[r0]
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r3 = 1
            r4.<init>(r2, r1, r0, r3)
            return
    }

    private zzof(int r2, int[] r3, java.lang.Object[] r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.zze = r0
            r1.zzb = r2
            r1.zzc = r3
            r1.zzd = r4
            r1.zzf = r5
            return
    }

    public static com.google.android.gms.internal.measurement.zzof zzc() {
            com.google.android.gms.internal.measurement.zzof r0 = com.google.android.gms.internal.measurement.zzof.zza
            return r0
    }

    static com.google.android.gms.internal.measurement.zzof zze(com.google.android.gms.internal.measurement.zzof r6, com.google.android.gms.internal.measurement.zzof r7) {
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
            com.google.android.gms.internal.measurement.zzof r6 = new com.google.android.gms.internal.measurement.zzof
            r7 = 1
            r6.<init>(r0, r1, r2, r7)
            return r6
    }

    static com.google.android.gms.internal.measurement.zzof zzf() {
            com.google.android.gms.internal.measurement.zzof r0 = new com.google.android.gms.internal.measurement.zzof
            r1 = 8
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r4 = 1
            r0.<init>(r3, r2, r1, r4)
            return r0
    }

    private final void zzm(int r4) {
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
            boolean r2 = r9 instanceof com.google.android.gms.internal.measurement.zzof
            if (r2 != 0) goto Ld
            return r1
        Ld:
            com.google.android.gms.internal.measurement.zzof r9 = (com.google.android.gms.internal.measurement.zzof) r9
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
            int r1 = r1 * 31
            java.lang.Object[] r0 = r8.zzd
            int r2 = r8.zzb
        L1f:
            if (r4 >= r2) goto L2d
            int r3 = r3 * 31
            r5 = r0[r4]
            int r5 = r5.hashCode()
            int r3 = r3 + r5
            int r4 = r4 + 1
            goto L1f
        L2d:
            int r1 = r1 + r3
            return r1
    }

    public final int zza() {
            r5 = this;
            int r0 = r5.zze
            r1 = -1
            if (r0 != r1) goto L98
            r0 = 0
            r1 = 0
        L7:
            int r2 = r5.zzb
            if (r0 >= r2) goto L95
            int[] r2 = r5.zzc
            r2 = r2[r0]
            int r3 = r2 >>> 3
            r2 = r2 & 7
            if (r2 == 0) goto L7b
            r4 = 1
            if (r2 == r4) goto L69
            r4 = 2
            if (r2 == r4) goto L52
            r4 = 3
            if (r2 == r4) goto L40
            r4 = 5
            if (r2 != r4) goto L33
            int r2 = r3 << 3
            java.lang.Object[] r3 = r5.zzd
            r3 = r3[r0]
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.intValue()
            int r2 = com.google.android.gms.internal.measurement.zzlk.zzz(r2)
            int r2 = r2 + 4
            goto L90
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            com.google.android.gms.internal.measurement.zzml r1 = new com.google.android.gms.internal.measurement.zzml
            java.lang.String r2 = "Protocol message tag had invalid wire type."
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L40:
            int r2 = r3 << 3
            int r2 = com.google.android.gms.internal.measurement.zzlk.zzz(r2)
            int r2 = r2 + r2
            java.lang.Object[] r3 = r5.zzd
            r3 = r3[r0]
            com.google.android.gms.internal.measurement.zzof r3 = (com.google.android.gms.internal.measurement.zzof) r3
            int r3 = r3.zza()
            goto L8f
        L52:
            int r2 = r3 << 3
            java.lang.Object[] r3 = r5.zzd
            r3 = r3[r0]
            com.google.android.gms.internal.measurement.zzld r3 = (com.google.android.gms.internal.measurement.zzld) r3
            int r2 = com.google.android.gms.internal.measurement.zzlk.zzz(r2)
            int r3 = r3.zzd()
            int r4 = com.google.android.gms.internal.measurement.zzlk.zzz(r3)
            int r4 = r4 + r3
            int r2 = r2 + r4
            goto L90
        L69:
            int r2 = r3 << 3
            java.lang.Object[] r3 = r5.zzd
            r3 = r3[r0]
            java.lang.Long r3 = (java.lang.Long) r3
            r3.longValue()
            int r2 = com.google.android.gms.internal.measurement.zzlk.zzz(r2)
            int r2 = r2 + 8
            goto L90
        L7b:
            int r2 = r3 << 3
            java.lang.Object[] r3 = r5.zzd
            r3 = r3[r0]
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r2 = com.google.android.gms.internal.measurement.zzlk.zzz(r2)
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzA(r3)
        L8f:
            int r2 = r2 + r3
        L90:
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L7
        L95:
            r5.zze = r1
            return r1
        L98:
            return r0
    }

    public final int zzb() {
            r7 = this;
            int r0 = r7.zze
            r1 = -1
            if (r0 != r1) goto L42
            r0 = 0
            r1 = 0
        L7:
            int r2 = r7.zzb
            if (r0 >= r2) goto L3f
            int[] r2 = r7.zzc
            r2 = r2[r0]
            int r2 = r2 >>> 3
            java.lang.Object[] r3 = r7.zzd
            r3 = r3[r0]
            com.google.android.gms.internal.measurement.zzld r3 = (com.google.android.gms.internal.measurement.zzld) r3
            r4 = 8
            int r4 = com.google.android.gms.internal.measurement.zzlk.zzz(r4)
            int r4 = r4 + r4
            r5 = 16
            int r5 = com.google.android.gms.internal.measurement.zzlk.zzz(r5)
            int r2 = com.google.android.gms.internal.measurement.zzlk.zzz(r2)
            int r5 = r5 + r2
            r2 = 24
            int r2 = com.google.android.gms.internal.measurement.zzlk.zzz(r2)
            int r3 = r3.zzd()
            int r6 = com.google.android.gms.internal.measurement.zzlk.zzz(r3)
            int r6 = r6 + r3
            int r2 = r2 + r6
            int r4 = r4 + r5
            int r4 = r4 + r2
            int r1 = r1 + r4
            int r0 = r0 + 1
            goto L7
        L3f:
            r7.zze = r1
            return r1
        L42:
            return r0
    }

    final com.google.android.gms.internal.measurement.zzof zzd(com.google.android.gms.internal.measurement.zzof r7) {
            r6 = this;
            com.google.android.gms.internal.measurement.zzof r0 = com.google.android.gms.internal.measurement.zzof.zza
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L9
            return r6
        L9:
            r6.zzg()
            int r0 = r6.zzb
            int r1 = r7.zzb
            int r0 = r0 + r1
            r6.zzm(r0)
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

    final void zzg() {
            r1 = this;
            boolean r0 = r1.zzf
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public final void zzh() {
            r1 = this;
            boolean r0 = r1.zzf
            if (r0 == 0) goto L7
            r0 = 0
            r1.zzf = r0
        L7:
            return
    }

    final void zzi(java.lang.StringBuilder r4, int r5) {
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
            com.google.android.gms.internal.measurement.zznj.zzb(r4, r5, r1, r2)
            int r0 = r0 + 1
            goto L1
        L19:
            return
    }

    final void zzj(int r3, java.lang.Object r4) {
            r2 = this;
            r2.zzg()
            int r0 = r2.zzb
            int r0 = r0 + 1
            r2.zzm(r0)
            int[] r0 = r2.zzc
            int r1 = r2.zzb
            r0[r1] = r3
            java.lang.Object[] r3 = r2.zzd
            r3[r1] = r4
            int r1 = r1 + 1
            r2.zzb = r1
            return
    }

    final void zzk(com.google.android.gms.internal.measurement.zzor r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.zzb
            if (r0 >= r1) goto L15
            int[] r1 = r3.zzc
            r1 = r1[r0]
            int r1 = r1 >>> 3
            java.lang.Object[] r2 = r3.zzd
            r2 = r2[r0]
            r4.zzw(r1, r2)
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    public final void zzl(com.google.android.gms.internal.measurement.zzor r7) throws java.io.IOException {
            r6 = this;
            int r0 = r6.zzb
            if (r0 == 0) goto L61
            r0 = 0
        L5:
            int r1 = r6.zzb
            if (r0 >= r1) goto L61
            int[] r1 = r6.zzc
            r1 = r1[r0]
            java.lang.Object[] r2 = r6.zzd
            r2 = r2[r0]
            r3 = r1 & 7
            r4 = 3
            int r1 = r1 >>> r4
            if (r3 == 0) goto L55
            r5 = 1
            if (r3 == r5) goto L4b
            r5 = 2
            if (r3 == r5) goto L45
            if (r3 == r4) goto L39
            r4 = 5
            if (r3 != r4) goto L2c
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r7.zzk(r1, r2)
            goto L5e
        L2c:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            com.google.android.gms.internal.measurement.zzml r0 = new com.google.android.gms.internal.measurement.zzml
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r0.<init>(r1)
            r7.<init>(r0)
            throw r7
        L39:
            r7.zzF(r1)
            com.google.android.gms.internal.measurement.zzof r2 = (com.google.android.gms.internal.measurement.zzof) r2
            r2.zzl(r7)
            r7.zzh(r1)
            goto L5e
        L45:
            com.google.android.gms.internal.measurement.zzld r2 = (com.google.android.gms.internal.measurement.zzld) r2
            r7.zzd(r1, r2)
            goto L5e
        L4b:
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r7.zzm(r1, r2)
            goto L5e
        L55:
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r7.zzt(r1, r2)
        L5e:
            int r0 = r0 + 1
            goto L5
        L61:
            return
    }
}
