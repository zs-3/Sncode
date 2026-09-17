package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zza {
    public static final /* synthetic */ int zzi = 0;
    public final long zza;
    public final int zzb;

    @java.lang.Deprecated
    public final android.net.Uri[] zzc;
    public final com.google.android.gms.internal.ads.zzbc[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final long zzg;
    public final boolean zzh;

    static {
            r0 = 0
            r1 = 36
            java.lang.Integer.toString(r0, r1)
            r0 = 1
            java.lang.Integer.toString(r0, r1)
            r0 = 2
            java.lang.Integer.toString(r0, r1)
            r0 = 3
            java.lang.Integer.toString(r0, r1)
            r0 = 4
            java.lang.Integer.toString(r0, r1)
            r0 = 5
            java.lang.Integer.toString(r0, r1)
            r0 = 6
            java.lang.Integer.toString(r0, r1)
            r0 = 7
            java.lang.Integer.toString(r0, r1)
            r0 = 8
            java.lang.Integer.toString(r0, r1)
            return
    }

    public zza(long r12) {
            r11 = this;
            r12 = 0
            int[] r5 = new int[r12]
            com.google.android.gms.internal.ads.zzbc[] r6 = new com.google.android.gms.internal.ads.zzbc[r12]
            long[] r7 = new long[r12]
            r1 = 0
            r3 = -1
            r4 = -1
            r8 = 0
            r10 = 0
            r0 = r11
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r10)
            return
    }

    private zza(long r1, int r3, int r4, int[] r5, com.google.android.gms.internal.ads.zzbc[] r6, long[] r7, long r8, boolean r10) {
            r0 = this;
            r0.<init>()
            int r1 = r5.length
            int r2 = r6.length
            r4 = 0
            if (r1 != r2) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            com.google.android.gms.internal.ads.zzdi.zzd(r1)
            r8 = 0
            r0.zza = r8
            r0.zzb = r3
            r0.zze = r5
            r0.zzd = r6
            r0.zzf = r7
            r0.zzg = r8
            r0.zzh = r4
            android.net.Uri[] r1 = new android.net.Uri[r2]
            r0.zzc = r1
        L22:
            android.net.Uri[] r1 = r0.zzc
            int r2 = r1.length
            if (r4 >= r2) goto L39
            r2 = r6[r4]
            if (r2 != 0) goto L2d
            r2 = 0
            goto L34
        L2d:
            com.google.android.gms.internal.ads.zzax r2 = r2.zzb
            java.util.Objects.requireNonNull(r2)
            android.net.Uri r2 = r2.zza
        L34:
            r1[r4] = r2
            int r4 = r4 + 1
            goto L22
        L39:
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
            java.lang.Class<com.google.android.gms.internal.ads.zza> r2 = com.google.android.gms.internal.ads.zza.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L37
        L10:
            com.google.android.gms.internal.ads.zza r5 = (com.google.android.gms.internal.ads.zza) r5
            int r2 = r4.zzb
            int r3 = r5.zzb
            if (r2 != r3) goto L37
            com.google.android.gms.internal.ads.zzbc[] r2 = r4.zzd
            com.google.android.gms.internal.ads.zzbc[] r3 = r5.zzd
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L37
            int[] r2 = r4.zze
            int[] r3 = r5.zze
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L37
            long[] r2 = r4.zzf
            long[] r5 = r5.zzf
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L37
            return r0
        L37:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zzb
            int r0 = r0 * 31
            int r0 = r0 + (-1)
            com.google.android.gms.internal.ads.zzbc[] r1 = r2.zzd
            int r0 = r0 * 961
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            int[] r1 = r2.zze
            int r0 = r0 * 31
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            long[] r1 = r2.zzf
            int r0 = r0 * 31
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            int r0 = r0 * 961
            return r0
    }

    public final int zza(int r4) {
            r3 = this;
            r0 = 1
            int r4 = r4 + r0
        L2:
            int[] r1 = r3.zze
            int r2 = r1.length
            if (r4 >= r2) goto L11
            r1 = r1[r4]
            if (r1 == 0) goto L11
            if (r1 != r0) goto Le
            goto L11
        Le:
            int r4 = r4 + 1
            goto L2
        L11:
            return r4
    }

    public final com.google.android.gms.internal.ads.zza zzb(int r15) {
            r14 = this;
            int[] r15 = r14.zze
            int r0 = r15.length
            r1 = 0
            int r2 = java.lang.Math.max(r1, r0)
            int[] r8 = java.util.Arrays.copyOf(r15, r2)
            java.util.Arrays.fill(r8, r0, r2, r1)
            long[] r15 = r14.zzf
            int r0 = r15.length
            int r2 = java.lang.Math.max(r1, r0)
            long[] r10 = java.util.Arrays.copyOf(r15, r2)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.Arrays.fill(r10, r0, r2, r3)
            com.google.android.gms.internal.ads.zzbc[] r15 = r14.zzd
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r1)
            r9 = r15
            com.google.android.gms.internal.ads.zzbc[] r9 = (com.google.android.gms.internal.ads.zzbc[]) r9
            com.google.android.gms.internal.ads.zza r15 = new com.google.android.gms.internal.ads.zza
            r4 = 0
            r6 = 0
            r7 = -1
            r11 = 0
            r13 = 0
            r3 = r15
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r13)
            return r15
    }
}
