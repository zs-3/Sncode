package org.apache.commons.lang3.exception;

/* loaded from: classes2.dex */
public class ExceptionUtils {
    private static final java.lang.String[] CAUSE_METHOD_NAMES = null;
    static final java.lang.String WRAPPED_MARKER = " [wrapped] ";

    static {
            java.lang.String r0 = "getCause"
            java.lang.String r1 = "getNextException"
            java.lang.String r2 = "getTargetException"
            java.lang.String r3 = "getException"
            java.lang.String r4 = "getSourceException"
            java.lang.String r5 = "getRootCause"
            java.lang.String r6 = "getCausedByException"
            java.lang.String r7 = "getNested"
            java.lang.String r8 = "getLinkedException"
            java.lang.String r9 = "getNestedException"
            java.lang.String r10 = "getLinkedCause"
            java.lang.String r11 = "getThrowable"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            org.apache.commons.lang3.exception.ExceptionUtils.CAUSE_METHOD_NAMES = r0
            return
    }

    public ExceptionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static java.lang.Throwable getCause(java.lang.Throwable r1) {
            r0 = 0
            java.lang.Throwable r1 = getCause(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.Throwable getCause(java.lang.Throwable r4, java.lang.String[] r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            if (r5 != 0) goto Lf
            java.lang.Throwable r5 = r4.getCause()
            if (r5 == 0) goto Ld
            return r5
        Ld:
            java.lang.String[] r5 = org.apache.commons.lang3.exception.ExceptionUtils.CAUSE_METHOD_NAMES
        Lf:
            int r1 = r5.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L21
            r3 = r5[r2]
            if (r3 == 0) goto L1e
            java.lang.Throwable r3 = getCauseUsingMethodName(r4, r3)
            if (r3 == 0) goto L1e
            return r3
        L1e:
            int r2 = r2 + 1
            goto L11
        L21:
            return r0
    }

    private static java.lang.Throwable getCauseUsingMethodName(java.lang.Throwable r4, java.lang.String r5) {
            r0 = 0
            r1 = 0
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.Throwable -> Ld
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> Ld
            java.lang.reflect.Method r5 = r2.getMethod(r5, r3)     // Catch: java.lang.Throwable -> Ld
            goto Le
        Ld:
            r5 = r1
        Le:
            if (r5 == 0) goto L25
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.Class r3 = r5.getReturnType()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L25
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L25
            java.lang.Object r4 = r5.invoke(r4, r0)     // Catch: java.lang.Throwable -> L25
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> L25
            return r4
        L25:
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String[] getDefaultCauseMethodNames() {
            java.lang.String[] r0 = org.apache.commons.lang3.exception.ExceptionUtils.CAUSE_METHOD_NAMES
            java.lang.Object[] r0 = org.apache.commons.lang3.ArrayUtils.clone(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public static java.lang.String getMessage(java.lang.Throwable r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            r0 = 0
            java.lang.String r0 = org.apache.commons.lang3.ClassUtils.getShortClassName(r2, r0)
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            java.lang.String r2 = org.apache.commons.lang3.StringUtils.defaultString(r2)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
    }

    public static java.lang.Throwable getRootCause(java.lang.Throwable r1) {
            java.util.List r1 = getThrowableList(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lc
            r1 = 0
            goto L18
        Lc:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
        L18:
            return r1
    }

    public static java.lang.String getRootCauseMessage(java.lang.Throwable r1) {
            java.lang.Throwable r0 = getRootCause(r1)
            if (r0 != 0) goto L7
            goto L8
        L7:
            r1 = r0
        L8:
            java.lang.String r1 = getMessage(r1)
            return r1
    }

    public static java.lang.String[] getRootCauseStackTrace(java.lang.Throwable r7) {
            if (r7 != 0) goto L5
            java.lang.String[] r7 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            return r7
        L5:
            java.lang.Throwable[] r7 = getThrowables(r7)
            int r0 = r7.length
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0 + (-1)
            r3 = r7[r2]
            java.util.List r3 = getStackFrameList(r3)
        L17:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L55
            if (r0 == 0) goto L29
            int r4 = r0 + (-1)
            r4 = r7[r4]
            java.util.List r4 = getStackFrameList(r4)
            removeCommonFrames(r3, r4)
            goto L2a
        L29:
            r4 = r3
        L2a:
            if (r0 != r2) goto L36
            r5 = r7[r0]
            java.lang.String r5 = r5.toString()
            r1.add(r5)
            goto L50
        L36:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = " [wrapped] "
            r5.append(r6)
            r6 = r7[r0]
            java.lang.String r6 = r6.toString()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.add(r5)
        L50:
            r1.addAll(r3)
            r3 = r4
            goto L17
        L55:
            int r7 = r1.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.Object[] r7 = r1.toArray(r7)
            java.lang.String[] r7 = (java.lang.String[]) r7
            return r7
    }

    static java.util.List<java.lang.String> getStackFrameList(java.lang.Throwable r6) {
            java.lang.String r6 = getStackTrace(r6)
            java.lang.String r0 = java.lang.System.lineSeparator()
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            r1.<init>(r6, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 0
            r2 = 0
        L14:
            boolean r3 = r1.hasMoreTokens()
            if (r3 == 0) goto L3c
            java.lang.String r3 = r1.nextToken()
            java.lang.String r4 = "at"
            int r4 = r3.indexOf(r4)
            r5 = -1
            if (r4 == r5) goto L3a
            java.lang.String r4 = r3.substring(r0, r4)
            java.lang.String r4 = r4.trim()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L3a
            r2 = 1
            r6.add(r3)
            goto L14
        L3a:
            if (r2 == 0) goto L14
        L3c:
            return r6
    }

    static java.lang.String[] getStackFrames(java.lang.String r2) {
            java.lang.String r0 = java.lang.System.lineSeparator()
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            r1.<init>(r2, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        Le:
            boolean r0 = r1.hasMoreTokens()
            if (r0 == 0) goto L1c
            java.lang.String r0 = r1.nextToken()
            r2.add(r0)
            goto Le
        L1c:
            int r0 = r2.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    public static java.lang.String[] getStackFrames(java.lang.Throwable r0) {
            if (r0 != 0) goto L5
            java.lang.String[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            return r0
        L5:
            java.lang.String r0 = getStackTrace(r0)
            java.lang.String[] r0 = getStackFrames(r0)
            return r0
    }

    public static java.lang.String getStackTrace(java.lang.Throwable r3) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r2 = 1
            r1.<init>(r0, r2)
            r3.printStackTrace(r1)
            java.lang.StringBuffer r3 = r0.getBuffer()
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static int getThrowableCount(java.lang.Throwable r0) {
            java.util.List r0 = getThrowableList(r0)
            int r0 = r0.size()
            return r0
    }

    public static java.util.List<java.lang.Throwable> getThrowableList(java.lang.Throwable r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L15
            boolean r1 = r0.contains(r2)
            if (r1 != 0) goto L15
            r0.add(r2)
            java.lang.Throwable r2 = r2.getCause()
            goto L5
        L15:
            return r0
    }

    public static java.lang.Throwable[] getThrowables(java.lang.Throwable r1) {
            java.util.List r1 = getThrowableList(r1)
            int r0 = r1.size()
            java.lang.Throwable[] r0 = new java.lang.Throwable[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.Throwable[] r1 = (java.lang.Throwable[]) r1
            return r1
    }

    public static boolean hasCause(java.lang.Throwable r1, java.lang.Class<? extends java.lang.Throwable> r2) {
            boolean r0 = r1 instanceof java.lang.reflect.UndeclaredThrowableException
            if (r0 == 0) goto L8
            java.lang.Throwable r1 = r1.getCause()
        L8:
            boolean r1 = r2.isInstance(r1)
            return r1
    }

    private static int indexOf(java.lang.Throwable r2, java.lang.Class<?> r3, int r4, boolean r5) {
            r0 = -1
            if (r2 == 0) goto L39
            if (r3 != 0) goto L6
            goto L39
        L6:
            if (r4 >= 0) goto L9
            r4 = 0
        L9:
            java.lang.Throwable[] r2 = getThrowables(r2)
            int r1 = r2.length
            if (r4 < r1) goto L11
            return r0
        L11:
            if (r5 == 0) goto L26
        L13:
            int r5 = r2.length
            if (r4 >= r5) goto L39
            r5 = r2[r4]
            java.lang.Class r5 = r5.getClass()
            boolean r5 = r3.isAssignableFrom(r5)
            if (r5 == 0) goto L23
            return r4
        L23:
            int r4 = r4 + 1
            goto L13
        L26:
            int r5 = r2.length
            if (r4 >= r5) goto L39
            r5 = r2[r4]
            java.lang.Class r5 = r5.getClass()
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L36
            return r4
        L36:
            int r4 = r4 + 1
            goto L26
        L39:
            return r0
    }

    public static int indexOfThrowable(java.lang.Throwable r1, java.lang.Class<?> r2) {
            r0 = 0
            int r1 = indexOf(r1, r2, r0, r0)
            return r1
    }

    public static int indexOfThrowable(java.lang.Throwable r1, java.lang.Class<?> r2, int r3) {
            r0 = 0
            int r1 = indexOf(r1, r2, r3, r0)
            return r1
    }

    public static int indexOfType(java.lang.Throwable r2, java.lang.Class<?> r3) {
            r0 = 0
            r1 = 1
            int r2 = indexOf(r2, r3, r0, r1)
            return r2
    }

    public static int indexOfType(java.lang.Throwable r1, java.lang.Class<?> r2, int r3) {
            r0 = 1
            int r1 = indexOf(r1, r2, r3, r0)
            return r1
    }

    public static void printRootCauseStackTrace(java.lang.Throwable r1) {
            java.io.PrintStream r0 = java.lang.System.err
            printRootCauseStackTrace(r1, r0)
            return
    }

    public static void printRootCauseStackTrace(java.lang.Throwable r4, java.io.PrintStream r5) {
            if (r4 != 0) goto L3
            return
        L3:
            r0 = 0
            if (r5 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = "The PrintStream must not be null"
            org.apache.commons.lang3.Validate.isTrue(r1, r3, r2)
            java.lang.String[] r4 = getRootCauseStackTrace(r4)
            int r1 = r4.length
        L15:
            if (r0 >= r1) goto L1f
            r2 = r4[r0]
            r5.println(r2)
            int r0 = r0 + 1
            goto L15
        L1f:
            r5.flush()
            return
    }

    public static void printRootCauseStackTrace(java.lang.Throwable r4, java.io.PrintWriter r5) {
            if (r4 != 0) goto L3
            return
        L3:
            r0 = 0
            if (r5 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = "The PrintWriter must not be null"
            org.apache.commons.lang3.Validate.isTrue(r1, r3, r2)
            java.lang.String[] r4 = getRootCauseStackTrace(r4)
            int r1 = r4.length
        L15:
            if (r0 >= r1) goto L1f
            r2 = r4[r0]
            r5.println(r2)
            int r0 = r0 + 1
            goto L15
        L1f:
            r5.flush()
            return
    }

    public static void removeCommonFrames(java.util.List<java.lang.String> r4, java.util.List<java.lang.String> r5) {
            if (r4 == 0) goto L2f
            if (r5 == 0) goto L2f
            int r0 = r4.size()
            int r0 = r0 + (-1)
            int r1 = r5.size()
            int r1 = r1 + (-1)
        L10:
            if (r0 < 0) goto L2e
            if (r1 < 0) goto L2e
            java.lang.Object r2 = r4.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
            r4.remove(r0)
        L29:
            int r0 = r0 + (-1)
            int r1 = r1 + (-1)
            goto L10
        L2e:
            return
        L2f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "The List must not be null"
            r4.<init>(r5)
            throw r4
    }

    public static <R> R rethrow(java.lang.Throwable r0) {
            java.lang.Object r0 = typeErasure(r0)
            return r0
    }

    private static <R, T extends java.lang.Throwable> R typeErasure(java.lang.Throwable r0) throws java.lang.Throwable {
            throw r0
    }

    public static <R> R wrapAndThrow(java.lang.Throwable r1) {
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L11
            boolean r0 = r1 instanceof java.lang.Error
            if (r0 == 0) goto Lb
            java.lang.Error r1 = (java.lang.Error) r1
            throw r1
        Lb:
            java.lang.reflect.UndeclaredThrowableException r0 = new java.lang.reflect.UndeclaredThrowableException
            r0.<init>(r1)
            throw r0
        L11:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            throw r1
    }
}
