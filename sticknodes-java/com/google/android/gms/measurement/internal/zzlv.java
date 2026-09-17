package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzlv implements android.app.Application.ActivityLifecycleCallbacks, com.google.android.gms.measurement.internal.zzlt {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zza;

    zzlv(com.google.android.gms.measurement.internal.zzlw r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            com.google.android.gms.internal.measurement.zzdj r1 = com.google.android.gms.internal.measurement.zzdj.zza(r1)
            r0.zza(r1, r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r1) {
            r0 = this;
            com.google.android.gms.internal.measurement.zzdj r1 = com.google.android.gms.internal.measurement.zzdj.zza(r1)
            r0.zzb(r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r1) {
            r0 = this;
            com.google.android.gms.internal.measurement.zzdj r1 = com.google.android.gms.internal.measurement.zzdj.zza(r1)
            r0.zzc(r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r1) {
            r0 = this;
            com.google.android.gms.internal.measurement.zzdj r1 = com.google.android.gms.internal.measurement.zzdj.zza(r1)
            r0.zzd(r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            com.google.android.gms.internal.measurement.zzdj r1 = com.google.android.gms.internal.measurement.zzdj.zza(r1)
            r0.zze(r1, r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zza(com.google.android.gms.internal.measurement.zzdj r9, android.os.Bundle r10) {
            r8 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r8.zza     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            java.lang.String r3 = "onActivityCreated"
            r2.zza(r3)     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            android.content.Intent r2 = r9.zzc     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            if (r2 == 0) goto L89
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            r4 = 0
            if (r3 == 0) goto L25
            boolean r5 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            if (r5 != 0) goto L23
            goto L25
        L23:
            r4 = r3
            goto L3c
        L25:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            if (r3 == 0) goto L3c
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            if (r5 != 0) goto L3c
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            goto L23
        L3c:
            if (r4 == 0) goto L89
            boolean r3 = r4.isHierarchical()     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            if (r3 != 0) goto L45
            goto L89
        L45:
            r1.zzw()     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            java.lang.String r2 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            if (r2 != 0) goto L6a
            java.lang.String r2 = "https://www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            if (r2 != 0) goto L6a
            java.lang.String r2 = "android-app://com.google.appcrawler"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            if (r0 == 0) goto L67
            goto L6a
        L67:
            java.lang.String r0 = "auto"
            goto L6c
        L6a:
            java.lang.String r0 = "gs"
        L6c:
            r5 = r0
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            if (r10 != 0) goto L78
            r0 = 1
            r3 = 1
            goto L7a
        L78:
            r0 = 0
            r3 = 0
        L7a:
            com.google.android.gms.measurement.internal.zzil r0 = r1.zzaX()     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            com.google.android.gms.measurement.internal.zzlu r7 = new com.google.android.gms.measurement.internal.zzlu     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            r0.zzq(r7)     // Catch: java.lang.Throwable -> L93 java.lang.RuntimeException -> L95
            goto La7
        L89:
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
        L8b:
            com.google.android.gms.measurement.internal.zzmo r0 = r0.zzt()
            r0.zzs(r9, r10)
            return
        L93:
            r0 = move-exception
            goto Lac
        L95:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzlw r1 = r8.zza     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.zzb(r2, r0)     // Catch: java.lang.Throwable -> L93
        La7:
            com.google.android.gms.measurement.internal.zzlw r0 = r8.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            goto L8b
        Lac:
            com.google.android.gms.measurement.internal.zzlw r1 = r8.zza
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzmo r1 = r1.zzt()
            r1.zzs(r9, r10)
            throw r0
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzb(com.google.android.gms.internal.measurement.zzdj r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzmo r0 = r0.zzt()
            r0.zzt(r2)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzc(com.google.android.gms.internal.measurement.zzdj r5) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r4.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzmo r1 = r0.zzt()
            r1.zzu(r5)
            com.google.android.gms.measurement.internal.zzop r5 = r0.zzv()
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r1 = r1.elapsedRealtime()
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzoi r3 = new com.google.android.gms.measurement.internal.zzoi
            r3.<init>(r5, r1)
            r0.zzq(r3)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzd(com.google.android.gms.internal.measurement.zzdj r7) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r6.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzop r1 = r0.zzv()
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            com.google.android.gms.common.util.Clock r3 = r2.zzaU()
            long r3 = r3.elapsedRealtime()
            com.google.android.gms.measurement.internal.zzil r2 = r2.zzaX()
            com.google.android.gms.measurement.internal.zzoh r5 = new com.google.android.gms.measurement.internal.zzoh
            r5.<init>(r1, r3)
            r2.zzq(r5)
            com.google.android.gms.measurement.internal.zzmo r0 = r0.zzt()
            r0.zzv(r7)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zze(com.google.android.gms.internal.measurement.zzdj r2, android.os.Bundle r3) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzmo r0 = r0.zzt()
            r0.zzw(r2, r3)
            return
    }
}
