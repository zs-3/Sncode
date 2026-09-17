package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgkk {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgqd zzb = null;
    private static final com.google.android.gms.internal.ads.zzgpf zzc = null;
    private static final com.google.android.gms.internal.ads.zzghe zzd = null;

    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzggt> r0 = com.google.android.gms.internal.ads.zzggt.class
            com.google.android.gms.internal.ads.zzgki r1 = new com.google.android.gms.internal.ads.zzgki
            r1.<init>()
            java.lang.Class<com.google.android.gms.internal.ads.zzgkh> r2 = com.google.android.gms.internal.ads.zzgkh.class
            com.google.android.gms.internal.ads.zzgqd r1 = com.google.android.gms.internal.ads.zzgqd.zzb(r1, r2, r0)
            com.google.android.gms.internal.ads.zzgkk.zzb = r1
            com.google.android.gms.internal.ads.zzgkj r1 = new com.google.android.gms.internal.ads.zzgkj
            r1.<init>()
            com.google.android.gms.internal.ads.zzgkk.zzc = r1
            com.google.android.gms.internal.ads.zzgwa r1 = com.google.android.gms.internal.ads.zzgwa.zzb
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzgvk.zzg()
            java.lang.String r3 = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"
            com.google.android.gms.internal.ads.zzghe r0 = com.google.android.gms.internal.ads.zzgon.zzd(r3, r0, r1, r2)
            com.google.android.gms.internal.ads.zzgkk.zzd = r0
            return
    }

    public static void zza(boolean r4) throws java.security.GeneralSecurityException {
            r4 = 1
            boolean r0 = com.google.android.gms.internal.ads.zzgnw.zza(r4)
            if (r0 == 0) goto L54
            int r0 = com.google.android.gms.internal.ads.zzgne.zza
            com.google.android.gms.internal.ads.zzgpq r0 = com.google.android.gms.internal.ads.zzgpq.zzc()
            com.google.android.gms.internal.ads.zzgne.zze(r0)
            com.google.android.gms.internal.ads.zzgpn r0 = com.google.android.gms.internal.ads.zzgpn.zza()
            com.google.android.gms.internal.ads.zzgqd r1 = com.google.android.gms.internal.ads.zzgkk.zzb
            r0.zze(r1)
            com.google.android.gms.internal.ads.zzgpg r0 = com.google.android.gms.internal.ads.zzgpg.zzb()
            com.google.android.gms.internal.ads.zzgpf r1 = com.google.android.gms.internal.ads.zzgkk.zzc
            java.lang.Class<com.google.android.gms.internal.ads.zzgkm> r2 = com.google.android.gms.internal.ads.zzgkm.class
            r0.zzc(r1, r2)
            com.google.android.gms.internal.ads.zzgpm r0 = com.google.android.gms.internal.ads.zzgpm.zzb()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.gms.internal.ads.zzgkl r2 = com.google.android.gms.internal.ads.zzgkl.zza
            com.google.android.gms.internal.ads.zzgkm r2 = com.google.android.gms.internal.ads.zzgkm.zzc(r2)
            java.lang.String r3 = "CHACHA20_POLY1305"
            r1.put(r3, r2)
            com.google.android.gms.internal.ads.zzgkl r2 = com.google.android.gms.internal.ads.zzgkl.zzc
            com.google.android.gms.internal.ads.zzgkm r2 = com.google.android.gms.internal.ads.zzgkm.zzc(r2)
            java.lang.String r3 = "CHACHA20_POLY1305_RAW"
            r1.put(r3, r2)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.zzd(r1)
            com.google.android.gms.internal.ads.zzgoe r0 = com.google.android.gms.internal.ads.zzgoe.zzc()
            com.google.android.gms.internal.ads.zzghe r1 = com.google.android.gms.internal.ads.zzgkk.zzd
            r0.zzd(r1, r4)
            return
        L54:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Registering ChaCha20Poly1305 is not supported in FIPS mode"
            r4.<init>(r0)
            throw r4
    }
}
