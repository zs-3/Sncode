package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgqf {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    private zzgqf() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzb = r0
            return
    }

    /* synthetic */ zzgqf(com.google.android.gms.internal.ads.zzgqe r1) {
            r0 = this;
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zza = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzb = r1
            return
    }

    /* synthetic */ zzgqf(com.google.android.gms.internal.ads.zzgqj r2, com.google.android.gms.internal.ads.zzgqe r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            java.util.Map r0 = com.google.android.gms.internal.ads.zzgqj.zzd(r2)
            r3.<init>(r0)
            r1.zza = r3
            java.util.HashMap r3 = new java.util.HashMap
            java.util.Map r2 = com.google.android.gms.internal.ads.zzgqj.zze(r2)
            r3.<init>(r2)
            r1.zzb = r3
            return
    }

    static /* bridge */ /* synthetic */ java.util.Map zzc(com.google.android.gms.internal.ads.zzgqf r0) {
            java.util.Map r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzd(com.google.android.gms.internal.ads.zzgqf r0) {
            java.util.Map r0 = r0.zzb
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgqf zza(com.google.android.gms.internal.ads.zzgqd r5) throws java.security.GeneralSecurityException {
            r4 = this;
            java.lang.String r0 = "primitive constructor must be non-null"
            java.util.Objects.requireNonNull(r5, r0)
            com.google.android.gms.internal.ads.zzgqh r0 = new com.google.android.gms.internal.ads.zzgqh
            java.lang.Class r1 = r5.zzc()
            java.lang.Class r2 = r5.zzd()
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.Map r1 = r4.zza
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L40
            java.util.Map r1 = r4.zza
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.ads.zzgqd r1 = (com.google.android.gms.internal.ads.zzgqd) r1
            boolean r2 = r1.equals(r5)
            if (r2 == 0) goto L30
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L30
            goto L45
        L30:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: "
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            throw r5
        L40:
            java.util.Map r1 = r4.zza
            r1.put(r0, r5)
        L45:
            return r4
    }

    public final com.google.android.gms.internal.ads.zzgqf zzb(com.google.android.gms.internal.ads.zzgqq r4) throws java.security.GeneralSecurityException {
            r3 = this;
            java.util.Map r0 = r3.zzb
            java.lang.Class r1 = r4.zzb()
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L31
            java.util.Map r0 = r3.zzb
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzgqq r0 = (com.google.android.gms.internal.ads.zzgqq) r0
            boolean r2 = r0.equals(r4)
            if (r2 == 0) goto L21
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L21
            goto L36
        L21:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"
            java.lang.String r0 = r1.concat(r0)
            r4.<init>(r0)
            throw r4
        L31:
            java.util.Map r0 = r3.zzb
            r0.put(r1, r4)
        L36:
            return r3
    }
}
