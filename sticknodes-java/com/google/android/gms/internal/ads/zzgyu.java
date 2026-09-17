package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgyu implements com.google.android.gms.internal.ads.zzghr {
    private static final byte[] zza = null;
    private final com.google.android.gms.internal.ads.zzgto zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    static {
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r1
            com.google.android.gms.internal.ads.zzgyu.zza = r0
            return
    }

    private zzgyu(com.google.android.gms.internal.ads.zzgrk r4) throws java.security.GeneralSecurityException {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzgyr r0 = new com.google.android.gms.internal.ads.zzgyr
            com.google.android.gms.internal.ads.zzgyy r1 = r4.zzd()
            com.google.android.gms.internal.ads.zzghw r2 = com.google.android.gms.internal.ads.zzghc.zza()
            byte[] r1 = r1.zzd(r2)
            r0.<init>(r1)
            r3.zzb = r0
            com.google.android.gms.internal.ads.zzgrt r0 = r4.zzb()
            int r0 = r0.zzb()
            r3.zzc = r0
            com.google.android.gms.internal.ads.zzgyx r0 = r4.zzc()
            byte[] r0 = r0.zzc()
            r3.zzd = r0
            com.google.android.gms.internal.ads.zzgrt r4 = r4.zzb()
            com.google.android.gms.internal.ads.zzgrr r4 = r4.zzf()
            com.google.android.gms.internal.ads.zzgrr r0 = com.google.android.gms.internal.ads.zzgrr.zzc
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L44
            byte[] r4 = com.google.android.gms.internal.ads.zzgyu.zza
            r0 = 1
            byte[] r4 = java.util.Arrays.copyOf(r4, r0)
            r3.zze = r4
            return
        L44:
            r4 = 0
            byte[] r4 = new byte[r4]
            r3.zze = r4
            return
    }

    private zzgyu(com.google.android.gms.internal.ads.zzgsb r6) throws java.security.GeneralSecurityException {
            r5 = this;
            r5.<init>()
            com.google.android.gms.internal.ads.zzgyt r0 = new com.google.android.gms.internal.ads.zzgyt
            com.google.android.gms.internal.ads.zzgsm r1 = r6.zzb()
            com.google.android.gms.internal.ads.zzgsj r1 = r1.zzf()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            com.google.android.gms.internal.ads.zzgyy r3 = r6.zzd()
            com.google.android.gms.internal.ads.zzghw r4 = com.google.android.gms.internal.ads.zzghc.zza()
            byte[] r3 = r3.zzd(r4)
            java.lang.String r4 = "HMAC"
            r2.<init>(r3, r4)
            java.lang.String r1 = r4.concat(r1)
            r0.<init>(r1, r2)
            r5.zzb = r0
            com.google.android.gms.internal.ads.zzgsm r0 = r6.zzb()
            int r0 = r0.zzb()
            r5.zzc = r0
            com.google.android.gms.internal.ads.zzgyx r0 = r6.zzc()
            byte[] r0 = r0.zzc()
            r5.zzd = r0
            com.google.android.gms.internal.ads.zzgsm r6 = r6.zzb()
            com.google.android.gms.internal.ads.zzgsk r6 = r6.zzg()
            com.google.android.gms.internal.ads.zzgsk r0 = com.google.android.gms.internal.ads.zzgsk.zzc
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L5b
            byte[] r6 = com.google.android.gms.internal.ads.zzgyu.zza
            r0 = 1
            byte[] r6 = java.util.Arrays.copyOf(r6, r0)
            r5.zze = r6
            return
        L5b:
            r6 = 0
            byte[] r6 = new byte[r6]
            r5.zze = r6
            return
    }

    public zzgyu(com.google.android.gms.internal.ads.zzgto r3, int r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            r2.zzb = r3
            r2.zzc = r4
            r0 = 0
            byte[] r1 = new byte[r0]
            r2.zzd = r1
            byte[] r1 = new byte[r0]
            r2.zze = r1
            byte[] r0 = new byte[r0]
            r3.zza(r0, r4)
            return
    }

    public static com.google.android.gms.internal.ads.zzghr zza(com.google.android.gms.internal.ads.zzgrk r1) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgyu r0 = new com.google.android.gms.internal.ads.zzgyu
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzghr zzb(com.google.android.gms.internal.ads.zzgsb r1) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgyu r0 = new com.google.android.gms.internal.ads.zzgyu
            r0.<init>(r1)
            return r0
    }

    public final byte[] zzc(byte[] r7) throws java.security.GeneralSecurityException {
            r6 = this;
            byte[] r0 = r6.zze
            int r1 = r0.length
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 <= 0) goto L27
            byte[][] r1 = new byte[r4][]
            byte[] r5 = r6.zzd
            r1[r3] = r5
            com.google.android.gms.internal.ads.zzgto r5 = r6.zzb
            byte[][] r4 = new byte[r4][]
            r4[r3] = r7
            r4[r2] = r0
            byte[] r7 = com.google.android.gms.internal.ads.zzgxv.zzb(r4)
            int r0 = r6.zzc
            byte[] r7 = r5.zza(r7, r0)
            r1[r2] = r7
            byte[] r7 = com.google.android.gms.internal.ads.zzgxv.zzb(r1)
            return r7
        L27:
            byte[][] r0 = new byte[r4][]
            byte[] r1 = r6.zzd
            r0[r3] = r1
            com.google.android.gms.internal.ads.zzgto r1 = r6.zzb
            int r3 = r6.zzc
            byte[] r7 = r1.zza(r7, r3)
            r0[r2] = r7
            byte[] r7 = com.google.android.gms.internal.ads.zzgxv.zzb(r0)
            return r7
    }
}
