package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzav {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final float zzd;
    public final float zze;

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
            return
    }

    /* synthetic */ zzav(com.google.android.gms.internal.ads.zzat r1, com.google.android.gms.internal.ads.zzau r2) {
            r0 = this;
            r0.<init>()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zza = r1
            r0.zzb = r1
            r0.zzc = r1
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r0.zzd = r1
            r0.zze = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.android.gms.internal.ads.zzav
            if (r1 != 0) goto La
            r4 = 0
            return r4
        La:
            com.google.android.gms.internal.ads.zzav r4 = (com.google.android.gms.internal.ads.zzav) r4
            long r1 = r4.zza
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = -9223372034707292159(0x8000000080000001, double:-1.060997896E-314)
            int r1 = (int) r0
            int r0 = r1 * 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r2 = java.lang.Float.floatToIntBits(r1)
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = java.lang.Float.floatToIntBits(r1)
            int r0 = r0 + r1
            return r0
    }
}
