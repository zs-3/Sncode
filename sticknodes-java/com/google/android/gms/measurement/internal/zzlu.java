package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzlu implements java.lang.Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ android.net.Uri zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ java.lang.String zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlv zze;

    zzlu(com.google.android.gms.measurement.internal.zzlv r1, boolean r2, android.net.Uri r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r19 = this;
            r1 = r19
            com.google.android.gms.measurement.internal.zzlv r2 = r1.zze
            com.google.android.gms.measurement.internal.zzlw r0 = r2.zza
            r0.zzg()
            java.lang.String r3 = r1.zzd
            android.net.Uri r4 = r1.zzb
            com.google.android.gms.measurement.internal.zzio r5 = r0.zzu     // Catch: java.lang.RuntimeException -> L159
            com.google.android.gms.measurement.internal.zzqf r6 = r5.zzw()     // Catch: java.lang.RuntimeException -> L159
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.RuntimeException -> L159
            java.lang.String r8 = "Activity created with data 'referrer' without required params"
            java.lang.String r9 = "utm_medium"
            java.lang.String r10 = "utm_source"
            java.lang.String r11 = "utm_campaign"
            java.lang.String r12 = "_cis"
            java.lang.String r14 = "gclid"
            if (r7 == 0) goto L27
        L25:
            r6 = 0
            goto L8a
        L27:
            boolean r7 = r3.contains(r14)     // Catch: java.lang.RuntimeException -> L159
            if (r7 != 0) goto L75
            java.lang.String r7 = "gbraid"
            boolean r7 = r3.contains(r7)     // Catch: java.lang.RuntimeException -> L159
            if (r7 != 0) goto L75
            boolean r7 = r3.contains(r11)     // Catch: java.lang.RuntimeException -> L159
            if (r7 != 0) goto L75
            boolean r7 = r3.contains(r10)     // Catch: java.lang.RuntimeException -> L159
            if (r7 != 0) goto L75
            boolean r7 = r3.contains(r9)     // Catch: java.lang.RuntimeException -> L159
            if (r7 != 0) goto L75
            java.lang.String r7 = "utm_id"
            boolean r7 = r3.contains(r7)     // Catch: java.lang.RuntimeException -> L159
            if (r7 != 0) goto L75
            java.lang.String r7 = "dclid"
            boolean r7 = r3.contains(r7)     // Catch: java.lang.RuntimeException -> L159
            if (r7 != 0) goto L75
            java.lang.String r7 = "srsltid"
            boolean r7 = r3.contains(r7)     // Catch: java.lang.RuntimeException -> L159
            if (r7 != 0) goto L75
            java.lang.String r7 = "sfmc_id"
            boolean r7 = r3.contains(r7)     // Catch: java.lang.RuntimeException -> L159
            if (r7 != 0) goto L75
            com.google.android.gms.measurement.internal.zzio r6 = r6.zzu     // Catch: java.lang.RuntimeException -> L159
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()     // Catch: java.lang.RuntimeException -> L159
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzd()     // Catch: java.lang.RuntimeException -> L159
            r6.zza(r8)     // Catch: java.lang.RuntimeException -> L159
            goto L25
        L75:
            java.lang.String r7 = "https://google.com/search?"
            java.lang.String r7 = r7.concat(r3)     // Catch: java.lang.RuntimeException -> L159
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.RuntimeException -> L159
            android.os.Bundle r6 = r6.zzu(r7)     // Catch: java.lang.RuntimeException -> L159
            if (r6 == 0) goto L8a
            java.lang.String r7 = "referrer"
            r6.putString(r12, r7)     // Catch: java.lang.RuntimeException -> L159
        L8a:
            java.lang.String r7 = r1.zzc
            boolean r15 = r1.zza
            java.lang.String r13 = "_cmp"
            r1 = 1
            if (r15 == 0) goto Ld3
            com.google.android.gms.measurement.internal.zzqf r15 = r5.zzw()     // Catch: java.lang.RuntimeException -> L159
            android.os.Bundle r4 = r15.zzu(r4)     // Catch: java.lang.RuntimeException -> L159
            if (r4 == 0) goto Ld3
            java.lang.String r15 = "intent"
            r4.putString(r12, r15)     // Catch: java.lang.RuntimeException -> L159
            boolean r12 = r4.containsKey(r14)     // Catch: java.lang.RuntimeException -> L159
            if (r12 != 0) goto Lc8
            if (r6 == 0) goto Lc8
            boolean r12 = r6.containsKey(r14)     // Catch: java.lang.RuntimeException -> L159
            if (r12 == 0) goto Lc8
            java.lang.String r12 = "_cer"
            java.lang.String r15 = "gclid=%s"
            r16 = r2
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.RuntimeException -> L155
            r17 = 0
            java.lang.String r18 = r6.getString(r14)     // Catch: java.lang.RuntimeException -> L155
            r2[r17] = r18     // Catch: java.lang.RuntimeException -> L155
            java.lang.String r2 = java.lang.String.format(r15, r2)     // Catch: java.lang.RuntimeException -> L155
            r4.putString(r12, r2)     // Catch: java.lang.RuntimeException -> L155
            goto Lca
        Lc8:
            r16 = r2
        Lca:
            r0.zzR(r7, r13, r4)     // Catch: java.lang.RuntimeException -> L155
            com.google.android.gms.measurement.internal.zzx r2 = r0.zzb     // Catch: java.lang.RuntimeException -> L155
            r2.zza(r7, r4)     // Catch: java.lang.RuntimeException -> L155
            goto Ld5
        Ld3:
            r16 = r2
        Ld5:
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.RuntimeException -> L155
            if (r2 == 0) goto Ldc
            goto L148
        Ldc:
            com.google.android.gms.measurement.internal.zzhe r2 = r5.zzaW()     // Catch: java.lang.RuntimeException -> L155
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzd()     // Catch: java.lang.RuntimeException -> L155
            java.lang.String r4 = "Activity created with referrer"
            r2.zzb(r4, r3)     // Catch: java.lang.RuntimeException -> L155
            com.google.android.gms.measurement.internal.zzam r2 = r5.zzf()     // Catch: java.lang.RuntimeException -> L155
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzaF     // Catch: java.lang.RuntimeException -> L155
            r12 = 0
            boolean r2 = r2.zzx(r12, r4)     // Catch: java.lang.RuntimeException -> L155
            java.lang.String r4 = "_ldl"
            java.lang.String r12 = "auto"
            if (r2 == 0) goto L117
            if (r6 == 0) goto L105
            r0.zzR(r7, r13, r6)     // Catch: java.lang.RuntimeException -> L155
            com.google.android.gms.measurement.internal.zzx r2 = r0.zzb     // Catch: java.lang.RuntimeException -> L155
            r2.zza(r7, r6)     // Catch: java.lang.RuntimeException -> L155
            goto L112
        L105:
            com.google.android.gms.measurement.internal.zzhe r2 = r5.zzaW()     // Catch: java.lang.RuntimeException -> L155
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzd()     // Catch: java.lang.RuntimeException -> L155
            java.lang.String r5 = "Referrer does not contain valid parameters"
            r2.zzb(r5, r3)     // Catch: java.lang.RuntimeException -> L155
        L112:
            r2 = 0
            r0.zzal(r12, r4, r2, r1)     // Catch: java.lang.RuntimeException -> L155
            return
        L117:
            boolean r2 = r3.contains(r14)     // Catch: java.lang.RuntimeException -> L155
            if (r2 == 0) goto L149
            boolean r2 = r3.contains(r11)     // Catch: java.lang.RuntimeException -> L155
            if (r2 != 0) goto L13f
            boolean r2 = r3.contains(r10)     // Catch: java.lang.RuntimeException -> L155
            if (r2 != 0) goto L13f
            boolean r2 = r3.contains(r9)     // Catch: java.lang.RuntimeException -> L155
            if (r2 != 0) goto L13f
            java.lang.String r2 = "utm_term"
            boolean r2 = r3.contains(r2)     // Catch: java.lang.RuntimeException -> L155
            if (r2 != 0) goto L13f
            java.lang.String r2 = "utm_content"
            boolean r2 = r3.contains(r2)     // Catch: java.lang.RuntimeException -> L155
            if (r2 == 0) goto L149
        L13f:
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.RuntimeException -> L155
            if (r2 != 0) goto L148
            r0.zzal(r12, r4, r3, r1)     // Catch: java.lang.RuntimeException -> L155
        L148:
            return
        L149:
            com.google.android.gms.measurement.internal.zzhe r0 = r5.zzaW()     // Catch: java.lang.RuntimeException -> L155
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()     // Catch: java.lang.RuntimeException -> L155
            r0.zza(r8)     // Catch: java.lang.RuntimeException -> L155
            return
        L155:
            r0 = move-exception
            r1 = r16
            goto L15b
        L159:
            r0 = move-exception
            r1 = r2
        L15b:
            com.google.android.gms.measurement.internal.zzlw r1 = r1.zza
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.zzb(r2, r0)
            return
    }
}
