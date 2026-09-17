package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbe {
    public final java.lang.String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbe(java.lang.String r1, double r2, double r4, double r6, int r8) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzc = r2
            r0.zzb = r4
            r0.zzd = r6
            r0.zze = r8
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.ads.internal.util.zzbe
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.ads.internal.util.zzbe r7 = (com.google.android.gms.ads.internal.util.zzbe) r7
            java.lang.String r0 = r6.zza
            java.lang.String r2 = r7.zza
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L34
            double r2 = r6.zzb
            double r4 = r7.zzb
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L34
            double r2 = r6.zzc
            double r4 = r7.zzc
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L34
            int r0 = r6.zze
            int r2 = r7.zze
            if (r0 != r2) goto L34
            double r2 = r6.zzd
            double r4 = r7.zzd
            int r7 = java.lang.Double.compare(r2, r4)
            if (r7 != 0) goto L34
            r7 = 1
            return r7
        L34:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.zza
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            double r2 = r4.zzb
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r2 = 1
            r1[r2] = r0
            double r2 = r4.zzc
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r2 = 2
            r1[r2] = r0
            double r2 = r4.zzd
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r2 = 3
            r1[r2] = r0
            int r0 = r4.zze
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 4
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = r3.zza
            java.lang.String r2 = "name"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            double r1 = r3.zzc
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.String r2 = "minBound"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            double r1 = r3.zzb
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.String r2 = "maxBound"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            double r1 = r3.zzd
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.String r2 = "percent"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            int r1 = r3.zze
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "count"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
