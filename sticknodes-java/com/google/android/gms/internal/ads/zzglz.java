package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzglz {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgqd zzb = null;
    private static final com.google.android.gms.internal.ads.zzghe zzc = null;
    private static final com.google.android.gms.internal.ads.zzgph zzd = null;
    private static final com.google.android.gms.internal.ads.zzgpf zze = null;

    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzggt> r0 = com.google.android.gms.internal.ads.zzggt.class
            com.google.android.gms.internal.ads.zzglw r1 = new com.google.android.gms.internal.ads.zzglw
            r1.<init>()
            java.lang.Class<com.google.android.gms.internal.ads.zzglv> r2 = com.google.android.gms.internal.ads.zzglv.class
            com.google.android.gms.internal.ads.zzgqd r1 = com.google.android.gms.internal.ads.zzgqd.zzb(r1, r2, r0)
            com.google.android.gms.internal.ads.zzglz.zzb = r1
            com.google.android.gms.internal.ads.zzgwa r1 = com.google.android.gms.internal.ads.zzgwa.zzb
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzgxl.zzg()
            java.lang.String r3 = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"
            com.google.android.gms.internal.ads.zzghe r0 = com.google.android.gms.internal.ads.zzgon.zzd(r3, r0, r1, r2)
            com.google.android.gms.internal.ads.zzglz.zzc = r0
            com.google.android.gms.internal.ads.zzglx r0 = new com.google.android.gms.internal.ads.zzglx
            r0.<init>()
            com.google.android.gms.internal.ads.zzglz.zzd = r0
            com.google.android.gms.internal.ads.zzgly r0 = new com.google.android.gms.internal.ads.zzgly
            r0.<init>()
            com.google.android.gms.internal.ads.zzglz.zze = r0
            return
    }

    public static void zza(boolean r5) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.android.gms.internal.ads.zzgmb> r5 = com.google.android.gms.internal.ads.zzgmb.class
            r0 = 1
            boolean r1 = com.google.android.gms.internal.ads.zzgnw.zza(r0)
            if (r1 == 0) goto L5d
            int r1 = com.google.android.gms.internal.ads.zzgnt.zza
            com.google.android.gms.internal.ads.zzgpq r1 = com.google.android.gms.internal.ads.zzgpq.zzc()
            com.google.android.gms.internal.ads.zzgnt.zze(r1)
            com.google.android.gms.internal.ads.zzgpn r1 = com.google.android.gms.internal.ads.zzgpn.zza()
            com.google.android.gms.internal.ads.zzgqd r2 = com.google.android.gms.internal.ads.zzglz.zzb
            r1.zze(r2)
            com.google.android.gms.internal.ads.zzgpm r1 = com.google.android.gms.internal.ads.zzgpm.zzb()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.google.android.gms.internal.ads.zzgma r3 = com.google.android.gms.internal.ads.zzgma.zza
            com.google.android.gms.internal.ads.zzgmb r3 = com.google.android.gms.internal.ads.zzgmb.zzc(r3)
            java.lang.String r4 = "XCHACHA20_POLY1305"
            r2.put(r4, r3)
            com.google.android.gms.internal.ads.zzgma r3 = com.google.android.gms.internal.ads.zzgma.zzc
            com.google.android.gms.internal.ads.zzgmb r3 = com.google.android.gms.internal.ads.zzgmb.zzc(r3)
            java.lang.String r4 = "XCHACHA20_POLY1305_RAW"
            r2.put(r4, r3)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            r1.zzd(r2)
            com.google.android.gms.internal.ads.zzgpg r1 = com.google.android.gms.internal.ads.zzgpg.zzb()
            com.google.android.gms.internal.ads.zzgpf r2 = com.google.android.gms.internal.ads.zzglz.zze
            r1.zzc(r2, r5)
            com.google.android.gms.internal.ads.zzgpi r1 = com.google.android.gms.internal.ads.zzgpi.zza()
            com.google.android.gms.internal.ads.zzgph r2 = com.google.android.gms.internal.ads.zzglz.zzd
            r1.zzb(r2, r5)
            com.google.android.gms.internal.ads.zzgoe r5 = com.google.android.gms.internal.ads.zzgoe.zzc()
            com.google.android.gms.internal.ads.zzghe r1 = com.google.android.gms.internal.ads.zzglz.zzc
            r5.zzd(r1, r0)
            return
        L5d:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Registering XChaCha20Poly1305 is not supported in FIPS mode"
            r5.<init>(r0)
            throw r5
    }
}
