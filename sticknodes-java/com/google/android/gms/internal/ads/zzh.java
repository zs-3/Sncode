package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzh {
    public static final com.google.android.gms.internal.ads.zzh zza = null;
    private com.google.android.gms.internal.ads.zzf zzb;

    static {
            com.google.android.gms.internal.ads.zzh r7 = new com.google.android.gms.internal.ads.zzh
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.internal.ads.zzh.zza = r7
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

    /* synthetic */ zzh(int r1, int r2, int r3, int r4, int r5, com.google.android.gms.internal.ads.zzg r6) {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            if (r4 == 0) goto L12
            java.lang.Class<com.google.android.gms.internal.ads.zzh> r1 = com.google.android.gms.internal.ads.zzh.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto Lf
            goto L12
        Lf:
            com.google.android.gms.internal.ads.zzh r4 = (com.google.android.gms.internal.ads.zzh) r4
            return r0
        L12:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r1 = this;
            r0 = 486696559(0x1d02666f, float:1.7258314E-21)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzf zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzf r0 = r2.zzb
            if (r0 != 0) goto Lc
            com.google.android.gms.internal.ads.zzf r0 = new com.google.android.gms.internal.ads.zzf
            r1 = 0
            r0.<init>(r2, r1)
            r2.zzb = r0
        Lc:
            com.google.android.gms.internal.ads.zzf r0 = r2.zzb
            return r0
    }
}
