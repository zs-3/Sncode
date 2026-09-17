package androidx.work;

/* loaded from: classes.dex */
public interface Operation {

    @android.annotation.SuppressLint({"SyntheticAccessor"})
    public static final androidx.work.Operation.State.IN_PROGRESS IN_PROGRESS = null;

    @android.annotation.SuppressLint({"SyntheticAccessor"})
    public static final androidx.work.Operation.State.SUCCESS SUCCESS = null;

    /* renamed from: androidx.work.Operation$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static abstract class State {

        public static final class FAILURE extends androidx.work.Operation.State {
            private final java.lang.Throwable mThrowable;

            public FAILURE(java.lang.Throwable r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mThrowable = r1
                    return
            }

            public java.lang.Throwable getThrowable() {
                    r1 = this;
                    java.lang.Throwable r0 = r1.mThrowable
                    return r0
            }

            public java.lang.String toString() {
                    r3 = this;
                    r0 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    java.lang.Throwable r1 = r3.mThrowable
                    java.lang.String r1 = r1.getMessage()
                    r2 = 0
                    r0[r2] = r1
                    java.lang.String r1 = "FAILURE (%s)"
                    java.lang.String r0 = java.lang.String.format(r1, r0)
                    return r0
            }
        }

        public static final class IN_PROGRESS extends androidx.work.Operation.State {
            private IN_PROGRESS() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ IN_PROGRESS(androidx.work.Operation.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "IN_PROGRESS"
                    return r0
            }
        }

        public static final class SUCCESS extends androidx.work.Operation.State {
            private SUCCESS() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ SUCCESS(androidx.work.Operation.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.lang.String toString() {
                    r1 = this;
                    java.lang.String r0 = "SUCCESS"
                    return r0
            }
        }

        State() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            androidx.work.Operation$State$SUCCESS r0 = new androidx.work.Operation$State$SUCCESS
            r1 = 0
            r0.<init>(r1)
            androidx.work.Operation.SUCCESS = r0
            androidx.work.Operation$State$IN_PROGRESS r0 = new androidx.work.Operation$State$IN_PROGRESS
            r0.<init>(r1)
            androidx.work.Operation.IN_PROGRESS = r0
            return
    }
}
