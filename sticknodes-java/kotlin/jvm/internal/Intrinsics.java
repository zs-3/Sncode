package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public class Intrinsics {
    private Intrinsics() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean areEqual(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            goto Lc
        L6:
            r0 = 0
            goto Lc
        L8:
            boolean r0 = r0.equals(r1)
        Lc:
            return r0
    }

    public static void checkNotNull(java.lang.Object r0) {
            if (r0 != 0) goto L5
            throwJavaNpe()
        L5:
            return
    }

    public static void checkNotNull(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L5
            throwJavaNpe(r1)
        L5:
            return
    }

    public static void checkNotNullExpressionValue(java.lang.Object r1, java.lang.String r2) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " must not be null"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            java.lang.Throwable r1 = sanitizeStackTrace(r1)
            java.lang.NullPointerException r1 = (java.lang.NullPointerException) r1
            throw r1
    }

    public static void checkNotNullParameter(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L5
            throwParameterIsNullNPE(r1)
        L5:
            return
    }

    public static int compare(int r0, int r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            goto L9
        L4:
            if (r0 != r1) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = 1
        L9:
            return r0
    }

    public static int compare(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6
            r1 = -1
            goto Lb
        L6:
            if (r0 != 0) goto La
            r1 = 0
            goto Lb
        La:
            r1 = 1
        Lb:
            return r1
    }

    private static java.lang.String createParameterIsNullExceptionMessage(java.lang.String r4) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.Class<kotlin.jvm.internal.Intrinsics> r1 = kotlin.jvm.internal.Intrinsics.class
            java.lang.String r1 = r1.getName()
            r2 = 0
        Lf:
            r3 = r0[r2]
            java.lang.String r3 = r3.getClassName()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L1e
            int r2 = r2 + 1
            goto Lf
        L1e:
            r3 = r0[r2]
            java.lang.String r3 = r3.getClassName()
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L2d
            int r2 = r2 + 1
            goto L1e
        L2d:
            r0 = r0[r2]
            java.lang.String r1 = r0.getClassName()
            java.lang.String r0 = r0.getMethodName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Parameter specified as non-null is null: method "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", parameter "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }

    private static <T extends java.lang.Throwable> T sanitizeStackTrace(T r1) {
            java.lang.Class<kotlin.jvm.internal.Intrinsics> r0 = kotlin.jvm.internal.Intrinsics.class
            java.lang.String r0 = r0.getName()
            java.lang.Throwable r1 = sanitizeStackTrace(r1, r0)
            return r1
    }

    static <T extends java.lang.Throwable> T sanitizeStackTrace(T r5, java.lang.String r6) {
            java.lang.StackTraceElement[] r0 = r5.getStackTrace()
            int r1 = r0.length
            r2 = -1
            r3 = 0
        L7:
            if (r3 >= r1) goto L19
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L16
            r2 = r3
        L16:
            int r3 = r3 + 1
            goto L7
        L19:
            int r2 = r2 + 1
            java.lang.Object[] r6 = java.util.Arrays.copyOfRange(r0, r2, r1)
            java.lang.StackTraceElement[] r6 = (java.lang.StackTraceElement[]) r6
            r5.setStackTrace(r6)
            return r5
    }

    public static java.lang.String stringPlus(java.lang.String r1, java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static void throwJavaNpe() {
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            java.lang.Throwable r0 = sanitizeStackTrace(r0)
            java.lang.NullPointerException r0 = (java.lang.NullPointerException) r0
            throw r0
    }

    public static void throwJavaNpe(java.lang.String r1) {
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            java.lang.Throwable r1 = sanitizeStackTrace(r0)
            java.lang.NullPointerException r1 = (java.lang.NullPointerException) r1
            throw r1
    }

    private static void throwParameterIsNullNPE(java.lang.String r1) {
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = createParameterIsNullExceptionMessage(r1)
            r0.<init>(r1)
            java.lang.Throwable r1 = sanitizeStackTrace(r0)
            java.lang.NullPointerException r1 = (java.lang.NullPointerException) r1
            throw r1
    }

    public static void throwUninitializedProperty(java.lang.String r1) {
            kotlin.UninitializedPropertyAccessException r0 = new kotlin.UninitializedPropertyAccessException
            r0.<init>(r1)
            java.lang.Throwable r1 = sanitizeStackTrace(r0)
            kotlin.UninitializedPropertyAccessException r1 = (kotlin.UninitializedPropertyAccessException) r1
            throw r1
    }

    public static void throwUninitializedPropertyAccessException(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "lateinit property "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " has not been initialized"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            throwUninitializedProperty(r2)
            return
    }
}
