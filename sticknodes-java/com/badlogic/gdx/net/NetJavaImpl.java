package com.badlogic.gdx.net;

/* loaded from: classes.dex */
public class NetJavaImpl {
    final com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Net.HttpRequest, java.net.HttpURLConnection> connections;
    private final java.util.concurrent.ThreadPoolExecutor executorService;
    final com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Net.HttpRequest, com.badlogic.gdx.Net.HttpResponseListener> listeners;
    final com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Net.HttpRequest, java.util.concurrent.Future<?>> tasks;


    public NetJavaImpl(int r13) {
            r12 = this;
            r12.<init>()
            r0 = 1
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 != r2) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            java.util.concurrent.ThreadPoolExecutor r11 = new java.util.concurrent.ThreadPoolExecutor
            if (r2 == 0) goto L13
            r4 = 0
            goto L14
        L13:
            r4 = r13
        L14:
            r6 = 60
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            if (r2 == 0) goto L20
            java.util.concurrent.SynchronousQueue r1 = new java.util.concurrent.SynchronousQueue
            r1.<init>()
            goto L25
        L20:
            java.util.concurrent.LinkedBlockingQueue r1 = new java.util.concurrent.LinkedBlockingQueue
            r1.<init>()
        L25:
            r9 = r1
            com.badlogic.gdx.net.NetJavaImpl$1 r10 = new com.badlogic.gdx.net.NetJavaImpl$1
            r10.<init>(r12)
            r3 = r11
            r5 = r13
            r3.<init>(r4, r5, r6, r8, r9, r10)
            r12.executorService = r11
            r13 = r2 ^ 1
            r11.allowCoreThreadTimeOut(r13)
            com.badlogic.gdx.utils.ObjectMap r13 = new com.badlogic.gdx.utils.ObjectMap
            r13.<init>()
            r12.connections = r13
            com.badlogic.gdx.utils.ObjectMap r13 = new com.badlogic.gdx.utils.ObjectMap
            r13.<init>()
            r12.listeners = r13
            com.badlogic.gdx.utils.ObjectMap r13 = new com.badlogic.gdx.utils.ObjectMap
            r13.<init>()
            r12.tasks = r13
            return
    }

    private void cancelTask(com.badlogic.gdx.Net.HttpRequest r2) {
            r1 = this;
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Net$HttpRequest, java.util.concurrent.Future<?>> r0 = r1.tasks
            java.lang.Object r2 = r0.get(r2)
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            if (r2 == 0) goto Le
            r0 = 0
            r2.cancel(r0)
        Le:
            return
    }

    public void cancelHttpRequest(com.badlogic.gdx.Net.HttpRequest r2) {
            r1 = this;
            com.badlogic.gdx.Net$HttpResponseListener r0 = r1.getFromListeners(r2)
            if (r0 == 0) goto Lf
            r0.cancelled()
            r1.cancelTask(r2)
            r1.removeFromConnectionsAndListeners(r2)
        Lf:
            return
    }

    synchronized com.badlogic.gdx.Net.HttpResponseListener getFromListeners(com.badlogic.gdx.Net.HttpRequest r2) {
            r1 = this;
            monitor-enter(r1)
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Net$HttpRequest, com.badlogic.gdx.Net$HttpResponseListener> r0 = r1.listeners     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb
            com.badlogic.gdx.Net$HttpResponseListener r2 = (com.badlogic.gdx.Net.HttpResponseListener) r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    synchronized void removeFromConnectionsAndListeners(com.badlogic.gdx.Net.HttpRequest r2) {
            r1 = this;
            monitor-enter(r1)
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Net$HttpRequest, java.net.HttpURLConnection> r0 = r1.connections     // Catch: java.lang.Throwable -> L12
            r0.remove(r2)     // Catch: java.lang.Throwable -> L12
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Net$HttpRequest, com.badlogic.gdx.Net$HttpResponseListener> r0 = r1.listeners     // Catch: java.lang.Throwable -> L12
            r0.remove(r2)     // Catch: java.lang.Throwable -> L12
            com.badlogic.gdx.utils.ObjectMap<com.badlogic.gdx.Net$HttpRequest, java.util.concurrent.Future<?>> r0 = r1.tasks     // Catch: java.lang.Throwable -> L12
            r0.remove(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public void sendHttpRequest(com.badlogic.gdx.Net.HttpRequest r1, com.badlogic.gdx.Net.HttpResponseListener r2) {
            r0 = this;
            r1 = 0
            throw r1
    }
}
