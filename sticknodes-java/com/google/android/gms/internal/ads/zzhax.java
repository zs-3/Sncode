package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhax implements com.google.android.gms.internal.ads.zzhcn {
    private static final com.google.android.gms.internal.ads.zzhax zza = null;

    static {
            com.google.android.gms.internal.ads.zzhax r0 = new com.google.android.gms.internal.ads.zzhax
            r0.<init>()
            com.google.android.gms.internal.ads.zzhax.zza = r0
            return
    }

    private zzhax() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.ads.zzhax zza() {
            com.google.android.gms.internal.ads.zzhax r0 = com.google.android.gms.internal.ads.zzhax.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhcn
    public final com.google.android.gms.internal.ads.zzhcm zzb(java.lang.Class r4) {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzhbe> r0 = com.google.android.gms.internal.ads.zzhbe.class
            boolean r1 = r0.isAssignableFrom(r4)
            if (r1 == 0) goto L28
            java.lang.Class r0 = r4.asSubclass(r0)     // Catch: java.lang.Exception -> L17
            com.google.android.gms.internal.ads.zzhbe r0 = com.google.android.gms.internal.ads.zzhbe.zzbh(r0)     // Catch: java.lang.Exception -> L17
            java.lang.Object r0 = r0.zzbO()     // Catch: java.lang.Exception -> L17
            com.google.android.gms.internal.ads.zzhcm r0 = (com.google.android.gms.internal.ads.zzhcm) r0     // Catch: java.lang.Exception -> L17
            return r0
        L17:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r4 = r4.getName()
            java.lang.String r2 = "Unable to get message info for "
            java.lang.String r4 = r2.concat(r4)
            r1.<init>(r4, r0)
            throw r1
        L28:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "Unsupported message type: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhcn
    public final boolean zzc(java.lang.Class r2) {
            r1 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzhbe> r0 = com.google.android.gms.internal.ads.zzhbe.class
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }
}
