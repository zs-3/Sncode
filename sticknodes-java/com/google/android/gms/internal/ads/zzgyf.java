package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgyf {
    public static final com.google.android.gms.internal.ads.zzgyf zza = null;
    public static final com.google.android.gms.internal.ads.zzgyf zzb = null;
    private final com.google.android.gms.internal.ads.zzgye zzc;

    static {
            com.google.android.gms.internal.ads.zzgyf r0 = new com.google.android.gms.internal.ads.zzgyf
            com.google.android.gms.internal.ads.zzgyg r1 = new com.google.android.gms.internal.ads.zzgyg
            r1.<init>()
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgyf.zza = r0
            com.google.android.gms.internal.ads.zzgyf r0 = new com.google.android.gms.internal.ads.zzgyf
            com.google.android.gms.internal.ads.zzgyk r1 = new com.google.android.gms.internal.ads.zzgyk
            r1.<init>()
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgyf.zzb = r0
            com.google.android.gms.internal.ads.zzgyf r0 = new com.google.android.gms.internal.ads.zzgyf
            com.google.android.gms.internal.ads.zzgym r1 = new com.google.android.gms.internal.ads.zzgym
            r1.<init>()
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgyf r0 = new com.google.android.gms.internal.ads.zzgyf
            com.google.android.gms.internal.ads.zzgyl r1 = new com.google.android.gms.internal.ads.zzgyl
            r1.<init>()
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgyf r0 = new com.google.android.gms.internal.ads.zzgyf
            com.google.android.gms.internal.ads.zzgyh r1 = new com.google.android.gms.internal.ads.zzgyh
            r1.<init>()
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgyf r0 = new com.google.android.gms.internal.ads.zzgyf
            com.google.android.gms.internal.ads.zzgyj r1 = new com.google.android.gms.internal.ads.zzgyj
            r1.<init>()
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgyf r0 = new com.google.android.gms.internal.ads.zzgyf
            com.google.android.gms.internal.ads.zzgyi r1 = new com.google.android.gms.internal.ads.zzgyi
            r1.<init>()
            r0.<init>(r1)
            return
    }

    public zzgyf(com.google.android.gms.internal.ads.zzgyn r4) {
            r3 = this;
            r3.<init>()
            boolean r0 = com.google.android.gms.internal.ads.zzgnx.zzb()
            r1 = 0
            if (r0 != 0) goto L26
            java.lang.String r0 = "java.vendor"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "The Android Project"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L20
            com.google.android.gms.internal.ads.zzgxz r0 = new com.google.android.gms.internal.ads.zzgxz
            r0.<init>(r4, r1)
        L1d:
            r3.zzc = r0
            return
        L20:
            com.google.android.gms.internal.ads.zzgyb r0 = new com.google.android.gms.internal.ads.zzgyb
            r0.<init>(r4, r1)
            goto L1d
        L26:
            com.google.android.gms.internal.ads.zzgyd r0 = new com.google.android.gms.internal.ads.zzgyd
            r0.<init>(r4, r1)
            goto L1d
    }

    public static java.util.List zzb(java.lang.String... r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r3.length
            if (r1 >= r2) goto L17
            r2 = r3[r1]
            java.security.Provider r2 = java.security.Security.getProvider(r2)
            if (r2 == 0) goto L14
            r0.add(r2)
        L14:
            int r1 = r1 + 1
            goto L6
        L17:
            return r0
    }

    public final java.lang.Object zza(java.lang.String r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.android.gms.internal.ads.zzgye r0 = r1.zzc
            java.lang.Object r2 = r0.zza(r2)
            return r2
    }
}
