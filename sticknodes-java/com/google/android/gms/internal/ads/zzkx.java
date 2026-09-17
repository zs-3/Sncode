package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzkx {
    private final com.google.android.gms.internal.ads.zzca zza;
    private final com.google.android.gms.internal.ads.zzcb zzb;
    private final com.google.android.gms.internal.ads.zzma zzc;
    private final com.google.android.gms.internal.ads.zzdt zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private com.google.android.gms.internal.ads.zzku zzh;
    private com.google.android.gms.internal.ads.zzku zzi;
    private com.google.android.gms.internal.ads.zzku zzj;
    private int zzk;
    private java.lang.Object zzl;
    private long zzm;
    private com.google.android.gms.internal.ads.zzit zzn;
    private java.util.List zzo;
    private final com.google.android.gms.internal.ads.zzkc zzp;

    public zzkx(com.google.android.gms.internal.ads.zzma r1, com.google.android.gms.internal.ads.zzdt r2, com.google.android.gms.internal.ads.zzkc r3, com.google.android.gms.internal.ads.zzit r4) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzd = r2
            r0.zzp = r3
            r0.zzn = r4
            com.google.android.gms.internal.ads.zzca r1 = new com.google.android.gms.internal.ads.zzca
            r1.<init>()
            r0.zza = r1
            com.google.android.gms.internal.ads.zzcb r1 = new com.google.android.gms.internal.ads.zzcb
            r1.<init>()
            r0.zzb = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zzo = r1
            return
    }

    private final com.google.android.gms.internal.ads.zzkv zzA(com.google.android.gms.internal.ads.zzcc r23, java.lang.Object r24, long r25, long r27, long r29) {
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            com.google.android.gms.internal.ads.zzca r5 = r0.zza
            r1.zzn(r2, r5)
            com.google.android.gms.internal.ads.zzca r5 = r0.zza
            int r5 = r5.zzc(r3)
            r6 = -1
            if (r5 == r6) goto L1b
            com.google.android.gms.internal.ads.zzca r7 = r0.zza
            r7.zzj(r5)
        L1b:
            if (r5 != r6) goto L23
            com.google.android.gms.internal.ads.zzca r7 = r0.zza
            r7.zzb()
            goto L28
        L23:
            com.google.android.gms.internal.ads.zzca r7 = r0.zza
            r7.zzk(r5)
        L28:
            com.google.android.gms.internal.ads.zzuy r9 = new com.google.android.gms.internal.ads.zzuy
            r7 = r29
            r9.<init>(r2, r7, r5)
            boolean r2 = zzG(r9)
            boolean r20 = r0.zzE(r1, r9)
            boolean r21 = r0.zzD(r1, r9, r2)
            if (r5 == r6) goto L42
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            r1.zzk(r5)
        L42:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            if (r5 == r6) goto L52
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            r1.zzg(r5)
            r5 = r10
            goto L53
        L52:
            r5 = r7
        L53:
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L5b
            r14 = r10
            r16 = r14
            goto L62
        L5b:
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            long r12 = r1.zzd
            r14 = r5
            r16 = r12
        L62:
            int r1 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r1 == 0) goto L72
            int r1 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r1 < 0) goto L72
            r3 = -1
            long r3 = r16 + r3
            long r3 = java.lang.Math.max(r10, r3)
        L72:
            r10 = r3
            com.google.android.gms.internal.ads.zzkv r1 = new com.google.android.gms.internal.ads.zzkv
            r18 = 0
            r8 = r1
            r12 = r27
            r19 = r2
            r8.<init>(r9, r10, r12, r14, r16, r18, r19, r20, r21)
            return r1
    }

    private static com.google.android.gms.internal.ads.zzuy zzB(com.google.android.gms.internal.ads.zzcc r9, java.lang.Object r10, long r11, long r13, com.google.android.gms.internal.ads.zzcb r15, com.google.android.gms.internal.ads.zzca r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r16
            r9.zzn(r10, r4)
            int r5 = r4.zzc
            r6 = 0
            r8 = r15
            r9.zze(r5, r15, r6)
            r9.zza(r10)
            r16.zzb()
            r9.zzn(r10, r4)
            int r5 = r4.zzd(r11)
            r0 = -1
            if (r5 != r0) goto L2b
            int r0 = r4.zzc(r11)
            com.google.android.gms.internal.ads.zzuy r2 = new com.google.android.gms.internal.ads.zzuy
            r6 = r13
            r2.<init>(r10, r13, r0)
            return r2
        L2b:
            r6 = r13
            int r3 = r4.zze(r5)
            com.google.android.gms.internal.ads.zzuy r8 = new com.google.android.gms.internal.ads.zzuy
            r0 = r8
            r1 = r10
            r2 = r5
            r4 = r13
            r0.<init>(r1, r2, r3, r4)
            return r8
    }

    private final void zzC() {
            r4 = this;
            com.google.android.gms.internal.ads.zzgau r0 = new com.google.android.gms.internal.ads.zzgau
            r0.<init>()
            com.google.android.gms.internal.ads.zzku r1 = r4.zzh
        L7:
            if (r1 == 0) goto L15
            com.google.android.gms.internal.ads.zzkv r2 = r1.zzf
            com.google.android.gms.internal.ads.zzuy r2 = r2.zza
            r0.zzf(r2)
            com.google.android.gms.internal.ads.zzku r1 = r1.zzg()
            goto L7
        L15:
            com.google.android.gms.internal.ads.zzku r1 = r4.zzi
            if (r1 != 0) goto L1b
            r1 = 0
            goto L1f
        L1b:
            com.google.android.gms.internal.ads.zzkv r1 = r1.zzf
            com.google.android.gms.internal.ads.zzuy r1 = r1.zza
        L1f:
            com.google.android.gms.internal.ads.zzdt r2 = r4.zzd
            com.google.android.gms.internal.ads.zzkw r3 = new com.google.android.gms.internal.ads.zzkw
            r3.<init>(r4, r0, r1)
            r2.zzh(r3)
            return
    }

    private final boolean zzD(com.google.android.gms.internal.ads.zzcc r8, com.google.android.gms.internal.ads.zzuy r9, boolean r10) {
            r7 = this;
            java.lang.Object r9 = r9.zza
            int r1 = r8.zza(r9)
            com.google.android.gms.internal.ads.zzca r9 = r7.zza
            r6 = 0
            com.google.android.gms.internal.ads.zzca r9 = r8.zzd(r1, r9, r6)
            int r9 = r9.zzc
            com.google.android.gms.internal.ads.zzcb r0 = r7.zzb
            r2 = 0
            com.google.android.gms.internal.ads.zzcb r9 = r8.zze(r9, r0, r2)
            boolean r9 = r9.zzi
            if (r9 != 0) goto L2f
            com.google.android.gms.internal.ads.zzca r2 = r7.zza
            com.google.android.gms.internal.ads.zzcb r3 = r7.zzb
            int r4 = r7.zzf
            boolean r5 = r7.zzg
            r0 = r8
            int r8 = r0.zzi(r1, r2, r3, r4, r5)
            r9 = -1
            if (r8 != r9) goto L2f
            if (r10 == 0) goto L2f
            r8 = 1
            return r8
        L2f:
            return r6
    }

    private final boolean zzE(com.google.android.gms.internal.ads.zzcc r6, com.google.android.gms.internal.ads.zzuy r7) {
            r5 = this;
            boolean r0 = zzG(r7)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r7.zza
            com.google.android.gms.internal.ads.zzca r2 = r5.zza
            com.google.android.gms.internal.ads.zzca r0 = r6.zzn(r0, r2)
            int r0 = r0.zzc
            java.lang.Object r7 = r7.zza
            int r7 = r6.zza(r7)
            com.google.android.gms.internal.ads.zzcb r2 = r5.zzb
            r3 = 0
            com.google.android.gms.internal.ads.zzcb r6 = r6.zze(r0, r2, r3)
            int r6 = r6.zzo
            if (r6 != r7) goto L26
            r6 = 1
            return r6
        L26:
            return r1
    }

    private final boolean zzF(com.google.android.gms.internal.ads.zzcc r9) {
            r8 = this;
            com.google.android.gms.internal.ads.zzku r0 = r8.zzh
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r2 = r0.zzb
            int r2 = r9.zza(r2)
            r3 = r2
        Ld:
            com.google.android.gms.internal.ads.zzca r4 = r8.zza
            com.google.android.gms.internal.ads.zzcb r5 = r8.zzb
            int r6 = r8.zzf
            boolean r7 = r8.zzg
            r2 = r9
            int r3 = r2.zzi(r3, r4, r5, r6, r7)
        L1a:
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzku r2 = r0.zzg()
            if (r2 == 0) goto L2e
            com.google.android.gms.internal.ads.zzkv r2 = r0.zzf
            boolean r2 = r2.zzg
            if (r2 != 0) goto L2e
            com.google.android.gms.internal.ads.zzku r0 = r0.zzg()
            goto L1a
        L2e:
            com.google.android.gms.internal.ads.zzku r2 = r0.zzg()
            r4 = -1
            if (r3 == r4) goto L43
            if (r2 != 0) goto L38
            goto L43
        L38:
            java.lang.Object r4 = r2.zzb
            int r4 = r9.zza(r4)
            if (r4 == r3) goto L41
            goto L43
        L41:
            r0 = r2
            goto Ld
        L43:
            boolean r2 = r8.zzq(r0)
            com.google.android.gms.internal.ads.zzkv r3 = r0.zzf
            com.google.android.gms.internal.ads.zzkv r9 = r8.zzh(r9, r3)
            r0.zzf = r9
            if (r2 != 0) goto L52
            return r1
        L52:
            r9 = 0
            return r9
    }

    private static final boolean zzG(com.google.android.gms.internal.ads.zzuy r1) {
            boolean r0 = r1.zzb()
            if (r0 != 0) goto Ld
            int r1 = r1.zze
            r0 = -1
            if (r1 != r0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    static boolean zzo(long r3, long r5) {
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L10
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto Le
            goto L10
        Le:
            r3 = 0
            return r3
        L10:
            r3 = 1
            return r3
    }

    private final long zzv(com.google.android.gms.internal.ads.zzcc r2, java.lang.Object r3, int r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzca r0 = r1.zza
            r2.zzn(r3, r0)
            com.google.android.gms.internal.ads.zzca r2 = r1.zza
            r2.zzg(r4)
            com.google.android.gms.internal.ads.zzca r2 = r1.zza
            com.google.android.gms.internal.ads.zzb r2 = r2.zzg
            com.google.android.gms.internal.ads.zza r2 = r2.zza(r4)
            long r2 = r2.zzg
            r2 = 0
            return r2
    }

    private final long zzw(java.lang.Object r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.List r1 = r3.zzo
            int r1 = r1.size()
            if (r0 >= r1) goto L23
            java.util.List r1 = r3.zzo
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.ads.zzku r1 = (com.google.android.gms.internal.ads.zzku) r1
            java.lang.Object r2 = r1.zzb
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L20
            com.google.android.gms.internal.ads.zzkv r4 = r1.zzf
            com.google.android.gms.internal.ads.zzuy r4 = r4.zza
            long r0 = r4.zzd
            return r0
        L20:
            int r0 = r0 + 1
            goto L1
        L23:
            r0 = -1
            return r0
    }

    private final com.google.android.gms.internal.ads.zzkv zzx(com.google.android.gms.internal.ads.zzcc r18, com.google.android.gms.internal.ads.zzku r19, long r20) {
            r17 = this;
            r9 = r17
            r8 = r18
            r10 = r19
            com.google.android.gms.internal.ads.zzkv r11 = r10.zzf
            long r0 = r19.zze()
            long r2 = r11.zze
            long r0 = r0 + r2
            boolean r2 = r11.zzg
            long r6 = r0 - r20
            r12 = -1
            if (r2 == 0) goto Le0
            com.google.android.gms.internal.ads.zzuy r0 = r11.zza
            java.lang.Object r0 = r0.zza
            int r1 = r8.zza(r0)
            int r3 = r9.zzf
            boolean r2 = r9.zzg
            com.google.android.gms.internal.ads.zzcb r0 = r9.zzb
            com.google.android.gms.internal.ads.zzca r4 = r9.zza
            r5 = r0
            r0 = r18
            r16 = r2
            r2 = r4
            r4 = r3
            r3 = r5
            r13 = 0
            r5 = r16
            int r0 = r0.zzi(r1, r2, r3, r4, r5)
            if (r0 != r12) goto L3b
        L38:
            r13 = 0
            goto L1ad
        L3b:
            com.google.android.gms.internal.ads.zzca r1 = r9.zza
            r2 = 1
            com.google.android.gms.internal.ads.zzca r1 = r8.zzd(r0, r1, r2)
            int r3 = r1.zzc
            com.google.android.gms.internal.ads.zzca r1 = r9.zza
            java.lang.Object r1 = r1.zzb
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzuy r2 = r11.zza
            long r4 = r2.zzd
            com.google.android.gms.internal.ads.zzcb r2 = r9.zzb
            com.google.android.gms.internal.ads.zzcb r2 = r8.zze(r3, r2, r13)
            int r2 = r2.zzn
            if (r2 != r0) goto La6
            com.google.android.gms.internal.ads.zzcb r1 = r9.zzb
            com.google.android.gms.internal.ads.zzca r2 = r9.zza
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r6 = java.lang.Math.max(r13, r6)
            r0 = r18
            android.util.Pair r0 = r0.zzm(r1, r2, r3, r4, r6)
            if (r0 != 0) goto L6f
            goto L38
        L6f:
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            com.google.android.gms.internal.ads.zzku r0 = r19.zzg()
            if (r0 == 0) goto L8e
            java.lang.Object r4 = r0.zzb
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L8e
            com.google.android.gms.internal.ads.zzkv r0 = r0.zzf
            com.google.android.gms.internal.ads.zzuy r0 = r0.zza
            long r4 = r0.zzd
            goto L9f
        L8e:
            long r4 = r9.zzw(r1)
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L9f
            long r4 = r9.zze
            r6 = 1
            long r6 = r6 + r4
            r9.zze = r6
        L9f:
            r15 = r2
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto La7
        La6:
            r15 = r13
        La7:
            com.google.android.gms.internal.ads.zzcb r6 = r9.zzb
            com.google.android.gms.internal.ads.zzca r7 = r9.zza
            r0 = r18
            r2 = r15
            com.google.android.gms.internal.ads.zzuy r2 = zzB(r0, r1, r2, r4, r6, r7)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r3 == 0) goto Ld4
            long r3 = r11.zzc
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto Ld4
            com.google.android.gms.internal.ads.zzuy r0 = r11.zza
            java.lang.Object r0 = r0.zza
            com.google.android.gms.internal.ads.zzca r1 = r9.zza
            com.google.android.gms.internal.ads.zzca r0 = r8.zzn(r0, r1)
            r0.zzb()
            com.google.android.gms.internal.ads.zzca r0 = r9.zza
            com.google.android.gms.internal.ads.zzb r0 = r0.zzg
            int r0 = r0.zzd
        Ld4:
            r0 = r17
            r1 = r18
            r3 = r13
            r5 = r15
            com.google.android.gms.internal.ads.zzkv r13 = r0.zzy(r1, r2, r3, r5)
            goto L1ad
        Le0:
            r13 = 0
            com.google.android.gms.internal.ads.zzuy r10 = r11.zza
            java.lang.Object r0 = r10.zza
            com.google.android.gms.internal.ads.zzca r1 = r9.zza
            r8.zzn(r0, r1)
            boolean r0 = r10.zzb()
            if (r0 == 0) goto L165
            int r3 = r10.zzb
            com.google.android.gms.internal.ads.zzca r0 = r9.zza
            int r0 = r0.zza(r3)
            if (r0 != r12) goto Lfd
            goto L38
        Lfd:
            com.google.android.gms.internal.ads.zzca r0 = r9.zza
            int r1 = r10.zzc
            com.google.android.gms.internal.ads.zzb r0 = r0.zzg
            com.google.android.gms.internal.ads.zza r0 = r0.zza(r3)
            int r4 = r0.zza(r1)
            if (r4 >= 0) goto L11e
            java.lang.Object r2 = r10.zza
            long r5 = r11.zzc
            long r10 = r10.zzd
            r0 = r17
            r1 = r18
            r7 = r10
            com.google.android.gms.internal.ads.zzkv r13 = r0.zzz(r1, r2, r3, r4, r5, r7)
            goto L1ad
        L11e:
            long r0 = r11.zzc
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L14a
            com.google.android.gms.internal.ads.zzcb r1 = r9.zzb
            com.google.android.gms.internal.ads.zzca r2 = r9.zza
            int r3 = r2.zzc
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r6 = java.lang.Math.max(r13, r6)
            r0 = r18
            android.util.Pair r0 = r0.zzm(r1, r2, r3, r4, r6)
            if (r0 != 0) goto L142
            goto L38
        L142:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L14a:
            java.lang.Object r2 = r10.zza
            int r3 = r10.zzb
            r9.zzv(r8, r2, r3)
            java.lang.Object r2 = r10.zza
            long r3 = java.lang.Math.max(r13, r0)
            long r5 = r11.zzc
            long r10 = r10.zzd
            r0 = r17
            r1 = r18
            r7 = r10
            com.google.android.gms.internal.ads.zzkv r13 = r0.zzA(r1, r2, r3, r5, r7)
            goto L1ad
        L165:
            int r0 = r10.zze
            if (r0 == r12) goto L16e
            com.google.android.gms.internal.ads.zzca r1 = r9.zza
            r1.zzj(r0)
        L16e:
            com.google.android.gms.internal.ads.zzca r0 = r9.zza
            int r1 = r10.zze
            int r4 = r0.zze(r1)
            r0.zzk(r1)
            com.google.android.gms.internal.ads.zzca r0 = r9.zza
            int r1 = r10.zze
            int r0 = r0.zza(r1)
            if (r4 == r0) goto L195
            java.lang.Object r2 = r10.zza
            int r3 = r10.zze
            long r5 = r11.zze
            long r10 = r10.zzd
            r0 = r17
            r1 = r18
            r7 = r10
            com.google.android.gms.internal.ads.zzkv r13 = r0.zzz(r1, r2, r3, r4, r5, r7)
            goto L1ad
        L195:
            java.lang.Object r0 = r10.zza
            int r1 = r10.zze
            r9.zzv(r8, r0, r1)
            java.lang.Object r2 = r10.zza
            r3 = 0
            long r5 = r11.zze
            long r10 = r10.zzd
            r0 = r17
            r1 = r18
            r7 = r10
            com.google.android.gms.internal.ads.zzkv r13 = r0.zzA(r1, r2, r3, r5, r7)
        L1ad:
            return r13
    }

    private final com.google.android.gms.internal.ads.zzkv zzy(com.google.android.gms.internal.ads.zzcc r13, com.google.android.gms.internal.ads.zzuy r14, long r15, long r17) {
            r12 = this;
            r0 = r14
            java.lang.Object r1 = r0.zza
            r11 = r12
            com.google.android.gms.internal.ads.zzca r2 = r11.zza
            r3 = r13
            r13.zzn(r1, r2)
            boolean r1 = r14.zzb()
            if (r1 == 0) goto L20
            java.lang.Object r4 = r0.zza
            int r5 = r0.zzb
            int r6 = r0.zzc
            long r9 = r0.zzd
            r2 = r12
            r3 = r13
            r7 = r15
            com.google.android.gms.internal.ads.zzkv r0 = r2.zzz(r3, r4, r5, r6, r7, r9)
            return r0
        L20:
            java.lang.Object r4 = r0.zza
            long r9 = r0.zzd
            r2 = r12
            r3 = r13
            r5 = r17
            r7 = r15
            com.google.android.gms.internal.ads.zzkv r0 = r2.zzA(r3, r4, r5, r7, r9)
            return r0
    }

    private final com.google.android.gms.internal.ads.zzkv zzz(com.google.android.gms.internal.ads.zzcc r19, java.lang.Object r20, int r21, int r22, long r23, long r25) {
            r18 = this;
            r0 = r18
            com.google.android.gms.internal.ads.zzuy r7 = new com.google.android.gms.internal.ads.zzuy
            r1 = r7
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r25
            r1.<init>(r2, r3, r4, r5)
            java.lang.Object r1 = r7.zza
            int r2 = r7.zzb
            int r3 = r7.zzc
            com.google.android.gms.internal.ads.zzca r4 = r0.zza
            r5 = r19
            com.google.android.gms.internal.ads.zzca r1 = r5.zzn(r1, r4)
            long r9 = r1.zzf(r2, r3)
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            r2 = r21
            int r1 = r1.zze(r2)
            r2 = r22
            if (r2 != r1) goto L33
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            r1.zzh()
        L33:
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            int r2 = r7.zzb
            r1.zzk(r2)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            int r5 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r5 == 0) goto L51
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 > 0) goto L51
            r1 = -1
            long r1 = r1 + r9
            long r1 = java.lang.Math.max(r3, r1)
            r3 = r1
        L51:
            com.google.android.gms.internal.ads.zzkv r15 = new com.google.android.gms.internal.ads.zzkv
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r1 = r15
            r2 = r7
            r5 = r23
            r7 = r11
            r11 = r13
            r12 = r14
            r13 = r16
            r14 = r17
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
    }

    public final com.google.android.gms.internal.ads.zzku zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzku r0 = r3.zzh
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzku r2 = r3.zzi
            if (r0 != r2) goto L10
            com.google.android.gms.internal.ads.zzku r2 = r0.zzg()
            r3.zzi = r2
        L10:
            r0.zzn()
            int r0 = r3.zzk
            int r0 = r0 + (-1)
            r3.zzk = r0
            if (r0 != 0) goto L2b
            r3.zzj = r1
            com.google.android.gms.internal.ads.zzku r0 = r3.zzh
            java.lang.Object r1 = r0.zzb
            r3.zzl = r1
            com.google.android.gms.internal.ads.zzkv r0 = r0.zzf
            com.google.android.gms.internal.ads.zzuy r0 = r0.zza
            long r0 = r0.zzd
            r3.zzm = r0
        L2b:
            com.google.android.gms.internal.ads.zzku r0 = r3.zzh
            com.google.android.gms.internal.ads.zzku r0 = r0.zzg()
            r3.zzh = r0
            r3.zzC()
            com.google.android.gms.internal.ads.zzku r0 = r3.zzh
            return r0
    }

    public final com.google.android.gms.internal.ads.zzku zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzku r0 = r1.zzi
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            com.google.android.gms.internal.ads.zzku r0 = r0.zzg()
            r1.zzi = r0
            r1.zzC()
            com.google.android.gms.internal.ads.zzku r0 = r1.zzi
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzku zzc(com.google.android.gms.internal.ads.zzkv r11) {
            r10 = this;
            com.google.android.gms.internal.ads.zzku r0 = r10.zzj
            if (r0 != 0) goto La
            r0 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            goto L17
        La:
            long r1 = r0.zze()
            com.google.android.gms.internal.ads.zzkv r0 = r0.zzf
            long r3 = r0.zze
            long r1 = r1 + r3
            long r3 = r11.zzb
            long r0 = r1 - r3
        L17:
            r2 = 0
        L18:
            java.util.List r3 = r10.zzo
            int r3 = r3.size()
            r4 = 0
            if (r2 >= r3) goto L53
            java.util.List r3 = r10.zzo
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzku r3 = (com.google.android.gms.internal.ads.zzku) r3
            com.google.android.gms.internal.ads.zzkv r3 = r3.zzf
            long r5 = r3.zze
            long r7 = r11.zze
            boolean r5 = zzo(r5, r7)
            if (r5 == 0) goto L50
            long r5 = r3.zzb
            long r7 = r11.zzb
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L50
            com.google.android.gms.internal.ads.zzuy r3 = r3.zza
            com.google.android.gms.internal.ads.zzuy r5 = r11.zza
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L50
            java.util.List r3 = r10.zzo
            java.lang.Object r2 = r3.remove(r2)
            com.google.android.gms.internal.ads.zzku r2 = (com.google.android.gms.internal.ads.zzku) r2
            goto L54
        L50:
            int r2 = r2 + 1
            goto L18
        L53:
            r2 = r4
        L54:
            if (r2 != 0) goto L5f
            com.google.android.gms.internal.ads.zzkc r2 = r10.zzp
            com.google.android.gms.internal.ads.zzkk r2 = r2.zza
            com.google.android.gms.internal.ads.zzku r2 = com.google.android.gms.internal.ads.zzkk.zzd(r2, r11, r0)
            goto L64
        L5f:
            r2.zzf = r11
            r2.zzp(r0)
        L64:
            com.google.android.gms.internal.ads.zzku r11 = r10.zzj
            if (r11 == 0) goto L6c
            r11.zzo(r2)
            goto L70
        L6c:
            r10.zzh = r2
            r10.zzi = r2
        L70:
            r10.zzl = r4
            r10.zzj = r2
            int r11 = r10.zzk
            int r11 = r11 + 1
            r10.zzk = r11
            r10.zzC()
            return r2
    }

    public final com.google.android.gms.internal.ads.zzku zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzku r0 = r1.zzj
            return r0
    }

    public final com.google.android.gms.internal.ads.zzku zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzku r0 = r1.zzh
            return r0
    }

    public final com.google.android.gms.internal.ads.zzku zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzku r0 = r1.zzi
            return r0
    }

    public final com.google.android.gms.internal.ads.zzkv zzg(long r9, com.google.android.gms.internal.ads.zzlk r11) {
            r8 = this;
            com.google.android.gms.internal.ads.zzku r0 = r8.zzj
            if (r0 != 0) goto L12
            com.google.android.gms.internal.ads.zzcc r2 = r11.zza
            com.google.android.gms.internal.ads.zzuy r3 = r11.zzb
            long r4 = r11.zzc
            long r6 = r11.zzs
            r1 = r8
            com.google.android.gms.internal.ads.zzkv r9 = r1.zzy(r2, r3, r4, r6)
            goto L18
        L12:
            com.google.android.gms.internal.ads.zzcc r11 = r11.zza
            com.google.android.gms.internal.ads.zzkv r9 = r8.zzx(r11, r0, r9)
        L18:
            return r9
    }

    public final com.google.android.gms.internal.ads.zzkv zzh(com.google.android.gms.internal.ads.zzcc r19, com.google.android.gms.internal.ads.zzkv r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzuy r3 = r2.zza
            boolean r12 = zzG(r3)
            boolean r13 = r0.zzE(r1, r3)
            boolean r14 = r0.zzD(r1, r3, r12)
            com.google.android.gms.internal.ads.zzuy r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzca r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.zze
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.zzca r9 = r0.zza
            r9.zzg(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzf(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            long r5 = r1.zzd
            goto L48
        L57:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzca r1 = r0.zza
            int r4 = r3.zzb
            r1.zzk(r4)
            goto L6e
        L65:
            int r1 = r3.zze
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.zzca r4 = r0.zza
            r4.zzk(r1)
        L6e:
            com.google.android.gms.internal.ads.zzkv r15 = new com.google.android.gms.internal.ads.zzkv
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
    }

    public final com.google.android.gms.internal.ads.zzuy zzi(com.google.android.gms.internal.ads.zzcc r11, java.lang.Object r12, long r13) {
            r10 = this;
            com.google.android.gms.internal.ads.zzca r2 = r10.zza
            com.google.android.gms.internal.ads.zzca r2 = r11.zzn(r12, r2)
            int r2 = r2.zzc
            java.lang.Object r3 = r10.zzl
            r4 = 0
            r5 = -1
            if (r3 == 0) goto L22
            int r3 = r11.zza(r3)
            if (r3 == r5) goto L22
            com.google.android.gms.internal.ads.zzca r6 = r10.zza
            com.google.android.gms.internal.ads.zzca r3 = r11.zzd(r3, r6, r4)
            int r3 = r3.zzc
            if (r3 != r2) goto L22
            long r2 = r10.zzm
        L20:
            r6 = r2
            goto L77
        L22:
            com.google.android.gms.internal.ads.zzku r3 = r10.zzh
        L24:
            if (r3 == 0) goto L3a
            java.lang.Object r6 = r3.zzb
            boolean r6 = r6.equals(r12)
            if (r6 == 0) goto L35
            com.google.android.gms.internal.ads.zzkv r2 = r3.zzf
            com.google.android.gms.internal.ads.zzuy r2 = r2.zza
            long r2 = r2.zzd
            goto L20
        L35:
            com.google.android.gms.internal.ads.zzku r3 = r3.zzg()
            goto L24
        L3a:
            com.google.android.gms.internal.ads.zzku r3 = r10.zzh
        L3c:
            if (r3 == 0) goto L5c
            java.lang.Object r6 = r3.zzb
            int r6 = r11.zza(r6)
            if (r6 == r5) goto L57
            com.google.android.gms.internal.ads.zzca r7 = r10.zza
            com.google.android.gms.internal.ads.zzca r6 = r11.zzd(r6, r7, r4)
            int r6 = r6.zzc
            if (r6 != r2) goto L57
            com.google.android.gms.internal.ads.zzkv r2 = r3.zzf
            com.google.android.gms.internal.ads.zzuy r2 = r2.zza
            long r2 = r2.zzd
            goto L20
        L57:
            com.google.android.gms.internal.ads.zzku r3 = r3.zzg()
            goto L3c
        L5c:
            long r2 = r10.zzw(r12)
            r6 = -1
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L67
            goto L20
        L67:
            long r2 = r10.zze
            r6 = 1
            long r6 = r6 + r2
            r10.zze = r6
            com.google.android.gms.internal.ads.zzku r4 = r10.zzh
            if (r4 != 0) goto L20
            r10.zzl = r12
            r10.zzm = r2
            goto L20
        L77:
            com.google.android.gms.internal.ads.zzca r2 = r10.zza
            r11.zzn(r12, r2)
            com.google.android.gms.internal.ads.zzca r2 = r10.zza
            com.google.android.gms.internal.ads.zzcb r3 = r10.zzb
            int r2 = r2.zzc
            r8 = 0
            r11.zze(r2, r3, r8)
            int r2 = r11.zza(r12)
            r1 = r12
        L8c:
            com.google.android.gms.internal.ads.zzcb r8 = r10.zzb
            int r3 = r8.zzn
            if (r2 < r3) goto Lb1
            com.google.android.gms.internal.ads.zzca r3 = r10.zza
            r4 = 1
            r11.zzd(r2, r3, r4)
            com.google.android.gms.internal.ads.zzca r3 = r10.zza
            r3.zzb()
            com.google.android.gms.internal.ads.zzca r3 = r10.zza
            long r8 = r3.zzd
            int r3 = r3.zzd(r8)
            if (r3 == r5) goto Lae
            com.google.android.gms.internal.ads.zzca r1 = r10.zza
            java.lang.Object r1 = r1.zzb
            java.util.Objects.requireNonNull(r1)
        Lae:
            int r2 = r2 + (-1)
            goto L8c
        Lb1:
            com.google.android.gms.internal.ads.zzca r9 = r10.zza
            r0 = r11
            r2 = r13
            r4 = r6
            r6 = r8
            r7 = r9
            com.google.android.gms.internal.ads.zzuy r0 = zzB(r0, r1, r2, r4, r6, r7)
            return r0
    }

    public final void zzj() {
            r3 = this;
            int r0 = r3.zzk
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzku r0 = r3.zzh
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            java.lang.Object r1 = r0.zzb
            r3.zzl = r1
            com.google.android.gms.internal.ads.zzkv r1 = r0.zzf
            com.google.android.gms.internal.ads.zzuy r1 = r1.zza
            long r1 = r1.zzd
            r3.zzm = r1
        L16:
            if (r0 == 0) goto L20
            r0.zzn()
            com.google.android.gms.internal.ads.zzku r0 = r0.zzg()
            goto L16
        L20:
            r0 = 0
            r3.zzh = r0
            r3.zzj = r0
            r3.zzi = r0
            r0 = 0
            r3.zzk = r0
            r3.zzC()
            return
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzgau r2, com.google.android.gms.internal.ads.zzuy r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzma r0 = r1.zzc
            com.google.android.gms.internal.ads.zzgax r2 = r2.zzi()
            r0.zzS(r2, r3)
            return
    }

    public final void zzl(long r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzku r0 = r1.zzj
            if (r0 == 0) goto L7
            r0.zzm(r2)
        L7:
            return
    }

    public final void zzm() {
            r3 = this;
            java.util.List r0 = r3.zzo
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        Le:
            java.util.List r2 = r3.zzo
            int r2 = r2.size()
            if (r1 >= r2) goto L24
            java.util.List r2 = r3.zzo
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzku r2 = (com.google.android.gms.internal.ads.zzku) r2
            r2.zzn()
            int r1 = r1 + 1
            goto Le
        L24:
            r3.zzo = r0
        L26:
            return
    }

    public final void zzn(com.google.android.gms.internal.ads.zzcc r1, com.google.android.gms.internal.ads.zzit r2) {
            r0 = this;
            r0.zzn = r2
            long r1 = r2.zzb
            r0.zzm()
            return
    }

    public final boolean zzp(com.google.android.gms.internal.ads.zzuw r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzku r0 = r1.zzj
            if (r0 == 0) goto La
            com.google.android.gms.internal.ads.zzuw r0 = r0.zza
            if (r0 != r2) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    public final boolean zzq(com.google.android.gms.internal.ads.zzku r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzdi.zzb(r3)
            com.google.android.gms.internal.ads.zzku r0 = r2.zzj
            boolean r0 = r3.equals(r0)
            r1 = 0
            if (r0 == 0) goto Ld
            return r1
        Ld:
            r2.zzj = r3
        Lf:
            com.google.android.gms.internal.ads.zzku r0 = r3.zzg()
            if (r0 == 0) goto L30
            com.google.android.gms.internal.ads.zzku r3 = r3.zzg()
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.ads.zzku r0 = r2.zzi
            if (r3 != r0) goto L26
            com.google.android.gms.internal.ads.zzku r0 = r2.zzh
            r2.zzi = r0
            r0 = 1
            r1 = 1
        L26:
            r3.zzn()
            int r0 = r2.zzk
            int r0 = r0 + (-1)
            r2.zzk = r0
            goto Lf
        L30:
            com.google.android.gms.internal.ads.zzku r3 = r2.zzj
            java.util.Objects.requireNonNull(r3)
            r0 = 0
            r3.zzo(r0)
            r2.zzC()
            return r1
    }

    public final boolean zzr() {
            r7 = this;
            com.google.android.gms.internal.ads.zzku r0 = r7.zzj
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2a
            com.google.android.gms.internal.ads.zzkv r3 = r0.zzf
            boolean r3 = r3.zzi
            if (r3 != 0) goto L29
            boolean r0 = r0.zzr()
            if (r0 == 0) goto L29
            com.google.android.gms.internal.ads.zzku r0 = r7.zzj
            com.google.android.gms.internal.ads.zzkv r0 = r0.zzf
            long r3 = r0.zze
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L29
            int r0 = r7.zzk
            r3 = 100
            if (r0 >= r3) goto L28
            goto L2a
        L28:
            return r2
        L29:
            r1 = 0
        L2a:
            return r1
    }

    public final boolean zzs(com.google.android.gms.internal.ads.zzcc r17, long r18, long r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.zzku r2 = r0.zzh
            r3 = 0
        L7:
            r4 = 1
            if (r2 == 0) goto L94
            com.google.android.gms.internal.ads.zzkv r5 = r2.zzf
            r6 = 0
            if (r3 != 0) goto L16
            com.google.android.gms.internal.ads.zzkv r3 = r0.zzh(r1, r5)
            r7 = r18
            goto L39
        L16:
            r7 = r18
            com.google.android.gms.internal.ads.zzkv r9 = r0.zzx(r1, r3, r7)
            if (r9 != 0) goto L26
            boolean r1 = r0.zzq(r3)
            if (r1 != 0) goto L25
            return r4
        L25:
            return r6
        L26:
            long r10 = r5.zzb
            long r12 = r9.zzb
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L8c
            com.google.android.gms.internal.ads.zzuy r10 = r5.zza
            com.google.android.gms.internal.ads.zzuy r11 = r9.zza
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L8c
            r3 = r9
        L39:
            long r9 = r5.zzc
            com.google.android.gms.internal.ads.zzkv r9 = r3.zza(r9)
            r2.zzf = r9
            long r9 = r5.zze
            long r11 = r3.zze
            boolean r5 = zzo(r9, r11)
            if (r5 != 0) goto L83
            r2.zzq()
            long r7 = r3.zze
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L5f
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L64
        L5f:
            long r9 = r2.zze()
            long r7 = r7 + r9
        L64:
            com.google.android.gms.internal.ads.zzku r1 = r0.zzi
            if (r2 != r1) goto L78
            com.google.android.gms.internal.ads.zzkv r1 = r2.zzf
            boolean r1 = r1.zzf
            r9 = -9223372036854775808
            int r1 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r1 == 0) goto L76
            int r1 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r1 < 0) goto L78
        L76:
            r1 = 1
            goto L79
        L78:
            r1 = 0
        L79:
            boolean r2 = r0.zzq(r2)
            if (r2 != 0) goto L82
            if (r1 != 0) goto L82
            return r4
        L82:
            return r6
        L83:
            com.google.android.gms.internal.ads.zzku r3 = r2.zzg()
            r15 = r3
            r3 = r2
            r2 = r15
            goto L7
        L8c:
            boolean r1 = r0.zzq(r3)
            if (r1 != 0) goto L93
            return r4
        L93:
            return r6
        L94:
            return r4
    }

    public final boolean zzt(com.google.android.gms.internal.ads.zzcc r1, int r2) {
            r0 = this;
            r0.zzf = r2
            boolean r1 = r0.zzF(r1)
            return r1
    }

    public final boolean zzu(com.google.android.gms.internal.ads.zzcc r1, boolean r2) {
            r0 = this;
            r0.zzg = r2
            boolean r1 = r0.zzF(r1)
            return r1
    }
}
