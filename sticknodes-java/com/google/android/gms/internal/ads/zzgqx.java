package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgqx {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final java.util.Map zzc;
    private final java.util.Map zzd;

    public zzgqx() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzb = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzc = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzd = r0
            return
    }

    public zzgqx(com.google.android.gms.internal.ads.zzgrd r3) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = com.google.android.gms.internal.ads.zzgrd.zzf(r3)
            r0.<init>(r1)
            r2.zza = r0
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = com.google.android.gms.internal.ads.zzgrd.zze(r3)
            r0.<init>(r1)
            r2.zzb = r0
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = com.google.android.gms.internal.ads.zzgrd.zzh(r3)
            r0.<init>(r1)
            r2.zzc = r0
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r3 = com.google.android.gms.internal.ads.zzgrd.zzg(r3)
            r0.<init>(r3)
            r2.zzd = r0
            return
    }

    static /* bridge */ /* synthetic */ java.util.Map zze(com.google.android.gms.internal.ads.zzgqx r0) {
            java.util.Map r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzf(com.google.android.gms.internal.ads.zzgqx r0) {
            java.util.Map r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzg(com.google.android.gms.internal.ads.zzgqx r0) {
            java.util.Map r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzh(com.google.android.gms.internal.ads.zzgqx r0) {
            java.util.Map r0 = r0.zzc
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgqx zza(com.google.android.gms.internal.ads.zzgoi r5) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.android.gms.internal.ads.zzgqz r0 = new com.google.android.gms.internal.ads.zzgqz
            java.lang.Class r1 = r5.zzd()
            com.google.android.gms.internal.ads.zzgyx r2 = r5.zzc()
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.Map r1 = r4.zzb
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L3b
            java.util.Map r1 = r4.zzb
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.ads.zzgoi r1 = (com.google.android.gms.internal.ads.zzgoi) r1
            boolean r2 = r1.equals(r5)
            if (r2 == 0) goto L2b
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2b
            goto L40
        L2b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Attempt to register non-equal parser for already existing object of type: "
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            throw r5
        L3b:
            java.util.Map r1 = r4.zzb
            r1.put(r0, r5)
        L40:
            return r4
    }

    public final com.google.android.gms.internal.ads.zzgqx zzb(com.google.android.gms.internal.ads.zzgom r5) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.android.gms.internal.ads.zzgrb r0 = new com.google.android.gms.internal.ads.zzgrb
            java.lang.Class r1 = r5.zzc()
            java.lang.Class r2 = r5.zzd()
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.Map r1 = r4.zza
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L3b
            java.util.Map r1 = r4.zza
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.ads.zzgom r1 = (com.google.android.gms.internal.ads.zzgom) r1
            boolean r2 = r1.equals(r5)
            if (r2 == 0) goto L2b
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2b
            goto L40
        L2b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Attempt to register non-equal serializer for already existing object of type: "
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            throw r5
        L3b:
            java.util.Map r1 = r4.zza
            r1.put(r0, r5)
        L40:
            return r4
    }

    public final com.google.android.gms.internal.ads.zzgqx zzc(com.google.android.gms.internal.ads.zzgpv r5) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.android.gms.internal.ads.zzgqz r0 = new com.google.android.gms.internal.ads.zzgqz
            java.lang.Class r1 = r5.zzd()
            com.google.android.gms.internal.ads.zzgyx r2 = r5.zzc()
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.Map r1 = r4.zzd
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L3b
            java.util.Map r1 = r4.zzd
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.ads.zzgpv r1 = (com.google.android.gms.internal.ads.zzgpv) r1
            boolean r2 = r1.equals(r5)
            if (r2 == 0) goto L2b
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2b
            goto L40
        L2b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Attempt to register non-equal parser for already existing object of type: "
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            throw r5
        L3b:
            java.util.Map r1 = r4.zzd
            r1.put(r0, r5)
        L40:
            return r4
    }

    public final com.google.android.gms.internal.ads.zzgqx zzd(com.google.android.gms.internal.ads.zzgpz r5) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.android.gms.internal.ads.zzgrb r0 = new com.google.android.gms.internal.ads.zzgrb
            java.lang.Class r1 = r5.zzc()
            java.lang.Class r2 = r5.zzd()
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.Map r1 = r4.zzc
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L3b
            java.util.Map r1 = r4.zzc
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.ads.zzgpz r1 = (com.google.android.gms.internal.ads.zzgpz) r1
            boolean r2 = r1.equals(r5)
            if (r2 == 0) goto L2b
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2b
            goto L40
        L2b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Attempt to register non-equal serializer for already existing object of type: "
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            throw r5
        L3b:
            java.util.Map r1 = r4.zzc
            r1.put(r0, r5)
        L40:
            return r4
    }
}
