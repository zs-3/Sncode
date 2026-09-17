package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzcc {
    public static final com.google.android.gms.internal.ads.zzcc zza = null;

    static {
            com.google.android.gms.internal.ads.zzbz r0 = new com.google.android.gms.internal.ads.zzbz
            r0.<init>()
            com.google.android.gms.internal.ads.zzcc.zza = r0
            r0 = 0
            r1 = 36
            java.lang.Integer.toString(r0, r1)
            r0 = 1
            java.lang.Integer.toString(r0, r1)
            r0 = 2
            java.lang.Integer.toString(r0, r1)
            return
    }

    protected zzcc() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean equals(java.lang.Object r11) {
            r10 = this;
            r0 = 1
            if (r10 != r11) goto L4
            return r0
        L4:
            boolean r1 = r11 instanceof com.google.android.gms.internal.ads.zzcc
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzcc r11 = (com.google.android.gms.internal.ads.zzcc) r11
            int r1 = r11.zzc()
            int r3 = r10.zzc()
            if (r1 != r3) goto L8f
            int r1 = r11.zzb()
            int r3 = r10.zzb()
            if (r1 == r3) goto L22
            goto L8f
        L22:
            com.google.android.gms.internal.ads.zzcb r1 = new com.google.android.gms.internal.ads.zzcb
            r1.<init>()
            com.google.android.gms.internal.ads.zzca r3 = new com.google.android.gms.internal.ads.zzca
            r3.<init>()
            com.google.android.gms.internal.ads.zzcb r4 = new com.google.android.gms.internal.ads.zzcb
            r4.<init>()
            com.google.android.gms.internal.ads.zzca r5 = new com.google.android.gms.internal.ads.zzca
            r5.<init>()
            r6 = 0
        L37:
            int r7 = r10.zzc()
            if (r6 >= r7) goto L51
            r7 = 0
            com.google.android.gms.internal.ads.zzcb r9 = r10.zze(r6, r1, r7)
            com.google.android.gms.internal.ads.zzcb r7 = r11.zze(r6, r4, r7)
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L4e
            return r2
        L4e:
            int r6 = r6 + 1
            goto L37
        L51:
            r1 = 0
        L52:
            int r4 = r10.zzb()
            if (r1 >= r4) goto L6a
            com.google.android.gms.internal.ads.zzca r4 = r10.zzd(r1, r3, r0)
            com.google.android.gms.internal.ads.zzca r6 = r11.zzd(r1, r5, r0)
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L67
            return r2
        L67:
            int r1 = r1 + 1
            goto L52
        L6a:
            int r1 = r10.zzg(r0)
            int r3 = r11.zzg(r0)
            if (r1 == r3) goto L75
            return r2
        L75:
            int r3 = r10.zzh(r0)
            int r4 = r11.zzh(r0)
            if (r3 != r4) goto L8f
        L7f:
            if (r1 == r3) goto L8e
            int r4 = r10.zzj(r1, r2, r0)
            int r1 = r11.zzj(r1, r2, r0)
            if (r4 != r1) goto L8d
            r1 = r4
            goto L7f
        L8d:
            return r2
        L8e:
            return r0
        L8f:
            return r2
    }

    public final int hashCode() {
            r7 = this;
            com.google.android.gms.internal.ads.zzcb r0 = new com.google.android.gms.internal.ads.zzcb
            r0.<init>()
            com.google.android.gms.internal.ads.zzca r1 = new com.google.android.gms.internal.ads.zzca
            r1.<init>()
            int r2 = r7.zzc()
            int r2 = r2 + 217
            r3 = 0
            r4 = 0
        L12:
            int r5 = r7.zzc()
            int r2 = r2 * 31
            if (r4 >= r5) goto L28
            r5 = 0
            com.google.android.gms.internal.ads.zzcb r5 = r7.zze(r4, r0, r5)
            int r5 = r5.hashCode()
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto L12
        L28:
            int r0 = r7.zzb()
            int r2 = r2 + r0
            r0 = 0
        L2e:
            int r4 = r7.zzb()
            r5 = 1
            if (r0 >= r4) goto L43
            int r2 = r2 * 31
            com.google.android.gms.internal.ads.zzca r4 = r7.zzd(r0, r1, r5)
            int r4 = r4.hashCode()
            int r2 = r2 + r4
            int r0 = r0 + 1
            goto L2e
        L43:
            int r0 = r7.zzg(r5)
        L47:
            r1 = -1
            if (r0 == r1) goto L53
            int r2 = r2 * 31
            int r1 = r7.zzj(r0, r3, r5)
            int r2 = r2 + r0
            r0 = r1
            goto L47
        L53:
            return r2
    }

    public abstract int zza(java.lang.Object r1);

    public abstract int zzb();

    public abstract int zzc();

    public abstract com.google.android.gms.internal.ads.zzca zzd(int r1, com.google.android.gms.internal.ads.zzca r2, boolean r3);

    public abstract com.google.android.gms.internal.ads.zzcb zze(int r1, com.google.android.gms.internal.ads.zzcb r2, long r3);

    public abstract java.lang.Object zzf(int r1);

    public int zzg(boolean r1) {
            r0 = this;
            boolean r1 = r0.zzo()
            if (r1 == 0) goto L8
            r1 = -1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public int zzh(boolean r2) {
            r1 = this;
            boolean r2 = r1.zzo()
            r0 = -1
            if (r2 == 0) goto L8
            return r0
        L8:
            int r2 = r1.zzc()
            int r2 = r2 + r0
            return r2
    }

    public final int zzi(int r4, com.google.android.gms.internal.ads.zzca r5, com.google.android.gms.internal.ads.zzcb r6, int r7, boolean r8) {
            r3 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzca r5 = r3.zzd(r4, r5, r0)
            int r5 = r5.zzc
            r0 = 0
            com.google.android.gms.internal.ads.zzcb r2 = r3.zze(r5, r6, r0)
            int r2 = r2.zzo
            if (r2 != r4) goto L20
            int r4 = r3.zzj(r5, r7, r8)
            r5 = -1
            if (r4 != r5) goto L19
            return r5
        L19:
            com.google.android.gms.internal.ads.zzcb r4 = r3.zze(r4, r6, r0)
            int r4 = r4.zzn
            return r4
        L20:
            int r4 = r4 + 1
            return r4
    }

    public int zzj(int r3, int r4, boolean r5) {
            r2 = this;
            r0 = 1
            if (r4 == 0) goto L1c
            if (r4 == r0) goto L1b
            r1 = 2
            if (r4 != r1) goto L15
            int r4 = r2.zzh(r5)
            if (r3 != r4) goto L13
            int r3 = r2.zzg(r5)
            goto L14
        L13:
            int r3 = r3 + r0
        L14:
            return r3
        L15:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L1b:
            return r3
        L1c:
            int r4 = r2.zzh(r5)
            if (r3 != r4) goto L24
            r3 = -1
            return r3
        L24:
            int r3 = r3 + r0
            return r3
    }

    public int zzk(int r1, int r2, boolean r3) {
            r0 = this;
            r2 = 0
            int r2 = r0.zzg(r2)
            r3 = -1
            if (r1 != r2) goto L9
            return r3
        L9:
            int r1 = r1 + r3
            return r1
    }

    public final android.util.Pair zzl(com.google.android.gms.internal.ads.zzcb r9, com.google.android.gms.internal.ads.zzca r10, int r11, long r12) {
            r8 = this;
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            android.util.Pair r9 = r0.zzm(r1, r2, r3, r4, r6)
            java.util.Objects.requireNonNull(r9)
            return r9
    }

    public final android.util.Pair zzm(com.google.android.gms.internal.ads.zzcb r8, com.google.android.gms.internal.ads.zzca r9, int r10, long r11, long r13) {
            r7 = this;
            int r0 = r7.zzc()
            r1 = 0
            com.google.android.gms.internal.ads.zzdi.zza(r10, r1, r0)
            r7.zze(r10, r8, r13)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = 0
            int r10 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r10 != 0) goto L19
            long r10 = r8.zzl
            r11 = r2
        L19:
            int r10 = r8.zzn
            r7.zzd(r10, r9, r1)
        L1e:
            int r0 = r8.zzo
            if (r10 >= r0) goto L34
            long r4 = r9.zze
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L34
            int r4 = r10 + 1
            com.google.android.gms.internal.ads.zzca r5 = r7.zzd(r4, r9, r1)
            long r5 = r5.zze
            if (r0 < 0) goto L34
            r10 = r4
            goto L1e
        L34:
            r8 = 1
            r7.zzd(r10, r9, r8)
            long r0 = r9.zze
            long r0 = r9.zzd
            int r8 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r8 == 0) goto L47
            r13 = -1
            long r0 = r0 + r13
            long r11 = java.lang.Math.min(r11, r0)
        L47:
            long r10 = java.lang.Math.max(r2, r11)
            java.lang.Object r8 = r9.zzb
            java.util.Objects.requireNonNull(r8)
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            android.util.Pair r8 = android.util.Pair.create(r8, r9)
            return r8
    }

    public com.google.android.gms.internal.ads.zzca zzn(java.lang.Object r2, com.google.android.gms.internal.ads.zzca r3) {
            r1 = this;
            int r2 = r1.zza(r2)
            r0 = 1
            com.google.android.gms.internal.ads.zzca r2 = r1.zzd(r2, r3, r0)
            return r2
    }

    public final boolean zzo() {
            r1 = this;
            int r0 = r1.zzc()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
