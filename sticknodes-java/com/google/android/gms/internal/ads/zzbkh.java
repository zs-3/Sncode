package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbkh {
    public static final android.content.Intent zza(android.net.Uri r0, android.content.Context r1, com.google.android.gms.internal.ads.zzavn r2, android.view.View r3, com.google.android.gms.internal.ads.zzfhg r4) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2)
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r3)
            r1.setData(r0)
            r1.setAction(r2)
            return r1
    }

    public static final android.content.Intent zzb(android.content.Intent r0, android.content.pm.ResolveInfo r1, android.content.Context r2, com.google.android.gms.internal.ads.zzavn r3, android.view.View r4, com.google.android.gms.internal.ads.zzfhg r5) {
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            android.content.pm.ActivityInfo r0 = r1.activityInfo
            java.lang.String r1 = r0.packageName
            java.lang.String r0 = r0.name
            r2.setClassName(r1, r0)
            return r2
    }

    public static final android.content.pm.ResolveInfo zzc(android.content.Intent r6, android.content.Context r7, com.google.android.gms.internal.ads.zzavn r8, android.view.View r9, com.google.android.gms.internal.ads.zzfhg r10) {
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            android.content.pm.ResolveInfo r6 = zzd(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static final android.content.pm.ResolveInfo zzd(android.content.Intent r1, java.util.ArrayList r2, android.content.Context r3, com.google.android.gms.internal.ads.zzavn r4, android.view.View r5, com.google.android.gms.internal.ads.zzfhg r6) {
            r4 = 0
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L8
            return r4
        L8:
            r5 = 65536(0x10000, float:9.18355E-41)
            java.util.List r6 = r3.queryIntentActivities(r1, r5)     // Catch: java.lang.Throwable -> L3a
            android.content.pm.ResolveInfo r1 = r3.resolveActivity(r1, r5)     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L36
            if (r1 == 0) goto L36
            r3 = 0
        L17:
            int r5 = r6.size()     // Catch: java.lang.Throwable -> L3a
            if (r3 >= r5) goto L36
            java.lang.Object r5 = r6.get(r3)     // Catch: java.lang.Throwable -> L3a
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5     // Catch: java.lang.Throwable -> L3a
            android.content.pm.ActivityInfo r0 = r1.activityInfo     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r0.name     // Catch: java.lang.Throwable -> L3a
            android.content.pm.ActivityInfo r5 = r5.activityInfo     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = r5.name     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r0.equals(r5)     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L33
            r4 = r1
            goto L36
        L33:
            int r3 = r3 + 1
            goto L17
        L36:
            r2.addAll(r6)     // Catch: java.lang.Throwable -> L3a
            goto L44
        L3a:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r3 = "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent"
            r2.zzw(r1, r3)
        L44:
            return r4
    }
}
