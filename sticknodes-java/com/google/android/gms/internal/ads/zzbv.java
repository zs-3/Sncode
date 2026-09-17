package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbv {
    public final java.lang.Object zza;
    public final int zzb;
    public final com.google.android.gms.internal.ads.zzbc zzc;
    public final java.lang.Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

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
            return
    }

    public zzbv(java.lang.Object r1, int r2, com.google.android.gms.internal.ads.zzbc r3, java.lang.Object r4, int r5, long r6, long r8, int r10, int r11) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r8
            r0.zzh = r10
            r0.zzi = r11
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L59
            java.lang.Class<com.google.android.gms.internal.ads.zzbv> r2 = com.google.android.gms.internal.ads.zzbv.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L59
        L10:
            com.google.android.gms.internal.ads.zzbv r8 = (com.google.android.gms.internal.ads.zzbv) r8
            int r2 = r7.zzb
            int r3 = r8.zzb
            if (r2 != r3) goto L59
            int r2 = r7.zze
            int r3 = r8.zze
            if (r2 != r3) goto L59
            long r2 = r7.zzf
            long r4 = r8.zzf
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L59
            long r2 = r7.zzg
            long r4 = r8.zzg
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L59
            int r2 = r7.zzh
            int r3 = r8.zzh
            if (r2 != r3) goto L59
            int r2 = r7.zzi
            int r3 = r8.zzi
            if (r2 != r3) goto L59
            com.google.android.gms.internal.ads.zzbc r2 = r7.zzc
            com.google.android.gms.internal.ads.zzbc r3 = r8.zzc
            boolean r2 = com.google.android.gms.internal.ads.zzfxw.zza(r2, r3)
            if (r2 == 0) goto L59
            java.lang.Object r2 = r7.zza
            java.lang.Object r3 = r8.zza
            boolean r2 = com.google.android.gms.internal.ads.zzfxw.zza(r2, r3)
            if (r2 == 0) goto L59
            java.lang.Object r2 = r7.zzd
            java.lang.Object r8 = r8.zzd
            boolean r8 = com.google.android.gms.internal.ads.zzfxw.zza(r2, r8)
            if (r8 == 0) goto L59
            return r0
        L59:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 9
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            int r1 = r3.zzb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            com.google.android.gms.internal.ads.zzbc r1 = r3.zzc
            r2 = 2
            r0[r2] = r1
            java.lang.Object r1 = r3.zzd
            r2 = 3
            r0[r2] = r1
            int r1 = r3.zze
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            long r1 = r3.zzf
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            long r1 = r3.zzg
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            int r1 = r3.zzh
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 7
            r0[r2] = r1
            int r1 = r3.zzi
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 8
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
