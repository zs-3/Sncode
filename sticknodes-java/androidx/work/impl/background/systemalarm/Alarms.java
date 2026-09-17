package androidx.work.impl.background.systemalarm;

/* loaded from: classes.dex */
class Alarms {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "Alarms"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.systemalarm.Alarms.TAG = r0
            return
    }

    public static void cancelAlarm(android.content.Context r4, androidx.work.impl.WorkManagerImpl r5, java.lang.String r6) {
            androidx.work.impl.WorkDatabase r5 = r5.getWorkDatabase()
            androidx.work.impl.model.SystemIdInfoDao r5 = r5.systemIdInfoDao()
            androidx.work.impl.model.SystemIdInfo r0 = r5.getSystemIdInfo(r6)
            if (r0 == 0) goto L2d
            int r0 = r0.systemId
            cancelExactAlarm(r4, r6, r0)
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.background.systemalarm.Alarms.TAG
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            java.lang.String r3 = "Removing SystemIdInfo for workSpecId (%s)"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r4.debug(r0, r1, r2)
            r5.removeSystemIdInfo(r6)
        L2d:
            return
    }

    private static void cancelExactAlarm(android.content.Context r5, java.lang.String r6, int r7) {
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            android.content.Intent r1 = androidx.work.impl.background.systemalarm.CommandHandler.createDelayMetIntent(r5, r6)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L15
            r2 = 603979776(0x24000000, float:2.7755576E-17)
            goto L17
        L15:
            r2 = 536870912(0x20000000, float:1.0842022E-19)
        L17:
            android.app.PendingIntent r5 = android.app.PendingIntent.getService(r5, r7, r1, r2)
            if (r5 == 0) goto L40
            if (r0 == 0) goto L40
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.impl.background.systemalarm.Alarms.TAG
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r6
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3[r6] = r7
            java.lang.String r6 = "Cancelling existing alarm with (workSpecId, systemId) (%s, %s)"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            java.lang.Throwable[] r7 = new java.lang.Throwable[r4]
            r1.debug(r2, r6, r7)
            r0.cancel(r5)
        L40:
            return
    }

    public static void setAlarm(android.content.Context r2, androidx.work.impl.WorkManagerImpl r3, java.lang.String r4, long r5) {
            androidx.work.impl.WorkDatabase r3 = r3.getWorkDatabase()
            androidx.work.impl.model.SystemIdInfoDao r0 = r3.systemIdInfoDao()
            androidx.work.impl.model.SystemIdInfo r1 = r0.getSystemIdInfo(r4)
            if (r1 == 0) goto L19
            int r3 = r1.systemId
            cancelExactAlarm(r2, r4, r3)
            int r3 = r1.systemId
            setExactAlarm(r2, r4, r3, r5)
            goto L2d
        L19:
            androidx.work.impl.utils.IdGenerator r1 = new androidx.work.impl.utils.IdGenerator
            r1.<init>(r3)
            int r3 = r1.nextAlarmManagerId()
            androidx.work.impl.model.SystemIdInfo r1 = new androidx.work.impl.model.SystemIdInfo
            r1.<init>(r4, r3)
            r0.insertSystemIdInfo(r1)
            setExactAlarm(r2, r4, r3, r5)
        L2d:
            return
    }

    private static void setExactAlarm(android.content.Context r3, java.lang.String r4, int r5, long r6) {
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L11
            r1 = 201326592(0xc000000, float:9.8607613E-32)
            goto L13
        L11:
            r1 = 134217728(0x8000000, float:3.85186E-34)
        L13:
            android.content.Intent r4 = androidx.work.impl.background.systemalarm.CommandHandler.createDelayMetIntent(r3, r4)
            android.app.PendingIntent r3 = android.app.PendingIntent.getService(r3, r5, r4, r1)
            if (r0 == 0) goto L21
            r4 = 0
            r0.setExact(r4, r6, r3)
        L21:
            return
    }
}
