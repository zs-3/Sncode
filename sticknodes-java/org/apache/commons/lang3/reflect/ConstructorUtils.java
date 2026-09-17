package org.apache.commons.lang3.reflect;

/* loaded from: classes2.dex */
public class ConstructorUtils {
    public ConstructorUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> java.lang.reflect.Constructor<T> getAccessibleConstructor(java.lang.Class<T> r2, java.lang.Class<?>... r3) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "class cannot be null"
            org.apache.commons.lang3.Validate.notNull(r2, r1, r0)
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L11
            java.lang.reflect.Constructor r2 = getAccessibleConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L11
            return r2
        L11:
            r2 = 0
            return r2
    }

    public static <T> java.lang.reflect.Constructor<T> getAccessibleConstructor(java.lang.reflect.Constructor<T> r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "constructor cannot be null"
            org.apache.commons.lang3.Validate.notNull(r2, r1, r0)
            boolean r0 = org.apache.commons.lang3.reflect.MemberUtils.isAccessible(r2)
            if (r0 == 0) goto L19
            java.lang.Class r0 = r2.getDeclaringClass()
            boolean r0 = isAccessible(r0)
            if (r0 == 0) goto L19
            goto L1a
        L19:
            r2 = 0
        L1a:
            return r2
    }

    public static <T> java.lang.reflect.Constructor<T> getMatchingAccessibleConstructor(java.lang.Class<T> r5, java.lang.Class<?>... r6) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "class cannot be null"
            org.apache.commons.lang3.Validate.notNull(r5, r2, r1)
            java.lang.reflect.Constructor r1 = r5.getConstructor(r6)     // Catch: java.lang.NoSuchMethodException -> L10
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(r1)     // Catch: java.lang.NoSuchMethodException -> L10
            return r1
        L10:
            r1 = 0
            java.lang.reflect.Constructor[] r5 = r5.getConstructors()
            int r2 = r5.length
        L16:
            if (r0 >= r2) goto L35
            r3 = r5[r0]
            boolean r4 = org.apache.commons.lang3.reflect.MemberUtils.isMatchingConstructor(r3, r6)
            if (r4 == 0) goto L32
            java.lang.reflect.Constructor r3 = getAccessibleConstructor(r3)
            if (r3 == 0) goto L32
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(r3)
            if (r1 == 0) goto L31
            int r4 = org.apache.commons.lang3.reflect.MemberUtils.compareConstructorFit(r3, r1, r6)
            if (r4 >= 0) goto L32
        L31:
            r1 = r3
        L32:
            int r0 = r0 + 1
            goto L16
        L35:
            return r1
    }

    public static <T> T invokeConstructor(java.lang.Class<T> r1, java.lang.Object... r2) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.InstantiationException {
            java.lang.Object[] r2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r2)
            java.lang.Class[] r0 = org.apache.commons.lang3.ClassUtils.toClass(r2)
            java.lang.Object r1 = invokeConstructor(r1, r2, r0)
            return r1
    }

    public static <T> T invokeConstructor(java.lang.Class<T> r1, java.lang.Object[] r2, java.lang.Class<?>[] r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.InstantiationException {
            java.lang.Object[] r2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r2)
            java.lang.Class[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.reflect.Constructor r3 = getMatchingAccessibleConstructor(r1, r3)
            if (r3 == 0) goto L21
            boolean r1 = r3.isVarArgs()
            if (r1 == 0) goto L1c
            java.lang.Class[] r1 = r3.getParameterTypes()
            java.lang.Object[] r2 = org.apache.commons.lang3.reflect.MethodUtils.getVarArgs(r2, r1)
        L1c:
            java.lang.Object r1 = r3.newInstance(r2)
            return r1
        L21:
            java.lang.NoSuchMethodException r2 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "No such accessible constructor on object: "
            r3.append(r0)
            java.lang.String r1 = r1.getName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    public static <T> T invokeExactConstructor(java.lang.Class<T> r1, java.lang.Object... r2) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.InstantiationException {
            java.lang.Object[] r2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r2)
            java.lang.Class[] r0 = org.apache.commons.lang3.ClassUtils.toClass(r2)
            java.lang.Object r1 = invokeExactConstructor(r1, r2, r0)
            return r1
    }

    public static <T> T invokeExactConstructor(java.lang.Class<T> r1, java.lang.Object[] r2, java.lang.Class<?>[] r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.InstantiationException {
            java.lang.Object[] r2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r2)
            java.lang.Class[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.reflect.Constructor r3 = getAccessibleConstructor(r1, r3)
            if (r3 == 0) goto L13
            java.lang.Object r1 = r3.newInstance(r2)
            return r1
        L13:
            java.lang.NoSuchMethodException r2 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "No such accessible constructor on object: "
            r3.append(r0)
            java.lang.String r1 = r1.getName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    private static boolean isAccessible(java.lang.Class<?> r1) {
        L0:
            if (r1 == 0) goto L13
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 != 0) goto Le
            r1 = 0
            return r1
        Le:
            java.lang.Class r1 = r1.getEnclosingClass()
            goto L0
        L13:
            r1 = 1
            return r1
    }
}
