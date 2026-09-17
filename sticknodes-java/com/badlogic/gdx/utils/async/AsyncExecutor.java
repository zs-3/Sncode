package com.badlogic.gdx.utils.async;

/* loaded from: classes.dex */
public class AsyncExecutor implements com.badlogic.gdx.utils.Disposable {
    private final java.util.concurrent.ExecutorService executor;



    public AsyncExecutor(int r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.utils.async.AsyncExecutor$1 r0 = new com.badlogic.gdx.utils.async.AsyncExecutor$1
            r0.<init>(r1, r3)
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newFixedThreadPool(r2, r0)
            r1.executor = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            java.util.concurrent.ExecutorService r0 = r4.executor
            r0.shutdown()
            java.util.concurrent.ExecutorService r0 = r4.executor     // Catch: java.lang.InterruptedException -> L12
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L12
            r0.awaitTermination(r1, r3)     // Catch: java.lang.InterruptedException -> L12
            return
        L12:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r2 = "Couldn't shutdown loading thread"
            r1.<init>(r2, r0)
            throw r1
    }

    public <T> com.badlogic.gdx.utils.async.AsyncResult<T> submit(com.badlogic.gdx.utils.async.AsyncTask<T> r4) {
            r3 = this;
            java.util.concurrent.ExecutorService r0 = r3.executor
            boolean r0 = r0.isShutdown()
            if (r0 != 0) goto L19
            com.badlogic.gdx.utils.async.AsyncResult r0 = new com.badlogic.gdx.utils.async.AsyncResult
            java.util.concurrent.ExecutorService r1 = r3.executor
            com.badlogic.gdx.utils.async.AsyncExecutor$2 r2 = new com.badlogic.gdx.utils.async.AsyncExecutor$2
            r2.<init>(r3, r4)
            java.util.concurrent.Future r4 = r1.submit(r2)
            r0.<init>(r4)
            return r0
        L19:
            com.badlogic.gdx.utils.GdxRuntimeException r4 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "Cannot run tasks on an executor that has been shutdown (disposed)"
            r4.<init>(r0)
            throw r4
    }
}
