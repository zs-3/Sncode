package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzewi implements com.google.android.gms.internal.ads.zzexh {
    final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final com.google.android.gms.internal.ads.zzemx zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.internal.ads.zzfhc zzf;
    private final com.google.android.gms.internal.ads.zzemt zzg;
    private final com.google.android.gms.internal.ads.zzdru zzh;
    private final com.google.android.gms.internal.ads.zzdwi zzi;

    zzewi(com.google.android.gms.internal.ads.zzgfz r1, java.util.concurrent.ScheduledExecutorService r2, java.lang.String r3, com.google.android.gms.internal.ads.zzemx r4, android.content.Context r5, com.google.android.gms.internal.ads.zzfhc r6, com.google.android.gms.internal.ads.zzemt r7, com.google.android.gms.internal.ads.zzdru r8, com.google.android.gms.internal.ads.zzdwi r9) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zza = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            return
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzewi r11) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkz
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1d
            com.google.android.gms.internal.ads.zzfhc r0 = r11.zzf
            java.lang.String r0 = r0.zzf
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            goto L21
        L1d:
            com.google.android.gms.internal.ads.zzfhc r0 = r11.zzf
            java.lang.String r0 = r0.zzf
        L21:
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbG
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3a
            com.google.android.gms.internal.ads.zzdwi r1 = r11.zzi
            android.os.Bundle r1 = r1.zzg()
            goto L3f
        L3a:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L3f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzbP
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L9b
            com.google.android.gms.internal.ads.zzemx r3 = r11.zzd
            java.lang.String r4 = r11.zza
            java.util.Map r0 = r3.zzb(r4, r0)
            com.google.android.gms.internal.ads.zzgba r0 = (com.google.android.gms.internal.ads.zzgba) r0
            com.google.android.gms.internal.ads.zzgbc r0 = r0.zzh()
            java.util.Iterator r0 = r0.iterator()
        L68:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L91
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r3.getValue()
            r7 = r3
            java.util.List r7 = (java.util.List) r7
            android.os.Bundle r8 = r11.zzf(r6)
            r9 = 1
            r10 = 1
            r5 = r11
            com.google.android.gms.internal.ads.zzgff r3 = r5.zzg(r6, r7, r8, r9, r10)
            r2.add(r3)
            goto L68
        L91:
            com.google.android.gms.internal.ads.zzemx r0 = r11.zzd
            java.util.Map r0 = r0.zzc()
            r11.zzi(r2, r0)
            goto La6
        L9b:
            com.google.android.gms.internal.ads.zzemx r3 = r11.zzd
            java.lang.String r4 = r11.zza
            java.util.Map r0 = r3.zza(r4, r0)
            r11.zzi(r2, r0)
        La6:
            com.google.android.gms.internal.ads.zzgfn r0 = com.google.android.gms.internal.ads.zzgfo.zzb(r2)
            com.google.android.gms.internal.ads.zzewd r3 = new com.google.android.gms.internal.ads.zzewd
            r3.<init>(r2, r1)
            com.google.android.gms.internal.ads.zzgfz r11 = r11.zzb
            com.google.common.util.concurrent.ListenableFuture r11 = r0.zza(r3, r11)
            return r11
    }

    private final android.os.Bundle zzf(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfhc r0 = r1.zzf
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            android.os.Bundle r0 = r0.zzm
            if (r0 == 0) goto Ld
            android.os.Bundle r2 = r0.getBundle(r2)
            return r2
        Ld:
            r2 = 0
            return r2
    }

    private final com.google.android.gms.internal.ads.zzgff zzg(java.lang.String r9, java.util.List r10, android.os.Bundle r11, boolean r12, boolean r13) {
            r8 = this;
            com.google.android.gms.internal.ads.zzewf r7 = new com.google.android.gms.internal.ads.zzewf
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.internal.ads.zzgfz r10 = r8.zzb
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzgfo.zzk(r7, r10)
            com.google.android.gms.internal.ads.zzgff r10 = com.google.android.gms.internal.ads.zzgff.zzu(r10)
            com.google.android.gms.internal.ads.zzbcm r11 = com.google.android.gms.internal.ads.zzbcv.zzbC
            com.google.android.gms.internal.ads.zzbct r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r11 = r12.zza(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L42
            com.google.android.gms.internal.ads.zzbcm r11 = com.google.android.gms.internal.ads.zzbcv.zzbv
            com.google.android.gms.internal.ads.zzbct r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r11 = r12.zza(r11)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            java.util.concurrent.ScheduledExecutorService r13 = r8.zzc
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.ListenableFuture r10 = com.google.android.gms.internal.ads.zzgfo.zzo(r10, r11, r0, r13)
            com.google.android.gms.internal.ads.zzgff r10 = (com.google.android.gms.internal.ads.zzgff) r10
        L42:
            com.google.android.gms.internal.ads.zzewg r11 = new com.google.android.gms.internal.ads.zzewg
            r11.<init>(r9)
            com.google.android.gms.internal.ads.zzgfz r9 = r8.zzb
            java.lang.Class<java.lang.Throwable> r12 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r9 = com.google.android.gms.internal.ads.zzgfo.zze(r10, r12, r11, r9)
            com.google.android.gms.internal.ads.zzgff r9 = (com.google.android.gms.internal.ads.zzgff) r9
            return r9
    }

    private final void zzh(com.google.android.gms.internal.ads.zzbrk r9, android.os.Bundle r10, java.util.List r11, com.google.android.gms.internal.ads.zzena r12) throws android.os.RemoteException {
            r8 = this;
            android.content.Context r0 = r8.zze
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            r0 = 0
            java.lang.Object r11 = r11.get(r0)
            r5 = r11
            android.os.Bundle r5 = (android.os.Bundle) r5
            java.lang.String r3 = r8.zza
            com.google.android.gms.internal.ads.zzfhc r11 = r8.zzf
            com.google.android.gms.ads.internal.client.zzs r6 = r11.zze
            r1 = r9
            r4 = r10
            r7 = r12
            r1.zzh(r2, r3, r4, r5, r6, r7)
            return
    }

    private final void zzi(java.util.List r8, java.util.Map r9) {
            r7 = this;
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L8:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.ads.zzenb r0 = (com.google.android.gms.internal.ads.zzenb) r0
            java.lang.String r2 = r0.zza
            android.os.Bundle r4 = r7.zzf(r2)
            android.os.Bundle r1 = r0.zze
            java.util.List r3 = java.util.Collections.singletonList(r1)
            boolean r5 = r0.zzb
            boolean r6 = r0.zzc
            r1 = r7
            com.google.android.gms.internal.ads.zzgff r0 = r1.zzg(r2, r3, r4, r5, r6)
            r8.add(r0)
            goto L8
        L33:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 32
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfhc r0 = r3.zzf
            boolean r1 = r0.zzr
            if (r1 == 0) goto L44
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            java.lang.String r0 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(r0)
            java.lang.String r0 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(r0)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbI
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ","
            java.lang.String[] r1 = r1.split(r2)
            java.util.List r1 = java.util.Arrays.asList(r1)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L44
            com.google.android.gms.internal.ads.zzewj r0 = new com.google.android.gms.internal.ads.zzewj
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.String r1 = r1.toString()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
        L44:
            com.google.android.gms.internal.ads.zzewc r0 = new com.google.android.gms.internal.ads.zzewc
            r0.<init>(r3)
            com.google.android.gms.internal.ads.zzgfz r1 = r3.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzk(r0, r1)
            return r0
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String r9, java.util.List r10, android.os.Bundle r11, boolean r12, boolean r13) throws java.lang.Exception {
            r8 = this;
            com.google.android.gms.internal.ads.zzcas r7 = new com.google.android.gms.internal.ads.zzcas
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L26
            com.google.android.gms.internal.ads.zzbcm r13 = com.google.android.gms.internal.ads.zzbcv.zzbH
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r13 = r1.zza(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L26
            com.google.android.gms.internal.ads.zzemt r13 = r8.zzg
            r13.zzb(r9)
            com.google.android.gms.internal.ads.zzemt r13 = r8.zzg
            com.google.android.gms.internal.ads.zzbrk r13 = r13.zza(r9)
            goto L34
        L26:
            com.google.android.gms.internal.ads.zzdru r13 = r8.zzh     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.internal.ads.zzbrk r13 = r13.zzb(r9)     // Catch: android.os.RemoteException -> L2d
            goto L34
        L2d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r13)
            r13 = r0
        L34:
            if (r13 != 0) goto L4e
            com.google.android.gms.internal.ads.zzbcm r10 = com.google.android.gms.internal.ads.zzbcv.zzbx
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r10 = r11.zza(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4d
            com.google.android.gms.internal.ads.zzena.zzb(r9, r7)
            goto Lba
        L4d:
            throw r0
        L4e:
            com.google.android.gms.internal.ads.zzena r6 = new com.google.android.gms.internal.ads.zzena
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r0.elapsedRealtime()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzbC
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r0.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r9 = r8.zzc
            com.google.android.gms.internal.ads.zzewh r0 = new com.google.android.gms.internal.ads.zzewh
            r0.<init>(r6)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbv
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8d:
            if (r12 == 0) goto Lb7
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzbJ
            com.google.android.gms.internal.ads.zzbct r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r9 = r12.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzgfz r9 = r8.zzb
            com.google.android.gms.internal.ads.zzewe r12 = new com.google.android.gms.internal.ads.zzewe
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.zza(r12)
            goto Lba
        Lb3:
            r8.zzh(r13, r11, r10, r6)
            goto Lba
        Lb7:
            r6.zzd()
        Lba:
            return r7
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzbrk r1, android.os.Bundle r2, java.util.List r3, com.google.android.gms.internal.ads.zzena r4, com.google.android.gms.internal.ads.zzcas r5) {
            r0 = this;
            r0.zzh(r1, r2, r3, r4)     // Catch: android.os.RemoteException -> L4
            return
        L4:
            r1 = move-exception
            r5.zzd(r1)
            return
    }
}
