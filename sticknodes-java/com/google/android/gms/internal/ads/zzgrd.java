package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgrd {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final java.util.Map zzc;
    private final java.util.Map zzd;

    /* synthetic */ zzgrd(com.google.android.gms.internal.ads.zzgqx r2, com.google.android.gms.internal.ads.zzgrc r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            java.util.Map r0 = com.google.android.gms.internal.ads.zzgqx.zzf(r2)
            r3.<init>(r0)
            r1.zza = r3
            java.util.HashMap r3 = new java.util.HashMap
            java.util.Map r0 = com.google.android.gms.internal.ads.zzgqx.zze(r2)
            r3.<init>(r0)
            r1.zzb = r3
            java.util.HashMap r3 = new java.util.HashMap
            java.util.Map r0 = com.google.android.gms.internal.ads.zzgqx.zzh(r2)
            r3.<init>(r0)
            r1.zzc = r3
            java.util.HashMap r3 = new java.util.HashMap
            java.util.Map r2 = com.google.android.gms.internal.ads.zzgqx.zzg(r2)
            r3.<init>(r2)
            r1.zzd = r3
            return
    }

    static /* bridge */ /* synthetic */ java.util.Map zze(com.google.android.gms.internal.ads.zzgrd r0) {
            java.util.Map r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzf(com.google.android.gms.internal.ads.zzgrd r0) {
            java.util.Map r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzg(com.google.android.gms.internal.ads.zzgrd r0) {
            java.util.Map r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzh(com.google.android.gms.internal.ads.zzgrd r0) {
            java.util.Map r0 = r0.zzc
            return r0
    }

    public final com.google.android.gms.internal.ads.zzghd zza(com.google.android.gms.internal.ads.zzgqw r5, com.google.android.gms.internal.ads.zzghw r6) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.android.gms.internal.ads.zzgqz r0 = new com.google.android.gms.internal.ads.zzgqz
            java.lang.Class r1 = r5.getClass()
            com.google.android.gms.internal.ads.zzgyx r2 = r5.zzd()
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.Map r1 = r4.zzb
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L23
            java.util.Map r1 = r4.zzb
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.ads.zzgoi r0 = (com.google.android.gms.internal.ads.zzgoi) r0
            com.google.android.gms.internal.ads.zzghd r5 = r0.zza(r5, r6)
            return r5
        L23:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No Key Parser for requested key type "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " available"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
    }

    public final com.google.android.gms.internal.ads.zzghs zzb(com.google.android.gms.internal.ads.zzgqw r5) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.android.gms.internal.ads.zzgqz r0 = new com.google.android.gms.internal.ads.zzgqz
            java.lang.Class r1 = r5.getClass()
            com.google.android.gms.internal.ads.zzgyx r2 = r5.zzd()
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.Map r1 = r4.zzd
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L23
            java.util.Map r1 = r4.zzd
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.ads.zzgpv r0 = (com.google.android.gms.internal.ads.zzgpv) r0
            com.google.android.gms.internal.ads.zzghs r5 = r0.zza(r5)
            return r5
        L23:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No Parameters Parser for requested key type "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " available"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
    }

    public final com.google.android.gms.internal.ads.zzgqw zzc(com.google.android.gms.internal.ads.zzghd r4, java.lang.Class r5, com.google.android.gms.internal.ads.zzghw r6) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.android.gms.internal.ads.zzgrb r0 = new com.google.android.gms.internal.ads.zzgrb
            java.lang.Class r1 = r4.getClass()
            r2 = 0
            r0.<init>(r1, r5, r2)
            java.util.Map r5 = r3.zza
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L1f
            java.util.Map r5 = r3.zza
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.zzgom r5 = (com.google.android.gms.internal.ads.zzgom) r5
            com.google.android.gms.internal.ads.zzgqw r4 = r5.zza(r4, r6)
            return r4
        L1f:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "No Key serializer for "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = " available"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    public final com.google.android.gms.internal.ads.zzgqw zzd(com.google.android.gms.internal.ads.zzghs r4, java.lang.Class r5) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.android.gms.internal.ads.zzgrb r0 = new com.google.android.gms.internal.ads.zzgrb
            java.lang.Class r1 = r4.getClass()
            r2 = 0
            r0.<init>(r1, r5, r2)
            java.util.Map r5 = r3.zzc
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L1f
            java.util.Map r5 = r3.zzc
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.zzgpz r5 = (com.google.android.gms.internal.ads.zzgpz) r5
            com.google.android.gms.internal.ads.zzgqw r4 = r5.zza(r4)
            return r4
        L1f:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No Key Format serializer for "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " available"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    public final boolean zzi(com.google.android.gms.internal.ads.zzgqw r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzgqz r0 = new com.google.android.gms.internal.ads.zzgqz
            java.lang.Class r1 = r4.getClass()
            com.google.android.gms.internal.ads.zzgyx r4 = r4.zzd()
            r2 = 0
            r0.<init>(r1, r4, r2)
            java.util.Map r4 = r3.zzb
            boolean r4 = r4.containsKey(r0)
            return r4
    }

    public final boolean zzj(com.google.android.gms.internal.ads.zzgqw r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzgqz r0 = new com.google.android.gms.internal.ads.zzgqz
            java.lang.Class r1 = r4.getClass()
            com.google.android.gms.internal.ads.zzgyx r4 = r4.zzd()
            r2 = 0
            r0.<init>(r1, r4, r2)
            java.util.Map r4 = r3.zzd
            boolean r4 = r4.containsKey(r0)
            return r4
    }
}
