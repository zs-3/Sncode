package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzku {
    public final com.google.android.gms.internal.ads.zzuw zza;
    public final java.lang.Object zzb;
    public final com.google.android.gms.internal.ads.zzwn[] zzc;
    public boolean zzd;
    public boolean zze;
    public com.google.android.gms.internal.ads.zzkv zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final com.google.android.gms.internal.ads.zzlu[] zzi;
    private final com.google.android.gms.internal.ads.zzyr zzj;
    private final com.google.android.gms.internal.ads.zzlj zzk;
    private com.google.android.gms.internal.ads.zzku zzl;
    private com.google.android.gms.internal.ads.zzwy zzm;
    private com.google.android.gms.internal.ads.zzys zzn;
    private long zzo;

    public zzku(com.google.android.gms.internal.ads.zzlu[] r8, long r9, com.google.android.gms.internal.ads.zzyr r11, com.google.android.gms.internal.ads.zzza r12, com.google.android.gms.internal.ads.zzlj r13, com.google.android.gms.internal.ads.zzkv r14, com.google.android.gms.internal.ads.zzys r15) {
            r7 = this;
            r7.<init>()
            r7.zzi = r8
            r7.zzo = r9
            r7.zzj = r11
            r7.zzk = r13
            com.google.android.gms.internal.ads.zzuy r8 = r14.zza
            java.lang.Object r9 = r8.zza
            r7.zzb = r9
            r7.zzf = r14
            com.google.android.gms.internal.ads.zzwy r9 = com.google.android.gms.internal.ads.zzwy.zza
            r7.zzm = r9
            r7.zzn = r15
            r9 = 2
            com.google.android.gms.internal.ads.zzwn[] r10 = new com.google.android.gms.internal.ads.zzwn[r9]
            r7.zzc = r10
            boolean[] r9 = new boolean[r9]
            r7.zzh = r9
            long r9 = r14.zzb
            long r5 = r14.zzd
            com.google.android.gms.internal.ads.zzuw r1 = r13.zzp(r8, r12, r9)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L3d
            com.google.android.gms.internal.ads.zzuc r8 = new com.google.android.gms.internal.ads.zzuc
            r2 = 1
            r3 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r5)
            r1 = r8
        L3d:
            r7.zza = r1
            return
    }

    private final void zzs() {
            r3 = this;
            boolean r0 = r3.zzu()
            if (r0 == 0) goto L19
            r0 = 0
        L7:
            com.google.android.gms.internal.ads.zzys r1 = r3.zzn
            int r2 = r1.zza
            if (r0 >= r2) goto L19
            r1.zzb(r0)
            com.google.android.gms.internal.ads.zzys r1 = r3.zzn
            com.google.android.gms.internal.ads.zzyl[] r1 = r1.zzc
            r1 = r1[r0]
            int r0 = r0 + 1
            goto L7
        L19:
            return
    }

    private final void zzt() {
            r3 = this;
            boolean r0 = r3.zzu()
            if (r0 == 0) goto L19
            r0 = 0
        L7:
            com.google.android.gms.internal.ads.zzys r1 = r3.zzn
            int r2 = r1.zza
            if (r0 >= r2) goto L19
            r1.zzb(r0)
            com.google.android.gms.internal.ads.zzys r1 = r3.zzn
            com.google.android.gms.internal.ads.zzyl[] r1 = r1.zzc
            r1 = r1[r0]
            int r0 = r0 + 1
            goto L7
        L19:
            return
    }

    private final boolean zzu() {
            r1 = this;
            com.google.android.gms.internal.ads.zzku r0 = r1.zzl
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final long zza(com.google.android.gms.internal.ads.zzys r7, long r8, boolean r10) {
            r6 = this;
            r10 = 2
            boolean[] r5 = new boolean[r10]
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            long r7 = r0.zzb(r1, r2, r4, r5)
            return r7
    }

    public final long zzb(com.google.android.gms.internal.ads.zzys r15, long r16, boolean r18, boolean[] r19) {
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = 0
            r3 = 0
        L4:
            int r4 = r1.zza
            r5 = 1
            if (r3 >= r4) goto L1c
            boolean[] r4 = r0.zzh
            if (r18 != 0) goto L16
            com.google.android.gms.internal.ads.zzys r6 = r0.zzn
            boolean r6 = r15.zza(r6, r3)
            if (r6 == 0) goto L16
            goto L17
        L16:
            r5 = 0
        L17:
            r4[r3] = r5
            int r3 = r3 + 1
            goto L4
        L1c:
            r3 = 0
        L1d:
            com.google.android.gms.internal.ads.zzlu[] r4 = r0.zzi
            r6 = 2
            if (r3 >= r6) goto L2a
            r4 = r4[r3]
            r4.zzb()
            int r3 = r3 + 1
            goto L1d
        L2a:
            r14.zzs()
            r0.zzn = r1
            r14.zzt()
            com.google.android.gms.internal.ads.zzuw r7 = r0.zza
            com.google.android.gms.internal.ads.zzyl[] r8 = r1.zzc
            boolean[] r9 = r0.zzh
            com.google.android.gms.internal.ads.zzwn[] r10 = r0.zzc
            r11 = r19
            r12 = r16
            long r3 = r7.zzg(r8, r9, r10, r11, r12)
            r7 = 0
        L43:
            com.google.android.gms.internal.ads.zzlu[] r8 = r0.zzi
            if (r7 >= r6) goto L4f
            r8 = r8[r7]
            r8.zzb()
            int r7 = r7 + 1
            goto L43
        L4f:
            r0.zze = r2
            r7 = 0
        L52:
            com.google.android.gms.internal.ads.zzwn[] r8 = r0.zzc
            if (r7 >= r6) goto L7a
            r8 = r8[r7]
            if (r8 == 0) goto L6b
            boolean r8 = r15.zzb(r7)
            com.google.android.gms.internal.ads.zzdi.zzf(r8)
            com.google.android.gms.internal.ads.zzlu[] r8 = r0.zzi
            r8 = r8[r7]
            r8.zzb()
            r0.zze = r5
            goto L77
        L6b:
            com.google.android.gms.internal.ads.zzyl[] r8 = r1.zzc
            r8 = r8[r7]
            if (r8 != 0) goto L73
            r8 = 1
            goto L74
        L73:
            r8 = 0
        L74:
            com.google.android.gms.internal.ads.zzdi.zzf(r8)
        L77:
            int r7 = r7 + 1
            goto L52
        L7a:
            return r3
    }

    public final long zzc() {
            r5 = this;
            boolean r0 = r5.zzd
            if (r0 != 0) goto L9
            com.google.android.gms.internal.ads.zzkv r0 = r5.zzf
            long r0 = r0.zzb
            return r0
        L9:
            boolean r0 = r5.zze
            r1 = -9223372036854775808
            if (r0 == 0) goto L16
            com.google.android.gms.internal.ads.zzuw r0 = r5.zza
            long r3 = r0.zzb()
            goto L17
        L16:
            r3 = r1
        L17:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            com.google.android.gms.internal.ads.zzkv r0 = r5.zzf
            long r0 = r0.zze
            return r0
        L20:
            return r3
    }

    public final long zzd() {
            r2 = this;
            boolean r0 = r2.zzd
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            com.google.android.gms.internal.ads.zzuw r0 = r2.zza
            long r0 = r0.zzc()
            return r0
    }

    public final long zze() {
            r2 = this;
            long r0 = r2.zzo
            return r0
    }

    public final long zzf() {
            r4 = this;
            com.google.android.gms.internal.ads.zzkv r0 = r4.zzf
            long r0 = r0.zzb
            long r2 = r4.zzo
            long r0 = r0 + r2
            return r0
    }

    public final com.google.android.gms.internal.ads.zzku zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzku r0 = r1.zzl
            return r0
    }

    public final com.google.android.gms.internal.ads.zzwy zzh() {
            r1 = this;
            com.google.android.gms.internal.ads.zzwy r0 = r1.zzm
            return r0
    }

    public final com.google.android.gms.internal.ads.zzys zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzys r0 = r1.zzn
            return r0
    }

    public final com.google.android.gms.internal.ads.zzys zzj(float r4, com.google.android.gms.internal.ads.zzcc r5) throws com.google.android.gms.internal.ads.zzij {
            r3 = this;
            com.google.android.gms.internal.ads.zzwy r4 = r3.zzm
            com.google.android.gms.internal.ads.zzkv r0 = r3.zzf
            com.google.android.gms.internal.ads.zzuy r0 = r0.zza
            com.google.android.gms.internal.ads.zzyr r1 = r3.zzj
            com.google.android.gms.internal.ads.zzlu[] r2 = r3.zzi
            com.google.android.gms.internal.ads.zzys r4 = r1.zzo(r2, r4, r0, r5)
            r5 = 0
            r0 = 0
        L10:
            int r1 = r4.zza
            if (r0 >= r1) goto L3b
            boolean r1 = r4.zzb(r0)
            r2 = 1
            if (r1 == 0) goto L2d
            com.google.android.gms.internal.ads.zzyl[] r1 = r4.zzc
            r1 = r1[r0]
            if (r1 != 0) goto L29
            com.google.android.gms.internal.ads.zzlu[] r1 = r3.zzi
            r1 = r1[r0]
            r1.zzb()
            r2 = 0
        L29:
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            goto L38
        L2d:
            com.google.android.gms.internal.ads.zzyl[] r1 = r4.zzc
            r1 = r1[r0]
            if (r1 != 0) goto L34
            goto L35
        L34:
            r2 = 0
        L35:
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
        L38:
            int r0 = r0 + 1
            goto L10
        L3b:
            com.google.android.gms.internal.ads.zzyl[] r0 = r4.zzc
            int r1 = r0.length
        L3e:
            if (r5 >= r1) goto L45
            r2 = r0[r5]
            int r5 = r5 + 1
            goto L3e
        L45:
            return r4
    }

    public final void zzk(long r3, float r5, long r6) {
            r2 = this;
            boolean r0 = r2.zzu()
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            long r0 = r2.zzo
            long r3 = r3 - r0
            com.google.android.gms.internal.ads.zzkq r0 = new com.google.android.gms.internal.ads.zzkq
            r0.<init>()
            r0.zze(r3)
            r0.zzf(r5)
            r0.zzd(r6)
            com.google.android.gms.internal.ads.zzks r3 = new com.google.android.gms.internal.ads.zzks
            r4 = 0
            r3.<init>(r0, r4)
            com.google.android.gms.internal.ads.zzuw r4 = r2.zza
            r4.zzo(r3)
            return
    }

    public final void zzl(float r7, com.google.android.gms.internal.ads.zzcc r8) throws com.google.android.gms.internal.ads.zzij {
            r6 = this;
            r0 = 1
            r6.zzd = r0
            com.google.android.gms.internal.ads.zzuw r0 = r6.zza
            com.google.android.gms.internal.ads.zzwy r0 = r0.zzi()
            r6.zzm = r0
            com.google.android.gms.internal.ads.zzys r7 = r6.zzj(r7, r8)
            com.google.android.gms.internal.ads.zzkv r8 = r6.zzf
            long r0 = r8.zzb
            long r2 = r8.zze
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L2b
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 < 0) goto L2b
            r0 = 0
            r4 = -1
            long r2 = r2 + r4
            long r0 = java.lang.Math.max(r0, r2)
        L2b:
            r8 = 0
            long r7 = r6.zza(r7, r0, r8)
            long r0 = r6.zzo
            com.google.android.gms.internal.ads.zzkv r2 = r6.zzf
            long r3 = r2.zzb
            long r3 = r3 - r7
            long r0 = r0 + r3
            r6.zzo = r0
            com.google.android.gms.internal.ads.zzkv r7 = r2.zzb(r7)
            r6.zzf = r7
            return
    }

    public final void zzm(long r4) {
            r3 = this;
            boolean r0 = r3.zzu()
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            boolean r0 = r3.zzd
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzuw r0 = r3.zza
            long r1 = r3.zzo
            long r4 = r4 - r1
            r0.zzm(r4)
        L13:
            return
    }

    public final void zzn() {
            r3 = this;
            r3.zzs()
            com.google.android.gms.internal.ads.zzuw r0 = r3.zza
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzuc     // Catch: java.lang.RuntimeException -> L17
            com.google.android.gms.internal.ads.zzlj r2 = r3.zzk
            if (r1 == 0) goto L13
            com.google.android.gms.internal.ads.zzuc r0 = (com.google.android.gms.internal.ads.zzuc) r0     // Catch: java.lang.RuntimeException -> L17
            com.google.android.gms.internal.ads.zzuw r0 = r0.zza     // Catch: java.lang.RuntimeException -> L17
            r2.zzi(r0)     // Catch: java.lang.RuntimeException -> L17
            return
        L13:
            r2.zzi(r0)     // Catch: java.lang.RuntimeException -> L17
            return
        L17:
            r0 = move-exception
            java.lang.String r1 = "MediaPeriodHolder"
            java.lang.String r2 = "Period release failed."
            com.google.android.gms.internal.ads.zzea.zzd(r1, r2, r0)
            return
    }

    public final void zzo(com.google.android.gms.internal.ads.zzku r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzku r0 = r1.zzl
            if (r2 != r0) goto L5
            return
        L5:
            r1.zzs()
            r1.zzl = r2
            r1.zzt()
            return
    }

    public final void zzp(long r1) {
            r0 = this;
            r0.zzo = r1
            return
    }

    public final void zzq() {
            r6 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r6.zza
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzuc
            if (r1 == 0) goto L1c
            com.google.android.gms.internal.ads.zzkv r1 = r6.zzf
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L15
            r1 = -9223372036854775808
        L15:
            com.google.android.gms.internal.ads.zzuc r0 = (com.google.android.gms.internal.ads.zzuc) r0
            r3 = 0
            r0.zzn(r3, r1)
        L1c:
            return
    }

    public final boolean zzr() {
            r7 = this;
            boolean r0 = r7.zzd
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L18
            boolean r0 = r7.zze
            if (r0 == 0) goto L19
            com.google.android.gms.internal.ads.zzuw r0 = r7.zza
            long r3 = r0.zzb()
            r5 = -9223372036854775808
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L17
            goto L18
        L17:
            return r1
        L18:
            r1 = 0
        L19:
            return r1
    }
}
