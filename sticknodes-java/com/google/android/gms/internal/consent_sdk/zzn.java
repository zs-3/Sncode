package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
final class zzn {
    private final com.google.android.gms.internal.consent_sdk.zzl zza;
    private final android.app.Activity zzb;
    private final com.google.android.ump.ConsentDebugSettings zzc;
    private final com.google.android.ump.ConsentRequestParameters zzd;

    /* synthetic */ zzn(com.google.android.gms.internal.consent_sdk.zzl r1, android.app.Activity r2, com.google.android.ump.ConsentDebugSettings r3, com.google.android.ump.ConsentRequestParameters r4, com.google.android.gms.internal.consent_sdk.zzm r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.consent_sdk.zzci zza(com.google.android.gms.internal.consent_sdk.zzn r9) {
            com.google.android.gms.internal.consent_sdk.zzci r0 = new com.google.android.gms.internal.consent_sdk.zzci
            r0.<init>()
            com.google.android.ump.ConsentRequestParameters r1 = r9.zzd
            java.lang.String r1 = r1.zza()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 != 0) goto L13
            goto L3f
        L13:
            com.google.android.gms.internal.consent_sdk.zzl r2 = r9.zza     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            android.app.Application r2 = com.google.android.gms.internal.consent_sdk.zzl.zza(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            com.google.android.gms.internal.consent_sdk.zzl r4 = r9.zza     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            android.app.Application r4 = com.google.android.gms.internal.consent_sdk.zzl.zza(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            goto L31
        L30:
            r2 = r3
        L31:
            if (r2 == 0) goto L39
            java.lang.String r1 = "com.google.android.gms.ads.APPLICATION_ID"
            java.lang.String r1 = r2.getString(r1)
        L39:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L1d5
        L3f:
            r0.zza = r1
            com.google.android.ump.ConsentDebugSettings r1 = r9.zzc
            boolean r1 = r1.isTestDevice()
            r2 = 2
            if (r1 != 0) goto L4f
            java.util.List r1 = java.util.Collections.emptyList()
            goto L70
        L4f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.android.ump.ConsentDebugSettings r4 = r9.zzc
            int r4 = r4.getDebugGeography()
            r5 = 1
            if (r4 == r5) goto L66
            if (r4 == r2) goto L60
            goto L6b
        L60:
            com.google.android.gms.internal.consent_sdk.zzcd r4 = com.google.android.gms.internal.consent_sdk.zzcd.zzd
            r1.add(r4)
            goto L6b
        L66:
            com.google.android.gms.internal.consent_sdk.zzcd r4 = com.google.android.gms.internal.consent_sdk.zzcd.zzc
            r1.add(r4)
        L6b:
            com.google.android.gms.internal.consent_sdk.zzcd r4 = com.google.android.gms.internal.consent_sdk.zzcd.zze
            r1.add(r4)
        L70:
            r0.zzi = r1
            com.google.android.gms.internal.consent_sdk.zzl r1 = r9.zza
            com.google.android.gms.internal.consent_sdk.zzap r1 = com.google.android.gms.internal.consent_sdk.zzl.zzb(r1)
            java.util.Map r1 = r1.zzc()
            r0.zze = r1
            com.google.android.ump.ConsentRequestParameters r1 = r9.zzd
            boolean r1 = r1.isTagForUnderAgeOfConsent()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.zzd = r1
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.toLanguageTag()
            r0.zzc = r1
            com.google.android.gms.internal.consent_sdk.zzce r1 = new com.google.android.gms.internal.consent_sdk.zzce
            r1.<init>()
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1.zzb = r5
            java.lang.String r5 = android.os.Build.MODEL
            r1.zza = r5
            r1.zzc = r2
            r0.zzb = r1
            com.google.android.gms.internal.consent_sdk.zzl r1 = r9.zza
            android.app.Application r1 = com.google.android.gms.internal.consent_sdk.zzl.zza(r1)
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            com.google.android.gms.internal.consent_sdk.zzl r2 = r9.zza
            android.app.Application r2 = com.google.android.gms.internal.consent_sdk.zzl.zza(r2)
            android.content.res.Resources r2 = r2.getResources()
            r2.getConfiguration()
            com.google.android.gms.internal.consent_sdk.zzcg r2 = new com.google.android.gms.internal.consent_sdk.zzcg
            r2.<init>()
            int r5 = r1.screenWidthDp
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.zza = r5
            int r1 = r1.screenHeightDp
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.zzb = r1
            com.google.android.gms.internal.consent_sdk.zzl r1 = r9.zza
            android.app.Application r1 = com.google.android.gms.internal.consent_sdk.zzl.zza(r1)
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            double r5 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            r2.zzc = r1
            r1 = 28
            if (r4 >= r1) goto Lfa
            java.util.List r4 = java.util.Collections.emptyList()
            goto L16b
        Lfa:
            android.app.Activity r4 = r9.zzb
            if (r4 != 0) goto L100
            r4 = r3
            goto L104
        L100:
            android.view.Window r4 = r4.getWindow()
        L104:
            if (r4 != 0) goto L108
            r4 = r3
            goto L10c
        L108:
            android.view.View r4 = r4.getDecorView()
        L10c:
            if (r4 != 0) goto L110
            r4 = r3
            goto L114
        L110:
            android.view.WindowInsets r4 = r4.getRootWindowInsets()
        L114:
            if (r4 != 0) goto L118
            r4 = r3
            goto L11c
        L118:
            android.view.DisplayCutout r4 = r4.getDisplayCutout()
        L11c:
            if (r4 != 0) goto L123
            java.util.List r4 = java.util.Collections.emptyList()
            goto L16b
        L123:
            r4.getSafeInsetBottom()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r4 = r4.getBoundingRects()
            java.util.Iterator r4 = r4.iterator()
        L133:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L16a
            java.lang.Object r6 = r4.next()
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            if (r6 == 0) goto L133
            com.google.android.gms.internal.consent_sdk.zzcf r7 = new com.google.android.gms.internal.consent_sdk.zzcf
            r7.<init>()
            int r8 = r6.left
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.zzb = r8
            int r8 = r6.right
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.zzc = r8
            int r8 = r6.top
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.zza = r8
            int r6 = r6.bottom
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.zzd = r6
            r5.add(r7)
            goto L133
        L16a:
            r4 = r5
        L16b:
            r2.zzd = r4
            r0.zzf = r2
            com.google.android.gms.internal.consent_sdk.zzl r2 = r9.zza
            android.app.Application r4 = com.google.android.gms.internal.consent_sdk.zzl.zza(r2)
            android.app.Application r2 = com.google.android.gms.internal.consent_sdk.zzl.zza(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L187
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L187
            java.lang.String r5 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L187
            r6 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L187
            goto L188
        L187:
            r2 = r3
        L188:
            com.google.android.gms.internal.consent_sdk.zzcc r5 = new com.google.android.gms.internal.consent_sdk.zzcc
            r5.<init>()
            java.lang.String r4 = r4.getPackageName()
            r5.zza = r4
            com.google.android.gms.internal.consent_sdk.zzl r4 = r9.zza
            android.app.Application r4 = com.google.android.gms.internal.consent_sdk.zzl.zza(r4)
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            com.google.android.gms.internal.consent_sdk.zzl r9 = r9.zza
            android.app.Application r9 = com.google.android.gms.internal.consent_sdk.zzl.zza(r9)
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo()
            java.lang.CharSequence r9 = r4.getApplicationLabel(r9)
            if (r9 == 0) goto L1b1
            java.lang.String r3 = r9.toString()
        L1b1:
            r5.zzb = r3
            if (r2 == 0) goto L1c7
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r1) goto L1be
            long r1 = r2.getLongVersionCode()
            goto L1c1
        L1be:
            int r9 = r2.versionCode
            long r1 = (long) r9
        L1c1:
            java.lang.String r9 = java.lang.Long.toString(r1)
            r5.zzc = r9
        L1c7:
            r0.zzg = r5
            com.google.android.gms.internal.consent_sdk.zzch r9 = new com.google.android.gms.internal.consent_sdk.zzch
            r9.<init>()
            java.lang.String r1 = "3.0.0"
            r9.zza = r1
            r0.zzh = r9
            return r0
        L1d5:
            com.google.android.gms.internal.consent_sdk.zzg r9 = new com.google.android.gms.internal.consent_sdk.zzg
            r0 = 3
            java.lang.String r1 = "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"xGN4Vue"
            r9.<init>(r0, r1)
            throw r9
    }
}
