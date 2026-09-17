package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgrt extends com.google.android.gms.internal.ads.zzgsp {
    private final int zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzgrr zzc;

    /* synthetic */ zzgrt(int r1, int r2, com.google.android.gms.internal.ads.zzgrr r3, com.google.android.gms.internal.ads.zzgrs r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzgrq zze() {
            com.google.android.gms.internal.ads.zzgrq r0 = new com.google.android.gms.internal.ads.zzgrq
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzgrt
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzgrt r4 = (com.google.android.gms.internal.ads.zzgrt) r4
            int r0 = r4.zza
            int r2 = r3.zza
            if (r0 != r2) goto L20
            int r0 = r4.zzd()
            int r2 = r3.zzd()
            if (r0 != r2) goto L20
            com.google.android.gms.internal.ads.zzgrr r4 = r4.zzc
            com.google.android.gms.internal.ads.zzgrr r0 = r3.zzc
            if (r4 != r0) goto L20
            r4 = 1
            return r4
        L20:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzgrt> r0 = com.google.android.gms.internal.ads.zzgrt.class
            r1 = 4
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
            com.google.android.gms.internal.ads.zzgrr r0 = r3.zzc
            r2 = 3
            r1[r2] = r0
            int r0 = java.util.Objects.hash(r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.internal.ads.zzgrr r0 = r3.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AES-CMAC Parameters (variant: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            int r0 = r3.zzb
            r1.append(r0)
            java.lang.String r0 = "-byte tags, and "
            r1.append(r0)
            int r0 = r3.zza
            r1.append(r0)
            java.lang.String r0 = "-byte key)"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzghs
    public final boolean zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgrr r0 = r2.zzc
            com.google.android.gms.internal.ads.zzgrr r1 = com.google.android.gms.internal.ads.zzgrr.zzd
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public final int zzc() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public final int zzd() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgrr r0 = r2.zzc
            com.google.android.gms.internal.ads.zzgrr r1 = com.google.android.gms.internal.ads.zzgrr.zzd
            if (r0 != r1) goto L9
            int r0 = r2.zzb
            return r0
        L9:
            com.google.android.gms.internal.ads.zzgrr r1 = com.google.android.gms.internal.ads.zzgrr.zza
            if (r0 != r1) goto Le
            goto L17
        Le:
            com.google.android.gms.internal.ads.zzgrr r1 = com.google.android.gms.internal.ads.zzgrr.zzb
            if (r0 != r1) goto L13
            goto L17
        L13:
            com.google.android.gms.internal.ads.zzgrr r1 = com.google.android.gms.internal.ads.zzgrr.zzc
            if (r0 != r1) goto L1c
        L17:
            int r0 = r2.zzb
            int r0 = r0 + 5
            return r0
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown variant"
            r0.<init>(r1)
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzgrr zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgrr r0 = r1.zzc
            return r0
    }
}
