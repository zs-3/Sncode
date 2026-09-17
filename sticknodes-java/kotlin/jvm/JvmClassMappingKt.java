package kotlin.jvm;

/* compiled from: JvmClassMapping.kt */
/* loaded from: classes2.dex */
public final class JvmClassMappingKt {
    public static final <T> java.lang.Class<T> getJavaClass(kotlin.reflect.KClass<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.jvm.internal.ClassBasedDeclarationContainer r1 = (kotlin.jvm.internal.ClassBasedDeclarationContainer) r1
            java.lang.Class r1 = r1.getJClass()
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            return r1
    }

    public static final <T> java.lang.Class<T> getJavaObjectType(kotlin.reflect.KClass<T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.ClassBasedDeclarationContainer r3 = (kotlin.jvm.internal.ClassBasedDeclarationContainer) r3
            java.lang.Class r3 = r3.getJClass()
            boolean r0 = r3.isPrimitive()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>"
            if (r0 != 0) goto L17
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            return r3
        L17:
            java.lang.String r0 = r3.getName()
            int r2 = r0.hashCode()
            switch(r2) {
                case -1325958191: goto L86;
                case 104431: goto L7a;
                case 3039496: goto L6e;
                case 3052374: goto L62;
                case 3327612: goto L56;
                case 3625364: goto L4a;
                case 64711720: goto L3e;
                case 97526364: goto L32;
                case 109413500: goto L24;
                default: goto L22;
            }
        L22:
            goto L91
        L24:
            java.lang.String r2 = "short"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2e
            goto L91
        L2e:
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            goto L91
        L32:
            java.lang.String r2 = "float"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3b
            goto L91
        L3b:
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            goto L91
        L3e:
            java.lang.String r2 = "boolean"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L47
            goto L91
        L47:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            goto L91
        L4a:
            java.lang.String r2 = "void"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L53
            goto L91
        L53:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            goto L91
        L56:
            java.lang.String r2 = "long"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5f
            goto L91
        L5f:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            goto L91
        L62:
            java.lang.String r2 = "char"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L6b
            goto L91
        L6b:
            java.lang.Class<java.lang.Character> r3 = java.lang.Character.class
            goto L91
        L6e:
            java.lang.String r2 = "byte"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L77
            goto L91
        L77:
            java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
            goto L91
        L7a:
            java.lang.String r2 = "int"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L83
            goto L91
        L83:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            goto L91
        L86:
            java.lang.String r2 = "double"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L8f
            goto L91
        L8f:
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
        L91:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            return r3
    }
}
