package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzekc implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgk zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgh zzc;
    final /* synthetic */ java.lang.String zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfnc zze;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgt zzf;
    final /* synthetic */ com.google.android.gms.internal.ads.zzeke zzg;

    zzekc(com.google.android.gms.internal.ads.zzeke r1, long r2, com.google.android.gms.internal.ads.zzfgk r4, com.google.android.gms.internal.ads.zzfgh r5, java.lang.String r6, com.google.android.gms.internal.ads.zzfnc r7, com.google.android.gms.internal.ads.zzfgt r8) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r4
            r0.zzc = r5
            r0.zzd = r6
            r0.zze = r7
            r0.zzf = r8
            r0.zzg = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            com.google.android.gms.internal.ads.zzeke r2 = r1.zzg
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.internal.ads.zzeke.zze(r2)
            long r2 = r2.elapsedRealtime()
            long r4 = r1.zza
            long r2 = r2 - r4
            boolean r4 = r0 instanceof java.util.concurrent.TimeoutException
            r5 = 6
            r13 = 3
            r6 = 0
            if (r4 == 0) goto L1c
            r4 = 2
            r4 = r6
            r5 = 2
            goto L67
        L1c:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzejm
            if (r4 == 0) goto L23
            r4 = r6
            r5 = 3
            goto L67
        L23:
            boolean r4 = r0 instanceof java.util.concurrent.CancellationException
            if (r4 == 0) goto L2b
            r4 = 4
            r4 = r6
            r5 = 4
            goto L67
        L2b:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfhj
            if (r4 == 0) goto L33
            r4 = 5
            r4 = r6
            r5 = 5
            goto L67
        L33:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzdye
            if (r4 == 0) goto L66
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfie.zza(r17)
            int r4 = r4.zza
            if (r4 != r13) goto L40
            r5 = 1
        L40:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzbF
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r7.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L66
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzego
            if (r4 == 0) goto L66
            r4 = r0
            com.google.android.gms.internal.ads.zzego r4 = (com.google.android.gms.internal.ads.zzego) r4
            com.google.android.gms.ads.internal.client.zze r4 = r4.zzb()
            if (r4 == 0) goto L66
            int r4 = r4.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L67
        L66:
            r4 = r6
        L67:
            com.google.android.gms.internal.ads.zzeke r14 = r1.zzg
            monitor-enter(r14)
            com.google.android.gms.internal.ads.zzeke r7 = r1.zzg     // Catch: java.lang.Throwable -> L106
            boolean r8 = com.google.android.gms.internal.ads.zzeke.zzn(r7)     // Catch: java.lang.Throwable -> L106
            if (r8 == 0) goto L8a
            com.google.android.gms.internal.ads.zzekg r7 = com.google.android.gms.internal.ads.zzeke.zzc(r7)     // Catch: java.lang.Throwable -> L106
            com.google.android.gms.internal.ads.zzfgk r8 = r1.zzb     // Catch: java.lang.Throwable -> L106
            com.google.android.gms.internal.ads.zzfgh r9 = r1.zzc     // Catch: java.lang.Throwable -> L106
            boolean r10 = r0 instanceof com.google.android.gms.internal.ads.zzego     // Catch: java.lang.Throwable -> L106
            if (r10 == 0) goto L81
            r6 = r0
            com.google.android.gms.internal.ads.zzego r6 = (com.google.android.gms.internal.ads.zzego) r6     // Catch: java.lang.Throwable -> L106
        L81:
            r10 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r5
            r11 = r2
            r6.zza(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L106
        L8a:
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzhW     // Catch: java.lang.Throwable -> L106
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L106
            java.lang.Object r6 = r7.zza(r6)     // Catch: java.lang.Throwable -> L106
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L106
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L106
            if (r6 == 0) goto Lb1
            com.google.android.gms.internal.ads.zzeke r6 = r1.zzg     // Catch: java.lang.Throwable -> L106
            com.google.android.gms.internal.ads.zzfng r6 = com.google.android.gms.internal.ads.zzeke.zzd(r6)     // Catch: java.lang.Throwable -> L106
            com.google.android.gms.internal.ads.zzfnc r7 = r1.zze     // Catch: java.lang.Throwable -> L106
            com.google.android.gms.internal.ads.zzfgt r8 = r1.zzf     // Catch: java.lang.Throwable -> L106
            com.google.android.gms.internal.ads.zzfgh r9 = r1.zzc     // Catch: java.lang.Throwable -> L106
            java.util.List r10 = r9.zzn     // Catch: java.lang.Throwable -> L106
            java.util.List r7 = r7.zzc(r8, r9, r10)     // Catch: java.lang.Throwable -> L106
            r6.zzd(r7)     // Catch: java.lang.Throwable -> L106
        Lb1:
            com.google.android.gms.internal.ads.zzeke r6 = r1.zzg     // Catch: java.lang.Throwable -> L106
            boolean r7 = com.google.android.gms.internal.ads.zzeke.zzo(r6)     // Catch: java.lang.Throwable -> L106
            if (r7 == 0) goto Lbb
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L106
            return
        Lbb:
            java.util.LinkedHashMap r15 = com.google.android.gms.internal.ads.zzeke.zzh(r6)     // Catch: java.lang.Throwable -> L106
            com.google.android.gms.internal.ads.zzfgh r12 = r1.zzc     // Catch: java.lang.Throwable -> L106
            com.google.android.gms.internal.ads.zzekd r10 = new com.google.android.gms.internal.ads.zzekd     // Catch: java.lang.Throwable -> L106
            java.lang.String r7 = r1.zzd     // Catch: java.lang.Throwable -> L106
            java.lang.String r8 = r12.zzaf     // Catch: java.lang.Throwable -> L106
            r6 = r10
            r9 = r5
            r5 = r10
            r10 = r2
            r13 = r12
            r12 = r4
            r6.<init>(r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L106
            r15.put(r13, r5)     // Catch: java.lang.Throwable -> L106
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfie.zza(r17)     // Catch: java.lang.Throwable -> L106
            int r4 = r0.zza     // Catch: java.lang.Throwable -> L106
            r5 = 3
            if (r4 == r5) goto Lde
            if (r4 != 0) goto Lf9
        Lde:
            com.google.android.gms.ads.internal.client.zze r4 = r0.zzd     // Catch: java.lang.Throwable -> L106
            if (r4 == 0) goto Lf9
            java.lang.String r4 = r4.zzc     // Catch: java.lang.Throwable -> L106
            java.lang.String r5 = "com.google.android.gms.ads"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L106
            if (r4 != 0) goto Lf9
            com.google.android.gms.internal.ads.zzego r4 = new com.google.android.gms.internal.ads.zzego     // Catch: java.lang.Throwable -> L106
            r5 = 13
            com.google.android.gms.ads.internal.client.zze r0 = r0.zzd     // Catch: java.lang.Throwable -> L106
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L106
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfie.zza(r4)     // Catch: java.lang.Throwable -> L106
        Lf9:
            com.google.android.gms.internal.ads.zzeke r4 = r1.zzg     // Catch: java.lang.Throwable -> L106
            com.google.android.gms.internal.ads.zzegp r4 = com.google.android.gms.internal.ads.zzeke.zzb(r4)     // Catch: java.lang.Throwable -> L106
            com.google.android.gms.internal.ads.zzfgh r5 = r1.zzc     // Catch: java.lang.Throwable -> L106
            r4.zzf(r5, r2, r0)     // Catch: java.lang.Throwable -> L106
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L106
            return
        L106:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L106
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zzb(java.lang.Object r13) {
            r12 = this;
            com.google.android.gms.internal.ads.zzeke r13 = r12.zzg
            com.google.android.gms.common.util.Clock r13 = com.google.android.gms.internal.ads.zzeke.zze(r13)
            long r0 = r13.elapsedRealtime()
            long r2 = r12.zza
            long r0 = r0 - r2
            com.google.android.gms.internal.ads.zzeke r13 = r12.zzg
            monitor-enter(r13)
            com.google.android.gms.internal.ads.zzeke r2 = r12.zzg     // Catch: java.lang.Throwable -> L6f
            boolean r3 = com.google.android.gms.internal.ads.zzeke.zzn(r2)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L26
            com.google.android.gms.internal.ads.zzekg r4 = com.google.android.gms.internal.ads.zzeke.zzc(r2)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.zzfgk r5 = r12.zzb     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.zzfgh r6 = r12.zzc     // Catch: java.lang.Throwable -> L6f
            r7 = 0
            r8 = 0
            r9 = r0
            r4.zza(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6f
        L26:
            com.google.android.gms.internal.ads.zzeke r2 = r12.zzg     // Catch: java.lang.Throwable -> L6f
            boolean r3 = com.google.android.gms.internal.ads.zzeke.zzo(r2)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L30
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L6f
            return
        L30:
            com.google.android.gms.internal.ads.zzfgh r3 = r12.zzc     // Catch: java.lang.Throwable -> L6f
            boolean r2 = com.google.android.gms.internal.ads.zzeke.zzp(r2, r3)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L49
            com.google.android.gms.internal.ads.zzeke r2 = r12.zzg     // Catch: java.lang.Throwable -> L6f
            java.util.LinkedHashMap r2 = com.google.android.gms.internal.ads.zzeke.zzh(r2)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.zzfgh r3 = r12.zzc     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.zzekd r2 = (com.google.android.gms.internal.ads.zzekd) r2     // Catch: java.lang.Throwable -> L6f
            r2.zzd = r0     // Catch: java.lang.Throwable -> L6f
            goto L61
        L49:
            com.google.android.gms.internal.ads.zzeke r2 = r12.zzg     // Catch: java.lang.Throwable -> L6f
            java.util.LinkedHashMap r2 = com.google.android.gms.internal.ads.zzeke.zzh(r2)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.zzfgh r3 = r12.zzc     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.zzekd r11 = new com.google.android.gms.internal.ads.zzekd     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = r12.zzd     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = r3.zzaf     // Catch: java.lang.Throwable -> L6f
            r7 = 0
            r10 = 0
            r4 = r11
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L6f
            r2.put(r3, r11)     // Catch: java.lang.Throwable -> L6f
        L61:
            com.google.android.gms.internal.ads.zzeke r2 = r12.zzg     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.zzegp r2 = com.google.android.gms.internal.ads.zzeke.zzb(r2)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.zzfgh r3 = r12.zzc     // Catch: java.lang.Throwable -> L6f
            r4 = 0
            r2.zzg(r3, r0, r4)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L6f
            return
        L6f:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L6f
            throw r0
    }
}
