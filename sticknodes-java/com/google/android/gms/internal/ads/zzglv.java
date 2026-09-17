package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzglv extends com.google.android.gms.internal.ads.zzgib {
    private final com.google.android.gms.internal.ads.zzgmb zza;
    private final com.google.android.gms.internal.ads.zzgyy zzb;
    private final com.google.android.gms.internal.ads.zzgyx zzc;
    private final java.lang.Integer zzd;

    private zzglv(com.google.android.gms.internal.ads.zzgmb r1, com.google.android.gms.internal.ads.zzgyy r2, com.google.android.gms.internal.ads.zzgyx r3, java.lang.Integer r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public static com.google.android.gms.internal.ads.zzglv zza(com.google.android.gms.internal.ads.zzgma r3, com.google.android.gms.internal.ads.zzgyy r4, java.lang.Integer r5) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgma r0 = com.google.android.gms.internal.ads.zzgma.zzc
            if (r3 == r0) goto L27
            if (r5 == 0) goto L7
            goto L27
        L7:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "For given Variant "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = " the value of idRequirement must be non-null"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L27:
            if (r3 != r0) goto L34
            if (r5 != 0) goto L2c
            goto L34
        L2c:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "For given Variant NO_PREFIX the value of idRequirement must be null"
            r3.<init>(r4)
            throw r3
        L34:
            int r1 = r4.zza()
            r2 = 32
            if (r1 != r2) goto L84
            com.google.android.gms.internal.ads.zzgmb r3 = com.google.android.gms.internal.ads.zzgmb.zzc(r3)
            com.google.android.gms.internal.ads.zzglv r1 = new com.google.android.gms.internal.ads.zzglv
            com.google.android.gms.internal.ads.zzgma r2 = r3.zzb()
            if (r2 != r0) goto L4b
            com.google.android.gms.internal.ads.zzgyx r0 = com.google.android.gms.internal.ads.zzgpr.zza
            goto L6c
        L4b:
            com.google.android.gms.internal.ads.zzgma r0 = r3.zzb()
            com.google.android.gms.internal.ads.zzgma r2 = com.google.android.gms.internal.ads.zzgma.zzb
            if (r0 != r2) goto L5c
            int r0 = r5.intValue()
            com.google.android.gms.internal.ads.zzgyx r0 = com.google.android.gms.internal.ads.zzgpr.zza(r0)
            goto L6c
        L5c:
            com.google.android.gms.internal.ads.zzgma r0 = r3.zzb()
            com.google.android.gms.internal.ads.zzgma r2 = com.google.android.gms.internal.ads.zzgma.zza
            if (r0 != r2) goto L70
            int r0 = r5.intValue()
            com.google.android.gms.internal.ads.zzgyx r0 = com.google.android.gms.internal.ads.zzgpr.zzb(r0)
        L6c:
            r1.<init>(r3, r4, r0, r5)
            return r1
        L70:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            com.google.android.gms.internal.ads.zzgma r3 = r3.zzb()
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "Unknown Variant: "
            java.lang.String r3 = r5.concat(r3)
            r4.<init>(r3)
            throw r4
        L84:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            int r4 = r4.zza()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }

    public final com.google.android.gms.internal.ads.zzgmb zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgmb r0 = r1.zza
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgyx zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgyx r0 = r1.zzc
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgyy zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgyy r0 = r1.zzb
            return r0
    }

    public final java.lang.Integer zze() {
            r1 = this;
            java.lang.Integer r0 = r1.zzd
            return r0
    }
}
