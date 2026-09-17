package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzmb {
    public final long zza;
    public final com.google.android.gms.internal.ads.zzcc zzb;
    public final int zzc;
    public final com.google.android.gms.internal.ads.zzuy zzd;
    public final long zze;
    public final com.google.android.gms.internal.ads.zzcc zzf;
    public final int zzg;
    public final com.google.android.gms.internal.ads.zzuy zzh;
    public final long zzi;
    public final long zzj;

    public zzmb(long r1, com.google.android.gms.internal.ads.zzcc r3, int r4, com.google.android.gms.internal.ads.zzuy r5, long r6, com.google.android.gms.internal.ads.zzcc r8, int r9, com.google.android.gms.internal.ads.zzuy r10, long r11, long r13) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r6
            r0.zzf = r8
            r0.zzg = r9
            r0.zzh = r10
            r0.zzi = r11
            r0.zzj = r13
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L67
            java.lang.Class<com.google.android.gms.internal.ads.zzmb> r2 = com.google.android.gms.internal.ads.zzmb.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L67
        L10:
            com.google.android.gms.internal.ads.zzmb r8 = (com.google.android.gms.internal.ads.zzmb) r8
            long r2 = r7.zza
            long r4 = r8.zza
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L67
            int r2 = r7.zzc
            int r3 = r8.zzc
            if (r2 != r3) goto L67
            long r2 = r7.zze
            long r4 = r8.zze
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L67
            int r2 = r7.zzg
            int r3 = r8.zzg
            if (r2 != r3) goto L67
            long r2 = r7.zzi
            long r4 = r8.zzi
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L67
            long r2 = r7.zzj
            long r4 = r8.zzj
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L67
            com.google.android.gms.internal.ads.zzcc r2 = r7.zzb
            com.google.android.gms.internal.ads.zzcc r3 = r8.zzb
            boolean r2 = com.google.android.gms.internal.ads.zzfxw.zza(r2, r3)
            if (r2 == 0) goto L67
            com.google.android.gms.internal.ads.zzuy r2 = r7.zzd
            com.google.android.gms.internal.ads.zzuy r3 = r8.zzd
            boolean r2 = com.google.android.gms.internal.ads.zzfxw.zza(r2, r3)
            if (r2 == 0) goto L67
            com.google.android.gms.internal.ads.zzcc r2 = r7.zzf
            com.google.android.gms.internal.ads.zzcc r3 = r8.zzf
            boolean r2 = com.google.android.gms.internal.ads.zzfxw.zza(r2, r3)
            if (r2 == 0) goto L67
            com.google.android.gms.internal.ads.zzuy r2 = r7.zzh
            com.google.android.gms.internal.ads.zzuy r8 = r8.zzh
            boolean r8 = com.google.android.gms.internal.ads.zzfxw.zza(r2, r8)
            if (r8 == 0) goto L67
            return r0
        L67:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 10
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.zza
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.internal.ads.zzcc r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            int r1 = r3.zzc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            com.google.android.gms.internal.ads.zzuy r1 = r3.zzd
            r2 = 3
            r0[r2] = r1
            long r1 = r3.zze
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            com.google.android.gms.internal.ads.zzcc r1 = r3.zzf
            r2 = 5
            r0[r2] = r1
            int r1 = r3.zzg
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            com.google.android.gms.internal.ads.zzuy r1 = r3.zzh
            r2 = 7
            r0[r2] = r1
            long r1 = r3.zzi
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 8
            r0[r2] = r1
            long r1 = r3.zzj
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 9
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
