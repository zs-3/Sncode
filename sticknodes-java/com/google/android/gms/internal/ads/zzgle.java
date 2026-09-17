package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgle {
    private com.google.android.gms.internal.ads.zzglg zza;
    private java.lang.String zzb;
    private com.google.android.gms.internal.ads.zzglf zzc;
    private com.google.android.gms.internal.ads.zzgic zzd;

    private zzgle() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* synthetic */ zzgle(com.google.android.gms.internal.ads.zzgld r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.android.gms.internal.ads.zzgle zza(com.google.android.gms.internal.ads.zzgic r1) {
            r0 = this;
            r0.zzd = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgle zzb(com.google.android.gms.internal.ads.zzglf r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgle zzc(java.lang.String r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgle zzd(com.google.android.gms.internal.ads.zzglg r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgli zze() throws java.security.GeneralSecurityException {
            r7 = this;
            com.google.android.gms.internal.ads.zzglg r0 = r7.zza
            if (r0 != 0) goto L8
            com.google.android.gms.internal.ads.zzglg r0 = com.google.android.gms.internal.ads.zzglg.zzb
            r7.zza = r0
        L8:
            java.lang.String r0 = r7.zzb
            if (r0 == 0) goto Lba
            com.google.android.gms.internal.ads.zzglf r0 = r7.zzc
            if (r0 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzgic r1 = r7.zzd
            if (r1 == 0) goto Laa
            boolean r2 = r1.zza()
            if (r2 != 0) goto La2
            com.google.android.gms.internal.ads.zzglf r2 = com.google.android.gms.internal.ads.zzglf.zza
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L26
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzgjt
            if (r2 != 0) goto L62
        L26:
            com.google.android.gms.internal.ads.zzglf r2 = com.google.android.gms.internal.ads.zzglf.zzc
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L32
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzgkm
            if (r2 != 0) goto L62
        L32:
            com.google.android.gms.internal.ads.zzglf r2 = com.google.android.gms.internal.ads.zzglf.zzb
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L3e
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzgmb
            if (r2 != 0) goto L62
        L3e:
            com.google.android.gms.internal.ads.zzglf r2 = com.google.android.gms.internal.ads.zzglf.zzd
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L4a
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzgiu
            if (r2 != 0) goto L62
        L4a:
            com.google.android.gms.internal.ads.zzglf r2 = com.google.android.gms.internal.ads.zzglf.zze
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L56
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzgjg
            if (r2 != 0) goto L62
        L56:
            com.google.android.gms.internal.ads.zzglf r2 = com.google.android.gms.internal.ads.zzglf.zzf
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L72
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzgkg
            if (r0 == 0) goto L72
        L62:
            com.google.android.gms.internal.ads.zzgli r0 = new com.google.android.gms.internal.ads.zzgli
            com.google.android.gms.internal.ads.zzglg r2 = r7.zza
            java.lang.String r3 = r7.zzb
            com.google.android.gms.internal.ads.zzglf r4 = r7.zzc
            com.google.android.gms.internal.ads.zzgic r5 = r7.zzd
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L72:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            com.google.android.gms.internal.ads.zzglf r1 = r7.zzc
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzgic r2 = r7.zzd
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot use parsing strategy "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " when new keys are picked according to "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = "."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        La2:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "dekParametersForNewKeys must not have ID Requirements"
            r0.<init>(r1)
            throw r0
        Laa:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "dekParametersForNewKeys must be set"
            r0.<init>(r1)
            throw r0
        Lb2:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "dekParsingStrategy must be set"
            r0.<init>(r1)
            throw r0
        Lba:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "kekUri must be set"
            r0.<init>(r1)
            throw r0
    }
}
