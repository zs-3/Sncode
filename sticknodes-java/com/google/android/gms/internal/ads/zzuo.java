package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzuo implements com.google.android.gms.internal.ads.zzgg {
    private final com.google.android.gms.internal.ads.zzgg zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzun zzc;
    private final byte[] zzd;
    private int zze;

    public zzuo(com.google.android.gms.internal.ads.zzgg r3, int r4, com.google.android.gms.internal.ads.zzun r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            if (r4 <= 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            com.google.android.gms.internal.ads.zzdi.zzd(r1)
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            byte[] r3 = new byte[r0]
            r2.zzd = r3
            r2.zze = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            int r0 = r6.zze
            r1 = -1
            if (r0 != 0) goto L48
            com.google.android.gms.internal.ads.zzgg r0 = r6.zza
            byte[] r2 = r6.zzd
            r3 = 1
            r4 = 0
            int r0 = r0.zza(r2, r4, r3)
            if (r0 != r1) goto L12
            goto L2d
        L12:
            byte[] r0 = r6.zzd
            r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 4
            if (r0 != 0) goto L1d
            goto L44
        L1d:
            byte[] r2 = new byte[r0]
            r3 = r0
        L20:
            if (r3 <= 0) goto L2e
            com.google.android.gms.internal.ads.zzgg r5 = r6.zza
            int r5 = r5.zza(r2, r4, r3)
            if (r5 == r1) goto L2d
            int r4 = r4 + r5
            int r3 = r3 - r5
            goto L20
        L2d:
            return r1
        L2e:
            if (r0 <= 0) goto L38
            int r3 = r0 + (-1)
            r4 = r2[r3]
            if (r4 != 0) goto L38
            r0 = r3
            goto L2e
        L38:
            if (r0 <= 0) goto L44
            com.google.android.gms.internal.ads.zzun r3 = r6.zzc
            com.google.android.gms.internal.ads.zzek r4 = new com.google.android.gms.internal.ads.zzek
            r4.<init>(r2, r0)
            r3.zza(r4)
        L44:
            int r0 = r6.zzb
            r6.zze = r0
        L48:
            com.google.android.gms.internal.ads.zzgg r2 = r6.zza
            int r9 = java.lang.Math.min(r0, r9)
            int r7 = r2.zza(r7, r8, r9)
            if (r7 == r1) goto L59
            int r8 = r6.zze
            int r8 = r8 - r7
            r6.zze = r8
        L59:
            return r7
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgg r0 = r1.zza
            android.net.Uri r0 = r0.zzc()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final java.util.Map zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgg r0 = r1.zza
            java.util.Map r0 = r0.zze()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzf(com.google.android.gms.internal.ads.zzhh r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzgg r0 = r1.zza
            r0.zzf(r2)
            return
    }
}
