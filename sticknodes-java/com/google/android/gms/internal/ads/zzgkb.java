package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgkb {
    private static final com.google.android.gms.internal.ads.zzgqd zza = null;
    private static final com.google.android.gms.internal.ads.zzgpf zzb = null;
    private static final com.google.android.gms.internal.ads.zzgph zzc = null;
    private static final com.google.android.gms.internal.ads.zzghe zzd = null;

    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzggt> r0 = com.google.android.gms.internal.ads.zzggt.class
            com.google.android.gms.internal.ads.zzgjy r1 = new com.google.android.gms.internal.ads.zzgjy
            r1.<init>()
            java.lang.Class<com.google.android.gms.internal.ads.zzgjx> r2 = com.google.android.gms.internal.ads.zzgjx.class
            com.google.android.gms.internal.ads.zzgqd r1 = com.google.android.gms.internal.ads.zzgqd.zzb(r1, r2, r0)
            com.google.android.gms.internal.ads.zzgkb.zza = r1
            com.google.android.gms.internal.ads.zzgjz r1 = new com.google.android.gms.internal.ads.zzgjz
            r1.<init>()
            com.google.android.gms.internal.ads.zzgkb.zzb = r1
            com.google.android.gms.internal.ads.zzgka r1 = new com.google.android.gms.internal.ads.zzgka
            r1.<init>()
            com.google.android.gms.internal.ads.zzgkb.zzc = r1
            com.google.android.gms.internal.ads.zzgwa r1 = com.google.android.gms.internal.ads.zzgwa.zzb
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzgve.zzg()
            java.lang.String r3 = "type.googleapis.com/google.crypto.tink.AesGcmSivKey"
            com.google.android.gms.internal.ads.zzghe r0 = com.google.android.gms.internal.ads.zzgon.zzd(r3, r0, r1, r2)
            com.google.android.gms.internal.ads.zzgkb.zzd = r0
            return
    }

    public static void zza(boolean r8) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.android.gms.internal.ads.zzgkg> r8 = com.google.android.gms.internal.ads.zzgkg.class
            r0 = 1
            boolean r1 = com.google.android.gms.internal.ads.zzgnw.zza(r0)
            if (r1 == 0) goto La6
            int r1 = com.google.android.gms.internal.ads.zzgmx.zza
            com.google.android.gms.internal.ads.zzgpq r1 = com.google.android.gms.internal.ads.zzgpq.zzc()
            com.google.android.gms.internal.ads.zzgmx.zze(r1)
            boolean r1 = zzb()
            if (r1 == 0) goto La5
            com.google.android.gms.internal.ads.zzgpn r1 = com.google.android.gms.internal.ads.zzgpn.zza()
            com.google.android.gms.internal.ads.zzgqd r2 = com.google.android.gms.internal.ads.zzgkb.zza
            r1.zze(r2)
            com.google.android.gms.internal.ads.zzgpm r1 = com.google.android.gms.internal.ads.zzgpm.zzb()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.google.android.gms.internal.ads.zzgkd r3 = new com.google.android.gms.internal.ads.zzgkd
            r4 = 0
            r3.<init>(r4)
            r5 = 16
            r3.zza(r5)
            com.google.android.gms.internal.ads.zzgke r6 = com.google.android.gms.internal.ads.zzgke.zza
            r3.zzb(r6)
            com.google.android.gms.internal.ads.zzgkg r3 = r3.zzc()
            java.lang.String r7 = "AES128_GCM_SIV"
            r2.put(r7, r3)
            com.google.android.gms.internal.ads.zzgkd r3 = new com.google.android.gms.internal.ads.zzgkd
            r3.<init>(r4)
            r3.zza(r5)
            com.google.android.gms.internal.ads.zzgke r5 = com.google.android.gms.internal.ads.zzgke.zzc
            r3.zzb(r5)
            com.google.android.gms.internal.ads.zzgkg r3 = r3.zzc()
            java.lang.String r7 = "AES128_GCM_SIV_RAW"
            r2.put(r7, r3)
            com.google.android.gms.internal.ads.zzgkd r3 = new com.google.android.gms.internal.ads.zzgkd
            r3.<init>(r4)
            r7 = 32
            r3.zza(r7)
            r3.zzb(r6)
            com.google.android.gms.internal.ads.zzgkg r3 = r3.zzc()
            java.lang.String r6 = "AES256_GCM_SIV"
            r2.put(r6, r3)
            com.google.android.gms.internal.ads.zzgkd r3 = new com.google.android.gms.internal.ads.zzgkd
            r3.<init>(r4)
            r3.zza(r7)
            r3.zzb(r5)
            com.google.android.gms.internal.ads.zzgkg r3 = r3.zzc()
            java.lang.String r4 = "AES256_GCM_SIV_RAW"
            r2.put(r4, r3)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            r1.zzd(r2)
            com.google.android.gms.internal.ads.zzgpi r1 = com.google.android.gms.internal.ads.zzgpi.zza()
            com.google.android.gms.internal.ads.zzgph r2 = com.google.android.gms.internal.ads.zzgkb.zzc
            r1.zzb(r2, r8)
            com.google.android.gms.internal.ads.zzgpg r1 = com.google.android.gms.internal.ads.zzgpg.zzb()
            com.google.android.gms.internal.ads.zzgpf r2 = com.google.android.gms.internal.ads.zzgkb.zzb
            r1.zzc(r2, r8)
            com.google.android.gms.internal.ads.zzgoe r8 = com.google.android.gms.internal.ads.zzgoe.zzc()
            com.google.android.gms.internal.ads.zzghe r1 = com.google.android.gms.internal.ads.zzgkb.zzd
            r8.zzd(r1, r0)
        La5:
            return
        La6:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Registering AES GCM SIV is not supported in FIPS mode"
            r8.<init>(r0)
            throw r8
    }

    private static boolean zzb() {
            java.lang.String r0 = "AES/GCM-SIV/NoPadding"
            javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Throwable -> L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }
}
