package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class PreferenceUtils {
    private final androidx.work.impl.WorkDatabase mWorkDatabase;

    public PreferenceUtils(androidx.work.impl.WorkDatabase r1) {
            r0 = this;
            r0.<init>()
            r0.mWorkDatabase = r1
            return
    }

    public static void migrateLegacyPreferences(android.content.Context r10, androidx.sqlite.db.SupportSQLiteDatabase r11) {
            java.lang.String r0 = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)"
            java.lang.String r1 = "androidx.work.util.preferences"
            r2 = 0
            android.content.SharedPreferences r10 = r10.getSharedPreferences(r1, r2)
            java.lang.String r1 = "reschedule_needed"
            boolean r3 = r10.contains(r1)
            java.lang.String r4 = "last_cancel_all_time_ms"
            if (r3 != 0) goto L19
            boolean r3 = r10.contains(r4)
            if (r3 == 0) goto L57
        L19:
            r5 = 0
            long r7 = r10.getLong(r4, r5)
            boolean r3 = r10.getBoolean(r1, r2)
            if (r3 == 0) goto L27
            r5 = 1
        L27:
            r11.beginTransaction()
            r3 = 2
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L58
            r9[r2] = r4     // Catch: java.lang.Throwable -> L58
            java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L58
            r7 = 1
            r9[r7] = r4     // Catch: java.lang.Throwable -> L58
            r11.execSQL(r0, r9)     // Catch: java.lang.Throwable -> L58
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L58
            r3[r2] = r1     // Catch: java.lang.Throwable -> L58
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L58
            r3[r7] = r1     // Catch: java.lang.Throwable -> L58
            r11.execSQL(r0, r3)     // Catch: java.lang.Throwable -> L58
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch: java.lang.Throwable -> L58
            android.content.SharedPreferences$Editor r10 = r10.clear()     // Catch: java.lang.Throwable -> L58
            r10.apply()     // Catch: java.lang.Throwable -> L58
            r11.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L58
            r11.endTransaction()
        L57:
            return
        L58:
            r10 = move-exception
            r11.endTransaction()
            throw r10
    }

    public boolean getNeedsReschedule() {
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.mWorkDatabase
            androidx.work.impl.model.PreferenceDao r0 = r0.preferenceDao()
            java.lang.String r1 = "reschedule_needed"
            java.lang.Long r0 = r0.getLongValue(r1)
            if (r0 == 0) goto L1a
            long r0 = r0.longValue()
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    public void setNeedsReschedule(boolean r3) {
            r2 = this;
            androidx.work.impl.model.Preference r0 = new androidx.work.impl.model.Preference
            java.lang.String r1 = "reschedule_needed"
            r0.<init>(r1, r3)
            androidx.work.impl.WorkDatabase r3 = r2.mWorkDatabase
            androidx.work.impl.model.PreferenceDao r3 = r3.preferenceDao()
            r3.insertPreference(r0)
            return
    }
}
