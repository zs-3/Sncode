package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzao implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzap zza;

    zzao(com.google.android.gms.ads.nonagon.signalgeneration.zzap r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r7) {
            r6 = this;
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "SignalGeneratorImpl.initializeWebViewForSignalCollection"
            r0.zzw(r7, r1)
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r0 = r6.zza
            com.google.android.gms.internal.ads.zzdui r0 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzp(r0)
            r1 = 6
            android.util.Pair[] r2 = new android.util.Pair[r1]
            android.util.Pair r3 = new android.util.Pair
            java.lang.String r4 = r7.getMessage()
            java.lang.String r5 = "sgf_reason"
            r3.<init>(r5, r4)
            r4 = 0
            r2[r4] = r3
            android.util.Pair r3 = new android.util.Pair
            java.lang.String r4 = "se"
            java.lang.String r5 = "query_g"
            r3.<init>(r4, r5)
            r4 = 1
            r2[r4] = r3
            android.util.Pair r3 = new android.util.Pair
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.BANNER
            java.lang.String r4 = r4.name()
            java.lang.String r5 = "ad_format"
            r3.<init>(r5, r4)
            r4 = 2
            r2[r4] = r3
            android.util.Pair r3 = new android.util.Pair
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r4 = "rtype"
            r3.<init>(r4, r1)
            r1 = 3
            r2[r1] = r3
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r3 = "scar"
            java.lang.String r4 = "true"
            r1.<init>(r3, r4)
            r3 = 4
            r2[r3] = r1
            android.util.Pair r1 = new android.util.Pair
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r3 = r6.zza
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzE(r3)
            int r3 = r3.get()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "sgi_rn"
            r1.<init>(r4, r3)
            r3 = 5
            r2[r3] = r1
            r1 = 0
            java.lang.String r3 = "sgf"
            com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(r0, r1, r3, r2)
            java.lang.String r0 = "Failed to initialize webview for loading SDKCore. "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r7)
            com.google.android.gms.internal.ads.zzbcm r7 = com.google.android.gms.internal.ads.zzbcv.zzjl
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r0.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lb8
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r7 = r6.zza
            java.util.concurrent.atomic.AtomicBoolean r7 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzD(r7)
            boolean r7 = r7.get()
            if (r7 != 0) goto Lb8
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r7 = r6.zza
            java.util.concurrent.atomic.AtomicInteger r7 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzE(r7)
            int r7 = r7.getAndIncrement()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjm
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r7 >= r0) goto Lb8
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r7 = r6.zza
            com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzI(r7)
        Lb8:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r7) {
            r6 = this;
            com.google.android.gms.ads.nonagon.signalgeneration.zzbd r7 = (com.google.android.gms.ads.nonagon.signalgeneration.zzbd) r7
            java.lang.String r7 = "Initialized webview successfully for SDKCore."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r7)
            com.google.android.gms.internal.ads.zzbcm r7 = com.google.android.gms.internal.ads.zzbcv.zzjl
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r0.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L80
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r7 = r6.zza
            com.google.android.gms.internal.ads.zzdui r7 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzp(r7)
            r0 = 5
            android.util.Pair[] r0 = new android.util.Pair[r0]
            r1 = 0
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r3 = "se"
            java.lang.String r4 = "query_g"
            r2.<init>(r3, r4)
            r0[r1] = r2
            android.util.Pair r1 = new android.util.Pair
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.BANNER
            java.lang.String r2 = r2.name()
            java.lang.String r3 = "ad_format"
            r1.<init>(r3, r2)
            r2 = 1
            r0[r2] = r1
            r1 = 2
            android.util.Pair r3 = new android.util.Pair
            r4 = 6
            java.lang.String r4 = java.lang.Integer.toString(r4)
            java.lang.String r5 = "rtype"
            r3.<init>(r5, r4)
            r0[r1] = r3
            r1 = 3
            android.util.Pair r3 = new android.util.Pair
            java.lang.String r4 = "scar"
            java.lang.String r5 = "true"
            r3.<init>(r4, r5)
            r0[r1] = r3
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r1 = r6.zza
            r3 = 4
            android.util.Pair r4 = new android.util.Pair
            java.util.concurrent.atomic.AtomicInteger r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzE(r1)
            int r1 = r1.get()
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r5 = "sgi_rn"
            r4.<init>(r5, r1)
            r0[r3] = r4
            r1 = 0
            java.lang.String r3 = "sgs"
            com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(r7, r1, r3, r0)
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r7 = r6.zza
            java.util.concurrent.atomic.AtomicBoolean r7 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzD(r7)
            r7.set(r2)
        L80:
            return
    }
}
