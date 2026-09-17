package org.apache.commons.lang3.concurrent;

/* loaded from: classes2.dex */
public class MultiBackgroundInitializer extends org.apache.commons.lang3.concurrent.BackgroundInitializer<org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults> {
    private final java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> childInitializers;

    /* renamed from: org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class MultiBackgroundInitializerResults {
        private final java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException> exceptions;
        private final java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> initializers;
        private final java.util.Map<java.lang.String, java.lang.Object> resultObjects;

        private MultiBackgroundInitializerResults(java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r1, java.util.Map<java.lang.String, java.lang.Object> r2, java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException> r3) {
                r0 = this;
                r0.<init>()
                r0.initializers = r1
                r0.resultObjects = r2
                r0.exceptions = r3
                return
        }

        /* synthetic */ MultiBackgroundInitializerResults(java.util.Map r1, java.util.Map r2, java.util.Map r3, org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        private org.apache.commons.lang3.concurrent.BackgroundInitializer<?> checkName(java.lang.String r4) {
                r3 = this;
                java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r0 = r3.initializers
                java.lang.Object r0 = r0.get(r4)
                org.apache.commons.lang3.concurrent.BackgroundInitializer r0 = (org.apache.commons.lang3.concurrent.BackgroundInitializer) r0
                if (r0 == 0) goto Lb
                return r0
            Lb:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "No child initializer with name "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public org.apache.commons.lang3.concurrent.ConcurrentException getException(java.lang.String r2) {
                r1 = this;
                r1.checkName(r2)
                java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException> r0 = r1.exceptions
                java.lang.Object r2 = r0.get(r2)
                org.apache.commons.lang3.concurrent.ConcurrentException r2 = (org.apache.commons.lang3.concurrent.ConcurrentException) r2
                return r2
        }

        public org.apache.commons.lang3.concurrent.BackgroundInitializer<?> getInitializer(java.lang.String r1) {
                r0 = this;
                org.apache.commons.lang3.concurrent.BackgroundInitializer r1 = r0.checkName(r1)
                return r1
        }

        public java.lang.Object getResultObject(java.lang.String r2) {
                r1 = this;
                r1.checkName(r2)
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.resultObjects
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        public java.util.Set<java.lang.String> initializerNames() {
                r1 = this;
                java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r0 = r1.initializers
                java.util.Set r0 = r0.keySet()
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                return r0
        }

        public boolean isException(java.lang.String r2) {
                r1 = this;
                r1.checkName(r2)
                java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException> r0 = r1.exceptions
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        public boolean isSuccessful() {
                r1 = this;
                java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.ConcurrentException> r0 = r1.exceptions
                boolean r0 = r0.isEmpty()
                return r0
        }
    }

    public MultiBackgroundInitializer() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.childInitializers = r0
            return
    }

    public MultiBackgroundInitializer(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.childInitializers = r1
            return
    }

    public void addInitializer(java.lang.String r6, org.apache.commons.lang3.concurrent.BackgroundInitializer<?> r7) {
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.String r3 = "Name of child initializer must not be null!"
            java.lang.Object[] r4 = new java.lang.Object[r1]
            org.apache.commons.lang3.Validate.isTrue(r2, r3, r4)
            if (r7 == 0) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.String r2 = "Child initializer must not be null!"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            org.apache.commons.lang3.Validate.isTrue(r0, r2, r1)
            monitor-enter(r5)
            boolean r0 = r5.isStarted()     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L27
            java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r0 = r5.childInitializers     // Catch: java.lang.Throwable -> L2f
            r0.put(r6, r7)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
            return
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = "addInitializer() must not be called after start()!"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            throw r6     // Catch: java.lang.Throwable -> L2f
        L2f:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
            throw r6
    }

    @Override // org.apache.commons.lang3.concurrent.BackgroundInitializer
    protected int getTaskCount() {
            r3 = this;
            java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r0 = r3.childInitializers
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r0.next()
            org.apache.commons.lang3.concurrent.BackgroundInitializer r2 = (org.apache.commons.lang3.concurrent.BackgroundInitializer) r2
            int r2 = r2.getTaskCount()
            int r1 = r1 + r2
            goto Lb
        L1d:
            return r1
    }

    @Override // org.apache.commons.lang3.concurrent.BackgroundInitializer
    protected /* bridge */ /* synthetic */ org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults initialize() throws java.lang.Exception {
            r1 = this;
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults r0 = r1.initialize2()
            return r0
    }

    @Override // org.apache.commons.lang3.concurrent.BackgroundInitializer
    /* renamed from: initialize, reason: avoid collision after fix types in other method */
    protected org.apache.commons.lang3.concurrent.MultiBackgroundInitializer.MultiBackgroundInitializerResults initialize2() throws java.lang.Exception {
            r7 = this;
            monitor-enter(r7)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L72
            java.util.Map<java.lang.String, org.apache.commons.lang3.concurrent.BackgroundInitializer<?>> r1 = r7.childInitializers     // Catch: java.lang.Throwable -> L72
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L72
            java.util.concurrent.ExecutorService r1 = r7.getActiveExecutor()
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.next()
            org.apache.commons.lang3.concurrent.BackgroundInitializer r3 = (org.apache.commons.lang3.concurrent.BackgroundInitializer) r3
            java.util.concurrent.ExecutorService r4 = r3.getExternalExecutor()
            if (r4 != 0) goto L2a
            r3.setExternalExecutor(r1)
        L2a:
            r3.start()
            goto L15
        L2e:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Set r3 = r0.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L40:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()     // Catch: org.apache.commons.lang3.concurrent.ConcurrentException -> L60
            java.lang.String r5 = (java.lang.String) r5     // Catch: org.apache.commons.lang3.concurrent.ConcurrentException -> L60
            java.lang.Object r6 = r4.getValue()     // Catch: org.apache.commons.lang3.concurrent.ConcurrentException -> L60
            org.apache.commons.lang3.concurrent.BackgroundInitializer r6 = (org.apache.commons.lang3.concurrent.BackgroundInitializer) r6     // Catch: org.apache.commons.lang3.concurrent.ConcurrentException -> L60
            java.lang.Object r6 = r6.get()     // Catch: org.apache.commons.lang3.concurrent.ConcurrentException -> L60
            r1.put(r5, r6)     // Catch: org.apache.commons.lang3.concurrent.ConcurrentException -> L60
            goto L40
        L60:
            r5 = move-exception
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r2.put(r4, r5)
            goto L40
        L6b:
            org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults r3 = new org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults
            r4 = 0
            r3.<init>(r0, r1, r2, r4)
            return r3
        L72:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L72
            throw r0
    }
}
