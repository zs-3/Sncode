package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzal implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbzp zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbzi zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzflp zzd;
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzap zze;

    zzal(com.google.android.gms.ads.nonagon.signalgeneration.zzap r1, com.google.common.util.concurrent.ListenableFuture r2, com.google.android.gms.internal.ads.zzbzp r3, com.google.android.gms.internal.ads.zzbzi r4, com.google.android.gms.internal.ads.zzflp r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r4) {
            r3 = this;
            java.lang.String r0 = r4.getMessage()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhp
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "SignalGeneratorImpl.generateSignals"
            if (r1 == 0) goto L20
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            r1.zzv(r4, r2)
            goto L27
        L20:
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            r1.zzw(r4, r2)
        L27:
            com.google.common.util.concurrent.ListenableFuture r1 = r3.zza
            com.google.android.gms.internal.ads.zzbzp r2 = r3.zzb
            com.google.android.gms.internal.ads.zzfma r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzr(r1, r2)
            com.google.android.gms.internal.ads.zzbeb r2 = com.google.android.gms.internal.ads.zzbek.zze
            java.lang.Object r2 = r2.zze()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L4e
            if (r1 == 0) goto L4e
            com.google.android.gms.internal.ads.zzflp r2 = r3.zzd
            r2.zzh(r4)
            r4 = 0
            r2.zzg(r4)
            r1.zza(r2)
            r1.zzh()
        L4e:
            java.lang.String r4 = "Unknown format is no longer supported."
            boolean r4 = r4.equals(r0)     // Catch: android.os.RemoteException -> L6e
            if (r4 == 0) goto L57
            goto L68
        L57:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L6e
            r4.<init>()     // Catch: android.os.RemoteException -> L6e
            java.lang.String r1 = "Internal error. "
            r4.append(r1)     // Catch: android.os.RemoteException -> L6e
            r4.append(r0)     // Catch: android.os.RemoteException -> L6e
            java.lang.String r0 = r4.toString()     // Catch: android.os.RemoteException -> L6e
        L68:
            com.google.android.gms.internal.ads.zzbzi r4 = r3.zzc     // Catch: android.os.RemoteException -> L6e
            r4.zzb(r0)     // Catch: android.os.RemoteException -> L6e
            return
        L6e:
            r4 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r11) {
            r10 = this;
            java.lang.String r0 = "QueryInfo generation has been disabled."
            com.google.common.util.concurrent.ListenableFuture r1 = r10.zza
            com.google.android.gms.ads.nonagon.signalgeneration.zzbd r11 = (com.google.android.gms.ads.nonagon.signalgeneration.zzbd) r11
            com.google.android.gms.internal.ads.zzbzp r2 = r10.zzb
            com.google.android.gms.internal.ads.zzfma r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzr(r1, r2)
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r2 = r10.zze
            java.util.concurrent.atomic.AtomicBoolean r2 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzD(r2)
            r3 = 1
            r2.set(r3)
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzhk
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r4.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r4 = 0
            if (r2 != 0) goto L5a
            com.google.android.gms.internal.ads.zzbzi r11 = r10.zzc     // Catch: android.os.RemoteException -> L2f
            r11.zzb(r0)     // Catch: android.os.RemoteException -> L2f
            goto L3b
        L2f:
            r11 = move-exception
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = r0.concat(r11)
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r11)
        L3b:
            com.google.android.gms.internal.ads.zzbeb r11 = com.google.android.gms.internal.ads.zzbek.zze
            java.lang.Object r11 = r11.zze()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L1d5
            if (r1 == 0) goto L1d5
            com.google.android.gms.internal.ads.zzflp r11 = r10.zzd
            r11.zzc(r0)
            r11.zzg(r4)
            r1.zza(r11)
            r1.zzh()
            return
        L5a:
            java.lang.String r0 = "SignalGeneratorImpl.generateSignals.onSuccess"
            java.lang.String r2 = ""
            if (r11 != 0) goto L84
            com.google.android.gms.internal.ads.zzbzi r11 = r10.zzc     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            r5 = 0
            r11.zzc(r5, r5, r5)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.internal.ads.zzflp r11 = r10.zzd     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            r11.zzg(r3)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.internal.ads.zzbeb r11 = com.google.android.gms.internal.ads.zzbek.zze
            java.lang.Object r11 = r11.zze()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L1d5
            if (r1 == 0) goto L1d5
            com.google.android.gms.internal.ads.zzflp r11 = r10.zzd
            r1.zza(r11)
            r1.zzh()
            return
        L84:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161 org.json.JSONException -> L163
            java.lang.String r6 = r11.zzb     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161 org.json.JSONException -> L163
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161 org.json.JSONException -> L163
            java.lang.String r6 = "request_id"
            java.lang.String r5 = r5.optString(r6, r2)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            if (r5 == 0) goto Lc6
            java.lang.String r11 = "The request ID is empty in request JSON."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r11)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.internal.ads.zzbzi r11 = r10.zzc     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.String r3 = "Internal error: request ID is empty in request JSON."
            r11.zzb(r3)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.internal.ads.zzflp r11 = r10.zzd     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.String r3 = "Request ID empty"
            r11.zzc(r3)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            r11.zzg(r4)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.internal.ads.zzbeb r11 = com.google.android.gms.internal.ads.zzbek.zze
            java.lang.Object r11 = r11.zze()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L1d5
            if (r1 == 0) goto L1d5
            com.google.android.gms.internal.ads.zzflp r11 = r10.zzd
            r1.zza(r11)
            r1.zzh()
            return
        Lc6:
            android.os.Bundle r5 = r11.zzd     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r6 = r10.zze     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            boolean r7 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzK(r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            if (r7 == 0) goto Lee
            if (r5 == 0) goto Lee
            java.lang.String r6 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzy(r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            r7 = -1
            int r6 = r5.getInt(r6, r7)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            if (r6 != r7) goto Lee
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r6 = r10.zze     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.String r7 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzy(r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.util.concurrent.atomic.AtomicInteger r6 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzF(r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            int r6 = r6.get()     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            r5.putInt(r7, r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
        Lee:
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r6 = r10.zze     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            boolean r7 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzL(r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            if (r7 == 0) goto L138
            if (r5 == 0) goto L138
            java.lang.String r6 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzA(r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            if (r6 == 0) goto L138
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r6 = r10.zze     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.String r6 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzz(r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            if (r6 == 0) goto L12b
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r6 = r10.zze     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.ads.internal.util.zzt r7 = com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r8 = r10.zze     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            android.content.Context r9 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzc(r8)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r8 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzo(r8)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.String r8 = r8.afmaVersion     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.String r7 = r7.zzc(r9, r8)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzG(r6, r7)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
        L12b:
            com.google.android.gms.ads.nonagon.signalgeneration.zzap r6 = r10.zze     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.String r7 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzA(r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.String r6 = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzz(r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            r5.putString(r7, r6)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
        L138:
            com.google.android.gms.internal.ads.zzbzi r6 = r10.zzc     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.String r7 = r11.zza     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.String r11 = r11.zzb     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            r6.zzc(r7, r11, r5)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.internal.ads.zzflp r11 = r10.zzd     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            r11.zzg(r3)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.internal.ads.zzbeb r11 = com.google.android.gms.internal.ads.zzbek.zze
            java.lang.Object r11 = r11.zze()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L1d5
            if (r1 == 0) goto L1d5
            com.google.android.gms.internal.ads.zzflp r11 = r10.zzd
            r1.zza(r11)
            r1.zzh()
            return
        L15f:
            r11 = move-exception
            goto L1d6
        L161:
            r11 = move-exception
            goto L1ab
        L163:
            r11 = move-exception
            java.lang.String r3 = "Failed to create JSON object from the request string."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.internal.ads.zzbzi r3 = r10.zzc     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.String r5 = r11.toString()     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            r6.<init>()     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.String r7 = "Internal error for request JSON: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            r6.append(r5)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            r3.zzb(r5)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.internal.ads.zzflp r3 = r10.zzd     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            r3.zzh(r11)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            r3.zzg(r4)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.internal.ads.zzcad r3 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            r3.zzw(r11, r0)     // Catch: java.lang.Throwable -> L15f android.os.RemoteException -> L161
            com.google.android.gms.internal.ads.zzbeb r11 = com.google.android.gms.internal.ads.zzbek.zze
            java.lang.Object r11 = r11.zze()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L1d5
            if (r1 == 0) goto L1d5
            com.google.android.gms.internal.ads.zzflp r11 = r10.zzd
            r1.zza(r11)
            r1.zzh()
            return
        L1ab:
            com.google.android.gms.internal.ads.zzflp r3 = r10.zzd     // Catch: java.lang.Throwable -> L15f
            r3.zzh(r11)     // Catch: java.lang.Throwable -> L15f
            r3.zzg(r4)     // Catch: java.lang.Throwable -> L15f
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r11)     // Catch: java.lang.Throwable -> L15f
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L15f
            r2.zzw(r11, r0)     // Catch: java.lang.Throwable -> L15f
            com.google.android.gms.internal.ads.zzbeb r11 = com.google.android.gms.internal.ads.zzbek.zze
            java.lang.Object r11 = r11.zze()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L1d5
            if (r1 == 0) goto L1d5
            com.google.android.gms.internal.ads.zzflp r11 = r10.zzd
            r1.zza(r11)
            r1.zzh()
        L1d5:
            return
        L1d6:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zze
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1ee
            if (r1 == 0) goto L1ee
            com.google.android.gms.internal.ads.zzflp r0 = r10.zzd
            r1.zza(r0)
            r1.zzh()
        L1ee:
            throw r11
    }
}
