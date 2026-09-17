package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcp {
    public static final com.google.android.gms.internal.ads.zzcp zza = null;
    public final int zzb;
    public final int zzc;
    public final float zzd;

    static {
            com.google.android.gms.internal.ads.zzcp r0 = new com.google.android.gms.internal.ads.zzcp
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r2)
            com.google.android.gms.internal.ads.zzcp.zza = r0
            r0 = 36
            java.lang.Integer.toString(r1, r0)
            r1 = 1
            java.lang.Integer.toString(r1, r0)
            r1 = 3
            java.lang.Integer.toString(r1, r0)
            return
    }

    public zzcp(int r1, int r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzcp
            r2 = 0
            if (r1 == 0) goto L20
            com.google.android.gms.internal.ads.zzcp r5 = (com.google.android.gms.internal.ads.zzcp) r5
            int r1 = r4.zzb
            int r3 = r5.zzb
            if (r1 != r3) goto L20
            int r1 = r4.zzc
            int r3 = r5.zzc
            if (r1 != r3) goto L20
            float r1 = r4.zzd
            float r5 = r5.zzd
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L20
            return r0
        L20:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.zzb
            int r0 = r0 + 217
            float r1 = r3.zzd
            int r0 = r0 * 31
            int r2 = r3.zzc
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            int r0 = r0 + r1
            return r0
    }
}
