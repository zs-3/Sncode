package kotlin.internal;

/* compiled from: PlatformImplementations.kt */
/* loaded from: classes2.dex */
public final class PlatformImplementationsKt {
    public static final kotlin.internal.PlatformImplementations IMPLEMENTATIONS = null;

    static {
            java.lang.String r0 = ", base type classloader: "
            java.lang.String r1 = "Instance class was loaded from a different classloader: "
            java.lang.Class<kotlin.internal.PlatformImplementations> r2 = kotlin.internal.PlatformImplementations.class
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.internal.PlatformImplementations"
            java.lang.String r4 = "forName(\"kotlin.internal…entations\").newInstance()"
            java.lang.Class<kotlin.internal.jdk8.JDK8PlatformImplementations> r5 = kotlin.internal.jdk8.JDK8PlatformImplementations.class
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.ClassNotFoundException -> L4f
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)     // Catch: java.lang.ClassNotFoundException -> L4f
            if (r5 == 0) goto L1b
            kotlin.internal.PlatformImplementations r5 = (kotlin.internal.PlatformImplementations) r5     // Catch: java.lang.ClassCastException -> L19 java.lang.ClassNotFoundException -> L4f
            goto L12a
        L19:
            r6 = move-exception
            goto L21
        L1b:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.lang.ClassCastException -> L19 java.lang.ClassNotFoundException -> L4f
            r6.<init>(r3)     // Catch: java.lang.ClassCastException -> L19 java.lang.ClassNotFoundException -> L4f
            throw r6     // Catch: java.lang.ClassCastException -> L19 java.lang.ClassNotFoundException -> L4f
        L21:
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.ClassNotFoundException -> L4f
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L4f
            java.lang.ClassLoader r7 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L4f
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r7)     // Catch: java.lang.ClassNotFoundException -> L4f
            if (r8 != 0) goto L4e
            java.lang.ClassNotFoundException r8 = new java.lang.ClassNotFoundException     // Catch: java.lang.ClassNotFoundException -> L4f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L4f
            r9.<init>()     // Catch: java.lang.ClassNotFoundException -> L4f
            r9.append(r1)     // Catch: java.lang.ClassNotFoundException -> L4f
            r9.append(r5)     // Catch: java.lang.ClassNotFoundException -> L4f
            r9.append(r0)     // Catch: java.lang.ClassNotFoundException -> L4f
            r9.append(r7)     // Catch: java.lang.ClassNotFoundException -> L4f
            java.lang.String r5 = r9.toString()     // Catch: java.lang.ClassNotFoundException -> L4f
            r8.<init>(r5, r6)     // Catch: java.lang.ClassNotFoundException -> L4f
            throw r8     // Catch: java.lang.ClassNotFoundException -> L4f
        L4e:
            throw r6     // Catch: java.lang.ClassNotFoundException -> L4f
        L4f:
            java.lang.String r5 = "kotlin.internal.JRE8PlatformImplementations"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L98
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.ClassNotFoundException -> L98
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)     // Catch: java.lang.ClassNotFoundException -> L98
            if (r5 == 0) goto L64
            kotlin.internal.PlatformImplementations r5 = (kotlin.internal.PlatformImplementations) r5     // Catch: java.lang.ClassCastException -> L62 java.lang.ClassNotFoundException -> L98
            goto L12a
        L62:
            r6 = move-exception
            goto L6a
        L64:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.lang.ClassCastException -> L62 java.lang.ClassNotFoundException -> L98
            r6.<init>(r3)     // Catch: java.lang.ClassCastException -> L62 java.lang.ClassNotFoundException -> L98
            throw r6     // Catch: java.lang.ClassCastException -> L62 java.lang.ClassNotFoundException -> L98
        L6a:
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.ClassNotFoundException -> L98
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L98
            java.lang.ClassLoader r7 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L98
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r7)     // Catch: java.lang.ClassNotFoundException -> L98
            if (r8 != 0) goto L97
            java.lang.ClassNotFoundException r8 = new java.lang.ClassNotFoundException     // Catch: java.lang.ClassNotFoundException -> L98
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L98
            r9.<init>()     // Catch: java.lang.ClassNotFoundException -> L98
            r9.append(r1)     // Catch: java.lang.ClassNotFoundException -> L98
            r9.append(r5)     // Catch: java.lang.ClassNotFoundException -> L98
            r9.append(r0)     // Catch: java.lang.ClassNotFoundException -> L98
            r9.append(r7)     // Catch: java.lang.ClassNotFoundException -> L98
            java.lang.String r5 = r9.toString()     // Catch: java.lang.ClassNotFoundException -> L98
            r8.<init>(r5, r6)     // Catch: java.lang.ClassNotFoundException -> L98
            throw r8     // Catch: java.lang.ClassNotFoundException -> L98
        L97:
            throw r6     // Catch: java.lang.ClassNotFoundException -> L98
        L98:
            java.lang.Class<kotlin.internal.jdk7.JDK7PlatformImplementations> r5 = kotlin.internal.jdk7.JDK7PlatformImplementations.class
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.ClassNotFoundException -> Ldd
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)     // Catch: java.lang.ClassNotFoundException -> Ldd
            if (r5 == 0) goto La9
            kotlin.internal.PlatformImplementations r5 = (kotlin.internal.PlatformImplementations) r5     // Catch: java.lang.ClassCastException -> La7 java.lang.ClassNotFoundException -> Ldd
            goto L12a
        La7:
            r6 = move-exception
            goto Laf
        La9:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.lang.ClassCastException -> La7 java.lang.ClassNotFoundException -> Ldd
            r6.<init>(r3)     // Catch: java.lang.ClassCastException -> La7 java.lang.ClassNotFoundException -> Ldd
            throw r6     // Catch: java.lang.ClassCastException -> La7 java.lang.ClassNotFoundException -> Ldd
        Laf:
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.ClassNotFoundException -> Ldd
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> Ldd
            java.lang.ClassLoader r7 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> Ldd
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r7)     // Catch: java.lang.ClassNotFoundException -> Ldd
            if (r8 != 0) goto Ldc
            java.lang.ClassNotFoundException r8 = new java.lang.ClassNotFoundException     // Catch: java.lang.ClassNotFoundException -> Ldd
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> Ldd
            r9.<init>()     // Catch: java.lang.ClassNotFoundException -> Ldd
            r9.append(r1)     // Catch: java.lang.ClassNotFoundException -> Ldd
            r9.append(r5)     // Catch: java.lang.ClassNotFoundException -> Ldd
            r9.append(r0)     // Catch: java.lang.ClassNotFoundException -> Ldd
            r9.append(r7)     // Catch: java.lang.ClassNotFoundException -> Ldd
            java.lang.String r5 = r9.toString()     // Catch: java.lang.ClassNotFoundException -> Ldd
            r8.<init>(r5, r6)     // Catch: java.lang.ClassNotFoundException -> Ldd
            throw r8     // Catch: java.lang.ClassNotFoundException -> Ldd
        Ldc:
            throw r6     // Catch: java.lang.ClassNotFoundException -> Ldd
        Ldd:
            java.lang.String r5 = "kotlin.internal.JRE7PlatformImplementations"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L125
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.ClassNotFoundException -> L125
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)     // Catch: java.lang.ClassNotFoundException -> L125
            if (r5 == 0) goto Lf1
            kotlin.internal.PlatformImplementations r5 = (kotlin.internal.PlatformImplementations) r5     // Catch: java.lang.ClassCastException -> Lef java.lang.ClassNotFoundException -> L125
            goto L12a
        Lef:
            r3 = move-exception
            goto Lf7
        Lf1:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch: java.lang.ClassCastException -> Lef java.lang.ClassNotFoundException -> L125
            r4.<init>(r3)     // Catch: java.lang.ClassCastException -> Lef java.lang.ClassNotFoundException -> L125
            throw r4     // Catch: java.lang.ClassCastException -> Lef java.lang.ClassNotFoundException -> L125
        Lf7:
            java.lang.Class r4 = r5.getClass()     // Catch: java.lang.ClassNotFoundException -> L125
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L125
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L125
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r2)     // Catch: java.lang.ClassNotFoundException -> L125
            if (r5 != 0) goto L124
            java.lang.ClassNotFoundException r5 = new java.lang.ClassNotFoundException     // Catch: java.lang.ClassNotFoundException -> L125
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L125
            r6.<init>()     // Catch: java.lang.ClassNotFoundException -> L125
            r6.append(r1)     // Catch: java.lang.ClassNotFoundException -> L125
            r6.append(r4)     // Catch: java.lang.ClassNotFoundException -> L125
            r6.append(r0)     // Catch: java.lang.ClassNotFoundException -> L125
            r6.append(r2)     // Catch: java.lang.ClassNotFoundException -> L125
            java.lang.String r0 = r6.toString()     // Catch: java.lang.ClassNotFoundException -> L125
            r5.<init>(r0, r3)     // Catch: java.lang.ClassNotFoundException -> L125
            throw r5     // Catch: java.lang.ClassNotFoundException -> L125
        L124:
            throw r3     // Catch: java.lang.ClassNotFoundException -> L125
        L125:
            kotlin.internal.PlatformImplementations r5 = new kotlin.internal.PlatformImplementations
            r5.<init>()
        L12a:
            kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS = r5
            return
    }
}
