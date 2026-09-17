package org.apache.commons.lang3.time;

/* loaded from: classes2.dex */
public class StopWatch {
    private static final long NANO_2_MILLIS = 1000000;
    private org.apache.commons.lang3.time.StopWatch.State runningState;
    private org.apache.commons.lang3.time.StopWatch.SplitState splitState;
    private long startTime;
    private long startTimeMillis;
    private long stopTime;

    /* renamed from: org.apache.commons.lang3.time.StopWatch$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private enum SplitState extends java.lang.Enum<org.apache.commons.lang3.time.StopWatch.SplitState> {
        private static final /* synthetic */ org.apache.commons.lang3.time.StopWatch.SplitState[] $VALUES = null;
        public static final org.apache.commons.lang3.time.StopWatch.SplitState SPLIT = null;
        public static final org.apache.commons.lang3.time.StopWatch.SplitState UNSPLIT = null;

        static {
                org.apache.commons.lang3.time.StopWatch$SplitState r0 = new org.apache.commons.lang3.time.StopWatch$SplitState
                java.lang.String r1 = "SPLIT"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.lang3.time.StopWatch.SplitState.SPLIT = r0
                org.apache.commons.lang3.time.StopWatch$SplitState r1 = new org.apache.commons.lang3.time.StopWatch$SplitState
                java.lang.String r3 = "UNSPLIT"
                r4 = 1
                r1.<init>(r3, r4)
                org.apache.commons.lang3.time.StopWatch.SplitState.UNSPLIT = r1
                r3 = 2
                org.apache.commons.lang3.time.StopWatch$SplitState[] r3 = new org.apache.commons.lang3.time.StopWatch.SplitState[r3]
                r3[r2] = r0
                r3[r4] = r1
                org.apache.commons.lang3.time.StopWatch.SplitState.$VALUES = r3
                return
        }

        SplitState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.lang3.time.StopWatch.SplitState valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.time.StopWatch$SplitState> r0 = org.apache.commons.lang3.time.StopWatch.SplitState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.time.StopWatch$SplitState r1 = (org.apache.commons.lang3.time.StopWatch.SplitState) r1
                return r1
        }

        public static org.apache.commons.lang3.time.StopWatch.SplitState[] values() {
                org.apache.commons.lang3.time.StopWatch$SplitState[] r0 = org.apache.commons.lang3.time.StopWatch.SplitState.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.time.StopWatch$SplitState[] r0 = (org.apache.commons.lang3.time.StopWatch.SplitState[]) r0
                return r0
        }
    }

    private enum State extends java.lang.Enum<org.apache.commons.lang3.time.StopWatch.State> {
        private static final /* synthetic */ org.apache.commons.lang3.time.StopWatch.State[] $VALUES = null;
        public static final org.apache.commons.lang3.time.StopWatch.State RUNNING = null;
        public static final org.apache.commons.lang3.time.StopWatch.State STOPPED = null;
        public static final org.apache.commons.lang3.time.StopWatch.State SUSPENDED = null;
        public static final org.apache.commons.lang3.time.StopWatch.State UNSTARTED = null;





        static {
                org.apache.commons.lang3.time.StopWatch$State$1 r0 = new org.apache.commons.lang3.time.StopWatch$State$1
                java.lang.String r1 = "UNSTARTED"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.lang3.time.StopWatch.State.UNSTARTED = r0
                org.apache.commons.lang3.time.StopWatch$State$2 r1 = new org.apache.commons.lang3.time.StopWatch$State$2
                java.lang.String r3 = "RUNNING"
                r4 = 1
                r1.<init>(r3, r4)
                org.apache.commons.lang3.time.StopWatch.State.RUNNING = r1
                org.apache.commons.lang3.time.StopWatch$State$3 r3 = new org.apache.commons.lang3.time.StopWatch$State$3
                java.lang.String r5 = "STOPPED"
                r6 = 2
                r3.<init>(r5, r6)
                org.apache.commons.lang3.time.StopWatch.State.STOPPED = r3
                org.apache.commons.lang3.time.StopWatch$State$4 r5 = new org.apache.commons.lang3.time.StopWatch$State$4
                java.lang.String r7 = "SUSPENDED"
                r8 = 3
                r5.<init>(r7, r8)
                org.apache.commons.lang3.time.StopWatch.State.SUSPENDED = r5
                r7 = 4
                org.apache.commons.lang3.time.StopWatch$State[] r7 = new org.apache.commons.lang3.time.StopWatch.State[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                org.apache.commons.lang3.time.StopWatch.State.$VALUES = r7
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ State(java.lang.String r1, int r2, org.apache.commons.lang3.time.StopWatch.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.lang3.time.StopWatch.State valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.time.StopWatch$State> r0 = org.apache.commons.lang3.time.StopWatch.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.time.StopWatch$State r1 = (org.apache.commons.lang3.time.StopWatch.State) r1
                return r1
        }

        public static org.apache.commons.lang3.time.StopWatch.State[] values() {
                org.apache.commons.lang3.time.StopWatch$State[] r0 = org.apache.commons.lang3.time.StopWatch.State.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.time.StopWatch$State[] r0 = (org.apache.commons.lang3.time.StopWatch.State[]) r0
                return r0
        }

        abstract boolean isStarted();

        abstract boolean isStopped();

        abstract boolean isSuspended();
    }

    public StopWatch() {
            r1 = this;
            r1.<init>()
            org.apache.commons.lang3.time.StopWatch$State r0 = org.apache.commons.lang3.time.StopWatch.State.UNSTARTED
            r1.runningState = r0
            org.apache.commons.lang3.time.StopWatch$SplitState r0 = org.apache.commons.lang3.time.StopWatch.SplitState.UNSPLIT
            r1.splitState = r0
            return
    }

    public static org.apache.commons.lang3.time.StopWatch createStarted() {
            org.apache.commons.lang3.time.StopWatch r0 = new org.apache.commons.lang3.time.StopWatch
            r0.<init>()
            r0.start()
            return r0
    }

    public long getNanoTime() {
            r4 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r4.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.STOPPED
            if (r0 == r1) goto L26
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.SUSPENDED
            if (r0 != r1) goto Lb
            goto L26
        Lb:
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.UNSTARTED
            if (r0 != r1) goto L12
            r0 = 0
            return r0
        L12:
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.RUNNING
            if (r0 != r1) goto L1e
            long r0 = java.lang.System.nanoTime()
            long r2 = r4.startTime
        L1c:
            long r0 = r0 - r2
            return r0
        L1e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Illegal running state has occurred."
            r0.<init>(r1)
            throw r0
        L26:
            long r0 = r4.stopTime
            long r2 = r4.startTime
            goto L1c
    }

    public long getSplitNanoTime() {
            r4 = this;
            org.apache.commons.lang3.time.StopWatch$SplitState r0 = r4.splitState
            org.apache.commons.lang3.time.StopWatch$SplitState r1 = org.apache.commons.lang3.time.StopWatch.SplitState.SPLIT
            if (r0 != r1) goto Lc
            long r0 = r4.stopTime
            long r2 = r4.startTime
            long r0 = r0 - r2
            return r0
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch must be split to get the split time. "
            r0.<init>(r1)
            throw r0
    }

    public long getSplitTime() {
            r4 = this;
            long r0 = r4.getSplitNanoTime()
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            return r0
    }

    public long getStartTime() {
            r2 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r2.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.UNSTARTED
            if (r0 == r1) goto L9
            long r0 = r2.startTimeMillis
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch has not been started"
            r0.<init>(r1)
            throw r0
    }

    public long getTime() {
            r4 = this;
            long r0 = r4.getNanoTime()
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            return r0
    }

    public long getTime(java.util.concurrent.TimeUnit r4) {
            r3 = this;
            long r0 = r3.getNanoTime()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r4.convert(r0, r2)
            return r0
    }

    public boolean isStarted() {
            r1 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r1.runningState
            boolean r0 = r0.isStarted()
            return r0
    }

    public boolean isStopped() {
            r1 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r1.runningState
            boolean r0 = r0.isStopped()
            return r0
    }

    public boolean isSuspended() {
            r1 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r1.runningState
            boolean r0 = r0.isSuspended()
            return r0
    }

    public void reset() {
            r1 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = org.apache.commons.lang3.time.StopWatch.State.UNSTARTED
            r1.runningState = r0
            org.apache.commons.lang3.time.StopWatch$SplitState r0 = org.apache.commons.lang3.time.StopWatch.SplitState.UNSPLIT
            r1.splitState = r0
            return
    }

    public void resume() {
            r6 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r6.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.SUSPENDED
            if (r0 != r1) goto L17
            long r0 = r6.startTime
            long r2 = java.lang.System.nanoTime()
            long r4 = r6.stopTime
            long r2 = r2 - r4
            long r0 = r0 + r2
            r6.startTime = r0
            org.apache.commons.lang3.time.StopWatch$State r0 = org.apache.commons.lang3.time.StopWatch.State.RUNNING
            r6.runningState = r0
            return
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch must be suspended to resume. "
            r0.<init>(r1)
            throw r0
    }

    public void split() {
            r2 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r2.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.RUNNING
            if (r0 != r1) goto L11
            long r0 = java.lang.System.nanoTime()
            r2.stopTime = r0
            org.apache.commons.lang3.time.StopWatch$SplitState r0 = org.apache.commons.lang3.time.StopWatch.SplitState.SPLIT
            r2.splitState = r0
            return
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch is not running. "
            r0.<init>(r1)
            throw r0
    }

    public void start() {
            r2 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r2.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.STOPPED
            if (r0 == r1) goto L23
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.UNSTARTED
            if (r0 != r1) goto L1b
            long r0 = java.lang.System.nanoTime()
            r2.startTime = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.startTimeMillis = r0
            org.apache.commons.lang3.time.StopWatch$State r0 = org.apache.commons.lang3.time.StopWatch.State.RUNNING
            r2.runningState = r0
            return
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch already started. "
            r0.<init>(r1)
            throw r0
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch must be reset before being restarted. "
            r0.<init>(r1)
            throw r0
    }

    public void stop() {
            r3 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r3.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.RUNNING
            if (r0 == r1) goto L13
            org.apache.commons.lang3.time.StopWatch$State r2 = org.apache.commons.lang3.time.StopWatch.State.SUSPENDED
            if (r0 != r2) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch is not running. "
            r0.<init>(r1)
            throw r0
        L13:
            if (r0 != r1) goto L1b
            long r0 = java.lang.System.nanoTime()
            r3.stopTime = r0
        L1b:
            org.apache.commons.lang3.time.StopWatch$State r0 = org.apache.commons.lang3.time.StopWatch.State.STOPPED
            r3.runningState = r0
            return
    }

    public void suspend() {
            r2 = this;
            org.apache.commons.lang3.time.StopWatch$State r0 = r2.runningState
            org.apache.commons.lang3.time.StopWatch$State r1 = org.apache.commons.lang3.time.StopWatch.State.RUNNING
            if (r0 != r1) goto L11
            long r0 = java.lang.System.nanoTime()
            r2.stopTime = r0
            org.apache.commons.lang3.time.StopWatch$State r0 = org.apache.commons.lang3.time.StopWatch.State.SUSPENDED
            r2.runningState = r0
            return
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch must be running to suspend. "
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toSplitString() {
            r2 = this;
            long r0 = r2.getSplitTime()
            java.lang.String r0 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.getTime()
            java.lang.String r0 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(r0)
            return r0
    }

    public void unsplit() {
            r2 = this;
            org.apache.commons.lang3.time.StopWatch$SplitState r0 = r2.splitState
            org.apache.commons.lang3.time.StopWatch$SplitState r1 = org.apache.commons.lang3.time.StopWatch.SplitState.SPLIT
            if (r0 != r1) goto Lb
            org.apache.commons.lang3.time.StopWatch$SplitState r0 = org.apache.commons.lang3.time.StopWatch.SplitState.UNSPLIT
            r2.splitState = r0
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Stopwatch has not been split. "
            r0.<init>(r1)
            throw r0
    }
}
