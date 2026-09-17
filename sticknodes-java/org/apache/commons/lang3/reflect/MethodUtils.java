package org.apache.commons.lang3.reflect;

/* loaded from: classes2.dex */
public class MethodUtils {
    public MethodUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int distance(java.lang.Class<?>[] r6, java.lang.Class<?>[] r7) {
            r0 = 1
            boolean r1 = org.apache.commons.lang3.ClassUtils.isAssignable(r6, r7, r0)
            if (r1 != 0) goto L9
            r6 = -1
            return r6
        L9:
            r1 = 0
            r2 = 0
            r3 = 0
        Lc:
            int r4 = r6.length
            if (r2 >= r4) goto L36
            r4 = r6[r2]
            r5 = r7[r2]
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L1a
            goto L33
        L1a:
            r4 = r6[r2]
            r5 = r7[r2]
            boolean r4 = org.apache.commons.lang3.ClassUtils.isAssignable(r4, r5, r0)
            if (r4 == 0) goto L31
            r4 = r6[r2]
            r5 = r7[r2]
            boolean r4 = org.apache.commons.lang3.ClassUtils.isAssignable(r4, r5, r1)
            if (r4 != 0) goto L31
            int r3 = r3 + 1
            goto L33
        L31:
            int r3 = r3 + 2
        L33:
            int r2 = r2 + 1
            goto Lc
        L36:
            return r3
    }

    public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> r0, java.lang.String r1, java.lang.Class<?>... r2) {
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L9
            java.lang.reflect.Method r0 = getAccessibleMethod(r0)     // Catch: java.lang.NoSuchMethodException -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static java.lang.reflect.Method getAccessibleMethod(java.lang.reflect.Method r3) {
            boolean r0 = org.apache.commons.lang3.reflect.MemberUtils.isAccessible(r3)
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.Class r0 = r3.getDeclaringClass()
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L17
            return r3
        L17:
            java.lang.String r1 = r3.getName()
            java.lang.Class[] r3 = r3.getParameterTypes()
            java.lang.reflect.Method r2 = getAccessibleMethodFromInterfaceNest(r0, r1, r3)
            if (r2 != 0) goto L29
            java.lang.reflect.Method r2 = getAccessibleMethodFromSuperclass(r0, r1, r3)
        L29:
            return r2
    }

    private static java.lang.reflect.Method getAccessibleMethodFromInterfaceNest(java.lang.Class<?> r5, java.lang.String r6, java.lang.Class<?>... r7) {
        L0:
            if (r5 == 0) goto L2b
            java.lang.Class[] r0 = r5.getInterfaces()
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L26
            r3 = r0[r2]
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isPublic(r4)
            if (r4 != 0) goto L17
            goto L23
        L17:
            java.lang.reflect.Method r5 = r3.getDeclaredMethod(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L1c
            return r5
        L1c:
            java.lang.reflect.Method r3 = getAccessibleMethodFromInterfaceNest(r3, r6, r7)
            if (r3 == 0) goto L23
            return r3
        L23:
            int r2 = r2 + 1
            goto L8
        L26:
            java.lang.Class r5 = r5.getSuperclass()
            goto L0
        L2b:
            r5 = 0
            return r5
    }

    private static java.lang.reflect.Method getAccessibleMethodFromSuperclass(java.lang.Class<?> r2, java.lang.String r3, java.lang.Class<?>... r4) {
            java.lang.Class r2 = r2.getSuperclass()
        L4:
            r0 = 0
            if (r2 == 0) goto L1c
            int r1 = r2.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L17
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L16
            return r2
        L16:
            return r0
        L17:
            java.lang.Class r2 = r2.getSuperclass()
            goto L4
        L1c:
            return r0
    }

    private static java.util.List<java.lang.Class<?>> getAllSuperclassesAndInterfaces(java.lang.Class<?> r6) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = org.apache.commons.lang3.ClassUtils.getAllSuperclasses(r6)
            java.util.List r6 = org.apache.commons.lang3.ClassUtils.getAllInterfaces(r6)
            r2 = 0
            r3 = 0
        L13:
            int r4 = r6.size()
            if (r2 < r4) goto L21
            int r4 = r1.size()
            if (r3 >= r4) goto L20
            goto L21
        L20:
            return r0
        L21:
            int r4 = r6.size()
            if (r2 < r4) goto L30
            int r4 = r3 + 1
            java.lang.Object r3 = r1.get(r3)
            java.lang.Class r3 = (java.lang.Class) r3
            goto L62
        L30:
            int r4 = r1.size()
            if (r3 < r4) goto L43
            int r4 = r2 + 1
            java.lang.Object r2 = r6.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
        L3e:
            r5 = r3
            r3 = r2
            r2 = r4
            r4 = r5
            goto L62
        L43:
            if (r2 >= r3) goto L4e
            int r4 = r2 + 1
            java.lang.Object r2 = r6.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            goto L3e
        L4e:
            if (r3 >= r2) goto L59
            int r4 = r3 + 1
            java.lang.Object r3 = r1.get(r3)
            java.lang.Class r3 = (java.lang.Class) r3
            goto L62
        L59:
            int r4 = r2 + 1
            java.lang.Object r2 = r6.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            goto L3e
        L62:
            r0.add(r3)
            r3 = r4
            goto L13
    }

    public static <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.reflect.Method r5, java.lang.Class<A> r6, boolean r7, boolean r8) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "The method must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            if (r6 == 0) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "The annotation class must not be null"
            org.apache.commons.lang3.Validate.isTrue(r0, r2, r1)
            if (r8 != 0) goto L23
            boolean r0 = org.apache.commons.lang3.reflect.MemberUtils.isAccessible(r5)
            if (r0 != 0) goto L23
            r5 = 0
            return r5
        L23:
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r6)
            if (r0 != 0) goto L67
            if (r7 == 0) goto L67
            java.lang.Class r7 = r5.getDeclaringClass()
            java.util.List r7 = getAllSuperclassesAndInterfaces(r7)
            java.util.Iterator r7 = r7.iterator()
        L37:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r7.next()
            java.lang.Class r1 = (java.lang.Class) r1
            if (r8 == 0) goto L52
            java.lang.String r2 = r5.getName()     // Catch: java.lang.NoSuchMethodException -> L65
            java.lang.Class[] r3 = r5.getParameterTypes()     // Catch: java.lang.NoSuchMethodException -> L65
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L65
            goto L5e
        L52:
            java.lang.String r2 = r5.getName()     // Catch: java.lang.NoSuchMethodException -> L65
            java.lang.Class[] r3 = r5.getParameterTypes()     // Catch: java.lang.NoSuchMethodException -> L65
            java.lang.reflect.Method r0 = r1.getMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L65
        L5e:
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r6)
            if (r0 == 0) goto L37
            goto L67
        L65:
            goto L37
        L67:
            return r0
    }

    public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class<?> r6, java.lang.String r7, java.lang.Class<?>... r8) {
            java.lang.reflect.Method r0 = r6.getMethod(r7, r8)     // Catch: java.lang.NoSuchMethodException -> L8
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(r0)     // Catch: java.lang.NoSuchMethodException -> L8
            return r0
        L8:
            java.lang.reflect.Method[] r6 = r6.getMethods()
            int r0 = r6.length
            r1 = 0
            r2 = 0
            r3 = r2
        L10:
            if (r1 >= r0) goto L36
            r4 = r6[r1]
            java.lang.String r5 = r4.getName()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L33
            boolean r5 = org.apache.commons.lang3.reflect.MemberUtils.isMatchingMethod(r4, r8)
            if (r5 == 0) goto L33
            java.lang.reflect.Method r4 = getAccessibleMethod(r4)
            if (r4 == 0) goto L33
            if (r3 == 0) goto L32
            int r5 = org.apache.commons.lang3.reflect.MemberUtils.compareMethodFit(r4, r3, r8)
            if (r5 >= 0) goto L33
        L32:
            r3 = r4
        L33:
            int r1 = r1 + 1
            goto L10
        L36:
            if (r3 == 0) goto L3b
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(r3)
        L3b:
            if (r3 == 0) goto L85
            boolean r6 = r3.isVarArgs()
            if (r6 == 0) goto L85
            java.lang.Class[] r6 = r3.getParameterTypes()
            int r6 = r6.length
            if (r6 <= 0) goto L85
            int r6 = r8.length
            if (r6 <= 0) goto L85
            java.lang.Class[] r6 = r3.getParameterTypes()
            int r7 = r6.length
            int r7 = r7 + (-1)
            r6 = r6[r7]
            java.lang.Class r6 = r6.getComponentType()
            java.lang.Class r6 = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(r6)
            java.lang.String r6 = r6.getName()
            int r7 = r8.length
            int r7 = r7 + (-1)
            r7 = r8[r7]
            java.lang.String r7 = r7.getName()
            int r0 = r8.length
            int r0 = r0 + (-1)
            r8 = r8[r0]
            java.lang.Class r8 = r8.getSuperclass()
            java.lang.String r8 = r8.getName()
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L85
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L85
            return r2
        L85:
            return r3
    }

    public static java.lang.reflect.Method getMatchingMethod(java.lang.Class<?> r6, java.lang.String r7, java.lang.Class<?>... r8) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Null class not allowed."
            org.apache.commons.lang3.Validate.notNull(r6, r2, r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Null or blank methodName not allowed."
            org.apache.commons.lang3.Validate.notEmpty(r7, r2, r1)
            java.lang.reflect.Method[] r1 = r6.getDeclaredMethods()
            java.util.List r6 = org.apache.commons.lang3.ClassUtils.getAllSuperclasses(r6)
            java.util.Iterator r6 = r6.iterator()
        L1b:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r6.next()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.reflect.Method[] r2 = r2.getDeclaredMethods()
            java.lang.Object[] r1 = org.apache.commons.lang3.ArrayUtils.addAll(r1, r2)
            java.lang.reflect.Method[] r1 = (java.lang.reflect.Method[]) r1
            goto L1b
        L32:
            r6 = 0
            int r2 = r1.length
        L34:
            if (r0 >= r2) goto L7b
            r3 = r1[r0]
            java.lang.String r4 = r3.getName()
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L4d
            java.lang.Class[] r4 = r3.getParameterTypes()
            boolean r4 = java.util.Objects.deepEquals(r8, r4)
            if (r4 == 0) goto L4d
            return r3
        L4d:
            java.lang.String r4 = r3.getName()
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L78
            java.lang.Class[] r4 = r3.getParameterTypes()
            r5 = 1
            boolean r4 = org.apache.commons.lang3.ClassUtils.isAssignable(r8, r4, r5)
            if (r4 == 0) goto L78
            if (r6 != 0) goto L65
            goto L77
        L65:
            java.lang.Class[] r4 = r3.getParameterTypes()
            int r4 = distance(r8, r4)
            java.lang.Class[] r5 = r6.getParameterTypes()
            int r5 = distance(r8, r5)
            if (r4 >= r5) goto L78
        L77:
            r6 = r3
        L78:
            int r0 = r0 + 1
            goto L34
        L7b:
            return r6
    }

    public static java.util.List<java.lang.reflect.Method> getMethodsListWithAnnotation(java.lang.Class<?> r1, java.lang.Class<? extends java.lang.annotation.Annotation> r2) {
            r0 = 0
            java.util.List r1 = getMethodsListWithAnnotation(r1, r2, r0, r0)
            return r1
    }

    public static java.util.List<java.lang.reflect.Method> getMethodsListWithAnnotation(java.lang.Class<?> r6, java.lang.Class<? extends java.lang.annotation.Annotation> r7, boolean r8, boolean r9) {
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "The class must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            if (r7 == 0) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "The annotation class must not be null"
            org.apache.commons.lang3.Validate.isTrue(r0, r3, r2)
            if (r8 == 0) goto L20
            java.util.List r8 = getAllSuperclassesAndInterfaces(r6)
            goto L25
        L20:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L25:
            r8.add(r1, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r8 = r8.iterator()
        L31:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r8.next()
            java.lang.Class r0 = (java.lang.Class) r0
            if (r9 == 0) goto L44
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            goto L48
        L44:
            java.lang.reflect.Method[] r0 = r0.getMethods()
        L48:
            int r2 = r0.length
            r3 = 0
        L4a:
            if (r3 >= r2) goto L31
            r4 = r0[r3]
            java.lang.annotation.Annotation r5 = r4.getAnnotation(r7)
            if (r5 == 0) goto L57
            r6.add(r4)
        L57:
            int r3 = r3 + 1
            goto L4a
        L5a:
            return r6
    }

    public static java.lang.reflect.Method[] getMethodsWithAnnotation(java.lang.Class<?> r1, java.lang.Class<? extends java.lang.annotation.Annotation> r2) {
            r0 = 0
            java.lang.reflect.Method[] r1 = getMethodsWithAnnotation(r1, r2, r0, r0)
            return r1
    }

    public static java.lang.reflect.Method[] getMethodsWithAnnotation(java.lang.Class<?> r0, java.lang.Class<? extends java.lang.annotation.Annotation> r1, boolean r2, boolean r3) {
            java.util.List r0 = getMethodsListWithAnnotation(r0, r1, r2, r3)
            int r1 = r0.size()
            java.lang.reflect.Method[] r1 = new java.lang.reflect.Method[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.reflect.Method[] r0 = (java.lang.reflect.Method[]) r0
            return r0
    }

    public static java.util.Set<java.lang.reflect.Method> getOverrideHierarchy(java.lang.reflect.Method r8, org.apache.commons.lang3.ClassUtils.Interfaces r9) {
            org.apache.commons.lang3.Validate.notNull(r8)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r0.add(r8)
            java.lang.Class[] r1 = r8.getParameterTypes()
            java.lang.Class r2 = r8.getDeclaringClass()
            java.lang.Iterable r9 = org.apache.commons.lang3.ClassUtils.hierarchy(r2, r9)
            java.util.Iterator r9 = r9.iterator()
            r9.next()
        L1e:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L71
            java.lang.Object r3 = r9.next()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.String r4 = r8.getName()
            java.lang.reflect.Method r3 = getMatchingAccessibleMethod(r3, r4, r1)
            if (r3 != 0) goto L35
            goto L1e
        L35:
            java.lang.Class[] r4 = r3.getParameterTypes()
            boolean r4 = java.util.Arrays.equals(r4, r1)
            if (r4 == 0) goto L43
            r0.add(r3)
            goto L1e
        L43:
            java.lang.Class r4 = r3.getDeclaringClass()
            java.util.Map r4 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(r2, r4)
            r5 = 0
        L4c:
            int r6 = r1.length
            if (r5 >= r6) goto L6d
            java.lang.reflect.Type[] r6 = r8.getGenericParameterTypes()
            r6 = r6[r5]
            java.lang.reflect.Type r6 = org.apache.commons.lang3.reflect.TypeUtils.unrollVariables(r4, r6)
            java.lang.reflect.Type[] r7 = r3.getGenericParameterTypes()
            r7 = r7[r5]
            java.lang.reflect.Type r7 = org.apache.commons.lang3.reflect.TypeUtils.unrollVariables(r4, r7)
            boolean r6 = org.apache.commons.lang3.reflect.TypeUtils.equals(r6, r7)
            if (r6 != 0) goto L6a
            goto L1e
        L6a:
            int r5 = r5 + 1
            goto L4c
        L6d:
            r0.add(r3)
            goto L1e
        L71:
            return r0
    }

    static java.lang.Object[] getVarArgs(java.lang.Object[] r6, java.lang.Class<?>[] r7) {
            int r0 = r6.length
            int r1 = r7.length
            if (r0 != r1) goto L19
            int r0 = r6.length
            int r0 = r0 + (-1)
            r0 = r6[r0]
            java.lang.Class r0 = r0.getClass()
            int r1 = r7.length
            int r1 = r1 + (-1)
            r1 = r7[r1]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L19
            return r6
        L19:
            int r0 = r7.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r7.length
            int r1 = r1 + (-1)
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r0, r2, r1)
            int r1 = r7.length
            int r1 = r1 + (-1)
            r1 = r7[r1]
            java.lang.Class r1 = r1.getComponentType()
            int r3 = r6.length
            int r4 = r7.length
            int r3 = r3 - r4
            int r3 = r3 + 1
            java.lang.Class r4 = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(r1)
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r3)
            int r5 = r7.length
            int r5 = r5 + (-1)
            java.lang.System.arraycopy(r6, r5, r4, r2, r3)
            boolean r6 = r1.isPrimitive()
            if (r6 == 0) goto L49
            java.lang.Object r4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(r4)
        L49:
            int r6 = r7.length
            int r6 = r6 + (-1)
            r0[r6] = r4
            return r0
    }

    public static java.lang.Object invokeExactMethod(java.lang.Object r2, java.lang.String r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY
            r1 = 0
            java.lang.Object r2 = invokeExactMethod(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.Object invokeExactMethod(java.lang.Object r1, java.lang.String r2, java.lang.Object... r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.Class[] r0 = org.apache.commons.lang3.ClassUtils.toClass(r3)
            java.lang.Object r1 = invokeExactMethod(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.Object invokeExactMethod(java.lang.Object r1, java.lang.String r2, java.lang.Object[] r3, java.lang.Class<?>[] r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.Class[] r4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r4)
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Method r4 = getAccessibleMethod(r0, r2, r4)
            if (r4 == 0) goto L17
            java.lang.Object r1 = r4.invoke(r1, r3)
            return r1
        L17:
            java.lang.NoSuchMethodException r3 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "No such accessible method: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = "() on object: "
            r4.append(r2)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            throw r3
    }

    public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object... r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.Class[] r0 = org.apache.commons.lang3.ClassUtils.toClass(r3)
            java.lang.Object r1 = invokeExactStaticMethod(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object[] r3, java.lang.Class<?>[] r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.Class[] r4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r4)
            java.lang.reflect.Method r4 = getAccessibleMethod(r1, r2, r4)
            if (r4 == 0) goto L14
            r1 = 0
            java.lang.Object r1 = r4.invoke(r1, r3)
            return r1
        L14:
            java.lang.NoSuchMethodException r3 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "No such accessible method: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = "() on class: "
            r4.append(r2)
            java.lang.String r1 = r1.getName()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            throw r3
    }

    public static java.lang.Object invokeMethod(java.lang.Object r2, java.lang.String r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY
            r1 = 0
            java.lang.Object r2 = invokeMethod(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.Object invokeMethod(java.lang.Object r1, java.lang.String r2, java.lang.Object... r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.Class[] r0 = org.apache.commons.lang3.ClassUtils.toClass(r3)
            java.lang.Object r1 = invokeMethod(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.Object invokeMethod(java.lang.Object r1, java.lang.String r2, java.lang.Object[] r3, java.lang.Class<?>[] r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r0 = 0
            java.lang.Object r1 = invokeMethod(r1, r0, r2, r3, r4)
            return r1
    }

    public static java.lang.Object invokeMethod(java.lang.Object r2, boolean r3, java.lang.String r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY
            r1 = 0
            java.lang.Object r2 = invokeMethod(r2, r3, r4, r0, r1)
            return r2
    }

    public static java.lang.Object invokeMethod(java.lang.Object r1, boolean r2, java.lang.String r3, java.lang.Object... r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r4)
            java.lang.Class[] r0 = org.apache.commons.lang3.ClassUtils.toClass(r4)
            java.lang.Object r1 = invokeMethod(r1, r2, r3, r4, r0)
            return r1
    }

    public static java.lang.Object invokeMethod(java.lang.Object r0, boolean r1, java.lang.String r2, java.lang.Object[] r3, java.lang.Class<?>[] r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Class[] r4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r4)
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r0.getClass()
            java.lang.reflect.Method r1 = getMatchingMethod(r1, r2, r4)
            if (r1 == 0) goto L1e
            boolean r4 = r1.isAccessible()
            if (r4 != 0) goto L1e
            r4 = 1
            r1.setAccessible(r4)
        L1e:
            java.lang.String r4 = "No such method: "
            goto L2b
        L21:
            java.lang.Class r1 = r0.getClass()
            java.lang.reflect.Method r1 = getMatchingAccessibleMethod(r1, r2, r4)
            java.lang.String r4 = "No such accessible method: "
        L2b:
            if (r1 == 0) goto L36
            java.lang.Object[] r2 = toVarArgs(r1, r3)
            java.lang.Object r0 = r1.invoke(r0, r2)
            return r0
        L36:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = "() on object: "
            r3.append(r2)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
    }

    public static java.lang.Object invokeStaticMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object... r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.Class[] r0 = org.apache.commons.lang3.ClassUtils.toClass(r3)
            java.lang.Object r1 = invokeStaticMethod(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.Object invokeStaticMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object[] r3, java.lang.Class<?>[] r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.Class[] r4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r4)
            java.lang.reflect.Method r4 = getMatchingAccessibleMethod(r1, r2, r4)
            if (r4 == 0) goto L18
            java.lang.Object[] r1 = toVarArgs(r4, r3)
            r2 = 0
            java.lang.Object r1 = r4.invoke(r2, r1)
            return r1
        L18:
            java.lang.NoSuchMethodException r3 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "No such accessible method: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = "() on class: "
            r4.append(r2)
            java.lang.String r1 = r1.getName()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            throw r3
    }

    private static java.lang.Object[] toVarArgs(java.lang.reflect.Method r1, java.lang.Object[] r2) {
            boolean r0 = r1.isVarArgs()
            if (r0 == 0) goto Le
            java.lang.Class[] r1 = r1.getParameterTypes()
            java.lang.Object[] r2 = getVarArgs(r2, r1)
        Le:
            return r2
    }
}
