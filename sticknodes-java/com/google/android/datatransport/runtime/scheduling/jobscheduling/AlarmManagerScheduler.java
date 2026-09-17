package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* loaded from: classes.dex */
public class AlarmManagerScheduler implements com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler {
    static final java.lang.String ATTEMPT_NUMBER = "attemptNumber";
    static final java.lang.String BACKEND_NAME = "backendName";
    static final java.lang.String EVENT_PRIORITY = "priority";
    static final java.lang.String EXTRAS = "extras";
    private static final java.lang.String LOG_TAG = "AlarmManagerScheduler";
    private android.app.AlarmManager alarmManager;
    private final com.google.android.datatransport.runtime.time.Clock clock;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig config;
    private final android.content.Context context;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore;

    AlarmManagerScheduler(android.content.Context r1, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r2, android.app.AlarmManager r3, com.google.android.datatransport.runtime.time.Clock r4, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r5) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.eventStore = r2
            r0.alarmManager = r3
            r0.clock = r4
            r0.config = r5
            return
    }

    public AlarmManagerScheduler(android.content.Context r8, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r9, com.google.android.datatransport.runtime.time.Clock r10, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r11) {
            r7 = this;
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r8.getSystemService(r0)
            r4 = r0
            android.app.AlarmManager r4 = (android.app.AlarmManager) r4
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    boolean isJobServiceOn(android.content.Intent r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L9
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            goto Lb
        L9:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
        Lb:
            android.content.Context r1 = r3.context
            r2 = 0
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r1, r2, r4, r0)
            if (r4 == 0) goto L15
            r2 = 1
        L15:
            return r2
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext r2, int r3) {
            r1 = this;
            r0 = 0
            r1.schedule(r2, r3, r0)
            return
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext r9, int r10, boolean r11) {
            r8 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r9.getBackendName()
            java.lang.String r2 = "backendName"
            r0.appendQueryParameter(r2, r1)
            com.google.android.datatransport.Priority r1 = r9.getPriority()
            int r1 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "priority"
            r0.appendQueryParameter(r2, r1)
            byte[] r1 = r9.getExtras()
            r2 = 0
            if (r1 == 0) goto L33
            byte[] r1 = r9.getExtras()
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)
            java.lang.String r3 = "extras"
            r0.appendQueryParameter(r3, r1)
        L33:
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r3 = r8.context
            java.lang.Class<com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver> r4 = com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver.class
            r1.<init>(r3, r4)
            android.net.Uri r0 = r0.build()
            r1.setData(r0)
            java.lang.String r0 = "attemptNumber"
            r1.putExtra(r0, r10)
            java.lang.String r0 = "AlarmManagerScheduler"
            if (r11 != 0) goto L58
            boolean r11 = r8.isJobServiceOn(r1)
            if (r11 == 0) goto L58
            java.lang.String r10 = "Upload for context %s is already scheduled. Returning..."
            com.google.android.datatransport.runtime.logging.Logging.d(r0, r10, r9)
            return
        L58:
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r11 = r8.eventStore
            long r3 = r11.getNextCallTime(r9)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r11 = r8.config
            com.google.android.datatransport.Priority r5 = r9.getPriority()
            long r5 = r11.getScheduleDelay(r5, r3, r10)
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r2] = r9
            r9 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            r11[r9] = r7
            r9 = 2
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r11[r9] = r3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r10 = 3
            r11[r10] = r9
            java.lang.String r9 = "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d"
            com.google.android.datatransport.runtime.logging.Logging.d(r0, r9, r11)
            android.content.Context r9 = r8.context
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r11 < r0) goto L92
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            goto L93
        L92:
            r11 = 0
        L93:
            android.app.PendingIntent r9 = android.app.PendingIntent.getBroadcast(r9, r2, r1, r11)
            android.app.AlarmManager r11 = r8.alarmManager
            com.google.android.datatransport.runtime.time.Clock r0 = r8.clock
            long r0 = r0.getTime()
            long r0 = r0 + r5
            r11.set(r10, r0, r9)
            return
    }
}
