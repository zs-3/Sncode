package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgmb extends com.google.android.gms.internal.ads.zzgic {
    private final com.google.android.gms.internal.ads.zzgma zza;

    private zzgmb(com.google.android.gms.internal.ads.zzgma r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzgmb zzc(com.google.android.gms.internal.ads.zzgma r1) {
            com.google.android.gms.internal.ads.zzgmb r0 = new com.google.android.gms.internal.ads.zzgmb
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzgmb
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzgmb r3 = (com.google.android.gms.internal.ads.zzgmb) r3
            com.google.android.gms.internal.ads.zzgma r3 = r3.zza
            com.google.android.gms.internal.ads.zzgma r0 = r2.zza
            if (r3 != r0) goto L10
            r3 = 1
            return r3
        L10:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzgmb> r0 = com.google.android.gms.internal.ads.zzgmb.class
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.google.android.gms.internal.ads.zzgma r0 = r3.zza
            r2 = 1
            r1[r2] = r0
            int r0 = java.util.Objects.hash(r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.internal.ads.zzgma r0 = r3.zza
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "XChaCha20Poly1305 Parameters (variant: "
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
            com.google.android.gms.internal.ads.zzgma r0 = r2.zza
            com.google.android.gms.internal.ads.zzgma r1 = com.google.android.gms.internal.ads.zzgma.zzc
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgma zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgma r0 = r1.zza
            return r0
    }
}
