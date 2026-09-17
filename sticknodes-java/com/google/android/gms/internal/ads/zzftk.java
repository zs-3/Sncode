package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzftk extends com.google.android.gms.internal.ads.zzftr {
    private final java.lang.String zzb;
    private final boolean zzc;
    private final int zzd;

    /* synthetic */ zzftk(java.lang.String r1, boolean r2, boolean r3, com.google.android.gms.internal.ads.zzftg r4, com.google.android.gms.internal.ads.zzfth r5, int r6, com.google.android.gms.internal.ads.zzftj r7) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r3
            r0.zzd = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzftr
            r2 = 0
            if (r1 == 0) goto L35
            com.google.android.gms.internal.ads.zzftr r5 = (com.google.android.gms.internal.ads.zzftr) r5
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zzc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            r5.zzd()
            boolean r1 = r4.zzc
            boolean r3 = r5.zze()
            if (r1 != r3) goto L35
            r5.zza()
            r5.zzb()
            int r1 = r4.zzd
            int r5 = r5.zzf()
            if (r1 == 0) goto L33
            if (r5 != r0) goto L35
            return r0
        L33:
            r5 = 0
            throw r5
        L35:
            return r2
    }

    public final int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.zzb
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r2 = r5.zzd
            if (r2 == 0) goto L27
            int r0 = r0 * r1
            boolean r2 = r5.zzc
            r3 = 1237(0x4d5, float:1.733E-42)
            r4 = 1
            if (r4 == r2) goto L1a
            r2 = 1237(0x4d5, float:1.733E-42)
            goto L1c
        L1a:
            r2 = 1231(0x4cf, float:1.725E-42)
        L1c:
            r0 = r0 ^ r3
            int r0 = r0 * r1
            r0 = r0 ^ r2
            r1 = 583896283(0x22cd8cdb, float:5.5714498E-18)
            int r0 = r0 * r1
            r0 = r0 ^ r4
            return r0
        L27:
            r0 = 0
            throw r0
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.zzd
            r1 = 1
            if (r0 == r1) goto L8
            java.lang.String r0 = "null"
            goto La
        L8:
            java.lang.String r0 = "READ_AND_WRITE"
        La:
            boolean r1 = r5.zzc
            java.lang.String r2 = r5.zzb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "FileComplianceOptions{fileOwner="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ", hasDifferentDmaOwner=false, skipChecks="
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose="
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = "}"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final com.google.android.gms.internal.ads.zzftg zza() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final com.google.android.gms.internal.ads.zzfth zzb() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final boolean zzd() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final boolean zze() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final int zzf() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }
}
