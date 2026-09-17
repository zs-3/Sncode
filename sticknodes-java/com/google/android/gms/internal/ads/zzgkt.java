package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgkt {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzghe zzb = null;
    private static final com.google.android.gms.internal.ads.zzgpf zzc = null;
    private static final com.google.android.gms.internal.ads.zzgqd zzd = null;

    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzggt> r0 = com.google.android.gms.internal.ads.zzggt.class
            com.google.android.gms.internal.ads.zzgwa r1 = com.google.android.gms.internal.ads.zzgwa.zzb
            com.google.android.gms.internal.ads.zzhcx r2 = com.google.android.gms.internal.ads.zzgxb.zzg()
            java.lang.String r3 = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"
            com.google.android.gms.internal.ads.zzghe r1 = com.google.android.gms.internal.ads.zzgon.zzd(r3, r0, r1, r2)
            com.google.android.gms.internal.ads.zzgkt.zzb = r1
            com.google.android.gms.internal.ads.zzgkr r1 = new com.google.android.gms.internal.ads.zzgkr
            r1.<init>()
            com.google.android.gms.internal.ads.zzgkt.zzc = r1
            com.google.android.gms.internal.ads.zzgks r1 = new com.google.android.gms.internal.ads.zzgks
            r1.<init>()
            java.lang.Class<com.google.android.gms.internal.ads.zzglc> r2 = com.google.android.gms.internal.ads.zzglc.class
            com.google.android.gms.internal.ads.zzgqd r0 = com.google.android.gms.internal.ads.zzgqd.zzb(r1, r2, r0)
            com.google.android.gms.internal.ads.zzgkt.zzd = r0
            return
    }

    public static void zza(boolean r3) throws java.security.GeneralSecurityException {
            r3 = 1
            boolean r0 = com.google.android.gms.internal.ads.zzgnw.zza(r3)
            if (r0 == 0) goto L2e
            int r0 = com.google.android.gms.internal.ads.zzgln.zza
            com.google.android.gms.internal.ads.zzgpq r0 = com.google.android.gms.internal.ads.zzgpq.zzc()
            com.google.android.gms.internal.ads.zzgln.zze(r0)
            com.google.android.gms.internal.ads.zzgpg r0 = com.google.android.gms.internal.ads.zzgpg.zzb()
            com.google.android.gms.internal.ads.zzgpf r1 = com.google.android.gms.internal.ads.zzgkt.zzc
            java.lang.Class<com.google.android.gms.internal.ads.zzgli> r2 = com.google.android.gms.internal.ads.zzgli.class
            r0.zzc(r1, r2)
            com.google.android.gms.internal.ads.zzgpn r0 = com.google.android.gms.internal.ads.zzgpn.zza()
            com.google.android.gms.internal.ads.zzgqd r1 = com.google.android.gms.internal.ads.zzgkt.zzd
            r0.zze(r1)
            com.google.android.gms.internal.ads.zzgoe r0 = com.google.android.gms.internal.ads.zzgoe.zzc()
            com.google.android.gms.internal.ads.zzghe r1 = com.google.android.gms.internal.ads.zzgkt.zzb
            r0.zzd(r1, r3)
            return
        L2e:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Registering KMS Envelope AEAD is not supported in FIPS mode"
            r3.<init>(r0)
            throw r3
    }
}
