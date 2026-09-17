package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzan implements com.google.android.gms.internal.measurement.zzap {
    public zzan() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L4
            r1 = 1
            return r1
        L4:
            boolean r1 = r1 instanceof com.google.android.gms.internal.measurement.zzan
            return r1
    }

    public final int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String r2, com.google.android.gms.internal.measurement.zzg r3, java.util.List r4) {
            r1 = this;
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r2
            java.lang.String r2 = "null has no function %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r3.<init>(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzg
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
            r2 = this;
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
            r1 = this;
            java.lang.String r0 = "null"
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
            r1 = this;
            r0 = 0
            return r0
    }
}
