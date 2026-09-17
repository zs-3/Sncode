package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzel {
    public static final com.google.android.gms.internal.ads.zzel zza = null;
    private final int zzb;
    private final int zzc;

    static {
            com.google.android.gms.internal.ads.zzel r0 = new com.google.android.gms.internal.ads.zzel
            r1 = -1
            r0.<init>(r1, r1)
            com.google.android.gms.internal.ads.zzel.zza = r0
            com.google.android.gms.internal.ads.zzel r0 = new com.google.android.gms.internal.ads.zzel
            r1 = 0
            r0.<init>(r1, r1)
            return
    }

    public zzel(int r4, int r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r1 = 1
            r2 = -1
            if (r4 == r2) goto La
            if (r4 < 0) goto Lf
        La:
            if (r5 == r2) goto Le
            if (r5 < 0) goto Lf
        Le:
            r0 = 1
        Lf:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r3.zzb = r4
            r3.zzc = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r4 != r5) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.ads.zzel
            if (r2 == 0) goto L1b
            com.google.android.gms.internal.ads.zzel r5 = (com.google.android.gms.internal.ads.zzel) r5
            int r2 = r4.zzb
            int r3 = r5.zzb
            if (r2 != r3) goto L1b
            int r2 = r4.zzc
            int r5 = r5.zzc
            if (r2 != r5) goto L1b
            return r1
        L1b:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.zzb
            int r1 = r0 << 16
            int r0 = r0 >>> 16
            int r2 = r3.zzc
            r0 = r0 | r1
            r0 = r0 ^ r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            int r1 = r2.zzc
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }
}
