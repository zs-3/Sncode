package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzkv {
    public final com.google.android.gms.internal.ads.zzuy zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    zzkv(com.google.android.gms.internal.ads.zzuy r3, long r4, long r6, long r8, long r10, boolean r12, boolean r13, boolean r14, boolean r15) {
            r2 = this;
            r2.<init>()
            r12 = 0
            r0 = 1
            if (r15 == 0) goto Lc
            if (r13 == 0) goto La
            goto Lc
        La:
            r1 = 0
            goto Ld
        Lc:
            r1 = 1
        Ld:
            com.google.android.gms.internal.ads.zzdi.zzd(r1)
            if (r14 == 0) goto L16
            if (r13 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r6
            r2.zzd = r8
            r2.zze = r10
            r2.zzf = r12
            r2.zzg = r13
            r2.zzh = r14
            r2.zzi = r15
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L4f
            java.lang.Class<com.google.android.gms.internal.ads.zzkv> r2 = com.google.android.gms.internal.ads.zzkv.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L4f
        L10:
            com.google.android.gms.internal.ads.zzkv r8 = (com.google.android.gms.internal.ads.zzkv) r8
            long r2 = r7.zzb
            long r4 = r8.zzb
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L4f
            long r2 = r7.zzc
            long r4 = r8.zzc
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L4f
            long r2 = r7.zzd
            long r4 = r8.zzd
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L4f
            long r2 = r7.zze
            long r4 = r8.zze
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L4f
            boolean r2 = r7.zzg
            boolean r3 = r8.zzg
            if (r2 != r3) goto L4f
            boolean r2 = r7.zzh
            boolean r3 = r8.zzh
            if (r2 != r3) goto L4f
            boolean r2 = r7.zzi
            boolean r3 = r8.zzi
            if (r2 != r3) goto L4f
            com.google.android.gms.internal.ads.zzuy r2 = r7.zza
            com.google.android.gms.internal.ads.zzuy r8 = r8.zza
            boolean r8 = java.util.Objects.equals(r2, r8)
            if (r8 == 0) goto L4f
            return r0
        L4f:
            return r1
    }

    public final int hashCode() {
            r9 = this;
            com.google.android.gms.internal.ads.zzuy r0 = r9.zza
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            long r1 = r9.zze
            long r3 = r9.zzd
            long r5 = r9.zzc
            long r7 = r9.zzb
            int r0 = r0 * 31
            int r8 = (int) r7
            int r0 = r0 + r8
            int r0 = r0 * 31
            int r6 = (int) r5
            int r0 = r0 + r6
            int r0 = r0 * 31
            int r4 = (int) r3
            int r0 = r0 + r4
            int r0 = r0 * 31
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 961
            boolean r1 = r9.zzg
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r9.zzh
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r9.zzi
            int r0 = r0 + r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzkv zza(long r18) {
            r17 = this;
            r0 = r17
            long r1 = r0.zzc
            int r3 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r3 != 0) goto L9
            return r0
        L9:
            com.google.android.gms.internal.ads.zzuy r4 = r0.zza
            long r5 = r0.zzb
            long r9 = r0.zzd
            long r11 = r0.zze
            boolean r14 = r0.zzg
            boolean r15 = r0.zzh
            boolean r1 = r0.zzi
            com.google.android.gms.internal.ads.zzkv r2 = new com.google.android.gms.internal.ads.zzkv
            r13 = 0
            r3 = r2
            r7 = r18
            r16 = r1
            r3.<init>(r4, r5, r7, r9, r11, r13, r14, r15, r16)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzkv zzb(long r18) {
            r17 = this;
            r0 = r17
            long r1 = r0.zzb
            int r3 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r3 != 0) goto L9
            return r0
        L9:
            com.google.android.gms.internal.ads.zzuy r4 = r0.zza
            long r7 = r0.zzc
            long r9 = r0.zzd
            long r11 = r0.zze
            boolean r14 = r0.zzg
            boolean r15 = r0.zzh
            boolean r1 = r0.zzi
            com.google.android.gms.internal.ads.zzkv r2 = new com.google.android.gms.internal.ads.zzkv
            r13 = 0
            r3 = r2
            r5 = r18
            r16 = r1
            r3.<init>(r4, r5, r7, r9, r11, r13, r14, r15, r16)
            return r2
    }
}
