package androidx.lifecycle;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class SavedStateViewModelFactoryKt {
    private static final java.util.List<java.lang.Class<?>> ANDROID_VIEWMODEL_SIGNATURE = null;
    private static final java.util.List<java.lang.Class<?>> VIEWMODEL_SIGNATURE = null;

    static {
            java.lang.Class<androidx.lifecycle.SavedStateHandle> r0 = androidx.lifecycle.SavedStateHandle.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            java.lang.Class<android.app.Application> r3 = android.app.Application.class
            r1[r2] = r3
            r2 = 1
            r1[r2] = r0
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            androidx.lifecycle.SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE = r1
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            androidx.lifecycle.SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE = r0
            return
    }

    public static final /* synthetic */ java.util.List access$getANDROID_VIEWMODEL_SIGNATURE$p() {
            java.util.List<java.lang.Class<?>> r0 = androidx.lifecycle.SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE
            return r0
    }

    public static final /* synthetic */ java.util.List access$getVIEWMODEL_SIGNATURE$p() {
            java.util.List<java.lang.Class<?>> r0 = androidx.lifecycle.SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE
            return r0
    }

    public static final <T> java.lang.reflect.Constructor<T> findMatchingConstructor(java.lang.Class<T> r6, java.util.List<? extends java.lang.Class<?>> r7) {
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "signature"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.reflect.Constructor[] r0 = r6.getConstructors()
            java.lang.String r1 = "modelClass.constructors"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L64
            r3 = r0[r2]
            java.lang.Class[] r4 = r3.getParameterTypes()
            java.lang.String r5 = "constructor.parameterTypes"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.util.List r4 = kotlin.collections.ArraysKt.toList(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r4)
            if (r5 == 0) goto L2d
            return r3
        L2d:
            int r3 = r7.size()
            int r5 = r4.size()
            if (r3 != r5) goto L61
            boolean r3 = r4.containsAll(r7)
            if (r3 != 0) goto L3e
            goto L61
        L3e:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Class "
            r1.append(r2)
            java.lang.String r6 = r6.getSimpleName()
            r1.append(r6)
            java.lang.String r6 = " must have parameters in the proper order: "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L61:
            int r2 = r2 + 1
            goto L15
        L64:
            r6 = 0
            return r6
    }

    public static final <T extends androidx.lifecycle.ViewModel> T newInstance(java.lang.Class<T> r2, java.lang.reflect.Constructor<T> r3, java.lang.Object... r4) {
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L54
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L54
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L54
            androidx.lifecycle.ViewModel r3 = (androidx.lifecycle.ViewModel) r3     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L54
            return r3
        L1b:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "An exception happened in constructor of "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.Throwable r3 = r3.getCause()
            r4.<init>(r2, r3)
            throw r4
        L37:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " cannot be instantiated."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2, r3)
            throw r4
        L54:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to access "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2, r3)
            throw r4
    }
}
