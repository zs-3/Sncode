package org.apache.commons.lang3.event;

/* loaded from: classes2.dex */
public class EventUtils {

    private static class EventBindingInvocationHandler implements java.lang.reflect.InvocationHandler {
        private final java.util.Set<java.lang.String> eventTypes;
        private final java.lang.String methodName;
        private final java.lang.Object target;

        EventBindingInvocationHandler(java.lang.Object r1, java.lang.String r2, java.lang.String[] r3) {
                r0 = this;
                r0.<init>()
                r0.target = r1
                r0.methodName = r2
                java.util.HashSet r1 = new java.util.HashSet
                java.util.List r2 = java.util.Arrays.asList(r3)
                r1.<init>(r2)
                r0.eventTypes = r1
                return
        }

        private boolean hasMatchingParametersMethod(java.lang.reflect.Method r3) {
                r2 = this;
                java.lang.Object r0 = r2.target
                java.lang.Class r0 = r0.getClass()
                java.lang.String r1 = r2.methodName
                java.lang.Class[] r3 = r3.getParameterTypes()
                java.lang.reflect.Method r3 = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(r0, r1, r3)
                if (r3 == 0) goto L14
                r3 = 1
                goto L15
            L14:
                r3 = 0
            L15:
                return r3
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object r2, java.lang.reflect.Method r3, java.lang.Object[] r4) throws java.lang.Throwable {
                r1 = this;
                java.util.Set<java.lang.String> r2 = r1.eventTypes
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L17
                java.util.Set<java.lang.String> r2 = r1.eventTypes
                java.lang.String r0 = r3.getName()
                boolean r2 = r2.contains(r0)
                if (r2 == 0) goto L15
                goto L17
            L15:
                r2 = 0
                return r2
            L17:
                boolean r2 = r1.hasMatchingParametersMethod(r3)
                if (r2 == 0) goto L26
                java.lang.Object r2 = r1.target
                java.lang.String r3 = r1.methodName
                java.lang.Object r2 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(r2, r3, r4)
                return r2
            L26:
                java.lang.Object r2 = r1.target
                java.lang.String r3 = r1.methodName
                java.lang.Object r2 = org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(r2, r3)
                return r2
        }
    }

    public EventUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <L> void addEventListener(java.lang.Object r6, java.lang.Class<L> r7, L r8) {
            java.lang.String r0 = "."
            java.lang.String r1 = " method which takes a parameter of type "
            java.lang.String r2 = "Class "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.IllegalAccessException -> L32 java.lang.NoSuchMethodException -> L68
            r3.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.IllegalAccessException -> L32 java.lang.NoSuchMethodException -> L68
            java.lang.String r4 = "add"
            r3.append(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.IllegalAccessException -> L32 java.lang.NoSuchMethodException -> L68
            java.lang.String r4 = r7.getSimpleName()     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.IllegalAccessException -> L32 java.lang.NoSuchMethodException -> L68
            r3.append(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.IllegalAccessException -> L32 java.lang.NoSuchMethodException -> L68
            java.lang.String r3 = r3.toString()     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.IllegalAccessException -> L32 java.lang.NoSuchMethodException -> L68
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.IllegalAccessException -> L32 java.lang.NoSuchMethodException -> L68
            r5 = 0
            r4[r5] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.IllegalAccessException -> L32 java.lang.NoSuchMethodException -> L68
            org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(r6, r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L25 java.lang.IllegalAccessException -> L32 java.lang.NoSuchMethodException -> L68
            return
        L25:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.Throwable r6 = r6.getCause()
            java.lang.String r8 = "Unable to add listener."
            r7.<init>(r8, r6)
            throw r7
        L32:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r3.append(r6)
            java.lang.String r6 = " does not have an accessible add"
            r3.append(r6)
            java.lang.String r6 = r7.getSimpleName()
            r3.append(r6)
            r3.append(r1)
            java.lang.String r6 = r7.getName()
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            r8.<init>(r6)
            throw r8
        L68:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r3.append(r6)
            java.lang.String r6 = " does not have a public add"
            r3.append(r6)
            java.lang.String r6 = r7.getSimpleName()
            r3.append(r6)
            r3.append(r1)
            java.lang.String r6 = r7.getName()
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            r8.<init>(r6)
            throw r8
    }

    public static <L> void bindEventsToMethod(java.lang.Object r3, java.lang.String r4, java.lang.Object r5, java.lang.Class<L> r6, java.lang.String... r7) {
            java.lang.Class r0 = r3.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r1[r2] = r6
            org.apache.commons.lang3.event.EventUtils$EventBindingInvocationHandler r2 = new org.apache.commons.lang3.event.EventUtils$EventBindingInvocationHandler
            r2.<init>(r3, r4, r7)
            java.lang.Object r3 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r2)
            java.lang.Object r3 = r6.cast(r3)
            addEventListener(r5, r6, r3)
            return
    }
}
