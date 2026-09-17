package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgoq extends com.google.android.gms.internal.ads.zzghs {
    private final com.google.android.gms.internal.ads.zzgqs zza;

    public zzgoq(com.google.android.gms.internal.ads.zzgqs r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzgoq
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzgoq r4 = (com.google.android.gms.internal.ads.zzgoq) r4
            com.google.android.gms.internal.ads.zzgqs r4 = r4.zza
            com.google.android.gms.internal.ads.zzgqs r0 = r3.zza
            com.google.android.gms.internal.ads.zzgwf r0 = r0.zzc()
            com.google.android.gms.internal.ads.zzgxf r0 = r0.zzg()
            com.google.android.gms.internal.ads.zzgwf r2 = r4.zzc()
            com.google.android.gms.internal.ads.zzgxf r2 = r2.zzg()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L54
            com.google.android.gms.internal.ads.zzgqs r0 = r3.zza
            com.google.android.gms.internal.ads.zzgwf r0 = r0.zzc()
            java.lang.String r0 = r0.zzi()
            com.google.android.gms.internal.ads.zzgwf r2 = r4.zzc()
            java.lang.String r2 = r2.zzi()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L54
            com.google.android.gms.internal.ads.zzgqs r0 = r3.zza
            com.google.android.gms.internal.ads.zzgwf r0 = r0.zzc()
            com.google.android.gms.internal.ads.zzgzs r0 = r0.zzh()
            com.google.android.gms.internal.ads.zzgwf r4 = r4.zzc()
            com.google.android.gms.internal.ads.zzgzs r4 = r4.zzh()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L54
            r4 = 1
            return r4
        L54:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.internal.ads.zzgqs r1 = r4.zza
            com.google.android.gms.internal.ads.zzgwf r2 = r1.zzc()
            r3 = 0
            r0[r3] = r2
            com.google.android.gms.internal.ads.zzgyx r1 = r1.zzd()
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.google.android.gms.internal.ads.zzgqs r2 = r4.zza
            com.google.android.gms.internal.ads.zzgwf r2 = r2.zzc()
            java.lang.String r2 = r2.zzi()
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.internal.ads.zzgqs r2 = r4.zza
            com.google.android.gms.internal.ads.zzgwf r2 = r2.zzc()
            com.google.android.gms.internal.ads.zzgxf r2 = r2.zzg()
            int r2 = r2.ordinal()
            r3 = 1
            if (r2 == r3) goto L35
            if (r2 == r0) goto L32
            r0 = 3
            if (r2 == r0) goto L2f
            r0 = 4
            if (r2 == r0) goto L2c
            java.lang.String r0 = "UNKNOWN"
            goto L37
        L2c:
            java.lang.String r0 = "CRUNCHY"
            goto L37
        L2f:
            java.lang.String r0 = "RAW"
            goto L37
        L32:
            java.lang.String r0 = "LEGACY"
            goto L37
        L35:
            java.lang.String r0 = "TINK"
        L37:
            r1[r3] = r0
            java.lang.String r0 = "(typeUrl=%s, outputPrefixType=%s)"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzghs
    public final boolean zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgqs r0 = r2.zza
            com.google.android.gms.internal.ads.zzgwf r0 = r0.zzc()
            com.google.android.gms.internal.ads.zzgxf r0 = r0.zzg()
            com.google.android.gms.internal.ads.zzgxf r1 = com.google.android.gms.internal.ads.zzgxf.zzd
            if (r0 == r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgqs zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgqs r0 = r1.zza
            return r0
    }
}
