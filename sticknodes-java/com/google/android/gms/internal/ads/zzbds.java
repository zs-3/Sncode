package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbds {
    private androidx.browser.customtabs.CustomTabsSession zza;
    private androidx.browser.customtabs.CustomTabsClient zzb;
    private androidx.browser.customtabs.CustomTabsServiceConnection zzc;
    private com.google.android.gms.internal.ads.zzbdr zzd;

    public zzbds() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean zzg(android.content.Context r6) {
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            r1 = 0
            if (r0 != 0) goto L8
            goto L4e
        L8:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "http://www.example.com"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r4 = "android.intent.action.VIEW"
            r2.<init>(r4, r3)
            android.content.pm.ResolveInfo r3 = r0.resolveActivity(r2, r1)
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r0.queryIntentActivities(r2, r4)
            if (r0 == 0) goto L4e
            if (r3 == 0) goto L4e
            r2 = 0
        L24:
            int r4 = r0.size()
            if (r2 >= r4) goto L4e
            java.lang.Object r4 = r0.get(r2)
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ActivityInfo r5 = r3.activityInfo
            java.lang.String r5 = r5.name
            android.content.pm.ActivityInfo r4 = r4.activityInfo
            java.lang.String r4 = r4.name
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L4b
            android.content.pm.ActivityInfo r0 = r3.activityInfo
            java.lang.String r0 = r0.packageName
            java.lang.String r6 = com.google.android.gms.internal.ads.zzhjb.zza(r6)
            boolean r6 = r0.equals(r6)
            return r6
        L4b:
            int r2 = r2 + 1
            goto L24
        L4e:
            return r1
    }

    public final androidx.browser.customtabs.CustomTabsSession zza() {
            r3 = this;
            androidx.browser.customtabs.CustomTabsClient r0 = r3.zzb
            r1 = 0
            if (r0 != 0) goto L8
            r3.zza = r1
            goto L12
        L8:
            androidx.browser.customtabs.CustomTabsSession r2 = r3.zza
            if (r2 != 0) goto L12
            androidx.browser.customtabs.CustomTabsSession r0 = r0.newSession(r1)
            r3.zza = r0
        L12:
            androidx.browser.customtabs.CustomTabsSession r0 = r3.zza
            return r0
    }

    public final void zzb(android.app.Activity r3) {
            r2 = this;
            androidx.browser.customtabs.CustomTabsClient r0 = r2.zzb
            if (r0 == 0) goto L5
            goto L15
        L5:
            java.lang.String r0 = com.google.android.gms.internal.ads.zzhjb.zza(r3)
            if (r0 == 0) goto L15
            com.google.android.gms.internal.ads.zzhjc r1 = new com.google.android.gms.internal.ads.zzhjc
            r1.<init>(r2)
            r2.zzc = r1
            androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(r3, r0, r1)
        L15:
            return
    }

    public final void zzc(androidx.browser.customtabs.CustomTabsClient r3) {
            r2 = this;
            r2.zzb = r3
            r0 = 0
            r3.warmup(r0)
            com.google.android.gms.internal.ads.zzbdr r3 = r2.zzd
            if (r3 == 0) goto Le
            r3.zza()
        Le:
            return
    }

    public final void zzd() {
            r1 = this;
            r0 = 0
            r1.zzb = r0
            r1.zza = r0
            return
    }

    public final void zze(com.google.android.gms.internal.ads.zzbdr r1) {
            r0 = this;
            r0.zzd = r1
            return
    }

    public final void zzf(android.app.Activity r2) {
            r1 = this;
            androidx.browser.customtabs.CustomTabsServiceConnection r0 = r1.zzc
            if (r0 != 0) goto L5
            return
        L5:
            r2.unbindService(r0)
            r2 = 0
            r1.zzb = r2
            r1.zza = r2
            r1.zzc = r2
            return
    }
}
