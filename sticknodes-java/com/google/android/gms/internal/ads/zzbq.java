package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbq {
    public static final com.google.android.gms.internal.ads.zzbq zza = null;
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
            com.google.android.gms.internal.ads.zzbq r0 = new com.google.android.gms.internal.ads.zzbq
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1)
            com.google.android.gms.internal.ads.zzbq.zza = r0
            r0 = 0
            r1 = 36
            java.lang.Integer.toString(r0, r1)
            r0 = 1
            java.lang.Integer.toString(r0, r1)
            return
    }

    public zzbq(float r5, float r6) {
            r4 = this;
            r4.<init>()
            r0 = 1
            r1 = 0
            r2 = 0
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 <= 0) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            com.google.android.gms.internal.ads.zzdi.zzd(r3)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r4.zzb = r5
            r4.zzc = r6
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            r4.zzd = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L23
            java.lang.Class<com.google.android.gms.internal.ads.zzbq> r2 = com.google.android.gms.internal.ads.zzbq.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L23
        L10:
            com.google.android.gms.internal.ads.zzbq r5 = (com.google.android.gms.internal.ads.zzbq) r5
            float r2 = r4.zzb
            float r3 = r5.zzb
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L23
            float r2 = r4.zzc
            float r5 = r5.zzc
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L23
            return r0
        L23:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.zzb
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            int r0 = r0 + 527
            float r1 = r2.zzc
            int r0 = r0 * 31
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            float r1 = r3.zzb
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            float r1 = r3.zzc
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "PlaybackParameters(speed=%.2f, pitch=%.2f)"
            java.lang.String r0 = java.lang.String.format(r1, r2, r0)
            return r0
    }

    public final long zza(long r3) {
            r2 = this;
            int r0 = r2.zzd
            long r0 = (long) r0
            long r3 = r3 * r0
            return r3
    }
}
