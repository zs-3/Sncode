package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class IdGenerator {
    private final androidx.work.impl.WorkDatabase mWorkDatabase;

    public IdGenerator(androidx.work.impl.WorkDatabase r1) {
            r0 = this;
            r0.<init>()
            r0.mWorkDatabase = r1
            return
    }

    public static void migrateLegacyIdGenerator(android.content.Context r8, androidx.sqlite.db.SupportSQLiteDatabase r9) {
            java.lang.String r0 = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)"
            java.lang.String r1 = "androidx.work.util.id"
            r2 = 0
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r1, r2)
            java.lang.String r1 = "next_job_scheduler_id"
            boolean r3 = r8.contains(r1)
            if (r3 != 0) goto L17
            boolean r3 = r8.contains(r1)
            if (r3 == 0) goto L51
        L17:
            int r3 = r8.getInt(r1, r2)
            java.lang.String r4 = "next_alarm_manager_id"
            int r5 = r8.getInt(r4, r2)
            r9.beginTransaction()
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L52
            r7[r2] = r1     // Catch: java.lang.Throwable -> L52
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L52
            r3 = 1
            r7[r3] = r1     // Catch: java.lang.Throwable -> L52
            r9.execSQL(r0, r7)     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L52
            r1[r2] = r4     // Catch: java.lang.Throwable -> L52
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L52
            r1[r3] = r2     // Catch: java.lang.Throwable -> L52
            r9.execSQL(r0, r1)     // Catch: java.lang.Throwable -> L52
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch: java.lang.Throwable -> L52
            android.content.SharedPreferences$Editor r8 = r8.clear()     // Catch: java.lang.Throwable -> L52
            r8.apply()     // Catch: java.lang.Throwable -> L52
            r9.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L52
            r9.endTransaction()
        L51:
            return
        L52:
            r8 = move-exception
            r9.endTransaction()
            throw r8
    }

    private int nextId(java.lang.String r4) {
            r3 = this;
            androidx.work.impl.WorkDatabase r0 = r3.mWorkDatabase
            r0.beginTransaction()
            androidx.work.impl.WorkDatabase r0 = r3.mWorkDatabase     // Catch: java.lang.Throwable -> L2e
            androidx.work.impl.model.PreferenceDao r0 = r0.preferenceDao()     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r0 = r0.getLongValue(r4)     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            if (r0 == 0) goto L17
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L2e
            goto L18
        L17:
            r0 = 0
        L18:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r2) goto L1e
            goto L20
        L1e:
            int r1 = r0 + 1
        L20:
            r3.update(r4, r1)     // Catch: java.lang.Throwable -> L2e
            androidx.work.impl.WorkDatabase r4 = r3.mWorkDatabase     // Catch: java.lang.Throwable -> L2e
            r4.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2e
            androidx.work.impl.WorkDatabase r4 = r3.mWorkDatabase
            r4.endTransaction()
            return r0
        L2e:
            r4 = move-exception
            androidx.work.impl.WorkDatabase r0 = r3.mWorkDatabase
            r0.endTransaction()
            throw r4
    }

    private void update(java.lang.String r5, int r6) {
            r4 = this;
            androidx.work.impl.WorkDatabase r0 = r4.mWorkDatabase
            androidx.work.impl.model.PreferenceDao r0 = r0.preferenceDao()
            androidx.work.impl.model.Preference r1 = new androidx.work.impl.model.Preference
            long r2 = (long) r6
            r1.<init>(r5, r2)
            r0.insertPreference(r1)
            return
    }

    public int nextAlarmManagerId() {
            r2 = this;
            java.lang.Class<androidx.work.impl.utils.IdGenerator> r0 = androidx.work.impl.utils.IdGenerator.class
            monitor-enter(r0)
            java.lang.String r1 = "next_alarm_manager_id"
            int r1 = r2.nextId(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public int nextJobSchedulerIdWithRange(int r3, int r4) {
            r2 = this;
            java.lang.Class<androidx.work.impl.utils.IdGenerator> r0 = androidx.work.impl.utils.IdGenerator.class
            monitor-enter(r0)
            java.lang.String r1 = "next_job_scheduler_id"
            int r1 = r2.nextId(r1)     // Catch: java.lang.Throwable -> L19
            if (r1 < r3) goto L10
            if (r1 <= r4) goto Le
            goto L10
        Le:
            r3 = r1
            goto L17
        L10:
            java.lang.String r4 = "next_job_scheduler_id"
            int r1 = r3 + 1
            r2.update(r4, r1)     // Catch: java.lang.Throwable -> L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r3
        L19:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }
}
