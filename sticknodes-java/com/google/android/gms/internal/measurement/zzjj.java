package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzjj extends com.google.android.gms.internal.measurement.zzkg {
    private final android.content.Context zza;
    private final com.google.common.base.Supplier zzb;

    zzjj(android.content.Context r1, com.google.common.base.Supplier r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.measurement.zzkg
            r2 = 0
            if (r1 == 0) goto L2e
            com.google.android.gms.internal.measurement.zzkg r5 = (com.google.android.gms.internal.measurement.zzkg) r5
            android.content.Context r1 = r4.zza
            android.content.Context r3 = r5.zza()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2e
            com.google.common.base.Supplier r1 = r4.zzb
            if (r1 != 0) goto L22
            com.google.common.base.Supplier r5 = r5.zzb()
            if (r5 != 0) goto L2e
            goto L2d
        L22:
            com.google.common.base.Supplier r5 = r5.zzb()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L2d
            goto L2e
        L2d:
            return r0
        L2e:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.content.Context r0 = r3.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            com.google.common.base.Supplier r2 = r3.zzb
            if (r2 != 0) goto L10
            r2 = 0
            goto L14
        L10:
            int r2 = r2.hashCode()
        L14:
            int r0 = r0 * r1
            r0 = r0 ^ r2
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            com.google.common.base.Supplier r0 = r4.zzb
            android.content.Context r1 = r4.zza
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "FlagsContext{context="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", hermeticFileOverrides="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "}"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    final android.content.Context zza() {
            r1 = this;
            android.content.Context r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    final com.google.common.base.Supplier zzb() {
            r1 = this;
            com.google.common.base.Supplier r0 = r1.zzb
            return r0
    }
}
