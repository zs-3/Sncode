package androidx.work.impl.model;

/* loaded from: classes.dex */
public final class WorkSpecDao_Impl implements androidx.work.impl.model.WorkSpecDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<androidx.work.impl.model.WorkSpec> __insertionAdapterOfWorkSpec;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDelete;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfResetScheduledState;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfSetOutput;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfSetPeriodStartTime;










    public WorkSpecDao_Impl(androidx.room.RoomDatabase r2) {
            r1 = this;
            r1.<init>()
            r1.__db = r2
            androidx.work.impl.model.WorkSpecDao_Impl$1 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$1
            r0.<init>(r1, r2)
            r1.__insertionAdapterOfWorkSpec = r0
            androidx.work.impl.model.WorkSpecDao_Impl$2 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$2
            r0.<init>(r1, r2)
            r1.__preparedStmtOfDelete = r0
            androidx.work.impl.model.WorkSpecDao_Impl$3 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$3
            r0.<init>(r1, r2)
            r1.__preparedStmtOfSetOutput = r0
            androidx.work.impl.model.WorkSpecDao_Impl$4 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$4
            r0.<init>(r1, r2)
            r1.__preparedStmtOfSetPeriodStartTime = r0
            androidx.work.impl.model.WorkSpecDao_Impl$5 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$5
            r0.<init>(r1, r2)
            r1.__preparedStmtOfIncrementWorkSpecRunAttemptCount = r0
            androidx.work.impl.model.WorkSpecDao_Impl$6 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$6
            r0.<init>(r1, r2)
            r1.__preparedStmtOfResetWorkSpecRunAttemptCount = r0
            androidx.work.impl.model.WorkSpecDao_Impl$7 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$7
            r0.<init>(r1, r2)
            r1.__preparedStmtOfMarkWorkSpecScheduled = r0
            androidx.work.impl.model.WorkSpecDao_Impl$8 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$8
            r0.<init>(r1, r2)
            r1.__preparedStmtOfResetScheduledState = r0
            androidx.work.impl.model.WorkSpecDao_Impl$9 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$9
            r0.<init>(r1, r2)
            r1.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast = r0
            return
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void delete(java.lang.String r3) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfDelete
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            r1 = 1
            if (r3 != 0) goto L12
            r0.bindNull(r1)
            goto L15
        L12:
            r0.bindString(r1, r3)
        L15:
            androidx.room.RoomDatabase r3 = r2.__db
            r3.beginTransaction()
            r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L2d
            androidx.room.RoomDatabase r3 = r2.__db     // Catch: java.lang.Throwable -> L2d
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2d
            androidx.room.RoomDatabase r3 = r2.__db
            r3.endTransaction()
            androidx.room.SharedSQLiteStatement r3 = r2.__preparedStmtOfDelete
            r3.release(r0)
            return
        L2d:
            r3 = move-exception
            androidx.room.RoomDatabase r1 = r2.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r2.__preparedStmtOfDelete
            r1.release(r0)
            throw r3
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getAllEligibleWorkSpecsForScheduling(int r35) {
            r34 = this;
            r1 = r34
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?"
            r2 = 1
            androidx.room.RoomSQLiteQuery r3 = androidx.room.RoomSQLiteQuery.acquire(r0, r2)
            r0 = r35
            long r4 = (long) r0
            r3.bindLong(r2, r4)
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r4 = 0
            r5 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r0, r3, r4, r5)
            java.lang.String r0 = "required_network_type"
            int r0 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r0)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r6 = "requires_charging"
            int r6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r6)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r7 = "requires_device_idle"
            int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r7)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r8 = "requires_battery_not_low"
            int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r8)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r9 = "requires_storage_not_low"
            int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r9)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r10 = "trigger_content_update_delay"
            int r10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r10)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r11 = "trigger_max_content_delay"
            int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r11)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r12 = "content_uri_triggers"
            int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r12)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r13 = "id"
            int r13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r13)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r14 = "state"
            int r14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r14)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r15 = "worker_class_name"
            int r15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r15)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r2 = "input_merger_class_name"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r2)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r4 = "input"
            int r4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r4)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r1 = "output"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r1)     // Catch: java.lang.Throwable -> L21e
            r16 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r17 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r18 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r19 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r20 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r21 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r22 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r23 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r24 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r25 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r26 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r27 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L21c
            r28 = r1
            int r1 = r5.getCount()     // Catch: java.lang.Throwable -> L21c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L21c
        Ld5:
            boolean r1 = r5.moveToNext()     // Catch: java.lang.Throwable -> L21c
            if (r1 == 0) goto L215
            java.lang.String r1 = r5.getString(r13)     // Catch: java.lang.Throwable -> L21c
            r29 = r13
            java.lang.String r13 = r5.getString(r15)     // Catch: java.lang.Throwable -> L21c
            r30 = r15
            androidx.work.Constraints r15 = new androidx.work.Constraints     // Catch: java.lang.Throwable -> L21c
            r15.<init>()     // Catch: java.lang.Throwable -> L21c
            int r31 = r5.getInt(r0)     // Catch: java.lang.Throwable -> L21c
            r32 = r0
            androidx.work.NetworkType r0 = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(r31)     // Catch: java.lang.Throwable -> L21c
            r15.setRequiredNetworkType(r0)     // Catch: java.lang.Throwable -> L21c
            int r0 = r5.getInt(r6)     // Catch: java.lang.Throwable -> L21c
            if (r0 == 0) goto L101
            r0 = 1
            goto L102
        L101:
            r0 = 0
        L102:
            r15.setRequiresCharging(r0)     // Catch: java.lang.Throwable -> L21c
            int r0 = r5.getInt(r7)     // Catch: java.lang.Throwable -> L21c
            if (r0 == 0) goto L10d
            r0 = 1
            goto L10e
        L10d:
            r0 = 0
        L10e:
            r15.setRequiresDeviceIdle(r0)     // Catch: java.lang.Throwable -> L21c
            int r0 = r5.getInt(r8)     // Catch: java.lang.Throwable -> L21c
            if (r0 == 0) goto L119
            r0 = 1
            goto L11a
        L119:
            r0 = 0
        L11a:
            r15.setRequiresBatteryNotLow(r0)     // Catch: java.lang.Throwable -> L21c
            int r0 = r5.getInt(r9)     // Catch: java.lang.Throwable -> L21c
            if (r0 == 0) goto L125
            r0 = 1
            goto L126
        L125:
            r0 = 0
        L126:
            r15.setRequiresStorageNotLow(r0)     // Catch: java.lang.Throwable -> L21c
            r0 = r6
            r31 = r7
            long r6 = r5.getLong(r10)     // Catch: java.lang.Throwable -> L21c
            r15.setTriggerContentUpdateDelay(r6)     // Catch: java.lang.Throwable -> L21c
            long r6 = r5.getLong(r11)     // Catch: java.lang.Throwable -> L21c
            r15.setTriggerMaxContentDelay(r6)     // Catch: java.lang.Throwable -> L21c
            byte[] r6 = r5.getBlob(r12)     // Catch: java.lang.Throwable -> L21c
            androidx.work.ContentUriTriggers r6 = androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(r6)     // Catch: java.lang.Throwable -> L21c
            r15.setContentUriTriggers(r6)     // Catch: java.lang.Throwable -> L21c
            androidx.work.impl.model.WorkSpec r6 = new androidx.work.impl.model.WorkSpec     // Catch: java.lang.Throwable -> L21c
            r6.<init>(r1, r13)     // Catch: java.lang.Throwable -> L21c
            int r1 = r5.getInt(r14)     // Catch: java.lang.Throwable -> L21c
            androidx.work.WorkInfo$State r1 = androidx.work.impl.model.WorkTypeConverters.intToState(r1)     // Catch: java.lang.Throwable -> L21c
            r6.state = r1     // Catch: java.lang.Throwable -> L21c
            java.lang.String r1 = r5.getString(r2)     // Catch: java.lang.Throwable -> L21c
            r6.inputMergerClassName = r1     // Catch: java.lang.Throwable -> L21c
            byte[] r1 = r5.getBlob(r4)     // Catch: java.lang.Throwable -> L21c
            androidx.work.Data r1 = androidx.work.Data.fromByteArray(r1)     // Catch: java.lang.Throwable -> L21c
            r6.input = r1     // Catch: java.lang.Throwable -> L21c
            r1 = r28
            byte[] r7 = r5.getBlob(r1)     // Catch: java.lang.Throwable -> L21c
            androidx.work.Data r7 = androidx.work.Data.fromByteArray(r7)     // Catch: java.lang.Throwable -> L21c
            r6.output = r7     // Catch: java.lang.Throwable -> L21c
            r13 = r0
            r28 = r1
            r7 = r17
            long r0 = r5.getLong(r7)     // Catch: java.lang.Throwable -> L21c
            r6.initialDelay = r0     // Catch: java.lang.Throwable -> L21c
            r17 = r2
            r0 = r18
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L21c
            r6.intervalDuration = r1     // Catch: java.lang.Throwable -> L21c
            r18 = r7
            r2 = r8
            r1 = r19
            long r7 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L21c
            r6.flexDuration = r7     // Catch: java.lang.Throwable -> L21c
            r7 = r20
            int r8 = r5.getInt(r7)     // Catch: java.lang.Throwable -> L21c
            r6.runAttemptCount = r8     // Catch: java.lang.Throwable -> L21c
            r8 = r21
            int r19 = r5.getInt(r8)     // Catch: java.lang.Throwable -> L21c
            r20 = r0
            androidx.work.BackoffPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(r19)     // Catch: java.lang.Throwable -> L21c
            r6.backoffPolicy = r0     // Catch: java.lang.Throwable -> L21c
            r19 = r1
            r21 = r2
            r0 = r22
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L21c
            r6.backoffDelayDuration = r1     // Catch: java.lang.Throwable -> L21c
            r2 = r7
            r22 = r8
            r1 = r23
            long r7 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L21c
            r6.periodStartTime = r7     // Catch: java.lang.Throwable -> L21c
            r8 = r0
            r23 = r1
            r7 = r24
            long r0 = r5.getLong(r7)     // Catch: java.lang.Throwable -> L21c
            r6.minimumRetentionDuration = r0     // Catch: java.lang.Throwable -> L21c
            r24 = r2
            r0 = r25
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L21c
            r6.scheduleRequestedAt = r1     // Catch: java.lang.Throwable -> L21c
            r1 = r26
            int r2 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L21c
            if (r2 == 0) goto L1dc
            r2 = 1
            goto L1dd
        L1dc:
            r2 = 0
        L1dd:
            r6.expedited = r2     // Catch: java.lang.Throwable -> L21c
            r2 = r27
            int r25 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L21c
            r26 = r0
            androidx.work.OutOfQuotaPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(r25)     // Catch: java.lang.Throwable -> L21c
            r6.outOfQuotaPolicy = r0     // Catch: java.lang.Throwable -> L21c
            r6.constraints = r15     // Catch: java.lang.Throwable -> L21c
            r3.add(r6)     // Catch: java.lang.Throwable -> L21c
            r27 = r2
            r6 = r13
            r2 = r17
            r17 = r18
            r18 = r20
            r20 = r24
            r25 = r26
            r13 = r29
            r15 = r30
            r0 = r32
            r26 = r1
            r24 = r7
            r7 = r31
            r33 = r22
            r22 = r8
            r8 = r21
            r21 = r33
            goto Ld5
        L215:
            r5.close()
            r16.release()
            return r3
        L21c:
            r0 = move-exception
            goto L221
        L21e:
            r0 = move-exception
            r16 = r3
        L221:
            r5.close()
            r16.release()
            throw r0
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getEligibleWorkForScheduling(int r35) {
            r34 = this;
            r1 = r34
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))"
            r2 = 1
            androidx.room.RoomSQLiteQuery r3 = androidx.room.RoomSQLiteQuery.acquire(r0, r2)
            r0 = r35
            long r4 = (long) r0
            r3.bindLong(r2, r4)
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r4 = 0
            r5 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r0, r3, r4, r5)
            java.lang.String r0 = "required_network_type"
            int r0 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r0)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r6 = "requires_charging"
            int r6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r6)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r7 = "requires_device_idle"
            int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r7)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r8 = "requires_battery_not_low"
            int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r8)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r9 = "requires_storage_not_low"
            int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r9)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r10 = "trigger_content_update_delay"
            int r10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r10)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r11 = "trigger_max_content_delay"
            int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r11)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r12 = "content_uri_triggers"
            int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r12)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r13 = "id"
            int r13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r13)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r14 = "state"
            int r14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r14)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r15 = "worker_class_name"
            int r15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r15)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r2 = "input_merger_class_name"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r2)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r4 = "input"
            int r4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r4)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r1 = "output"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r1)     // Catch: java.lang.Throwable -> L21e
            r16 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r17 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r18 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r19 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r20 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r21 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r22 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r23 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r24 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r25 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r26 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21c
            r27 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L21c
            r28 = r1
            int r1 = r5.getCount()     // Catch: java.lang.Throwable -> L21c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L21c
        Ld5:
            boolean r1 = r5.moveToNext()     // Catch: java.lang.Throwable -> L21c
            if (r1 == 0) goto L215
            java.lang.String r1 = r5.getString(r13)     // Catch: java.lang.Throwable -> L21c
            r29 = r13
            java.lang.String r13 = r5.getString(r15)     // Catch: java.lang.Throwable -> L21c
            r30 = r15
            androidx.work.Constraints r15 = new androidx.work.Constraints     // Catch: java.lang.Throwable -> L21c
            r15.<init>()     // Catch: java.lang.Throwable -> L21c
            int r31 = r5.getInt(r0)     // Catch: java.lang.Throwable -> L21c
            r32 = r0
            androidx.work.NetworkType r0 = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(r31)     // Catch: java.lang.Throwable -> L21c
            r15.setRequiredNetworkType(r0)     // Catch: java.lang.Throwable -> L21c
            int r0 = r5.getInt(r6)     // Catch: java.lang.Throwable -> L21c
            if (r0 == 0) goto L101
            r0 = 1
            goto L102
        L101:
            r0 = 0
        L102:
            r15.setRequiresCharging(r0)     // Catch: java.lang.Throwable -> L21c
            int r0 = r5.getInt(r7)     // Catch: java.lang.Throwable -> L21c
            if (r0 == 0) goto L10d
            r0 = 1
            goto L10e
        L10d:
            r0 = 0
        L10e:
            r15.setRequiresDeviceIdle(r0)     // Catch: java.lang.Throwable -> L21c
            int r0 = r5.getInt(r8)     // Catch: java.lang.Throwable -> L21c
            if (r0 == 0) goto L119
            r0 = 1
            goto L11a
        L119:
            r0 = 0
        L11a:
            r15.setRequiresBatteryNotLow(r0)     // Catch: java.lang.Throwable -> L21c
            int r0 = r5.getInt(r9)     // Catch: java.lang.Throwable -> L21c
            if (r0 == 0) goto L125
            r0 = 1
            goto L126
        L125:
            r0 = 0
        L126:
            r15.setRequiresStorageNotLow(r0)     // Catch: java.lang.Throwable -> L21c
            r0 = r6
            r31 = r7
            long r6 = r5.getLong(r10)     // Catch: java.lang.Throwable -> L21c
            r15.setTriggerContentUpdateDelay(r6)     // Catch: java.lang.Throwable -> L21c
            long r6 = r5.getLong(r11)     // Catch: java.lang.Throwable -> L21c
            r15.setTriggerMaxContentDelay(r6)     // Catch: java.lang.Throwable -> L21c
            byte[] r6 = r5.getBlob(r12)     // Catch: java.lang.Throwable -> L21c
            androidx.work.ContentUriTriggers r6 = androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(r6)     // Catch: java.lang.Throwable -> L21c
            r15.setContentUriTriggers(r6)     // Catch: java.lang.Throwable -> L21c
            androidx.work.impl.model.WorkSpec r6 = new androidx.work.impl.model.WorkSpec     // Catch: java.lang.Throwable -> L21c
            r6.<init>(r1, r13)     // Catch: java.lang.Throwable -> L21c
            int r1 = r5.getInt(r14)     // Catch: java.lang.Throwable -> L21c
            androidx.work.WorkInfo$State r1 = androidx.work.impl.model.WorkTypeConverters.intToState(r1)     // Catch: java.lang.Throwable -> L21c
            r6.state = r1     // Catch: java.lang.Throwable -> L21c
            java.lang.String r1 = r5.getString(r2)     // Catch: java.lang.Throwable -> L21c
            r6.inputMergerClassName = r1     // Catch: java.lang.Throwable -> L21c
            byte[] r1 = r5.getBlob(r4)     // Catch: java.lang.Throwable -> L21c
            androidx.work.Data r1 = androidx.work.Data.fromByteArray(r1)     // Catch: java.lang.Throwable -> L21c
            r6.input = r1     // Catch: java.lang.Throwable -> L21c
            r1 = r28
            byte[] r7 = r5.getBlob(r1)     // Catch: java.lang.Throwable -> L21c
            androidx.work.Data r7 = androidx.work.Data.fromByteArray(r7)     // Catch: java.lang.Throwable -> L21c
            r6.output = r7     // Catch: java.lang.Throwable -> L21c
            r13 = r0
            r28 = r1
            r7 = r17
            long r0 = r5.getLong(r7)     // Catch: java.lang.Throwable -> L21c
            r6.initialDelay = r0     // Catch: java.lang.Throwable -> L21c
            r17 = r2
            r0 = r18
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L21c
            r6.intervalDuration = r1     // Catch: java.lang.Throwable -> L21c
            r18 = r7
            r2 = r8
            r1 = r19
            long r7 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L21c
            r6.flexDuration = r7     // Catch: java.lang.Throwable -> L21c
            r7 = r20
            int r8 = r5.getInt(r7)     // Catch: java.lang.Throwable -> L21c
            r6.runAttemptCount = r8     // Catch: java.lang.Throwable -> L21c
            r8 = r21
            int r19 = r5.getInt(r8)     // Catch: java.lang.Throwable -> L21c
            r20 = r0
            androidx.work.BackoffPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(r19)     // Catch: java.lang.Throwable -> L21c
            r6.backoffPolicy = r0     // Catch: java.lang.Throwable -> L21c
            r19 = r1
            r21 = r2
            r0 = r22
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L21c
            r6.backoffDelayDuration = r1     // Catch: java.lang.Throwable -> L21c
            r2 = r7
            r22 = r8
            r1 = r23
            long r7 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L21c
            r6.periodStartTime = r7     // Catch: java.lang.Throwable -> L21c
            r8 = r0
            r23 = r1
            r7 = r24
            long r0 = r5.getLong(r7)     // Catch: java.lang.Throwable -> L21c
            r6.minimumRetentionDuration = r0     // Catch: java.lang.Throwable -> L21c
            r24 = r2
            r0 = r25
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L21c
            r6.scheduleRequestedAt = r1     // Catch: java.lang.Throwable -> L21c
            r1 = r26
            int r2 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L21c
            if (r2 == 0) goto L1dc
            r2 = 1
            goto L1dd
        L1dc:
            r2 = 0
        L1dd:
            r6.expedited = r2     // Catch: java.lang.Throwable -> L21c
            r2 = r27
            int r25 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L21c
            r26 = r0
            androidx.work.OutOfQuotaPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(r25)     // Catch: java.lang.Throwable -> L21c
            r6.outOfQuotaPolicy = r0     // Catch: java.lang.Throwable -> L21c
            r6.constraints = r15     // Catch: java.lang.Throwable -> L21c
            r3.add(r6)     // Catch: java.lang.Throwable -> L21c
            r27 = r2
            r6 = r13
            r2 = r17
            r17 = r18
            r18 = r20
            r20 = r24
            r25 = r26
            r13 = r29
            r15 = r30
            r0 = r32
            r26 = r1
            r24 = r7
            r7 = r31
            r33 = r22
            r22 = r8
            r8 = r21
            r21 = r33
            goto Ld5
        L215:
            r5.close()
            r16.release()
            return r3
        L21c:
            r0 = move-exception
            goto L221
        L21e:
            r0 = move-exception
            r16 = r3
        L221:
            r5.close()
            r16.release()
            throw r0
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.Data> getInputsFromPrerequisites(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r5 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r5)
        L10:
            androidx.room.RoomDatabase r5 = r4.__db
            r5.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r5 = r4.__db
            r1 = 0
            r2 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r5, r0, r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3f
            int r3 = r5.getCount()     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3f
        L26:
            boolean r3 = r5.moveToNext()     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L38
            byte[] r3 = r5.getBlob(r2)     // Catch: java.lang.Throwable -> L3f
            androidx.work.Data r3 = androidx.work.Data.fromByteArray(r3)     // Catch: java.lang.Throwable -> L3f
            r1.add(r3)     // Catch: java.lang.Throwable -> L3f
            goto L26
        L38:
            r5.close()
            r0.release()
            return r1
        L3f:
            r1 = move-exception
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getRecentlyCompletedWork(long r34) {
            r33 = this;
            r1 = r33
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC"
            r2 = 1
            androidx.room.RoomSQLiteQuery r3 = androidx.room.RoomSQLiteQuery.acquire(r0, r2)
            r4 = r34
            r3.bindLong(r2, r4)
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r4 = 0
            r5 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r0, r3, r4, r5)
            java.lang.String r0 = "required_network_type"
            int r0 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r0)     // Catch: java.lang.Throwable -> L21d
            java.lang.String r6 = "requires_charging"
            int r6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r6)     // Catch: java.lang.Throwable -> L21d
            java.lang.String r7 = "requires_device_idle"
            int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r7)     // Catch: java.lang.Throwable -> L21d
            java.lang.String r8 = "requires_battery_not_low"
            int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r8)     // Catch: java.lang.Throwable -> L21d
            java.lang.String r9 = "requires_storage_not_low"
            int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r9)     // Catch: java.lang.Throwable -> L21d
            java.lang.String r10 = "trigger_content_update_delay"
            int r10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r10)     // Catch: java.lang.Throwable -> L21d
            java.lang.String r11 = "trigger_max_content_delay"
            int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r11)     // Catch: java.lang.Throwable -> L21d
            java.lang.String r12 = "content_uri_triggers"
            int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r12)     // Catch: java.lang.Throwable -> L21d
            java.lang.String r13 = "id"
            int r13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r13)     // Catch: java.lang.Throwable -> L21d
            java.lang.String r14 = "state"
            int r14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r14)     // Catch: java.lang.Throwable -> L21d
            java.lang.String r15 = "worker_class_name"
            int r15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r15)     // Catch: java.lang.Throwable -> L21d
            java.lang.String r2 = "input_merger_class_name"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r2)     // Catch: java.lang.Throwable -> L21d
            java.lang.String r4 = "input"
            int r4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r4)     // Catch: java.lang.Throwable -> L21d
            java.lang.String r1 = "output"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r1)     // Catch: java.lang.Throwable -> L21d
            r16 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21b
            r35 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21b
            r17 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21b
            r18 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21b
            r19 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21b
            r20 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21b
            r21 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21b
            r22 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21b
            r23 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21b
            r24 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21b
            r25 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r5, r3)     // Catch: java.lang.Throwable -> L21b
            r26 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L21b
            r27 = r1
            int r1 = r5.getCount()     // Catch: java.lang.Throwable -> L21b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L21b
        Ld4:
            boolean r1 = r5.moveToNext()     // Catch: java.lang.Throwable -> L21b
            if (r1 == 0) goto L214
            java.lang.String r1 = r5.getString(r13)     // Catch: java.lang.Throwable -> L21b
            r28 = r13
            java.lang.String r13 = r5.getString(r15)     // Catch: java.lang.Throwable -> L21b
            r29 = r15
            androidx.work.Constraints r15 = new androidx.work.Constraints     // Catch: java.lang.Throwable -> L21b
            r15.<init>()     // Catch: java.lang.Throwable -> L21b
            int r30 = r5.getInt(r0)     // Catch: java.lang.Throwable -> L21b
            r31 = r0
            androidx.work.NetworkType r0 = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(r30)     // Catch: java.lang.Throwable -> L21b
            r15.setRequiredNetworkType(r0)     // Catch: java.lang.Throwable -> L21b
            int r0 = r5.getInt(r6)     // Catch: java.lang.Throwable -> L21b
            if (r0 == 0) goto L100
            r0 = 1
            goto L101
        L100:
            r0 = 0
        L101:
            r15.setRequiresCharging(r0)     // Catch: java.lang.Throwable -> L21b
            int r0 = r5.getInt(r7)     // Catch: java.lang.Throwable -> L21b
            if (r0 == 0) goto L10c
            r0 = 1
            goto L10d
        L10c:
            r0 = 0
        L10d:
            r15.setRequiresDeviceIdle(r0)     // Catch: java.lang.Throwable -> L21b
            int r0 = r5.getInt(r8)     // Catch: java.lang.Throwable -> L21b
            if (r0 == 0) goto L118
            r0 = 1
            goto L119
        L118:
            r0 = 0
        L119:
            r15.setRequiresBatteryNotLow(r0)     // Catch: java.lang.Throwable -> L21b
            int r0 = r5.getInt(r9)     // Catch: java.lang.Throwable -> L21b
            if (r0 == 0) goto L124
            r0 = 1
            goto L125
        L124:
            r0 = 0
        L125:
            r15.setRequiresStorageNotLow(r0)     // Catch: java.lang.Throwable -> L21b
            r0 = r6
            r30 = r7
            long r6 = r5.getLong(r10)     // Catch: java.lang.Throwable -> L21b
            r15.setTriggerContentUpdateDelay(r6)     // Catch: java.lang.Throwable -> L21b
            long r6 = r5.getLong(r11)     // Catch: java.lang.Throwable -> L21b
            r15.setTriggerMaxContentDelay(r6)     // Catch: java.lang.Throwable -> L21b
            byte[] r6 = r5.getBlob(r12)     // Catch: java.lang.Throwable -> L21b
            androidx.work.ContentUriTriggers r6 = androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(r6)     // Catch: java.lang.Throwable -> L21b
            r15.setContentUriTriggers(r6)     // Catch: java.lang.Throwable -> L21b
            androidx.work.impl.model.WorkSpec r6 = new androidx.work.impl.model.WorkSpec     // Catch: java.lang.Throwable -> L21b
            r6.<init>(r1, r13)     // Catch: java.lang.Throwable -> L21b
            int r1 = r5.getInt(r14)     // Catch: java.lang.Throwable -> L21b
            androidx.work.WorkInfo$State r1 = androidx.work.impl.model.WorkTypeConverters.intToState(r1)     // Catch: java.lang.Throwable -> L21b
            r6.state = r1     // Catch: java.lang.Throwable -> L21b
            java.lang.String r1 = r5.getString(r2)     // Catch: java.lang.Throwable -> L21b
            r6.inputMergerClassName = r1     // Catch: java.lang.Throwable -> L21b
            byte[] r1 = r5.getBlob(r4)     // Catch: java.lang.Throwable -> L21b
            androidx.work.Data r1 = androidx.work.Data.fromByteArray(r1)     // Catch: java.lang.Throwable -> L21b
            r6.input = r1     // Catch: java.lang.Throwable -> L21b
            r1 = r27
            byte[] r7 = r5.getBlob(r1)     // Catch: java.lang.Throwable -> L21b
            androidx.work.Data r7 = androidx.work.Data.fromByteArray(r7)     // Catch: java.lang.Throwable -> L21b
            r6.output = r7     // Catch: java.lang.Throwable -> L21b
            r7 = r35
            r35 = r0
            r27 = r1
            long r0 = r5.getLong(r7)     // Catch: java.lang.Throwable -> L21b
            r6.initialDelay = r0     // Catch: java.lang.Throwable -> L21b
            r13 = r2
            r0 = r17
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L21b
            r6.intervalDuration = r1     // Catch: java.lang.Throwable -> L21b
            r17 = r7
            r2 = r8
            r1 = r18
            long r7 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L21b
            r6.flexDuration = r7     // Catch: java.lang.Throwable -> L21b
            r7 = r19
            int r8 = r5.getInt(r7)     // Catch: java.lang.Throwable -> L21b
            r6.runAttemptCount = r8     // Catch: java.lang.Throwable -> L21b
            r8 = r20
            int r18 = r5.getInt(r8)     // Catch: java.lang.Throwable -> L21b
            r19 = r0
            androidx.work.BackoffPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(r18)     // Catch: java.lang.Throwable -> L21b
            r6.backoffPolicy = r0     // Catch: java.lang.Throwable -> L21b
            r18 = r1
            r20 = r2
            r0 = r21
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L21b
            r6.backoffDelayDuration = r1     // Catch: java.lang.Throwable -> L21b
            r2 = r7
            r21 = r8
            r1 = r22
            long r7 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L21b
            r6.periodStartTime = r7     // Catch: java.lang.Throwable -> L21b
            r8 = r0
            r22 = r1
            r7 = r23
            long r0 = r5.getLong(r7)     // Catch: java.lang.Throwable -> L21b
            r6.minimumRetentionDuration = r0     // Catch: java.lang.Throwable -> L21b
            r23 = r2
            r0 = r24
            long r1 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L21b
            r6.scheduleRequestedAt = r1     // Catch: java.lang.Throwable -> L21b
            r1 = r25
            int r2 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L21b
            if (r2 == 0) goto L1db
            r2 = 1
            goto L1dc
        L1db:
            r2 = 0
        L1dc:
            r6.expedited = r2     // Catch: java.lang.Throwable -> L21b
            r2 = r26
            int r24 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L21b
            r25 = r0
            androidx.work.OutOfQuotaPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(r24)     // Catch: java.lang.Throwable -> L21b
            r6.outOfQuotaPolicy = r0     // Catch: java.lang.Throwable -> L21b
            r6.constraints = r15     // Catch: java.lang.Throwable -> L21b
            r3.add(r6)     // Catch: java.lang.Throwable -> L21b
            r6 = r35
            r26 = r2
            r2 = r13
            r35 = r17
            r17 = r19
            r19 = r23
            r24 = r25
            r13 = r28
            r15 = r29
            r0 = r31
            r25 = r1
            r23 = r7
            r7 = r30
            r32 = r21
            r21 = r8
            r8 = r20
            r20 = r32
            goto Ld4
        L214:
            r5.close()
            r16.release()
            return r3
        L21b:
            r0 = move-exception
            goto L220
        L21d:
            r0 = move-exception
            r16 = r3
        L220:
            r5.close()
            r16.release()
            throw r0
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getRunningWork() {
            r35 = this;
            r1 = r35
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1"
            r2 = 0
            androidx.room.RoomSQLiteQuery r3 = androidx.room.RoomSQLiteQuery.acquire(r0, r2)
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r4 = 0
            android.database.Cursor r4 = androidx.room.util.DBUtil.query(r0, r3, r2, r4)
            java.lang.String r0 = "required_network_type"
            int r0 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r0)     // Catch: java.lang.Throwable -> L219
            java.lang.String r5 = "requires_charging"
            int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r5)     // Catch: java.lang.Throwable -> L219
            java.lang.String r6 = "requires_device_idle"
            int r6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r6)     // Catch: java.lang.Throwable -> L219
            java.lang.String r7 = "requires_battery_not_low"
            int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r7)     // Catch: java.lang.Throwable -> L219
            java.lang.String r8 = "requires_storage_not_low"
            int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r8)     // Catch: java.lang.Throwable -> L219
            java.lang.String r9 = "trigger_content_update_delay"
            int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r9)     // Catch: java.lang.Throwable -> L219
            java.lang.String r10 = "trigger_max_content_delay"
            int r10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r10)     // Catch: java.lang.Throwable -> L219
            java.lang.String r11 = "content_uri_triggers"
            int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r11)     // Catch: java.lang.Throwable -> L219
            java.lang.String r12 = "id"
            int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r12)     // Catch: java.lang.Throwable -> L219
            java.lang.String r13 = "state"
            int r13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r13)     // Catch: java.lang.Throwable -> L219
            java.lang.String r14 = "worker_class_name"
            int r14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r14)     // Catch: java.lang.Throwable -> L219
            java.lang.String r15 = "input_merger_class_name"
            int r15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r15)     // Catch: java.lang.Throwable -> L219
            java.lang.String r2 = "input"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L219
            java.lang.String r1 = "output"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r1)     // Catch: java.lang.Throwable -> L219
            r16 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r17 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r18 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r19 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r20 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r21 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r22 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r23 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r24 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r25 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r26 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r27 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L217
            r28 = r1
            int r1 = r4.getCount()     // Catch: java.lang.Throwable -> L217
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L217
        Lce:
            boolean r1 = r4.moveToNext()     // Catch: java.lang.Throwable -> L217
            if (r1 == 0) goto L210
            java.lang.String r1 = r4.getString(r12)     // Catch: java.lang.Throwable -> L217
            r29 = r12
            java.lang.String r12 = r4.getString(r14)     // Catch: java.lang.Throwable -> L217
            r30 = r14
            androidx.work.Constraints r14 = new androidx.work.Constraints     // Catch: java.lang.Throwable -> L217
            r14.<init>()     // Catch: java.lang.Throwable -> L217
            int r31 = r4.getInt(r0)     // Catch: java.lang.Throwable -> L217
            r32 = r0
            androidx.work.NetworkType r0 = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(r31)     // Catch: java.lang.Throwable -> L217
            r14.setRequiredNetworkType(r0)     // Catch: java.lang.Throwable -> L217
            int r0 = r4.getInt(r5)     // Catch: java.lang.Throwable -> L217
            r31 = 1
            if (r0 == 0) goto Lfc
            r0 = 1
            goto Lfd
        Lfc:
            r0 = 0
        Lfd:
            r14.setRequiresCharging(r0)     // Catch: java.lang.Throwable -> L217
            int r0 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L217
            if (r0 == 0) goto L108
            r0 = 1
            goto L109
        L108:
            r0 = 0
        L109:
            r14.setRequiresDeviceIdle(r0)     // Catch: java.lang.Throwable -> L217
            int r0 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L217
            if (r0 == 0) goto L114
            r0 = 1
            goto L115
        L114:
            r0 = 0
        L115:
            r14.setRequiresBatteryNotLow(r0)     // Catch: java.lang.Throwable -> L217
            int r0 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L217
            if (r0 == 0) goto L120
            r0 = 1
            goto L121
        L120:
            r0 = 0
        L121:
            r14.setRequiresStorageNotLow(r0)     // Catch: java.lang.Throwable -> L217
            r0 = r5
            r33 = r6
            long r5 = r4.getLong(r9)     // Catch: java.lang.Throwable -> L217
            r14.setTriggerContentUpdateDelay(r5)     // Catch: java.lang.Throwable -> L217
            long r5 = r4.getLong(r10)     // Catch: java.lang.Throwable -> L217
            r14.setTriggerMaxContentDelay(r5)     // Catch: java.lang.Throwable -> L217
            byte[] r5 = r4.getBlob(r11)     // Catch: java.lang.Throwable -> L217
            androidx.work.ContentUriTriggers r5 = androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(r5)     // Catch: java.lang.Throwable -> L217
            r14.setContentUriTriggers(r5)     // Catch: java.lang.Throwable -> L217
            androidx.work.impl.model.WorkSpec r5 = new androidx.work.impl.model.WorkSpec     // Catch: java.lang.Throwable -> L217
            r5.<init>(r1, r12)     // Catch: java.lang.Throwable -> L217
            int r1 = r4.getInt(r13)     // Catch: java.lang.Throwable -> L217
            androidx.work.WorkInfo$State r1 = androidx.work.impl.model.WorkTypeConverters.intToState(r1)     // Catch: java.lang.Throwable -> L217
            r5.state = r1     // Catch: java.lang.Throwable -> L217
            java.lang.String r1 = r4.getString(r15)     // Catch: java.lang.Throwable -> L217
            r5.inputMergerClassName = r1     // Catch: java.lang.Throwable -> L217
            byte[] r1 = r4.getBlob(r2)     // Catch: java.lang.Throwable -> L217
            androidx.work.Data r1 = androidx.work.Data.fromByteArray(r1)     // Catch: java.lang.Throwable -> L217
            r5.input = r1     // Catch: java.lang.Throwable -> L217
            r1 = r28
            byte[] r6 = r4.getBlob(r1)     // Catch: java.lang.Throwable -> L217
            androidx.work.Data r6 = androidx.work.Data.fromByteArray(r6)     // Catch: java.lang.Throwable -> L217
            r5.output = r6     // Catch: java.lang.Throwable -> L217
            r12 = r0
            r28 = r1
            r6 = r17
            long r0 = r4.getLong(r6)     // Catch: java.lang.Throwable -> L217
            r5.initialDelay = r0     // Catch: java.lang.Throwable -> L217
            r17 = r2
            r0 = r18
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L217
            r5.intervalDuration = r1     // Catch: java.lang.Throwable -> L217
            r18 = r6
            r2 = r7
            r1 = r19
            long r6 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L217
            r5.flexDuration = r6     // Catch: java.lang.Throwable -> L217
            r6 = r20
            int r7 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L217
            r5.runAttemptCount = r7     // Catch: java.lang.Throwable -> L217
            r7 = r21
            int r19 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L217
            r20 = r0
            androidx.work.BackoffPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(r19)     // Catch: java.lang.Throwable -> L217
            r5.backoffPolicy = r0     // Catch: java.lang.Throwable -> L217
            r19 = r1
            r21 = r2
            r0 = r22
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L217
            r5.backoffDelayDuration = r1     // Catch: java.lang.Throwable -> L217
            r2 = r6
            r22 = r7
            r1 = r23
            long r6 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L217
            r5.periodStartTime = r6     // Catch: java.lang.Throwable -> L217
            r7 = r0
            r23 = r1
            r6 = r24
            long r0 = r4.getLong(r6)     // Catch: java.lang.Throwable -> L217
            r5.minimumRetentionDuration = r0     // Catch: java.lang.Throwable -> L217
            r24 = r2
            r0 = r25
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L217
            r5.scheduleRequestedAt = r1     // Catch: java.lang.Throwable -> L217
            r1 = r26
            int r2 = r4.getInt(r1)     // Catch: java.lang.Throwable -> L217
            if (r2 == 0) goto L1d7
            r2 = 1
            goto L1d8
        L1d7:
            r2 = 0
        L1d8:
            r5.expedited = r2     // Catch: java.lang.Throwable -> L217
            r2 = r27
            int r25 = r4.getInt(r2)     // Catch: java.lang.Throwable -> L217
            r26 = r0
            androidx.work.OutOfQuotaPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(r25)     // Catch: java.lang.Throwable -> L217
            r5.outOfQuotaPolicy = r0     // Catch: java.lang.Throwable -> L217
            r5.constraints = r14     // Catch: java.lang.Throwable -> L217
            r3.add(r5)     // Catch: java.lang.Throwable -> L217
            r27 = r2
            r5 = r12
            r2 = r17
            r17 = r18
            r18 = r20
            r20 = r24
            r25 = r26
            r12 = r29
            r14 = r30
            r0 = r32
            r26 = r1
            r24 = r6
            r6 = r33
            r34 = r22
            r22 = r7
            r7 = r21
            r21 = r34
            goto Lce
        L210:
            r4.close()
            r16.release()
            return r3
        L217:
            r0 = move-exception
            goto L21c
        L219:
            r0 = move-exception
            r16 = r3
        L21c:
            r4.close()
            r16.release()
            throw r0
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getScheduledWork() {
            r35 = this;
            r1 = r35
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1"
            r2 = 0
            androidx.room.RoomSQLiteQuery r3 = androidx.room.RoomSQLiteQuery.acquire(r0, r2)
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r4 = 0
            android.database.Cursor r4 = androidx.room.util.DBUtil.query(r0, r3, r2, r4)
            java.lang.String r0 = "required_network_type"
            int r0 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r0)     // Catch: java.lang.Throwable -> L219
            java.lang.String r5 = "requires_charging"
            int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r5)     // Catch: java.lang.Throwable -> L219
            java.lang.String r6 = "requires_device_idle"
            int r6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r6)     // Catch: java.lang.Throwable -> L219
            java.lang.String r7 = "requires_battery_not_low"
            int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r7)     // Catch: java.lang.Throwable -> L219
            java.lang.String r8 = "requires_storage_not_low"
            int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r8)     // Catch: java.lang.Throwable -> L219
            java.lang.String r9 = "trigger_content_update_delay"
            int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r9)     // Catch: java.lang.Throwable -> L219
            java.lang.String r10 = "trigger_max_content_delay"
            int r10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r10)     // Catch: java.lang.Throwable -> L219
            java.lang.String r11 = "content_uri_triggers"
            int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r11)     // Catch: java.lang.Throwable -> L219
            java.lang.String r12 = "id"
            int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r12)     // Catch: java.lang.Throwable -> L219
            java.lang.String r13 = "state"
            int r13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r13)     // Catch: java.lang.Throwable -> L219
            java.lang.String r14 = "worker_class_name"
            int r14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r14)     // Catch: java.lang.Throwable -> L219
            java.lang.String r15 = "input_merger_class_name"
            int r15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r15)     // Catch: java.lang.Throwable -> L219
            java.lang.String r2 = "input"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L219
            java.lang.String r1 = "output"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r1)     // Catch: java.lang.Throwable -> L219
            r16 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r17 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r18 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r19 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r20 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r21 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r22 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r23 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r24 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r25 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r26 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L217
            r27 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L217
            r28 = r1
            int r1 = r4.getCount()     // Catch: java.lang.Throwable -> L217
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L217
        Lce:
            boolean r1 = r4.moveToNext()     // Catch: java.lang.Throwable -> L217
            if (r1 == 0) goto L210
            java.lang.String r1 = r4.getString(r12)     // Catch: java.lang.Throwable -> L217
            r29 = r12
            java.lang.String r12 = r4.getString(r14)     // Catch: java.lang.Throwable -> L217
            r30 = r14
            androidx.work.Constraints r14 = new androidx.work.Constraints     // Catch: java.lang.Throwable -> L217
            r14.<init>()     // Catch: java.lang.Throwable -> L217
            int r31 = r4.getInt(r0)     // Catch: java.lang.Throwable -> L217
            r32 = r0
            androidx.work.NetworkType r0 = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(r31)     // Catch: java.lang.Throwable -> L217
            r14.setRequiredNetworkType(r0)     // Catch: java.lang.Throwable -> L217
            int r0 = r4.getInt(r5)     // Catch: java.lang.Throwable -> L217
            r31 = 1
            if (r0 == 0) goto Lfc
            r0 = 1
            goto Lfd
        Lfc:
            r0 = 0
        Lfd:
            r14.setRequiresCharging(r0)     // Catch: java.lang.Throwable -> L217
            int r0 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L217
            if (r0 == 0) goto L108
            r0 = 1
            goto L109
        L108:
            r0 = 0
        L109:
            r14.setRequiresDeviceIdle(r0)     // Catch: java.lang.Throwable -> L217
            int r0 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L217
            if (r0 == 0) goto L114
            r0 = 1
            goto L115
        L114:
            r0 = 0
        L115:
            r14.setRequiresBatteryNotLow(r0)     // Catch: java.lang.Throwable -> L217
            int r0 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L217
            if (r0 == 0) goto L120
            r0 = 1
            goto L121
        L120:
            r0 = 0
        L121:
            r14.setRequiresStorageNotLow(r0)     // Catch: java.lang.Throwable -> L217
            r0 = r5
            r33 = r6
            long r5 = r4.getLong(r9)     // Catch: java.lang.Throwable -> L217
            r14.setTriggerContentUpdateDelay(r5)     // Catch: java.lang.Throwable -> L217
            long r5 = r4.getLong(r10)     // Catch: java.lang.Throwable -> L217
            r14.setTriggerMaxContentDelay(r5)     // Catch: java.lang.Throwable -> L217
            byte[] r5 = r4.getBlob(r11)     // Catch: java.lang.Throwable -> L217
            androidx.work.ContentUriTriggers r5 = androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(r5)     // Catch: java.lang.Throwable -> L217
            r14.setContentUriTriggers(r5)     // Catch: java.lang.Throwable -> L217
            androidx.work.impl.model.WorkSpec r5 = new androidx.work.impl.model.WorkSpec     // Catch: java.lang.Throwable -> L217
            r5.<init>(r1, r12)     // Catch: java.lang.Throwable -> L217
            int r1 = r4.getInt(r13)     // Catch: java.lang.Throwable -> L217
            androidx.work.WorkInfo$State r1 = androidx.work.impl.model.WorkTypeConverters.intToState(r1)     // Catch: java.lang.Throwable -> L217
            r5.state = r1     // Catch: java.lang.Throwable -> L217
            java.lang.String r1 = r4.getString(r15)     // Catch: java.lang.Throwable -> L217
            r5.inputMergerClassName = r1     // Catch: java.lang.Throwable -> L217
            byte[] r1 = r4.getBlob(r2)     // Catch: java.lang.Throwable -> L217
            androidx.work.Data r1 = androidx.work.Data.fromByteArray(r1)     // Catch: java.lang.Throwable -> L217
            r5.input = r1     // Catch: java.lang.Throwable -> L217
            r1 = r28
            byte[] r6 = r4.getBlob(r1)     // Catch: java.lang.Throwable -> L217
            androidx.work.Data r6 = androidx.work.Data.fromByteArray(r6)     // Catch: java.lang.Throwable -> L217
            r5.output = r6     // Catch: java.lang.Throwable -> L217
            r12 = r0
            r28 = r1
            r6 = r17
            long r0 = r4.getLong(r6)     // Catch: java.lang.Throwable -> L217
            r5.initialDelay = r0     // Catch: java.lang.Throwable -> L217
            r17 = r2
            r0 = r18
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L217
            r5.intervalDuration = r1     // Catch: java.lang.Throwable -> L217
            r18 = r6
            r2 = r7
            r1 = r19
            long r6 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L217
            r5.flexDuration = r6     // Catch: java.lang.Throwable -> L217
            r6 = r20
            int r7 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L217
            r5.runAttemptCount = r7     // Catch: java.lang.Throwable -> L217
            r7 = r21
            int r19 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L217
            r20 = r0
            androidx.work.BackoffPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(r19)     // Catch: java.lang.Throwable -> L217
            r5.backoffPolicy = r0     // Catch: java.lang.Throwable -> L217
            r19 = r1
            r21 = r2
            r0 = r22
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L217
            r5.backoffDelayDuration = r1     // Catch: java.lang.Throwable -> L217
            r2 = r6
            r22 = r7
            r1 = r23
            long r6 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L217
            r5.periodStartTime = r6     // Catch: java.lang.Throwable -> L217
            r7 = r0
            r23 = r1
            r6 = r24
            long r0 = r4.getLong(r6)     // Catch: java.lang.Throwable -> L217
            r5.minimumRetentionDuration = r0     // Catch: java.lang.Throwable -> L217
            r24 = r2
            r0 = r25
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L217
            r5.scheduleRequestedAt = r1     // Catch: java.lang.Throwable -> L217
            r1 = r26
            int r2 = r4.getInt(r1)     // Catch: java.lang.Throwable -> L217
            if (r2 == 0) goto L1d7
            r2 = 1
            goto L1d8
        L1d7:
            r2 = 0
        L1d8:
            r5.expedited = r2     // Catch: java.lang.Throwable -> L217
            r2 = r27
            int r25 = r4.getInt(r2)     // Catch: java.lang.Throwable -> L217
            r26 = r0
            androidx.work.OutOfQuotaPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(r25)     // Catch: java.lang.Throwable -> L217
            r5.outOfQuotaPolicy = r0     // Catch: java.lang.Throwable -> L217
            r5.constraints = r14     // Catch: java.lang.Throwable -> L217
            r3.add(r5)     // Catch: java.lang.Throwable -> L217
            r27 = r2
            r5 = r12
            r2 = r17
            r17 = r18
            r18 = r20
            r20 = r24
            r25 = r26
            r12 = r29
            r14 = r30
            r0 = r32
            r26 = r1
            r24 = r6
            r6 = r33
            r34 = r22
            r22 = r7
            r7 = r21
            r21 = r34
            goto Lce
        L210:
            r4.close()
            r16.release()
            return r3
        L217:
            r0 = move-exception
            goto L21c
        L219:
            r0 = move-exception
            r16 = r3
        L21c:
            r4.close()
            r16.release()
            throw r0
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.work.WorkInfo.State getState(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SELECT state FROM workspec WHERE id=?"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r5 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r5)
        L10:
            androidx.room.RoomDatabase r5 = r4.__db
            r5.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r5 = r4.__db
            r1 = 0
            r2 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r5, r0, r1, r2)
            boolean r3 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L2b
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L32
            androidx.work.WorkInfo$State r2 = androidx.work.impl.model.WorkTypeConverters.intToState(r1)     // Catch: java.lang.Throwable -> L32
        L2b:
            r5.close()
            r0.release()
            return r2
        L32:
            r1 = move-exception
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<java.lang.String> getUnfinishedWorkWithName(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r5 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r5)
        L10:
            androidx.room.RoomDatabase r5 = r4.__db
            r5.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r5 = r4.__db
            r1 = 0
            r2 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r5, r0, r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3b
            int r3 = r5.getCount()     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3b
        L26:
            boolean r3 = r5.moveToNext()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L34
            java.lang.String r3 = r5.getString(r2)     // Catch: java.lang.Throwable -> L3b
            r1.add(r3)     // Catch: java.lang.Throwable -> L3b
            goto L26
        L34:
            r5.close()
            r0.release()
            return r1
        L3b:
            r1 = move-exception
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<java.lang.String> getUnfinishedWorkWithTag(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r5 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r5)
        L10:
            androidx.room.RoomDatabase r5 = r4.__db
            r5.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r5 = r4.__db
            r1 = 0
            r2 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r5, r0, r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3b
            int r3 = r5.getCount()     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3b
        L26:
            boolean r3 = r5.moveToNext()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L34
            java.lang.String r3 = r5.getString(r2)     // Catch: java.lang.Throwable -> L3b
            r1.add(r3)     // Catch: java.lang.Throwable -> L3b
            goto L26
        L34:
            r5.close()
            r0.release()
            return r1
        L3b:
            r1 = move-exception
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.work.impl.model.WorkSpec getWorkSpec(java.lang.String r29) {
            r28 = this;
            r1 = r28
            r0 = r29
            java.lang.String r2 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?"
            r3 = 1
            androidx.room.RoomSQLiteQuery r2 = androidx.room.RoomSQLiteQuery.acquire(r2, r3)
            if (r0 != 0) goto L11
            r2.bindNull(r3)
            goto L14
        L11:
            r2.bindString(r3, r0)
        L14:
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r4 = 0
            r5 = 0
            android.database.Cursor r6 = androidx.room.util.DBUtil.query(r0, r2, r4, r5)
            java.lang.String r0 = "required_network_type"
            int r0 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r0)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r7 = "requires_charging"
            int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r7)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r8 = "requires_device_idle"
            int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r8)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r9 = "requires_battery_not_low"
            int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r9)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r10 = "requires_storage_not_low"
            int r10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r10)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r11 = "trigger_content_update_delay"
            int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r11)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r12 = "trigger_max_content_delay"
            int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r12)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r13 = "content_uri_triggers"
            int r13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r13)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r14 = "id"
            int r14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r14)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r15 = "state"
            int r15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r15)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r3 = "worker_class_name"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r3)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r4 = "input_merger_class_name"
            int r4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r4)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r5 = "input"
            int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r5)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r1 = "output"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r1)     // Catch: java.lang.Throwable -> L1d2
            r16 = r2
            java.lang.String r2 = "initial_delay"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1d0
            r17 = r2
            java.lang.String r2 = "interval_duration"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1d0
            r18 = r2
            java.lang.String r2 = "flex_duration"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1d0
            r19 = r2
            java.lang.String r2 = "run_attempt_count"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1d0
            r20 = r2
            java.lang.String r2 = "backoff_policy"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1d0
            r21 = r2
            java.lang.String r2 = "backoff_delay_duration"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1d0
            r22 = r2
            java.lang.String r2 = "period_start_time"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1d0
            r23 = r2
            java.lang.String r2 = "minimum_retention_duration"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1d0
            r24 = r2
            java.lang.String r2 = "schedule_requested_at"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1d0
            r25 = r2
            java.lang.String r2 = "run_in_foreground"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1d0
            r26 = r2
            java.lang.String r2 = "out_of_quota_policy"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1d0
            boolean r27 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L1d0
            if (r27 == 0) goto L1c8
            java.lang.String r14 = r6.getString(r14)     // Catch: java.lang.Throwable -> L1d0
            java.lang.String r3 = r6.getString(r3)     // Catch: java.lang.Throwable -> L1d0
            r27 = r2
            androidx.work.Constraints r2 = new androidx.work.Constraints     // Catch: java.lang.Throwable -> L1d0
            r2.<init>()     // Catch: java.lang.Throwable -> L1d0
            int r0 = r6.getInt(r0)     // Catch: java.lang.Throwable -> L1d0
            androidx.work.NetworkType r0 = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(r0)     // Catch: java.lang.Throwable -> L1d0
            r2.setRequiredNetworkType(r0)     // Catch: java.lang.Throwable -> L1d0
            int r0 = r6.getInt(r7)     // Catch: java.lang.Throwable -> L1d0
            if (r0 == 0) goto Lf5
            r0 = 1
            goto Lf6
        Lf5:
            r0 = 0
        Lf6:
            r2.setRequiresCharging(r0)     // Catch: java.lang.Throwable -> L1d0
            int r0 = r6.getInt(r8)     // Catch: java.lang.Throwable -> L1d0
            if (r0 == 0) goto L101
            r0 = 1
            goto L102
        L101:
            r0 = 0
        L102:
            r2.setRequiresDeviceIdle(r0)     // Catch: java.lang.Throwable -> L1d0
            int r0 = r6.getInt(r9)     // Catch: java.lang.Throwable -> L1d0
            if (r0 == 0) goto L10d
            r0 = 1
            goto L10e
        L10d:
            r0 = 0
        L10e:
            r2.setRequiresBatteryNotLow(r0)     // Catch: java.lang.Throwable -> L1d0
            int r0 = r6.getInt(r10)     // Catch: java.lang.Throwable -> L1d0
            if (r0 == 0) goto L119
            r0 = 1
            goto L11a
        L119:
            r0 = 0
        L11a:
            r2.setRequiresStorageNotLow(r0)     // Catch: java.lang.Throwable -> L1d0
            long r7 = r6.getLong(r11)     // Catch: java.lang.Throwable -> L1d0
            r2.setTriggerContentUpdateDelay(r7)     // Catch: java.lang.Throwable -> L1d0
            long r7 = r6.getLong(r12)     // Catch: java.lang.Throwable -> L1d0
            r2.setTriggerMaxContentDelay(r7)     // Catch: java.lang.Throwable -> L1d0
            byte[] r0 = r6.getBlob(r13)     // Catch: java.lang.Throwable -> L1d0
            androidx.work.ContentUriTriggers r0 = androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(r0)     // Catch: java.lang.Throwable -> L1d0
            r2.setContentUriTriggers(r0)     // Catch: java.lang.Throwable -> L1d0
            androidx.work.impl.model.WorkSpec r0 = new androidx.work.impl.model.WorkSpec     // Catch: java.lang.Throwable -> L1d0
            r0.<init>(r14, r3)     // Catch: java.lang.Throwable -> L1d0
            int r3 = r6.getInt(r15)     // Catch: java.lang.Throwable -> L1d0
            androidx.work.WorkInfo$State r3 = androidx.work.impl.model.WorkTypeConverters.intToState(r3)     // Catch: java.lang.Throwable -> L1d0
            r0.state = r3     // Catch: java.lang.Throwable -> L1d0
            java.lang.String r3 = r6.getString(r4)     // Catch: java.lang.Throwable -> L1d0
            r0.inputMergerClassName = r3     // Catch: java.lang.Throwable -> L1d0
            byte[] r3 = r6.getBlob(r5)     // Catch: java.lang.Throwable -> L1d0
            androidx.work.Data r3 = androidx.work.Data.fromByteArray(r3)     // Catch: java.lang.Throwable -> L1d0
            r0.input = r3     // Catch: java.lang.Throwable -> L1d0
            byte[] r1 = r6.getBlob(r1)     // Catch: java.lang.Throwable -> L1d0
            androidx.work.Data r1 = androidx.work.Data.fromByteArray(r1)     // Catch: java.lang.Throwable -> L1d0
            r0.output = r1     // Catch: java.lang.Throwable -> L1d0
            r1 = r17
            long r3 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L1d0
            r0.initialDelay = r3     // Catch: java.lang.Throwable -> L1d0
            r1 = r18
            long r3 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L1d0
            r0.intervalDuration = r3     // Catch: java.lang.Throwable -> L1d0
            r1 = r19
            long r3 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L1d0
            r0.flexDuration = r3     // Catch: java.lang.Throwable -> L1d0
            r1 = r20
            int r1 = r6.getInt(r1)     // Catch: java.lang.Throwable -> L1d0
            r0.runAttemptCount = r1     // Catch: java.lang.Throwable -> L1d0
            r1 = r21
            int r1 = r6.getInt(r1)     // Catch: java.lang.Throwable -> L1d0
            androidx.work.BackoffPolicy r1 = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(r1)     // Catch: java.lang.Throwable -> L1d0
            r0.backoffPolicy = r1     // Catch: java.lang.Throwable -> L1d0
            r1 = r22
            long r3 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L1d0
            r0.backoffDelayDuration = r3     // Catch: java.lang.Throwable -> L1d0
            r1 = r23
            long r3 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L1d0
            r0.periodStartTime = r3     // Catch: java.lang.Throwable -> L1d0
            r1 = r24
            long r3 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L1d0
            r0.minimumRetentionDuration = r3     // Catch: java.lang.Throwable -> L1d0
            r1 = r25
            long r3 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L1d0
            r0.scheduleRequestedAt = r3     // Catch: java.lang.Throwable -> L1d0
            r1 = r26
            int r1 = r6.getInt(r1)     // Catch: java.lang.Throwable -> L1d0
            if (r1 == 0) goto L1b5
            r3 = 1
            goto L1b6
        L1b5:
            r3 = 0
        L1b6:
            r0.expedited = r3     // Catch: java.lang.Throwable -> L1d0
            r1 = r27
            int r1 = r6.getInt(r1)     // Catch: java.lang.Throwable -> L1d0
            androidx.work.OutOfQuotaPolicy r1 = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(r1)     // Catch: java.lang.Throwable -> L1d0
            r0.outOfQuotaPolicy = r1     // Catch: java.lang.Throwable -> L1d0
            r0.constraints = r2     // Catch: java.lang.Throwable -> L1d0
            r5 = r0
            goto L1c9
        L1c8:
            r5 = 0
        L1c9:
            r6.close()
            r16.release()
            return r5
        L1d0:
            r0 = move-exception
            goto L1d5
        L1d2:
            r0 = move-exception
            r16 = r2
        L1d5:
            r6.close()
            r16.release()
            throw r0
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r7 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r7)
        L10:
            androidx.room.RoomDatabase r7 = r6.__db
            r7.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r7 = r6.__db
            r1 = 0
            r2 = 0
            android.database.Cursor r7 = androidx.room.util.DBUtil.query(r7, r0, r1, r2)
            java.lang.String r1 = "id"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r7, r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "state"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r7, r2)     // Catch: java.lang.Throwable -> L58
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            int r4 = r7.getCount()     // Catch: java.lang.Throwable -> L58
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L58
        L32:
            boolean r4 = r7.moveToNext()     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L51
            androidx.work.impl.model.WorkSpec$IdAndState r4 = new androidx.work.impl.model.WorkSpec$IdAndState     // Catch: java.lang.Throwable -> L58
            r4.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = r7.getString(r1)     // Catch: java.lang.Throwable -> L58
            r4.id = r5     // Catch: java.lang.Throwable -> L58
            int r5 = r7.getInt(r2)     // Catch: java.lang.Throwable -> L58
            androidx.work.WorkInfo$State r5 = androidx.work.impl.model.WorkTypeConverters.intToState(r5)     // Catch: java.lang.Throwable -> L58
            r4.state = r5     // Catch: java.lang.Throwable -> L58
            r3.add(r4)     // Catch: java.lang.Throwable -> L58
            goto L32
        L51:
            r7.close()
            r0.release()
            return r3
        L58:
            r1 = move-exception
            r7.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public boolean hasUnfinishedWork() {
            r4 = this;
            java.lang.String r0 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r1 = 0
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            androidx.room.RoomDatabase r2 = r4.__db
            r2.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r2 = r4.__db
            r3 = 0
            android.database.Cursor r2 = androidx.room.util.DBUtil.query(r2, r0, r1, r3)
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L20
            int r3 = r2.getInt(r1)     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L20
            r1 = 1
        L20:
            r2.close()
            r0.release()
            return r1
        L27:
            r1 = move-exception
            r2.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int incrementWorkSpecRunAttemptCount(java.lang.String r3) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfIncrementWorkSpecRunAttemptCount
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            r1 = 1
            if (r3 != 0) goto L12
            r0.bindNull(r1)
            goto L15
        L12:
            r0.bindString(r1, r3)
        L15:
            androidx.room.RoomDatabase r3 = r2.__db
            r3.beginTransaction()
            int r3 = r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L2e
            androidx.room.RoomDatabase r1 = r2.__db     // Catch: java.lang.Throwable -> L2e
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2e
            androidx.room.RoomDatabase r1 = r2.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r2.__preparedStmtOfIncrementWorkSpecRunAttemptCount
            r1.release(r0)
            return r3
        L2e:
            r3 = move-exception
            androidx.room.RoomDatabase r1 = r2.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r2.__preparedStmtOfIncrementWorkSpecRunAttemptCount
            r1.release(r0)
            throw r3
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void insertWorkSpec(androidx.work.impl.model.WorkSpec r2) {
            r1 = this;
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r0.beginTransaction()
            androidx.room.EntityInsertionAdapter<androidx.work.impl.model.WorkSpec> r0 = r1.__insertionAdapterOfWorkSpec     // Catch: java.lang.Throwable -> L1a
            r0.insert(r2)     // Catch: java.lang.Throwable -> L1a
            androidx.room.RoomDatabase r2 = r1.__db     // Catch: java.lang.Throwable -> L1a
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1a
            androidx.room.RoomDatabase r2 = r1.__db
            r2.endTransaction()
            return
        L1a:
            r2 = move-exception
            androidx.room.RoomDatabase r0 = r1.__db
            r0.endTransaction()
            throw r2
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int markWorkSpecScheduled(java.lang.String r3, long r4) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfMarkWorkSpecScheduled
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            r1 = 1
            r0.bindLong(r1, r4)
            r4 = 2
            if (r3 != 0) goto L16
            r0.bindNull(r4)
            goto L19
        L16:
            r0.bindString(r4, r3)
        L19:
            androidx.room.RoomDatabase r3 = r2.__db
            r3.beginTransaction()
            int r3 = r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L32
            androidx.room.RoomDatabase r4 = r2.__db     // Catch: java.lang.Throwable -> L32
            r4.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L32
            androidx.room.RoomDatabase r4 = r2.__db
            r4.endTransaction()
            androidx.room.SharedSQLiteStatement r4 = r2.__preparedStmtOfMarkWorkSpecScheduled
            r4.release(r0)
            return r3
        L32:
            r3 = move-exception
            androidx.room.RoomDatabase r4 = r2.__db
            r4.endTransaction()
            androidx.room.SharedSQLiteStatement r4 = r2.__preparedStmtOfMarkWorkSpecScheduled
            r4.release(r0)
            throw r3
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetScheduledState() {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r3.__preparedStmtOfResetScheduledState
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            androidx.room.RoomDatabase r1 = r3.__db
            r1.beginTransaction()
            int r1 = r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L24
            androidx.room.RoomDatabase r2 = r3.__db     // Catch: java.lang.Throwable -> L24
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L24
            androidx.room.RoomDatabase r2 = r3.__db
            r2.endTransaction()
            androidx.room.SharedSQLiteStatement r2 = r3.__preparedStmtOfResetScheduledState
            r2.release(r0)
            return r1
        L24:
            r1 = move-exception
            androidx.room.RoomDatabase r2 = r3.__db
            r2.endTransaction()
            androidx.room.SharedSQLiteStatement r2 = r3.__preparedStmtOfResetScheduledState
            r2.release(r0)
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetWorkSpecRunAttemptCount(java.lang.String r3) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfResetWorkSpecRunAttemptCount
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            r1 = 1
            if (r3 != 0) goto L12
            r0.bindNull(r1)
            goto L15
        L12:
            r0.bindString(r1, r3)
        L15:
            androidx.room.RoomDatabase r3 = r2.__db
            r3.beginTransaction()
            int r3 = r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L2e
            androidx.room.RoomDatabase r1 = r2.__db     // Catch: java.lang.Throwable -> L2e
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2e
            androidx.room.RoomDatabase r1 = r2.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r2.__preparedStmtOfResetWorkSpecRunAttemptCount
            r1.release(r0)
            return r3
        L2e:
            r3 = move-exception
            androidx.room.RoomDatabase r1 = r2.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r2.__preparedStmtOfResetWorkSpecRunAttemptCount
            r1.release(r0)
            throw r3
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setOutput(java.lang.String r3, androidx.work.Data r4) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfSetOutput
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            byte[] r4 = androidx.work.Data.toByteArrayInternal(r4)
            r1 = 1
            if (r4 != 0) goto L16
            r0.bindNull(r1)
            goto L19
        L16:
            r0.bindBlob(r1, r4)
        L19:
            r4 = 2
            if (r3 != 0) goto L20
            r0.bindNull(r4)
            goto L23
        L20:
            r0.bindString(r4, r3)
        L23:
            androidx.room.RoomDatabase r3 = r2.__db
            r3.beginTransaction()
            r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L3b
            androidx.room.RoomDatabase r3 = r2.__db     // Catch: java.lang.Throwable -> L3b
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L3b
            androidx.room.RoomDatabase r3 = r2.__db
            r3.endTransaction()
            androidx.room.SharedSQLiteStatement r3 = r2.__preparedStmtOfSetOutput
            r3.release(r0)
            return
        L3b:
            r3 = move-exception
            androidx.room.RoomDatabase r4 = r2.__db
            r4.endTransaction()
            androidx.room.SharedSQLiteStatement r4 = r2.__preparedStmtOfSetOutput
            r4.release(r0)
            throw r3
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setPeriodStartTime(java.lang.String r3, long r4) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfSetPeriodStartTime
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            r1 = 1
            r0.bindLong(r1, r4)
            r4 = 2
            if (r3 != 0) goto L16
            r0.bindNull(r4)
            goto L19
        L16:
            r0.bindString(r4, r3)
        L19:
            androidx.room.RoomDatabase r3 = r2.__db
            r3.beginTransaction()
            r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L31
            androidx.room.RoomDatabase r3 = r2.__db     // Catch: java.lang.Throwable -> L31
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L31
            androidx.room.RoomDatabase r3 = r2.__db
            r3.endTransaction()
            androidx.room.SharedSQLiteStatement r3 = r2.__preparedStmtOfSetPeriodStartTime
            r3.release(r0)
            return
        L31:
            r3 = move-exception
            androidx.room.RoomDatabase r4 = r2.__db
            r4.endTransaction()
            androidx.room.SharedSQLiteStatement r4 = r2.__preparedStmtOfSetPeriodStartTime
            r4.release(r0)
            throw r3
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setState(androidx.work.WorkInfo.State r5, java.lang.String... r6) {
            r4 = this;
            androidx.room.RoomDatabase r0 = r4.__db
            r0.assertNotSuspendingTransaction()
            java.lang.StringBuilder r0 = androidx.room.util.StringUtil.newStringBuilder()
            java.lang.String r1 = "UPDATE workspec SET state="
            r0.append(r1)
            java.lang.String r1 = "?"
            r0.append(r1)
            java.lang.String r1 = " WHERE id IN ("
            r0.append(r1)
            int r1 = r6.length
            androidx.room.util.StringUtil.appendPlaceholders(r0, r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.room.RoomDatabase r1 = r4.__db
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.compileStatement(r0)
            int r5 = androidx.work.impl.model.WorkTypeConverters.stateToInt(r5)
            long r1 = (long) r5
            r5 = 1
            r0.bindLong(r5, r1)
            int r5 = r6.length
            r1 = 2
            r2 = 0
        L37:
            if (r2 >= r5) goto L49
            r3 = r6[r2]
            if (r3 != 0) goto L41
            r0.bindNull(r1)
            goto L44
        L41:
            r0.bindString(r1, r3)
        L44:
            int r1 = r1 + 1
            int r2 = r2 + 1
            goto L37
        L49:
            androidx.room.RoomDatabase r5 = r4.__db
            r5.beginTransaction()
            int r5 = r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L5d
            androidx.room.RoomDatabase r6 = r4.__db     // Catch: java.lang.Throwable -> L5d
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L5d
            androidx.room.RoomDatabase r6 = r4.__db
            r6.endTransaction()
            return r5
        L5d:
            r5 = move-exception
            androidx.room.RoomDatabase r6 = r4.__db
            r6.endTransaction()
            throw r5
    }
}
