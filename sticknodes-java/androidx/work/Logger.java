package androidx.work;

/* loaded from: classes.dex */
public abstract class Logger {
    private static final int MAX_PREFIXED_TAG_LENGTH = 20;
    private static androidx.work.Logger sLogger;

    public static class LogcatLogger extends androidx.work.Logger {
        private int mLoggingLevel;

        public LogcatLogger(int r1) {
                r0 = this;
                r0.<init>(r1)
                r0.mLoggingLevel = r1
                return
        }

        @Override // androidx.work.Logger
        public void debug(java.lang.String r3, java.lang.String r4, java.lang.Throwable... r5) {
                r2 = this;
                int r0 = r2.mLoggingLevel
                r1 = 3
                if (r0 > r1) goto L15
                if (r5 == 0) goto L12
                int r0 = r5.length
                r1 = 1
                if (r0 < r1) goto L12
                r0 = 0
                r5 = r5[r0]
                android.util.Log.d(r3, r4, r5)
                goto L15
            L12:
                android.util.Log.d(r3, r4)
            L15:
                return
        }

        @Override // androidx.work.Logger
        public void error(java.lang.String r3, java.lang.String r4, java.lang.Throwable... r5) {
                r2 = this;
                int r0 = r2.mLoggingLevel
                r1 = 6
                if (r0 > r1) goto L15
                if (r5 == 0) goto L12
                int r0 = r5.length
                r1 = 1
                if (r0 < r1) goto L12
                r0 = 0
                r5 = r5[r0]
                android.util.Log.e(r3, r4, r5)
                goto L15
            L12:
                android.util.Log.e(r3, r4)
            L15:
                return
        }

        @Override // androidx.work.Logger
        public void info(java.lang.String r3, java.lang.String r4, java.lang.Throwable... r5) {
                r2 = this;
                int r0 = r2.mLoggingLevel
                r1 = 4
                if (r0 > r1) goto L15
                if (r5 == 0) goto L12
                int r0 = r5.length
                r1 = 1
                if (r0 < r1) goto L12
                r0 = 0
                r5 = r5[r0]
                android.util.Log.i(r3, r4, r5)
                goto L15
            L12:
                android.util.Log.i(r3, r4)
            L15:
                return
        }

        @Override // androidx.work.Logger
        public void verbose(java.lang.String r3, java.lang.String r4, java.lang.Throwable... r5) {
                r2 = this;
                int r0 = r2.mLoggingLevel
                r1 = 2
                if (r0 > r1) goto L15
                if (r5 == 0) goto L12
                int r0 = r5.length
                r1 = 1
                if (r0 < r1) goto L12
                r0 = 0
                r5 = r5[r0]
                android.util.Log.v(r3, r4, r5)
                goto L15
            L12:
                android.util.Log.v(r3, r4)
            L15:
                return
        }

        @Override // androidx.work.Logger
        public void warning(java.lang.String r3, java.lang.String r4, java.lang.Throwable... r5) {
                r2 = this;
                int r0 = r2.mLoggingLevel
                r1 = 5
                if (r0 > r1) goto L15
                if (r5 == 0) goto L12
                int r0 = r5.length
                r1 = 1
                if (r0 < r1) goto L12
                r0 = 0
                r5 = r5[r0]
                android.util.Log.w(r3, r4, r5)
                goto L15
            L12:
                android.util.Log.w(r3, r4)
            L15:
                return
        }
    }

    static {
            return
    }

    public Logger(int r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized androidx.work.Logger get() {
            java.lang.Class<androidx.work.Logger> r0 = androidx.work.Logger.class
            monitor-enter(r0)
            androidx.work.Logger r1 = androidx.work.Logger.sLogger     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto Lf
            androidx.work.Logger$LogcatLogger r1 = new androidx.work.Logger$LogcatLogger     // Catch: java.lang.Throwable -> L13
            r2 = 3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            androidx.work.Logger.sLogger = r1     // Catch: java.lang.Throwable -> L13
        Lf:
            androidx.work.Logger r1 = androidx.work.Logger.sLogger     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r1
        L13:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static synchronized void setLogger(androidx.work.Logger r1) {
            java.lang.Class<androidx.work.Logger> r0 = androidx.work.Logger.class
            monitor-enter(r0)
            androidx.work.Logger.sLogger = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static java.lang.String tagWithPrefix(java.lang.String r3) {
            int r0 = r3.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 23
            r1.<init>(r2)
            java.lang.String r2 = "WM-"
            r1.append(r2)
            int r2 = androidx.work.Logger.MAX_PREFIXED_TAG_LENGTH
            if (r0 < r2) goto L1d
            r0 = 0
            java.lang.String r3 = r3.substring(r0, r2)
            r1.append(r3)
            goto L20
        L1d:
            r1.append(r3)
        L20:
            java.lang.String r3 = r1.toString()
            return r3
    }

    public abstract void debug(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3);

    public abstract void error(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3);

    public abstract void info(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3);

    public abstract void verbose(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3);

    public abstract void warning(java.lang.String r1, java.lang.String r2, java.lang.Throwable... r3);
}
