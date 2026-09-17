package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeqd implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final com.google.android.gms.internal.ads.zzdru zzb;
    private final com.google.android.gms.internal.ads.zzdwg zzc;
    private final com.google.android.gms.internal.ads.zzeqf zzd;

    public zzeqd(com.google.android.gms.internal.ads.zzgfz r1, com.google.android.gms.internal.ads.zzdru r2, com.google.android.gms.internal.ads.zzdwg r3, com.google.android.gms.internal.ads.zzeqf r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzln
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r1.zza(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L28
            com.google.android.gms.internal.ads.zzeqf r1 = r3.zzd
            com.google.android.gms.internal.ads.zzeqe r1 = r1.zza()
            if (r1 == 0) goto L28
            com.google.android.gms.internal.ads.zzeqf r0 = r3.zzd
            com.google.android.gms.internal.ads.zzeqe r0 = r0.zza()
            java.util.Objects.requireNonNull(r0)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
        L28:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbu
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = com.google.android.gms.internal.ads.zzfyo.zzd(r1)
            if (r1 != 0) goto L6d
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5b
            com.google.android.gms.internal.ads.zzeqf r0 = r3.zzd
            boolean r0 = r0.zzd()
            if (r0 != 0) goto L6d
            com.google.android.gms.internal.ads.zzdwg r0 = r3.zzc
            boolean r0 = r0.zzt()
            if (r0 != 0) goto L5b
            goto L6d
        L5b:
            com.google.android.gms.internal.ads.zzeqf r0 = r3.zzd
            r1 = 1
            r0.zzc(r1)
            com.google.android.gms.internal.ads.zzgfz r0 = r3.zza
            com.google.android.gms.internal.ads.zzeqc r1 = new com.google.android.gms.internal.ads.zzeqc
            r1.<init>(r3)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb(r1)
            return r0
        L6d:
            com.google.android.gms.internal.ads.zzeqe r0 = new com.google.android.gms.internal.ads.zzeqe
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeqe zzc() throws java.lang.Exception {
            r8 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbu
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.zzdru r3 = r8.zzb     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            r4.<init>()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            com.google.android.gms.internal.ads.zzfia r3 = r3.zzc(r2, r4)     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            r3.zzC()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            com.google.android.gms.internal.ads.zzdwg r4 = r8.zzc     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            boolean r4 = r4.zzt()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            android.os.Bundle r5 = new android.os.Bundle     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            r5.<init>()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzln     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            java.lang.Object r6 = r7.zza(r6)     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            boolean r6 = r6.booleanValue()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            if (r6 == 0) goto L58
            if (r4 == 0) goto L67
        L58:
            com.google.android.gms.internal.ads.zzbrz r4 = r3.zzf()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L67
            if (r4 == 0) goto L67
            java.lang.String r6 = "sdk_version"
            java.lang.String r4 = r4.toString()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L67
            r5.putString(r6, r4)     // Catch: com.google.android.gms.internal.ads.zzfhj -> L67
        L67:
            com.google.android.gms.internal.ads.zzbrz r3 = r3.zze()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L76
            if (r3 == 0) goto L76
            java.lang.String r4 = "adapter_version"
            java.lang.String r3 = r3.toString()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L76
            r5.putString(r4, r3)     // Catch: com.google.android.gms.internal.ads.zzfhj -> L76
        L76:
            r1.putBundle(r2, r5)     // Catch: com.google.android.gms.internal.ads.zzfhj -> L7a
            goto L1f
        L7a:
            goto L1f
        L7c:
            com.google.android.gms.internal.ads.zzeqe r0 = new com.google.android.gms.internal.ads.zzeqe
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzln
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L98
            com.google.android.gms.internal.ads.zzeqf r1 = r8.zzd
            r1.zzb(r0)
        L98:
            return r0
    }
}
