package kotlinx.coroutines.internal;

/* compiled from: FastServiceLoader.kt */
/* loaded from: classes2.dex */
public final class FastServiceLoader {
    public static final kotlinx.coroutines.internal.FastServiceLoader INSTANCE = null;

    static {
            kotlinx.coroutines.internal.FastServiceLoader r0 = new kotlinx.coroutines.internal.FastServiceLoader
            r0.<init>()
            kotlinx.coroutines.internal.FastServiceLoader.INSTANCE = r0
            return
    }

    private FastServiceLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    private final <S> S getProviderInstance(java.lang.String r2, java.lang.ClassLoader r3, java.lang.Class<S> r4) {
            r1 = this;
            r0 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r0, r3)
            boolean r3 = r4.isAssignableFrom(r2)
            if (r3 == 0) goto L1c
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Object r2 = r2.newInstance(r3)
            java.lang.Object r2 = r4.cast(r2)
            return r2
        L1c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Expected service of class "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = ", but found "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private final <S> java.util.List<S> load(java.lang.Class<S> r1, java.lang.ClassLoader r2) {
            r0 = this;
            java.util.List r1 = r0.loadProviders$kotlinx_coroutines_core(r1, r2)     // Catch: java.lang.Throwable -> L5
            goto Ld
        L5:
            java.util.ServiceLoader r1 = java.util.ServiceLoader.load(r1, r2)
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r1)
        Ld:
            return r1
    }

    private final java.util.List<java.lang.String> parse(java.net.URL r6) {
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "jar"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L5d
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = kotlin.text.StringsKt.substringAfter$default(r0, r6, r4, r3, r4)
            r1 = 33
            java.lang.String r6 = kotlin.text.StringsKt.substringBefore$default(r6, r1, r4, r3, r4)
            java.lang.String r1 = "!/"
            java.lang.String r0 = kotlin.text.StringsKt.substringAfter$default(r0, r1, r4, r3, r4)
            java.util.jar.JarFile r1 = new java.util.jar.JarFile
            r1.<init>(r6, r2)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L51
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L51
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L51
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L51
            java.io.InputStream r0 = r1.getInputStream(r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L51
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L51
            kotlinx.coroutines.internal.FastServiceLoader r0 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE     // Catch: java.lang.Throwable -> L4a
            java.util.List r0 = r0.parseFile(r6)     // Catch: java.lang.Throwable -> L4a
            kotlin.io.CloseableKt.closeFinally(r6, r4)     // Catch: java.lang.Throwable -> L51
            r1.close()     // Catch: java.lang.Throwable -> L48
            return r0
        L48:
            r6 = move-exception
            throw r6
        L4a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r6, r0)     // Catch: java.lang.Throwable -> L51
            throw r2     // Catch: java.lang.Throwable -> L51
        L51:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L53
        L53:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L58
            throw r0
        L58:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r6, r0)
            throw r6
        L5d:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.openStream()
            r1.<init>(r6)
            r0.<init>(r1)
            kotlinx.coroutines.internal.FastServiceLoader r6 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE     // Catch: java.lang.Throwable -> L75
            java.util.List r6 = r6.parseFile(r0)     // Catch: java.lang.Throwable -> L75
            kotlin.io.CloseableKt.closeFinally(r0, r4)
            return r6
        L75:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L77
        L77:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r6)
            throw r1
    }

    private final java.util.List<java.lang.String> parseFile(java.io.BufferedReader r8) {
            r7 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
        L5:
            java.lang.String r1 = r8.readLine()
            if (r1 != 0) goto L10
            java.util.List r8 = kotlin.collections.CollectionsKt.toList(r0)
            return r8
        L10:
            r2 = 2
            java.lang.String r3 = "#"
            r4 = 0
            java.lang.String r1 = kotlin.text.StringsKt.substringBefore$default(r1, r3, r4, r2, r4)
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r3 = 0
        L22:
            int r4 = r1.length()
            r5 = 1
            if (r3 >= r4) goto L42
            char r4 = r1.charAt(r3)
            r6 = 46
            if (r4 == r6) goto L3a
            boolean r4 = java.lang.Character.isJavaIdentifierPart(r4)
            if (r4 == 0) goto L38
            goto L3a
        L38:
            r4 = 0
            goto L3b
        L3a:
            r4 = 1
        L3b:
            if (r4 != 0) goto L3f
            r3 = 0
            goto L43
        L3f:
            int r3 = r3 + 1
            goto L22
        L42:
            r3 = 1
        L43:
            if (r3 == 0) goto L52
            int r3 = r1.length()
            if (r3 <= 0) goto L4c
            r2 = 1
        L4c:
            if (r2 == 0) goto L5
            r0.add(r1)
            goto L5
        L52:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Illegal service provider class name: "
            r8.append(r0)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
    }

    public final java.util.List<kotlinx.coroutines.internal.MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core() {
            r7 = this;
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r0 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            boolean r1 = kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED()
            if (r1 != 0) goto L11
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.List r0 = r7.load(r0, r1)
            return r0
        L11:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L62
            r2 = 2
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "kotlinx.coroutines.android.AndroidDispatcherFactory"
            r3 = 0
            r4 = 1
            r5 = 0
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L62
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r6)     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L62
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L62
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r6)     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L62
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L62
            java.lang.Object r2 = r2.newInstance(r6)     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L62
            java.lang.Object r2 = r0.cast(r2)     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L62
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L62
            goto L38
        L37:
            r2 = r3
        L38:
            if (r2 == 0) goto L3d
            r1.add(r2)     // Catch: java.lang.Throwable -> L62
        L3d:
            java.lang.String r2 = "kotlinx.coroutines.test.internal.TestMainDispatcherFactory"
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L5b java.lang.Throwable -> L62
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r6)     // Catch: java.lang.ClassNotFoundException -> L5b java.lang.Throwable -> L62
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.ClassNotFoundException -> L5b java.lang.Throwable -> L62
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.ClassNotFoundException -> L5b java.lang.Throwable -> L62
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.ClassNotFoundException -> L5b java.lang.Throwable -> L62
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.ClassNotFoundException -> L5b java.lang.Throwable -> L62
            java.lang.Object r2 = r0.cast(r2)     // Catch: java.lang.ClassNotFoundException -> L5b java.lang.Throwable -> L62
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2     // Catch: java.lang.ClassNotFoundException -> L5b java.lang.Throwable -> L62
            r3 = r2
            goto L5c
        L5b:
        L5c:
            if (r3 == 0) goto L6a
            r1.add(r3)     // Catch: java.lang.Throwable -> L62
            goto L6a
        L62:
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.List r1 = r7.load(r0, r1)
        L6a:
            return r1
    }

    public final <S> java.util.List<S> loadProviders$kotlinx_coroutines_core(java.lang.Class<S> r5, java.lang.ClassLoader r6) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "META-INF/services/"
            r0.append(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.Enumeration r0 = r6.getResources(r0)
            java.util.ArrayList r0 = java.util.Collections.list(r0)
            java.lang.String r1 = "list(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r0.next()
            java.net.URL r2 = (java.net.URL) r2
            kotlinx.coroutines.internal.FastServiceLoader r3 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE
            java.util.List r2 = r3.parse(r2)
            kotlin.collections.CollectionsKt.addAll(r1, r2)
            goto L2b
        L41:
            java.util.Set r0 = kotlin.collections.CollectionsKt.toSet(r1)
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L73
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L5c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            kotlinx.coroutines.internal.FastServiceLoader r3 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE
            java.lang.Object r2 = r3.getProviderInstance(r2, r6, r5)
            r1.add(r2)
            goto L5c
        L72:
            return r1
        L73:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "No providers were loaded with FastServiceLoader"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }
}
