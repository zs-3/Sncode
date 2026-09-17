package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzaf implements com.google.android.gms.internal.measurement.zzap {
    private final boolean zza;

    public zzaf(java.lang.Boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L9
            r1 = 0
        L6:
            r0.zza = r1
            return
        L9:
            boolean r1 = r1.booleanValue()
            goto L6
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.android.gms.internal.measurement.zzaf
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.measurement.zzaf r4 = (com.google.android.gms.internal.measurement.zzaf) r4
            boolean r1 = r3.zza
            boolean r4 = r4.zza
            if (r1 != r4) goto L13
            return r0
        L13:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.zza
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.zza
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String r3, com.google.android.gms.internal.measurement.zzg r4, java.util.List r5) {
            r2 = this;
            java.lang.String r4 = "toString"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L14
            boolean r3 = r2.zza
            com.google.android.gms.internal.measurement.zzat r4 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r3 = java.lang.Boolean.toString(r3)
            r4.<init>(r3)
            return r4
        L14:
            boolean r4 = r2.zza
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r4 = java.lang.Boolean.toString(r4)
            r0[r1] = r4
            r4 = 1
            r0[r4] = r3
            java.lang.String r3 = "%s.%s is not a function."
            java.lang.String r3 = java.lang.String.format(r3, r0)
            r5.<init>(r3)
            throw r5
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
            r2 = this;
            boolean r0 = r2.zza
            com.google.android.gms.internal.measurement.zzaf r1 = new com.google.android.gms.internal.measurement.zzaf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.<init>(r0)
            return r1
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
            r1 = this;
            boolean r0 = r1.zza
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
            r2 = this;
            boolean r0 = r2.zza
            r1 = 1
            if (r1 == r0) goto L8
            r0 = 0
            goto La
        L8:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        La:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
            r1 = this;
            boolean r0 = r1.zza
            java.lang.String r0 = java.lang.Boolean.toString(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
            r1 = this;
            r0 = 0
            return r0
    }
}
