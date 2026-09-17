package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzhr extends com.google.android.gms.internal.ads.zzcc {
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzwq zzc;

    public zzhr(boolean r1, com.google.android.gms.internal.ads.zzwq r2) {
            r0 = this;
            r0.<init>()
            r0.zzc = r2
            int r1 = r2.zzc()
            r0.zzb = r1
            return
    }

    private final int zzw(int r2, boolean r3) {
            r1 = this;
            r0 = -1
            if (r3 == 0) goto La
            com.google.android.gms.internal.ads.zzwq r3 = r1.zzc
            int r0 = r3.zzd(r2)
            goto Lf
        La:
            int r3 = r1.zzb
            int r3 = r3 + r0
            if (r2 < r3) goto L10
        Lf:
            return r0
        L10:
            int r2 = r2 + 1
            return r2
    }

    private final int zzx(int r2, boolean r3) {
            r1 = this;
            r0 = -1
            if (r3 == 0) goto La
            com.google.android.gms.internal.ads.zzwq r3 = r1.zzc
            int r0 = r3.zze(r2)
            goto Lc
        La:
            if (r2 > 0) goto Ld
        Lc:
            return r0
        Ld:
            int r2 = r2 + r0
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zza(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.util.Pair
            r1 = -1
            if (r0 != 0) goto L6
            goto L22
        L6:
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r0 = r4.first
            java.lang.Object r4 = r4.second
            int r0 = r3.zzp(r0)
            if (r0 == r1) goto L22
            com.google.android.gms.internal.ads.zzcc r2 = r3.zzu(r0)
            int r4 = r2.zza(r4)
            if (r4 == r1) goto L22
            int r0 = r3.zzs(r0)
            int r0 = r0 + r4
            return r0
        L22:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final com.google.android.gms.internal.ads.zzca zzd(int r5, com.google.android.gms.internal.ads.zzca r6, boolean r7) {
            r4 = this;
            int r0 = r4.zzq(r5)
            int r1 = r4.zzt(r0)
            int r2 = r4.zzs(r0)
            com.google.android.gms.internal.ads.zzcc r3 = r4.zzu(r0)
            int r5 = r5 - r2
            r3.zzd(r5, r6, r7)
            int r5 = r6.zzc
            int r5 = r5 + r1
            r6.zzc = r5
            if (r7 == 0) goto L2a
            java.lang.Object r5 = r4.zzv(r0)
            java.lang.Object r7 = r6.zzb
            java.util.Objects.requireNonNull(r7)
            android.util.Pair r5 = android.util.Pair.create(r5, r7)
            r6.zzb = r5
        L2a:
            return r6
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final com.google.android.gms.internal.ads.zzcb zze(int r5, com.google.android.gms.internal.ads.zzcb r6, long r7) {
            r4 = this;
            int r0 = r4.zzr(r5)
            int r1 = r4.zzt(r0)
            int r2 = r4.zzs(r0)
            com.google.android.gms.internal.ads.zzcc r3 = r4.zzu(r0)
            int r5 = r5 - r1
            r3.zze(r5, r6, r7)
            java.lang.Object r5 = r4.zzv(r0)
            java.lang.Object r7 = com.google.android.gms.internal.ads.zzcb.zza
            java.lang.Object r8 = r6.zzb
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L28
            java.lang.Object r7 = r6.zzb
            android.util.Pair r5 = android.util.Pair.create(r5, r7)
        L28:
            r6.zzb = r5
            int r5 = r6.zzn
            int r5 = r5 + r2
            r6.zzn = r5
            int r5 = r6.zzo
            int r5 = r5 + r2
            r6.zzo = r5
            return r6
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final java.lang.Object zzf(int r4) {
            r3 = this;
            int r0 = r3.zzq(r4)
            int r1 = r3.zzs(r0)
            com.google.android.gms.internal.ads.zzcc r2 = r3.zzu(r0)
            int r4 = r4 - r1
            java.lang.Object r4 = r2.zzf(r4)
            java.lang.Object r0 = r3.zzv(r0)
            android.util.Pair r4 = android.util.Pair.create(r0, r4)
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzg(boolean r4) {
            r3 = this;
            int r0 = r3.zzb
            r1 = -1
            if (r0 != 0) goto L6
            goto L20
        L6:
            if (r4 == 0) goto Lf
            com.google.android.gms.internal.ads.zzwq r0 = r3.zzc
            int r0 = r0.zza()
            goto L10
        Lf:
            r0 = 0
        L10:
            com.google.android.gms.internal.ads.zzcc r2 = r3.zzu(r0)
            boolean r2 = r2.zzo()
            if (r2 == 0) goto L21
            int r0 = r3.zzw(r0, r4)
            if (r0 != r1) goto L10
        L20:
            return r1
        L21:
            int r1 = r3.zzt(r0)
            com.google.android.gms.internal.ads.zzcc r0 = r3.zzu(r0)
            int r4 = r0.zzg(r4)
            int r1 = r1 + r4
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzh(boolean r4) {
            r3 = this;
            int r0 = r3.zzb
            r1 = -1
            if (r0 != 0) goto L6
            goto L20
        L6:
            if (r4 == 0) goto Lf
            com.google.android.gms.internal.ads.zzwq r0 = r3.zzc
            int r0 = r0.zzb()
            goto L10
        Lf:
            int r0 = r0 + r1
        L10:
            com.google.android.gms.internal.ads.zzcc r2 = r3.zzu(r0)
            boolean r2 = r2.zzo()
            if (r2 == 0) goto L21
            int r0 = r3.zzx(r0, r4)
            if (r0 != r1) goto L10
        L20:
            return r1
        L21:
            int r1 = r3.zzt(r0)
            com.google.android.gms.internal.ads.zzcc r0 = r3.zzu(r0)
            int r4 = r0.zzh(r4)
            int r1 = r1 + r4
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzj(int r6, int r7, boolean r8) {
            r5 = this;
            int r0 = r5.zzr(r6)
            int r1 = r5.zzt(r0)
            com.google.android.gms.internal.ads.zzcc r2 = r5.zzu(r0)
            int r6 = r6 - r1
            r3 = 2
            if (r7 != r3) goto L12
            r4 = 0
            goto L13
        L12:
            r4 = r7
        L13:
            int r6 = r2.zzj(r6, r4, r8)
            r2 = -1
            if (r6 == r2) goto L1c
            int r1 = r1 + r6
            return r1
        L1c:
            int r6 = r5.zzw(r0, r8)
        L20:
            if (r6 == r2) goto L31
            com.google.android.gms.internal.ads.zzcc r0 = r5.zzu(r6)
            boolean r0 = r0.zzo()
            if (r0 == 0) goto L31
            int r6 = r5.zzw(r6, r8)
            goto L20
        L31:
            if (r6 == r2) goto L41
            int r7 = r5.zzt(r6)
            com.google.android.gms.internal.ads.zzcc r6 = r5.zzu(r6)
            int r6 = r6.zzg(r8)
            int r7 = r7 + r6
            return r7
        L41:
            if (r7 != r3) goto L48
            int r6 = r5.zzg(r8)
            return r6
        L48:
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzk(int r3, int r4, boolean r5) {
            r2 = this;
            int r4 = r2.zzr(r3)
            int r5 = r2.zzt(r4)
            com.google.android.gms.internal.ads.zzcc r0 = r2.zzu(r4)
            int r3 = r3 - r5
            r1 = 0
            int r3 = r0.zzk(r3, r1, r1)
            r0 = -1
            if (r3 == r0) goto L17
            int r5 = r5 + r3
            return r5
        L17:
            int r3 = r2.zzx(r4, r1)
        L1b:
            if (r3 == r0) goto L2c
            com.google.android.gms.internal.ads.zzcc r4 = r2.zzu(r3)
            boolean r4 = r4.zzo()
            if (r4 == 0) goto L2c
            int r3 = r2.zzx(r3, r1)
            goto L1b
        L2c:
            if (r3 == r0) goto L3c
            int r4 = r2.zzt(r3)
            com.google.android.gms.internal.ads.zzcc r3 = r2.zzu(r3)
            int r3 = r3.zzh(r1)
            int r4 = r4 + r3
            return r4
        L3c:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final com.google.android.gms.internal.ads.zzca zzn(java.lang.Object r4, com.google.android.gms.internal.ads.zzca r5) {
            r3 = this;
            r0 = r4
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            int r1 = r3.zzp(r1)
            int r2 = r3.zzt(r1)
            com.google.android.gms.internal.ads.zzcc r1 = r3.zzu(r1)
            r1.zzn(r0, r5)
            int r0 = r5.zzc
            int r0 = r0 + r2
            r5.zzc = r0
            r5.zzb = r4
            return r5
    }

    protected abstract int zzp(java.lang.Object r1);

    protected abstract int zzq(int r1);

    protected abstract int zzr(int r1);

    protected abstract int zzs(int r1);

    protected abstract int zzt(int r1);

    protected abstract com.google.android.gms.internal.ads.zzcc zzu(int r1);

    protected abstract java.lang.Object zzv(int r1);
}
