package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzglc extends com.google.android.gms.internal.ads.zzgib {
    private final com.google.android.gms.internal.ads.zzgli zza;
    private final com.google.android.gms.internal.ads.zzgyx zzb;
    private final java.lang.Integer zzc;

    private zzglc(com.google.android.gms.internal.ads.zzgli r1, com.google.android.gms.internal.ads.zzgyx r2, java.lang.Integer r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzglc zza(com.google.android.gms.internal.ads.zzgli r2, java.lang.Integer r3) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzglg r0 = r2.zzc()
            com.google.android.gms.internal.ads.zzglg r1 = com.google.android.gms.internal.ads.zzglg.zzb
            if (r0 != r1) goto L15
            if (r3 != 0) goto Ld
            com.google.android.gms.internal.ads.zzgyx r0 = com.google.android.gms.internal.ads.zzgpr.zza
            goto L27
        Ld:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "For given Variant NO_PREFIX the value of idRequirement must be null"
            r2.<init>(r3)
            throw r2
        L15:
            com.google.android.gms.internal.ads.zzglg r0 = r2.zzc()
            com.google.android.gms.internal.ads.zzglg r1 = com.google.android.gms.internal.ads.zzglg.zza
            if (r0 != r1) goto L35
            if (r3 == 0) goto L2d
            int r0 = r3.intValue()
            com.google.android.gms.internal.ads.zzgyx r0 = com.google.android.gms.internal.ads.zzgpr.zzb(r0)
        L27:
            com.google.android.gms.internal.ads.zzglc r1 = new com.google.android.gms.internal.ads.zzglc
            r1.<init>(r2, r0, r3)
            return r1
        L2d:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "For given Variant TINK the value of idRequirement must be non-null"
            r2.<init>(r3)
            throw r2
        L35:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            com.google.android.gms.internal.ads.zzglg r2 = r2.zzc()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Unknown Variant: "
            java.lang.String r2 = r0.concat(r2)
            r3.<init>(r2)
            throw r3
    }

    public final com.google.android.gms.internal.ads.zzgli zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgli r0 = r1.zza
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgyx zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgyx r0 = r1.zzb
            return r0
    }

    public final java.lang.Integer zzd() {
            r1 = this;
            java.lang.Integer r0 = r1.zzc
            return r0
    }
}
