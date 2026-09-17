package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgii {
    private com.google.android.gms.internal.ads.zzgiu zza;
    private com.google.android.gms.internal.ads.zzgyy zzb;
    private com.google.android.gms.internal.ads.zzgyy zzc;
    private java.lang.Integer zzd;

    private zzgii() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            r1.zzb = r0
            r1.zzc = r0
            r1.zzd = r0
            return
    }

    /* synthetic */ zzgii(com.google.android.gms.internal.ads.zzgih r1) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zza = r1
            r0.zzb = r1
            r0.zzc = r1
            r0.zzd = r1
            return
    }

    public final com.google.android.gms.internal.ads.zzgii zza(com.google.android.gms.internal.ads.zzgyy r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgii zzb(com.google.android.gms.internal.ads.zzgyy r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgii zzc(java.lang.Integer r1) {
            r0 = this;
            r0.zzd = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgii zzd(com.google.android.gms.internal.ads.zzgiu r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgik zze() throws java.security.GeneralSecurityException {
            r8 = this;
            com.google.android.gms.internal.ads.zzgiu r0 = r8.zza
            if (r0 == 0) goto Lc2
            com.google.android.gms.internal.ads.zzgyy r1 = r8.zzb
            if (r1 == 0) goto Lba
            com.google.android.gms.internal.ads.zzgyy r2 = r8.zzc
            if (r2 == 0) goto Lba
            int r2 = r0.zzb()
            int r1 = r1.zza()
            if (r2 != r1) goto Lb2
            int r0 = r0.zzc()
            com.google.android.gms.internal.ads.zzgyy r1 = r8.zzc
            int r1 = r1.zza()
            if (r0 != r1) goto Laa
            com.google.android.gms.internal.ads.zzgiu r0 = r8.zza
            boolean r0 = r0.zza()
            if (r0 == 0) goto L37
            java.lang.Integer r0 = r8.zzd
            if (r0 == 0) goto L2f
            goto L37
        L2f:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Cannot create key without ID requirement with parameters with ID requirement"
            r0.<init>(r1)
            throw r0
        L37:
            com.google.android.gms.internal.ads.zzgiu r0 = r8.zza
            boolean r0 = r0.zza()
            if (r0 != 0) goto L4c
            java.lang.Integer r0 = r8.zzd
            if (r0 != 0) goto L44
            goto L4c
        L44:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Cannot create key with ID requirement with parameters without ID requirement"
            r0.<init>(r1)
            throw r0
        L4c:
            com.google.android.gms.internal.ads.zzgiu r0 = r8.zza
            com.google.android.gms.internal.ads.zzgis r0 = r0.zzh()
            com.google.android.gms.internal.ads.zzgis r1 = com.google.android.gms.internal.ads.zzgis.zzc
            if (r0 != r1) goto L5a
            com.google.android.gms.internal.ads.zzgyx r0 = com.google.android.gms.internal.ads.zzgpr.zza
        L58:
            r5 = r0
            goto L84
        L5a:
            com.google.android.gms.internal.ads.zzgiu r0 = r8.zza
            com.google.android.gms.internal.ads.zzgis r0 = r0.zzh()
            com.google.android.gms.internal.ads.zzgis r1 = com.google.android.gms.internal.ads.zzgis.zzb
            if (r0 != r1) goto L6f
            java.lang.Integer r0 = r8.zzd
            int r0 = r0.intValue()
            com.google.android.gms.internal.ads.zzgyx r0 = com.google.android.gms.internal.ads.zzgpr.zza(r0)
            goto L58
        L6f:
            com.google.android.gms.internal.ads.zzgiu r0 = r8.zza
            com.google.android.gms.internal.ads.zzgis r0 = r0.zzh()
            com.google.android.gms.internal.ads.zzgis r1 = com.google.android.gms.internal.ads.zzgis.zza
            if (r0 != r1) goto L94
            java.lang.Integer r0 = r8.zzd
            int r0 = r0.intValue()
            com.google.android.gms.internal.ads.zzgyx r0 = com.google.android.gms.internal.ads.zzgpr.zzb(r0)
            goto L58
        L84:
            com.google.android.gms.internal.ads.zzgik r0 = new com.google.android.gms.internal.ads.zzgik
            com.google.android.gms.internal.ads.zzgiu r2 = r8.zza
            com.google.android.gms.internal.ads.zzgyy r3 = r8.zzb
            com.google.android.gms.internal.ads.zzgyy r4 = r8.zzc
            java.lang.Integer r6 = r8.zzd
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        L94:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            com.google.android.gms.internal.ads.zzgiu r1 = r8.zza
            com.google.android.gms.internal.ads.zzgis r1 = r1.zzh()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Unknown AesCtrHmacAeadParameters.Variant: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        Laa:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "HMAC key size mismatch"
            r0.<init>(r1)
            throw r0
        Lb2:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "AES key size mismatch"
            r0.<init>(r1)
            throw r0
        Lba:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Cannot build without key material"
            r0.<init>(r1)
            throw r0
        Lc2:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Cannot build without parameters"
            r0.<init>(r1)
            throw r0
    }
}
