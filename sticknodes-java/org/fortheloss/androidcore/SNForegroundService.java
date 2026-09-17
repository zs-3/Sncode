package org.fortheloss.androidcore;

/* loaded from: classes2.dex */
public class SNForegroundService extends android.app.Service {
    public SNForegroundService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r7, int r8, int r9) {
            r6 = this;
            if (r7 == 0) goto L93
            java.lang.Class<?> r8 = org.fortheloss.androidcore.AndroidCore.mainActivityClass
            if (r8 != 0) goto L8
            goto L93
        L8:
            java.lang.String r8 = "INTENT_CHANNEL_ID"
            java.lang.String r8 = r7.getStringExtra(r8)
            java.lang.String r9 = "INTENT_CHANNEL_NAME"
            java.lang.String r9 = r7.getStringExtra(r9)
            java.lang.String r0 = "INTENT_TITLE"
            java.lang.String r0 = r7.getStringExtra(r0)
            java.lang.String r1 = "INTENT_TEXT"
            java.lang.String r7 = r7.getStringExtra(r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<?> r2 = org.fortheloss.androidcore.AndroidCore.mainActivityClass
            r1.<init>(r6, r2)
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = 0
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r6, r3, r1, r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            r5 = 1
            if (r2 < r4) goto L6f
            android.app.NotificationChannel r3 = new android.app.NotificationChannel
            r4 = 4
            r3.<init>(r8, r9, r4)
            java.lang.Class<android.app.NotificationManager> r9 = android.app.NotificationManager.class
            java.lang.Object r9 = r6.getSystemService(r9)
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9
            r9.createNotificationChannel(r3)
            android.app.Notification$Builder r9 = new android.app.Notification$Builder
            r9.<init>(r6, r8)
            android.app.Notification$Builder r8 = r9.setContentTitle(r0)
            android.app.Notification$Builder r7 = r8.setContentText(r7)
            int r8 = org.fortheloss.androidcore.R$drawable.sn_service_notif
            android.app.Notification$Builder r7 = r7.setSmallIcon(r8)
            android.app.Notification$Builder r7 = r7.setContentIntent(r1)
            android.app.Notification r7 = r7.build()
            r8 = 29
            if (r2 < r8) goto L6b
            r8 = 1073741824(0x40000000, float:2.0)
            r6.startForeground(r5, r7, r8)
            goto L91
        L6b:
            r6.startForeground(r5, r7)
            goto L91
        L6f:
            androidx.core.app.NotificationCompat$Builder r9 = new androidx.core.app.NotificationCompat$Builder
            r9.<init>(r6, r8)
            androidx.core.app.NotificationCompat$Builder r8 = r9.setContentTitle(r0)
            androidx.core.app.NotificationCompat$Builder r7 = r8.setContentText(r7)
            int r8 = org.fortheloss.androidcore.R$drawable.sn_service_notif
            androidx.core.app.NotificationCompat$Builder r7 = r7.setSmallIcon(r8)
            androidx.core.app.NotificationCompat$Builder r7 = r7.setPriority(r3)
            androidx.core.app.NotificationCompat$Builder r7 = r7.setAutoCancel(r3)
            android.app.Notification r7 = r7.build()
            r6.startForeground(r5, r7)
        L91:
            r7 = 3
            return r7
        L93:
            r7 = 2
            return r7
    }
}
