package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* loaded from: classes.dex */
public class JobInfoScheduler implements com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler {
    static final java.lang.String ATTEMPT_NUMBER = "attemptNumber";
    static final java.lang.String BACKEND_NAME = "backendName";
    static final java.lang.String EVENT_PRIORITY = "priority";
    static final java.lang.String EXTRAS = "extras";
    private static final java.lang.String LOG_TAG = "JobInfoScheduler";
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig config;
    private final android.content.Context context;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore;

    public JobInfoScheduler(android.content.Context r1, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r2, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r3) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.eventStore = r2
            r0.config = r3
            return
    }

    private boolean isJobServiceOn(android.app.job.JobScheduler r5, int r6, int r7) {
            r4 = this;
            java.util.List r5 = r5.getAllPendingJobs()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L28
            java.lang.Object r0 = r5.next()
            android.app.job.JobInfo r0 = (android.app.job.JobInfo) r0
            android.os.PersistableBundle r2 = r0.getExtras()
            java.lang.String r3 = "attemptNumber"
            int r2 = r2.getInt(r3)
            int r0 = r0.getId()
            if (r0 != r6) goto L8
            if (r2 < r7) goto L28
            r1 = 1
        L28:
            return r1
    }

    int getJobId(com.google.android.datatransport.runtime.TransportContext r5) {
            r4 = this;
            java.util.zip.Adler32 r0 = new java.util.zip.Adler32
            r0.<init>()
            android.content.Context r1 = r4.context
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r2)
            byte[] r1 = r1.getBytes(r3)
            r0.update(r1)
            java.lang.String r1 = r5.getBackendName()
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            byte[] r1 = r1.getBytes(r2)
            r0.update(r1)
            r1 = 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            com.google.android.datatransport.Priority r2 = r5.getPriority()
            int r2 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r2)
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            byte[] r1 = r1.array()
            r0.update(r1)
            byte[] r1 = r5.getExtras()
            if (r1 == 0) goto L4c
            byte[] r5 = r5.getExtras()
            r0.update(r5)
        L4c:
            long r0 = r0.getValue()
            int r5 = (int) r0
            return r5
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext r2, int r3) {
            r1 = this;
            r0 = 0
            r1.schedule(r2, r3, r0)
            return
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext r13, int r14, boolean r15) {
            r12 = this;
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r12.context
            java.lang.Class<com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService> r2 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.class
            r0.<init>(r1, r2)
            android.content.Context r1 = r12.context
            java.lang.String r2 = "jobscheduler"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.app.job.JobScheduler r1 = (android.app.job.JobScheduler) r1
            int r2 = r12.getJobId(r13)
            java.lang.String r3 = "JobInfoScheduler"
            if (r15 != 0) goto L27
            boolean r15 = r12.isJobServiceOn(r1, r2, r14)
            if (r15 == 0) goto L27
            java.lang.String r14 = "Upload for context %s is already scheduled. Returning..."
            com.google.android.datatransport.runtime.logging.Logging.d(r3, r14, r13)
            return
        L27:
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r15 = r12.eventStore
            long r10 = r15.getNextCallTime(r13)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r4 = r12.config
            android.app.job.JobInfo$Builder r5 = new android.app.job.JobInfo$Builder
            r5.<init>(r2, r0)
            com.google.android.datatransport.Priority r6 = r13.getPriority()
            r7 = r10
            r9 = r14
            android.app.job.JobInfo$Builder r15 = r4.configureJob(r5, r6, r7, r9)
            android.os.PersistableBundle r0 = new android.os.PersistableBundle
            r0.<init>()
            java.lang.String r4 = "attemptNumber"
            r0.putInt(r4, r14)
            java.lang.String r4 = r13.getBackendName()
            java.lang.String r5 = "backendName"
            r0.putString(r5, r4)
            com.google.android.datatransport.Priority r4 = r13.getPriority()
            int r4 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r4)
            java.lang.String r5 = "priority"
            r0.putInt(r5, r4)
            byte[] r4 = r13.getExtras()
            r5 = 0
            if (r4 == 0) goto L72
            byte[] r4 = r13.getExtras()
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)
            java.lang.String r6 = "extras"
            r0.putString(r6, r4)
        L72:
            r15.setExtras(r0)
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r5] = r13
            r4 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r4] = r2
            r2 = 2
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r4 = r12.config
            com.google.android.datatransport.Priority r13 = r13.getPriority()
            long r4 = r4.getScheduleDelay(r13, r10, r14)
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            r0[r2] = r13
            r13 = 3
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r0[r13] = r2
            r13 = 4
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0[r13] = r14
            java.lang.String r13 = "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d"
            com.google.android.datatransport.runtime.logging.Logging.d(r3, r13, r0)
            android.app.job.JobInfo r13 = r15.build()
            r1.schedule(r13)
            return
    }
}
