package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgiu extends com.google.android.gms.internal.ads.zzgic {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final com.google.android.gms.internal.ads.zzgis zze;
    private final com.google.android.gms.internal.ads.zzgir zzf;

    /* synthetic */ zzgiu(int r1, int r2, int r3, int r4, com.google.android.gms.internal.ads.zzgis r5, com.google.android.gms.internal.ads.zzgir r6, com.google.android.gms.internal.ads.zzgit r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            return
    }

    public static com.google.android.gms.internal.ads.zzgiq zzf() {
            com.google.android.gms.internal.ads.zzgiq r0 = new com.google.android.gms.internal.ads.zzgiq
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzgiu
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzgiu r4 = (com.google.android.gms.internal.ads.zzgiu) r4
            int r0 = r4.zza
            int r2 = r3.zza
            if (r0 != r2) goto L2e
            int r0 = r4.zzb
            int r2 = r3.zzb
            if (r0 != r2) goto L2e
            int r0 = r4.zzc
            int r2 = r3.zzc
            if (r0 != r2) goto L2e
            int r0 = r4.zzd
            int r2 = r3.zzd
            if (r0 != r2) goto L2e
            com.google.android.gms.internal.ads.zzgis r0 = r4.zze
            com.google.android.gms.internal.ads.zzgis r2 = r3.zze
            if (r0 != r2) goto L2e
            com.google.android.gms.internal.ads.zzgir r4 = r4.zzf
            com.google.android.gms.internal.ads.zzgir r0 = r3.zzf
            if (r4 != r0) goto L2e
            r4 = 1
            return r4
        L2e:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzgiu> r0 = com.google.android.gms.internal.ads.zzgiu.class
            r1 = 7
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = r3.zza
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            r1[r2] = r0
            int r0 = r3.zzb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 2
            r1[r2] = r0
            int r0 = r3.zzc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            r1[r2] = r0
            int r0 = r3.zzd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 4
            r1[r2] = r0
            com.google.android.gms.internal.ads.zzgis r0 = r3.zze
            r2 = 5
            r1[r2] = r0
            com.google.android.gms.internal.ads.zzgir r0 = r3.zzf
            r2 = 6
            r1[r2] = r0
            int r0 = java.util.Objects.hash(r1)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            com.google.android.gms.internal.ads.zzgir r0 = r4.zzf
            com.google.android.gms.internal.ads.zzgis r1 = r4.zze
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AesCtrHmacAead Parameters (variant: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", hashType: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            int r0 = r4.zzc
            r2.append(r0)
            java.lang.String r0 = "-byte IV, and "
            r2.append(r0)
            int r0 = r4.zzd
            r2.append(r0)
            java.lang.String r0 = "-byte tags, and "
            r2.append(r0)
            int r0 = r4.zza
            r2.append(r0)
            java.lang.String r0 = "-byte AES key, and "
            r2.append(r0)
            int r0 = r4.zzb
            r2.append(r0)
            java.lang.String r0 = "-byte HMAC key)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzghs
    public final boolean zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgis r0 = r2.zze
            com.google.android.gms.internal.ads.zzgis r1 = com.google.android.gms.internal.ads.zzgis.zzc
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public final int zzc() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public final int zzd() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public final int zze() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgir zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgir r0 = r1.zzf
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgis zzh() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgis r0 = r1.zze
            return r0
    }
}
