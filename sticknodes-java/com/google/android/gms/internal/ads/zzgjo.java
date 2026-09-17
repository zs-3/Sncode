package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgjo {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgqd zzb = null;
    private static final com.google.android.gms.internal.ads.zzghe zzc = null;
    private static final com.google.android.gms.internal.ads.zzgph zzd = null;
    private static final com.google.android.gms.internal.ads.zzgpf zze = null;
    private static final int zzf = 0;

    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzggt> r0 = com.google.android.gms.internal.ads.zzggt.class
            com.google.android.gms.internal.ads.zzgjl r1 = new com.google.android.gms.internal.ads.zzgjl
            r1.<init>()
            java.lang.Class<com.google.android.gms.internal.ads.zzgjk> r2 = com.google.android.gms.internal.ads.zzgjk.class
            com.google.android.gms.internal.ads.zzgqd r1 = com.google.android.gms.internal.ads.zzgqd.zzb(r1, r2, r0)
            com.google.android.gms.internal.ads.zzgjo.zzb = r1
            com.google.android.gms.internal.ads.zzgwa r1 = com.google.android.gms.internal.ads.zzgwa.zzb
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzguy.zzg()
            java.lang.String r3 = "type.googleapis.com/google.crypto.tink.AesGcmKey"
            com.google.android.gms.internal.ads.zzghe r0 = com.google.android.gms.internal.ads.zzgon.zzd(r3, r0, r1, r2)
            com.google.android.gms.internal.ads.zzgjo.zzc = r0
            com.google.android.gms.internal.ads.zzgjm r0 = new com.google.android.gms.internal.ads.zzgjm
            r0.<init>()
            com.google.android.gms.internal.ads.zzgjo.zzd = r0
            com.google.android.gms.internal.ads.zzgjn r0 = new com.google.android.gms.internal.ads.zzgjn
            r0.<init>()
            com.google.android.gms.internal.ads.zzgjo.zze = r0
            r0 = 2
            com.google.android.gms.internal.ads.zzgjo.zzf = r0
            return
    }

    public static void zza(boolean r9) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.android.gms.internal.ads.zzgjt> r9 = com.google.android.gms.internal.ads.zzgjt.class
            int r0 = com.google.android.gms.internal.ads.zzgjo.zzf
            boolean r1 = com.google.android.gms.internal.ads.zzgnw.zza(r0)
            if (r1 == 0) goto L94
            int r1 = com.google.android.gms.internal.ads.zzgms.zza
            com.google.android.gms.internal.ads.zzgpq r1 = com.google.android.gms.internal.ads.zzgpq.zzc()
            com.google.android.gms.internal.ads.zzgms.zze(r1)
            com.google.android.gms.internal.ads.zzgpn r1 = com.google.android.gms.internal.ads.zzgpn.zza()
            com.google.android.gms.internal.ads.zzgqd r2 = com.google.android.gms.internal.ads.zzgjo.zzb
            r1.zze(r2)
            com.google.android.gms.internal.ads.zzgpm r1 = com.google.android.gms.internal.ads.zzgpm.zzb()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.google.android.gms.internal.ads.zzgjt r3 = com.google.android.gms.internal.ads.zzglu.zza
            java.lang.String r4 = "AES128_GCM"
            r2.put(r4, r3)
            com.google.android.gms.internal.ads.zzgjq r3 = new com.google.android.gms.internal.ads.zzgjq
            r4 = 0
            r3.<init>(r4)
            r5 = 12
            r3.zza(r5)
            r6 = 16
            r3.zzb(r6)
            r3.zzc(r6)
            com.google.android.gms.internal.ads.zzgjr r7 = com.google.android.gms.internal.ads.zzgjr.zzc
            r3.zzd(r7)
            com.google.android.gms.internal.ads.zzgjt r3 = r3.zze()
            java.lang.String r8 = "AES128_GCM_RAW"
            r2.put(r8, r3)
            com.google.android.gms.internal.ads.zzgjt r3 = com.google.android.gms.internal.ads.zzglu.zzb
            java.lang.String r8 = "AES256_GCM"
            r2.put(r8, r3)
            com.google.android.gms.internal.ads.zzgjq r3 = new com.google.android.gms.internal.ads.zzgjq
            r3.<init>(r4)
            r3.zza(r5)
            r4 = 32
            r3.zzb(r4)
            r3.zzc(r6)
            r3.zzd(r7)
            com.google.android.gms.internal.ads.zzgjt r3 = r3.zze()
            java.lang.String r4 = "AES256_GCM_RAW"
            r2.put(r4, r3)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            r1.zzd(r2)
            com.google.android.gms.internal.ads.zzgpi r1 = com.google.android.gms.internal.ads.zzgpi.zza()
            com.google.android.gms.internal.ads.zzgph r2 = com.google.android.gms.internal.ads.zzgjo.zzd
            r1.zzb(r2, r9)
            com.google.android.gms.internal.ads.zzgpg r1 = com.google.android.gms.internal.ads.zzgpg.zzb()
            com.google.android.gms.internal.ads.zzgpf r2 = com.google.android.gms.internal.ads.zzgjo.zze
            r1.zzc(r2, r9)
            com.google.android.gms.internal.ads.zzgoe r9 = com.google.android.gms.internal.ads.zzgoe.zzc()
            com.google.android.gms.internal.ads.zzghe r1 = com.google.android.gms.internal.ads.zzgjo.zzc
            r2 = 1
            r9.zzf(r1, r0, r2)
            return
        L94:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."
            r9.<init>(r0)
            throw r9
    }
}
