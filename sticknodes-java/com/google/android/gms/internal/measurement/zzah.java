package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzah implements com.google.android.gms.internal.measurement.zzap {
    private final java.lang.Double zza;

    public zzah(java.lang.Double r3) {
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto Le
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            r2.zza = r3
            return
        Le:
            r2.zza = r3
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.measurement.zzah
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.measurement.zzah r2 = (com.google.android.gms.internal.measurement.zzah) r2
            java.lang.Double r0 = r1.zza
            java.lang.Double r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Double r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzi()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String r3, com.google.android.gms.internal.measurement.zzg r4, java.util.List r5) {
            r2 = this;
            java.lang.String r4 = "toString"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L12
            com.google.android.gms.internal.measurement.zzat r3 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r4 = r2.zzi()
            r3.<init>(r4)
            return r3
        L12:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            java.lang.String r1 = r2.zzi()
            r5[r0] = r1
            r0 = 1
            r5[r0] = r3
            java.lang.String r3 = "%s.%s is not a function."
            java.lang.String r3 = java.lang.String.format(r3, r5)
            r4.<init>(r3)
            throw r4
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzah r0 = new com.google.android.gms.internal.measurement.zzah
            java.lang.Double r1 = r2.zza
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
            r6 = this;
            java.lang.Double r0 = r6.zza
            double r1 = r0.doubleValue()
            boolean r1 = java.lang.Double.isNaN(r1)
            r2 = 0
            if (r1 != 0) goto L18
            double r0 = r0.doubleValue()
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L18
            r2 = 1
        L18:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
            r1 = this;
            java.lang.Double r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
            r5 = this;
            java.lang.Double r0 = r5.zza
            double r1 = r0.doubleValue()
            boolean r1 = java.lang.Double.isNaN(r1)
            if (r1 == 0) goto Lf
            java.lang.String r0 = "NaN"
            return r0
        Lf:
            double r1 = r0.doubleValue()
            boolean r1 = java.lang.Double.isInfinite(r1)
            if (r1 == 0) goto L29
            double r0 = r0.doubleValue()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L26
            java.lang.String r0 = "Infinity"
            return r0
        L26:
            java.lang.String r0 = "-Infinity"
            return r0
        L29:
            double r0 = r0.doubleValue()
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            int r1 = r0.signum()
            if (r1 != 0) goto L40
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.BigInteger r1 = java.math.BigInteger.ZERO
            r2 = 0
            r0.<init>(r1, r2)
            goto L44
        L40:
            java.math.BigDecimal r0 = r0.stripTrailingZeros()
        L44:
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "0E0"
            r1.<init>(r2)
            java.math.RoundingMode r2 = java.math.RoundingMode.HALF_UP
            r1.setRoundingMode(r2)
            int r2 = r0.scale()
            if (r2 <= 0) goto L5b
            int r2 = r0.precision()
            goto L5f
        L5b:
            int r2 = r0.scale()
        L5f:
            int r2 = r2 + (-1)
            r1.setMinimumFractionDigits(r2)
            java.lang.String r1 = r1.format(r0)
            java.lang.String r2 = "E"
            int r3 = r1.indexOf(r2)
            if (r3 <= 0) goto L98
            int r3 = r3 + 1
            java.lang.String r3 = r1.substring(r3)
            int r3 = java.lang.Integer.parseInt(r3)
            if (r3 >= 0) goto L7f
            r4 = -7
            if (r3 > r4) goto L85
        L7f:
            if (r3 < 0) goto L8a
            r4 = 21
            if (r3 >= r4) goto L8a
        L85:
            java.lang.String r1 = r0.toPlainString()
            goto L98
        L8a:
            java.lang.String r0 = "E-"
            java.lang.String r3 = "e-"
            java.lang.String r0 = r1.replace(r0, r3)
            java.lang.String r1 = "e+"
            java.lang.String r1 = r0.replace(r2, r1)
        L98:
            return r1
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
            r1 = this;
            r0 = 0
            return r0
    }
}
