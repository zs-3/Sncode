package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgnt {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgyx zzb = null;
    private static final com.google.android.gms.internal.ads.zzgpz zzc = null;
    private static final com.google.android.gms.internal.ads.zzgpv zzd = null;
    private static final com.google.android.gms.internal.ads.zzgom zze = null;
    private static final com.google.android.gms.internal.ads.zzgoi zzf = null;

    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzgqr> r0 = com.google.android.gms.internal.ads.zzgqr.class
            java.lang.Class<com.google.android.gms.internal.ads.zzgqs> r1 = com.google.android.gms.internal.ads.zzgqs.class
            java.lang.String r2 = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"
            com.google.android.gms.internal.ads.zzgyx r2 = com.google.android.gms.internal.ads.zzgrg.zzb(r2)
            com.google.android.gms.internal.ads.zzgnt.zzb = r2
            com.google.android.gms.internal.ads.zzgnp r3 = new com.google.android.gms.internal.ads.zzgnp
            r3.<init>()
            java.lang.Class<com.google.android.gms.internal.ads.zzgmb> r4 = com.google.android.gms.internal.ads.zzgmb.class
            com.google.android.gms.internal.ads.zzgpz r3 = com.google.android.gms.internal.ads.zzgpz.zzb(r3, r4, r1)
            com.google.android.gms.internal.ads.zzgnt.zzc = r3
            com.google.android.gms.internal.ads.zzgnq r3 = new com.google.android.gms.internal.ads.zzgnq
            r3.<init>()
            com.google.android.gms.internal.ads.zzgpv r1 = com.google.android.gms.internal.ads.zzgpv.zzb(r3, r2, r1)
            com.google.android.gms.internal.ads.zzgnt.zzd = r1
            com.google.android.gms.internal.ads.zzgnr r1 = new com.google.android.gms.internal.ads.zzgnr
            r1.<init>()
            java.lang.Class<com.google.android.gms.internal.ads.zzglv> r3 = com.google.android.gms.internal.ads.zzglv.class
            com.google.android.gms.internal.ads.zzgom r1 = com.google.android.gms.internal.ads.zzgom.zzb(r1, r3, r0)
            com.google.android.gms.internal.ads.zzgnt.zze = r1
            com.google.android.gms.internal.ads.zzgns r1 = new com.google.android.gms.internal.ads.zzgns
            r1.<init>()
            com.google.android.gms.internal.ads.zzgoi r0 = com.google.android.gms.internal.ads.zzgoi.zzb(r1, r2, r0)
            com.google.android.gms.internal.ads.zzgnt.zzf = r0
            return
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzglv zza(com.google.android.gms.internal.ads.zzgqr r2, com.google.android.gms.internal.ads.zzghw r3) {
            java.lang.String r0 = r2.zzg()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            com.google.android.gms.internal.ads.zzgzs r0 = r2.zze()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L43
            com.google.android.gms.internal.ads.zzhao r1 = com.google.android.gms.internal.ads.zzhao.zza()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L43
            com.google.android.gms.internal.ads.zzgxl r0 = com.google.android.gms.internal.ads.zzgxl.zze(r0, r1)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L43
            int r1 = r0.zza()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L43
            if (r1 != 0) goto L3b
            com.google.android.gms.internal.ads.zzgxf r1 = r2.zzc()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L43
            com.google.android.gms.internal.ads.zzgma r1 = zzf(r1)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L43
            com.google.android.gms.internal.ads.zzgzs r0 = r0.zzf()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L43
            byte[] r0 = r0.zzA()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L43
            com.google.android.gms.internal.ads.zzgyy r3 = com.google.android.gms.internal.ads.zzgyy.zzb(r0, r3)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L43
            java.lang.Integer r2 = r2.zzf()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L43
            com.google.android.gms.internal.ads.zzglv r2 = com.google.android.gms.internal.ads.zzglv.zza(r1, r3, r2)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L43
            return r2
        L3b:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: com.google.android.gms.internal.ads.zzhbt -> L43
            java.lang.String r3 = "Only version 0 keys are accepted"
            r2.<init>(r3)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L43
            throw r2     // Catch: com.google.android.gms.internal.ads.zzhbt -> L43
        L43:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "Parsing XChaCha20Poly1305Key failed"
            r2.<init>(r3)
            throw r2
        L4b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey"
            r2.<init>(r3)
            throw r2
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgmb zzb(com.google.android.gms.internal.ads.zzgqs r2) {
            com.google.android.gms.internal.ads.zzgwf r0 = r2.zzc()
            java.lang.String r0 = r0.zzi()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzgwf r0 = r2.zzc()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L3f
            com.google.android.gms.internal.ads.zzgzs r0 = r0.zzh()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L3f
            com.google.android.gms.internal.ads.zzhao r1 = com.google.android.gms.internal.ads.zzhao.zza()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L3f
            com.google.android.gms.internal.ads.zzgxo r0 = com.google.android.gms.internal.ads.zzgxo.zze(r0, r1)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L3f
            int r0 = r0.zza()
            if (r0 != 0) goto L37
            com.google.android.gms.internal.ads.zzgwf r2 = r2.zzc()
            com.google.android.gms.internal.ads.zzgxf r2 = r2.zzg()
            com.google.android.gms.internal.ads.zzgma r2 = zzf(r2)
            com.google.android.gms.internal.ads.zzgmb r2 = com.google.android.gms.internal.ads.zzgmb.zzc(r2)
            return r2
        L37:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Only version 0 parameters are accepted"
            r2.<init>(r0)
            throw r2
        L3f:
            r2 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Parsing XChaCha20Poly1305Parameters failed: "
            r0.<init>(r1, r2)
            throw r0
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            com.google.android.gms.internal.ads.zzgwf r2 = r2.zzc()
            java.lang.String r2 = r2.zzi()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgqr zzc(com.google.android.gms.internal.ads.zzglv r3, com.google.android.gms.internal.ads.zzghw r4) {
            com.google.android.gms.internal.ads.zzgxk r0 = com.google.android.gms.internal.ads.zzgxl.zzc()
            com.google.android.gms.internal.ads.zzgyy r1 = r3.zzd()
            byte[] r4 = r1.zzd(r4)
            int r1 = r4.length
            r2 = 0
            com.google.android.gms.internal.ads.zzgzs r4 = com.google.android.gms.internal.ads.zzgzs.zzv(r4, r2, r1)
            r0.zza(r4)
            com.google.android.gms.internal.ads.zzhbe r4 = r0.zzbn()
            com.google.android.gms.internal.ads.zzgxl r4 = (com.google.android.gms.internal.ads.zzgxl) r4
            com.google.android.gms.internal.ads.zzgzs r4 = r4.zzaN()
            com.google.android.gms.internal.ads.zzgwa r0 = com.google.android.gms.internal.ads.zzgwa.zzb
            com.google.android.gms.internal.ads.zzgmb r1 = r3.zzb()
            com.google.android.gms.internal.ads.zzgma r1 = r1.zzb()
            com.google.android.gms.internal.ads.zzgxf r1 = zzg(r1)
            java.lang.Integer r3 = r3.zze()
            java.lang.String r2 = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"
            com.google.android.gms.internal.ads.zzgqr r3 = com.google.android.gms.internal.ads.zzgqr.zza(r2, r4, r0, r1, r3)
            return r3
    }

    public static /* synthetic */ com.google.android.gms.internal.ads.zzgqs zzd(com.google.android.gms.internal.ads.zzgmb r2) {
            com.google.android.gms.internal.ads.zzgwe r0 = com.google.android.gms.internal.ads.zzgwf.zza()
            java.lang.String r1 = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"
            r0.zzb(r1)
            com.google.android.gms.internal.ads.zzgxo r1 = com.google.android.gms.internal.ads.zzgxo.zzd()
            com.google.android.gms.internal.ads.zzgzs r1 = r1.zzaN()
            r0.zzc(r1)
            com.google.android.gms.internal.ads.zzgma r2 = r2.zzb()
            com.google.android.gms.internal.ads.zzgxf r2 = zzg(r2)
            r0.zza(r2)
            com.google.android.gms.internal.ads.zzhbe r2 = r0.zzbn()
            com.google.android.gms.internal.ads.zzgwf r2 = (com.google.android.gms.internal.ads.zzgwf) r2
            com.google.android.gms.internal.ads.zzgqs r2 = com.google.android.gms.internal.ads.zzgqs.zzb(r2)
            return r2
    }

    public static void zze(com.google.android.gms.internal.ads.zzgpq r1) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgpz r0 = com.google.android.gms.internal.ads.zzgnt.zzc
            r1.zzi(r0)
            com.google.android.gms.internal.ads.zzgpv r0 = com.google.android.gms.internal.ads.zzgnt.zzd
            r1.zzh(r0)
            com.google.android.gms.internal.ads.zzgom r0 = com.google.android.gms.internal.ads.zzgnt.zze
            r1.zzg(r0)
            com.google.android.gms.internal.ads.zzgoi r0 = com.google.android.gms.internal.ads.zzgnt.zzf
            r1.zzf(r0)
            return
    }

    private static com.google.android.gms.internal.ads.zzgma zzf(com.google.android.gms.internal.ads.zzgxf r3) throws java.security.GeneralSecurityException {
            int r0 = r3.ordinal()
            r1 = 1
            if (r0 == r1) goto L32
            r1 = 2
            if (r0 == r1) goto L2f
            r1 = 3
            if (r0 == r1) goto L2c
            r1 = 4
            if (r0 != r1) goto L11
            goto L2f
        L11:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            int r3 = r3.zza()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to parse OutputPrefixType: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L2c:
            com.google.android.gms.internal.ads.zzgma r3 = com.google.android.gms.internal.ads.zzgma.zzc
            return r3
        L2f:
            com.google.android.gms.internal.ads.zzgma r3 = com.google.android.gms.internal.ads.zzgma.zzb
            return r3
        L32:
            com.google.android.gms.internal.ads.zzgma r3 = com.google.android.gms.internal.ads.zzgma.zza
            return r3
    }

    private static com.google.android.gms.internal.ads.zzgxf zzg(com.google.android.gms.internal.ads.zzgma r2) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgma r0 = com.google.android.gms.internal.ads.zzgma.zza
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.ads.zzgxf r2 = com.google.android.gms.internal.ads.zzgxf.zzb
            return r2
        Lb:
            com.google.android.gms.internal.ads.zzgma r0 = com.google.android.gms.internal.ads.zzgma.zzb
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L16
            com.google.android.gms.internal.ads.zzgxf r2 = com.google.android.gms.internal.ads.zzgxf.zze
            return r2
        L16:
            com.google.android.gms.internal.ads.zzgma r0 = com.google.android.gms.internal.ads.zzgma.zzc
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L21
            com.google.android.gms.internal.ads.zzgxf r2 = com.google.android.gms.internal.ads.zzgxf.zzd
            return r2
        L21:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "Unable to serialize variant: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
    }
}
