package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgkg extends com.google.android.gms.internal.ads.zzgic {
    private final int zza;
    private final com.google.android.gms.internal.ads.zzgke zzb;

    /* synthetic */ zzgkg(int r1, com.google.android.gms.internal.ads.zzgke r2, com.google.android.gms.internal.ads.zzgkf r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzgkd zzc() {
            com.google.android.gms.internal.ads.zzgkd r0 = new com.google.android.gms.internal.ads.zzgkd
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzgkg
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzgkg r4 = (com.google.android.gms.internal.ads.zzgkg) r4
            int r0 = r4.zza
            int r2 = r3.zza
            if (r0 != r2) goto L16
            com.google.android.gms.internal.ads.zzgke r4 = r4.zzb
            com.google.android.gms.internal.ads.zzgke r0 = r3.zzb
            if (r4 != r0) goto L16
            r4 = 1
            return r4
        L16:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzgkg> r0 = com.google.android.gms.internal.ads.zzgkg.class
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = r3.zza
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            r1[r2] = r0
            com.google.android.gms.internal.ads.zzgke r0 = r3.zzb
            r2 = 2
            r1[r2] = r0
            int r0 = java.util.Objects.hash(r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.internal.ads.zzgke r0 = r3.zzb
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AesGcmSiv Parameters (variant: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", "
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
            com.google.android.gms.internal.ads.zzgke r0 = r2.zzb
            com.google.android.gms.internal.ads.zzgke r1 = com.google.android.gms.internal.ads.zzgke.zzc
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

    public final com.google.android.gms.internal.ads.zzgke zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgke r0 = r1.zzb
            return r0
    }
}
