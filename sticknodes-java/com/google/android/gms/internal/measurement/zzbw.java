package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzbw extends com.google.android.gms.internal.measurement.zzcc {
    private final java.lang.String zzc;
    private final int zzd;
    private final int zze;

    /* synthetic */ zzbw(java.lang.String r1, boolean r2, int r3, com.google.android.gms.internal.measurement.zzbs r4, com.google.android.gms.internal.measurement.zzbt r5, int r6, com.google.android.gms.internal.measurement.zzbv r7) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzd = r3
            r0.zze = r6
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.gms.internal.measurement.zzcc
            r2 = 0
            if (r1 == 0) goto L38
            com.google.android.gms.internal.measurement.zzcc r6 = (com.google.android.gms.internal.measurement.zzcc) r6
            java.lang.String r1 = r5.zzc
            java.lang.String r3 = r6.zzc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
            r6.zzd()
            int r1 = r5.zzd
            int r3 = r6.zze()
            r4 = 0
            if (r1 == 0) goto L37
            if (r1 != r3) goto L38
            r6.zza()
            r6.zzb()
            int r1 = r5.zze
            int r6 = r6.zzf()
            if (r1 == 0) goto L36
            if (r6 != r0) goto L38
            return r0
        L36:
            throw r4
        L37:
            throw r4
        L38:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.zzc
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r2 = r4.zzd
            r3 = 0
            if (r2 == 0) goto L23
            int r0 = r0 * r1
            r0 = r0 ^ 1237(0x4d5, float:1.733E-42)
            int r0 = r0 * r1
            r0 = r0 ^ r2
            int r1 = r4.zze
            if (r1 == 0) goto L22
            r1 = 583896283(0x22cd8cdb, float:5.5714498E-18)
            int r0 = r0 * r1
            r0 = r0 ^ 1
            return r0
        L22:
            throw r3
        L23:
            throw r3
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.zzd
            java.lang.String r1 = "null"
            r2 = 1
            if (r0 == r2) goto L1b
            r3 = 2
            if (r0 == r3) goto L18
            r3 = 3
            if (r0 == r3) goto L15
            r3 = 4
            if (r0 == r3) goto L12
            r0 = r1
            goto L1d
        L12:
            java.lang.String r0 = "NO_CHECKS"
            goto L1d
        L15:
            java.lang.String r0 = "SKIP_SECURITY_CHECK"
            goto L1d
        L18:
            java.lang.String r0 = "SKIP_COMPLIANCE_CHECK"
            goto L1d
        L1b:
            java.lang.String r0 = "ALL_CHECKS"
        L1d:
            int r3 = r5.zze
            if (r3 == r2) goto L22
            goto L24
        L22:
            java.lang.String r1 = "READ_AND_WRITE"
        L24:
            java.lang.String r2 = r5.zzc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "FileComplianceOptions{fileOwner="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ", hasDifferentDmaOwner=false, fileChecks="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "}"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final com.google.android.gms.internal.measurement.zzbs zza() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final com.google.android.gms.internal.measurement.zzbt zzb() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final boolean zzd() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final int zze() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final int zzf() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }
}
