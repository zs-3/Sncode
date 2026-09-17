package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgln {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgyx zzb = null;
    private static final com.google.android.gms.internal.ads.zzgpz zzc = null;
    private static final com.google.android.gms.internal.ads.zzgpv zzd = null;
    private static final com.google.android.gms.internal.ads.zzgom zze = null;
    private static final com.google.android.gms.internal.ads.zzgoi zzf = null;

    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzgqr> r0 = com.google.android.gms.internal.ads.zzgqr.class
            java.lang.Class<com.google.android.gms.internal.ads.zzgqs> r1 = com.google.android.gms.internal.ads.zzgqs.class
            java.lang.String r2 = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"
            com.google.android.gms.internal.ads.zzgyx r2 = com.google.android.gms.internal.ads.zzgrg.zzb(r2)
            com.google.android.gms.internal.ads.zzgln.zzb = r2
            com.google.android.gms.internal.ads.zzglj r3 = new com.google.android.gms.internal.ads.zzglj
            r3.<init>()
            java.lang.Class<com.google.android.gms.internal.ads.zzgli> r4 = com.google.android.gms.internal.ads.zzgli.class
            com.google.android.gms.internal.ads.zzgpz r3 = com.google.android.gms.internal.ads.zzgpz.zzb(r3, r4, r1)
            com.google.android.gms.internal.ads.zzgln.zzc = r3
            com.google.android.gms.internal.ads.zzglk r3 = new com.google.android.gms.internal.ads.zzglk
            r3.<init>()
            com.google.android.gms.internal.ads.zzgpv r1 = com.google.android.gms.internal.ads.zzgpv.zzb(r3, r2, r1)
            com.google.android.gms.internal.ads.zzgln.zzd = r1
            com.google.android.gms.internal.ads.zzgll r1 = new com.google.android.gms.internal.ads.zzgll
            r1.<init>()
            java.lang.Class<com.google.android.gms.internal.ads.zzglc> r3 = com.google.android.gms.internal.ads.zzglc.class
            com.google.android.gms.internal.ads.zzgom r1 = com.google.android.gms.internal.ads.zzgom.zzb(r1, r3, r0)
            com.google.android.gms.internal.ads.zzgln.zze = r1
            com.google.android.gms.internal.ads.zzglm r1 = new com.google.android.gms.internal.ads.zzglm
            r1.<init>()
            com.google.android.gms.internal.ads.zzgoi r0 = com.google.android.gms.internal.ads.zzgoi.zzb(r1, r2, r0)
            com.google.android.gms.internal.ads.zzgln.zzf = r0
            return
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzglc zza(com.google.android.gms.internal.ads.zzgqr r2, com.google.android.gms.internal.ads.zzghw r3) {
            java.lang.String r3 = r2.zzg()
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L57
            com.google.android.gms.internal.ads.zzgzs r3 = r2.zze()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            com.google.android.gms.internal.ads.zzhao r0 = com.google.android.gms.internal.ads.zzhao.zza()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            com.google.android.gms.internal.ads.zzgxb r3 = com.google.android.gms.internal.ads.zzgxb.zze(r3, r0)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            int r0 = r3.zza()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            if (r0 != 0) goto L33
            com.google.android.gms.internal.ads.zzgxe r3 = r3.zzf()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            com.google.android.gms.internal.ads.zzgxf r0 = r2.zzc()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            com.google.android.gms.internal.ads.zzgli r3 = zzf(r3, r0)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            java.lang.Integer r2 = r2.zzf()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            com.google.android.gms.internal.ads.zzglc r2 = com.google.android.gms.internal.ads.zzglc.zza(r3, r2)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            return r2
        L33:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            r0.<init>()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            java.lang.String r1 = "KmsEnvelopeAeadKeys are only accepted with version 0, got "
            r0.append(r1)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            r0.append(r3)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            java.lang.String r3 = r0.toString()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            r2.<init>(r3)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
            throw r2     // Catch: com.google.android.gms.internal.ads.zzhbt -> L4e
        L4e:
            r2 = move-exception
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Parsing KmsEnvelopeAeadKey failed: "
            r3.<init>(r0, r2)
            throw r3
        L57:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey"
            r2.<init>(r3)
            throw r2
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgli zzb(com.google.android.gms.internal.ads.zzgqs r2) {
            com.google.android.gms.internal.ads.zzgwf r0 = r2.zzc()
            java.lang.String r0 = r0.zzi()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            com.google.android.gms.internal.ads.zzgwf r0 = r2.zzc()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L2d
            com.google.android.gms.internal.ads.zzgzs r0 = r0.zzh()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L2d
            com.google.android.gms.internal.ads.zzhao r1 = com.google.android.gms.internal.ads.zzhao.zza()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L2d
            com.google.android.gms.internal.ads.zzgxe r0 = com.google.android.gms.internal.ads.zzgxe.zzf(r0, r1)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L2d
            com.google.android.gms.internal.ads.zzgwf r2 = r2.zzc()
            com.google.android.gms.internal.ads.zzgxf r2 = r2.zzg()
            com.google.android.gms.internal.ads.zzgli r2 = zzf(r0, r2)
            return r2
        L2d:
            r2 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Parsing KmsEnvelopeAeadKeyFormat failed: "
            r0.<init>(r1, r2)
            throw r0
        L36:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            com.google.android.gms.internal.ads.zzgwf r2 = r2.zzc()
            java.lang.String r2 = r2.zzi()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgqr zzc(com.google.android.gms.internal.ads.zzglc r3, com.google.android.gms.internal.ads.zzghw r4) {
            com.google.android.gms.internal.ads.zzgxa r4 = com.google.android.gms.internal.ads.zzgxb.zzc()
            com.google.android.gms.internal.ads.zzgli r0 = r3.zzb()
            com.google.android.gms.internal.ads.zzgxe r0 = zzg(r0)
            r4.zza(r0)
            com.google.android.gms.internal.ads.zzhbe r4 = r4.zzbn()
            com.google.android.gms.internal.ads.zzgxb r4 = (com.google.android.gms.internal.ads.zzgxb) r4
            com.google.android.gms.internal.ads.zzgzs r4 = r4.zzaN()
            com.google.android.gms.internal.ads.zzgwa r0 = com.google.android.gms.internal.ads.zzgwa.zze
            com.google.android.gms.internal.ads.zzgli r1 = r3.zzb()
            com.google.android.gms.internal.ads.zzglg r1 = r1.zzc()
            com.google.android.gms.internal.ads.zzgxf r1 = zzh(r1)
            java.lang.Integer r3 = r3.zzd()
            java.lang.String r2 = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"
            com.google.android.gms.internal.ads.zzgqr r3 = com.google.android.gms.internal.ads.zzgqr.zza(r2, r4, r0, r1, r3)
            return r3
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgqs zzd(com.google.android.gms.internal.ads.zzgli r2) {
            com.google.android.gms.internal.ads.zzgwe r0 = com.google.android.gms.internal.ads.zzgwf.zza()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"
            r0.zzb(r1)
            com.google.android.gms.internal.ads.zzgxe r1 = zzg(r2)
            com.google.android.gms.internal.ads.zzgzs r1 = r1.zzaN()
            r0.zzc(r1)
            com.google.android.gms.internal.ads.zzglg r2 = r2.zzc()
            com.google.android.gms.internal.ads.zzgxf r2 = zzh(r2)
            r0.zza(r2)
            com.google.android.gms.internal.ads.zzhbe r2 = r0.zzbn()
            com.google.android.gms.internal.ads.zzgwf r2 = (com.google.android.gms.internal.ads.zzgwf) r2
            com.google.android.gms.internal.ads.zzgqs r2 = com.google.android.gms.internal.ads.zzgqs.zzb(r2)
            return r2
    }

    public static void zze(com.google.android.gms.internal.ads.zzgpq r1) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgpz r0 = com.google.android.gms.internal.ads.zzgln.zzc
            r1.zzi(r0)
            com.google.android.gms.internal.ads.zzgpv r0 = com.google.android.gms.internal.ads.zzgln.zzd
            r1.zzh(r0)
            com.google.android.gms.internal.ads.zzgom r0 = com.google.android.gms.internal.ads.zzgln.zze
            r1.zzg(r0)
            com.google.android.gms.internal.ads.zzgoi r0 = com.google.android.gms.internal.ads.zzgln.zzf
            r1.zzf(r0)
            return
    }

    private static com.google.android.gms.internal.ads.zzgli zzf(com.google.android.gms.internal.ads.zzgxe r5, com.google.android.gms.internal.ads.zzgxf r6) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgwe r0 = com.google.android.gms.internal.ads.zzgwf.zza()
            com.google.android.gms.internal.ads.zzgwf r1 = r5.zza()
            java.lang.String r1 = r1.zzi()
            r0.zzb(r1)
            com.google.android.gms.internal.ads.zzgwf r1 = r5.zza()
            com.google.android.gms.internal.ads.zzgzs r1 = r1.zzh()
            r0.zzc(r1)
            com.google.android.gms.internal.ads.zzgxf r1 = com.google.android.gms.internal.ads.zzgxf.zzd
            r0.zza(r1)
            com.google.android.gms.internal.ads.zzhbe r0 = r0.zzbn()
            com.google.android.gms.internal.ads.zzgwf r0 = (com.google.android.gms.internal.ads.zzgwf) r0
            byte[] r0 = r0.zzaV()
            com.google.android.gms.internal.ads.zzghs r0 = com.google.android.gms.internal.ads.zzghy.zza(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgjt
            if (r1 == 0) goto L34
            com.google.android.gms.internal.ads.zzglf r1 = com.google.android.gms.internal.ads.zzglf.zza
            goto L56
        L34:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgkm
            if (r1 == 0) goto L3b
            com.google.android.gms.internal.ads.zzglf r1 = com.google.android.gms.internal.ads.zzglf.zzc
            goto L56
        L3b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgmb
            if (r1 == 0) goto L42
            com.google.android.gms.internal.ads.zzglf r1 = com.google.android.gms.internal.ads.zzglf.zzb
            goto L56
        L42:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgiu
            if (r1 == 0) goto L49
            com.google.android.gms.internal.ads.zzglf r1 = com.google.android.gms.internal.ads.zzglf.zzd
            goto L56
        L49:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgjg
            if (r1 == 0) goto L50
            com.google.android.gms.internal.ads.zzglf r1 = com.google.android.gms.internal.ads.zzglf.zze
            goto L56
        L50:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgkg
            if (r1 == 0) goto L9d
            com.google.android.gms.internal.ads.zzglf r1 = com.google.android.gms.internal.ads.zzglf.zzf
        L56:
            com.google.android.gms.internal.ads.zzgle r2 = new com.google.android.gms.internal.ads.zzgle
            r3 = 0
            r2.<init>(r3)
            int r3 = r6.ordinal()
            r4 = 1
            if (r3 == r4) goto L84
            r4 = 3
            if (r3 != r4) goto L69
            com.google.android.gms.internal.ads.zzglg r6 = com.google.android.gms.internal.ads.zzglg.zzb
            goto L86
        L69:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            int r6 = r6.zza()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to parse OutputPrefixType: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L84:
            com.google.android.gms.internal.ads.zzglg r6 = com.google.android.gms.internal.ads.zzglg.zza
        L86:
            r2.zzd(r6)
            java.lang.String r5 = r5.zzg()
            r2.zzc(r5)
            com.google.android.gms.internal.ads.zzgic r0 = (com.google.android.gms.internal.ads.zzgic) r0
            r2.zza(r0)
            r2.zzb(r1)
            com.google.android.gms.internal.ads.zzgli r5 = r2.zze()
            return r5
        L9d:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "Unsupported DEK parameters when parsing "
            java.lang.String r6 = r0.concat(r6)
            r5.<init>(r6)
            throw r5
    }

    private static com.google.android.gms.internal.ads.zzgxe zzg(com.google.android.gms.internal.ads.zzgli r2) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgic r0 = r2.zzb()
            byte[] r0 = com.google.android.gms.internal.ads.zzghy.zzb(r0)
            com.google.android.gms.internal.ads.zzhao r1 = com.google.android.gms.internal.ads.zzhao.zza()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L25
            com.google.android.gms.internal.ads.zzgwf r0 = com.google.android.gms.internal.ads.zzgwf.zzf(r0, r1)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L25
            com.google.android.gms.internal.ads.zzgxd r1 = com.google.android.gms.internal.ads.zzgxe.zzc()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L25
            java.lang.String r2 = r2.zzd()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L25
            r1.zzb(r2)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L25
            r1.zza(r0)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L25
            com.google.android.gms.internal.ads.zzhbe r2 = r1.zzbn()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L25
            com.google.android.gms.internal.ads.zzgxe r2 = (com.google.android.gms.internal.ads.zzgxe) r2     // Catch: com.google.android.gms.internal.ads.zzhbt -> L25
            return r2
        L25:
            r2 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Parsing KmsEnvelopeAeadKeyFormat failed: "
            r0.<init>(r1, r2)
            throw r0
    }

    private static com.google.android.gms.internal.ads.zzgxf zzh(com.google.android.gms.internal.ads.zzglg r2) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzglg r0 = com.google.android.gms.internal.ads.zzglg.zza
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.ads.zzgxf r2 = com.google.android.gms.internal.ads.zzgxf.zzb
            return r2
        Lb:
            com.google.android.gms.internal.ads.zzglg r0 = com.google.android.gms.internal.ads.zzglg.zzb
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L16
            com.google.android.gms.internal.ads.zzgxf r2 = com.google.android.gms.internal.ads.zzgxf.zzd
            return r2
        L16:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Unable to serialize variant: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
    }
}
