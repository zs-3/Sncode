package com.google.firebase.concurrent;

/* loaded from: classes2.dex */
class CustomThreadFactory implements java.util.concurrent.ThreadFactory {
    private static final java.util.concurrent.ThreadFactory DEFAULT = null;
    private final java.lang.String namePrefix;
    private final android.os.StrictMode.ThreadPolicy policy;
    private final int priority;
    private final java.util.concurrent.atomic.AtomicLong threadCount;

    public static /* synthetic */ void $r8$lambda$25wFMnJXuxCXflRCTG3ggSOiDOE(com.google.firebase.concurrent.CustomThreadFactory r0, java.lang.Runnable r1) {
            r0.lambda$newThread$0(r1)
            return
    }

    static {
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            com.google.firebase.concurrent.CustomThreadFactory.DEFAULT = r0
            return
    }

    CustomThreadFactory(java.lang.String r2, int r3, android.os.StrictMode.ThreadPolicy r4) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.threadCount = r0
            r1.namePrefix = r2
            r1.priority = r3
            r1.policy = r4
            return
    }

    private /* synthetic */ void lambda$newThread$0(java.lang.Runnable r2) {
            r1 = this;
            int r0 = r1.priority
            android.os.Process.setThreadPriority(r0)
            android.os.StrictMode$ThreadPolicy r0 = r1.policy
            if (r0 == 0) goto Lc
            android.os.StrictMode.setThreadPolicy(r0)
        Lc:
            r2.run()
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r5) {
            r4 = this;
            java.util.concurrent.ThreadFactory r0 = com.google.firebase.concurrent.CustomThreadFactory.DEFAULT
            com.google.firebase.concurrent.CustomThreadFactory$$ExternalSyntheticLambda0 r1 = new com.google.firebase.concurrent.CustomThreadFactory$$ExternalSyntheticLambda0
            r1.<init>(r4, r5)
            java.lang.Thread r5 = r0.newThread(r1)
            java.util.Locale r0 = java.util.Locale.ROOT
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r4.namePrefix
            r3 = 0
            r1[r3] = r2
            java.util.concurrent.atomic.AtomicLong r2 = r4.threadCount
            long r2 = r2.getAndIncrement()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "%s Thread #%d"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            r5.setName(r0)
            return r5
    }
}
