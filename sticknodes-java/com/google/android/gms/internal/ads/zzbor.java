package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbor implements com.google.android.gms.internal.ads.zzbod {
    private final com.google.android.gms.internal.ads.zzbof zza;
    private final com.google.android.gms.internal.ads.zzbog zzb;
    private final com.google.android.gms.internal.ads.zzbnz zzc;
    private final java.lang.String zzd;

    zzbor(com.google.android.gms.internal.ads.zzbnz r1, java.lang.String r2, com.google.android.gms.internal.ads.zzbog r3, com.google.android.gms.internal.ads.zzbof r4) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzd = r2
            r0.zzb = r3
            r0.zza = r4
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzbof zzc(com.google.android.gms.internal.ads.zzbor r0) {
            com.google.android.gms.internal.ads.zzbof r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzbor r3, com.google.android.gms.internal.ads.zzbnt r4, com.google.android.gms.internal.ads.zzboa r5, java.lang.Object r6, com.google.android.gms.internal.ads.zzcas r7) {
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Exception -> L30
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L30
            com.google.android.gms.internal.ads.zzbkm r1 = com.google.android.gms.internal.ads.zzbjv.zzo     // Catch: java.lang.Exception -> L30
            com.google.android.gms.internal.ads.zzboq r2 = new com.google.android.gms.internal.ads.zzboq     // Catch: java.lang.Exception -> L30
            r2.<init>(r3, r4, r7)     // Catch: java.lang.Exception -> L30
            r1.zzc(r0, r2)     // Catch: java.lang.Exception -> L30
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L30
            r1.<init>()     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "id"
            r1.put(r2, r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = "args"
            com.google.android.gms.internal.ads.zzbog r2 = r3.zzb     // Catch: java.lang.Exception -> L30
            org.json.JSONObject r6 = r2.zzb(r6)     // Catch: java.lang.Exception -> L30
            r1.put(r0, r6)     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = r3.zzd     // Catch: java.lang.Exception -> L30
            r5.zzl(r3, r1)     // Catch: java.lang.Exception -> L30
            return
        L30:
            r3 = move-exception
            r7.zzd(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = "Unable to invokeJavascript"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r5, r3)     // Catch: java.lang.Throwable -> L3d
            r4.zzb()
            return
        L3d:
            r3 = move-exception
            r4.zzb()
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzgev
    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzb(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final com.google.common.util.concurrent.ListenableFuture zzb(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzcas r0 = new com.google.android.gms.internal.ads.zzcas
            r0.<init>()
            com.google.android.gms.internal.ads.zzbnz r1 = r3.zzc
            r2 = 0
            com.google.android.gms.internal.ads.zzbnt r1 = r1.zzb(r2)
            java.lang.String r2 = "callJs > getEngine: Promise created"
            com.google.android.gms.ads.internal.util.zze.zza(r2)
            com.google.android.gms.internal.ads.zzboo r2 = new com.google.android.gms.internal.ads.zzboo
            r2.<init>(r3, r1, r4, r0)
            com.google.android.gms.internal.ads.zzbop r4 = new com.google.android.gms.internal.ads.zzbop
            r4.<init>(r3, r0, r1)
            r1.zzj(r2, r4)
            return r0
    }
}
