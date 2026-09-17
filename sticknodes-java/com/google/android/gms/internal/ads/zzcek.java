package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcek implements com.google.android.gms.internal.ads.zzgg {
    private final com.google.android.gms.internal.ads.zzgg zza;
    private final long zzb;
    private final com.google.android.gms.internal.ads.zzgg zzc;
    private long zzd;
    private android.net.Uri zze;

    zzcek(com.google.android.gms.internal.ads.zzgg r1, int r2, com.google.android.gms.internal.ads.zzgg r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            long r1 = (long) r2
            r0.zzb = r1
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r9, int r10, int r11) throws java.io.IOException {
            r8 = this;
            long r0 = r8.zzd
            long r2 = r8.zzb
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1f
            long r4 = (long) r11
            long r2 = r2 - r0
            long r0 = java.lang.Math.min(r4, r2)
            int r1 = (int) r0
            com.google.android.gms.internal.ads.zzgg r0 = r8.zza
            int r0 = r0.zza(r9, r10, r1)
            long r1 = r8.zzd
            long r3 = (long) r0
            long r1 = r1 + r3
            r8.zzd = r1
            r6 = r1
            r2 = r0
            r0 = r6
            goto L20
        L1f:
            r2 = 0
        L20:
            long r3 = r8.zzb
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L35
            int r11 = r11 - r2
            com.google.android.gms.internal.ads.zzgg r0 = r8.zzc
            int r10 = r10 + r2
            int r9 = r0.zza(r9, r10, r11)
            int r2 = r2 + r9
            long r10 = r8.zzd
            long r0 = (long) r9
            long r10 = r10 + r0
            r8.zzd = r10
        L35:
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r21) throws java.io.IOException {
            r20 = this;
            r0 = r20
            r1 = r21
            android.net.Uri r2 = r1.zza
            r0.zze = r2
            long r5 = r1.zze
            long r2 = r0.zzb
            r10 = 0
            r11 = -1
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 < 0) goto L15
            r2 = r10
            goto L2a
        L15:
            long r7 = r1.zzf
            long r2 = r2 - r5
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 == 0) goto L20
            long r2 = java.lang.Math.min(r7, r2)
        L20:
            r7 = r2
            com.google.android.gms.internal.ads.zzgm r2 = new com.google.android.gms.internal.ads.zzgm
            android.net.Uri r4 = r1.zza
            r9 = 0
            r3 = r2
            r3.<init>(r4, r5, r7, r9)
        L2a:
            long r3 = r1.zzf
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 == 0) goto L3a
            long r5 = r1.zze
            long r5 = r5 + r3
            long r3 = r0.zzb
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 > 0) goto L3a
            goto L61
        L3a:
            long r3 = r0.zzb
            long r5 = r1.zze
            long r15 = java.lang.Math.max(r3, r5)
            long r3 = r1.zzf
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 == 0) goto L55
            long r5 = r1.zze
            long r5 = r5 + r3
            long r7 = r0.zzb
            long r5 = r5 - r7
            long r3 = java.lang.Math.min(r3, r5)
            r17 = r3
            goto L57
        L55:
            r17 = r11
        L57:
            com.google.android.gms.internal.ads.zzgm r10 = new com.google.android.gms.internal.ads.zzgm
            android.net.Uri r14 = r1.zza
            r19 = 0
            r13 = r10
            r13.<init>(r14, r15, r17, r19)
        L61:
            r3 = 0
            if (r2 == 0) goto L6c
            com.google.android.gms.internal.ads.zzgg r5 = r0.zza
            long r5 = r5.zzb(r2)
            goto L6d
        L6c:
            r5 = r3
        L6d:
            if (r10 == 0) goto L75
            com.google.android.gms.internal.ads.zzgg r2 = r0.zzc
            long r3 = r2.zzb(r10)
        L75:
            long r1 = r1.zze
            r0.zzd = r1
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 == 0) goto L84
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 != 0) goto L82
            goto L84
        L82:
            long r5 = r5 + r3
            return r5
        L84:
            return r11
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            android.net.Uri r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzgg r0 = r1.zza
            r0.zzd()
            com.google.android.gms.internal.ads.zzgg r0 = r1.zzc
            r0.zzd()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final java.util.Map zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgba r0 = com.google.android.gms.internal.ads.zzgba.zzd()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzf(com.google.android.gms.internal.ads.zzhh r1) {
            r0 = this;
            return
    }
}
