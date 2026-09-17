package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgjb {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgqd zzb = null;
    private static final com.google.android.gms.internal.ads.zzghe zzc = null;
    private static final com.google.android.gms.internal.ads.zzgpf zzd = null;

    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzggt> r0 = com.google.android.gms.internal.ads.zzggt.class
            com.google.android.gms.internal.ads.zzgiz r1 = new com.google.android.gms.internal.ads.zzgiz
            r1.<init>()
            java.lang.Class<com.google.android.gms.internal.ads.zzgiy> r2 = com.google.android.gms.internal.ads.zzgiy.class
            com.google.android.gms.internal.ads.zzgqd r1 = com.google.android.gms.internal.ads.zzgqd.zzb(r1, r2, r0)
            com.google.android.gms.internal.ads.zzgjb.zzb = r1
            com.google.android.gms.internal.ads.zzgwa r1 = com.google.android.gms.internal.ads.zzgwa.zzb
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzgup.zzh()
            java.lang.String r3 = "type.googleapis.com/google.crypto.tink.AesEaxKey"
            com.google.android.gms.internal.ads.zzghe r0 = com.google.android.gms.internal.ads.zzgon.zzd(r3, r0, r1, r2)
            com.google.android.gms.internal.ads.zzgjb.zzc = r0
            com.google.android.gms.internal.ads.zzgja r0 = new com.google.android.gms.internal.ads.zzgja
            r0.<init>()
            com.google.android.gms.internal.ads.zzgjb.zzd = r0
            return
    }

    public static void zza(boolean r7) throws java.security.GeneralSecurityException {
            r7 = 1
            boolean r0 = com.google.android.gms.internal.ads.zzgnw.zza(r7)
            if (r0 == 0) goto L87
            int r0 = com.google.android.gms.internal.ads.zzgml.zza
            com.google.android.gms.internal.ads.zzgpq r0 = com.google.android.gms.internal.ads.zzgpq.zzc()
            com.google.android.gms.internal.ads.zzgml.zze(r0)
            com.google.android.gms.internal.ads.zzgpn r0 = com.google.android.gms.internal.ads.zzgpn.zza()
            com.google.android.gms.internal.ads.zzgqd r1 = com.google.android.gms.internal.ads.zzgjb.zzb
            r0.zze(r1)
            com.google.android.gms.internal.ads.zzgpm r0 = com.google.android.gms.internal.ads.zzgpm.zzb()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.gms.internal.ads.zzgjg r2 = com.google.android.gms.internal.ads.zzglu.zzc
            java.lang.String r3 = "AES128_EAX"
            r1.put(r3, r2)
            com.google.android.gms.internal.ads.zzgjd r2 = new com.google.android.gms.internal.ads.zzgjd
            r3 = 0
            r2.<init>(r3)
            r4 = 16
            r2.zza(r4)
            r2.zzb(r4)
            r2.zzc(r4)
            com.google.android.gms.internal.ads.zzgje r5 = com.google.android.gms.internal.ads.zzgje.zzc
            r2.zzd(r5)
            com.google.android.gms.internal.ads.zzgjg r2 = r2.zze()
            java.lang.String r6 = "AES128_EAX_RAW"
            r1.put(r6, r2)
            com.google.android.gms.internal.ads.zzgjg r2 = com.google.android.gms.internal.ads.zzglu.zzd
            java.lang.String r6 = "AES256_EAX"
            r1.put(r6, r2)
            com.google.android.gms.internal.ads.zzgjd r2 = new com.google.android.gms.internal.ads.zzgjd
            r2.<init>(r3)
            r2.zza(r4)
            r3 = 32
            r2.zzb(r3)
            r2.zzc(r4)
            r2.zzd(r5)
            com.google.android.gms.internal.ads.zzgjg r2 = r2.zze()
            java.lang.String r3 = "AES256_EAX_RAW"
            r1.put(r3, r2)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.zzd(r1)
            com.google.android.gms.internal.ads.zzgpg r0 = com.google.android.gms.internal.ads.zzgpg.zzb()
            com.google.android.gms.internal.ads.zzgpf r1 = com.google.android.gms.internal.ads.zzgjb.zzd
            java.lang.Class<com.google.android.gms.internal.ads.zzgjg> r2 = com.google.android.gms.internal.ads.zzgjg.class
            r0.zzc(r1, r2)
            com.google.android.gms.internal.ads.zzgoe r0 = com.google.android.gms.internal.ads.zzgoe.zzc()
            com.google.android.gms.internal.ads.zzghe r1 = com.google.android.gms.internal.ads.zzgjb.zzc
            r0.zzd(r1, r7)
            return
        L87:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Registering AES EAX is not supported in FIPS mode"
            r7.<init>(r0)
            throw r7
    }
}
