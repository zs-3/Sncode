package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgrz {
    private com.google.android.gms.internal.ads.zzgsm zza;
    private com.google.android.gms.internal.ads.zzgyy zzb;
    private java.lang.Integer zzc;

    private zzgrz() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            r1.zzb = r0
            r1.zzc = r0
            return
    }

    /* synthetic */ zzgrz(com.google.android.gms.internal.ads.zzgry r1) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zza = r1
            r0.zzb = r1
            r0.zzc = r1
            return
    }

    public final com.google.android.gms.internal.ads.zzgrz zza(java.lang.Integer r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgrz zzb(com.google.android.gms.internal.ads.zzgyy r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgrz zzc(com.google.android.gms.internal.ads.zzgsm r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgsb zzd() throws java.security.GeneralSecurityException {
            r7 = this;
            com.google.android.gms.internal.ads.zzgsm r0 = r7.zza
            if (r0 == 0) goto La9
            com.google.android.gms.internal.ads.zzgyy r1 = r7.zzb
            if (r1 == 0) goto La9
            int r2 = r0.zzc()
            int r1 = r1.zza()
            if (r2 != r1) goto La1
            boolean r0 = r0.zza()
            if (r0 == 0) goto L25
            java.lang.Integer r0 = r7.zzc
            if (r0 == 0) goto L1d
            goto L25
        L1d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Cannot create key without ID requirement with parameters with ID requirement"
            r0.<init>(r1)
            throw r0
        L25:
            com.google.android.gms.internal.ads.zzgsm r0 = r7.zza
            boolean r0 = r0.zza()
            if (r0 != 0) goto L3a
            java.lang.Integer r0 = r7.zzc
            if (r0 != 0) goto L32
            goto L3a
        L32:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Cannot create key with ID requirement with parameters without ID requirement"
            r0.<init>(r1)
            throw r0
        L3a:
            com.google.android.gms.internal.ads.zzgsm r0 = r7.zza
            com.google.android.gms.internal.ads.zzgsk r0 = r0.zzg()
            com.google.android.gms.internal.ads.zzgsk r1 = com.google.android.gms.internal.ads.zzgsk.zzd
            if (r0 != r1) goto L48
            com.google.android.gms.internal.ads.zzgyx r0 = com.google.android.gms.internal.ads.zzgpr.zza
        L46:
            r4 = r0
            goto L93
        L48:
            com.google.android.gms.internal.ads.zzgsm r0 = r7.zza
            com.google.android.gms.internal.ads.zzgsk r0 = r0.zzg()
            com.google.android.gms.internal.ads.zzgsk r1 = com.google.android.gms.internal.ads.zzgsk.zzc
            if (r0 == r1) goto L88
            com.google.android.gms.internal.ads.zzgsm r0 = r7.zza
            com.google.android.gms.internal.ads.zzgsk r0 = r0.zzg()
            com.google.android.gms.internal.ads.zzgsk r1 = com.google.android.gms.internal.ads.zzgsk.zzb
            if (r0 != r1) goto L5d
            goto L88
        L5d:
            com.google.android.gms.internal.ads.zzgsm r0 = r7.zza
            com.google.android.gms.internal.ads.zzgsk r0 = r0.zzg()
            com.google.android.gms.internal.ads.zzgsk r1 = com.google.android.gms.internal.ads.zzgsk.zza
            if (r0 != r1) goto L72
            java.lang.Integer r0 = r7.zzc
            int r0 = r0.intValue()
            com.google.android.gms.internal.ads.zzgyx r0 = com.google.android.gms.internal.ads.zzgpr.zzb(r0)
            goto L46
        L72:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            com.google.android.gms.internal.ads.zzgsm r1 = r7.zza
            com.google.android.gms.internal.ads.zzgsk r1 = r1.zzg()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Unknown HmacParameters.Variant: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L88:
            java.lang.Integer r0 = r7.zzc
            int r0 = r0.intValue()
            com.google.android.gms.internal.ads.zzgyx r0 = com.google.android.gms.internal.ads.zzgpr.zza(r0)
            goto L46
        L93:
            com.google.android.gms.internal.ads.zzgsb r0 = new com.google.android.gms.internal.ads.zzgsb
            com.google.android.gms.internal.ads.zzgsm r2 = r7.zza
            com.google.android.gms.internal.ads.zzgyy r3 = r7.zzb
            java.lang.Integer r5 = r7.zzc
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        La1:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Key size mismatch"
            r0.<init>(r1)
            throw r0
        La9:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Cannot build without parameters and/or key material"
            r0.<init>(r1)
            throw r0
    }
}
