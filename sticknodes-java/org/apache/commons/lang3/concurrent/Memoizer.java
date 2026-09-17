package org.apache.commons.lang3.concurrent;

/* loaded from: classes2.dex */
public class Memoizer<I, O> implements org.apache.commons.lang3.concurrent.Computable<I, O> {
    private final java.util.concurrent.ConcurrentMap<I, java.util.concurrent.Future<O>> cache;
    private final org.apache.commons.lang3.concurrent.Computable<I, O> computable;
    private final boolean recalculate;


    public Memoizer(org.apache.commons.lang3.concurrent.Computable<I, O> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Memoizer(org.apache.commons.lang3.concurrent.Computable<I, O> r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.cache = r0
            r1.computable = r2
            r1.recalculate = r3
            return
    }

    static /* synthetic */ org.apache.commons.lang3.concurrent.Computable access$000(org.apache.commons.lang3.concurrent.Memoizer r0) {
            org.apache.commons.lang3.concurrent.Computable<I, O> r0 = r0.computable
            return r0
    }

    private java.lang.RuntimeException launderException(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L7
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            return r3
        L7:
            boolean r0 = r3 instanceof java.lang.Error
            if (r0 == 0) goto Le
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unchecked exception"
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // org.apache.commons.lang3.concurrent.Computable
    public O compute(I r4) throws java.lang.InterruptedException {
            r3 = this;
        L0:
            java.util.concurrent.ConcurrentMap<I, java.util.concurrent.Future<O>> r0 = r3.cache
            java.lang.Object r0 = r0.get(r4)
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            if (r0 != 0) goto L22
            org.apache.commons.lang3.concurrent.Memoizer$1 r0 = new org.apache.commons.lang3.concurrent.Memoizer$1
            r0.<init>(r3, r4)
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask
            r1.<init>(r0)
            java.util.concurrent.ConcurrentMap<I, java.util.concurrent.Future<O>> r0 = r3.cache
            java.lang.Object r0 = r0.putIfAbsent(r4, r1)
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            if (r0 != 0) goto L22
            r1.run()
            r0 = r1
        L22:
            java.lang.Object r4 = r0.get()     // Catch: java.util.concurrent.ExecutionException -> L27 java.util.concurrent.CancellationException -> L3a
            return r4
        L27:
            r1 = move-exception
            boolean r2 = r3.recalculate
            if (r2 == 0) goto L31
            java.util.concurrent.ConcurrentMap<I, java.util.concurrent.Future<O>> r2 = r3.cache
            r2.remove(r4, r0)
        L31:
            java.lang.Throwable r4 = r1.getCause()
            java.lang.RuntimeException r4 = r3.launderException(r4)
            throw r4
        L3a:
            java.util.concurrent.ConcurrentMap<I, java.util.concurrent.Future<O>> r1 = r3.cache
            r1.remove(r4, r0)
            goto L0
    }
}
