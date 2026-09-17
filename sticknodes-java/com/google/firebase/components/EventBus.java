package com.google.firebase.components;

/* loaded from: classes2.dex */
class EventBus implements com.google.firebase.events.Subscriber, com.google.firebase.events.Publisher {
    private final java.util.concurrent.Executor defaultExecutor;
    private final java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> handlerMap;
    private java.util.Queue<com.google.firebase.events.Event<?>> pendingEvents;

    public static /* synthetic */ void $r8$lambda$_CMgUGVhhqkeRvGUrALJVsHZDM4(java.util.Map.Entry r0, com.google.firebase.events.Event r1) {
            lambda$publish$0(r0, r1)
            return
    }

    EventBus(java.util.concurrent.Executor r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.handlerMap = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.pendingEvents = r0
            r1.defaultExecutor = r2
            return
    }

    private synchronized java.util.Set<java.util.Map.Entry<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> getHandlers(com.google.firebase.events.Event<?> r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.handlerMap     // Catch: java.lang.Throwable -> L1a
            java.lang.Class r2 = r2.getType()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L1a
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L14
            java.util.Set r2 = java.util.Collections.emptySet()     // Catch: java.lang.Throwable -> L1a
            goto L18
        L14:
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r1)
            return r2
        L1a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    private static /* synthetic */ void lambda$publish$0(java.util.Map.Entry r0, com.google.firebase.events.Event r1) {
            java.lang.Object r0 = r0.getKey()
            com.google.firebase.events.EventHandler r0 = (com.google.firebase.events.EventHandler) r0
            r0.handle(r1)
            return
    }

    void enablePublishingAndFlushPending() {
            r2 = this;
            monitor-enter(r2)
            java.util.Queue<com.google.firebase.events.Event<?>> r0 = r2.pendingEvents     // Catch: java.lang.Throwable -> L22
            r1 = 0
            if (r0 == 0) goto L9
            r2.pendingEvents = r1     // Catch: java.lang.Throwable -> L22
            goto La
        L9:
            r0 = r1
        La:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L21
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.google.firebase.events.Event r1 = (com.google.firebase.events.Event) r1
            r2.publish(r1)
            goto L11
        L21:
            return
        L22:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r0
    }

    public void publish(com.google.firebase.events.Event<?> r5) {
            r4 = this;
            com.google.firebase.components.Preconditions.checkNotNull(r5)
            monitor-enter(r4)
            java.util.Queue<com.google.firebase.events.Event<?>> r0 = r4.pendingEvents     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto Ld
            r0.add(r5)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            return
        Ld:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            java.util.Set r0 = r4.getHandlers(r5)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.firebase.components.EventBus$$ExternalSyntheticLambda0 r3 = new com.google.firebase.components.EventBus$$ExternalSyntheticLambda0
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L16
        L31:
            return
        L32:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            throw r5
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void subscribe(java.lang.Class<T> r3, java.util.concurrent.Executor r4, com.google.firebase.events.EventHandler<? super T> r5) {
            r2 = this;
            monitor-enter(r2)
            com.google.firebase.components.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L29
            com.google.firebase.components.Preconditions.checkNotNull(r5)     // Catch: java.lang.Throwable -> L29
            com.google.firebase.components.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L29
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> r0 = r2.handlerMap     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L1c
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> r0 = r2.handlerMap     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L29
        L1c:
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.EventHandler<java.lang.Object>, java.util.concurrent.Executor>> r0 = r2.handlerMap     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch: java.lang.Throwable -> L29
            r3.put(r5, r4)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r2)
            return
        L29:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
