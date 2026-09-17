package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@android.annotation.TargetApi(26)
/* loaded from: classes.dex */
public class zzw extends com.google.android.gms.ads.internal.util.zzv {
    public zzw() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final android.content.Intent zzf(android.app.Activity r3) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.settings.APP_NOTIFICATION_SETTINGS"
            r0.setAction(r1)
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r1 = "android.provider.extra.APP_PACKAGE"
            r0.putExtra(r1, r3)
            return r0
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final com.google.android.gms.internal.ads.zzbcb.zzq zzg(android.content.Context r2, android.telephony.TelephonyManager r3) {
            r1 = this;
            com.google.android.gms.ads.internal.zzu.zzp()
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = com.google.android.gms.ads.internal.util.zzt.zzA(r2, r0)
            if (r2 == 0) goto L17
            boolean r2 = r3.isDataEnabled()
            if (r2 == 0) goto L14
            com.google.android.gms.internal.ads.zzbcb$zzq r2 = com.google.android.gms.internal.ads.zzbcb.zzq.zzb
            goto L16
        L14:
            com.google.android.gms.internal.ads.zzbcb$zzq r2 = com.google.android.gms.internal.ads.zzbcb.zzq.zza
        L16:
            return r2
        L17:
            com.google.android.gms.internal.ads.zzbcb$zzq r2 = com.google.android.gms.internal.ads.zzbcb.zzq.zza
            return r2
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final void zzh(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            android.app.NotificationChannel r4 = new android.app.NotificationChannel
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzie
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r0.zza(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r0 = "offline_notification_channel"
            java.lang.String r1 = "AdMob Offline Notifications"
            r4.<init>(r0, r1, r5)
            r5 = 0
            r4.setShowBadge(r5)
            java.lang.Class<android.app.NotificationManager> r5 = android.app.NotificationManager.class
            java.lang.Object r3 = r3.getSystemService(r5)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            r3.createNotificationChannel(r4)
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final boolean zzi(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            java.lang.Class<android.app.NotificationManager> r2 = android.app.NotificationManager.class
            java.lang.Object r1 = r1.getSystemService(r2)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            java.lang.String r2 = "offline_notification_channel"
            android.app.NotificationChannel r1 = r1.getNotificationChannel(r2)
            r2 = 0
            if (r1 != 0) goto L12
            return r2
        L12:
            int r1 = r1.getImportance()
            if (r1 != 0) goto L1a
            r1 = 1
            return r1
        L1a:
            return r2
    }
}
