package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public class Functions {

    @java.lang.FunctionalInterface
    public interface FailableBiConsumer<O1, O2, T extends java.lang.Throwable> {
        void accept(O1 r1, O2 r2) throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    public interface FailableBiFunction<I1, I2, O, T extends java.lang.Throwable> {
        O apply(I1 r1, I2 r2) throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    public interface FailableBiPredicate<O1, O2, T extends java.lang.Throwable> {
        boolean test(O1 r1, O2 r2) throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    public interface FailableCallable<O, T extends java.lang.Throwable> {
        O call() throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    public interface FailableConsumer<O, T extends java.lang.Throwable> {
        void accept(O r1) throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    public interface FailableFunction<I, O, T extends java.lang.Throwable> {
        O apply(I r1) throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    public interface FailablePredicate<O, T extends java.lang.Throwable> {
        boolean test(O r1) throws java.lang.Throwable;
    }

    @java.lang.FunctionalInterface
    public interface FailableRunnable<T extends java.lang.Throwable> {
        void run() throws java.lang.Throwable;
    }

    public static /* synthetic */ void $r8$lambda$s1MIiblVZm2woHAYw1b1_KxKLZs(java.lang.Throwable r0) {
            lambda$tryWithResources$0(r0)
            return
    }

    public Functions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <O1, O2, T extends java.lang.Throwable> void accept(org.apache.commons.lang3.Functions.FailableBiConsumer<O1, O2, T> r0, O1 r1, O2 r2) {
            r0.accept(r1, r2)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    public static <O, T extends java.lang.Throwable> void accept(org.apache.commons.lang3.Functions.FailableConsumer<O, T> r0, O r1) {
            r0.accept(r1)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    public static <I1, I2, O, T extends java.lang.Throwable> O apply(org.apache.commons.lang3.Functions.FailableBiFunction<I1, I2, O, T> r0, I1 r1, I2 r2) {
            java.lang.Object r0 = r0.apply(r1, r2)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    public static <I, O, T extends java.lang.Throwable> O apply(org.apache.commons.lang3.Functions.FailableFunction<I, O, T> r0, I r1) {
            java.lang.Object r0 = r0.apply(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    public static <O, T extends java.lang.Throwable> O call(org.apache.commons.lang3.Functions.FailableCallable<O, T> r0) {
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    private static /* synthetic */ void lambda$tryWithResources$0(java.lang.Throwable r0) throws java.lang.Throwable {
            rethrow(r0)
            return
    }

    public static java.lang.RuntimeException rethrow(java.lang.Throwable r1) {
            java.lang.String r0 = "The Throwable must not be null."
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L22
            boolean r0 = r1 instanceof java.lang.Error
            if (r0 != 0) goto L1f
            boolean r0 = r1 instanceof java.io.IOException
            if (r0 == 0) goto L19
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            java.io.IOException r1 = (java.io.IOException) r1
            r0.<init>(r1)
            throw r0
        L19:
            java.lang.reflect.UndeclaredThrowableException r0 = new java.lang.reflect.UndeclaredThrowableException
            r0.<init>(r1)
            throw r0
        L1f:
            java.lang.Error r1 = (java.lang.Error) r1
            throw r1
        L22:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            throw r1
    }

    public static <T extends java.lang.Throwable> void run(org.apache.commons.lang3.Functions.FailableRunnable<T> r0) {
            r0.run()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    public static <O1, O2, T extends java.lang.Throwable> boolean test(org.apache.commons.lang3.Functions.FailableBiPredicate<O1, O2, T> r0, O1 r1, O2 r2) {
            boolean r0 = r0.test(r1, r2)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    public static <O, T extends java.lang.Throwable> boolean test(org.apache.commons.lang3.Functions.FailablePredicate<O, T> r0, O r1) {
            boolean r0 = r0.test(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = rethrow(r0)
            throw r0
    }

    @java.lang.SafeVarargs
    public static void tryWithResources(org.apache.commons.lang3.Functions.FailableRunnable<? extends java.lang.Throwable> r5, org.apache.commons.lang3.Functions.FailableConsumer<java.lang.Throwable, ? extends java.lang.Throwable> r6, org.apache.commons.lang3.Functions.FailableRunnable<? extends java.lang.Throwable>... r7) {
            if (r6 != 0) goto L4
            org.apache.commons.lang3.Functions$$ExternalSyntheticLambda0 r6 = org.apache.commons.lang3.Functions$$ExternalSyntheticLambda0.INSTANCE
        L4:
            r0 = 0
            if (r7 == 0) goto L15
            int r1 = r7.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L15
            r3 = r7[r2]
            java.lang.String r4 = "A resource action must not be null."
            java.util.Objects.requireNonNull(r3, r4)
            int r2 = r2 + 1
            goto L9
        L15:
            r1 = 0
            r5.run()     // Catch: java.lang.Throwable -> L1a
            goto L1b
        L1a:
            r1 = move-exception
        L1b:
            if (r7 == 0) goto L2d
            int r5 = r7.length
        L1e:
            if (r0 >= r5) goto L2d
            r2 = r7[r0]
            r2.run()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r2 = move-exception
            if (r1 != 0) goto L2a
            r1 = r2
        L2a:
            int r0 = r0 + 1
            goto L1e
        L2d:
            if (r1 == 0) goto L39
            r6.accept(r1)     // Catch: java.lang.Throwable -> L33
            goto L39
        L33:
            r5 = move-exception
            java.lang.RuntimeException r5 = rethrow(r5)
            throw r5
        L39:
            return
    }

    @java.lang.SafeVarargs
    public static void tryWithResources(org.apache.commons.lang3.Functions.FailableRunnable<? extends java.lang.Throwable> r1, org.apache.commons.lang3.Functions.FailableRunnable<? extends java.lang.Throwable>... r2) {
            r0 = 0
            tryWithResources(r1, r0, r2)
            return
    }
}
