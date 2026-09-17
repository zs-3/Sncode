package androidx.core.app;

/* loaded from: classes.dex */
class NotificationCompatJellybean {
    private static final java.lang.Object sActionsLock = null;
    private static final java.lang.Object sExtrasLock = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.NotificationCompatJellybean.sExtrasLock = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.NotificationCompatJellybean.sActionsLock = r0
            return
    }

    static android.os.Bundle getBundleForAction(androidx.core.app.NotificationCompat.Action r4) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.core.graphics.drawable.IconCompat r1 = r4.getIconCompat()
            if (r1 == 0) goto L10
            int r1 = r1.getResId()
            goto L11
        L10:
            r1 = 0
        L11:
            java.lang.String r2 = "icon"
            r0.putInt(r2, r1)
            java.lang.CharSequence r1 = r4.getTitle()
            java.lang.String r2 = "title"
            r0.putCharSequence(r2, r1)
            android.app.PendingIntent r1 = r4.getActionIntent()
            java.lang.String r2 = "actionIntent"
            r0.putParcelable(r2, r1)
            android.os.Bundle r1 = r4.getExtras()
            if (r1 == 0) goto L38
            android.os.Bundle r1 = new android.os.Bundle
            android.os.Bundle r2 = r4.getExtras()
            r1.<init>(r2)
            goto L3d
        L38:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L3d:
            boolean r2 = r4.getAllowGeneratedReplies()
            java.lang.String r3 = "android.support.allowGeneratedReplies"
            r1.putBoolean(r3, r2)
            java.lang.String r2 = "extras"
            r0.putBundle(r2, r1)
            androidx.core.app.RemoteInput[] r1 = r4.getRemoteInputs()
            android.os.Bundle[] r1 = toBundleArray(r1)
            java.lang.String r2 = "remoteInputs"
            r0.putParcelableArray(r2, r1)
            boolean r1 = r4.getShowsUserInterface()
            java.lang.String r2 = "showsUserInterface"
            r0.putBoolean(r2, r1)
            int r4 = r4.getSemanticAction()
            java.lang.String r1 = "semanticAction"
            r0.putInt(r1, r4)
            return r0
    }

    private static android.os.Bundle toBundle(androidx.core.app.RemoteInput r0) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r0 = 0
            throw r0
    }

    private static android.os.Bundle[] toBundleArray(androidx.core.app.RemoteInput[] r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length
            android.os.Bundle[] r1 = new android.os.Bundle[r1]
            r2 = 0
        L8:
            int r3 = r4.length
            if (r2 >= r3) goto L16
            r3 = r4[r2]
            android.os.Bundle r3 = toBundle(r0)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L8
        L16:
            return r1
    }
}
