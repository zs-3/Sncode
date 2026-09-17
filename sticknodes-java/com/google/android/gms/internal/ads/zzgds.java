package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgds implements java.io.Serializable {
    private final int[] zza;
    private final int zzb;

    private zzgds(int[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzgds zzb(int[] r3) {
            int r0 = r3.length
            com.google.android.gms.internal.ads.zzgds r1 = new com.google.android.gms.internal.ads.zzgds
            int[] r3 = java.util.Arrays.copyOf(r3, r0)
            int r0 = r3.length
            r2 = 0
            r1.<init>(r3, r2, r0)
            return r1
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.gms.internal.ads.zzgds
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzgds r6 = (com.google.android.gms.internal.ads.zzgds) r6
            int r1 = r5.zzb
            int r3 = r6.zzb
            if (r1 != r3) goto L26
            r1 = 0
        L13:
            int r3 = r5.zzb
            if (r1 >= r3) goto L25
            int r3 = r5.zza(r1)
            int r4 = r6.zza(r1)
            if (r3 == r4) goto L22
            return r2
        L22:
            int r1 = r1 + 1
            goto L13
        L25:
            return r0
        L26:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r3.zzb
            if (r1 >= r2) goto L10
            int r0 = r0 * 31
            int[] r2 = r3.zza
            r2 = r2[r1]
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L10:
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.zzb
            if (r0 == 0) goto L36
            int r0 = r0 * 5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 91
            r1.append(r0)
            int[] r0 = r3.zza
            r2 = 0
            r0 = r0[r2]
            r1.append(r0)
            r0 = 1
        L19:
            int r2 = r3.zzb
            if (r0 >= r2) goto L2c
            java.lang.String r2 = ", "
            r1.append(r2)
            int[] r2 = r3.zza
            r2 = r2[r0]
            r1.append(r2)
            int r0 = r0 + 1
            goto L19
        L2c:
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L36:
            java.lang.String r0 = "[]"
            return r0
    }

    public final int zza(int r3) {
            r2 = this;
            int r0 = r2.zzb
            java.lang.String r1 = "index"
            com.google.android.gms.internal.ads.zzfxz.zza(r3, r0, r1)
            int[] r0 = r2.zza
            r3 = r0[r3]
            return r3
    }
}
