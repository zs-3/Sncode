package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgqj {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    /* synthetic */ zzgqj(com.google.android.gms.internal.ads.zzgqf r2, com.google.android.gms.internal.ads.zzgqi r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            java.util.Map r0 = com.google.android.gms.internal.ads.zzgqf.zzc(r2)
            r3.<init>(r0)
            r1.zza = r3
            java.util.HashMap r3 = new java.util.HashMap
            java.util.Map r2 = com.google.android.gms.internal.ads.zzgqf.zzd(r2)
            r3.<init>(r2)
            r1.zzb = r3
            return
    }

    static /* bridge */ /* synthetic */ java.util.Map zzd(com.google.android.gms.internal.ads.zzgqj r0) {
            java.util.Map r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zze(com.google.android.gms.internal.ads.zzgqj r0) {
            java.util.Map r0 = r0.zzb
            return r0
    }

    public final java.lang.Class zza(java.lang.Class r4) throws java.security.GeneralSecurityException {
            r3 = this;
            java.util.Map r0 = r3.zzb
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L15
            java.util.Map r0 = r3.zzb
            java.lang.Object r4 = r0.get(r4)
            com.google.android.gms.internal.ads.zzgqq r4 = (com.google.android.gms.internal.ads.zzgqq) r4
            java.lang.Class r4 = r4.zza()
            return r4
        L15:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No input primitive class for "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " available"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final java.lang.Object zzb(com.google.android.gms.internal.ads.zzghd r4, java.lang.Class r5) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.android.gms.internal.ads.zzgqh r0 = new com.google.android.gms.internal.ads.zzgqh
            java.lang.Class r1 = r4.getClass()
            r2 = 0
            r0.<init>(r1, r5, r2)
            java.util.Map r5 = r3.zza
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L1f
            java.util.Map r5 = r3.zza
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.zzgqd r5 = (com.google.android.gms.internal.ads.zzgqd) r5
            java.lang.Object r4 = r5.zza(r4)
            return r4
        L1f:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No PrimitiveConstructor for "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " available"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    public final java.lang.Object zzc(com.google.android.gms.internal.ads.zzgqp r3, java.lang.Class r4) throws java.security.GeneralSecurityException {
            r2 = this;
            java.util.Map r0 = r2.zzb
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L39
            java.util.Map r0 = r2.zzb
            java.lang.Object r4 = r0.get(r4)
            com.google.android.gms.internal.ads.zzgqq r4 = (com.google.android.gms.internal.ads.zzgqq) r4
            java.lang.Class r0 = r3.zzd()
            java.lang.Class r1 = r4.zza()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
            java.lang.Class r0 = r4.zza()
            java.lang.Class r1 = r3.zzd()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
            java.lang.Object r3 = r4.zzc(r3)
            return r3
        L31:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet"
            r3.<init>(r4)
            throw r3
        L39:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "No wrapper found for "
            java.lang.String r4 = r0.concat(r4)
            r3.<init>(r4)
            throw r3
    }
}
