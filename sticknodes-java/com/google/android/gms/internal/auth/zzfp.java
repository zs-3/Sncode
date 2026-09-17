package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzfp implements com.google.android.gms.internal.auth.zzgj {
    private static final com.google.android.gms.internal.auth.zzfv zza = null;
    private final com.google.android.gms.internal.auth.zzfv zzb;

    static {
            com.google.android.gms.internal.auth.zzfn r0 = new com.google.android.gms.internal.auth.zzfn
            r0.<init>()
            com.google.android.gms.internal.auth.zzfp.zza = r0
            return
    }

    public zzfp() {
            r6 = this;
            com.google.android.gms.internal.auth.zzfo r0 = new com.google.android.gms.internal.auth.zzfo
            r1 = 2
            com.google.android.gms.internal.auth.zzfv[] r1 = new com.google.android.gms.internal.auth.zzfv[r1]
            com.google.android.gms.internal.auth.zzes r2 = com.google.android.gms.internal.auth.zzes.zza()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "com.google.protobuf.DescriptorMessageInfoFactory"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L24
            java.lang.String r4 = "getInstance"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L24
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L24
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L24
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L24
            com.google.android.gms.internal.auth.zzfv r2 = (com.google.android.gms.internal.auth.zzfv) r2     // Catch: java.lang.Exception -> L24
            goto L26
        L24:
            com.google.android.gms.internal.auth.zzfv r2 = com.google.android.gms.internal.auth.zzfp.zza
        L26:
            r3 = 1
            r1[r3] = r2
            r0.<init>(r1)
            r6.<init>()
            byte[] r1 = com.google.android.gms.internal.auth.zzfa.zzd
            r6.zzb = r0
            return
    }

    private static boolean zzb(com.google.android.gms.internal.auth.zzfu r1) {
            int r1 = r1.zzc()
            int r1 = r1 + (-1)
            r0 = 1
            if (r1 == r0) goto La
            return r0
        La:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.auth.zzgj
    public final com.google.android.gms.internal.auth.zzgi zza(java.lang.Class r10) {
            r9 = this;
            java.lang.Class<com.google.android.gms.internal.auth.zzev> r0 = com.google.android.gms.internal.auth.zzev.class
            com.google.android.gms.internal.auth.zzgk.zze(r10)
            com.google.android.gms.internal.auth.zzfv r1 = r9.zzb
            com.google.android.gms.internal.auth.zzfu r3 = r1.zzb(r10)
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L39
            boolean r10 = r0.isAssignableFrom(r10)
            if (r10 == 0) goto L28
            com.google.android.gms.internal.auth.zzgz r10 = com.google.android.gms.internal.auth.zzgk.zzb()
            com.google.android.gms.internal.auth.zzem r0 = com.google.android.gms.internal.auth.zzeo.zzb()
            com.google.android.gms.internal.auth.zzfx r1 = r3.zza()
            com.google.android.gms.internal.auth.zzgb r10 = com.google.android.gms.internal.auth.zzgb.zzb(r10, r0, r1)
            return r10
        L28:
            com.google.android.gms.internal.auth.zzgz r10 = com.google.android.gms.internal.auth.zzgk.zza()
            com.google.android.gms.internal.auth.zzem r0 = com.google.android.gms.internal.auth.zzeo.zza()
            com.google.android.gms.internal.auth.zzfx r1 = r3.zza()
            com.google.android.gms.internal.auth.zzgb r10 = com.google.android.gms.internal.auth.zzgb.zzb(r10, r0, r1)
            return r10
        L39:
            boolean r0 = r0.isAssignableFrom(r10)
            if (r0 == 0) goto L76
            boolean r0 = zzb(r3)
            if (r0 == 0) goto L5f
            com.google.android.gms.internal.auth.zzgc r4 = com.google.android.gms.internal.auth.zzgd.zzb()
            com.google.android.gms.internal.auth.zzfl r5 = com.google.android.gms.internal.auth.zzfl.zzd()
            com.google.android.gms.internal.auth.zzgz r6 = com.google.android.gms.internal.auth.zzgk.zzb()
            com.google.android.gms.internal.auth.zzem r7 = com.google.android.gms.internal.auth.zzeo.zzb()
            com.google.android.gms.internal.auth.zzfs r8 = com.google.android.gms.internal.auth.zzft.zzb()
            r2 = r10
            com.google.android.gms.internal.auth.zzga r10 = com.google.android.gms.internal.auth.zzga.zzj(r2, r3, r4, r5, r6, r7, r8)
            goto Lac
        L5f:
            com.google.android.gms.internal.auth.zzgc r4 = com.google.android.gms.internal.auth.zzgd.zzb()
            com.google.android.gms.internal.auth.zzfl r5 = com.google.android.gms.internal.auth.zzfl.zzd()
            com.google.android.gms.internal.auth.zzgz r6 = com.google.android.gms.internal.auth.zzgk.zzb()
            r7 = 0
            com.google.android.gms.internal.auth.zzfs r8 = com.google.android.gms.internal.auth.zzft.zzb()
            r2 = r10
            com.google.android.gms.internal.auth.zzga r10 = com.google.android.gms.internal.auth.zzga.zzj(r2, r3, r4, r5, r6, r7, r8)
            goto Lac
        L76:
            boolean r0 = zzb(r3)
            if (r0 == 0) goto L96
            com.google.android.gms.internal.auth.zzgc r4 = com.google.android.gms.internal.auth.zzgd.zza()
            com.google.android.gms.internal.auth.zzfl r5 = com.google.android.gms.internal.auth.zzfl.zzc()
            com.google.android.gms.internal.auth.zzgz r6 = com.google.android.gms.internal.auth.zzgk.zza()
            com.google.android.gms.internal.auth.zzem r7 = com.google.android.gms.internal.auth.zzeo.zza()
            com.google.android.gms.internal.auth.zzfs r8 = com.google.android.gms.internal.auth.zzft.zza()
            r2 = r10
            com.google.android.gms.internal.auth.zzga r10 = com.google.android.gms.internal.auth.zzga.zzj(r2, r3, r4, r5, r6, r7, r8)
            goto Lac
        L96:
            com.google.android.gms.internal.auth.zzgc r4 = com.google.android.gms.internal.auth.zzgd.zza()
            com.google.android.gms.internal.auth.zzfl r5 = com.google.android.gms.internal.auth.zzfl.zzc()
            com.google.android.gms.internal.auth.zzgz r6 = com.google.android.gms.internal.auth.zzgk.zza()
            r7 = 0
            com.google.android.gms.internal.auth.zzfs r8 = com.google.android.gms.internal.auth.zzft.zza()
            r2 = r10
            com.google.android.gms.internal.auth.zzga r10 = com.google.android.gms.internal.auth.zzga.zzj(r2, r3, r4, r5, r6, r7, r8)
        Lac:
            return r10
    }
}
