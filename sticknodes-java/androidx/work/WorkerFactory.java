package androidx.work;

/* loaded from: classes.dex */
public abstract class WorkerFactory {
    private static final java.lang.String TAG = null;


    static {
            java.lang.String r0 = "WorkerFactory"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.WorkerFactory.TAG = r0
            return
    }

    public WorkerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.work.WorkerFactory getDefaultWorkerFactory() {
            androidx.work.WorkerFactory$1 r0 = new androidx.work.WorkerFactory$1
            r0.<init>()
            return r0
    }

    public abstract androidx.work.ListenableWorker createWorker(android.content.Context r1, java.lang.String r2, androidx.work.WorkerParameters r3);

    public final androidx.work.ListenableWorker createWorkerWithDefaultFallback(android.content.Context r11, java.lang.String r12, androidx.work.WorkerParameters r13) {
            r10 = this;
            androidx.work.ListenableWorker r0 = r10.createWorker(r11, r12, r13)
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L71
            r4 = 0
            java.lang.Class r5 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L15
            java.lang.Class<androidx.work.ListenableWorker> r6 = androidx.work.ListenableWorker.class
            java.lang.Class r4 = r5.asSubclass(r6)     // Catch: java.lang.Throwable -> L15
            goto L34
        L15:
            r5 = move-exception
            androidx.work.Logger r6 = androidx.work.Logger.get()
            java.lang.String r7 = androidx.work.WorkerFactory.TAG
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Invalid class: "
            r8.append(r9)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            java.lang.Throwable[] r9 = new java.lang.Throwable[r2]
            r9[r3] = r5
            r6.error(r7, r8, r9)
        L34:
            if (r4 == 0) goto L71
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L52
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r3] = r6     // Catch: java.lang.Throwable -> L52
            java.lang.Class<androidx.work.WorkerParameters> r6 = androidx.work.WorkerParameters.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L52
            r5[r3] = r11     // Catch: java.lang.Throwable -> L52
            r5[r2] = r13     // Catch: java.lang.Throwable -> L52
            java.lang.Object r11 = r4.newInstance(r5)     // Catch: java.lang.Throwable -> L52
            androidx.work.ListenableWorker r11 = (androidx.work.ListenableWorker) r11     // Catch: java.lang.Throwable -> L52
            r0 = r11
            goto L71
        L52:
            r11 = move-exception
            androidx.work.Logger r13 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.WorkerFactory.TAG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Could not instantiate "
            r5.append(r6)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            java.lang.Throwable[] r6 = new java.lang.Throwable[r2]
            r6[r3] = r11
            r13.error(r4, r5, r6)
        L71:
            if (r0 == 0) goto L94
            boolean r11 = r0.isUsed()
            if (r11 != 0) goto L7a
            goto L94
        L7a:
            java.lang.Class r11 = r10.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.Object[] r13 = new java.lang.Object[r1]
            r13[r3] = r11
            r13[r2] = r12
            java.lang.String r11 = "WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."
            java.lang.String r11 = java.lang.String.format(r11, r13)
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r11)
            throw r12
        L94:
            return r0
    }
}
