package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class Timer {
    static com.badlogic.gdx.utils.Timer.TimerThread thread;
    static final java.lang.Object threadLock = null;
    final com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer.Task> tasks;

    public static abstract class Task implements java.lang.Runnable {
        final com.badlogic.gdx.Application app;
        long executeTimeMillis;
        long intervalMillis;
        int repeatCount;
        volatile com.badlogic.gdx.utils.Timer timer;

        public Task() {
                r2 = this;
                r2.<init>()
                com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
                r2.app = r0
                if (r0 == 0) goto La
                return
            La:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Gdx.app not available."
                r0.<init>(r1)
                throw r0
        }

        public void cancel() {
                r4 = this;
                com.badlogic.gdx.utils.Timer r0 = r4.timer
                r1 = 0
                r2 = 0
                if (r0 == 0) goto L1c
                monitor-enter(r0)
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L19
                r4.executeTimeMillis = r2     // Catch: java.lang.Throwable -> L16
                r4.timer = r1     // Catch: java.lang.Throwable -> L16
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer$Task> r1 = r0.tasks     // Catch: java.lang.Throwable -> L16
                r2 = 1
                r1.removeValue(r4, r2)     // Catch: java.lang.Throwable -> L16
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L16
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L22
            L16:
                r1 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L16
                throw r1     // Catch: java.lang.Throwable -> L19
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1
            L1c:
                monitor-enter(r4)
                r4.executeTimeMillis = r2     // Catch: java.lang.Throwable -> L23
                r4.timer = r1     // Catch: java.lang.Throwable -> L23
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
            L22:
                return
            L23:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
                throw r0
        }

        public boolean isScheduled() {
                r1 = this;
                com.badlogic.gdx.utils.Timer r0 = r1.timer
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }
    }

    static class TimerThread implements java.lang.Runnable, com.badlogic.gdx.LifecycleListener {
        final com.badlogic.gdx.Application app;
        final com.badlogic.gdx.Files files;
        com.badlogic.gdx.utils.Timer instance;
        final com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer> instances;
        long pauseTimeMillis;

        public TimerThread() {
                r3 = this;
                r3.<init>()
                com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
                r1 = 1
                r0.<init>(r1)
                r3.instances = r0
                com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
                r3.files = r0
                com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
                r3.app = r0
                r0.addLifecycleListener(r3)
                r3.resume()
                java.lang.Thread r0 = new java.lang.Thread
                java.lang.String r2 = "Timer"
                r0.<init>(r3, r2)
                r0.setDaemon(r1)
                r0.start()
                return
        }

        @Override // com.badlogic.gdx.LifecycleListener
        public void dispose() {
                r2 = this;
                java.lang.Object r0 = com.badlogic.gdx.utils.Timer.threadLock
                monitor-enter(r0)
                com.badlogic.gdx.utils.Timer$TimerThread r1 = com.badlogic.gdx.utils.Timer.thread     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto La
                r1 = 0
                com.badlogic.gdx.utils.Timer.thread = r1     // Catch: java.lang.Throwable -> L19
            La:
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer> r1 = r2.instances     // Catch: java.lang.Throwable -> L19
                r1.clear()     // Catch: java.lang.Throwable -> L19
                r0.notifyAll()     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                com.badlogic.gdx.Application r0 = r2.app
                r0.removeLifecycleListener(r2)
                return
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1
        }

        @Override // com.badlogic.gdx.LifecycleListener
        public void pause() {
                r5 = this;
                java.lang.Object r0 = com.badlogic.gdx.utils.Timer.threadLock
                monitor-enter(r0)
                long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L12
                r3 = 1000000(0xf4240, double:4.940656E-318)
                long r1 = r1 / r3
                r5.pauseTimeMillis = r1     // Catch: java.lang.Throwable -> L12
                r0.notifyAll()     // Catch: java.lang.Throwable -> L12
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                return
            L12:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
                throw r1
        }

        @Override // com.badlogic.gdx.LifecycleListener
        public void resume() {
                r6 = this;
                java.lang.Object r0 = com.badlogic.gdx.utils.Timer.threadLock
                monitor-enter(r0)
                long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2e
                r3 = 1000000(0xf4240, double:4.940656E-318)
                long r1 = r1 / r3
                long r3 = r6.pauseTimeMillis     // Catch: java.lang.Throwable -> L2e
                long r1 = r1 - r3
                r3 = 0
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer> r4 = r6.instances     // Catch: java.lang.Throwable -> L2e
                int r4 = r4.size     // Catch: java.lang.Throwable -> L2e
            L13:
                if (r3 >= r4) goto L23
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer> r5 = r6.instances     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> L2e
                com.badlogic.gdx.utils.Timer r5 = (com.badlogic.gdx.utils.Timer) r5     // Catch: java.lang.Throwable -> L2e
                r5.delay(r1)     // Catch: java.lang.Throwable -> L2e
                int r3 = r3 + 1
                goto L13
            L23:
                r1 = 0
                r6.pauseTimeMillis = r1     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r1 = com.badlogic.gdx.utils.Timer.threadLock     // Catch: java.lang.Throwable -> L2e
                r1.notifyAll()     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
                return
            L2e:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
                throw r1
        }

        @Override // java.lang.Runnable
        public void run() {
                r10 = this;
            L0:
                java.lang.Object r0 = com.badlogic.gdx.utils.Timer.threadLock
                monitor-enter(r0)
                com.badlogic.gdx.utils.Timer$TimerThread r1 = com.badlogic.gdx.utils.Timer.thread     // Catch: java.lang.Throwable -> L7b
                if (r1 != r10) goto L76
                com.badlogic.gdx.Files r1 = r10.files     // Catch: java.lang.Throwable -> L7b
                com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files     // Catch: java.lang.Throwable -> L7b
                if (r1 == r2) goto Le
                goto L76
            Le:
                r1 = 5000(0x1388, double:2.4703E-320)
                long r3 = r10.pauseTimeMillis     // Catch: java.lang.Throwable -> L7b
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 != 0) goto L5e
                long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L7b
                r7 = 1000000(0xf4240, double:4.940656E-318)
                long r3 = r3 / r7
                r7 = 0
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer> r8 = r10.instances     // Catch: java.lang.Throwable -> L7b
                int r8 = r8.size     // Catch: java.lang.Throwable -> L7b
            L25:
                if (r7 >= r8) goto L5e
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer> r9 = r10.instances     // Catch: java.lang.Throwable -> L36
                java.lang.Object r9 = r9.get(r7)     // Catch: java.lang.Throwable -> L36
                com.badlogic.gdx.utils.Timer r9 = (com.badlogic.gdx.utils.Timer) r9     // Catch: java.lang.Throwable -> L36
                long r1 = r9.update(r3, r1)     // Catch: java.lang.Throwable -> L36
                int r7 = r7 + 1
                goto L25
            L36:
                r1 = move-exception
                com.badlogic.gdx.utils.GdxRuntimeException r2 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L7b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
                r3.<init>()     // Catch: java.lang.Throwable -> L7b
                java.lang.String r4 = "Task failed: "
                r3.append(r4)     // Catch: java.lang.Throwable -> L7b
                com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer> r4 = r10.instances     // Catch: java.lang.Throwable -> L7b
                java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Throwable -> L7b
                com.badlogic.gdx.utils.Timer r4 = (com.badlogic.gdx.utils.Timer) r4     // Catch: java.lang.Throwable -> L7b
                java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L7b
                java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L7b
                r3.append(r4)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7b
                r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L7b
                throw r2     // Catch: java.lang.Throwable -> L7b
            L5e:
                com.badlogic.gdx.utils.Timer$TimerThread r3 = com.badlogic.gdx.utils.Timer.thread     // Catch: java.lang.Throwable -> L7b
                if (r3 != r10) goto L74
                com.badlogic.gdx.Files r3 = r10.files     // Catch: java.lang.Throwable -> L7b
                com.badlogic.gdx.Files r4 = com.badlogic.gdx.Gdx.files     // Catch: java.lang.Throwable -> L7b
                if (r3 == r4) goto L69
                goto L74
            L69:
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 <= 0) goto L72
                java.lang.Object r3 = com.badlogic.gdx.utils.Timer.threadLock     // Catch: java.lang.InterruptedException -> L72 java.lang.Throwable -> L7b
                r3.wait(r1)     // Catch: java.lang.InterruptedException -> L72 java.lang.Throwable -> L7b
            L72:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
                goto L0
            L74:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
                goto L77
            L76:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            L77:
                r10.dispose()
                return
            L7b:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
                throw r1
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.badlogic.gdx.utils.Timer.threadLock = r0
            return
    }

    public Timer() {
            r3 = this;
            r3.<init>()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r1 = 0
            r2 = 8
            r0.<init>(r1, r2)
            r3.tasks = r0
            r3.start()
            return
    }

    public static com.badlogic.gdx.utils.Timer instance() {
            java.lang.Object r0 = com.badlogic.gdx.utils.Timer.threadLock
            monitor-enter(r0)
            com.badlogic.gdx.utils.Timer$TimerThread r1 = thread()     // Catch: java.lang.Throwable -> L16
            com.badlogic.gdx.utils.Timer r2 = r1.instance     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L12
            com.badlogic.gdx.utils.Timer r2 = new com.badlogic.gdx.utils.Timer     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            r1.instance = r2     // Catch: java.lang.Throwable -> L16
        L12:
            com.badlogic.gdx.utils.Timer r1 = r1.instance     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r1
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    public static com.badlogic.gdx.utils.Timer.Task schedule(com.badlogic.gdx.utils.Timer.Task r1, float r2) {
            com.badlogic.gdx.utils.Timer r0 = instance()
            com.badlogic.gdx.utils.Timer$Task r1 = r0.scheduleTask(r1, r2)
            return r1
    }

    public static com.badlogic.gdx.utils.Timer.Task schedule(com.badlogic.gdx.utils.Timer.Task r1, float r2, float r3) {
            com.badlogic.gdx.utils.Timer r0 = instance()
            com.badlogic.gdx.utils.Timer$Task r1 = r0.scheduleTask(r1, r2, r3)
            return r1
    }

    private static com.badlogic.gdx.utils.Timer.TimerThread thread() {
            java.lang.Object r0 = com.badlogic.gdx.utils.Timer.threadLock
            monitor-enter(r0)
            com.badlogic.gdx.utils.Timer$TimerThread r1 = com.badlogic.gdx.utils.Timer.thread     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto Ld
            com.badlogic.gdx.Files r2 = r1.files     // Catch: java.lang.Throwable -> L1d
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files     // Catch: java.lang.Throwable -> L1d
            if (r2 == r3) goto L19
        Ld:
            if (r1 == 0) goto L12
            r1.dispose()     // Catch: java.lang.Throwable -> L1d
        L12:
            com.badlogic.gdx.utils.Timer$TimerThread r1 = new com.badlogic.gdx.utils.Timer$TimerThread     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            com.badlogic.gdx.utils.Timer.thread = r1     // Catch: java.lang.Throwable -> L1d
        L19:
            com.badlogic.gdx.utils.Timer$TimerThread r1 = com.badlogic.gdx.utils.Timer.thread     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r1
        L1d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    public synchronized void delay(long r6) {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer$Task> r1 = r5.tasks     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.size     // Catch: java.lang.Throwable -> L1f
        L6:
            if (r0 >= r1) goto L1d
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer$Task> r2 = r5.tasks     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L1f
            com.badlogic.gdx.utils.Timer$Task r2 = (com.badlogic.gdx.utils.Timer.Task) r2     // Catch: java.lang.Throwable -> L1f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L1f
            long r3 = r2.executeTimeMillis     // Catch: java.lang.Throwable -> L1a
            long r3 = r3 + r6
            r2.executeTimeMillis = r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            int r0 = r0 + 1
            goto L6
        L1a:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r6     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r5)
            return
        L1f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public com.badlogic.gdx.utils.Timer.Task scheduleTask(com.badlogic.gdx.utils.Timer.Task r3, float r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            com.badlogic.gdx.utils.Timer$Task r3 = r2.scheduleTask(r3, r4, r0, r1)
            return r3
    }

    public com.badlogic.gdx.utils.Timer.Task scheduleTask(com.badlogic.gdx.utils.Timer.Task r2, float r3, float r4) {
            r1 = this;
            r0 = -1
            com.badlogic.gdx.utils.Timer$Task r2 = r1.scheduleTask(r2, r3, r4, r0)
            return r2
    }

    public com.badlogic.gdx.utils.Timer.Task scheduleTask(com.badlogic.gdx.utils.Timer.Task r11, float r12, float r13, int r14) {
            r10 = this;
            java.lang.Object r0 = com.badlogic.gdx.utils.Timer.threadLock
            monitor-enter(r0)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L48
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L45
            com.badlogic.gdx.utils.Timer r1 = r11.timer     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L3a
            r11.timer = r10     // Catch: java.lang.Throwable -> L42
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L42
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 / r3
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r12 = r12 * r3
            long r4 = (long) r12     // Catch: java.lang.Throwable -> L42
            long r4 = r4 + r1
            com.badlogic.gdx.utils.Timer$TimerThread r12 = com.badlogic.gdx.utils.Timer.thread     // Catch: java.lang.Throwable -> L42
            long r6 = r12.pauseTimeMillis     // Catch: java.lang.Throwable -> L42
            r8 = 0
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 <= 0) goto L25
            long r1 = r1 - r6
            long r4 = r4 - r1
        L25:
            r11.executeTimeMillis = r4     // Catch: java.lang.Throwable -> L42
            float r13 = r13 * r3
            long r12 = (long) r13     // Catch: java.lang.Throwable -> L42
            r11.intervalMillis = r12     // Catch: java.lang.Throwable -> L42
            r11.repeatCount = r14     // Catch: java.lang.Throwable -> L42
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer$Task> r12 = r10.tasks     // Catch: java.lang.Throwable -> L42
            r12.add(r11)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            r0.notifyAll()     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return r11
        L3a:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L42
            java.lang.String r13 = "The same task may not be scheduled twice."
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L42
            throw r12     // Catch: java.lang.Throwable -> L42
        L42:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L42
            throw r12     // Catch: java.lang.Throwable -> L45
        L45:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            throw r11     // Catch: java.lang.Throwable -> L48
        L48:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r11
    }

    public void start() {
            r3 = this;
            java.lang.Object r0 = com.badlogic.gdx.utils.Timer.threadLock
            monitor-enter(r0)
            com.badlogic.gdx.utils.Timer$TimerThread r1 = thread()     // Catch: java.lang.Throwable -> L1a
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer> r1 = r1.instances     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            boolean r2 = r1.contains(r3, r2)     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L12:
            r1.add(r3)     // Catch: java.lang.Throwable -> L1a
            r0.notifyAll()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }

    synchronized long update(long r8, long r10) {
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer$Task> r1 = r7.tasks     // Catch: java.lang.Throwable -> L4f
            int r1 = r1.size     // Catch: java.lang.Throwable -> L4f
        L6:
            if (r0 >= r1) goto L4d
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer$Task> r2 = r7.tasks     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L4f
            com.badlogic.gdx.utils.Timer$Task r2 = (com.badlogic.gdx.utils.Timer.Task) r2     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4f
            long r3 = r2.executeTimeMillis     // Catch: java.lang.Throwable -> L4a
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L1e
            long r3 = r3 - r8
            long r10 = java.lang.Math.min(r10, r3)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
            goto L47
        L1e:
            int r3 = r2.repeatCount     // Catch: java.lang.Throwable -> L4a
            if (r3 != 0) goto L2f
            r3 = 0
            r2.timer = r3     // Catch: java.lang.Throwable -> L4a
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.utils.Timer$Task> r3 = r7.tasks     // Catch: java.lang.Throwable -> L4a
            r3.removeIndex(r0)     // Catch: java.lang.Throwable -> L4a
            int r0 = r0 + (-1)
            int r1 = r1 + (-1)
            goto L41
        L2f:
            long r3 = r2.intervalMillis     // Catch: java.lang.Throwable -> L4a
            long r5 = r8 + r3
            r2.executeTimeMillis = r5     // Catch: java.lang.Throwable -> L4a
            long r10 = java.lang.Math.min(r10, r3)     // Catch: java.lang.Throwable -> L4a
            int r3 = r2.repeatCount     // Catch: java.lang.Throwable -> L4a
            if (r3 <= 0) goto L41
            int r3 = r3 + (-1)
            r2.repeatCount = r3     // Catch: java.lang.Throwable -> L4a
        L41:
            com.badlogic.gdx.Application r3 = r2.app     // Catch: java.lang.Throwable -> L4a
            r3.postRunnable(r2)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
        L47:
            int r0 = r0 + 1
            goto L6
        L4a:
            r8 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
            throw r8     // Catch: java.lang.Throwable -> L4f
        L4d:
            monitor-exit(r7)
            return r10
        L4f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }
}
