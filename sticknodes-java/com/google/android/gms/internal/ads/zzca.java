package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzca {
    public java.lang.Object zza;
    public java.lang.Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public com.google.android.gms.internal.ads.zzb zzg;

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
            return
    }

    public zzca() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzb r0 = com.google.android.gms.internal.ads.zzb.zza
            r1.zzg = r0
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L49
            java.lang.Class<com.google.android.gms.internal.ads.zzca> r2 = com.google.android.gms.internal.ads.zzca.class
            java.lang.Class r3 = r8.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L14
            goto L49
        L14:
            com.google.android.gms.internal.ads.zzca r8 = (com.google.android.gms.internal.ads.zzca) r8
            java.lang.Object r2 = r7.zza
            java.lang.Object r3 = r8.zza
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L49
            java.lang.Object r2 = r7.zzb
            java.lang.Object r3 = r8.zzb
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L49
            int r2 = r7.zzc
            int r3 = r8.zzc
            if (r2 != r3) goto L49
            long r2 = r7.zzd
            long r4 = r8.zzd
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L49
            boolean r2 = r7.zzf
            boolean r3 = r8.zzf
            if (r2 != r3) goto L49
            com.google.android.gms.internal.ads.zzb r2 = r7.zzg
            com.google.android.gms.internal.ads.zzb r8 = r8.zzg
            boolean r8 = java.util.Objects.equals(r2, r8)
            if (r8 == 0) goto L49
            return r0
        L49:
            return r1
    }

    public final int hashCode() {
            r5 = this;
            java.lang.Object r0 = r5.zza
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            java.lang.Object r2 = r5.zzb
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r1 = r2.hashCode()
        L14:
            int r0 = r0 + 217
            int r0 = r0 * 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r5.zzc
            int r0 = r0 + r1
            long r1 = r5.zzd
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r0 = r0 * 31
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 961
            boolean r1 = r5.zzf
            int r0 = r0 + r1
            com.google.android.gms.internal.ads.zzb r1 = r5.zzg
            int r0 = r0 * 31
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final int zza(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzb r0 = r1.zzg
            com.google.android.gms.internal.ads.zza r2 = r0.zza(r2)
            int r2 = r2.zzb
            return r2
    }

    public final int zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzb r0 = r1.zzg
            int r0 = r0.zzb
            r0 = 0
            return r0
    }

    public final int zzc(long r1) {
            r0 = this;
            r1 = -1
            return r1
    }

    public final int zzd(long r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzb r1 = r0.zzg
            r2 = -1
            r1.zzb(r2)
            return r2
    }

    public final int zze(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzb r0 = r1.zzg
            com.google.android.gms.internal.ads.zza r2 = r0.zza(r2)
            r0 = -1
            int r2 = r2.zza(r0)
            return r2
    }

    public final long zzf(int r3, int r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzb r0 = r2.zzg
            com.google.android.gms.internal.ads.zza r3 = r0.zza(r3)
            int r0 = r3.zzb
            r1 = -1
            if (r0 == r1) goto L10
            long[] r3 = r3.zzf
            r0 = r3[r4]
            return r0
        L10:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r3
    }

    public final long zzg(int r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzb r0 = r2.zzg
            com.google.android.gms.internal.ads.zza r3 = r0.zza(r3)
            long r0 = r3.zza
            r0 = 0
            return r0
    }

    public final long zzh() {
            r2 = this;
            com.google.android.gms.internal.ads.zzb r0 = r2.zzg
            long r0 = r0.zzc
            r0 = 0
            return r0
    }

    public final com.google.android.gms.internal.ads.zzca zzi(java.lang.Object r1, java.lang.Object r2, int r3, long r4, long r6, com.google.android.gms.internal.ads.zzb r8, boolean r9) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r1 = 0
            r0.zze = r1
            r0.zzg = r8
            r0.zzf = r9
            return r0
    }

    public final boolean zzj(int r2) {
            r1 = this;
            r1.zzb()
            r0 = -1
            if (r2 != r0) goto Lb
            com.google.android.gms.internal.ads.zzb r2 = r1.zzg
            r2.zzb(r0)
        Lb:
            r2 = 0
            return r2
    }

    public final boolean zzk(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzb r0 = r1.zzg
            com.google.android.gms.internal.ads.zza r2 = r0.zza(r2)
            boolean r2 = r2.zzh
            r2 = 0
            return r2
    }
}
