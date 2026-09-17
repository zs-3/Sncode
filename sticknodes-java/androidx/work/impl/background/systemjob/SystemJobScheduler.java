package androidx.work.impl.background.systemjob;

/* loaded from: classes.dex */
public class SystemJobScheduler implements androidx.work.impl.Scheduler {
    private static final java.lang.String TAG = null;
    private final android.content.Context mContext;
    private final android.app.job.JobScheduler mJobScheduler;
    private final androidx.work.impl.background.systemjob.SystemJobInfoConverter mSystemJobInfoConverter;
    private final androidx.work.impl.WorkManagerImpl mWorkManager;

    static {
            java.lang.String r0 = "SystemJobScheduler"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.systemjob.SystemJobScheduler.TAG = r0
            return
    }

    public SystemJobScheduler(android.content.Context r3, androidx.work.impl.WorkManagerImpl r4) {
            r2 = this;
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            androidx.work.impl.background.systemjob.SystemJobInfoConverter r1 = new androidx.work.impl.background.systemjob.SystemJobInfoConverter
            r1.<init>(r3)
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public SystemJobScheduler(android.content.Context r1, androidx.work.impl.WorkManagerImpl r2, android.app.job.JobScheduler r3, androidx.work.impl.background.systemjob.SystemJobInfoConverter r4) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mWorkManager = r2
            r0.mJobScheduler = r3
            r0.mSystemJobInfoConverter = r4
            return
    }

    public static void cancelAll(android.content.Context r2) {
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            if (r0 == 0) goto L2e
            java.util.List r2 = getPendingJobs(r2, r0)
            if (r2 == 0) goto L2e
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L2e
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            android.app.job.JobInfo r1 = (android.app.job.JobInfo) r1
            int r1 = r1.getId()
            cancelJobById(r0, r1)
            goto L1a
        L2e:
            return
    }

    private static void cancelJobById(android.app.job.JobScheduler r6, int r7) {
            r6.cancel(r7)     // Catch: java.lang.Throwable -> L4
            goto L26
        L4:
            r6 = move-exception
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemjob.SystemJobScheduler.TAG
            java.util.Locale r2 = java.util.Locale.getDefault()
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5 = 0
            r4[r5] = r7
            java.lang.String r7 = "Exception while trying to cancel job (%d)"
            java.lang.String r7 = java.lang.String.format(r2, r7, r4)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]
            r2[r5] = r6
            r0.error(r1, r7, r2)
        L26:
            return
    }

    private static java.util.List<java.lang.Integer> getPendingJobIds(android.content.Context r2, android.app.job.JobScheduler r3, java.lang.String r4) {
            java.util.List r2 = getPendingJobs(r2, r3)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 2
            r3.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r2.next()
            android.app.job.JobInfo r0 = (android.app.job.JobInfo) r0
            java.lang.String r1 = getWorkSpecIdFromJobInfo(r0)
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L12
            int r0 = r0.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            goto L12
        L34:
            return r3
    }

    private static java.util.List<android.app.job.JobInfo> getPendingJobs(android.content.Context r5, android.app.job.JobScheduler r6) {
            r0 = 0
            java.util.List r6 = r6.getAllPendingJobs()     // Catch: java.lang.Throwable -> L6
            goto L19
        L6:
            r6 = move-exception
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.impl.background.systemjob.SystemJobScheduler.TAG
            r3 = 1
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r4 = 0
            r3[r4] = r6
            java.lang.String r6 = "getAllPendingJobs() is not reliable on this device."
            r1.error(r2, r6, r3)
            r6 = r0
        L19:
            if (r6 != 0) goto L1c
            return r0
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<androidx.work.impl.background.systemjob.SystemJobService> r2 = androidx.work.impl.background.systemjob.SystemJobService.class
            r1.<init>(r5, r2)
            java.util.Iterator r5 = r6.iterator()
        L30:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4a
            java.lang.Object r6 = r5.next()
            android.app.job.JobInfo r6 = (android.app.job.JobInfo) r6
            android.content.ComponentName r2 = r6.getService()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L30
            r0.add(r6)
            goto L30
        L4a:
            return r0
    }

    private static java.lang.String getWorkSpecIdFromJobInfo(android.app.job.JobInfo r2) {
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r2 = r2.getExtras()
            if (r2 == 0) goto L13
            boolean r1 = r2.containsKey(r0)     // Catch: java.lang.NullPointerException -> L13
            if (r1 == 0) goto L13
            java.lang.String r2 = r2.getString(r0)     // Catch: java.lang.NullPointerException -> L13
            return r2
        L13:
            r2 = 0
            return r2
    }

    public static boolean reconcileJobs(android.content.Context r7, androidx.work.impl.WorkManagerImpl r8) {
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r7.getSystemService(r0)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            java.util.List r7 = getPendingJobs(r7, r0)
            androidx.work.impl.WorkDatabase r1 = r8.getWorkDatabase()
            androidx.work.impl.model.SystemIdInfoDao r1 = r1.systemIdInfoDao()
            java.util.List r1 = r1.getWorkSpecIds()
            r2 = 0
            if (r7 == 0) goto L20
            int r3 = r7.size()
            goto L21
        L20:
            r3 = 0
        L21:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r3)
            if (r7 == 0) goto L54
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L54
            java.util.Iterator r7 = r7.iterator()
        L32:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r7.next()
            android.app.job.JobInfo r3 = (android.app.job.JobInfo) r3
            java.lang.String r5 = getWorkSpecIdFromJobInfo(r3)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L4c
            r4.add(r5)
            goto L32
        L4c:
            int r3 = r3.getId()
            cancelJobById(r0, r3)
            goto L32
        L54:
            java.util.Iterator r7 = r1.iterator()
        L58:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L58
            androidx.work.Logger r7 = androidx.work.Logger.get()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobScheduler.TAG
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            java.lang.String r3 = "Reconciling jobs"
            r7.debug(r0, r3, r2)
            r2 = 1
        L78:
            if (r2 == 0) goto La7
            androidx.work.impl.WorkDatabase r7 = r8.getWorkDatabase()
            r7.beginTransaction()
            androidx.work.impl.model.WorkSpecDao r8 = r7.workSpecDao()     // Catch: java.lang.Throwable -> La2
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> La2
        L89:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> La2
            r3 = -1
            r8.markWorkSpecScheduled(r1, r3)     // Catch: java.lang.Throwable -> La2
            goto L89
        L9b:
            r7.setTransactionSuccessful()     // Catch: java.lang.Throwable -> La2
            r7.endTransaction()
            goto La7
        La2:
            r8 = move-exception
            r7.endTransaction()
            throw r8
        La7:
            return r2
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            android.app.job.JobScheduler r1 = r3.mJobScheduler
            java.util.List r0 = getPendingJobIds(r0, r1, r4)
            if (r0 == 0) goto L37
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L37
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            android.app.job.JobScheduler r2 = r3.mJobScheduler
            cancelJobById(r2, r1)
            goto L14
        L2a:
            androidx.work.impl.WorkManagerImpl r0 = r3.mWorkManager
            androidx.work.impl.WorkDatabase r0 = r0.getWorkDatabase()
            androidx.work.impl.model.SystemIdInfoDao r0 = r0.systemIdInfoDao()
            r0.removeSystemIdInfo(r4)
        L37:
            return
    }

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(androidx.work.impl.model.WorkSpec... r11) {
            r10 = this;
            androidx.work.impl.WorkManagerImpl r0 = r10.mWorkManager
            androidx.work.impl.WorkDatabase r0 = r0.getWorkDatabase()
            androidx.work.impl.utils.IdGenerator r1 = new androidx.work.impl.utils.IdGenerator
            r1.<init>(r0)
            int r2 = r11.length
            r3 = 0
            r4 = 0
        Le:
            if (r4 >= r2) goto L10f
            r5 = r11[r4]
            r0.beginTransaction()
            androidx.work.impl.model.WorkSpecDao r6 = r0.workSpecDao()     // Catch: java.lang.Throwable -> L10a
            java.lang.String r7 = r5.id     // Catch: java.lang.Throwable -> L10a
            androidx.work.impl.model.WorkSpec r6 = r6.getWorkSpec(r7)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r7 = "Skipping scheduling "
            if (r6 != 0) goto L49
            androidx.work.Logger r6 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L10a
            java.lang.String r8 = androidx.work.impl.background.systemjob.SystemJobScheduler.TAG     // Catch: java.lang.Throwable -> L10a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10a
            r9.<init>()     // Catch: java.lang.Throwable -> L10a
            r9.append(r7)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r5 = r5.id     // Catch: java.lang.Throwable -> L10a
            r9.append(r5)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r5 = " because it's no longer in the DB"
            r9.append(r5)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r5 = r9.toString()     // Catch: java.lang.Throwable -> L10a
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]     // Catch: java.lang.Throwable -> L10a
            r6.warning(r8, r5, r7)     // Catch: java.lang.Throwable -> L10a
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L10a
            goto L103
        L49:
            androidx.work.WorkInfo$State r6 = r6.state     // Catch: java.lang.Throwable -> L10a
            androidx.work.WorkInfo$State r8 = androidx.work.WorkInfo.State.ENQUEUED     // Catch: java.lang.Throwable -> L10a
            if (r6 == r8) goto L75
            androidx.work.Logger r6 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L10a
            java.lang.String r8 = androidx.work.impl.background.systemjob.SystemJobScheduler.TAG     // Catch: java.lang.Throwable -> L10a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10a
            r9.<init>()     // Catch: java.lang.Throwable -> L10a
            r9.append(r7)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r5 = r5.id     // Catch: java.lang.Throwable -> L10a
            r9.append(r5)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r5 = " because it is no longer enqueued"
            r9.append(r5)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r5 = r9.toString()     // Catch: java.lang.Throwable -> L10a
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]     // Catch: java.lang.Throwable -> L10a
            r6.warning(r8, r5, r7)     // Catch: java.lang.Throwable -> L10a
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L10a
            goto L103
        L75:
            androidx.work.impl.model.SystemIdInfoDao r6 = r0.systemIdInfoDao()     // Catch: java.lang.Throwable -> L10a
            java.lang.String r7 = r5.id     // Catch: java.lang.Throwable -> L10a
            androidx.work.impl.model.SystemIdInfo r6 = r6.getSystemIdInfo(r7)     // Catch: java.lang.Throwable -> L10a
            if (r6 == 0) goto L84
            int r7 = r6.systemId     // Catch: java.lang.Throwable -> L10a
            goto L9c
        L84:
            androidx.work.impl.WorkManagerImpl r7 = r10.mWorkManager     // Catch: java.lang.Throwable -> L10a
            androidx.work.Configuration r7 = r7.getConfiguration()     // Catch: java.lang.Throwable -> L10a
            int r7 = r7.getMinJobSchedulerId()     // Catch: java.lang.Throwable -> L10a
            androidx.work.impl.WorkManagerImpl r8 = r10.mWorkManager     // Catch: java.lang.Throwable -> L10a
            androidx.work.Configuration r8 = r8.getConfiguration()     // Catch: java.lang.Throwable -> L10a
            int r8 = r8.getMaxJobSchedulerId()     // Catch: java.lang.Throwable -> L10a
            int r7 = r1.nextJobSchedulerIdWithRange(r7, r8)     // Catch: java.lang.Throwable -> L10a
        L9c:
            if (r6 != 0) goto Lb2
            androidx.work.impl.model.SystemIdInfo r6 = new androidx.work.impl.model.SystemIdInfo     // Catch: java.lang.Throwable -> L10a
            java.lang.String r8 = r5.id     // Catch: java.lang.Throwable -> L10a
            r6.<init>(r8, r7)     // Catch: java.lang.Throwable -> L10a
            androidx.work.impl.WorkManagerImpl r8 = r10.mWorkManager     // Catch: java.lang.Throwable -> L10a
            androidx.work.impl.WorkDatabase r8 = r8.getWorkDatabase()     // Catch: java.lang.Throwable -> L10a
            androidx.work.impl.model.SystemIdInfoDao r8 = r8.systemIdInfoDao()     // Catch: java.lang.Throwable -> L10a
            r8.insertSystemIdInfo(r6)     // Catch: java.lang.Throwable -> L10a
        Lb2:
            r10.scheduleInternal(r5, r7)     // Catch: java.lang.Throwable -> L10a
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L10a
            r8 = 23
            if (r6 != r8) goto L100
            android.content.Context r6 = r10.mContext     // Catch: java.lang.Throwable -> L10a
            android.app.job.JobScheduler r8 = r10.mJobScheduler     // Catch: java.lang.Throwable -> L10a
            java.lang.String r9 = r5.id     // Catch: java.lang.Throwable -> L10a
            java.util.List r6 = getPendingJobIds(r6, r8, r9)     // Catch: java.lang.Throwable -> L10a
            if (r6 == 0) goto L100
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L10a
            int r7 = r6.indexOf(r7)     // Catch: java.lang.Throwable -> L10a
            if (r7 < 0) goto Ld4
            r6.remove(r7)     // Catch: java.lang.Throwable -> L10a
        Ld4:
            boolean r7 = r6.isEmpty()     // Catch: java.lang.Throwable -> L10a
            if (r7 != 0) goto Le5
            java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.Throwable -> L10a
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L10a
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L10a
            goto Lfd
        Le5:
            androidx.work.impl.WorkManagerImpl r6 = r10.mWorkManager     // Catch: java.lang.Throwable -> L10a
            androidx.work.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> L10a
            int r6 = r6.getMinJobSchedulerId()     // Catch: java.lang.Throwable -> L10a
            androidx.work.impl.WorkManagerImpl r7 = r10.mWorkManager     // Catch: java.lang.Throwable -> L10a
            androidx.work.Configuration r7 = r7.getConfiguration()     // Catch: java.lang.Throwable -> L10a
            int r7 = r7.getMaxJobSchedulerId()     // Catch: java.lang.Throwable -> L10a
            int r6 = r1.nextJobSchedulerIdWithRange(r6, r7)     // Catch: java.lang.Throwable -> L10a
        Lfd:
            r10.scheduleInternal(r5, r6)     // Catch: java.lang.Throwable -> L10a
        L100:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L10a
        L103:
            r0.endTransaction()
            int r4 = r4 + 1
            goto Le
        L10a:
            r11 = move-exception
            r0.endTransaction()
            throw r11
        L10f:
            return
    }

    public void scheduleInternal(androidx.work.impl.model.WorkSpec r9, int r10) {
            r8 = this;
            androidx.work.impl.background.systemjob.SystemJobInfoConverter r0 = r8.mSystemJobInfoConverter
            android.app.job.JobInfo r0 = r0.convert(r9, r10)
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.impl.background.systemjob.SystemJobScheduler.TAG
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r9.id
            r6 = 0
            r4[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r7 = 1
            r4[r7] = r5
            java.lang.String r5 = "Scheduling work ID %s Job ID %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r6]
            r1.debug(r2, r4, r5)
            android.app.job.JobScheduler r1 = r8.mJobScheduler     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            int r0 = r1.schedule(r0)     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            if (r0 != 0) goto L80
            androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            java.lang.String r1 = "Unable to schedule work ID %s"
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            java.lang.String r5 = r9.id     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            r4[r6] = r5     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            java.lang.String r1 = java.lang.String.format(r1, r4)     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            java.lang.Throwable[] r4 = new java.lang.Throwable[r6]     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            r0.warning(r2, r1, r4)     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            boolean r0 = r9.expedited     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            if (r0 == 0) goto L80
            androidx.work.OutOfQuotaPolicy r0 = r9.outOfQuotaPolicy     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            androidx.work.OutOfQuotaPolicy r1 = androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            if (r0 != r1) goto L80
            r9.expedited = r6     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            java.lang.String r0 = "Scheduling a non-expedited job (work ID %s)"
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            java.lang.String r4 = r9.id     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            r1[r6] = r4     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            java.lang.Throwable[] r4 = new java.lang.Throwable[r6]     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            r1.debug(r2, r0, r4)     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            r8.scheduleInternal(r9, r10)     // Catch: java.lang.Throwable -> L68 java.lang.IllegalStateException -> L81
            goto L80
        L68:
            r10 = move-exception
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemjob.SystemJobScheduler.TAG
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r6] = r9
            java.lang.String r9 = "Unable to schedule %s"
            java.lang.String r9 = java.lang.String.format(r9, r2)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r7]
            r2[r6] = r10
            r0.error(r1, r9, r2)
        L80:
            return
        L81:
            r9 = move-exception
            android.content.Context r10 = r8.mContext
            android.app.job.JobScheduler r0 = r8.mJobScheduler
            java.util.List r10 = getPendingJobs(r10, r0)
            if (r10 == 0) goto L91
            int r10 = r10.size()
            goto L92
        L91:
            r10 = 0
        L92:
            java.util.Locale r0 = java.util.Locale.getDefault()
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r6] = r10
            androidx.work.impl.WorkManagerImpl r10 = r8.mWorkManager
            androidx.work.impl.WorkDatabase r10 = r10.getWorkDatabase()
            androidx.work.impl.model.WorkSpecDao r10 = r10.workSpecDao()
            java.util.List r10 = r10.getScheduledWork()
            int r10 = r10.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r7] = r10
            androidx.work.impl.WorkManagerImpl r10 = r8.mWorkManager
            androidx.work.Configuration r10 = r10.getConfiguration()
            int r10 = r10.getMaxSchedulerLimit()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r3] = r10
            java.lang.String r10 = "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d."
            java.lang.String r10 = java.lang.String.format(r0, r10, r1)
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.background.systemjob.SystemJobScheduler.TAG
            java.lang.Throwable[] r2 = new java.lang.Throwable[r6]
            r0.error(r1, r10, r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10, r9)
            throw r0
    }
}
