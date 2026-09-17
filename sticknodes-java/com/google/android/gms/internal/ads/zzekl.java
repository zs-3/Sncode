package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzekl implements com.google.android.gms.internal.ads.zzgev {
    private final com.google.android.gms.internal.ads.zzflg zza;
    private final com.google.android.gms.internal.ads.zzcyc zzb;
    private final com.google.android.gms.internal.ads.zzfnc zzc;
    private final com.google.android.gms.internal.ads.zzfng zzd;
    private final java.util.concurrent.Executor zze;
    private final java.util.concurrent.ScheduledExecutorService zzf;
    private final com.google.android.gms.internal.ads.zzcth zzg;
    private final com.google.android.gms.internal.ads.zzeke zzh;
    private final com.google.android.gms.internal.ads.zzegp zzi;
    private final android.content.Context zzj;
    private final com.google.android.gms.internal.ads.zzfma zzk;
    private final com.google.android.gms.internal.ads.zzejo zzl;
    private final com.google.android.gms.internal.ads.zzdty zzm;

    zzekl(android.content.Context r1, com.google.android.gms.internal.ads.zzflg r2, com.google.android.gms.internal.ads.zzeke r3, com.google.android.gms.internal.ads.zzcyc r4, com.google.android.gms.internal.ads.zzfnc r5, com.google.android.gms.internal.ads.zzfng r6, com.google.android.gms.internal.ads.zzcth r7, java.util.concurrent.Executor r8, java.util.concurrent.ScheduledExecutorService r9, com.google.android.gms.internal.ads.zzegp r10, com.google.android.gms.internal.ads.zzfma r11, com.google.android.gms.internal.ads.zzejo r12, com.google.android.gms.internal.ads.zzdty r13) {
            r0 = this;
            r0.<init>()
            r0.zzj = r1
            r0.zza = r2
            r0.zzh = r3
            r0.zzb = r4
            r0.zzc = r5
            r0.zzd = r6
            r0.zzg = r7
            r0.zze = r8
            r0.zzf = r9
            r0.zzi = r10
            r0.zzk = r11
            r0.zzl = r12
            r0.zzm = r13
            return
    }

    static java.lang.String zzc(com.google.android.gms.internal.ads.zzfgt r5) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfo
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.zzfgs r2 = r5.zzb
            com.google.android.gms.internal.ads.zzfgk r2 = r2.zzb
            int r2 = r2.zzf
            if (r2 == 0) goto L57
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzfn
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L57
            goto L58
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L58
        L45:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received error HTTP response code: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            goto L58
        L57:
            r1 = r0
        L58:
            com.google.android.gms.internal.ads.zzfgs r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfgk r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfgj r5 = r5.zzj
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.zza()
            return r5
        L65:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgev
    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object r9) throws java.lang.Exception {
            r8 = this;
            com.google.android.gms.internal.ads.zzfgt r9 = (com.google.android.gms.internal.ads.zzfgt) r9
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcf
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            com.google.android.gms.internal.ads.zzfgs r0 = r9.zzb
            com.google.android.gms.internal.ads.zzbwa r0 = r0.zzd
            if (r0 == 0) goto L27
            android.os.Bundle r0 = r0.zzm
            if (r0 == 0) goto L27
            com.google.android.gms.internal.ads.zzdty r1 = r8.zzm
            android.os.Bundle r1 = r1.zza()
            r1.putAll(r0)
        L27:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcg
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L50
            com.google.android.gms.internal.ads.zzdty r0 = r8.zzm
            android.os.Bundle r0 = r0.zza()
            com.google.android.gms.internal.ads.zzdtm r1 = com.google.android.gms.internal.ads.zzdtm.zzq
            java.lang.String r1 = r1.zza()
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()
            long r2 = r2.currentTimeMillis()
            r0.putLong(r1, r2)
        L50:
            java.lang.String r0 = zzc(r9)
            com.google.android.gms.internal.ads.zzegp r1 = r8.zzi
            com.google.android.gms.internal.ads.zzfgs r2 = r9.zzb
            com.google.android.gms.internal.ads.zzfgk r2 = r2.zzb
            r1.zzi(r2)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhU
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 3
            if (r1 == 0) goto L8b
            com.google.android.gms.internal.ads.zzfgs r1 = r9.zzb
            com.google.android.gms.internal.ads.zzfgk r1 = r1.zzb
            int r1 = r1.zzf
            if (r1 == 0) goto L8b
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 < r3) goto L80
            r3 = 300(0x12c, float:4.2E-43)
            if (r1 < r3) goto L8b
        L80:
            com.google.android.gms.internal.ads.zzeki r9 = new com.google.android.gms.internal.ads.zzeki
            r9.<init>(r2, r0)
            com.google.common.util.concurrent.ListenableFuture r9 = com.google.android.gms.internal.ads.zzgfo.zzg(r9)
            goto L1b9
        L8b:
            com.google.android.gms.internal.ads.zzfgs r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzdz
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r3.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 1
            if (r1 == 0) goto Lb4
            java.lang.String r0 = r0.zzq
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lb4
            com.google.android.gms.internal.ads.zzegp r1 = r8.zzi
            com.google.android.gms.internal.ads.zzfgs r4 = r9.zzb
            java.util.List r4 = r4.zza
            r1.zzh(r0, r4)
            goto Lfd
        Lb4:
            com.google.android.gms.internal.ads.zzfgs r0 = r9.zzb
            java.util.List r0 = r0.zza
            java.util.Iterator r0 = r0.iterator()
        Lbc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lfd
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfgh r1 = (com.google.android.gms.internal.ads.zzfgh) r1
            com.google.android.gms.internal.ads.zzegp r4 = r8.zzi
            r4.zzd(r1)
            java.util.List r4 = r1.zza
            java.util.Iterator r4 = r4.iterator()
        Ld3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lf0
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzcth r6 = r8.zzg
            int r7 = r1.zzb
            com.google.android.gms.internal.ads.zzegk r5 = r6.zza(r7, r5)
            if (r5 == 0) goto Ld3
            boolean r5 = r5.zzb(r9, r1)
            if (r5 == 0) goto Ld3
            goto Lbc
        Lf0:
            com.google.android.gms.internal.ads.zzegp r4 = r8.zzi
            r5 = 0
            r7 = 0
            com.google.android.gms.ads.internal.client.zze r7 = com.google.android.gms.internal.ads.zzfie.zzd(r3, r7, r7)
            r4.zzf(r1, r5, r7)
            goto Lbc
        Lfd:
            com.google.android.gms.internal.ads.zzcyc r0 = r8.zzb
            com.google.android.gms.internal.ads.zzfng r1 = r8.zzd
            com.google.android.gms.internal.ads.zzfnc r4 = r8.zzc
            com.google.android.gms.internal.ads.zzcot r5 = new com.google.android.gms.internal.ads.zzcot
            r5.<init>(r9, r1, r4)
            java.util.concurrent.Executor r1 = r8.zze
            r0.zzo(r5, r1)
            com.google.android.gms.internal.ads.zzfgs r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzb
            int r0 = r0.zzr
            if (r0 <= r3) goto L11d
            com.google.android.gms.internal.ads.zzejo r0 = r8.zzl
            com.google.common.util.concurrent.ListenableFuture r9 = r0.zzb(r9)
            goto L1b9
        L11d:
            java.lang.String r0 = zzc(r9)
            com.google.android.gms.internal.ads.zzflg r1 = r8.zza
            com.google.android.gms.internal.ads.zzfla r3 = com.google.android.gms.internal.ads.zzfla.zzn
            r4 = 0
            com.google.android.gms.internal.ads.zzeki r5 = new com.google.android.gms.internal.ads.zzeki
            r5.<init>(r2, r0)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzg(r5)
            com.google.android.gms.internal.ads.zzfkx r0 = com.google.android.gms.internal.ads.zzfkq.zzc(r0, r3, r1)
            com.google.android.gms.internal.ads.zzfkl r0 = r0.zza()
            com.google.android.gms.internal.ads.zzeke r1 = r8.zzh
            r1.zzl()
            com.google.android.gms.internal.ads.zzfgs r1 = r9.zzb
            java.util.List r1 = r1.zza
            java.util.Iterator r1 = r1.iterator()
        L144:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a9
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.zzfgh r2 = (com.google.android.gms.internal.ads.zzfgh) r2
            java.util.List r3 = r2.zza
            java.util.Iterator r3 = r3.iterator()
        L156:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L1a6
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzcth r6 = r8.zzg
            int r7 = r2.zzb
            com.google.android.gms.internal.ads.zzegk r6 = r6.zza(r7, r5)
            if (r6 == 0) goto L156
            boolean r7 = r6.zzb(r9, r2)
            if (r7 == 0) goto L156
            com.google.android.gms.internal.ads.zzflg r3 = r8.zza
            com.google.android.gms.internal.ads.zzfla r7 = com.google.android.gms.internal.ads.zzfla.zzo
            com.google.android.gms.internal.ads.zzfkx r0 = r3.zzb(r7, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "render-config-"
            r3.append(r7)
            r3.append(r4)
            java.lang.String r7 = "-"
            r3.append(r7)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.internal.ads.zzfkx r0 = r0.zzh(r3)
            com.google.android.gms.internal.ads.zzekj r3 = new com.google.android.gms.internal.ads.zzekj
            r3.<init>(r8, r2, r9, r6)
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            com.google.android.gms.internal.ads.zzfkx r0 = r0.zzc(r2, r3)
            com.google.android.gms.internal.ads.zzfkl r0 = r0.zza()
        L1a6:
            int r4 = r4 + 1
            goto L144
        L1a9:
            com.google.android.gms.internal.ads.zzeke r9 = r8.zzh
            java.util.Objects.requireNonNull(r9)
            com.google.android.gms.internal.ads.zzekk r1 = new com.google.android.gms.internal.ads.zzekk
            r1.<init>(r9)
            java.util.concurrent.Executor r9 = r8.zze
            r0.addListener(r1, r9)
            r9 = r0
        L1b9:
            return r9
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfgh r5, com.google.android.gms.internal.ads.zzfgt r6, com.google.android.gms.internal.ads.zzegk r7, java.lang.Throwable r8) throws java.lang.Exception {
            r4 = this;
            android.content.Context r8 = r4.zzj
            r0 = 12
            com.google.android.gms.internal.ads.zzflp r8 = com.google.android.gms.internal.ads.zzflo.zza(r8, r0)
            java.lang.String r0 = r5.zzE
            r8.zzd(r0)
            r8.zzi()
            com.google.common.util.concurrent.ListenableFuture r7 = r7.zza(r6, r5)
            int r0 = r5.zzR
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledExecutorService r3 = r4.zzf
            com.google.common.util.concurrent.ListenableFuture r7 = com.google.android.gms.internal.ads.zzgfo.zzo(r7, r0, r2, r3)
            com.google.android.gms.internal.ads.zzfnc r0 = r4.zzc
            com.google.android.gms.internal.ads.zzeke r1 = r4.zzh
            r1.zzf(r6, r5, r7, r0)
            com.google.android.gms.internal.ads.zzfma r5 = r4.zzk
            com.google.android.gms.internal.ads.zzflz.zza(r7, r5, r8)
            return r7
    }
}
