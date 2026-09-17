package org.apache.commons.lang3.reflect;

/* loaded from: classes2.dex */
abstract class MemberUtils {
    private static final int ACCESS_TEST = 7;
    private static final java.lang.Class<?>[] ORDERED_PRIMITIVE_TYPES = null;

    private static final class Executable {
        private final boolean isVarArgs;
        private final java.lang.Class<?>[] parameterTypes;

        private Executable(java.lang.reflect.Constructor<?> r2) {
                r1 = this;
                r1.<init>()
                java.lang.Class[] r0 = r2.getParameterTypes()
                r1.parameterTypes = r0
                boolean r2 = r2.isVarArgs()
                r1.isVarArgs = r2
                return
        }

        private Executable(java.lang.reflect.Method r2) {
                r1 = this;
                r1.<init>()
                java.lang.Class[] r0 = r2.getParameterTypes()
                r1.parameterTypes = r0
                boolean r2 = r2.isVarArgs()
                r1.isVarArgs = r2
                return
        }

        static /* synthetic */ org.apache.commons.lang3.reflect.MemberUtils.Executable access$000(java.lang.reflect.Constructor r0) {
                org.apache.commons.lang3.reflect.MemberUtils$Executable r0 = of(r0)
                return r0
        }

        static /* synthetic */ org.apache.commons.lang3.reflect.MemberUtils.Executable access$100(java.lang.reflect.Method r0) {
                org.apache.commons.lang3.reflect.MemberUtils$Executable r0 = of(r0)
                return r0
        }

        private static org.apache.commons.lang3.reflect.MemberUtils.Executable of(java.lang.reflect.Constructor<?> r1) {
                org.apache.commons.lang3.reflect.MemberUtils$Executable r0 = new org.apache.commons.lang3.reflect.MemberUtils$Executable
                r0.<init>(r1)
                return r0
        }

        private static org.apache.commons.lang3.reflect.MemberUtils.Executable of(java.lang.reflect.Method r1) {
                org.apache.commons.lang3.reflect.MemberUtils$Executable r0 = new org.apache.commons.lang3.reflect.MemberUtils$Executable
                r0.<init>(r1)
                return r0
        }

        public java.lang.Class<?>[] getParameterTypes() {
                r1 = this;
                java.lang.Class<?>[] r0 = r1.parameterTypes
                return r0
        }

        public boolean isVarArgs() {
                r1 = this;
                boolean r0 = r1.isVarArgs
                return r0
        }
    }

    static {
            r0 = 7
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class r1 = java.lang.Byte.TYPE
            r2 = 0
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Short.TYPE
            r2 = 1
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Character.TYPE
            r2 = 2
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 3
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r2 = 4
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r2 = 5
            r0[r2] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            r2 = 6
            r0[r2] = r1
            org.apache.commons.lang3.reflect.MemberUtils.ORDERED_PRIMITIVE_TYPES = r0
            return
    }

    MemberUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static int compareConstructorFit(java.lang.reflect.Constructor<?> r0, java.lang.reflect.Constructor<?> r1, java.lang.Class<?>[] r2) {
            org.apache.commons.lang3.reflect.MemberUtils$Executable r0 = org.apache.commons.lang3.reflect.MemberUtils.Executable.access$000(r0)
            org.apache.commons.lang3.reflect.MemberUtils$Executable r1 = org.apache.commons.lang3.reflect.MemberUtils.Executable.access$000(r1)
            int r0 = compareParameterTypes(r0, r1, r2)
            return r0
    }

    static int compareMethodFit(java.lang.reflect.Method r0, java.lang.reflect.Method r1, java.lang.Class<?>[] r2) {
            org.apache.commons.lang3.reflect.MemberUtils$Executable r0 = org.apache.commons.lang3.reflect.MemberUtils.Executable.access$100(r0)
            org.apache.commons.lang3.reflect.MemberUtils$Executable r1 = org.apache.commons.lang3.reflect.MemberUtils.Executable.access$100(r1)
            int r0 = compareParameterTypes(r0, r1, r2)
            return r0
    }

    private static int compareParameterTypes(org.apache.commons.lang3.reflect.MemberUtils.Executable r0, org.apache.commons.lang3.reflect.MemberUtils.Executable r1, java.lang.Class<?>[] r2) {
            float r0 = getTotalTransformationCost(r2, r0)
            float r1 = getTotalTransformationCost(r2, r1)
            int r0 = java.lang.Float.compare(r0, r1)
            return r0
    }

    private static float getObjectTransformationCost(java.lang.Class<?> r2, java.lang.Class<?> r3) {
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto Lb
            float r2 = getPrimitivePromotionCost(r2, r3)
            return r2
        Lb:
            r0 = 0
        Lc:
            if (r2 == 0) goto L2c
            boolean r1 = r3.equals(r2)
            if (r1 != 0) goto L2c
            boolean r1 = r3.isInterface()
            if (r1 == 0) goto L24
            boolean r1 = org.apache.commons.lang3.ClassUtils.isAssignable(r2, r3)
            if (r1 == 0) goto L24
            r3 = 1048576000(0x3e800000, float:0.25)
            float r0 = r0 + r3
            goto L2c
        L24:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r1
            java.lang.Class r2 = r2.getSuperclass()
            goto Lc
        L2c:
            if (r2 != 0) goto L31
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r0 = r0 + r2
        L31:
            return r0
    }

    private static float getPrimitivePromotionCost(java.lang.Class<?> r5, java.lang.Class<?> r6) {
            boolean r0 = r5.isPrimitive()
            r1 = 1036831949(0x3dcccccd, float:0.1)
            if (r0 != 0) goto L11
            java.lang.Class r5 = org.apache.commons.lang3.ClassUtils.wrapperToPrimitive(r5)
            r0 = 1036831949(0x3dcccccd, float:0.1)
            goto L12
        L11:
            r0 = 0
        L12:
            r2 = 0
        L13:
            if (r5 == r6) goto L2b
            java.lang.Class<?>[] r3 = org.apache.commons.lang3.reflect.MemberUtils.ORDERED_PRIMITIVE_TYPES
            int r4 = r3.length
            if (r2 >= r4) goto L2b
            r4 = r3[r2]
            if (r5 != r4) goto L28
            float r0 = r0 + r1
            int r4 = r3.length
            int r4 = r4 + (-1)
            if (r2 >= r4) goto L28
            int r5 = r2 + 1
            r5 = r3[r5]
        L28:
            int r2 = r2 + 1
            goto L13
        L2b:
            return r0
    }

    private static float getTotalTransformationCost(java.lang.Class<?>[] r10, org.apache.commons.lang3.reflect.MemberUtils.Executable r11) {
            java.lang.Class[] r0 = r11.getParameterTypes()
            boolean r11 = r11.isVarArgs()
            r1 = 1
            int r2 = r0.length
            if (r11 == 0) goto Ld
            int r2 = r2 - r1
        Ld:
            long r2 = (long) r2
            int r4 = r10.length
            long r4 = (long) r4
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L18
            r10 = 2139095039(0x7f7fffff, float:3.4028235E38)
            return r10
        L18:
            r4 = 0
            r5 = 0
            r6 = 0
        L1b:
            long r7 = (long) r6
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 >= 0) goto L2c
            r7 = r10[r6]
            r8 = r0[r6]
            float r7 = getObjectTransformationCost(r7, r8)
            float r5 = r5 + r7
            int r6 = r6 + 1
            goto L1b
        L2c:
            if (r11 == 0) goto L79
            int r11 = r10.length
            int r2 = r0.length
            if (r11 >= r2) goto L34
            r11 = 1
            goto L35
        L34:
            r11 = 0
        L35:
            int r2 = r10.length
            int r3 = r0.length
            if (r2 != r3) goto L44
            int r2 = r10.length
            int r2 = r2 - r1
            r2 = r10[r2]
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L44
            r4 = 1
        L44:
            int r2 = r0.length
            int r2 = r2 - r1
            r2 = r0[r2]
            java.lang.Class r2 = r2.getComponentType()
            r3 = 981668463(0x3a83126f, float:0.001)
            if (r11 == 0) goto L5a
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            float r10 = getObjectTransformationCost(r2, r10)
        L57:
            float r10 = r10 + r3
            float r5 = r5 + r10
            goto L79
        L5a:
            if (r4 == 0) goto L69
            int r11 = r10.length
            int r11 = r11 - r1
            r10 = r10[r11]
            java.lang.Class r10 = r10.getComponentType()
            float r10 = getObjectTransformationCost(r10, r2)
            goto L57
        L69:
            int r11 = r0.length
            int r11 = r11 - r1
        L6b:
            int r0 = r10.length
            if (r11 >= r0) goto L79
            r0 = r10[r11]
            float r0 = getObjectTransformationCost(r0, r2)
            float r0 = r0 + r3
            float r5 = r5 + r0
            int r11 = r11 + 1
            goto L6b
        L79:
            return r5
    }

    static boolean isAccessible(java.lang.reflect.Member r1) {
            if (r1 == 0) goto L14
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L14
            boolean r1 = r1.isSynthetic()
            if (r1 != 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    static boolean isMatchingConstructor(java.lang.reflect.Constructor<?> r0, java.lang.Class<?>[] r1) {
            org.apache.commons.lang3.reflect.MemberUtils$Executable r0 = org.apache.commons.lang3.reflect.MemberUtils.Executable.access$000(r0)
            boolean r0 = isMatchingExecutable(r0, r1)
            return r0
    }

    private static boolean isMatchingExecutable(org.apache.commons.lang3.reflect.MemberUtils.Executable r5, java.lang.Class<?>[] r6) {
            java.lang.Class[] r0 = r5.getParameterTypes()
            r1 = 1
            boolean r2 = org.apache.commons.lang3.ClassUtils.isAssignable(r6, r0, r1)
            if (r2 == 0) goto Lc
            return r1
        Lc:
            boolean r5 = r5.isVarArgs()
            r2 = 0
            if (r5 == 0) goto L41
            r5 = 0
        L14:
            int r3 = r0.length
            int r3 = r3 - r1
            if (r5 >= r3) goto L29
            int r3 = r6.length
            if (r5 >= r3) goto L29
            r3 = r6[r5]
            r4 = r0[r5]
            boolean r3 = org.apache.commons.lang3.ClassUtils.isAssignable(r3, r4, r1)
            if (r3 != 0) goto L26
            return r2
        L26:
            int r5 = r5 + 1
            goto L14
        L29:
            int r3 = r0.length
            int r3 = r3 - r1
            r0 = r0[r3]
            java.lang.Class r0 = r0.getComponentType()
        L31:
            int r3 = r6.length
            if (r5 >= r3) goto L40
            r3 = r6[r5]
            boolean r3 = org.apache.commons.lang3.ClassUtils.isAssignable(r3, r0, r1)
            if (r3 != 0) goto L3d
            return r2
        L3d:
            int r5 = r5 + 1
            goto L31
        L40:
            return r1
        L41:
            return r2
    }

    static boolean isMatchingMethod(java.lang.reflect.Method r0, java.lang.Class<?>[] r1) {
            org.apache.commons.lang3.reflect.MemberUtils$Executable r0 = org.apache.commons.lang3.reflect.MemberUtils.Executable.access$100(r0)
            boolean r0 = isMatchingExecutable(r0, r1)
            return r0
    }

    static boolean isPackageAccess(int r0) {
            r0 = r0 & 7
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    static boolean setAccessibleWorkaround(java.lang.reflect.AccessibleObject r3) {
            r0 = 0
            if (r3 == 0) goto L30
            boolean r1 = r3.isAccessible()
            if (r1 == 0) goto La
            goto L30
        La:
            r1 = r3
            java.lang.reflect.Member r1 = (java.lang.reflect.Member) r1
            boolean r2 = r3.isAccessible()
            if (r2 != 0) goto L30
            int r2 = r1.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)
            if (r2 == 0) goto L30
            java.lang.Class r1 = r1.getDeclaringClass()
            int r1 = r1.getModifiers()
            boolean r1 = isPackageAccess(r1)
            if (r1 == 0) goto L30
            r1 = 1
            r3.setAccessible(r1)     // Catch: java.lang.SecurityException -> L30
            return r1
        L30:
            return r0
    }
}
