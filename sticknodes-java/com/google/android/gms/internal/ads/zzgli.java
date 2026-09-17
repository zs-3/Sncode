package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgli extends com.google.android.gms.internal.ads.zzgic {
    private final com.google.android.gms.internal.ads.zzglg zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzglf zzc;
    private final com.google.android.gms.internal.ads.zzgic zzd;

    /* synthetic */ zzgli(com.google.android.gms.internal.ads.zzglg r1, java.lang.String r2, com.google.android.gms.internal.ads.zzglf r3, com.google.android.gms.internal.ads.zzgic r4, com.google.android.gms.internal.ads.zzglh r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzgli
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzgli r4 = (com.google.android.gms.internal.ads.zzgli) r4
            com.google.android.gms.internal.ads.zzglf r0 = r4.zzc
            com.google.android.gms.internal.ads.zzglf r2 = r3.zzc
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzgic r0 = r4.zzd
            com.google.android.gms.internal.ads.zzgic r2 = r3.zzd
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L32
            java.lang.String r0 = r4.zzb
            java.lang.String r2 = r3.zzb
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzglg r4 = r4.zza
            com.google.android.gms.internal.ads.zzglg r0 = r3.zza
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L32
            r4 = 1
            return r4
        L32:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzgli> r0 = com.google.android.gms.internal.ads.zzgli.class
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = r3.zzb
            r2 = 1
            r1[r2] = r0
            com.google.android.gms.internal.ads.zzglf r0 = r3.zzc
            r2 = 2
            r1[r2] = r0
            com.google.android.gms.internal.ads.zzgic r0 = r3.zzd
            r2 = 3
            r1[r2] = r0
            com.google.android.gms.internal.ads.zzglg r0 = r3.zza
            r2 = 4
            r1[r2] = r0
            int r0 = java.util.Objects.hash(r1)
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            com.google.android.gms.internal.ads.zzglg r0 = r5.zza
            com.google.android.gms.internal.ads.zzgic r1 = r5.zzd
            com.google.android.gms.internal.ads.zzglf r2 = r5.zzc
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "LegacyKmsEnvelopeAead Parameters (kekUri: "
            r3.append(r4)
            java.lang.String r4 = r5.zzb
            r3.append(r4)
            java.lang.String r4 = ", dekParsingStrategy: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ", dekParametersForNewKeys: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = ", variant: "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzghs
    public final boolean zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzglg r0 = r2.zza
            com.google.android.gms.internal.ads.zzglg r1 = com.google.android.gms.internal.ads.zzglg.zzb
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgic zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgic r0 = r1.zzd
            return r0
    }

    public final com.google.android.gms.internal.ads.zzglg zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzglg r0 = r1.zza
            return r0
    }

    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
