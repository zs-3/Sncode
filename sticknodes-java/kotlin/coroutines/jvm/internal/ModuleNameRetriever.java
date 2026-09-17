package kotlin.coroutines.jvm.internal;

/* compiled from: DebugMetadata.kt */
/* loaded from: classes2.dex */
final class ModuleNameRetriever {
    public static final kotlin.coroutines.jvm.internal.ModuleNameRetriever INSTANCE = null;
    private static kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache cache;
    private static final kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache notOnJava9 = null;

    /* compiled from: DebugMetadata.kt */
    private static final class Cache {
        public final java.lang.reflect.Method getDescriptorMethod;
        public final java.lang.reflect.Method getModuleMethod;
        public final java.lang.reflect.Method nameMethod;

        public Cache(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
                r0 = this;
                r0.<init>()
                r0.getModuleMethod = r1
                r0.getDescriptorMethod = r2
                r0.nameMethod = r3
                return
        }
    }

    static {
            kotlin.coroutines.jvm.internal.ModuleNameRetriever r0 = new kotlin.coroutines.jvm.internal.ModuleNameRetriever
            r0.<init>()
            kotlin.coroutines.jvm.internal.ModuleNameRetriever.INSTANCE = r0
            kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache r0 = new kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache
            r1 = 0
            r0.<init>(r1, r1, r1)
            kotlin.coroutines.jvm.internal.ModuleNameRetriever.notOnJava9 = r0
            return
    }

    private ModuleNameRetriever() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache buildCache(kotlin.coroutines.jvm.internal.BaseContinuationImpl r6) {
            r5 = this;
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            java.lang.String r1 = "getModule"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L3f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Exception -> L3f
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Exception -> L3f
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = "java.lang.Module"
            java.lang.Class r1 = r1.loadClass(r3)     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = "getDescriptor"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L3f
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Exception -> L3f
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Exception -> L3f
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r6 = r6.loadClass(r3)     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = "name"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L3f
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r3, r2)     // Catch: java.lang.Exception -> L3f
            kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache r2 = new kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache     // Catch: java.lang.Exception -> L3f
            r2.<init>(r0, r1, r6)     // Catch: java.lang.Exception -> L3f
            kotlin.coroutines.jvm.internal.ModuleNameRetriever.cache = r2     // Catch: java.lang.Exception -> L3f
            return r2
        L3f:
            kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache r6 = kotlin.coroutines.jvm.internal.ModuleNameRetriever.notOnJava9
            kotlin.coroutines.jvm.internal.ModuleNameRetriever.cache = r6
            return r6
    }

    public final java.lang.String getModuleName(kotlin.coroutines.jvm.internal.BaseContinuationImpl r6) {
            r5 = this;
            java.lang.String r0 = "continuation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache r0 = kotlin.coroutines.jvm.internal.ModuleNameRetriever.cache
            if (r0 != 0) goto Ld
            kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache r0 = r5.buildCache(r6)
        Ld:
            kotlin.coroutines.jvm.internal.ModuleNameRetriever$Cache r1 = kotlin.coroutines.jvm.internal.ModuleNameRetriever.notOnJava9
            r2 = 0
            if (r0 != r1) goto L13
            return r2
        L13:
            java.lang.reflect.Method r1 = r0.getModuleMethod
            r3 = 0
            if (r1 == 0) goto L23
            java.lang.Class r6 = r6.getClass()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Object r6 = r1.invoke(r6, r4)
            goto L24
        L23:
            r6 = r2
        L24:
            if (r6 != 0) goto L27
            return r2
        L27:
            java.lang.reflect.Method r1 = r0.getDescriptorMethod
            if (r1 == 0) goto L32
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Object r6 = r1.invoke(r6, r4)
            goto L33
        L32:
            r6 = r2
        L33:
            if (r6 != 0) goto L36
            return r2
        L36:
            java.lang.reflect.Method r0 = r0.nameMethod
            if (r0 == 0) goto L41
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Object r6 = r0.invoke(r6, r1)
            goto L42
        L41:
            r6 = r2
        L42:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L49
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
        L49:
            return r2
    }
}
