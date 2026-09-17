package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgkw extends com.google.android.gms.internal.ads.zzgic {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzgkv zzb;

    private zzgkw(java.lang.String r1, com.google.android.gms.internal.ads.zzgkv r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzgkw zzc(java.lang.String r1, com.google.android.gms.internal.ads.zzgkv r2) {
            com.google.android.gms.internal.ads.zzgkw r0 = new com.google.android.gms.internal.ads.zzgkw
            r0.<init>(r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzgkw
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzgkw r4 = (com.google.android.gms.internal.ads.zzgkw) r4
            java.lang.String r0 = r4.zza
            java.lang.String r2 = r3.zza
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            com.google.android.gms.internal.ads.zzgkv r4 = r4.zzb
            com.google.android.gms.internal.ads.zzgkv r0 = r3.zzb
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzgkw> r0 = com.google.android.gms.internal.ads.zzgkw.class
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = r3.zza
            r2 = 1
            r1[r2] = r0
            com.google.android.gms.internal.ads.zzgkv r0 = r3.zzb
            r2 = 2
            r1[r2] = r0
            int r0 = java.util.Objects.hash(r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.internal.ads.zzgkv r0 = r3.zzb
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LegacyKmsAead Parameters (keyUri: "
            r1.append(r2)
            java.lang.String r2 = r3.zza
            r1.append(r2)
            java.lang.String r2 = ", variant: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzghs
    public final boolean zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgkv r0 = r2.zzb
            com.google.android.gms.internal.ads.zzgkv r1 = com.google.android.gms.internal.ads.zzgkv.zzb
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgkv zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgkv r0 = r1.zzb
            return r0
    }

    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }
}
