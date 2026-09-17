package kotlin.jvm.internal;

/* compiled from: ClassReference.kt */
/* loaded from: classes2.dex */
public final class ClassReference implements kotlin.reflect.KClass<java.lang.Object>, kotlin.jvm.internal.ClassBasedDeclarationContainer {
    public static final kotlin.jvm.internal.ClassReference.Companion Companion = null;
    private static final java.util.Map<java.lang.Class<? extends kotlin.Function<?>>, java.lang.Integer> FUNCTION_CLASSES = null;
    private static final java.util.HashMap<java.lang.String, java.lang.String> classFqNames = null;
    private static final java.util.HashMap<java.lang.String, java.lang.String> primitiveFqNames = null;
    private static final java.util.HashMap<java.lang.String, java.lang.String> primitiveWrapperFqNames = null;
    private static final java.util.Map<java.lang.String, java.lang.String> simpleNames = null;
    private final java.lang.Class<?> jClass;

    /* compiled from: ClassReference.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.lang.String getClassSimpleName(java.lang.Class<?> r8) {
                r7 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                java.lang.String r1 = "Array"
                r2 = 0
                if (r0 == 0) goto L11
            Le:
                r1 = r2
                goto Lb2
            L11:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L6b
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r1 = r8.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r1 == 0) goto L42
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r1 = r1.getName()
                r6.append(r1)
                r6.append(r4)
                java.lang.String r1 = r6.toString()
                java.lang.String r1 = kotlin.text.StringsKt.substringAfter$default(r0, r1, r2, r3, r2)
                if (r1 != 0) goto Lb2
            L42:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                if (r8 == 0) goto L63
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r8 = r8.getName()
                r1.append(r8)
                r1.append(r4)
                java.lang.String r8 = r1.toString()
                java.lang.String r1 = kotlin.text.StringsKt.substringAfter$default(r0, r8, r2, r3, r2)
                goto Lb2
            L63:
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
                java.lang.String r1 = kotlin.text.StringsKt.substringAfter$default(r0, r4, r2, r3, r2)
                goto Lb2
            L6b:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto L9d
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                if (r0 == 0) goto L9a
                java.util.Map r0 = kotlin.jvm.internal.ClassReference.access$getSimpleNames$cp()
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L9a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r1)
                java.lang.String r2 = r0.toString()
            L9a:
                if (r2 != 0) goto Le
                goto Lb2
            L9d:
                java.util.Map r0 = kotlin.jvm.internal.ClassReference.access$getSimpleNames$cp()
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb2
                java.lang.String r1 = r8.getSimpleName()
            Lb2:
                return r1
        }
    }

    static {
            kotlin.jvm.internal.ClassReference$Companion r0 = new kotlin.jvm.internal.ClassReference$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.jvm.internal.ClassReference.Companion = r0
            r0 = 23
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<kotlin.jvm.functions.Function0> r2 = kotlin.jvm.functions.Function0.class
            r3 = 0
            r0[r3] = r2
            java.lang.Class<kotlin.jvm.functions.Function1> r2 = kotlin.jvm.functions.Function1.class
            r4 = 1
            r0[r4] = r2
            java.lang.Class<kotlin.jvm.functions.Function2> r2 = kotlin.jvm.functions.Function2.class
            r4 = 2
            r0[r4] = r2
            r2 = 3
            java.lang.Class<kotlin.jvm.functions.Function3> r5 = kotlin.jvm.functions.Function3.class
            r0[r2] = r5
            r2 = 4
            java.lang.Class<kotlin.jvm.functions.Function4> r5 = kotlin.jvm.functions.Function4.class
            r0[r2] = r5
            r2 = 5
            java.lang.Class<kotlin.jvm.functions.Function5> r5 = kotlin.jvm.functions.Function5.class
            r0[r2] = r5
            r2 = 6
            java.lang.Class<kotlin.jvm.functions.Function6> r5 = kotlin.jvm.functions.Function6.class
            r0[r2] = r5
            r2 = 7
            java.lang.Class<kotlin.jvm.functions.Function7> r5 = kotlin.jvm.functions.Function7.class
            r0[r2] = r5
            r2 = 8
            java.lang.Class<kotlin.jvm.functions.Function8> r5 = kotlin.jvm.functions.Function8.class
            r0[r2] = r5
            r2 = 9
            java.lang.Class<kotlin.jvm.functions.Function9> r5 = kotlin.jvm.functions.Function9.class
            r0[r2] = r5
            java.lang.Class<kotlin.jvm.functions.Function10> r2 = kotlin.jvm.functions.Function10.class
            r5 = 10
            r0[r5] = r2
            r2 = 11
            java.lang.Class<kotlin.jvm.functions.Function11> r6 = kotlin.jvm.functions.Function11.class
            r0[r2] = r6
            r2 = 12
            java.lang.Class<kotlin.jvm.functions.Function12> r6 = kotlin.jvm.functions.Function12.class
            r0[r2] = r6
            r2 = 13
            java.lang.Class<kotlin.jvm.functions.Function13> r6 = kotlin.jvm.functions.Function13.class
            r0[r2] = r6
            r2 = 14
            java.lang.Class<kotlin.jvm.functions.Function14> r6 = kotlin.jvm.functions.Function14.class
            r0[r2] = r6
            r2 = 15
            java.lang.Class<kotlin.jvm.functions.Function15> r6 = kotlin.jvm.functions.Function15.class
            r0[r2] = r6
            r2 = 16
            java.lang.Class<kotlin.jvm.functions.Function16> r6 = kotlin.jvm.functions.Function16.class
            r0[r2] = r6
            r2 = 17
            java.lang.Class<kotlin.jvm.functions.Function17> r6 = kotlin.jvm.functions.Function17.class
            r0[r2] = r6
            r2 = 18
            java.lang.Class<kotlin.jvm.functions.Function18> r6 = kotlin.jvm.functions.Function18.class
            r0[r2] = r6
            r2 = 19
            java.lang.Class<kotlin.jvm.functions.Function19> r6 = kotlin.jvm.functions.Function19.class
            r0[r2] = r6
            r2 = 20
            java.lang.Class<kotlin.jvm.functions.Function20> r6 = kotlin.jvm.functions.Function20.class
            r0[r2] = r6
            r2 = 21
            java.lang.Class<kotlin.jvm.functions.Function21> r6 = kotlin.jvm.functions.Function21.class
            r0[r2] = r6
            r2 = 22
            java.lang.Class<kotlin.jvm.functions.Function22> r6 = kotlin.jvm.functions.Function22.class
            r0[r2] = r6
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r5)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L9f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lbf
            java.lang.Object r5 = r0.next()
            int r6 = r3 + 1
            if (r3 >= 0) goto Lb0
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        Lb0:
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            kotlin.Pair r3 = kotlin.TuplesKt.to(r5, r3)
            r2.add(r3)
            r3 = r6
            goto L9f
        Lbf:
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r2)
            kotlin.jvm.internal.ClassReference.FUNCTION_CLASSES = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = "boolean"
            java.lang.String r3 = "kotlin.Boolean"
            r0.put(r2, r3)
            java.lang.String r2 = "char"
            java.lang.String r5 = "kotlin.Char"
            r0.put(r2, r5)
            java.lang.String r2 = "byte"
            java.lang.String r6 = "kotlin.Byte"
            r0.put(r2, r6)
            java.lang.String r2 = "short"
            java.lang.String r7 = "kotlin.Short"
            r0.put(r2, r7)
            java.lang.String r2 = "int"
            java.lang.String r8 = "kotlin.Int"
            r0.put(r2, r8)
            java.lang.String r2 = "float"
            java.lang.String r9 = "kotlin.Float"
            r0.put(r2, r9)
            java.lang.String r2 = "long"
            java.lang.String r10 = "kotlin.Long"
            r0.put(r2, r10)
            java.lang.String r2 = "double"
            java.lang.String r11 = "kotlin.Double"
            r0.put(r2, r11)
            kotlin.jvm.internal.ClassReference.primitiveFqNames = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r12 = "java.lang.Boolean"
            r2.put(r12, r3)
            java.lang.String r3 = "java.lang.Character"
            r2.put(r3, r5)
            java.lang.String r3 = "java.lang.Byte"
            r2.put(r3, r6)
            java.lang.String r3 = "java.lang.Short"
            r2.put(r3, r7)
            java.lang.String r3 = "java.lang.Integer"
            r2.put(r3, r8)
            java.lang.String r3 = "java.lang.Float"
            r2.put(r3, r9)
            java.lang.String r3 = "java.lang.Long"
            r2.put(r3, r10)
            java.lang.String r3 = "java.lang.Double"
            r2.put(r3, r11)
            kotlin.jvm.internal.ClassReference.primitiveWrapperFqNames = r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r5 = "java.lang.Object"
            java.lang.String r6 = "kotlin.Any"
            r3.put(r5, r6)
            java.lang.String r5 = "java.lang.String"
            java.lang.String r6 = "kotlin.String"
            r3.put(r5, r6)
            java.lang.String r5 = "java.lang.CharSequence"
            java.lang.String r6 = "kotlin.CharSequence"
            r3.put(r5, r6)
            java.lang.String r5 = "java.lang.Throwable"
            java.lang.String r6 = "kotlin.Throwable"
            r3.put(r5, r6)
            java.lang.String r5 = "java.lang.Cloneable"
            java.lang.String r6 = "kotlin.Cloneable"
            r3.put(r5, r6)
            java.lang.String r5 = "java.lang.Number"
            java.lang.String r6 = "kotlin.Number"
            r3.put(r5, r6)
            java.lang.String r5 = "java.lang.Comparable"
            java.lang.String r6 = "kotlin.Comparable"
            r3.put(r5, r6)
            java.lang.String r5 = "java.lang.Enum"
            java.lang.String r6 = "kotlin.Enum"
            r3.put(r5, r6)
            java.lang.String r5 = "java.lang.annotation.Annotation"
            java.lang.String r6 = "kotlin.Annotation"
            r3.put(r5, r6)
            java.lang.String r5 = "java.lang.Iterable"
            java.lang.String r6 = "kotlin.collections.Iterable"
            r3.put(r5, r6)
            java.lang.String r5 = "java.util.Iterator"
            java.lang.String r6 = "kotlin.collections.Iterator"
            r3.put(r5, r6)
            java.lang.String r5 = "java.util.Collection"
            java.lang.String r6 = "kotlin.collections.Collection"
            r3.put(r5, r6)
            java.lang.String r5 = "java.util.List"
            java.lang.String r6 = "kotlin.collections.List"
            r3.put(r5, r6)
            java.lang.String r5 = "java.util.Set"
            java.lang.String r6 = "kotlin.collections.Set"
            r3.put(r5, r6)
            java.lang.String r5 = "java.util.ListIterator"
            java.lang.String r6 = "kotlin.collections.ListIterator"
            r3.put(r5, r6)
            java.lang.String r5 = "java.util.Map"
            java.lang.String r6 = "kotlin.collections.Map"
            r3.put(r5, r6)
            java.lang.String r5 = "java.util.Map$Entry"
            java.lang.String r6 = "kotlin.collections.Map.Entry"
            r3.put(r5, r6)
            java.lang.String r5 = "kotlin.jvm.internal.StringCompanionObject"
            java.lang.String r6 = "kotlin.String.Companion"
            r3.put(r5, r6)
            java.lang.String r5 = "kotlin.jvm.internal.EnumCompanionObject"
            java.lang.String r6 = "kotlin.Enum.Companion"
            r3.put(r5, r6)
            r3.putAll(r0)
            r3.putAll(r2)
            java.util.Collection r0 = r0.values()
            java.lang.String r2 = "primitiveFqNames.values"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.util.Iterator r0 = r0.iterator()
        L1d0:
            boolean r2 = r0.hasNext()
            r5 = 46
            if (r2 == 0) goto L21e
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "kotlin.jvm.internal."
            r6.append(r7)
            java.lang.String r7 = "kotlinName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            java.lang.String r5 = kotlin.text.StringsKt.substringAfterLast$default(r2, r5, r1, r4, r1)
            r6.append(r5)
            java.lang.String r5 = "CompanionObject"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = ".Companion"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            kotlin.Pair r2 = kotlin.TuplesKt.to(r5, r2)
            java.lang.Object r5 = r2.getFirst()
            java.lang.Object r2 = r2.getSecond()
            r3.put(r5, r2)
            goto L1d0
        L21e:
            java.util.Map<java.lang.Class<? extends kotlin.Function<?>>, java.lang.Integer> r0 = kotlin.jvm.internal.ClassReference.FUNCTION_CLASSES
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L228:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25d
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r6 = r2.getKey()
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r6 = r6.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "kotlin.Function"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r3.put(r6, r2)
            goto L228
        L25d:
            kotlin.jvm.internal.ClassReference.classFqNames = r3
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r2 = r3.size()
            int r2 = kotlin.collections.MapsKt.mapCapacity(r2)
            r0.<init>(r2)
            java.util.Set r2 = r3.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L274:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L292
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r6 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = kotlin.text.StringsKt.substringAfterLast$default(r3, r5, r1, r4, r1)
            r0.put(r6, r3)
            goto L274
        L292:
            kotlin.jvm.internal.ClassReference.simpleNames = r0
            return
    }

    public ClassReference(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "jClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.jClass = r2
            return
    }

    public static final /* synthetic */ java.util.Map access$getSimpleNames$cp() {
            java.util.Map<java.lang.String, java.lang.String> r0 = kotlin.jvm.internal.ClassReference.simpleNames
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.jvm.internal.ClassReference
            if (r0 == 0) goto L16
            java.lang.Class r0 = kotlin.jvm.JvmClassMappingKt.getJavaObjectType(r1)
            kotlin.reflect.KClass r2 = (kotlin.reflect.KClass) r2
            java.lang.Class r2 = kotlin.jvm.JvmClassMappingKt.getJavaObjectType(r2)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public java.lang.Class<?> getJClass() {
            r1 = this;
            java.lang.Class<?> r0 = r1.jClass
            return r0
    }

    @Override // kotlin.reflect.KClass
    public java.lang.String getSimpleName() {
            r2 = this;
            kotlin.jvm.internal.ClassReference$Companion r0 = kotlin.jvm.internal.ClassReference.Companion
            java.lang.Class r1 = r2.getJClass()
            java.lang.String r0 = r0.getClassSimpleName(r1)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Class r0 = kotlin.jvm.JvmClassMappingKt.getJavaObjectType(r1)
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getJClass()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
