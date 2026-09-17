package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzelw implements com.google.android.gms.internal.ads.zzegk {
    private final com.google.android.gms.internal.ads.zzegm zza;
    private final com.google.android.gms.internal.ads.zzegq zzb;
    private final com.google.android.gms.internal.ads.zzflg zzc;
    private final com.google.android.gms.internal.ads.zzgfz zzd;

    public zzelw(com.google.android.gms.internal.ads.zzflg r1, com.google.android.gms.internal.ads.zzgfz r2, com.google.android.gms.internal.ads.zzegm r3, com.google.android.gms.internal.ads.zzegq r4) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzd = r2
            r0.zzb = r4
            r0.zza = r3
            return
    }

    static final java.lang.String zze(java.lang.String r2, int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error from: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ", code: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfgt r7, com.google.android.gms.internal.ads.zzfgh r8) {
            r6 = this;
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r0 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.util.List r1 = r8.zzt
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.zzegm r3 = r6.zza     // Catch: com.google.android.gms.internal.ads.zzfhj -> L1d
            org.json.JSONObject r4 = r8.zzv     // Catch: com.google.android.gms.internal.ads.zzfhj -> L1d
            com.google.android.gms.internal.ads.zzegn r1 = r3.zza(r2, r4)     // Catch: com.google.android.gms.internal.ads.zzfhj -> L1d
            goto L20
        L1d:
            goto L8
        L1f:
            r1 = 0
        L20:
            if (r1 != 0) goto L2e
            com.google.android.gms.internal.ads.zzejm r7 = new com.google.android.gms.internal.ads.zzejm
            java.lang.String r8 = "Unable to instantiate mediation adapter class."
            r7.<init>(r8)
            com.google.common.util.concurrent.ListenableFuture r7 = com.google.android.gms.internal.ads.zzgfo.zzg(r7)
            return r7
        L2e:
            com.google.android.gms.internal.ads.zzcas r2 = new com.google.android.gms.internal.ads.zzcas
            r2.<init>()
            com.google.android.gms.internal.ads.zzelv r3 = new com.google.android.gms.internal.ads.zzelv
            r3.<init>(r6, r1, r2)
            com.google.android.gms.internal.ads.zzczk r4 = r1.zzc
            r4.zza(r3)
            boolean r3 = r8.zzM
            if (r3 == 0) goto L65
            com.google.android.gms.internal.ads.zzfgq r3 = r7.zza
            com.google.android.gms.internal.ads.zzfhc r3 = r3.zza
            com.google.android.gms.ads.internal.client.zzm r3 = r3.zzd
            android.os.Bundle r3 = r3.zzm
            java.lang.String r4 = r0.getName()
            android.os.Bundle r4 = r3.getBundle(r4)
            if (r4 != 0) goto L5f
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r0 = r0.getName()
            r3.putBundle(r0, r4)
        L5f:
            r0 = 1
            java.lang.String r3 = "render_test_ad_label"
            r4.putBoolean(r3, r0)
        L65:
            com.google.android.gms.internal.ads.zzflg r0 = r6.zzc
            com.google.android.gms.internal.ads.zzfla r3 = com.google.android.gms.internal.ads.zzfla.zzq
            com.google.android.gms.internal.ads.zzelt r4 = new com.google.android.gms.internal.ads.zzelt
            r4.<init>(r6, r7, r8, r1)
            com.google.android.gms.internal.ads.zzgfz r5 = r6.zzd
            com.google.android.gms.internal.ads.zzfkx r0 = com.google.android.gms.internal.ads.zzfkq.zzd(r4, r5, r3, r0)
            com.google.android.gms.internal.ads.zzfla r3 = com.google.android.gms.internal.ads.zzfla.zzr
            com.google.android.gms.internal.ads.zzfkx r0 = r0.zzb(r3)
            com.google.android.gms.internal.ads.zzfkx r0 = r0.zzd(r2)
            com.google.android.gms.internal.ads.zzfla r2 = com.google.android.gms.internal.ads.zzfla.zzs
            com.google.android.gms.internal.ads.zzfkx r0 = r0.zzb(r2)
            com.google.android.gms.internal.ads.zzelu r2 = new com.google.android.gms.internal.ads.zzelu
            r2.<init>(r6, r7, r8, r1)
            com.google.android.gms.internal.ads.zzfkx r7 = r0.zze(r2)
            com.google.android.gms.internal.ads.zzfkl r7 = r7.zza()
            return r7
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(com.google.android.gms.internal.ads.zzfgt r1, com.google.android.gms.internal.ads.zzfgh r2) {
            r0 = this;
            java.util.List r1 = r2.zzt
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    final /* synthetic */ java.lang.Object zzc(com.google.android.gms.internal.ads.zzfgt r1, com.google.android.gms.internal.ads.zzfgh r2, com.google.android.gms.internal.ads.zzegn r3, java.lang.Void r4) throws java.lang.Exception {
            r0 = this;
            com.google.android.gms.internal.ads.zzegq r4 = r0.zzb
            java.lang.Object r1 = r4.zza(r1, r2, r3)
            return r1
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzfgt r2, com.google.android.gms.internal.ads.zzfgh r3, com.google.android.gms.internal.ads.zzegn r4) throws java.lang.Exception {
            r1 = this;
            com.google.android.gms.internal.ads.zzegq r0 = r1.zzb
            r0.zzb(r2, r3, r4)
            return
    }
}
