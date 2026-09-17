package androidx.work.impl.background.systemjob;

/* loaded from: classes.dex */
class SystemJobInfoConverter {
    private static final java.lang.String TAG = null;
    private final android.content.ComponentName mWorkServiceComponent;

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobInfoConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$work$NetworkType = null;

        static {
                androidx.work.NetworkType[] r0 = androidx.work.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.impl.background.systemjob.SystemJobInfoConverter.AnonymousClass1.$SwitchMap$androidx$work$NetworkType = r0
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_REQUIRED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.work.impl.background.systemjob.SystemJobInfoConverter.AnonymousClass1.$SwitchMap$androidx$work$NetworkType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.work.NetworkType r1 = androidx.work.NetworkType.CONNECTED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.work.impl.background.systemjob.SystemJobInfoConverter.AnonymousClass1.$SwitchMap$androidx$work$NetworkType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.work.NetworkType r1 = androidx.work.NetworkType.UNMETERED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.work.impl.background.systemjob.SystemJobInfoConverter.AnonymousClass1.$SwitchMap$androidx$work$NetworkType     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_ROAMING     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.work.impl.background.systemjob.SystemJobInfoConverter.AnonymousClass1.$SwitchMap$androidx$work$NetworkType     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.work.NetworkType r1 = androidx.work.NetworkType.METERED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    static {
            java.lang.String r0 = "SystemJobInfoConverter"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.background.systemjob.SystemJobInfoConverter.TAG = r0
            return
    }

    SystemJobInfoConverter(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            android.content.Context r3 = r3.getApplicationContext()
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.Class<androidx.work.impl.background.systemjob.SystemJobService> r1 = androidx.work.impl.background.systemjob.SystemJobService.class
            r0.<init>(r3, r1)
            r2.mWorkServiceComponent = r0
            return
    }

    private static android.app.job.JobInfo.TriggerContentUri convertContentUriTrigger(androidx.work.ContentUriTriggers.Trigger r2) {
            boolean r0 = r2.shouldTriggerForDescendants()
            android.app.job.JobInfo$TriggerContentUri r1 = new android.app.job.JobInfo$TriggerContentUri
            android.net.Uri r2 = r2.getUri()
            r1.<init>(r2, r0)
            return r1
    }

    static int convertNetworkType(androidx.work.NetworkType r5) {
            int[] r0 = androidx.work.impl.background.systemjob.SystemJobInfoConverter.AnonymousClass1.$SwitchMap$androidx$work$NetworkType
            int r1 = r5.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L3f
            r3 = 2
            if (r0 == r3) goto L3e
            r4 = 3
            if (r0 == r4) goto L3d
            r3 = 4
            if (r0 == r3) goto L20
            r4 = 5
            if (r0 == r4) goto L19
            goto L27
        L19:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r0 < r4) goto L27
            return r3
        L20:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r0 < r3) goto L27
            return r4
        L27:
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobInfoConverter.TAG
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r5
            java.lang.String r5 = "API version too low. Cannot convert network type value %s"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r0.debug(r3, r5, r1)
            return r2
        L3d:
            return r3
        L3e:
            return r2
        L3f:
            return r1
    }

    static void setRequiredNetwork(android.app.job.JobInfo.Builder r2, androidx.work.NetworkType r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1d
            androidx.work.NetworkType r0 = androidx.work.NetworkType.TEMPORARILY_UNMETERED
            if (r3 != r0) goto L1d
            android.net.NetworkRequest$Builder r3 = new android.net.NetworkRequest$Builder
            r3.<init>()
            r0 = 25
            android.net.NetworkRequest$Builder r3 = r3.addCapability(r0)
            android.net.NetworkRequest r3 = r3.build()
            r2.setRequiredNetwork(r3)
            goto L24
        L1d:
            int r3 = convertNetworkType(r3)
            r2.setRequiredNetworkType(r3)
        L24:
            return
    }

    android.app.job.JobInfo convert(androidx.work.impl.model.WorkSpec r10, int r11) {
            r9 = this;
            androidx.work.Constraints r0 = r10.constraints
            android.os.PersistableBundle r1 = new android.os.PersistableBundle
            r1.<init>()
            java.lang.String r2 = r10.id
            java.lang.String r3 = "EXTRA_WORK_SPEC_ID"
            r1.putString(r3, r2)
            boolean r2 = r10.isPeriodic()
            java.lang.String r3 = "EXTRA_IS_PERIODIC"
            r1.putBoolean(r3, r2)
            android.app.job.JobInfo$Builder r2 = new android.app.job.JobInfo$Builder
            android.content.ComponentName r3 = r9.mWorkServiceComponent
            r2.<init>(r11, r3)
            boolean r11 = r0.requiresCharging()
            android.app.job.JobInfo$Builder r11 = r2.setRequiresCharging(r11)
            boolean r2 = r0.requiresDeviceIdle()
            android.app.job.JobInfo$Builder r11 = r11.setRequiresDeviceIdle(r2)
            android.app.job.JobInfo$Builder r11 = r11.setExtras(r1)
            androidx.work.NetworkType r1 = r0.getRequiredNetworkType()
            setRequiredNetwork(r11, r1)
            boolean r1 = r0.requiresDeviceIdle()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L4f
            androidx.work.BackoffPolicy r1 = r10.backoffPolicy
            androidx.work.BackoffPolicy r4 = androidx.work.BackoffPolicy.LINEAR
            if (r1 != r4) goto L49
            r1 = 0
            goto L4a
        L49:
            r1 = 1
        L4a:
            long r4 = r10.backoffDelayDuration
            r11.setBackoffCriteria(r4, r1)
        L4f:
            long r4 = r10.calculateNextRunTime()
            long r6 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r6
            r6 = 0
            long r4 = java.lang.Math.max(r4, r6)
            int r1 = android.os.Build.VERSION.SDK_INT
            r8 = 28
            if (r1 > r8) goto L68
            r11.setMinimumLatency(r4)
            goto L77
        L68:
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L70
            r11.setMinimumLatency(r4)
            goto L77
        L70:
            boolean r4 = r10.expedited
            if (r4 != 0) goto L77
            r11.setImportantWhileForeground(r3)
        L77:
            r4 = 24
            if (r1 < r4) goto Laf
            boolean r1 = r0.hasContentUriTriggers()
            if (r1 == 0) goto Laf
            androidx.work.ContentUriTriggers r1 = r0.getContentUriTriggers()
            java.util.Set r1 = r1.getTriggers()
            java.util.Iterator r1 = r1.iterator()
        L8d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto La1
            java.lang.Object r4 = r1.next()
            androidx.work.ContentUriTriggers$Trigger r4 = (androidx.work.ContentUriTriggers.Trigger) r4
            android.app.job.JobInfo$TriggerContentUri r4 = convertContentUriTrigger(r4)
            r11.addTriggerContentUri(r4)
            goto L8d
        La1:
            long r4 = r0.getTriggerContentUpdateDelay()
            r11.setTriggerContentUpdateDelay(r4)
            long r4 = r0.getTriggerMaxContentDelay()
            r11.setTriggerContentMaxDelay(r4)
        Laf:
            r11.setPersisted(r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r1 < r4) goto Lc6
            boolean r1 = r0.requiresBatteryNotLow()
            r11.setRequiresBatteryNotLow(r1)
            boolean r0 = r0.requiresStorageNotLow()
            r11.setRequiresStorageNotLow(r0)
        Lc6:
            int r0 = r10.runAttemptCount
            if (r0 <= 0) goto Lcb
            r2 = 1
        Lcb:
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastS()
            if (r0 == 0) goto Lda
            boolean r10 = r10.expedited
            if (r10 == 0) goto Lda
            if (r2 != 0) goto Lda
            r11.setExpedited(r3)
        Lda:
            android.app.job.JobInfo r10 = r11.build()
            return r10
    }
}
