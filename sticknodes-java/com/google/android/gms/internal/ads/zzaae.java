package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaae implements com.google.android.gms.internal.ads.zzbx {
    private final com.google.android.gms.internal.ads.zzcm zza;

    public zzaae(com.google.android.gms.internal.ads.zzcm r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final com.google.android.gms.internal.ads.zzby zza(android.content.Context r13, com.google.android.gms.internal.ads.zzo r14, com.google.android.gms.internal.ads.zzr r15, com.google.android.gms.internal.ads.zzco r16, java.util.concurrent.Executor r17, java.util.List r18, long r19) throws com.google.android.gms.internal.ads.zzcl {
            r12 = this;
            java.lang.String r0 = "androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L32
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L32
            java.lang.Class<com.google.android.gms.internal.ads.zzcm> r3 = com.google.android.gms.internal.ads.zzcm.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L32
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch: java.lang.Exception -> L32
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L32
            r2 = r12
            com.google.android.gms.internal.ads.zzcm r3 = r2.zza     // Catch: java.lang.Exception -> L30
            r1[r4] = r3     // Catch: java.lang.Exception -> L30
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L30
            r3 = r0
            com.google.android.gms.internal.ads.zzbx r3 = (com.google.android.gms.internal.ads.zzbx) r3     // Catch: java.lang.Exception -> L30
            r10 = 0
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            com.google.android.gms.internal.ads.zzby r0 = r3.zza(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L30
            return r0
        L30:
            r0 = move-exception
            goto L34
        L32:
            r0 = move-exception
            r2 = r12
        L34:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzcl
            if (r1 == 0) goto L3b
            com.google.android.gms.internal.ads.zzcl r0 = (com.google.android.gms.internal.ads.zzcl) r0
            goto L46
        L3b:
            com.google.android.gms.internal.ads.zzcl r1 = new com.google.android.gms.internal.ads.zzcl
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r0, r3)
            r0 = r1
        L46:
            throw r0
    }
}
