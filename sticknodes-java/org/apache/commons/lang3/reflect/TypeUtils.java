package org.apache.commons.lang3.reflect;

/* loaded from: classes2.dex */
public class TypeUtils {
    public static final java.lang.reflect.WildcardType WILDCARD_ALL = null;


    private static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType {
        private final java.lang.reflect.Type componentType;

        private GenericArrayTypeImpl(java.lang.reflect.Type r1) {
                r0 = this;
                r0.<init>()
                r0.componentType = r1
                return
        }

        /* synthetic */ GenericArrayTypeImpl(java.lang.reflect.Type r1, org.apache.commons.lang3.reflect.TypeUtils.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r2 == r1) goto L11
                boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
                if (r0 == 0) goto Lf
                java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
                boolean r2 = org.apache.commons.lang3.reflect.TypeUtils.access$100(r1, r2)
                if (r2 == 0) goto Lf
                goto L11
            Lf:
                r2 = 0
                goto L12
            L11:
                r2 = 1
            L12:
                return r2
        }

        @Override // java.lang.reflect.GenericArrayType
        public java.lang.reflect.Type getGenericComponentType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.componentType
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.componentType
                int r0 = r0.hashCode()
                r0 = r0 | 1072(0x430, float:1.502E-42)
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = org.apache.commons.lang3.reflect.TypeUtils.toString(r1)
                return r0
        }
    }

    private static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType {
        private final java.lang.Class<?> raw;
        private final java.lang.reflect.Type[] typeArguments;
        private final java.lang.reflect.Type useOwner;

        private ParameterizedTypeImpl(java.lang.Class<?> r1, java.lang.reflect.Type r2, java.lang.reflect.Type[] r3) {
                r0 = this;
                r0.<init>()
                r0.raw = r1
                r0.useOwner = r2
                int r1 = r3.length
                java.lang.Class<java.lang.reflect.Type[]> r2 = java.lang.reflect.Type[].class
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1, r2)
                java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
                r0.typeArguments = r1
                return
        }

        /* synthetic */ ParameterizedTypeImpl(java.lang.Class r1, java.lang.reflect.Type r2, java.lang.reflect.Type[] r3, org.apache.commons.lang3.reflect.TypeUtils.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r2 == r1) goto L11
                boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto Lf
                java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
                boolean r2 = org.apache.commons.lang3.reflect.TypeUtils.access$200(r1, r2)
                if (r2 == 0) goto Lf
                goto L11
            Lf:
                r2 = 0
                goto L12
            L11:
                r2 = 1
            L12:
                return r2
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type[] getActualTypeArguments() {
                r1 = this;
                java.lang.reflect.Type[] r0 = r1.typeArguments
                java.lang.Object r0 = r0.clone()
                java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getOwnerType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.useOwner
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getRawType() {
                r1 = this;
                java.lang.Class<?> r0 = r1.raw
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class<?> r0 = r2.raw
                int r0 = r0.hashCode()
                r0 = r0 | 1136(0x470, float:1.592E-42)
                int r0 = r0 << 4
                java.lang.reflect.Type r1 = r2.useOwner
                int r1 = java.util.Objects.hashCode(r1)
                r0 = r0 | r1
                int r0 = r0 << 8
                java.lang.reflect.Type[] r1 = r2.typeArguments
                int r1 = java.util.Arrays.hashCode(r1)
                r0 = r0 | r1
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = org.apache.commons.lang3.reflect.TypeUtils.toString(r1)
                return r0
        }
    }

    public static class WildcardTypeBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.reflect.WildcardType> {
        private java.lang.reflect.Type[] lowerBounds;
        private java.lang.reflect.Type[] upperBounds;

        private WildcardTypeBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ WildcardTypeBuilder(org.apache.commons.lang3.reflect.TypeUtils.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.builder.Builder
        public /* bridge */ /* synthetic */ java.lang.reflect.WildcardType build() {
                r1 = this;
                java.lang.reflect.WildcardType r0 = r1.build2()
                return r0
        }

        @Override // org.apache.commons.lang3.builder.Builder
        /* renamed from: build, reason: avoid collision after fix types in other method */
        public java.lang.reflect.WildcardType build2() {
                r4 = this;
                org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeImpl r0 = new org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeImpl
                java.lang.reflect.Type[] r1 = r4.upperBounds
                java.lang.reflect.Type[] r2 = r4.lowerBounds
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder withLowerBounds(java.lang.reflect.Type... r1) {
                r0 = this;
                r0.lowerBounds = r1
                return r0
        }

        public org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder withUpperBounds(java.lang.reflect.Type... r1) {
                r0 = this;
                r0.upperBounds = r1
                return r0
        }
    }

    private static final class WildcardTypeImpl implements java.lang.reflect.WildcardType {
        private static final java.lang.reflect.Type[] EMPTY_BOUNDS = null;
        private final java.lang.reflect.Type[] lowerBounds;
        private final java.lang.reflect.Type[] upperBounds;

        static {
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeImpl.EMPTY_BOUNDS = r0
                return
        }

        private WildcardTypeImpl(java.lang.reflect.Type[] r2, java.lang.reflect.Type[] r3) {
                r1 = this;
                r1.<init>()
                java.lang.reflect.Type[] r0 = org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeImpl.EMPTY_BOUNDS
                java.lang.Object r2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(r2, r0)
                java.lang.reflect.Type[] r2 = (java.lang.reflect.Type[]) r2
                r1.upperBounds = r2
                java.lang.Object r2 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(r3, r0)
                java.lang.reflect.Type[] r2 = (java.lang.reflect.Type[]) r2
                r1.lowerBounds = r2
                return
        }

        /* synthetic */ WildcardTypeImpl(java.lang.reflect.Type[] r1, java.lang.reflect.Type[] r2, org.apache.commons.lang3.reflect.TypeUtils.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r2 == r1) goto L11
                boolean r0 = r2 instanceof java.lang.reflect.WildcardType
                if (r0 == 0) goto Lf
                java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
                boolean r2 = org.apache.commons.lang3.reflect.TypeUtils.access$300(r1, r2)
                if (r2 == 0) goto Lf
                goto L11
            Lf:
                r2 = 0
                goto L12
            L11:
                r2 = 1
            L12:
                return r2
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getLowerBounds() {
                r1 = this;
                java.lang.reflect.Type[] r0 = r1.lowerBounds
                java.lang.Object r0 = r0.clone()
                java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                return r0
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getUpperBounds() {
                r1 = this;
                java.lang.reflect.Type[] r0 = r1.upperBounds
                java.lang.Object r0 = r0.clone()
                java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.reflect.Type[] r0 = r2.upperBounds
                int r0 = java.util.Arrays.hashCode(r0)
                r0 = r0 | 18688(0x4900, float:2.6187E-41)
                int r0 = r0 << 8
                java.lang.reflect.Type[] r1 = r2.lowerBounds
                int r1 = java.util.Arrays.hashCode(r1)
                r0 = r0 | r1
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = org.apache.commons.lang3.reflect.TypeUtils.toString(r1)
                return r0
        }
    }

    static {
            org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder r0 = wildcardType()
            r1 = 1
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            r2 = 0
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r1[r2] = r3
            org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder r0 = r0.withUpperBounds(r1)
            java.lang.reflect.WildcardType r0 = r0.build2()
            org.apache.commons.lang3.reflect.TypeUtils.WILDCARD_ALL = r0
            return
    }

    public TypeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ boolean access$100(java.lang.reflect.GenericArrayType r0, java.lang.reflect.Type r1) {
            boolean r0 = equals(r0, r1)
            return r0
    }

    static /* synthetic */ boolean access$200(java.lang.reflect.ParameterizedType r0, java.lang.reflect.Type r1) {
            boolean r0 = equals(r0, r1)
            return r0
    }

    static /* synthetic */ boolean access$300(java.lang.reflect.WildcardType r0, java.lang.reflect.Type r1) {
            boolean r0 = equals(r0, r1)
            return r0
    }

    private static <T> java.lang.StringBuilder appendAllTo(java.lang.StringBuilder r2, java.lang.String r3, T... r4) {
            java.lang.Object[] r0 = org.apache.commons.lang3.Validate.noNullElements(r4)
            org.apache.commons.lang3.Validate.notEmpty(r0)
            int r0 = r4.length
            if (r0 <= 0) goto L27
            r0 = 0
            r0 = r4[r0]
            java.lang.String r0 = toString(r0)
            r2.append(r0)
            r0 = 1
        L15:
            int r1 = r4.length
            if (r0 >= r1) goto L27
            r2.append(r3)
            r1 = r4[r0]
            java.lang.String r1 = toString(r1)
            r2.append(r1)
            int r0 = r0 + 1
            goto L15
        L27:
            return r2
    }

    private static void appendRecursiveTypes(java.lang.StringBuilder r6, int[] r7, java.lang.reflect.Type[] r8) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r7.length
            r3 = 62
            java.lang.String r4 = ", "
            r5 = 60
            if (r1 >= r2) goto L23
            r6.append(r5)
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r5 = r8[r1]
            java.lang.String r5 = r5.toString()
            r2[r0] = r5
            java.lang.StringBuilder r2 = appendAllTo(r6, r4, r2)
            r2.append(r3)
            int r1 = r1 + 1
            goto L2
        L23:
            java.lang.Object[] r7 = org.apache.commons.lang3.ArrayUtils.removeAll(r8, r7)
            java.lang.reflect.Type[] r7 = (java.lang.reflect.Type[]) r7
            int r8 = r7.length
            if (r8 <= 0) goto L36
            r6.append(r5)
            java.lang.StringBuilder r6 = appendAllTo(r6, r4, r7)
            r6.append(r3)
        L36:
            return
    }

    private static java.lang.String classToString(java.lang.Class<?> r2) {
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r2 = r2.getComponentType()
            java.lang.String r2 = toString(r2)
            r0.append(r2)
            java.lang.String r2 = "[]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L20:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getEnclosingClass()
            if (r1 == 0) goto L43
            java.lang.Class r1 = r2.getEnclosingClass()
            java.lang.String r1 = classToString(r1)
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            java.lang.String r1 = r2.getSimpleName()
            r0.append(r1)
            goto L4a
        L43:
            java.lang.String r1 = r2.getName()
            r0.append(r1)
        L4a:
            java.lang.reflect.TypeVariable[] r1 = r2.getTypeParameters()
            int r1 = r1.length
            if (r1 <= 0) goto L64
            r1 = 60
            r0.append(r1)
            java.lang.reflect.TypeVariable[] r2 = r2.getTypeParameters()
            java.lang.String r1 = ", "
            appendAllTo(r0, r1, r2)
            r2 = 62
            r0.append(r2)
        L64:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static boolean containsTypeVariables(java.lang.reflect.Type r5) {
            boolean r0 = r5 instanceof java.lang.reflect.TypeVariable
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r5 instanceof java.lang.Class
            r2 = 0
            if (r0 == 0) goto L17
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.reflect.TypeVariable[] r5 = r5.getTypeParameters()
            int r5 = r5.length
            if (r5 <= 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
        L17:
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L32
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            int r0 = r5.length
            r3 = 0
        L23:
            if (r3 >= r0) goto L31
            r4 = r5[r3]
            boolean r4 = containsTypeVariables(r4)
            if (r4 == 0) goto L2e
            return r1
        L2e:
            int r3 = r3 + 1
            goto L23
        L31:
            return r2
        L32:
            boolean r0 = r5 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L53
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r0 = getImplicitLowerBounds(r5)
            r0 = r0[r2]
            boolean r0 = containsTypeVariables(r0)
            if (r0 != 0) goto L52
            java.lang.reflect.Type[] r5 = getImplicitUpperBounds(r5)
            r5 = r5[r2]
            boolean r5 = containsTypeVariables(r5)
            if (r5 == 0) goto L51
            goto L52
        L51:
            r1 = 0
        L52:
            return r1
        L53:
            return r2
    }

    private static boolean containsVariableTypeSameParametrizedTypeBound(java.lang.reflect.TypeVariable<?> r0, java.lang.reflect.ParameterizedType r1) {
            java.lang.reflect.Type[] r0 = r0.getBounds()
            boolean r0 = org.apache.commons.lang3.ArrayUtils.contains(r0, r1)
            return r0
    }

    public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> determineTypeArguments(java.lang.Class<?> r3, java.lang.reflect.ParameterizedType r4) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "cls is null"
            org.apache.commons.lang3.Validate.notNull(r3, r2, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "superType is null"
            org.apache.commons.lang3.Validate.notNull(r4, r1, r0)
            java.lang.Class r0 = getRawType(r4)
            boolean r1 = isAssignable(r3, r0)
            r2 = 0
            if (r1 != 0) goto L1b
            return r2
        L1b:
            boolean r1 = r3.equals(r0)
            if (r1 == 0) goto L26
            java.util.Map r3 = getTypeArguments(r4, r0, r2)
            return r3
        L26:
            java.lang.reflect.Type r0 = getClosestParentType(r3, r0)
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L35
            java.lang.Class r0 = (java.lang.Class) r0
            java.util.Map r3 = determineTypeArguments(r0, r4)
            return r3
        L35:
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.Class r1 = getRawType(r0)
            java.util.Map r4 = determineTypeArguments(r1, r4)
            mapTypeVariablesToArguments(r3, r0, r4)
            return r4
    }

    private static boolean equals(java.lang.reflect.GenericArrayType r1, java.lang.reflect.Type r2) {
            boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L16
            java.lang.reflect.Type r1 = r1.getGenericComponentType()
            java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
            java.lang.reflect.Type r2 = r2.getGenericComponentType()
            boolean r1 = equals(r1, r2)
            if (r1 == 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    private static boolean equals(java.lang.reflect.ParameterizedType r2, java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L2f
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r0 = r2.getRawType()
            java.lang.reflect.Type r1 = r3.getRawType()
            boolean r0 = equals(r0, r1)
            if (r0 == 0) goto L2f
            java.lang.reflect.Type r0 = r2.getOwnerType()
            java.lang.reflect.Type r1 = r3.getOwnerType()
            boolean r0 = equals(r0, r1)
            if (r0 == 0) goto L2f
            java.lang.reflect.Type[] r2 = r2.getActualTypeArguments()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            boolean r2 = equals(r2, r3)
            return r2
        L2f:
            r2 = 0
            return r2
    }

    public static boolean equals(java.lang.reflect.Type r1, java.lang.reflect.Type r2) {
            boolean r0 = java.util.Objects.equals(r1, r2)
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            boolean r0 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L13
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            boolean r1 = equals(r1, r2)
            return r1
        L13:
            boolean r0 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L1e
            java.lang.reflect.GenericArrayType r1 = (java.lang.reflect.GenericArrayType) r1
            boolean r1 = equals(r1, r2)
            return r1
        L1e:
            boolean r0 = r1 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L29
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            boolean r1 = equals(r1, r2)
            return r1
        L29:
            r1 = 0
            return r1
    }

    private static boolean equals(java.lang.reflect.WildcardType r3, java.lang.reflect.Type r4) {
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            r1 = 0
            if (r0 == 0) goto L24
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r0 = getImplicitLowerBounds(r3)
            java.lang.reflect.Type[] r2 = getImplicitLowerBounds(r4)
            boolean r0 = equals(r0, r2)
            if (r0 == 0) goto L24
            java.lang.reflect.Type[] r3 = getImplicitUpperBounds(r3)
            java.lang.reflect.Type[] r4 = getImplicitUpperBounds(r4)
            boolean r3 = equals(r3, r4)
            if (r3 == 0) goto L24
            r1 = 1
        L24:
            return r1
    }

    private static boolean equals(java.lang.reflect.Type[] r4, java.lang.reflect.Type[] r5) {
            int r0 = r4.length
            int r1 = r5.length
            r2 = 0
            if (r0 != r1) goto L19
            r0 = 0
        L6:
            int r1 = r4.length
            if (r0 >= r1) goto L17
            r1 = r4[r0]
            r3 = r5[r0]
            boolean r1 = equals(r1, r3)
            if (r1 != 0) goto L14
            return r2
        L14:
            int r0 = r0 + 1
            goto L6
        L17:
            r4 = 1
            return r4
        L19:
            return r2
    }

    private static java.lang.reflect.Type[] extractTypeArgumentsFrom(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r9, java.lang.reflect.TypeVariable<?>[] r10) {
            int r0 = r10.length
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            int r1 = r10.length
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            if (r3 >= r1) goto L2b
            r5 = r10[r3]
            boolean r6 = r9.containsKey(r5)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = toString(r5)
            r7[r2] = r8
            java.lang.String r8 = "missing argument mapping for %s"
            org.apache.commons.lang3.Validate.isTrue(r6, r8, r7)
            int r6 = r4 + 1
            java.lang.Object r5 = r9.get(r5)
            java.lang.reflect.Type r5 = (java.lang.reflect.Type) r5
            r0[r4] = r5
            int r3 = r3 + 1
            r4 = r6
            goto L7
        L2b:
            return r0
    }

    private static int[] findRecursiveTypes(java.lang.reflect.ParameterizedType r4) {
            java.lang.reflect.Type[] r0 = r4.getActualTypeArguments()
            java.lang.reflect.Type[] r1 = r4.getActualTypeArguments()
            int r1 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            r1 = 0
            int[] r2 = new int[r1]
        L12:
            int r3 = r0.length
            if (r1 >= r3) goto L2c
            r3 = r0[r1]
            boolean r3 = r3 instanceof java.lang.reflect.TypeVariable
            if (r3 == 0) goto L29
            r3 = r0[r1]
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            boolean r3 = containsVariableTypeSameParametrizedTypeBound(r3, r4)
            if (r3 == 0) goto L29
            int[] r2 = org.apache.commons.lang3.ArrayUtils.add(r2, r1)
        L29:
            int r1 = r1 + 1
            goto L12
        L2c:
            return r2
    }

    public static java.lang.reflect.GenericArrayType genericArrayType(java.lang.reflect.Type r3) {
            org.apache.commons.lang3.reflect.TypeUtils$GenericArrayTypeImpl r0 = new org.apache.commons.lang3.reflect.TypeUtils$GenericArrayTypeImpl
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "componentType is null"
            java.lang.Object r3 = org.apache.commons.lang3.Validate.notNull(r3, r2, r1)
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    private static java.lang.String genericArrayTypeToString(java.lang.reflect.GenericArrayType r2) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.reflect.Type r2 = r2.getGenericComponentType()
            java.lang.String r2 = toString(r2)
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "%s[]"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    public static java.lang.reflect.Type getArrayComponentType(java.lang.reflect.Type r2) {
            boolean r0 = r2 instanceof java.lang.Class
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L11
            java.lang.Class r1 = r2.getComponentType()
        L11:
            return r1
        L12:
            boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L1d
            java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
            java.lang.reflect.Type r2 = r2.getGenericComponentType()
            return r2
        L1d:
            return r1
    }

    private static java.lang.reflect.Type getClosestParentType(java.lang.Class<?> r7, java.lang.Class<?> r8) {
            boolean r0 = r8.isInterface()
            if (r0 == 0) goto L4e
            java.lang.reflect.Type[] r0 = r7.getGenericInterfaces()
            r1 = 0
            int r2 = r0.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L4b
            r4 = r0[r3]
            boolean r5 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L1d
            r5 = r4
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.Class r5 = getRawType(r5)
            goto L24
        L1d:
            boolean r5 = r4 instanceof java.lang.Class
            if (r5 == 0) goto L34
            r5 = r4
            java.lang.Class r5 = (java.lang.Class) r5
        L24:
            boolean r6 = isAssignable(r5, r8)
            if (r6 == 0) goto L31
            boolean r5 = isAssignable(r1, r5)
            if (r5 == 0) goto L31
            r1 = r4
        L31:
            int r3 = r3 + 1
            goto Ld
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unexpected generic interface type found: "
            r8.append(r0)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L4b:
            if (r1 == 0) goto L4e
            return r1
        L4e:
            java.lang.reflect.Type r7 = r7.getGenericSuperclass()
            return r7
    }

    public static java.lang.reflect.Type[] getImplicitBounds(java.lang.reflect.TypeVariable<?> r3) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "typeVariable is null"
            org.apache.commons.lang3.Validate.notNull(r3, r2, r1)
            java.lang.reflect.Type[] r3 = r3.getBounds()
            int r1 = r3.length
            if (r1 != 0) goto L17
            r3 = 1
            java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r3[r0] = r1
            goto L1b
        L17:
            java.lang.reflect.Type[] r3 = normalizeUpperBounds(r3)
        L1b:
            return r3
    }

    public static java.lang.reflect.Type[] getImplicitLowerBounds(java.lang.reflect.WildcardType r3) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "wildcardType is null"
            org.apache.commons.lang3.Validate.notNull(r3, r2, r1)
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            int r1 = r3.length
            if (r1 != 0) goto L15
            r3 = 1
            java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
            r1 = 0
            r3[r0] = r1
        L15:
            return r3
    }

    public static java.lang.reflect.Type[] getImplicitUpperBounds(java.lang.reflect.WildcardType r3) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "wildcardType is null"
            org.apache.commons.lang3.Validate.notNull(r3, r2, r1)
            java.lang.reflect.Type[] r3 = r3.getUpperBounds()
            int r1 = r3.length
            if (r1 != 0) goto L17
            r3 = 1
            java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r3[r0] = r1
            goto L1b
        L17:
            java.lang.reflect.Type[] r3 = normalizeUpperBounds(r3)
        L1b:
            return r3
    }

    private static java.lang.Class<?> getRawType(java.lang.reflect.ParameterizedType r3) {
            java.lang.reflect.Type r3 = r3.getRawType()
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wait... What!? Type of rawType: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static java.lang.Class<?> getRawType(java.lang.reflect.Type r3, java.lang.reflect.Type r4) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L7:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L12
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.Class r3 = getRawType(r3)
            return r3
        L12:
            boolean r0 = r3 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L3d
            if (r4 != 0) goto L1a
            return r1
        L1a:
            r0 = r3
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.reflect.GenericDeclaration r0 = r0.getGenericDeclaration()
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 != 0) goto L26
            return r1
        L26:
            java.lang.Class r0 = (java.lang.Class) r0
            java.util.Map r0 = getTypeArguments(r4, r0)
            if (r0 != 0) goto L2f
            return r1
        L2f:
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            if (r3 != 0) goto L38
            return r1
        L38:
            java.lang.Class r3 = getRawType(r3, r4)
            return r3
        L3d:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L55
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            java.lang.Class r3 = getRawType(r3, r4)
            r4 = 0
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r4)
            java.lang.Class r3 = r3.getClass()
            return r3
        L55:
            boolean r4 = r3 instanceof java.lang.reflect.WildcardType
            if (r4 == 0) goto L5a
            return r1
        L5a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unknown type: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.Class<?> r1, java.lang.Class<?> r2, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r3) {
            boolean r0 = isAssignable(r1, r2)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L1e
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L1a
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            return r1
        L1a:
            java.lang.Class r1 = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(r1)
        L1e:
            if (r3 != 0) goto L26
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            goto L2c
        L26:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r3)
            r3 = r0
        L2c:
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L33
            return r3
        L33:
            java.lang.reflect.Type r1 = getClosestParentType(r1, r2)
            java.util.Map r1 = getTypeArguments(r1, r2, r3)
            return r1
    }

    public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.ParameterizedType r2) {
            java.lang.Class r0 = getRawType(r2)
            r1 = 0
            java.util.Map r2 = getTypeArguments(r2, r0, r1)
            return r2
    }

    private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.ParameterizedType r6, java.lang.Class<?> r7, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r8) {
            java.lang.Class r0 = getRawType(r6)
            boolean r1 = isAssignable(r0, r7)
            if (r1 != 0) goto Lc
            r6 = 0
            return r6
        Lc:
            java.lang.reflect.Type r1 = r6.getOwnerType()
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L1f
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.Class r2 = getRawType(r1)
            java.util.Map r8 = getTypeArguments(r1, r2, r8)
            goto L2d
        L1f:
            if (r8 != 0) goto L27
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            goto L2d
        L27:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r8)
            r8 = r1
        L2d:
            java.lang.reflect.Type[] r6 = r6.getActualTypeArguments()
            java.lang.reflect.TypeVariable[] r1 = r0.getTypeParameters()
            r2 = 0
        L36:
            int r3 = r1.length
            if (r2 >= r3) goto L4f
            r3 = r6[r2]
            r4 = r1[r2]
            boolean r5 = r8.containsKey(r3)
            if (r5 == 0) goto L49
            java.lang.Object r3 = r8.get(r3)
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
        L49:
            r8.put(r4, r3)
            int r2 = r2 + 1
            goto L36
        L4f:
            boolean r6 = r7.equals(r0)
            if (r6 == 0) goto L56
            return r8
        L56:
            java.lang.reflect.Type r6 = getClosestParentType(r0, r7)
            java.util.Map r6 = getTypeArguments(r6, r7, r8)
            return r6
    }

    public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.Type r1, java.lang.Class<?> r2) {
            r0 = 0
            java.util.Map r1 = getTypeArguments(r1, r2, r0)
            return r1
    }

    private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.reflect.Type r5, java.lang.Class<?> r6, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r7) {
            boolean r0 = r5 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r5 = (java.lang.Class) r5
            java.util.Map r5 = getTypeArguments(r5, r6, r7)
            return r5
        Lb:
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L16
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.util.Map r5 = getTypeArguments(r5, r6, r7)
            return r5
        L16:
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L2f
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            boolean r0 = r6.isArray()
            if (r0 == 0) goto L2a
            java.lang.Class r6 = r6.getComponentType()
        L2a:
            java.util.Map r5 = getTypeArguments(r5, r6, r7)
            return r5
        L2f:
            boolean r0 = r5 instanceof java.lang.reflect.WildcardType
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L4f
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r5 = getImplicitUpperBounds(r5)
            int r0 = r5.length
        L3c:
            if (r2 >= r0) goto L4e
            r3 = r5[r2]
            boolean r4 = isAssignable(r3, r6)
            if (r4 == 0) goto L4b
            java.util.Map r5 = getTypeArguments(r3, r6, r7)
            return r5
        L4b:
            int r2 = r2 + 1
            goto L3c
        L4e:
            return r1
        L4f:
            boolean r0 = r5 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L6d
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.reflect.Type[] r5 = getImplicitBounds(r5)
            int r0 = r5.length
        L5a:
            if (r2 >= r0) goto L6c
            r3 = r5[r2]
            boolean r4 = isAssignable(r3, r6)
            if (r4 == 0) goto L69
            java.util.Map r5 = getTypeArguments(r3, r6, r7)
            return r5
        L69:
            int r2 = r2 + 1
            goto L5a
        L6c:
            return r1
        L6d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "found an unhandled type: "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
    }

    public static boolean isArrayType(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r0 != 0) goto L13
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L11
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            return r1
    }

    private static boolean isAssignable(java.lang.reflect.Type r5, java.lang.Class<?> r6) {
            r0 = 1
            r1 = 0
            if (r5 != 0) goto Lf
            if (r6 == 0) goto Le
            boolean r5 = r6.isPrimitive()
            if (r5 != 0) goto Ld
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
        Lf:
            if (r6 != 0) goto L12
            return r1
        L12:
            boolean r2 = r6.equals(r5)
            if (r2 == 0) goto L19
            return r0
        L19:
            boolean r2 = r5 instanceof java.lang.Class
            if (r2 == 0) goto L24
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r5 = org.apache.commons.lang3.ClassUtils.isAssignable(r5, r6)
            return r5
        L24:
            boolean r2 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L33
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.Class r5 = getRawType(r5)
            boolean r5 = isAssignable(r5, r6)
            return r5
        L33:
            boolean r2 = r5 instanceof java.lang.reflect.TypeVariable
            if (r2 == 0) goto L4e
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.reflect.Type[] r5 = r5.getBounds()
            int r2 = r5.length
            r3 = 0
        L3f:
            if (r3 >= r2) goto L4d
            r4 = r5[r3]
            boolean r4 = isAssignable(r4, r6)
            if (r4 == 0) goto L4a
            return r0
        L4a:
            int r3 = r3 + 1
            goto L3f
        L4d:
            return r1
        L4e:
            boolean r2 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r2 == 0) goto L73
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L72
            boolean r2 = r6.isArray()
            if (r2 == 0) goto L71
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            java.lang.Class r6 = r6.getComponentType()
            boolean r5 = isAssignable(r5, r6)
            if (r5 == 0) goto L71
            goto L72
        L71:
            r0 = 0
        L72:
            return r0
        L73:
            boolean r6 = r5 instanceof java.lang.reflect.WildcardType
            if (r6 == 0) goto L78
            return r1
        L78:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "found an unhandled type: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
    }

    private static boolean isAssignable(java.lang.reflect.Type r4, java.lang.reflect.GenericArrayType r5, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r6) {
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5.equals(r4)
            if (r2 == 0) goto Lf
            return r0
        Lf:
            java.lang.reflect.Type r2 = r5.getGenericComponentType()
            boolean r3 = r4 instanceof java.lang.Class
            if (r3 == 0) goto L2c
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r5 = r4.isArray()
            if (r5 == 0) goto L2a
            java.lang.Class r4 = r4.getComponentType()
            boolean r4 = isAssignable(r4, r2, r6)
            if (r4 == 0) goto L2a
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
        L2c:
            boolean r3 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r3 == 0) goto L3b
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            boolean r4 = isAssignable(r4, r2, r6)
            return r4
        L3b:
            boolean r6 = r4 instanceof java.lang.reflect.WildcardType
            if (r6 == 0) goto L56
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = getImplicitUpperBounds(r4)
            int r6 = r4.length
            r2 = 0
        L47:
            if (r2 >= r6) goto L55
            r3 = r4[r2]
            boolean r3 = isAssignable(r3, r5)
            if (r3 == 0) goto L52
            return r0
        L52:
            int r2 = r2 + 1
            goto L47
        L55:
            return r1
        L56:
            boolean r6 = r4 instanceof java.lang.reflect.TypeVariable
            if (r6 == 0) goto L71
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.reflect.Type[] r4 = getImplicitBounds(r4)
            int r6 = r4.length
            r2 = 0
        L62:
            if (r2 >= r6) goto L70
            r3 = r4[r2]
            boolean r3 = isAssignable(r3, r5)
            if (r3 == 0) goto L6d
            return r0
        L6d:
            int r2 = r2 + 1
            goto L62
        L70:
            return r1
        L71:
            boolean r5 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L76
            return r1
        L76:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "found an unhandled type: "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    private static boolean isAssignable(java.lang.reflect.Type r6, java.lang.reflect.ParameterizedType r7, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r8) {
            r0 = 1
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 != 0) goto L8
            return r1
        L8:
            boolean r2 = r7.equals(r6)
            if (r2 == 0) goto Lf
            return r0
        Lf:
            java.lang.Class r2 = getRawType(r7)
            r3 = 0
            java.util.Map r6 = getTypeArguments(r6, r2, r3)
            if (r6 != 0) goto L1b
            return r1
        L1b:
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L22
            return r0
        L22:
            java.util.Map r7 = getTypeArguments(r7, r2, r8)
            java.util.Set r2 = r7.keySet()
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r2.next()
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            java.lang.reflect.Type r4 = unrollVariableAssignments(r3, r7)
            java.lang.reflect.Type r3 = unrollVariableAssignments(r3, r6)
            if (r4 != 0) goto L49
            boolean r5 = r3 instanceof java.lang.Class
            if (r5 == 0) goto L49
            goto L2e
        L49:
            if (r3 == 0) goto L2e
            boolean r5 = r4.equals(r3)
            if (r5 != 0) goto L2e
            boolean r5 = r4 instanceof java.lang.reflect.WildcardType
            if (r5 == 0) goto L5b
            boolean r3 = isAssignable(r3, r4, r8)
            if (r3 != 0) goto L2e
        L5b:
            return r1
        L5c:
            return r0
    }

    public static boolean isAssignable(java.lang.reflect.Type r1, java.lang.reflect.Type r2) {
            r0 = 0
            boolean r1 = isAssignable(r1, r2, r0)
            return r1
    }

    private static boolean isAssignable(java.lang.reflect.Type r1, java.lang.reflect.Type r2, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r3) {
            if (r2 == 0) goto L4a
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 == 0) goto L7
            goto L4a
        L7:
            boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L12
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            boolean r1 = isAssignable(r1, r2, r3)
            return r1
        L12:
            boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L1d
            java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
            boolean r1 = isAssignable(r1, r2, r3)
            return r1
        L1d:
            boolean r0 = r2 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L28
            java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
            boolean r1 = isAssignable(r1, r2, r3)
            return r1
        L28:
            boolean r0 = r2 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L33
            java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
            boolean r1 = isAssignable(r1, r2, r3)
            return r1
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "found an unhandled type: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L4a:
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r1 = isAssignable(r1, r2)
            return r1
    }

    private static boolean isAssignable(java.lang.reflect.Type r6, java.lang.reflect.TypeVariable<?> r7, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r8) {
            r0 = 1
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 != 0) goto L8
            return r1
        L8:
            boolean r2 = r7.equals(r6)
            if (r2 == 0) goto Lf
            return r0
        Lf:
            boolean r2 = r6 instanceof java.lang.reflect.TypeVariable
            if (r2 == 0) goto L2a
            r2 = r6
            java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
            java.lang.reflect.Type[] r2 = getImplicitBounds(r2)
            int r3 = r2.length
            r4 = 0
        L1c:
            if (r4 >= r3) goto L2a
            r5 = r2[r4]
            boolean r5 = isAssignable(r5, r7, r8)
            if (r5 == 0) goto L27
            return r0
        L27:
            int r4 = r4 + 1
            goto L1c
        L2a:
            boolean r7 = r6 instanceof java.lang.Class
            if (r7 != 0) goto L52
            boolean r7 = r6 instanceof java.lang.reflect.ParameterizedType
            if (r7 != 0) goto L52
            boolean r7 = r6 instanceof java.lang.reflect.GenericArrayType
            if (r7 != 0) goto L52
            boolean r7 = r6 instanceof java.lang.reflect.WildcardType
            if (r7 == 0) goto L3b
            goto L52
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "found an unhandled type: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L52:
            return r1
    }

    private static boolean isAssignable(java.lang.reflect.Type r10, java.lang.reflect.WildcardType r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
            r0 = 1
            if (r10 != 0) goto L4
            return r0
        L4:
            r1 = 0
            if (r11 != 0) goto L8
            return r1
        L8:
            boolean r2 = r11.equals(r10)
            if (r2 == 0) goto Lf
            return r0
        Lf:
            java.lang.reflect.Type[] r2 = getImplicitUpperBounds(r11)
            java.lang.reflect.Type[] r11 = getImplicitLowerBounds(r11)
            boolean r3 = r10 instanceof java.lang.reflect.WildcardType
            if (r3 == 0) goto L60
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r3 = getImplicitUpperBounds(r10)
            java.lang.reflect.Type[] r10 = getImplicitLowerBounds(r10)
            int r4 = r2.length
            r5 = 0
        L27:
            if (r5 >= r4) goto L42
            r6 = r2[r5]
            java.lang.reflect.Type r6 = substituteTypeVariables(r6, r12)
            int r7 = r3.length
            r8 = 0
        L31:
            if (r8 >= r7) goto L3f
            r9 = r3[r8]
            boolean r9 = isAssignable(r9, r6, r12)
            if (r9 != 0) goto L3c
            return r1
        L3c:
            int r8 = r8 + 1
            goto L31
        L3f:
            int r5 = r5 + 1
            goto L27
        L42:
            int r2 = r11.length
            r3 = 0
        L44:
            if (r3 >= r2) goto L5f
            r4 = r11[r3]
            java.lang.reflect.Type r4 = substituteTypeVariables(r4, r12)
            int r5 = r10.length
            r6 = 0
        L4e:
            if (r6 >= r5) goto L5c
            r7 = r10[r6]
            boolean r7 = isAssignable(r4, r7, r12)
            if (r7 != 0) goto L59
            return r1
        L59:
            int r6 = r6 + 1
            goto L4e
        L5c:
            int r3 = r3 + 1
            goto L44
        L5f:
            return r0
        L60:
            int r3 = r2.length
            r4 = 0
        L62:
            if (r4 >= r3) goto L74
            r5 = r2[r4]
            java.lang.reflect.Type r5 = substituteTypeVariables(r5, r12)
            boolean r5 = isAssignable(r10, r5, r12)
            if (r5 != 0) goto L71
            return r1
        L71:
            int r4 = r4 + 1
            goto L62
        L74:
            int r2 = r11.length
            r3 = 0
        L76:
            if (r3 >= r2) goto L88
            r4 = r11[r3]
            java.lang.reflect.Type r4 = substituteTypeVariables(r4, r12)
            boolean r4 = isAssignable(r4, r10, r12)
            if (r4 != 0) goto L85
            return r1
        L85:
            int r3 = r3 + 1
            goto L76
        L88:
            return r0
    }

    public static boolean isInstance(java.lang.Object r1, java.lang.reflect.Type r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            if (r1 != 0) goto L14
            boolean r1 = r2 instanceof java.lang.Class
            if (r1 == 0) goto L12
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r1 = r2.isPrimitive()
            if (r1 != 0) goto L1d
        L12:
            r0 = 1
            goto L1d
        L14:
            java.lang.Class r1 = r1.getClass()
            r0 = 0
            boolean r0 = isAssignable(r1, r2, r0)
        L1d:
            return r0
    }

    private static <T> void mapTypeVariablesToArguments(java.lang.Class<T> r5, java.lang.reflect.ParameterizedType r6, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r7) {
            java.lang.reflect.Type r0 = r6.getOwnerType()
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto Ld
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            mapTypeVariablesToArguments(r5, r0, r7)
        Ld:
            java.lang.reflect.Type[] r0 = r6.getActualTypeArguments()
            java.lang.Class r6 = getRawType(r6)
            java.lang.reflect.TypeVariable[] r6 = r6.getTypeParameters()
            java.lang.reflect.TypeVariable[] r5 = r5.getTypeParameters()
            java.util.List r5 = java.util.Arrays.asList(r5)
            r1 = 0
        L22:
            int r2 = r0.length
            if (r1 >= r2) goto L43
            r2 = r6[r1]
            r3 = r0[r1]
            boolean r4 = r5.contains(r3)
            if (r4 == 0) goto L40
            boolean r4 = r7.containsKey(r2)
            if (r4 == 0) goto L40
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            java.lang.Object r2 = r7.get(r2)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            r7.put(r3, r2)
        L40:
            int r1 = r1 + 1
            goto L22
        L43:
            return
    }

    public static java.lang.reflect.Type[] normalizeUpperBounds(java.lang.reflect.Type[] r9) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "null value specified for bounds array"
            org.apache.commons.lang3.Validate.notNull(r9, r2, r1)
            int r1 = r9.length
            r2 = 2
            if (r1 >= r2) goto Ld
            return r9
        Ld:
            java.util.HashSet r1 = new java.util.HashSet
            int r2 = r9.length
            r1.<init>(r2)
            int r2 = r9.length
            r3 = 0
        L15:
            if (r3 >= r2) goto L36
            r4 = r9[r3]
            int r5 = r9.length
            r6 = 0
        L1b:
            if (r6 >= r5) goto L2d
            r7 = r9[r6]
            if (r4 == r7) goto L2a
            r8 = 0
            boolean r7 = isAssignable(r7, r4, r8)
            if (r7 == 0) goto L2a
            r5 = 1
            goto L2e
        L2a:
            int r6 = r6 + 1
            goto L1b
        L2d:
            r5 = 0
        L2e:
            if (r5 != 0) goto L33
            r1.add(r4)
        L33:
            int r3 = r3 + 1
            goto L15
        L36:
            int r9 = r1.size()
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r9]
            java.lang.Object[] r9 = r1.toArray(r9)
            java.lang.reflect.Type[] r9 = (java.lang.reflect.Type[]) r9
            return r9
    }

    public static final java.lang.reflect.ParameterizedType parameterize(java.lang.Class<?> r3, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r4) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "raw class is null"
            org.apache.commons.lang3.Validate.notNull(r3, r2, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "typeArgMappings is null"
            org.apache.commons.lang3.Validate.notNull(r4, r1, r0)
            java.lang.reflect.TypeVariable[] r0 = r3.getTypeParameters()
            java.lang.reflect.Type[] r4 = extractTypeArgumentsFrom(r4, r0)
            r0 = 0
            java.lang.reflect.ParameterizedType r3 = parameterizeWithOwner(r0, r3, r4)
            return r3
    }

    public static final java.lang.reflect.ParameterizedType parameterize(java.lang.Class<?> r1, java.lang.reflect.Type... r2) {
            r0 = 0
            java.lang.reflect.ParameterizedType r1 = parameterizeWithOwner(r0, r1, r2)
            return r1
    }

    public static final java.lang.reflect.ParameterizedType parameterizeWithOwner(java.lang.reflect.Type r3, java.lang.Class<?> r4, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r5) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "raw class is null"
            org.apache.commons.lang3.Validate.notNull(r4, r2, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "typeArgMappings is null"
            org.apache.commons.lang3.Validate.notNull(r5, r1, r0)
            java.lang.reflect.TypeVariable[] r0 = r4.getTypeParameters()
            java.lang.reflect.Type[] r5 = extractTypeArgumentsFrom(r5, r0)
            java.lang.reflect.ParameterizedType r3 = parameterizeWithOwner(r3, r4, r5)
            return r3
    }

    public static final java.lang.reflect.ParameterizedType parameterizeWithOwner(java.lang.reflect.Type r7, java.lang.Class<?> r8, java.lang.reflect.Type... r9) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "raw class is null"
            org.apache.commons.lang3.Validate.notNull(r8, r2, r1)
            java.lang.Class r1 = r8.getEnclosingClass()
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 != 0) goto L21
            if (r7 != 0) goto L15
            r7 = 1
            goto L16
        L15:
            r7 = 0
        L16:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r0] = r8
            java.lang.String r5 = "no owner allowed for top-level %s"
            org.apache.commons.lang3.Validate.isTrue(r7, r5, r1)
            r7 = r2
            goto L3b
        L21:
            if (r7 != 0) goto L28
            java.lang.Class r7 = r8.getEnclosingClass()
            goto L3b
        L28:
            java.lang.Class r1 = r8.getEnclosingClass()
            boolean r1 = isAssignable(r7, r1)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r0] = r7
            r5[r4] = r8
            java.lang.String r6 = "%s is invalid owner type for parameterized %s"
            org.apache.commons.lang3.Validate.isTrue(r1, r6, r5)
        L3b:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r5 = "null type argument at index %s"
            org.apache.commons.lang3.Validate.noNullElements(r9, r5, r1)
            java.lang.reflect.TypeVariable[] r1 = r8.getTypeParameters()
            int r1 = r1.length
            int r5 = r9.length
            if (r1 != r5) goto L4c
            r1 = 1
            goto L4d
        L4c:
            r1 = 0
        L4d:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.reflect.TypeVariable[] r5 = r8.getTypeParameters()
            int r5 = r5.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r0] = r5
            int r0 = r9.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r4] = r0
            java.lang.String r0 = "invalid number of type parameters specified: expected %d, got %d"
            org.apache.commons.lang3.Validate.isTrue(r1, r0, r3)
            org.apache.commons.lang3.reflect.TypeUtils$ParameterizedTypeImpl r0 = new org.apache.commons.lang3.reflect.TypeUtils$ParameterizedTypeImpl
            r0.<init>(r8, r7, r9, r2)
            return r0
    }

    private static java.lang.String parameterizedTypeToString(java.lang.reflect.ParameterizedType r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.reflect.Type r1 = r4.getOwnerType()
            java.lang.reflect.Type r2 = r4.getRawType()
            java.lang.Class r2 = (java.lang.Class) r2
            if (r1 != 0) goto L19
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            goto L3a
        L19:
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L27
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            goto L2e
        L27:
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L2e:
            r1 = 46
            r0.append(r1)
            java.lang.String r1 = r2.getSimpleName()
            r0.append(r1)
        L3a:
            int[] r1 = findRecursiveTypes(r4)
            int r2 = r1.length
            if (r2 <= 0) goto L49
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            appendRecursiveTypes(r0, r1, r4)
            goto L5d
        L49:
            r1 = 60
            r0.append(r1)
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            java.lang.String r1 = ", "
            java.lang.StringBuilder r4 = appendAllTo(r0, r1, r4)
            r1 = 62
            r4.append(r1)
        L5d:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static java.lang.reflect.Type substituteTypeVariables(java.lang.reflect.Type r2, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r3) {
            boolean r0 = r2 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L26
            if (r3 == 0) goto L26
            java.lang.Object r3 = r3.get(r2)
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            if (r3 == 0) goto Lf
            return r3
        Lf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "missing assignment type for type variable "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L26:
            return r2
    }

    public static java.lang.String toLongString(java.lang.reflect.TypeVariable<?> r5) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "var is null"
            org.apache.commons.lang3.Validate.notNull(r5, r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.reflect.GenericDeclaration r2 = r5.getGenericDeclaration()
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L37
            java.lang.Class r2 = (java.lang.Class) r2
        L17:
            java.lang.Class r3 = r2.getEnclosingClass()
            if (r3 != 0) goto L25
            java.lang.String r2 = r2.getName()
            r1.insert(r0, r2)
            goto L48
        L25:
            java.lang.String r3 = r2.getSimpleName()
            java.lang.StringBuilder r3 = r1.insert(r0, r3)
            r4 = 46
            r3.insert(r0, r4)
            java.lang.Class r2 = r2.getEnclosingClass()
            goto L17
        L37:
            boolean r0 = r2 instanceof java.lang.reflect.Type
            if (r0 == 0) goto L45
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.String r0 = toString(r2)
            r1.append(r0)
            goto L48
        L45:
            r1.append(r2)
        L48:
            r0 = 58
            r1.append(r0)
            java.lang.String r5 = typeVariableToString(r5)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }

    private static <T> java.lang.String toString(T r1) {
            boolean r0 = r1 instanceof java.lang.reflect.Type
            if (r0 == 0) goto Lb
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            java.lang.String r1 = toString(r1)
            goto Lf
        Lb:
            java.lang.String r1 = r1.toString()
        Lf:
            return r1
    }

    public static java.lang.String toString(java.lang.reflect.Type r1) {
            org.apache.commons.lang3.Validate.notNull(r1)
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Le
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = classToString(r1)
            return r1
        Le:
            boolean r0 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L19
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.String r1 = parameterizedTypeToString(r1)
            return r1
        L19:
            boolean r0 = r1 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L24
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.String r1 = wildcardTypeToString(r1)
            return r1
        L24:
            boolean r0 = r1 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L2f
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.String r1 = typeVariableToString(r1)
            return r1
        L2f:
            boolean r0 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L3a
            java.lang.reflect.GenericArrayType r1 = (java.lang.reflect.GenericArrayType) r1
            java.lang.String r1 = genericArrayTypeToString(r1)
            return r1
        L3a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = org.apache.commons.lang3.ObjectUtils.identityToString(r1)
            r0.<init>(r1)
            throw r0
    }

    private static java.lang.String typeVariableToString(java.lang.reflect.TypeVariable<?> r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r4.getName()
            r0.<init>(r1)
            java.lang.reflect.Type[] r1 = r4.getBounds()
            int r2 = r1.length
            if (r2 <= 0) goto L2d
            int r2 = r1.length
            r3 = 1
            if (r2 != r3) goto L1f
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r3 = 0
            r1 = r1[r3]
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L2d
        L1f:
            java.lang.String r1 = " extends "
            r0.append(r1)
            java.lang.reflect.Type[] r4 = r4.getBounds()
            java.lang.String r1 = " & "
            appendAllTo(r0, r1, r4)
        L2d:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static boolean typesSatisfyVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r7) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "typeVarAssigns is null"
            org.apache.commons.lang3.Validate.notNull(r7, r2, r1)
            java.util.Set r1 = r7.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.reflect.Type[] r3 = getImplicitBounds(r3)
            int r4 = r3.length
            r5 = 0
        L2e:
            if (r5 >= r4) goto L10
            r6 = r3[r5]
            java.lang.reflect.Type r6 = substituteTypeVariables(r6, r7)
            boolean r6 = isAssignable(r2, r6, r7)
            if (r6 != 0) goto L3d
            return r0
        L3d:
            int r5 = r5 + 1
            goto L2e
        L40:
            r7 = 1
            return r7
    }

    private static java.lang.reflect.Type[] unrollBounds(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r2, java.lang.reflect.Type[] r3) {
            r0 = 0
        L1:
            int r1 = r3.length
            if (r0 >= r1) goto L1b
            r1 = r3[r0]
            java.lang.reflect.Type r1 = unrollVariables(r2, r1)
            if (r1 != 0) goto L16
            int r1 = r0 + (-1)
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.remove(r3, r0)
            java.lang.reflect.Type[] r3 = (java.lang.reflect.Type[]) r3
            r0 = r1
            goto L18
        L16:
            r3[r0] = r1
        L18:
            int r0 = r0 + 1
            goto L1
        L1b:
            return r3
    }

    private static java.lang.reflect.Type unrollVariableAssignments(java.lang.reflect.TypeVariable<?> r2, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r3) {
        L0:
            java.lang.Object r0 = r3.get(r2)
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L14
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L14
            r2 = r0
            java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
            goto L0
        L14:
            return r0
    }

    public static java.lang.reflect.Type unrollVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r3, java.lang.reflect.Type r4) {
            if (r3 != 0) goto L6
            java.util.Map r3 = java.util.Collections.emptyMap()
        L6:
            boolean r0 = containsTypeVariables(r4)
            if (r0 == 0) goto L80
            boolean r0 = r4 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L1b
            java.lang.Object r4 = r3.get(r4)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            java.lang.reflect.Type r3 = unrollVariables(r3, r4)
            return r3
        L1b:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L59
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r0 = r4.getOwnerType()
            if (r0 != 0) goto L28
            goto L35
        L28:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r3)
            java.util.Map r3 = getTypeArguments(r4)
            r0.putAll(r3)
            r3 = r0
        L35:
            java.lang.reflect.Type[] r0 = r4.getActualTypeArguments()
            r1 = 0
        L3a:
            int r2 = r0.length
            if (r1 >= r2) goto L4a
            r2 = r0[r1]
            java.lang.reflect.Type r2 = unrollVariables(r3, r2)
            if (r2 == 0) goto L47
            r0[r1] = r2
        L47:
            int r1 = r1 + 1
            goto L3a
        L4a:
            java.lang.reflect.Type r3 = r4.getOwnerType()
            java.lang.reflect.Type r4 = r4.getRawType()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.reflect.ParameterizedType r3 = parameterizeWithOwner(r3, r4, r0)
            return r3
        L59:
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L80
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder r0 = wildcardType()
            java.lang.reflect.Type[] r1 = r4.getUpperBounds()
            java.lang.reflect.Type[] r1 = unrollBounds(r3, r1)
            org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder r0 = r0.withUpperBounds(r1)
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            java.lang.reflect.Type[] r3 = unrollBounds(r3, r4)
            org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder r3 = r0.withLowerBounds(r3)
            java.lang.reflect.WildcardType r3 = r3.build2()
            return r3
        L80:
            return r4
    }

    public static org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder wildcardType() {
            org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder r0 = new org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    private static java.lang.String wildcardTypeToString(java.lang.reflect.WildcardType r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 63
            r0.append(r1)
            java.lang.reflect.Type[] r1 = r6.getLowerBounds()
            java.lang.reflect.Type[] r6 = r6.getUpperBounds()
            int r2 = r1.length
            java.lang.String r3 = " & "
            r4 = 1
            if (r2 > r4) goto L3a
            int r2 = r1.length
            r5 = 0
            if (r2 != r4) goto L21
            r2 = r1[r5]
            if (r2 == 0) goto L21
            goto L3a
        L21:
            int r1 = r6.length
            if (r1 > r4) goto L31
            int r1 = r6.length
            if (r1 != r4) goto L42
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = r6[r5]
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L42
        L31:
            java.lang.String r1 = " extends "
            r0.append(r1)
            appendAllTo(r0, r3, r6)
            goto L42
        L3a:
            java.lang.String r6 = " super "
            r0.append(r6)
            appendAllTo(r0, r3, r1)
        L42:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static <T> org.apache.commons.lang3.reflect.Typed<T> wrap(java.lang.Class<T> r0) {
            org.apache.commons.lang3.reflect.Typed r0 = wrap(r0)
            return r0
    }

    public static <T> org.apache.commons.lang3.reflect.Typed<T> wrap(java.lang.reflect.Type r1) {
            org.apache.commons.lang3.reflect.TypeUtils$1 r0 = new org.apache.commons.lang3.reflect.TypeUtils$1
            r0.<init>(r1)
            return r0
    }
}
